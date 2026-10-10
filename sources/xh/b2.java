package xh;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class b2 implements TextView.OnEditorActionListener {
    public final a2 f51224a;
    public final Utilities.Callback f51225b;
    public final org.telegram.ui.ActionBar.b2[] f51226c;
    public final View d;

    public b2(a2 a2Var, Utilities.Callback callback, org.telegram.ui.ActionBar.b2[] b2VarArr, View view) {
        this.f51224a = a2Var;
        this.f51225b = callback;
        this.f51226c = b2VarArr;
        this.d = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        a2 a2Var = this.f51224a;
        String obj = a2Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 12) {
            this.f51225b.run(obj);
            org.telegram.ui.ActionBar.b2 b2Var = this.f51226c[0];
            if (b2Var != null) {
                b2Var.dismiss();
            }
            View view = this.d;
            if (view != null) {
                view.requestFocus();
            }
            return true;
        }
        AndroidUtilities.shakeView(a2Var);
        return true;
    }
}
