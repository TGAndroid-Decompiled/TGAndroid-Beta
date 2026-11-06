package org.telegram.ui;
public final class rg implements org.telegram.messenger.c20 {
    public final int f49491a;
    public final long f49492b;
    public final long f49493c;
    public final Long d;
    public final Object f49494e;

    public rg(Object obj, long j3, long j10, Long l10, int i7) {
        this.f49491a = i7;
        this.f49494e = obj;
        this.f49492b = j3;
        this.f49493c = j10;
        this.d = l10;
    }

    @Override
    public final void a(Object obj) {
        int i7;
        switch (this.f49491a) {
            case 0:
                an.q1((an) this.f49494e, this.f49492b, this.f49493c, this.d, (Boolean) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                i7 = ((org.telegram.ui.ActionBar.f2) ((si) this.f49494e).f49758b).currentAccount;
                boolean z9 = false;
                bi.ea y10 = bi.ea.y(i7, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z9 = true;
                }
                y10.g0(this.f49492b, this.f49493c, z9, true);
                return;
        }
    }
}
