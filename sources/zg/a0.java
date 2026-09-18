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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.qk0;
public final class a0 extends FrameLayout {
    public final Drawable f49214a;
    public final Rect f49215b;
    public final Paint f49216c;
    public final int[] d;
    public final HashMap e;
    public float f49217f;
    public float h;
    public float f49218n;
    public float f49219r;
    public float f49220s;
    public final Path v;
    public final b0 f49221w;

    public a0(b0 b0Var, Context context) {
        super(context);
        this.f49221w = b0Var;
        Rect rect = new Rect();
        this.f49215b = rect;
        Paint paint = new Paint(1);
        this.f49216c = paint;
        this.d = new int[4];
        this.e = new HashMap();
        this.f49217f = 0.0f;
        this.h = 0.0f;
        this.f49218n = 1.0f;
        this.f49219r = 0.0f;
        this.f49220s = 0.0f;
        this.v = new Path();
        Drawable mutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.f49214a = mutate;
        int dp = AndroidUtilities.dp(7.0f);
        rect.bottom = dp;
        rect.right = dp;
        rect.top = dp;
        rect.left = dp;
        int i10 = j6.Td;
        e6 e6Var = b0Var.f49241s;
        mutate.setColorFilter(new PorterDuffColorFilter(j6.v0(i10, e6Var), PorterDuff.Mode.MULTIPLY));
        if (b0Var.f49246y == 2) {
            paint.setColor(i0.a.d(0.13f, -16777216, -1));
        } else {
            paint.setColor(j6.v0(j6.G8, e6Var));
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r38) {
        throw new UnsupportedOperationException("Method not decompiled: zg.a0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        b0 b0Var = this.f49221w;
        qk0 qk0Var = b0Var.f49236n;
        if (b0Var.f49246y != 1 && (qk0Var == null || qk0Var.getDelegate() == null || !qk0Var.getDelegate().r())) {
            return;
        }
        b0Var.f49235m.f33724f0.invalidate();
    }

    @Override
    public final void onMeasure(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: zg.a0.onMeasure(int, int):void");
    }
}
