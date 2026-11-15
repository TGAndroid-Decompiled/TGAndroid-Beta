package org.telegram.ui;
public final class rg implements org.telegram.messenger.z10 {
    public final int f50949a;
    public final long f50950b;
    public final long f50951c;
    public final Long d;
    public final Object f50952e;

    public rg(Object obj, long j3, long j10, Long l10, int i7) {
        this.f50949a = i7;
        this.f50952e = obj;
        this.f50950b = j3;
        this.f50951c = j10;
        this.d = l10;
    }

    @Override
    public final void a(Object obj) {
        int i7;
        switch (this.f50949a) {
            case 0:
                an.u1((an) this.f50952e, this.f50950b, this.f50951c, this.d, (Boolean) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                i7 = ((org.telegram.ui.ActionBar.e2) ((si) this.f50952e).f51224b).currentAccount;
                boolean z10 = false;
                di.u8 y10 = di.u8.y(i7, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z10 = true;
                }
                y10.g0(this.f50950b, this.f50951c, z10, true);
                return;
        }
    }
}
