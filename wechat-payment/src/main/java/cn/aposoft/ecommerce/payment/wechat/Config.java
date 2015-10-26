/**
 * 
 */
package cn.aposoft.ecommerce.payment.wechat;

/**
 * 固定参数相关
 * 
 * @author Jann Liu
 *
 */
public interface Config {

	/**
	 * 订单查询URL
	 * 
	 * @return
	 * @author Yujinshui
	 * @time 2015年10月24日 下午9:01:34
	 */
	String orderUrl();

	/**
	 * 认证证书位置
	 * 
	 * @return
	 * @author Yujinshui
	 */
	String pkcs12();

	/**
	 * 签名所使用的key
	 * 
	 * @return key值
	 */
	String key();

	/**
	 * 公众号应用id
	 * 
	 * @return 应用id字符串
	 */
	String appId();

	/**
	 * 商户id
	 * 
	 * @return 商户id字符串
	 */
	String mchId();

	/**
	 * 支付url
	 * 
	 * @return 支付url字符串
	 */
	String url();

	/**
	 * 退款URL
	 * 
	 * @return
	 */
	String refundUrl();

}
