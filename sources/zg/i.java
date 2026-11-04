package zg;

import android.content.Context;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
public final class i extends c {
    public final k5 f60500s;
    public Object f60501w;

    public i(Context context, e6 e6Var) {
        super(context, e6Var);
        int i3;
        float f10;
        float f11;
        this.f60474c.setVisibility(8);
        k5 k5Var = this.f60475e;
        int i10 = k6.B6;
        r6.Y(k5Var, i10, e6Var);
        k5 k5Var2 = new k5(context);
        this.f60500s = k5Var2;
        k5Var2.setTextSize(16);
        r6.Y(k5Var2, i10, e6Var);
        if (bd.f21784a0) {
            i3 = 3;
        } else {
            i3 = 5;
        }
        k5Var2.setGravity(i3);
        addView(k5Var2);
        boolean z10 = bd.f21784a0;
        int i11 = (z10 ? 3 : 5) | 16;
        if (z10) {
            f10 = 20.0f;
        } else {
            f10 = 0.0f;
        }
        if (z10) {
            f11 = 0.0f;
        } else {
            f11 = 20.0f;
        }
        k5Var2.setLayoutParams(mf.d(-1, -2.0f, i11, f10, 0.0f, f11, 0.0f));
    }

    @Override
    public final boolean b() {
        return true;
    }

    public Object getGifCode() {
        return this.f60501w;
    }
}
