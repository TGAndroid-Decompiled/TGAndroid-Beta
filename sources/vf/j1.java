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
    public final g1 f49106a;
    public final int f49107b;
    public final o1 f49108c;
    public final TextView d;
    public final hg.c1 f49109e;
    public final Utilities.Callback f49110f;
    public final d2[] f49111g;
    public final View h;

    public j1(g1 g1Var, int i10, o1 o1Var, TextView textView, hg.c1 c1Var, Utilities.Callback callback, d2[] d2VarArr, View view) {
        this.f49106a = g1Var;
        this.f49107b = i10;
        this.f49108c = o1Var;
        this.d = textView;
        this.f49109e = c1Var;
        this.f49110f = callback;
        this.f49111g = d2VarArr;
        this.h = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        int i11;
        if (i10 != 6) {
            return false;
        }
        g1 g1Var = this.f49106a;
        String obj = g1Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 32) {
            p1 f10 = p1.f(this.f49107b);
            o1 o1Var = this.f49108c;
            if (o1Var == null) {
                i11 = -1;
            } else {
                i11 = o1Var.f49196a;
            }
            o1 d = f10.d(obj);
            if (d != null && d.f49196a != i11) {
                AndroidUtilities.shakeView(g1Var);
                this.d.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
                this.f49109e.run(Boolean.TRUE);
                return true;
            }
            this.f49110f.run(obj);
            d2[] d2VarArr = this.f49111g;
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
