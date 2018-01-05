package org.vibrant.core.base.models

import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.fasterxml.jackson.annotation.JsonTypeName
import org.vibrant.core.models.BlockChainModel

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY)
@JsonTypeName("blockchain")
data class BaseBlockChainModel(
        val blocks: List<BaseBlockModel>
): BlockChainModel()