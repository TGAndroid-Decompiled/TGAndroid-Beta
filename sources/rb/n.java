package rb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class n implements Runnable {
    public final int f45625a;
    public final Runnable f45626b;

    public n(int i10, Runnable runnable) {
        this.f45625a = i10;
        this.f45626b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f45625a) {
            case 0:
                Deque deque = (Deque) h.f45611b.get();
                n6.l.h(deque);
                Runnable runnable = this.f45626b;
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
                h.f45611b.set(new ArrayDeque());
                this.f45626b.run();
                return;
        }
    }
}
