package testJedis001.testJedis001;

import redis.clients.jedis.Jedis;

public class testJedis001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jedis jedis = new Jedis("localhost");
		jedis.set("foo", "barla");
		String value = jedis.get("foo");
		System.out.print(value);
	}

}
