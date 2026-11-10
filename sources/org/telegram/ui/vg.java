package org.telegram.ui;
public final class vg implements org.telegram.messenger.c20 {
    public final int f50722a;
    public final long f50723b;
    public final long f50724c;
    public final Long d;
    public final Object f50725e;

    public vg(Object obj, long j3, long j10, Long l10, int i7) {
        this.f50722a = i7;
        this.f50725e = obj;
        this.f50723b = j3;
        this.f50724c = j10;
        this.d = l10;
    }

    @Override
    public final void a(Object obj) {
        int i7;
        switch (this.f50722a) {
            case 0:
                cn.u1((cn) this.f50725e, this.f50723b, this.f50724c, this.d, (Boolean) obj);
                return;
            default:
                Boolean bool = (Boolean) obj;
                i7 = ((org.telegram.ui.ActionBar.f2) ((ui) this.f50725e).f50508b).currentAccount;
                boolean z9 = false;
                bi.ea y10 = bi.ea.y(i7, false);
                if (this.d.longValue() > 0 && bool.booleanValue()) {
                    z9 = true;
                }
                y10.g0(this.f50723b, this.f50724c, z9, true);
                return;
        }
    }
}
