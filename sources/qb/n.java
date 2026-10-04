package qb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class n implements Runnable {
    public final int f44922a;
    public final Runnable f44923b;

    public n(int i10, Runnable runnable) {
        this.f44922a = i10;
        this.f44923b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f44922a) {
            case 0:
                Deque deque = (Deque) h.f44908b.get();
                n6.l.h(deque);
                Runnable runnable = this.f44923b;
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
                h.f44908b.set(new ArrayDeque());
                this.f44923b.run();
                return;
        }
    }
}
