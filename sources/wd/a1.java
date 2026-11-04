package wd;

import java.util.concurrent.CancellationException;
public interface a1 extends fd.f {
    p attachChild(r rVar);

    void cancel(CancellationException cancellationException);

    CancellationException getCancellationException();

    td.b getChildren();

    l0 invokeOnCompletion(od.l lVar);

    l0 invokeOnCompletion(boolean z10, boolean z11, od.l lVar);

    boolean isActive();

    boolean isCancelled();

    Object join(fd.c cVar);

    boolean start();
}
