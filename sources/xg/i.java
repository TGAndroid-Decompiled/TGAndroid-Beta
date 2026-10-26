package xg;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
public final class i extends c {
    public final b6 f51787s;
    public Object v;

    public i(Context context, u6 u6Var) {
        super(context, u6Var);
        int i10;
        float f7;
        float f10;
        this.f51763c.setVisibility(8);
        b6 b6Var = this.e;
        int i11 = y6.B6;
        f7.Y(b6Var, i11, u6Var);
        b6 b6Var2 = new b6(context);
        this.f51787s = b6Var2;
        b6Var2.setTextSize(16);
        f7.Y(b6Var2, i11, u6Var);
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        b6Var2.setGravity(i10);
        addView(b6Var2);
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
        b6Var2.setLayoutParams(gb1.h(-1, -2.0f, i12, f7, 0.0f, f10, 0.0f));
    }

    @Override
    public final boolean b() {
        return true;
    }

    public Object getGifCode() {
        return this.v;
    }
}
