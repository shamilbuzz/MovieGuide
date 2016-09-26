package com.esoxjem.movieguide.rxbus;


import rx.Observable;
import rx.subjects.PublishSubject;
import rx.subjects.SerializedSubject;
import rx.subjects.Subject;

/**
 * @author Ashwini Kumar.
 */
public class RxBus
{
    // If multiple threads are going to emit events to this
    // then it must be made thread-safe like this instead
    private final Subject<Object, Object> subject = new SerializedSubject<>(PublishSubject.create());

    public void send(Object o)
    {
        subject.onNext(o);
    }

    public Observable<Object> getObservable()
    {
        return subject;
    }

    public boolean hasObservers()
    {
        return subject.hasObservers();
    }
}
