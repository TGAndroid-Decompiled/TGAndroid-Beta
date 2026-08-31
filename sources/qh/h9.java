package qh;

import android.app.Activity;
import android.app.Dialog;
public final class h9 extends org.telegram.ui.ActionBar.p2 {
    public final int f45386a;
    public final ca f45387b;

    public h9(ca caVar, int i10) {
        super(null);
        this.f45386a = i10;
        switch (i10) {
            case 1:
                this.f45387b = caVar;
                super(null);
                this.currentAccount = caVar.f45081c;
                return;
            default:
                this.f45387b = caVar;
                return;
        }
    }

    @Override
    public final Activity getParentActivity() {
        switch (this.f45386a) {
            case 0:
                return this.f45387b.f45077b;
            default:
                return this.f45387b.f45077b;
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.g6 getResourceProvider() {
        switch (this.f45386a) {
            case 0:
                return new oh.n2(8, this.f45387b.f45074a);
            default:
                return new oh.n2(9, this.f45387b.f45074a);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        switch (this.f45386a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean presentFragment(org.telegram.ui.ActionBar.p2 p2Var) {
        switch (this.f45386a) {
            case 0:
                this.f45387b.T();
                return false;
            default:
                return super.presentFragment(p2Var);
        }
    }

    @Override
    public Dialog showDialog(Dialog dialog) {
        switch (this.f45386a) {
            case 1:
                dialog.show();
                return dialog;
            default:
                return super.showDialog(dialog);
        }
    }
}
