package vg;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.i5;
import w7.x5;
public final class i extends c {
    public final i5 f44279r;
    public Object f44280s;

    public i(Context context, d6 d6Var) {
        super(context, d6Var);
        int i10;
        float f7;
        float f10;
        this.f44259c.setVisibility(8);
        i5 i5Var = this.e;
        int i11 = h6.B6;
        i5Var.setTextColor(h6.v0(i11, d6Var));
        i5 i5Var2 = new i5(context);
        this.f44279r = i5Var2;
        i5Var2.setTextSize(16);
        i5Var2.setTextColor(h6.v0(i11, d6Var));
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        i5Var2.setGravity(i10);
        addView(i5Var2);
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
        i5Var2.setLayoutParams(x5.d(-1, -2.0f, i12, f7, 0.0f, f10, 0.0f));
    }

    @Override
    public final boolean b() {
        return true;
    }

    public Object getGifCode() {
        return this.f44280s;
    }
}
