package sd;

import ld.e0;
public final class j extends i {
    public final Runnable f44276c;

    public j(Runnable runnable, long j10, c5.c cVar) {
        super(j10, cVar);
        this.f44276c = runnable;
    }

    @Override
    public final void run() {
        try {
            this.f44276c.run();
        } finally {
            this.f44275b.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f44276c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(e0.k(runnable));
        sb.append(", ");
        sb.append(this.f44274a);
        sb.append(", ");
        sb.append(this.f44275b);
        sb.append(']');
        return sb.toString();
    }
}
