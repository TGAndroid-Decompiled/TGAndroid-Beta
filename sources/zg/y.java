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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.sk0;
public final class y extends FrameLayout {
    public final Drawable f53541a;
    public final Rect f53542b;
    public final Paint f53543c;
    public final int[] d;
    public final HashMap f53544e;
    public float f53545f;
    public float h;
    public float f53546n;
    public float f53547r;
    public float f53548s;
    public final Path v;
    public final z f53549w;

    public y(z zVar, Context context) {
        super(context);
        this.f53549w = zVar;
        Rect rect = new Rect();
        this.f53542b = rect;
        Paint paint = new Paint(1);
        this.f53543c = paint;
        this.d = new int[4];
        this.f53544e = new HashMap();
        this.f53545f = 0.0f;
        this.h = 0.0f;
        this.f53546n = 1.0f;
        this.f53547r = 0.0f;
        this.f53548s = 0.0f;
        this.v = new Path();
        Drawable mutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.f53541a = mutate;
        int dp = AndroidUtilities.dp(7.0f);
        rect.bottom = dp;
        rect.right = dp;
        rect.top = dp;
        rect.left = dp;
        int i10 = i6.Td;
        d6 d6Var = zVar.f53566s;
        mutate.setColorFilter(new PorterDuffColorFilter(i6.v0(i10, d6Var), PorterDuff.Mode.MULTIPLY));
        if (zVar.f53571y == 2) {
            paint.setColor(i0.a.d(0.13f, -16777216, -1));
        } else {
            paint.setColor(i6.v0(i6.G8, d6Var));
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r38) {
        throw new UnsupportedOperationException("Method not decompiled: zg.y.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        z zVar = this.f53549w;
        sk0 sk0Var = zVar.f53561n;
        if (zVar.f53571y != 1 && (sk0Var == null || sk0Var.getDelegate() == null || !sk0Var.getDelegate().K())) {
            return;
        }
        zVar.f53560m.f34735f0.invalidate();
    }

    @Override
    public final void onMeasure(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: zg.y.onMeasure(int, int):void");
    }
}
