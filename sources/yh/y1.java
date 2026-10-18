package yh;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class y1 implements TextView.OnEditorActionListener {
    public final x1 f50600a;
    public final Utilities.Callback f50601b;
    public final org.telegram.ui.ActionBar.b2[] f50602c;
    public final View d;

    public y1(x1 x1Var, Utilities.Callback callback, org.telegram.ui.ActionBar.b2[] b2VarArr, View view) {
        this.f50600a = x1Var;
        this.f50601b = callback;
        this.f50602c = b2VarArr;
        this.d = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        x1 x1Var = this.f50600a;
        String obj = x1Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 12) {
            this.f50601b.run(obj);
            org.telegram.ui.ActionBar.b2 b2Var = this.f50602c[0];
            if (b2Var != null) {
                b2Var.dismiss();
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
