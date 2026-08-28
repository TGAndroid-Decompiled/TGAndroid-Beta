package ya;

import java.util.ArrayDeque;
import java.util.Deque;
public final class n implements Runnable {
    public final int f49708a;
    public final Runnable f49709b;

    public n(int i9, Runnable runnable) {
        this.f49708a = i9;
        this.f49709b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f49708a) {
            case 0:
                Deque deque = (Deque) h.f49694b.get();
                x5.l.h(deque);
                Runnable runnable = this.f49709b;
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
                h.f49694b.set(new ArrayDeque());
                this.f49709b.run();
                return;
        }
    }
}
