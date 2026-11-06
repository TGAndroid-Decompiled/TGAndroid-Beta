package pb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class n implements Runnable {
    public final int f53455a;
    public final Runnable f53456b;

    public n(int i7, Runnable runnable) {
        this.f53455a = i7;
        this.f53456b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f53455a) {
            case 0:
                Deque deque = (Deque) h.f53441b.get();
                q6.m.g(deque);
                Runnable runnable = this.f53456b;
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
                h.f53441b.set(new ArrayDeque());
                this.f53456b.run();
                return;
        }
    }
}
