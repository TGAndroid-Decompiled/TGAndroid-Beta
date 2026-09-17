package qb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class n implements Runnable {
    public final int f44296a;
    public final Runnable f44297b;

    public n(int i10, Runnable runnable) {
        this.f44296a = i10;
        this.f44297b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f44296a) {
            case 0:
                Deque deque = (Deque) h.f44282b.get();
                n6.l.h(deque);
                Runnable runnable = this.f44297b;
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
                h.f44282b.set(new ArrayDeque());
                this.f44297b.run();
                return;
        }
    }
}
