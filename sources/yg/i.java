package yg;

import android.content.Context;
import c8.ha;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
public final class i extends c {
    public final l5 f59469s;
    public Object f59470w;

    public i(Context context, g6 g6Var) {
        super(context, g6Var);
        int i7;
        float f10;
        float f11;
        this.f59443c.setVisibility(8);
        l5 l5Var = this.f59444e;
        int i10 = l6.B6;
        s6.X(l5Var, i10, g6Var);
        l5 l5Var2 = new l5(context);
        this.f59469s = l5Var2;
        l5Var2.setTextSize(16);
        s6.X(l5Var2, i10, g6Var);
        if (id.f23157a0) {
            i7 = 3;
        } else {
            i7 = 5;
        }
        l5Var2.setGravity(i7);
        addView(l5Var2);
        boolean z9 = id.f23157a0;
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
        l5Var2.setLayoutParams(ha.d(-1, -2.0f, i11, f10, 0.0f, f11, 0.0f));
    }

    @Override
    public final boolean b() {
        return true;
    }

    public Object getGifCode() {
        return this.f59470w;
    }
}
