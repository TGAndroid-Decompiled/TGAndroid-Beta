package zh;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class z1 implements TextView.OnEditorActionListener {
    public final y1 f53361a;
    public final Utilities.Callback f53362b;
    public final org.telegram.ui.ActionBar.e2[] f53363c;
    public final View d;

    public z1(y1 y1Var, Utilities.Callback callback, org.telegram.ui.ActionBar.e2[] e2VarArr, View view) {
        this.f53361a = y1Var;
        this.f53362b = callback;
        this.f53363c = e2VarArr;
        this.d = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        y1 y1Var = this.f53361a;
        String obj = y1Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 12) {
            this.f53362b.run(obj);
            org.telegram.ui.ActionBar.e2 e2Var = this.f53363c[0];
            if (e2Var != null) {
                e2Var.dismiss();
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
