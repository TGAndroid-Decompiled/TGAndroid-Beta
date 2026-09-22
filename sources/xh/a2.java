package xh;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class a2 implements TextView.OnEditorActionListener {
    public final z1 f45789a;
    public final Utilities.Callback f45790b;
    public final org.telegram.ui.ActionBar.b2[] f45791c;
    public final View d;

    public a2(z1 z1Var, Utilities.Callback callback, org.telegram.ui.ActionBar.b2[] b2VarArr, View view) {
        this.f45789a = z1Var;
        this.f45790b = callback;
        this.f45791c = b2VarArr;
        this.d = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        z1 z1Var = this.f45789a;
        String obj = z1Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 12) {
            this.f45790b.run(obj);
            org.telegram.ui.ActionBar.b2 b2Var = this.f45791c[0];
            if (b2Var != null) {
                b2Var.dismiss();
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
