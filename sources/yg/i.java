package yg;

import android.content.Context;
import c8.ha;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
public final class i extends c {
    public final m5 f59467s;
    public Object f59468w;

    public i(Context context, h6 h6Var) {
        super(context, h6Var);
        int i7;
        float f10;
        float f11;
        this.f59441c.setVisibility(8);
        m5 m5Var = this.f59442e;
        int i10 = m6.B6;
        t6.X(m5Var, i10, h6Var);
        m5 m5Var2 = new m5(context);
        this.f59467s = m5Var2;
        m5Var2.setTextSize(16);
        t6.X(m5Var2, i10, h6Var);
        if (id.f23161a0) {
            i7 = 3;
        } else {
            i7 = 5;
        }
        m5Var2.setGravity(i7);
        addView(m5Var2);
        boolean z9 = id.f23161a0;
        int i11 = (z9 ? 3 : 5) | 16;
        if (z9) {
            f10 = 20.0f;
        } else {
            f10 = 0.0f;
        }
        if (z9) {
            f11 = 0.0f;
        } else {
            f11 = 20.0f;
        }
        m5Var2.setLayoutParams(ha.d(-1, -2.0f, i11, f10, 0.0f, f11, 0.0f));
    }

    @Override
    public final boolean b() {
        return true;
    }

    public Object getGifCode() {
        return this.f59468w;
    }
}
