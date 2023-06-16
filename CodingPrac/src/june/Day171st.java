package june;

public class Day171st {
	/*
	 Spring 에서의 WebSocket 사용법 ( <=> Java EE에서의 사용법)
	 
	 1. import MessageMapping, SendTo, Controller.
	 2. @Controller annotation 사용.
	 	ex)
	 	
	 	import ---
	 	
	 	@Controller
	 	public class MyWebSocketController {
	 		@MessageMappingg("/hello")
	 		@SendTo("/topic/greetings")
	 		public String HandleGreeting(String message){
	 			System.out.pringln("클라이언트로부터 메시지 수신: ");
	 			return "서버에서 보내는 응답입니다.";
	 		}
	 	}
	 */
}
