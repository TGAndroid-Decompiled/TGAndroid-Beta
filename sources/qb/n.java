package qb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class n implements Runnable {
    public final int f40633a;
    public final Runnable f40634b;

    public n(int i10, Runnable runnable) {
        this.f40633a = i10;
        this.f40634b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f40633a) {
            case 0:
                Deque deque = (Deque) h.f40619b.get();
                n6.l.h(deque);
                Runnable runnable = this.f40634b;
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
                h.f40619b.set(new ArrayDeque());
                this.f40634b.run();
                return;
        }
    }
}
