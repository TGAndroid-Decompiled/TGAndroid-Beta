package qd;

import jd.e0;
public final class j extends i {
    public final Runnable f46629c;

    public j(Runnable runnable, long j10, a5.c cVar) {
        super(j10, cVar);
        this.f46629c = runnable;
    }

    @Override
    public final void run() {
        try {
            this.f46629c.run();
        } finally {
            this.f46628b.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Task[");
        Runnable runnable = this.f46629c;
        sb2.append(runnable.getClass().getSimpleName());
        sb2.append('@');
        sb2.append(e0.k(runnable));
        sb2.append(", ");
        sb2.append(this.f46627a);
        sb2.append(", ");
        sb2.append(this.f46628b);
        sb2.append(']');
        return sb2.toString();
    }
}
