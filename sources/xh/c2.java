package xh;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class c2 implements TextView.OnEditorActionListener {
    public final b2 f46163a;
    public final Utilities.Callback f46164b;
    public final org.telegram.ui.ActionBar.c2[] f46165c;
    public final View d;

    public c2(b2 b2Var, Utilities.Callback callback, org.telegram.ui.ActionBar.c2[] c2VarArr, View view) {
        this.f46163a = b2Var;
        this.f46164b = callback;
        this.f46165c = c2VarArr;
        this.d = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        b2 b2Var = this.f46163a;
        String obj = b2Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 12) {
            this.f46164b.run(obj);
            org.telegram.ui.ActionBar.c2 c2Var = this.f46165c[0];
            if (c2Var != null) {
                c2Var.dismiss();
            }
            View view = this.d;
            if (view != null) {
                view.requestFocus();
            }
            return true;
        }
        AndroidUtilities.shakeView(b2Var);
        return true;
    }
}
