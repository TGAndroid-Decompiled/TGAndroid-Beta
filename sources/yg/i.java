package yg;

import android.content.Context;
import c8.na;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
public final class i extends c {
    public final n5 f61368s;
    public Object f61369w;

    public i(Context context, i6 i6Var) {
        super(context, i6Var);
        int i7;
        float f10;
        float f11;
        this.f61342c.setVisibility(8);
        n5 n5Var = this.f61343e;
        int i10 = n6.B6;
        u6.X(n5Var, i10, i6Var);
        n5 n5Var2 = new n5(context);
        this.f61368s = n5Var2;
        n5Var2.setTextSize(16);
        u6.X(n5Var2, i10, i6Var);
        if (gd.f24314a0) {
            i7 = 3;
        } else {
            i7 = 5;
        }
        n5Var2.setGravity(i7);
        addView(n5Var2);
        boolean z10 = gd.f24314a0;
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
        n5Var2.setLayoutParams(na.d(-1, -2.0f, i11, f10, 0.0f, f11, 0.0f));
    }

    @Override
    public final boolean b() {
        return true;
    }

    public Object getGifCode() {
        return this.f61369w;
    }
}
