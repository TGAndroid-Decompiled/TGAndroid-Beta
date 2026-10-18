package wg;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.j5;
import w7.z5;
public final class i extends c {
    public final j5 f49020s;
    public Object v;

    public i(Context context, d6 d6Var) {
        super(context, d6Var);
        int i10;
        float f7;
        float f10;
        this.f49000c.setVisibility(8);
        j5 j5Var = this.e;
        int i11 = h6.B6;
        j5Var.setTextColor(h6.w0(i11, d6Var));
        j5 j5Var2 = new j5(context);
        this.f49020s = j5Var2;
        j5Var2.setTextSize(16);
        j5Var2.setTextColor(h6.w0(i11, d6Var));
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
        j5Var2.setLayoutParams(z5.a(-2.0f, f7, 0.0f, f10, 0.0f, -1, i12));
    }

    @Override
    public final boolean b() {
        return true;
    }

    public Object getGifCode() {
        return this.v;
    }
}
