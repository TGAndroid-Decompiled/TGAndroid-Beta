package rb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class n implements Runnable {
    public final int f44112a;
    public final Runnable f44113b;

    public n(int i10, Runnable runnable) {
        this.f44112a = i10;
        this.f44113b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f44112a) {
            case 0:
                Deque deque = (Deque) h.f44098b.get();
                n6.l.h(deque);
                Runnable runnable = this.f44113b;
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
                h.f44098b.set(new ArrayDeque());
                this.f44113b.run();
                return;
        }
    }
}
