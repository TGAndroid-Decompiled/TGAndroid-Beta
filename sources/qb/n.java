package qb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class n implements Runnable {
    public final int f44323a;
    public final Runnable f44324b;

    public n(int i10, Runnable runnable) {
        this.f44323a = i10;
        this.f44324b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f44323a) {
            case 0:
                Deque deque = (Deque) h.f44309b.get();
                n6.l.h(deque);
                Runnable runnable = this.f44324b;
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
                h.f44309b.set(new ArrayDeque());
                this.f44324b.run();
                return;
        }
    }
}
