package za;

import java.util.ArrayDeque;
import java.util.Deque;

public final class n implements Runnable {

    public final int f50303a;

    public final Runnable f50304b;

    public n(int i10, Runnable runnable) {
        this.f50303a = i10;
        this.f50304b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f50303a) {
            case 0:
                Deque deque = (Deque) h.f50289b.get();
                y5.l.h(deque);
                Runnable runnable = this.f50304b;
                deque.add(runnable);
                if (deque.size() <= 1) {
                    do {
                        runnable.run();
                        deque.removeFirst();
                        runnable = (Runnable) deque.peekFirst();
                    } while (runnable != null);
                }
                break;
            default:
                h.f50289b.set(new ArrayDeque());
                this.f50304b.run();
                break;
        }
    }
}
