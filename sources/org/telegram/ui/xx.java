package org.telegram.ui;

public final class xx implements Runnable {

    public final int f44634a;

    public final yx f44635b;

    public xx(yx yxVar, int i10) {
        this.f44634a = i10;
        this.f44635b = yxVar;
    }

    @Override
    public final void run() {
        switch (this.f44634a) {
            case 0:
                yx yxVar = this.f44635b;
                gy gyVar = yxVar.A0;
                gyVar.showDialog(new ag.i1(3, ((org.telegram.ui.ActionBar.n2) gyVar).currentAccount, yxVar.getContext(), gyVar, null));
                break;
            default:
                gy gyVar2 = this.f44635b.A0;
                dx dxVar = gyVar2.I0;
                if (dxVar != null) {
                    dxVar.dismiss();
                    gyVar2.I0 = null;
                }
                break;
        }
    }
}
