package pb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class o implements Runnable {
    public final int f55583a;
    public final Runnable f55584b;

    public o(int i7, Runnable runnable) {
        this.f55583a = i7;
        this.f55584b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f55583a) {
            case 0:
                Deque deque = (Deque) h.f55566b.get();
                q6.m.h(deque);
                Runnable runnable = this.f55584b;
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
                h.f55566b.set(new ArrayDeque());
                this.f55584b.run();
                return;
        }
    }
}
