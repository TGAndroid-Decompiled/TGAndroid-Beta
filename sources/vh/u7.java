package vh;

import android.app.Activity;
import android.app.Dialog;
public final class u7 extends org.telegram.ui.ActionBar.k2 {
    public final int f52021a;
    public final o8 f52022b;

    public u7(o8 o8Var, int i10) {
        super(null);
        this.f52021a = i10;
        switch (i10) {
            case 1:
                this.f52022b = o8Var;
                super(null);
                this.currentAccount = o8Var.f51611c;
                return;
            default:
                this.f52022b = o8Var;
                return;
        }
    }

    @Override
    public final Activity getParentActivity() {
        switch (this.f52021a) {
            case 0:
                return this.f52022b.f51607b;
            default:
                return this.f52022b.f51607b;
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.p6 getResourceProvider() {
        switch (this.f52021a) {
            case 0:
                return new org.telegram.ui.web.a0(8, this.f52022b.f51604a);
            default:
                return new org.telegram.ui.web.a0(9, this.f52022b.f51604a);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        switch (this.f52021a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean presentFragment(org.telegram.ui.ActionBar.k2 k2Var) {
        switch (this.f52021a) {
            case 0:
                this.f52022b.S();
                return false;
            default:
                return super.presentFragment(k2Var);
        }
    }

    @Override
    public Dialog showDialog(Dialog dialog) {
        switch (this.f52021a) {
            case 1:
                dialog.show();
                return dialog;
            default:
                return super.showDialog(dialog);
        }
    }
}
