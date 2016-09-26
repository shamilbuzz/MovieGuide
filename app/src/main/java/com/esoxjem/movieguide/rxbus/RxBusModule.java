package com.esoxjem.movieguide.rxbus;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author Ashwini Kumar.
 */
@Module
public class RxBusModule
{
    @Provides
    @Singleton
    RxBus provideRxBus()
    {
        return new RxBus();
    }
}
