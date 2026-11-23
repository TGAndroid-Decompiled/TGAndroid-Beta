package pb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class o implements Runnable {
    public final int f55587a;
    public final Runnable f55588b;

    public o(int i7, Runnable runnable) {
        this.f55587a = i7;
        this.f55588b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f55587a) {
            case 0:
                Deque deque = (Deque) h.f55570b.get();
                q6.m.h(deque);
                Runnable runnable = this.f55588b;
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
                h.f55570b.set(new ArrayDeque());
                this.f55588b.run();
                return;
        }
    }
}
