package com.nestdev.domainl

import kotlinx.coroutines.flow.StateFlow


/**
 * Abstract class for a Use Case (Interactor in terms of Clean Architecture).
 * This interface represents a execution unit for different use cases (this means any use case
 * in the application should implement this contract).
 *
 * By convention each UseCase implementation will return the result using a {@link DisposableObserver}
 * that will execute its job in a background thread and will post the result in the UI thread.
 *
 * @author Anastasia Drogunove
 */
abstract class AbstractUseCase<T, Params> {

    abstract fun buildUseCaseFlow(params: Params): StateFlow<T?>
}
