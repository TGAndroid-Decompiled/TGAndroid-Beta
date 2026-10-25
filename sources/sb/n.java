package sb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class n implements Runnable {
    public final int f48063a;
    public final Runnable f48064b;

    public n(int i10, Runnable runnable) {
        this.f48063a = i10;
        this.f48064b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f48063a) {
            case 0:
                Deque deque = (Deque) h.f48049b.get();
                o6.l.h(deque);
                Runnable runnable = this.f48064b;
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
                h.f48049b.set(new ArrayDeque());
                this.f48064b.run();
                return;
        }
    }
}
