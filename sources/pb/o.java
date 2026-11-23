package pb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class o implements Runnable {
    public final int f55552a;
    public final Runnable f55553b;

    public o(int i7, Runnable runnable) {
        this.f55552a = i7;
        this.f55553b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f55552a) {
            case 0:
                Deque deque = (Deque) h.f55535b.get();
                q6.m.h(deque);
                Runnable runnable = this.f55553b;
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
                h.f55535b.set(new ArrayDeque());
                this.f55553b.run();
                return;
        }
    }
}
