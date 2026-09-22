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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.sk0;
public final class b0 extends FrameLayout {
    public final Drawable f49286a;
    public final Rect f49287b;
    public final Paint f49288c;
    public final int[] d;
    public final HashMap e;
    public float f49289f;
    public float h;
    public float f49290n;
    public float f49291r;
    public float f49292s;
    public final Path v;
    public final c0 f49293w;

    public b0(c0 c0Var, Context context) {
        super(context);
        this.f49293w = c0Var;
        Rect rect = new Rect();
        this.f49287b = rect;
        Paint paint = new Paint(1);
        this.f49288c = paint;
        this.d = new int[4];
        this.e = new HashMap();
        this.f49289f = 0.0f;
        this.h = 0.0f;
        this.f49290n = 1.0f;
        this.f49291r = 0.0f;
        this.f49292s = 0.0f;
        this.v = new Path();
        Drawable mutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.f49286a = mutate;
        int dp = AndroidUtilities.dp(7.0f);
        rect.bottom = dp;
        rect.right = dp;
        rect.top = dp;
        rect.left = dp;
        int i10 = j6.Td;
        f6 f6Var = c0Var.f49318s;
        mutate.setColorFilter(new PorterDuffColorFilter(j6.v0(i10, f6Var), PorterDuff.Mode.MULTIPLY));
        if (c0Var.f49323y == 2) {
            paint.setColor(i0.a.d(0.13f, -16777216, -1));
        } else {
            paint.setColor(j6.v0(j6.G8, f6Var));
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r38) {
        throw new UnsupportedOperationException("Method not decompiled: zg.b0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        c0 c0Var = this.f49293w;
        sk0 sk0Var = c0Var.f49313n;
        if (c0Var.f49323y != 1 && (sk0Var == null || sk0Var.getDelegate() == null || !sk0Var.getDelegate().q())) {
            return;
        }
        c0Var.f49312m.f34813f0.invalidate();
    }

    @Override
    public final void onMeasure(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: zg.b0.onMeasure(int, int):void");
    }
}
