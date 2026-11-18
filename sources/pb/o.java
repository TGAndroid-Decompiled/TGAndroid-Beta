package pb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class o implements Runnable {
    public final int f55542a;
    public final Runnable f55543b;

    public o(int i7, Runnable runnable) {
        this.f55542a = i7;
        this.f55543b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f55542a) {
            case 0:
                Deque deque = (Deque) h.f55525b.get();
                q6.m.h(deque);
                Runnable runnable = this.f55543b;
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
                h.f55525b.set(new ArrayDeque());
                this.f55543b.run();
                return;
        }
    }
}
