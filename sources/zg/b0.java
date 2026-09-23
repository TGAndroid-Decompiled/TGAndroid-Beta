package zg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.gk0;
public final class b0 extends FrameLayout {
    public final Drawable f48910a;
    public final Rect f48911b;
    public final Paint f48912c;
    public final int[] d;
    public final HashMap e;
    public float f48913f;
    public float h;
    public float f48914n;
    public float f48915r;
    public float f48916s;
    public final Path v;
    public final c0 f48917w;

    public b0(c0 c0Var, Context context) {
        super(context);
        this.f48917w = c0Var;
        Rect rect = new Rect();
        this.f48911b = rect;
        Paint paint = new Paint(1);
        this.f48912c = paint;
        this.d = new int[4];
        this.e = new HashMap();
        this.f48913f = 0.0f;
        this.h = 0.0f;
        this.f48914n = 1.0f;
        this.f48915r = 0.0f;
        this.f48916s = 0.0f;
        this.v = new Path();
        Drawable mutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.f48910a = mutate;
        int dp = AndroidUtilities.dp(7.0f);
        rect.bottom = dp;
        rect.right = dp;
        rect.top = dp;
        rect.left = dp;
        int i10 = h6.Td;
        d6 d6Var = c0Var.f48942s;
        mutate.setColorFilter(new PorterDuffColorFilter(h6.v0(i10, d6Var), PorterDuff.Mode.MULTIPLY));
        if (c0Var.f48947y == 2) {
            paint.setColor(i0.a.d(0.13f, -16777216, -1));
        } else {
            paint.setColor(h6.v0(h6.G8, d6Var));
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r38) {
        throw new UnsupportedOperationException("Method not decompiled: zg.b0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        c0 c0Var = this.f48917w;
        gk0 gk0Var = c0Var.f48937n;
        if (c0Var.f48947y != 1 && (gk0Var == null || gk0Var.getDelegate() == null || !gk0Var.getDelegate().q())) {
            return;
        }
        c0Var.f48936m.f40017f0.invalidate();
    }

    @Override
    public final void onMeasure(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: zg.b0.onMeasure(int, int):void");
    }
}
