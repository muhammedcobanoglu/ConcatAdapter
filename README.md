# ConcatAdapter

There are many ways to show different views in a recyclerview but by using multiple view types in a recyclerview is a common idea.

In the above solution, we have some problems. For example if you use this solution, you have to managing many view types.

To manage different views with an easy way, we can use Concat Adapter

In the below example, we have 3 different views. There are header, body and footer. 

`val headerItemAdapter = HeaderItemAdapter(fruitList, onClick = { onHeaderItemClicked(it) })
val headerAdapter = HeaderAdapter(headerItemAdapter)
val bodyAdapter = BodyAdapter(fruitList)
val footerAdapter = FooterAdapter()
val concatAdapter = ConcatAdapter(footerAdapter, bodyAdapter, headerAdapter)`

We can show and different views and change their positions easly. For example, if we want to change the header position with the footer position, we can only change order in the Concat Adapter like this;

`val concatAdapter = ConcatAdapter(footerAdapter, bodyAdapter, headerAdapter)`

![concat_adapter](https://user-images.githubusercontent.com/9548399/175830586-9ffdc1c0-703a-4ceb-a6f7-56a2d2f317f0.png)
