package rb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class n implements Runnable {
    public final int f45209a;
    public final Runnable f45210b;

    public n(int i10, Runnable runnable) {
        this.f45209a = i10;
        this.f45210b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f45209a) {
            case 0:
                Deque deque = (Deque) h.f45195b.get();
                n6.l.h(deque);
                Runnable runnable = this.f45210b;
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
                h.f45195b.set(new ArrayDeque());
                this.f45210b.run();
                return;
        }
    }
}
