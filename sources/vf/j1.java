package vf;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.d2;
public final class j1 implements TextView.OnEditorActionListener {
    public final g1 f49070a;
    public final int f49071b;
    public final o1 f49072c;
    public final TextView d;
    public final hg.c1 f49073e;
    public final Utilities.Callback f49074f;
    public final d2[] f49075g;
    public final View h;

    public j1(g1 g1Var, int i10, o1 o1Var, TextView textView, hg.c1 c1Var, Utilities.Callback callback, d2[] d2VarArr, View view) {
        this.f49070a = g1Var;
        this.f49071b = i10;
        this.f49072c = o1Var;
        this.d = textView;
        this.f49073e = c1Var;
        this.f49074f = callback;
        this.f49075g = d2VarArr;
        this.h = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        int i11;
        if (i10 != 6) {
            return false;
        }
        g1 g1Var = this.f49070a;
        String obj = g1Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 32) {
            p1 f10 = p1.f(this.f49071b);
            o1 o1Var = this.f49072c;
            if (o1Var == null) {
                i11 = -1;
            } else {
                i11 = o1Var.f49160a;
            }
            o1 d = f10.d(obj);
            if (d != null && d.f49160a != i11) {
                AndroidUtilities.shakeView(g1Var);
                this.d.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
                this.f49073e.run(Boolean.TRUE);
                return true;
            }
            this.f49074f.run(obj);
            d2[] d2VarArr = this.f49075g;
            d2 d2Var = d2VarArr[0];
            if (d2Var != null) {
                d2Var.dismiss();
            }
            if (d2VarArr[0] == m1.h) {
                m1.h = null;
            }
            View view = this.h;
            if (view != null) {
                view.requestFocus();
            }
            return true;
        }
        AndroidUtilities.shakeView(g1Var);
        return true;
    }
}
