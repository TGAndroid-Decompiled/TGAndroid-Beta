package vg;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j5;
import w7.y5;
public final class i extends c {
    public final j5 f44656r;
    public Object f44657s;

    public i(Context context, e6 e6Var) {
        super(context, e6Var);
        int i10;
        float f7;
        float f10;
        this.f44636c.setVisibility(8);
        j5 j5Var = this.e;
        int i11 = i6.B6;
        j5Var.setTextColor(i6.v0(i11, e6Var));
        j5 j5Var2 = new j5(context);
        this.f44656r = j5Var2;
        j5Var2.setTextSize(16);
        j5Var2.setTextColor(i6.v0(i11, e6Var));
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
        return this.f44657s;
    }
}
