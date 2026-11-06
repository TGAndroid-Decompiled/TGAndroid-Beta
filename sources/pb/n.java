package pb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class n implements Runnable {
    public final int f53429a;
    public final Runnable f53430b;

    public n(int i7, Runnable runnable) {
        this.f53429a = i7;
        this.f53430b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f53429a) {
            case 0:
                Deque deque = (Deque) h.f53415b.get();
                q6.m.g(deque);
                Runnable runnable = this.f53430b;
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
                h.f53415b.set(new ArrayDeque());
                this.f53430b.run();
                return;
        }
    }
}
