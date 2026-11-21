package org.telegram.ui;
public final class rg implements org.telegram.messenger.x10 {
    public final int f51571a;
    public final long f51572b;
    public final long f51573c;
    public final Long d;
    public final Object f51574e;

    public rg(Object obj, long j3, long j10, Long l10, int i7) {
        this.f51571a = i7;
        this.f51574e = obj;
        this.f51572b = j3;
        this.f51573c = j10;
        this.d = l10;
    }

    @Override
    public final void a(Object obj) {
        int i7;
        switch (this.f51571a) {
            case 0:
                bn.u1((bn) this.f51574e, this.f51572b, this.f51573c, this.d, (Boolean) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                i7 = ((org.telegram.ui.ActionBar.g2) ((ti) this.f51574e).f52334b).currentAccount;
                boolean z10 = false;
                di.y8 y10 = di.y8.y(i7, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z10 = true;
                }
                y10.g0(this.f51572b, this.f51573c, z10, true);
                return;
        }
    }
}
