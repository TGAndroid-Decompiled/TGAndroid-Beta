package xh;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class b2 implements TextView.OnEditorActionListener {
    public final a2 f51180a;
    public final Utilities.Callback f51181b;
    public final org.telegram.ui.ActionBar.b2[] f51182c;
    public final View d;

    public b2(a2 a2Var, Utilities.Callback callback, org.telegram.ui.ActionBar.b2[] b2VarArr, View view) {
        this.f51180a = a2Var;
        this.f51181b = callback;
        this.f51182c = b2VarArr;
        this.d = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        a2 a2Var = this.f51180a;
        String obj = a2Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 12) {
            this.f51181b.run(obj);
            org.telegram.ui.ActionBar.b2 b2Var = this.f51182c[0];
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
