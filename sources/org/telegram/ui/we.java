package org.telegram.ui;
public final class we implements Runnable {
    public final int f42772a;
    public final un f42773b;
    public final org.telegram.ui.Components.ol0 f42774c;
    public final String d;

    public we(un unVar, org.telegram.ui.Components.ol0 ol0Var, String str, int i10) {
        this.f42772a = i10;
        this.f42773b = unVar;
        this.f42774c = ol0Var;
        this.d = str;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.cc a02;
        int i10;
        int i11 = this.f42772a;
        String str = this.d;
        org.telegram.ui.Components.ol0 ol0Var = this.f42774c;
        un unVar = this.f42773b;
        switch (i11) {
            case 0:
                ol0Var.dismiss();
                org.telegram.messenger.i0.g(str);
                a02 = org.telegram.ui.Components.cc.a0(unVar);
                i10 = 2131746350;
                break;
            case 1:
                ol0Var.dismiss();
                org.telegram.messenger.i0.g(str);
                a02 = org.telegram.ui.Components.cc.a0(unVar);
                i10 = 2131743227;
                break;
            case 2:
                ol0Var.dismiss();
                org.telegram.messenger.i0.g(str);
                a02 = org.telegram.ui.Components.cc.a0(unVar);
                i10 = 2131752553;
                break;
            default:
                ol0Var.dismiss();
                org.telegram.messenger.i0.g("@" + str);
                a02 = org.telegram.ui.Components.cc.a0(unVar);
                i10 = 2131743691;
                break;
        }
        org.telegram.messenger.a30.r(null, i10, a02);
    }
}
