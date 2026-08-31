package sd;

import ld.e0;
public final class j extends i {
    public final Runnable f47269c;

    public j(Runnable runnable, long j10, c5.c cVar) {
        super(j10, cVar);
        this.f47269c = runnable;
    }

    @Override
    public final void run() {
        try {
            this.f47269c.run();
        } finally {
            this.f47268b.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f47269c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(e0.k(runnable));
        sb.append(", ");
        sb.append(this.f47267a);
        sb.append(", ");
        sb.append(this.f47268b);
        sb.append(']');
        return sb.toString();
    }
}
