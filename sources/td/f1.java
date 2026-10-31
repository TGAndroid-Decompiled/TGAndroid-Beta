package td;

import java.util.concurrent.CancellationException;
public interface f1 extends cd.f {
    p attachChild(r rVar);

    void cancel(CancellationException cancellationException);

    CancellationException getCancellationException();

    qd.b getChildren();

    f1 getParent();

    o0 invokeOnCompletion(ld.l lVar);

    o0 invokeOnCompletion(boolean z10, boolean z11, ld.l lVar);

    boolean isActive();

    boolean isCancelled();

    Object join(cd.c cVar);

    boolean start();
}
