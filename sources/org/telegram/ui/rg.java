package org.telegram.ui;
public final class rg implements org.telegram.messenger.y10 {
    public final int f51603a;
    public final long f51604b;
    public final long f51605c;
    public final Long d;
    public final Object f51606e;

    public rg(Object obj, long j3, long j10, Long l10, int i7) {
        this.f51603a = i7;
        this.f51606e = obj;
        this.f51604b = j3;
        this.f51605c = j10;
        this.d = l10;
    }

    @Override
    public final void a(Object obj) {
        int i7;
        switch (this.f51603a) {
            case 0:
                bn.u1((bn) this.f51606e, this.f51604b, this.f51605c, this.d, (Boolean) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                i7 = ((org.telegram.ui.ActionBar.g2) ((ti) this.f51606e).f52284b).currentAccount;
                boolean z10 = false;
                di.y8 y10 = di.y8.y(i7, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z10 = true;
                }
                y10.g0(this.f51604b, this.f51605c, z10, true);
                return;
        }
    }
}
