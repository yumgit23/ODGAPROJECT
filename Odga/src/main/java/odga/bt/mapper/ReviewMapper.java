package odga.bt.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import odga.bt.domain.Like_t;
import odga.bt.domain.Member;
import odga.bt.domain.Reply;
import odga.bt.domain.Review;
import odga.bt.domain.Support;

public interface ReviewMapper {
	List<Review> review();
	Review getReview(long b_id);
	void insert(Review review);
	void insertS(Support support);//문의하기
	//문의하기 게시판(관리자)
	List<Support> notifications();
	//문의게시판 상세페이지(관리자)
	Support selectByTitle(String s_subject);
	List<Review> selectBestReview();
	//List<Review> selectByReview(long m_id);
		
	List<Review> searchList(@Param("searchOption")String searchOption,@Param("keyword") String keyword);
	int countSearch(@Param("searchOption")String searchOption,@Param("keyword") String keyword);
	
	List<Review> catgoList(String catgo);
	int countCatgo(String catgo);
	int countFamily();
	int countCouple();
	int countFriend();
	int countAlone();
	int countPackage();
	
	List<Reply> listReply(long b_id);
	int countReply(long b_id);	
	void insert_re(Reply reply);
	void deleteReply(long re_id);
	
	void likeUp(Review review);
	void likeDown(Review review);
	void insertLike(Like_t liket);	
	Like_t listLike(@Param("b_id") long b_id, @Param("m_id")long m_id);
	void likeClick(Like_t liket);
	void likeUnclick(Like_t liket);
	
	Review getPreReview(long b_id);
	Review getNextReview(long b_id);
	
	Member getWriterInfo(long b_id);
	
}
