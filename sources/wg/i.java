package wg;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.r6;
import w7.z5;
public final class i extends c {
    public final n5 f49424s;
    public Object v;

    public i(Context context, g6 g6Var) {
        super(context, g6Var);
        int i10;
        float f7;
        float f10;
        this.f49400c.setVisibility(8);
        n5 n5Var = this.e;
        int i11 = k6.B6;
        r6.Z(n5Var, i11, g6Var);
        n5 n5Var2 = new n5(context);
        this.f49424s = n5Var2;
        n5Var2.setTextSize(16);
        r6.Z(n5Var2, i11, g6Var);
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        n5Var2.setGravity(i10);
        addView(n5Var2);
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
        n5Var2.setLayoutParams(z5.d(-1, -2.0f, i12, f7, 0.0f, f10, 0.0f));
    }

    @Override
    public final boolean b() {
        return true;
    }

    public Object getGifCode() {
        return this.v;
    }
}
