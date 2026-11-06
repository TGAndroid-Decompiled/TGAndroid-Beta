package pb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class n implements Runnable {
    public final int f53453a;
    public final Runnable f53454b;

    public n(int i7, Runnable runnable) {
        this.f53453a = i7;
        this.f53454b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f53453a) {
            case 0:
                Deque deque = (Deque) h.f53439b.get();
                q6.m.g(deque);
                Runnable runnable = this.f53454b;
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
                h.f53439b.set(new ArrayDeque());
                this.f53454b.run();
                return;
        }
    }
}
