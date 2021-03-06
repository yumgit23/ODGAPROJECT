package odga.bt.service;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.multipart.MultipartFile;

import odga.bt.domain.Member;
import odga.bt.domain.Planner;


public interface MemberService {
	
	public int checkId(String m_email, HttpServletResponse response) throws Exception;
	//ȸ������
	public boolean joinS(Member member);
	//�α��� 
	Member login(Member member, HttpServletResponse response, ServletContext servletContext) throws Exception;
	//�α׾ƿ�
	void logout(HttpServletResponse response, HttpSession session);
	
	//ȸ������ ����
	Member updateS(Member member) throws Exception;
	boolean leaveS(Member member, HttpSession session, HttpServletResponse response);
	
	// �̸���
	public void regist(Member member) throws Exception;
	public String userAuth(String authkey) throws Exception;

	 // �̹������ε�
    boolean writeFile(MultipartFile file, String saveFileName);
    String saveStore(MultipartFile file);   
    Member saveStore(Member member, MultipartFile file); 

  //find id/pw
  	public String findIdS(Member member);
  	public void findPwd(Member member);
	
}