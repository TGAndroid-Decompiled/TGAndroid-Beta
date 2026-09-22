package vg;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import w7.y5;
public final class i extends c {
    public final j5 f44648r;
    public Object f44649s;

    public i(Context context, f6 f6Var) {
        super(context, f6Var);
        int i10;
        float f7;
        float f10;
        this.f44628c.setVisibility(8);
        j5 j5Var = this.e;
        int i11 = j6.B6;
        j5Var.setTextColor(j6.v0(i11, f6Var));
        j5 j5Var2 = new j5(context);
        this.f44648r = j5Var2;
        j5Var2.setTextSize(16);
        j5Var2.setTextColor(j6.v0(i11, f6Var));
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        j5Var2.setGravity(i10);
        addView(j5Var2);
        boolean z10 = LocaleController.isRTL;
        int i12 = (z10 ? 3 : 5) | 16;
        if (z10) {
            f7 = 20.0f;
        } else {
            f7 = 0.0f;
        }
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 20.0f;
        }
        j5Var2.setLayoutParams(y5.d(-1, -2.0f, i12, f7, 0.0f, f10, 0.0f));
    }

    @Override
    public final boolean b() {
        return true;
    }

    public Object getGifCode() {
        return this.f44649s;
    }
}
