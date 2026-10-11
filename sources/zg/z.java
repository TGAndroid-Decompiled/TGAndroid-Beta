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
import org.telegram.ui.Components.ll0;
public final class z extends FrameLayout {
    public final Drawable f54806a;
    public final Rect f54807b;
    public final Paint f54808c;
    public final int[] d;
    public final HashMap f54809e;
    public float f54810f;
    public float h;
    public float f54811n;
    public float f54812r;
    public float f54813s;
    public final Path v;
    public final a0 f54814w;

    public z(a0 a0Var, Context context) {
        super(context);
        this.f54814w = a0Var;
        Rect rect = new Rect();
        this.f54807b = rect;
        Paint paint = new Paint(1);
        this.f54808c = paint;
        this.d = new int[4];
        this.f54809e = new HashMap();
        this.f54810f = 0.0f;
        this.h = 0.0f;
        this.f54811n = 1.0f;
        this.f54812r = 0.0f;
        this.f54813s = 0.0f;
        this.v = new Path();
        Drawable mutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.f54806a = mutate;
        int dp = AndroidUtilities.dp(7.0f);
        rect.bottom = dp;
        rect.right = dp;
        rect.top = dp;
        rect.left = dp;
        int i10 = h6.Td;
        d6 d6Var = a0Var.f54586s;
        mutate.setColorFilter(new PorterDuffColorFilter(h6.w0(i10, d6Var), PorterDuff.Mode.MULTIPLY));
        if (a0Var.f54591y == 2) {
            paint.setColor(i0.a.d(0.13f, -16777216, -1));
        } else {
            paint.setColor(h6.w0(h6.G8, d6Var));
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r38) {
        throw new UnsupportedOperationException("Method not decompiled: zg.z.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        a0 a0Var = this.f54814w;
        ll0 ll0Var = a0Var.f54581n;
        if (a0Var.f54591y != 1 && (ll0Var == null || ll0Var.getDelegate() == null || !ll0Var.getDelegate().v())) {
            return;
        }
        a0Var.f54580m.f38924f0.invalidate();
    }

    @Override
    public final void onMeasure(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: zg.z.onMeasure(int, int):void");
    }
}
