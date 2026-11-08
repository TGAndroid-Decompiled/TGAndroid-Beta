package pb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class n implements Runnable {
    public final int f53546a;
    public final Runnable f53547b;

    public n(int i7, Runnable runnable) {
        this.f53546a = i7;
        this.f53547b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f53546a) {
            case 0:
                Deque deque = (Deque) h.f53532b.get();
                q6.m.g(deque);
                Runnable runnable = this.f53547b;
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
                h.f53532b.set(new ArrayDeque());
                this.f53547b.run();
                return;
        }
    }
}
