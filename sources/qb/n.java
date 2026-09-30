package qb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class n implements Runnable {
    public final int f41644a;
    public final Runnable f41645b;

    public n(int i10, Runnable runnable) {
        this.f41644a = i10;
        this.f41645b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f41644a) {
            case 0:
                Deque deque = (Deque) h.f41630b.get();
                n6.l.h(deque);
                Runnable runnable = this.f41645b;
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
                h.f41630b.set(new ArrayDeque());
                this.f41645b.run();
                return;
        }
    }
}
