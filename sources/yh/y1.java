package yh;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class y1 implements TextView.OnEditorActionListener {
    public final x1 f51068a;
    public final Utilities.Callback f51069b;
    public final org.telegram.ui.ActionBar.c2[] f51070c;
    public final View d;

    public y1(x1 x1Var, Utilities.Callback callback, org.telegram.ui.ActionBar.c2[] c2VarArr, View view) {
        this.f51068a = x1Var;
        this.f51069b = callback;
        this.f51070c = c2VarArr;
        this.d = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        x1 x1Var = this.f51068a;
        String obj = x1Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 12) {
            this.f51069b.run(obj);
            org.telegram.ui.ActionBar.c2 c2Var = this.f51070c[0];
            if (c2Var != null) {
                c2Var.dismiss();
            }
            View view = this.d;
            if (view != null) {
                view.requestFocus();
            }
            return true;
        }
        AndroidUtilities.shakeView(x1Var);
        return true;
    }
}
