package com.ilifesmart.weatherdemoapi.databeans

data class HomeChapters(
    val curPage:Int,
    val offset:Int,
    val over:Boolean,
    val pageCount:Int,
    val size:Int,
    val total:Int,
    val datas:List<Data>
) {
    data class Data(
        val apkLink:String,
        val author:String="android",
        val chapterId:Int,
        val chapterName:String,
        val collect:Boolean,
        val courseId:Int,
        val desc:String,
        val envelopePic:String,
        val fresh:Boolean,
        val id:Int,
        val link:String,
        val niceDate:String,
        val origin:String,
        val prefix:String,
        val projectLink:String,
        val publishTime:Long,
        val superChapterId:Int,
        val superChapterName:String,
        val tags:List<Tag>,
        val title:String,
        val type:Int,
        val userId:Int,
        val visible:Int,
        val zan:Int
    ) {
        data class Tag(
            val name:String,
            val url:String
        )
    }
}