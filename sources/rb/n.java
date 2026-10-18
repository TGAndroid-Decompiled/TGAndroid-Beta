package rb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class n implements Runnable {
    public final int f45247a;
    public final Runnable f45248b;

    public n(int i10, Runnable runnable) {
        this.f45247a = i10;
        this.f45248b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f45247a) {
            case 0:
                Deque deque = (Deque) h.f45233b.get();
                n6.l.h(deque);
                Runnable runnable = this.f45248b;
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
                h.f45233b.set(new ArrayDeque());
                this.f45248b.run();
                return;
        }
    }
}
