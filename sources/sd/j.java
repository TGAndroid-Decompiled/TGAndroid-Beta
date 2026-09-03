package sd;

import ld.e0;
public final class j extends i {
    public final Runnable f47300c;

    public j(Runnable runnable, long j10, c5.c cVar) {
        super(j10, cVar);
        this.f47300c = runnable;
    }

    @Override
    public final void run() {
        try {
            this.f47300c.run();
        } finally {
            this.f47299b.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f47300c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(e0.k(runnable));
        sb.append(", ");
        sb.append(this.f47298a);
        sb.append(", ");
        sb.append(this.f47299b);
        sb.append(']');
        return sb.toString();
    }
}
