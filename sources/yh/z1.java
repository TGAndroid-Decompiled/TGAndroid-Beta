package yh;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class z1 implements TextView.OnEditorActionListener {
    public final y1 f50665a;
    public final Utilities.Callback f50666b;
    public final org.telegram.ui.ActionBar.b2[] f50667c;
    public final View d;

    public z1(y1 y1Var, Utilities.Callback callback, org.telegram.ui.ActionBar.b2[] b2VarArr, View view) {
        this.f50665a = y1Var;
        this.f50666b = callback;
        this.f50667c = b2VarArr;
        this.d = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        y1 y1Var = this.f50665a;
        String obj = y1Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 12) {
            this.f50666b.run(obj);
            org.telegram.ui.ActionBar.b2 b2Var = this.f50667c[0];
            if (b2Var != null) {
                b2Var.dismiss();
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
