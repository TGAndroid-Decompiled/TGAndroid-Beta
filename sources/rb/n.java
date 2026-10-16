package rb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class n implements Runnable {
    public final int f43871a;
    public final Runnable f43872b;

    public n(int i10, Runnable runnable) {
        this.f43871a = i10;
        this.f43872b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f43871a) {
            case 0:
                Deque deque = (Deque) h.f43857b.get();
                n6.l.h(deque);
                Runnable runnable = this.f43872b;
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
                h.f43857b.set(new ArrayDeque());
                this.f43872b.run();
                return;
        }
    }
}
