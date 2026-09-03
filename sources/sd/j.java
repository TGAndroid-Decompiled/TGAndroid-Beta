package sd;

import ld.e0;
public final class j extends i {
    public final Runnable f44341c;

    public j(Runnable runnable, long j10, c5.c cVar) {
        super(j10, cVar);
        this.f44341c = runnable;
    }

    @Override
    public final void run() {
        try {
            this.f44341c.run();
        } finally {
            this.f44340b.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f44341c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(e0.k(runnable));
        sb.append(", ");
        sb.append(this.f44339a);
        sb.append(", ");
        sb.append(this.f44340b);
        sb.append(']');
        return sb.toString();
    }
}
