package pb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class o implements Runnable {
    public final int f55665a;
    public final Runnable f55666b;

    public o(int i7, Runnable runnable) {
        this.f55665a = i7;
        this.f55666b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f55665a) {
            case 0:
                Deque deque = (Deque) h.f55648b.get();
                q6.m.h(deque);
                Runnable runnable = this.f55666b;
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
                h.f55648b.set(new ArrayDeque());
                this.f55666b.run();
                return;
        }
    }
}
