package org.telegram.ui;
public final class xh implements Runnable {
    public final int f43580a = 1;
    public final un f43581b;
    public final int f43582c;
    public final org.telegram.messenger.jj d;

    public xh(un unVar, int i10, org.telegram.messenger.jj jjVar) {
        this.f43581b = unVar;
        this.f43582c = i10;
        this.d = jjVar;
    }

    @Override
    public final void run() {
        int i10 = this.f43580a;
        org.telegram.messenger.jj jjVar = this.d;
        int i11 = this.f43582c;
        un unVar = this.f43581b;
        switch (i10) {
            case 0:
                unVar.B4 = null;
                jjVar.f16337k.replies.read_max_id = i11;
                return;
            default:
                org.telegram.ui.Components.cc.a0(unVar).c(org.telegram.messenger.cd.L0(2131754488, null)).j();
                org.telegram.messenger.vp.r1(i11).o0(false);
                unVar.Ua(jjVar);
                unVar.Wa(jjVar);
                return;
        }
    }

    public xh(un unVar, org.telegram.messenger.jj jjVar, int i10) {
        this.f43581b = unVar;
        this.d = jjVar;
        this.f43582c = i10;
    }
}
