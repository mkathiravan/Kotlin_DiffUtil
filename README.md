# Kotlin_DiffUtil

Using notifyDataSetChanged() , there is no way for the RecyclerView to know what the actual changes are there. So, all the visible views are recreated again. This is a very expensive operation.

In this process, the new instance is created of the adapter. Which makes the process very heavy.

To over come this, Android Launched DiffUtils as part of support library.

DiffUtil is a utility class that can calculate the difference between two lists and output a list of update operations that converts the first list into the second one. DiffUtils is based on Eugene Myers’ algorithm.

DiffUtils is used to know the updats made in the RecyclerView Adapter.

DiffUtil uses these methods to notify the RecyclerView for any changes in the data set:

i)notifyItemMoved ii) notifyItemRangeChanged iii)notifyItemRangeInserted iv)notifyItemRangeRemoved

Compared to notifyDataSetChanged() , these methods are far more efficient.

But to make DiffUtils working in the project, we have to pass the information regarding the old and new list. This is done using DiffUtil.Callback .


![image](https://user-images.githubusercontent.com/39657409/80634647-685f3500-8a78-11ea-8522-3024c3095ebc.png)
