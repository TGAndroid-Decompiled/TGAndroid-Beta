package org.telegram.ui;
public final class rg implements org.telegram.messenger.c20 {
    public final int f49510a;
    public final long f49511b;
    public final long f49512c;
    public final Long d;
    public final Object f49513e;

    public rg(Object obj, long j3, long j10, Long l10, int i7) {
        this.f49510a = i7;
        this.f49513e = obj;
        this.f49511b = j3;
        this.f49512c = j10;
        this.d = l10;
    }

    @Override
    public final void a(Object obj) {
        int i7;
        switch (this.f49510a) {
            case 0:
                an.q1((an) this.f49513e, this.f49511b, this.f49512c, this.d, (Boolean) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                i7 = ((org.telegram.ui.ActionBar.f2) ((si) this.f49513e).f49778b).currentAccount;
                boolean z9 = false;
                bi.ea y10 = bi.ea.y(i7, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z9 = true;
                }
                y10.g0(this.f49511b, this.f49512c, z9, true);
                return;
        }
    }
}
