package rb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class n implements Runnable {
    public final int f45201a;
    public final Runnable f45202b;

    public n(int i10, Runnable runnable) {
        this.f45201a = i10;
        this.f45202b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f45201a) {
            case 0:
                Deque deque = (Deque) h.f45187b.get();
                n6.l.h(deque);
                Runnable runnable = this.f45202b;
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
                h.f45187b.set(new ArrayDeque());
                this.f45202b.run();
                return;
        }
    }
}
