package org.telegram.ui;
public final class vg implements org.telegram.messenger.c20 {
    public final int f50673a;
    public final long f50674b;
    public final long f50675c;
    public final Long d;
    public final Object f50676e;

    public vg(Object obj, long j3, long j10, Long l10, int i7) {
        this.f50673a = i7;
        this.f50676e = obj;
        this.f50674b = j3;
        this.f50675c = j10;
        this.d = l10;
    }

    @Override
    public final void a(Object obj) {
        int i7;
        switch (this.f50673a) {
            case 0:
                cn.u1((cn) this.f50676e, this.f50674b, this.f50675c, this.d, (Boolean) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                i7 = ((org.telegram.ui.ActionBar.f2) ((ui) this.f50676e).f50413b).currentAccount;
                boolean z9 = false;
                bi.ea y10 = bi.ea.y(i7, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z9 = true;
                }
                y10.g0(this.f50674b, this.f50675c, z9, true);
                return;
        }
    }
}
