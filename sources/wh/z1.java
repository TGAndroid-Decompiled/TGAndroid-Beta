package wh;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class z1 implements TextView.OnEditorActionListener {
    public final y1 f44462a;
    public final Utilities.Callback f44463b;
    public final org.telegram.ui.ActionBar.d2[] f44464c;
    public final View d;

    public z1(y1 y1Var, Utilities.Callback callback, org.telegram.ui.ActionBar.d2[] d2VarArr, View view) {
        this.f44462a = y1Var;
        this.f44463b = callback;
        this.f44464c = d2VarArr;
        this.d = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        y1 y1Var = this.f44462a;
        String obj = y1Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 12) {
            this.f44463b.run(obj);
            org.telegram.ui.ActionBar.d2 d2Var = this.f44464c[0];
            if (d2Var != null) {
                d2Var.dismiss();
            }
            View view = this.d;
            if (view != null) {
                view.requestFocus();
            }
            return true;
        }
        AndroidUtilities.shakeView(y1Var);
        return true;
    }
}
