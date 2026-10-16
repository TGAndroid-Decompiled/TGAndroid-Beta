package yh;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class z1 implements TextView.OnEditorActionListener {
    public final y1 f49231a;
    public final Utilities.Callback f49232b;
    public final org.telegram.ui.ActionBar.a2[] f49233c;
    public final View d;

    public z1(y1 y1Var, Utilities.Callback callback, org.telegram.ui.ActionBar.a2[] a2VarArr, View view) {
        this.f49231a = y1Var;
        this.f49232b = callback;
        this.f49233c = a2VarArr;
        this.d = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        y1 y1Var = this.f49231a;
        String obj = y1Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 12) {
            this.f49232b.run(obj);
            org.telegram.ui.ActionBar.a2 a2Var = this.f49233c[0];
            if (a2Var != null) {
                a2Var.dismiss();
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
