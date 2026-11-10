package pb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class n implements Runnable {
    public final int f53558a;
    public final Runnable f53559b;

    public n(int i7, Runnable runnable) {
        this.f53558a = i7;
        this.f53559b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f53558a) {
            case 0:
                Deque deque = (Deque) h.f53544b.get();
                q6.m.g(deque);
                Runnable runnable = this.f53559b;
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
                h.f53544b.set(new ArrayDeque());
                this.f53559b.run();
                return;
        }
    }
}
