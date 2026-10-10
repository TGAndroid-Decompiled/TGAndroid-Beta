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
import org.telegram.ui.Components.ll0;
public final class z extends FrameLayout {
    public final Drawable f54729a;
    public final Rect f54730b;
    public final Paint f54731c;
    public final int[] d;
    public final HashMap f54732e;
    public float f54733f;
    public float h;
    public float f54734n;
    public float f54735r;
    public float f54736s;
    public final Path v;
    public final a0 f54737w;

    public z(a0 a0Var, Context context) {
        super(context);
        this.f54737w = a0Var;
        Rect rect = new Rect();
        this.f54730b = rect;
        Paint paint = new Paint(1);
        this.f54731c = paint;
        this.d = new int[4];
        this.f54732e = new HashMap();
        this.f54733f = 0.0f;
        this.h = 0.0f;
        this.f54734n = 1.0f;
        this.f54735r = 0.0f;
        this.f54736s = 0.0f;
        this.v = new Path();
        Drawable mutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.f54729a = mutate;
        int dp = AndroidUtilities.dp(7.0f);
        rect.bottom = dp;
        rect.right = dp;
        rect.top = dp;
        rect.left = dp;
        int i10 = i6.Td;
        e6 e6Var = a0Var.f54509s;
        mutate.setColorFilter(new PorterDuffColorFilter(i6.w0(i10, e6Var), PorterDuff.Mode.MULTIPLY));
        if (a0Var.f54514y == 2) {
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
        a0 a0Var = this.f54737w;
        ll0 ll0Var = a0Var.f54504n;
        if (a0Var.f54514y != 1 && (ll0Var == null || ll0Var.getDelegate() == null || !ll0Var.getDelegate().v())) {
            return;
        }
        a0Var.f54503m.f39172f0.invalidate();
    }

    @Override
    public final void onMeasure(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: zg.z.onMeasure(int, int):void");
    }
}
