package org.example;

public class FriendTest {
    public static void main(String[] args) {

        Friend friend = new Friend();
        BoyFriend boyFriend = new BoyFriend();
        Friend girlfriend = new GirlFriend(); // 참조변수 타입-> 상위 ,객체 타입 -> 하위 =>가능
        // GirlFriend friend1 = new Friend();  참조변수 타입 -> 하위, 객체 타입 -> 상위 => 불가능

        friend.friendInfo();
        boyFriend.friendInfo();
        girlfriend.friendInfo();
    }
}