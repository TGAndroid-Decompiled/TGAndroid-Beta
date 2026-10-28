package sb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class n implements Runnable {
    public final int f48104a;
    public final Runnable f48105b;

    public n(int i10, Runnable runnable) {
        this.f48104a = i10;
        this.f48105b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f48104a) {
            case 0:
                Deque deque = (Deque) h.f48090b.get();
                o6.l.h(deque);
                Runnable runnable = this.f48105b;
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
                h.f48090b.set(new ArrayDeque());
                this.f48105b.run();
                return;
        }
    }
}
