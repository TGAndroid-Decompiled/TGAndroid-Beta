package org.telegram.ui;
public final class rg implements org.telegram.messenger.z10 {
    public final int f50950a;
    public final long f50951b;
    public final long f50952c;
    public final Long d;
    public final Object f50953e;

    public rg(Object obj, long j3, long j10, Long l10, int i7) {
        this.f50950a = i7;
        this.f50953e = obj;
        this.f50951b = j3;
        this.f50952c = j10;
        this.d = l10;
    }

    @Override
    public final void a(Object obj) {
        int i7;
        switch (this.f50950a) {
            case 0:
                an.u1((an) this.f50953e, this.f50951b, this.f50952c, this.d, (Boolean) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                i7 = ((org.telegram.ui.ActionBar.e2) ((si) this.f50953e).f51228b).currentAccount;
                boolean z10 = false;
                di.v8 y10 = di.v8.y(i7, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z10 = true;
                }
                y10.g0(this.f50951b, this.f50952c, z10, true);
                return;
        }
    }
}
