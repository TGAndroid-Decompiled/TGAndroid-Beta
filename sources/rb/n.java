package rb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class n implements Runnable {
    public final int f45212a;
    public final Runnable f45213b;

    public n(int i10, Runnable runnable) {
        this.f45212a = i10;
        this.f45213b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f45212a) {
            case 0:
                Deque deque = (Deque) h.f45198b.get();
                n6.l.h(deque);
                Runnable runnable = this.f45213b;
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
                h.f45198b.set(new ArrayDeque());
                this.f45213b.run();
                return;
        }
    }
}
