package hashmap;

import java.util.*;

public class HashMapPractice {
    public static void main(String[] args) {
        //HashMap 은 key를 지정할 수 있어 데이터 추가, 삭제, 특히 검색 속도가 빠르다.
        //key 값 중복 불가
        //value 값은 key 값이 다를 경우 중복 가능

        HashMap<Integer, String> mu = new HashMap<>();
        mu.put(0, "에릭텐하흐");
        mu.put(8, "브루노페르난데스"); // key 와 value 를 저장
        mu.put(10, "마커스래시포드");
        mu.put(11, "라스무스회이룬");
        mu.put(14, "크리스티안에릭센");
        mu.put(17, "알레한드로가르나초");
        mu.put(19, "라파엘바란");
        mu.put(20, "디오구달롯");
        mu.put(24, "안드레오나나");
        mu.put(29, "아론완-비사카");
        mu.put(5, "해리매과이어");
        mu.put(37, "코비마이누");

        System.out.println("<23.12.27 MU vs AV 선발 라인업>" + "\n");

        HashMap<Integer, String> fc = new HashMap<>();
        fc.putAll(mu); // Map mu 데이터 전부 저장
        System.out.println("mu :" + fc + "\n");

        System.out.println(" 감독 : " + mu.get(0));
        System.out.println(" 주장 : " + mu.get(8));
        System.out.println(" GK : " + mu.get(24));
        System.out.println(" DF : " + mu.get(29) + " " + mu.get(19) + " " + mu.get(5) + " " + mu.get(20));
        System.out.println(" MF : " + mu.get(8) + " " + mu.get(37) + " " + mu.get(14));
        System.out.println(" CF : " + mu.get(17) + " " + mu.get(11) + " " + mu.get(10) + "\n");

        System.out.println("코비마이누 선발 여부 : " + mu.containsKey(37) + "\n"); // key 와 동일한 데이터 유무 확인
        System.out.println("코비마이누 선발 여부 : " + mu.containsValue("코비마이누") + "\n"); // value 와 동일한 데이터 유무 확인
        System.out.println("선발 라인업 빈 상태 여부 : " + mu.isEmpty() + "\n"); // 빈 상태 여부 확인
        System.out.println("선발 선수 : " + mu.size() + "\n"); // key-value 맵핑 데이터 수량 반환

        System.out.println("원 볼란치 선수 : " + fc.get(37) + "\n"); // key 와 맵핑된 value 값을 반환
        System.out.println(fc.getOrDefault(6, "부상 : " + "리산드로마르티네즈") + "\n"); // key 와 맵핑된 value 값을 반환하고 없으면 defaultValue 반환
        System.out.println("선발 명단 : " + fc.entrySet() + "\n"); // 모든 key-value 맵핑 데이터를 가진 Set 데이터 반환
        System.out.println("선발 등번호 : " + fc.keySet() + "\n"); // 모든 key 값을 가진 Set데이터 반환
        System.out.println("선발 선수 : " + fc.values() + "\n"); // 모든 value 값을 가진 Collection 데이터 반환


        List<Integer> keySet = new ArrayList<>(mu.keySet()); // 선발 라인업 리스트화
        Collections.sort(keySet); // 등번호 순서대로 정렬
        for(Integer key : keySet){
            System.out.println("등번호:" + key + " " + "선수명:" + mu.get(key));
        }
    }
}
