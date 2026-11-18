package org.telegram.ui;
public final class rg implements org.telegram.messenger.x10 {
    public final int f51592a;
    public final long f51593b;
    public final long f51594c;
    public final Long d;
    public final Object f51595e;

    public rg(Object obj, long j3, long j10, Long l10, int i7) {
        this.f51592a = i7;
        this.f51595e = obj;
        this.f51593b = j3;
        this.f51594c = j10;
        this.d = l10;
    }

    @Override
    public final void a(Object obj) {
        int i7;
        switch (this.f51592a) {
            case 0:
                bn.u1((bn) this.f51595e, this.f51593b, this.f51594c, this.d, (Boolean) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                i7 = ((org.telegram.ui.ActionBar.h2) ((ti) this.f51595e).f52288b).currentAccount;
                boolean z10 = false;
                di.x8 y10 = di.x8.y(i7, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z10 = true;
                }
                y10.g0(this.f51593b, this.f51594c, z10, true);
                return;
        }
    }
}
