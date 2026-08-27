package r4;

import java.util.List;

public abstract class l extends k3.k implements g {

    public g f46753a;

    public long f46754b;

    public final void a(long j10, g gVar, long j11) {
        this.timeUs = j10;
        this.f46753a = gVar;
        if (j11 != Long.MAX_VALUE) {
            j10 = j11;
        }
        this.f46754b = j10;
    }

    @Override
    public final int c(long j10) {
        g gVar = this.f46753a;
        gVar.getClass();
        return gVar.c(j10 - this.f46754b);
    }

    @Override
    public final void clear() {
        super.clear();
        this.f46753a = null;
    }

    @Override
    public final long f(int i10) {
        g gVar = this.f46753a;
        gVar.getClass();
        return gVar.f(i10) + this.f46754b;
    }

    @Override
    public final List h(long j10) {
        g gVar = this.f46753a;
        gVar.getClass();
        return gVar.h(j10 - this.f46754b);
    }

    @Override
    public final int p() {
        g gVar = this.f46753a;
        gVar.getClass();
        return gVar.p();
    }
}
