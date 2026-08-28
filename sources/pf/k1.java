package pf;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.c2;
public final class k1 implements TextView.OnEditorActionListener {
    public final h1 f45661a;
    public final int f45662b;
    public final q1 f45663c;
    public final TextView d;
    public final bg.j1 f45664e;
    public final Utilities.Callback f45665f;
    public final c2[] f45666g;
    public final View h;

    public k1(h1 h1Var, int i9, q1 q1Var, TextView textView, bg.j1 j1Var, Utilities.Callback callback, c2[] c2VarArr, View view) {
        this.f45661a = h1Var;
        this.f45662b = i9;
        this.f45663c = q1Var;
        this.d = textView;
        this.f45664e = j1Var;
        this.f45665f = callback;
        this.f45666g = c2VarArr;
        this.h = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i9, KeyEvent keyEvent) {
        int i10;
        if (i9 != 6) {
            return false;
        }
        h1 h1Var = this.f45661a;
        String obj = h1Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 32) {
            r1 f10 = r1.f(this.f45662b);
            q1 q1Var = this.f45663c;
            if (q1Var == null) {
                i10 = -1;
            } else {
                i10 = q1Var.f45756a;
            }
            q1 d = f10.d(obj);
            if (d != null && d.f45756a != i10) {
                AndroidUtilities.shakeView(h1Var);
                this.d.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
                this.f45664e.run(Boolean.TRUE);
                return true;
            }
            this.f45665f.run(obj);
            c2[] c2VarArr = this.f45666g;
            c2 c2Var = c2VarArr[0];
            if (c2Var != null) {
                c2Var.dismiss();
            }
            if (c2VarArr[0] == n1.h) {
                n1.h = null;
            }
            View view = this.h;
            if (view != null) {
                view.requestFocus();
            }
            return true;
        }
        AndroidUtilities.shakeView(h1Var);
        return true;
    }
}
