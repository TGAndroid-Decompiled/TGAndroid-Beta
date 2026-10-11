package qb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class n implements Runnable {
    public final int f46171a;
    public final Runnable f46172b;

    public n(int i10, Runnable runnable) {
        this.f46171a = i10;
        this.f46172b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f46171a) {
            case 0:
                Deque deque = (Deque) h.f46157b.get();
                n6.m.h(deque);
                Runnable runnable = this.f46172b;
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
                h.f46157b.set(new ArrayDeque());
                this.f46172b.run();
                return;
        }
    }
}
