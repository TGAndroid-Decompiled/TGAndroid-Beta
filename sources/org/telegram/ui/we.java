package org.telegram.ui;
public final class we implements Runnable {
    public final int f42955a;
    public final un f42956b;
    public final org.telegram.ui.Components.nl0 f42957c;
    public final String d;

    public we(un unVar, org.telegram.ui.Components.nl0 nl0Var, String str, int i10) {
        this.f42955a = i10;
        this.f42956b = unVar;
        this.f42957c = nl0Var;
        this.d = str;
    }

    @Override
    public final void run() {
        org.telegram.ui.Components.cc a02;
        int i10;
        int i11 = this.f42955a;
        String str = this.d;
        org.telegram.ui.Components.nl0 nl0Var = this.f42957c;
        un unVar = this.f42956b;
        switch (i11) {
            case 0:
                nl0Var.dismiss();
                org.telegram.messenger.i0.g(str);
                a02 = org.telegram.ui.Components.cc.a0(unVar);
                i10 = 2131746350;
                break;
            case 1:
                nl0Var.dismiss();
                org.telegram.messenger.i0.g(str);
                a02 = org.telegram.ui.Components.cc.a0(unVar);
                i10 = 2131743227;
                break;
            case 2:
                nl0Var.dismiss();
                org.telegram.messenger.i0.g(str);
                a02 = org.telegram.ui.Components.cc.a0(unVar);
                i10 = 2131752553;
                break;
            default:
                nl0Var.dismiss();
                org.telegram.messenger.i0.g("@" + str);
                a02 = org.telegram.ui.Components.cc.a0(unVar);
                i10 = 2131743691;
                break;
        }
        org.telegram.messenger.z20.r(null, i10, a02);
    }
}
