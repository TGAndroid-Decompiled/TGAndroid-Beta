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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.kl0;
public final class z extends FrameLayout {
    public final Drawable f54683a;
    public final Rect f54684b;
    public final Paint f54685c;
    public final int[] d;
    public final HashMap f54686e;
    public float f54687f;
    public float h;
    public float f54688n;
    public float f54689r;
    public float f54690s;
    public final Path v;
    public final a0 f54691w;

    public z(a0 a0Var, Context context) {
        super(context);
        this.f54691w = a0Var;
        Rect rect = new Rect();
        this.f54684b = rect;
        Paint paint = new Paint(1);
        this.f54685c = paint;
        this.d = new int[4];
        this.f54686e = new HashMap();
        this.f54687f = 0.0f;
        this.h = 0.0f;
        this.f54688n = 1.0f;
        this.f54689r = 0.0f;
        this.f54690s = 0.0f;
        this.v = new Path();
        Drawable mutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.f54683a = mutate;
        int dp = AndroidUtilities.dp(7.0f);
        rect.bottom = dp;
        rect.right = dp;
        rect.top = dp;
        rect.left = dp;
        int i10 = i6.Td;
        e6 e6Var = a0Var.f54463s;
        mutate.setColorFilter(new PorterDuffColorFilter(i6.w0(i10, e6Var), PorterDuff.Mode.MULTIPLY));
        if (a0Var.f54468y == 2) {
            paint.setColor(i0.a.d(0.13f, -16777216, -1));
        } else {
            paint.setColor(i6.w0(i6.G8, e6Var));
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r38) {
        throw new UnsupportedOperationException("Method not decompiled: zg.z.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        a0 a0Var = this.f54691w;
        kl0 kl0Var = a0Var.f54458n;
        if (a0Var.f54468y != 1 && (kl0Var == null || kl0Var.getDelegate() == null || !kl0Var.getDelegate().v())) {
            return;
        }
        a0Var.f54457m.f39126f0.invalidate();
    }

    @Override
    public final void onMeasure(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: zg.z.onMeasure(int, int):void");
    }
}
