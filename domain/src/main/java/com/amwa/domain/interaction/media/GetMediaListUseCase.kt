/*
 * Created by Amwalul Ikhsani on 7/29/20 4:53 PM
 * Copyright (c) 2020. All rights reserved.
 */

package com.amwa.domain.interaction.media

import com.amwa.domain.model.Media
import com.amwa.domain.model.Post
import com.amwa.domain.model.ResultWrapper

interface GetMediaListUseCase {
    suspend operator fun invoke(posts: List<Post>): ResultWrapper<List<Media>>
}