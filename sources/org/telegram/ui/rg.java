package org.telegram.ui;
public final class rg implements org.telegram.messenger.c20 {
    public final int f49489a;
    public final long f49490b;
    public final long f49491c;
    public final Long d;
    public final Object f49492e;

    public rg(Object obj, long j3, long j10, Long l10, int i7) {
        this.f49489a = i7;
        this.f49492e = obj;
        this.f49490b = j3;
        this.f49491c = j10;
        this.d = l10;
    }

    @Override
    public final void a(Object obj) {
        int i7;
        switch (this.f49489a) {
            case 0:
                an.q1((an) this.f49492e, this.f49490b, this.f49491c, this.d, (Boolean) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                i7 = ((org.telegram.ui.ActionBar.f2) ((si) this.f49492e).f49769b).currentAccount;
                boolean z9 = false;
                bi.ea y10 = bi.ea.y(i7, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z9 = true;
                }
                y10.g0(this.f49490b, this.f49491c, z9, true);
                return;
        }
    }
}
