package org.telegram.ui;
public final class rg implements org.telegram.messenger.y10 {
    public final int f51575a;
    public final long f51576b;
    public final long f51577c;
    public final Long d;
    public final Object f51578e;

    public rg(Object obj, long j3, long j10, Long l10, int i7) {
        this.f51575a = i7;
        this.f51578e = obj;
        this.f51576b = j3;
        this.f51577c = j10;
        this.d = l10;
    }

    @Override
    public final void a(Object obj) {
        int i7;
        switch (this.f51575a) {
            case 0:
                bn.u1((bn) this.f51578e, this.f51576b, this.f51577c, this.d, (Boolean) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                i7 = ((org.telegram.ui.ActionBar.g2) ((ti) this.f51578e).f52338b).currentAccount;
                boolean z10 = false;
                di.y8 y10 = di.y8.y(i7, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z10 = true;
                }
                y10.g0(this.f51576b, this.f51577c, z10, true);
                return;
        }
    }
}
