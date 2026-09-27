package org.telegram.ui;

import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class vl0 implements View.OnTouchListener {
    public final int f38635a;
    public final jn0 f38636b;

    public vl0(jn0 jn0Var, int i10) {
        this.f38635a = i10;
        this.f38636b = jn0Var;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = this.f38635a;
        jn0 jn0Var = this.f38636b;
        switch (i10) {
            case 0:
                if (jn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    yt ytVar = new yt(null, false);
                    ytVar.f40321r = new jy(24, jn0Var, view);
                    jn0Var.presentFragment(ytVar);
                }
                return true;
            case 1:
                if (jn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(jn0Var.getParentActivity());
                    String string = LocaleController.getString(R.string.PassportSelectGender);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18655a;
                    c2Var.R = string;
                    alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.PassportMale), LocaleController.getString(R.string.PassportFemale)}, new uv(jn0Var, 2));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Cancel), null);
                    jn0Var.showDialog(c2Var);
                }
                return true;
            case 2:
                if (jn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    yt ytVar2 = new yt(null, false);
                    ytVar2.f40321r = new wl0(jn0Var, 2);
                    jn0Var.presentFragment(ytVar2);
                }
                return true;
            default:
                if (jn0Var.getParentActivity() == null) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    yt ytVar3 = new yt(null, false);
                    ytVar3.f40321r = new wl0(jn0Var, 3);
                    jn0Var.presentFragment(ytVar3);
                }
                return true;
        }
    }
}
