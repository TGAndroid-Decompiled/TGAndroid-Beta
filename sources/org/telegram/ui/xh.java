package org.telegram.ui;
public final class xh implements Runnable {
    public final int f43370a = 1;
    public final un f43371b;
    public final int f43372c;
    public final org.telegram.messenger.kj d;

    public xh(un unVar, int i10, org.telegram.messenger.kj kjVar) {
        this.f43371b = unVar;
        this.f43372c = i10;
        this.d = kjVar;
    }

    @Override
    public final void run() {
        int i10 = this.f43370a;
        org.telegram.messenger.kj kjVar = this.d;
        int i11 = this.f43372c;
        un unVar = this.f43371b;
        switch (i10) {
            case 0:
                unVar.B4 = null;
                kjVar.f16690k.replies.read_max_id = i11;
                return;
            default:
                org.telegram.ui.Components.cc.a0(unVar).c(org.telegram.messenger.dd.L0(2131754488, null)).j();
                org.telegram.messenger.wp.r1(i11).o0(false);
                unVar.Za(kjVar);
                unVar.bb(kjVar);
                return;
        }
    }

    public xh(un unVar, org.telegram.messenger.kj kjVar, int i10) {
        this.f43371b = unVar;
        this.d = kjVar;
        this.f43372c = i10;
    }
}
