package rb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class n implements Runnable {
    public final int f45624a;
    public final Runnable f45625b;

    public n(int i10, Runnable runnable) {
        this.f45624a = i10;
        this.f45625b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f45624a) {
            case 0:
                Deque deque = (Deque) h.f45610b.get();
                n6.l.h(deque);
                Runnable runnable = this.f45625b;
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
                h.f45610b.set(new ArrayDeque());
                this.f45625b.run();
                return;
        }
    }
}
