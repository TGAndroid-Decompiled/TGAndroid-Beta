package rb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class n implements Runnable {
    public final int f45199a;
    public final Runnable f45200b;

    public n(int i10, Runnable runnable) {
        this.f45199a = i10;
        this.f45200b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f45199a) {
            case 0:
                Deque deque = (Deque) h.f45185b.get();
                n6.l.h(deque);
                Runnable runnable = this.f45200b;
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
                h.f45185b.set(new ArrayDeque());
                this.f45200b.run();
                return;
        }
    }
}
