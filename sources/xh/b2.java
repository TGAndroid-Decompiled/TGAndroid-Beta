package xh;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class b2 implements TextView.OnEditorActionListener {
    public final a2 f46084a;
    public final Utilities.Callback f46085b;
    public final org.telegram.ui.ActionBar.a2[] f46086c;
    public final View d;

    public b2(a2 a2Var, Utilities.Callback callback, org.telegram.ui.ActionBar.a2[] a2VarArr, View view) {
        this.f46084a = a2Var;
        this.f46085b = callback;
        this.f46086c = a2VarArr;
        this.d = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        a2 a2Var = this.f46084a;
        String obj = a2Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 12) {
            this.f46085b.run(obj);
            org.telegram.ui.ActionBar.a2 a2Var2 = this.f46086c[0];
            if (a2Var2 != null) {
                a2Var2.dismiss();
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
