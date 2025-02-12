package kr.co.lookst.sns.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.lookst.sns.dao.SnsProfileDao;
import kr.co.lookst.sns.domain.FollowDto;
import kr.co.lookst.sns.domain.ProfileFeedDto;
import kr.co.lookst.sns.domain.SnsProfileDto;

@Service
public class SnsServiceImpl implements SnsService{

	@Autowired
	SnsProfileDao snsProfileDao;
	
	//프로필정보
	@Override
	public SnsProfileDto getinfoselect(String member_id) throws Exception {
		return snsProfileDao.infoselect(member_id);
	}
	// 프로필 피드
	@Override
	public List<ProfileFeedDto> getProfileFeed(String member_id) throws Exception {
		return snsProfileDao.profileFeed(member_id);
	}
	// 팔로잉 리스트
	@Override
	public List<FollowDto> getFollowing(String member_id) throws Exception {
		return snsProfileDao.followingList(member_id);
	}
	// 팔로워 리스트
	@Override
	public List<FollowDto> getFollower(String member_id) throws Exception {
		return snsProfileDao.followerList(member_id);
	}
	// 팔로우
	@Override
	public int doFollow(String member_id, String following) throws Exception {
		return snsProfileDao.follow(member_id, following);
	}
	// 언팔로우
	@Override
	public int doUnFollow(String member_id, String following) throws Exception {
		return snsProfileDao.unfollow(member_id, following);
	}
	// 팔로우 유무
	@Override
	public int followCheck(String member_id, String following) throws Exception {
		return snsProfileDao.isFollow(member_id, following);
	}
	// 닉네임 수정
	@Override
	public int nickNameMod(String member_id, String member_nick) throws Exception {
		return snsProfileDao.update(member_id, member_nick);
	}
	// 프로필 사진 변경
	@Override
	public int profileImgModify(String member_id, String profile_img, String profile_uuid) throws Exception {
		return snsProfileDao.profileImg_Mod(member_id, profile_img, profile_uuid);
	}
/*	
	@Override
	public int contentUp(String member_id, String post_content) throws Exception {
		return snsProfileDao.postCon_up(member_id, post_content);
	}
	@Override
	public int imgUp(String post_img_img, Integer post_img_seq, String post_img_uuid) throws Exception {
		return snsProfileDao.postImg_up(post_img_img, post_img_seq, post_img_uuid);
	}
*/
	// 게시물 삭제
	@Override
	public int deletePost(Integer post_no) throws Exception {
		return snsProfileDao.deletePost(post_no);
	}
	


}
