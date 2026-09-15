package xh;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class a2 implements TextView.OnEditorActionListener {
    public final z1 f45793a;
    public final Utilities.Callback f45794b;
    public final org.telegram.ui.ActionBar.b2[] f45795c;
    public final View d;

    public a2(z1 z1Var, Utilities.Callback callback, org.telegram.ui.ActionBar.b2[] b2VarArr, View view) {
        this.f45793a = z1Var;
        this.f45794b = callback;
        this.f45795c = b2VarArr;
        this.d = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        z1 z1Var = this.f45793a;
        String obj = z1Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 12) {
            this.f45794b.run(obj);
            org.telegram.ui.ActionBar.b2 b2Var = this.f45795c[0];
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
