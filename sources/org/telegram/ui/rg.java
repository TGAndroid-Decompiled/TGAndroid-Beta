package org.telegram.ui;
public final class rg implements org.telegram.messenger.w10 {
    public final int f51719a;
    public final long f51720b;
    public final long f51721c;
    public final Long d;
    public final Object f51722e;

    public rg(Object obj, long j3, long j10, Long l10, int i7) {
        this.f51719a = i7;
        this.f51722e = obj;
        this.f51720b = j3;
        this.f51721c = j10;
        this.d = l10;
    }

    @Override
    public final void a(Object obj) {
        int i7;
        switch (this.f51719a) {
            case 0:
                bn.u1((bn) this.f51722e, this.f51720b, this.f51721c, this.d, (Boolean) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                i7 = ((org.telegram.ui.ActionBar.g2) ((ti) this.f51722e).f52410b).currentAccount;
                boolean z10 = false;
                di.y8 y10 = di.y8.y(i7, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z10 = true;
                }
                y10.g0(this.f51720b, this.f51721c, z10, true);
                return;
        }
    }
}
