package qb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class n implements Runnable {
    public final int f44324a;
    public final Runnable f44325b;

    public n(int i10, Runnable runnable) {
        this.f44324a = i10;
        this.f44325b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f44324a) {
            case 0:
                Deque deque = (Deque) h.f44310b.get();
                n6.l.h(deque);
                Runnable runnable = this.f44325b;
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
                h.f44310b.set(new ArrayDeque());
                this.f44325b.run();
                return;
        }
    }
}
