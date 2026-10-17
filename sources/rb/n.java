package rb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class n implements Runnable {
    public final int f45227a;
    public final Runnable f45228b;

    public n(int i10, Runnable runnable) {
        this.f45227a = i10;
        this.f45228b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f45227a) {
            case 0:
                Deque deque = (Deque) h.f45213b.get();
                n6.l.h(deque);
                Runnable runnable = this.f45228b;
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
                h.f45213b.set(new ArrayDeque());
                this.f45228b.run();
                return;
        }
    }
}
