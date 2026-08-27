package qf;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.b2;

public final class k1 implements TextView.OnEditorActionListener {

    public final h1 f46332a;

    public final int f46333b;

    public final p1 f46334c;
    public final TextView d;

    public final cg.e1 f46335e;

    public final Utilities.Callback f46336f;

    public final b2[] f46337g;
    public final View h;

    public k1(h1 h1Var, int i10, p1 p1Var, TextView textView, cg.e1 e1Var, Utilities.Callback callback, b2[] b2VarArr, View view) {
        this.f46332a = h1Var;
        this.f46333b = i10;
        this.f46334c = p1Var;
        this.d = textView;
        this.f46335e = e1Var;
        this.f46336f = callback;
        this.f46337g = b2VarArr;
        this.h = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        if (i10 != 6) {
            return false;
        }
        h1 h1Var = this.f46332a;
        String string = h1Var.getText().toString();
        if (string.length() <= 0 || string.length() > 32) {
            AndroidUtilities.shakeView(h1Var);
            return true;
        }
        q1 q1VarF = q1.f(this.f46333b);
        p1 p1Var = this.f46334c;
        int i11 = p1Var == null ? -1 : p1Var.f46418a;
        p1 p1VarD = q1VarF.d(string);
        if (p1VarD != null && p1VarD.f46418a != i11) {
            AndroidUtilities.shakeView(h1Var);
            this.d.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
            this.f46335e.run(Boolean.TRUE);
            return true;
        }
        this.f46336f.run(string);
        b2[] b2VarArr = this.f46337g;
        b2 b2Var = b2VarArr[0];
        if (b2Var != null) {
            b2Var.dismiss();
        }
        if (b2VarArr[0] == n1.h) {
            n1.h = null;
        }
        View view = this.h;
        if (view != null) {
            view.requestFocus();
        }
        return true;
    }
}
