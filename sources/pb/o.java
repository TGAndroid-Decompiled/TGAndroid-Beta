package pb;

import java.util.ArrayDeque;
import java.util.Deque;
public final class o implements Runnable {
    public final int f54966a;
    public final Runnable f54967b;

    public o(int i7, Runnable runnable) {
        this.f54966a = i7;
        this.f54967b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f54966a) {
            case 0:
                Deque deque = (Deque) h.f54949b.get();
                q6.m.g(deque);
                Runnable runnable = this.f54967b;
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
                h.f54949b.set(new ArrayDeque());
                this.f54967b.run();
                return;
        }
    }
}
