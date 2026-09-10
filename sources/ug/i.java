package ug;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.l5;
import w7.a6;
public final class i extends c {
    public final l5 f42697r;
    public Object f42698s;

    public i(Context context, f6 f6Var) {
        super(context, f6Var);
        int i10;
        float f7;
        float f10;
        this.f42677c.setVisibility(8);
        l5 l5Var = this.e;
        int i11 = j6.B6;
        l5Var.setTextColor(j6.v0(i11, f6Var));
        l5 l5Var2 = new l5(context);
        this.f42697r = l5Var2;
        l5Var2.setTextSize(16);
        l5Var2.setTextColor(j6.v0(i11, f6Var));
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        l5Var2.setGravity(i10);
        addView(l5Var2);
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
        l5Var2.setLayoutParams(a6.d(-1, -2.0f, i12, f7, 0.0f, f10, 0.0f));
    }

    @Override
    public final boolean b() {
        return true;
    }

    public Object getGifCode() {
        return this.f42698s;
    }
}
