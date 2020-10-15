package retail

/*

Created by Venkatesh Gandra on 10/14/20

*/
class OrderItem(var orderItemId: Int,
                var orderItemOrderId: Int,
                var orderItemProductId: Int,
                var orderItemQuantity: Int,
                var orderItemSubtotal: Float,
                var orderItemProductPrice: Float)
{

  require(orderItemSubtotal == orderItemQuantity * orderItemProductPrice, "Invalid orderitemSubtotal")
  def this(orderItemId: Int,
  orderItemOrderId: Int,
  orderItemProductId: Int,
  orderItemQuantity: Int,
  orderItemProductPrice: Float) = {
    this(orderItemId, orderItemOrderId, orderItemProductId, orderItemQuantity
    , orderItemQuantity, orderItemProductPrice)
  }

}


