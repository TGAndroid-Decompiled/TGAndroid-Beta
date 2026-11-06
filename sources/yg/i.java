package yg;

import android.content.Context;
import c8.ha;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
public final class i extends c {
    public final k5 f59337s;
    public Object f59338w;

    public i(Context context, f6 f6Var) {
        super(context, f6Var);
        int i7;
        float f10;
        float f11;
        this.f59311c.setVisibility(8);
        k5 k5Var = this.f59312e;
        int i10 = k6.B6;
        r6.Y(k5Var, i10, f6Var);
        k5 k5Var2 = new k5(context);
        this.f59337s = k5Var2;
        k5Var2.setTextSize(16);
        r6.Y(k5Var2, i10, f6Var);
        if (hd.f22871a0) {
            i7 = 3;
        } else {
            i7 = 5;
        }
        k5Var2.setGravity(i7);
        addView(k5Var2);
        boolean z9 = hd.f22871a0;
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
        k5Var2.setLayoutParams(ha.d(-1, -2.0f, i11, f10, 0.0f, f11, 0.0f));
    }

    @Override
    public final boolean b() {
        return true;
    }

    public Object getGifCode() {
        return this.f59338w;
    }
}
