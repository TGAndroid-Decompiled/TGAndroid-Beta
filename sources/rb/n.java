package rb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class n implements Runnable {
    public final int f45213a;
    public final Runnable f45214b;

    public n(int i10, Runnable runnable) {
        this.f45213a = i10;
        this.f45214b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f45213a) {
            case 0:
                Deque deque = (Deque) h.f45199b.get();
                n6.l.h(deque);
                Runnable runnable = this.f45214b;
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
                h.f45199b.set(new ArrayDeque());
                this.f45214b.run();
                return;
        }
    }
}
