package qh;

import android.app.Activity;
import android.app.Dialog;
public final class g9 extends org.telegram.ui.ActionBar.p2 {
    public final int f45367a;
    public final ba f45368b;

    public g9(ba baVar, int i10) {
        super(null);
        this.f45367a = i10;
        switch (i10) {
            case 1:
                this.f45368b = baVar;
                super(null);
                this.currentAccount = baVar.f45047c;
                return;
            default:
                this.f45368b = baVar;
                return;
        }
    }

    @Override
    public final Activity getParentActivity() {
        switch (this.f45367a) {
            case 0:
                return this.f45368b.f45043b;
            default:
                return this.f45368b.f45043b;
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.g6 getResourceProvider() {
        switch (this.f45367a) {
            case 0:
                return new oh.n2(8, this.f45368b.f45040a);
            default:
                return new oh.n2(9, this.f45368b.f45040a);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        switch (this.f45367a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean presentFragment(org.telegram.ui.ActionBar.p2 p2Var) {
        switch (this.f45367a) {
            case 0:
                this.f45368b.T();
                return false;
            default:
                return super.presentFragment(p2Var);
        }
    }

    @Override
    public Dialog showDialog(Dialog dialog) {
        switch (this.f45367a) {
            case 1:
                dialog.show();
                return dialog;
            default:
                return super.showDialog(dialog);
        }
    }
}
