package qb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class n implements Runnable {
    public final int f44929a;
    public final Runnable f44930b;

    public n(int i10, Runnable runnable) {
        this.f44929a = i10;
        this.f44930b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f44929a) {
            case 0:
                Deque deque = (Deque) h.f44915b.get();
                n6.l.h(deque);
                Runnable runnable = this.f44930b;
                deque.add(runnable);
                if (deque.size() <= 1) {
                    do {
                        runnable.run();
                        deque.removeFirst();
                        runnable = (Runnable) deque.peekFirst();
                    } while (runnable != null);
                    return;
                }
                return;
            default:
                h.f44915b.set(new ArrayDeque());
                this.f44930b.run();
                return;
        }
    }
}
