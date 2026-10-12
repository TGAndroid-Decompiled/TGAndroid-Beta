package xh;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class a2 implements TextView.OnEditorActionListener {
    public final z1 f51400a;
    public final Utilities.Callback f51401b;
    public final org.telegram.ui.ActionBar.a2[] f51402c;
    public final View d;

    public a2(z1 z1Var, Utilities.Callback callback, org.telegram.ui.ActionBar.a2[] a2VarArr, View view) {
        this.f51400a = z1Var;
        this.f51401b = callback;
        this.f51402c = a2VarArr;
        this.d = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        z1 z1Var = this.f51400a;
        String obj = z1Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 12) {
            this.f51401b.run(obj);
            org.telegram.ui.ActionBar.a2 a2Var = this.f51402c[0];
            if (a2Var != null) {
                a2Var.dismiss();
            }
            View view = this.d;
            if (view != null) {
                view.requestFocus();
            }
            return true;
        }
        AndroidUtilities.shakeView(z1Var);
        return true;
    }
}
