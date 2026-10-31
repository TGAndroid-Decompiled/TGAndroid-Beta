package org.telegram.ui;
public final class qz0 implements Runnable {
    public final int f41095a;
    public final boolean[] f41096b;
    public final org.telegram.messenger.q20 f41097c;

    public qz0(int i10, org.telegram.messenger.q20 q20Var, boolean[] zArr) {
        this.f41095a = i10;
        this.f41096b = zArr;
        this.f41097c = q20Var;
    }

    @Override
    public final void run() {
        org.telegram.messenger.q20 q20Var;
        org.telegram.messenger.q20 q20Var2;
        org.telegram.messenger.q20 q20Var3;
        switch (this.f41095a) {
            case 0:
                boolean[] zArr = this.f41096b;
                if (!zArr[0] && (q20Var = this.f41097c) != null) {
                    zArr[0] = true;
                    q20Var.a(Boolean.TRUE);
                }
                org.telegram.messenger.i0.h3(new org.telegram.ui.Components.voip.m0(14), 220L);
                return;
            case 1:
                boolean[] zArr2 = this.f41096b;
                if (!zArr2[0] && (q20Var2 = this.f41097c) != null) {
                    zArr2[0] = true;
                    q20Var2.a(Boolean.FALSE);
                    return;
                }
                return;
            default:
                boolean[] zArr3 = this.f41096b;
                if (!zArr3[0] && (q20Var3 = this.f41097c) != null) {
                    q20Var3.a("cancelled");
                    zArr3[0] = true;
                    return;
                }
                return;
        }
    }

    public qz0(rh.e6 e6Var, boolean[] zArr, org.telegram.messenger.q20 q20Var) {
        this.f41095a = 2;
        this.f41096b = zArr;
        this.f41097c = q20Var;
    }
}
