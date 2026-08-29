package sf;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.c2;
public final class k1 implements TextView.OnEditorActionListener {
    public final h1 f47835a;
    public final int f47836b;
    public final r1 f47837c;
    public final TextView d;
    public final eg.d1 f47838e;
    public final Utilities.Callback f47839f;
    public final c2[] f47840g;
    public final View h;

    public k1(h1 h1Var, int i10, r1 r1Var, TextView textView, eg.d1 d1Var, Utilities.Callback callback, c2[] c2VarArr, View view) {
        this.f47835a = h1Var;
        this.f47836b = i10;
        this.f47837c = r1Var;
        this.d = textView;
        this.f47838e = d1Var;
        this.f47839f = callback;
        this.f47840g = c2VarArr;
        this.h = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        int i11;
        if (i10 != 6) {
            return false;
        }
        h1 h1Var = this.f47835a;
        String obj = h1Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 32) {
            s1 f9 = s1.f(this.f47836b);
            r1 r1Var = this.f47837c;
            if (r1Var == null) {
                i11 = -1;
            } else {
                i11 = r1Var.f47935a;
            }
            r1 d = f9.d(obj);
            if (d != null && d.f47935a != i11) {
                AndroidUtilities.shakeView(h1Var);
                this.d.setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
                this.f47838e.run(Boolean.TRUE);
                return true;
            }
            this.f47839f.run(obj);
            c2[] c2VarArr = this.f47840g;
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
