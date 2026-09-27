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
import org.telegram.ui.Components.sk0;
public final class b0 extends FrameLayout {
    public final Drawable f49282a;
    public final Rect f49283b;
    public final Paint f49284c;
    public final int[] d;
    public final HashMap e;
    public float f49285f;
    public float h;
    public float f49286n;
    public float f49287r;
    public float f49288s;
    public final Path v;
    public final c0 f49289w;

    public b0(c0 c0Var, Context context) {
        super(context);
        this.f49289w = c0Var;
        Rect rect = new Rect();
        this.f49283b = rect;
        Paint paint = new Paint(1);
        this.f49284c = paint;
        this.d = new int[4];
        this.e = new HashMap();
        this.f49285f = 0.0f;
        this.h = 0.0f;
        this.f49286n = 1.0f;
        this.f49287r = 0.0f;
        this.f49288s = 0.0f;
        this.v = new Path();
        Drawable mutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.f49282a = mutate;
        int dp = AndroidUtilities.dp(7.0f);
        rect.bottom = dp;
        rect.right = dp;
        rect.top = dp;
        rect.left = dp;
        int i10 = i6.Td;
        e6 e6Var = c0Var.f49314s;
        mutate.setColorFilter(new PorterDuffColorFilter(i6.v0(i10, e6Var), PorterDuff.Mode.MULTIPLY));
        if (c0Var.f49319y == 2) {
            paint.setColor(i0.a.d(0.13f, -16777216, -1));
        } else {
            paint.setColor(i6.v0(i6.G8, e6Var));
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r38) {
        throw new UnsupportedOperationException("Method not decompiled: zg.b0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        c0 c0Var = this.f49289w;
        sk0 sk0Var = c0Var.f49309n;
        if (c0Var.f49319y != 1 && (sk0Var == null || sk0Var.getDelegate() == null || !sk0Var.getDelegate().t())) {
            return;
        }
        c0Var.f49308m.f32581f0.invalidate();
    }

    @Override
    public final void onMeasure(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: zg.b0.onMeasure(int, int):void");
    }
}
