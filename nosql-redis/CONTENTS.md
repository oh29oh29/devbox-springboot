## Redis

> Redis는 'Remote dictionary server'의 약자  
> 고성능 key-value 유형의 in-memory NoSQL 데이터베이스이며 오픈소스 기반 데이터 저장소

> 실시간 응답(= 빠른 성능)  
> 모든 데이터가 메모리에서 관리되기 때문에 디스크에 접근하는 과정이 필요하지 않아 데이터의 처리 성능이 빠름

> 단순성  
> key-value 형태로 데이터를 관리하고 value에는 string, hash, set 등 다양한 데이터 구조를 저장할 수 있도록 지원하며 추가적인 데이터의 가공 없이 애플리케이션에서 쉽게 사용  
> Redis는 single-threaded event loop에서 command를 처리한다

> 고가용성  
> Redis는 자체적으로 HA(High Availability) 기능을 제공  
> 복제를 통해 데이터를 여러 서버에 분산시킬 수 있으며, sentinel은 장애 상황을 탐지해 자동으로 fail-over 시켜준다

> 확장성  
> cluster 모드를 사용하면 수평적 확장이 쉽다  
> 데이터는 자동으로 sharding 된 후 저장된다.

> By default, the Spring Boot starter (spring-boot-starter-data-redis) uses Lettuce
> https://docs.spring.io/spring-boot/how-to/nosql.html

# sorted Set

> score 값에 따라 정렬되는 고유한 문자열의 집합

> 순서를 갖는 자료구조이므로 index를 이용해 아이템에 접근할 수 있다.  
> index를 이용해 아이템에 접근할 일이 많다면 list가 아닌 sorted set를 사용하는 것도 방법이다.  
> index를 이용해 데이터에 접근할 때 list는 O(n), sorted set은 O(log(n))

> index로 데이터 조회: ZRANGE command는 기본적으로 index 기반으로 데이터를 조회한다.  
> score로 데이터 조회: ZRANGE command에 BYSCORE 옵션을 사용하면 score를 이용해 데이터를 조회한다.  
> 사전순으로 데이터 조회: ZRANGE command에 BYLEX 옵션을 사욯아면 사전순으로 데이터를 조회한다.  