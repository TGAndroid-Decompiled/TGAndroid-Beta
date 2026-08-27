package pd;

import id.f0;

public final class j extends i {

    public final Runnable f45722c;

    public j(Runnable runnable, long j10, com.google.android.gms.internal.cast.a aVar) {
        super(j10, aVar);
        this.f45722c = runnable;
    }

    @Override
    public final void run() {
        try {
            this.f45722c.run();
        } finally {
            this.f45721b.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Task[");
        Runnable runnable = this.f45722c;
        sb2.append(runnable.getClass().getSimpleName());
        sb2.append('@');
        sb2.append(f0.k(runnable));
        sb2.append(", ");
        sb2.append(this.f45720a);
        sb2.append(", ");
        sb2.append(this.f45721b);
        sb2.append(']');
        return sb2.toString();
    }
}
