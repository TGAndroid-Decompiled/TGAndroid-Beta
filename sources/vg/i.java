package vg;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.h6;
import w7.x5;
public final class i extends c {
    public final h5 f49685s;
    public Object v;

    public i(Context context, d6 d6Var) {
        super(context, d6Var);
        int i10;
        float f7;
        float f10;
        this.f49663c.setVisibility(8);
        h5 h5Var = this.f49664e;
        int i11 = h6.B6;
        h5Var.setTextColor(h6.w0(i11, d6Var));
        h5 h5Var2 = new h5(context);
        this.f49685s = h5Var2;
        h5Var2.setTextSize(16);
        h5Var2.setTextColor(h6.w0(i11, d6Var));
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        h5Var2.setGravity(i10);
        addView(h5Var2);
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
        h5Var2.setLayoutParams(x5.a(-2.0f, f7, 0.0f, f10, 0.0f, -1, i12));
    }

    @Override
    public final boolean b() {
        return true;
    }

    public Object getGifCode() {
        return this.v;
    }
}
