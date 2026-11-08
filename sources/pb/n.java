package pb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class n implements Runnable {
    public final int f53547a;
    public final Runnable f53548b;

    public n(int i7, Runnable runnable) {
        this.f53547a = i7;
        this.f53548b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f53547a) {
            case 0:
                Deque deque = (Deque) h.f53533b.get();
                q6.m.g(deque);
                Runnable runnable = this.f53548b;
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
                h.f53533b.set(new ArrayDeque());
                this.f53548b.run();
                return;
        }
    }
}
