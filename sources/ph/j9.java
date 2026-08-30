package ph;

import android.app.Activity;
import android.app.Dialog;
public final class j9 extends org.telegram.ui.ActionBar.p2 {
    public final int f41790a;
    public final da f41791b;

    public j9(da daVar, int i10) {
        super(null);
        this.f41790a = i10;
        switch (i10) {
            case 1:
                this.f41791b = daVar;
                super(null);
                this.currentAccount = daVar.f41479c;
                return;
            default:
                this.f41791b = daVar;
                return;
        }
    }

    @Override
    public final Activity getParentActivity() {
        switch (this.f41790a) {
            case 0:
                return this.f41791b.f41475b;
            default:
                return this.f41791b.f41475b;
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        switch (this.f41790a) {
            case 0:
                return new nh.m2(8, this.f41791b.f41472a);
            default:
                return new nh.m2(9, this.f41791b.f41472a);
        }
    }

    @Override
    public final boolean isLightStatusBar() {
        switch (this.f41790a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean presentFragment(org.telegram.ui.ActionBar.p2 p2Var) {
        switch (this.f41790a) {
            case 0:
                this.f41791b.T();
                return false;
            default:
                return super.presentFragment(p2Var);
        }
    }

    @Override
    public Dialog showDialog(Dialog dialog) {
        switch (this.f41790a) {
            case 1:
                dialog.show();
                return dialog;
            default:
                return super.showDialog(dialog);
        }
    }
}
