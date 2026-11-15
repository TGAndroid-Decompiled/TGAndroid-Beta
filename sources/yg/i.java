package yg;

import android.content.Context;
import c8.ja;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
public final class i extends c {
    public final j5 f60671s;
    public Object f60672w;

    public i(Context context, e6 e6Var) {
        super(context, e6Var);
        int i7;
        float f10;
        float f11;
        this.f60645c.setVisibility(8);
        j5 j5Var = this.f60646e;
        int i10 = j6.B6;
        q6.X(j5Var, i10, e6Var);
        j5 j5Var2 = new j5(context);
        this.f60671s = j5Var2;
        j5Var2.setTextSize(16);
        q6.X(j5Var2, i10, e6Var);
        if (hd.f24104a0) {
            i7 = 3;
        } else {
            i7 = 5;
        }
        j5Var2.setGravity(i7);
        addView(j5Var2);
        boolean z10 = hd.f24104a0;
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
        j5Var2.setLayoutParams(ja.d(-1, -2.0f, i11, f10, 0.0f, f11, 0.0f));
    }

    @Override
    public final boolean b() {
        return true;
    }

    public Object getGifCode() {
        return this.f60672w;
    }
}
