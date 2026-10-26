package sb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class n implements Runnable {
    public final int f48066a;
    public final Runnable f48067b;

    public n(int i10, Runnable runnable) {
        this.f48066a = i10;
        this.f48067b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f48066a) {
            case 0:
                Deque deque = (Deque) h.f48052b.get();
                o6.l.h(deque);
                Runnable runnable = this.f48067b;
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
                h.f48052b.set(new ArrayDeque());
                this.f48067b.run();
                return;
        }
    }
}
