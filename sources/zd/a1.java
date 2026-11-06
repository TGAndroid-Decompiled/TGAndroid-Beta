package zd;

import java.util.concurrent.CancellationException;
public interface a1 extends id.f {
    p attachChild(r rVar);

    void cancel(CancellationException cancellationException);

    CancellationException getCancellationException();

    wd.b getChildren();

    l0 invokeOnCompletion(rd.l lVar);

    l0 invokeOnCompletion(boolean z9, boolean z10, rd.l lVar);

    boolean isActive();

    boolean isCancelled();

    Object join(id.c cVar);

    boolean start();
}
