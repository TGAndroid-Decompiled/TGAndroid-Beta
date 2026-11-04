package org.telegram.ui;
public final class uh extends org.telegram.ui.ActionBar.f1 {
    public final org.telegram.ui.Components.li0 f50083o;
    public final wm f50084p;

    public uh(wm wmVar, va vaVar, org.telegram.ui.Components.li0 li0Var) {
        super(vaVar, -2, -2);
        this.f50084p = wmVar;
        this.f50083o = li0Var;
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        org.telegram.ui.Components.li0 li0Var = this.f50083o;
        if (li0Var != null) {
            li0Var.d(z10);
        }
    }

    @Override
    public final void dismiss() {
        d(true);
        wm wmVar = this.f50084p;
        if (wmVar.f51316f9 == this) {
            org.telegram.ui.Components.ac acVar = org.telegram.ui.Components.ac.f31784w;
            org.telegram.ui.Components.ac acVar2 = wmVar.C1;
            if (acVar == acVar2 && acVar2 != null) {
                acVar2.b();
                wmVar.C1 = null;
            }
            wmVar.f51316f9 = null;
            wmVar.f51354i9 = null;
            wmVar.f51342h9 = null;
            wmVar.C0.R = true;
            if (wmVar.f51329g9) {
                wmVar.v8(false, true, 0.0f);
            } else {
                wmVar.f51329g9 = true;
            }
            mj mjVar = wmVar.f51237a0;
            if (mjVar != null && mjVar.getEditField() != null) {
                wmVar.f51237a0.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
