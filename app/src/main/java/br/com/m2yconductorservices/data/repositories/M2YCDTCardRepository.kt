package br.com.m2yconductorservices.data.repositories

import br.com.m2yconductorservices.data.remote.datasources.M2YCDTCardRemoteDataSource
import br.com.m2yconductorservices.data.remote.models.request.*

object M2YCDTCardRepository {

    fun verifyPassword(request: VerifyPasswordRequest) = M2YCDTCardRemoteDataSource.validateCard(request)

    fun unlockCard(card: BlockAndUnBlockRequest) = M2YCDTCardRemoteDataSource.unlockCard(card)

    fun blockCard(card: BlockAndUnBlockRequest) = M2YCDTCardRemoteDataSource.blockCard(card)

    fun cancelCard(card: CardIdRequest) = M2YCDTCardRemoteDataSource.cancelCard(card)

    fun cdtCancelCard(card: CardIdRequest) = M2YCDTCardRemoteDataSource.cdtCancelCard(card)

    fun updateCardPassword(request: UpdatePassCardRequest) = M2YCDTCardRemoteDataSource.updateCardPassword(request)

    fun activateCard(request: ActivateCardRequest) = M2YCDTCardRemoteDataSource.activateCard(request)

    fun requestCard(request: RequestCardRequest) = M2YCDTCardRemoteDataSource.requestCard(request)
}