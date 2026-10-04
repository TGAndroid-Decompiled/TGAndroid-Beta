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
public final class a0 extends FrameLayout {
    public final Drawable f53303a;
    public final Rect f53304b;
    public final Paint f53305c;
    public final int[] d;
    public final HashMap f53306e;
    public float f53307f;
    public float h;
    public float f53308n;
    public float f53309r;
    public float f53310s;
    public final Path v;
    public final b0 f53311w;

    public a0(b0 b0Var, Context context) {
        super(context);
        this.f53311w = b0Var;
        Rect rect = new Rect();
        this.f53304b = rect;
        Paint paint = new Paint(1);
        this.f53305c = paint;
        this.d = new int[4];
        this.f53306e = new HashMap();
        this.f53307f = 0.0f;
        this.h = 0.0f;
        this.f53308n = 1.0f;
        this.f53309r = 0.0f;
        this.f53310s = 0.0f;
        this.v = new Path();
        Drawable mutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.f53303a = mutate;
        int dp = AndroidUtilities.dp(7.0f);
        rect.bottom = dp;
        rect.right = dp;
        rect.top = dp;
        rect.left = dp;
        int i10 = i6.Td;
        d6 d6Var = b0Var.f53333s;
        mutate.setColorFilter(new PorterDuffColorFilter(i6.v0(i10, d6Var), PorterDuff.Mode.MULTIPLY));
        if (b0Var.f53338y == 2) {
            paint.setColor(i0.a.d(0.13f, -16777216, -1));
        } else {
            paint.setColor(i6.v0(i6.G8, d6Var));
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r38) {
        throw new UnsupportedOperationException("Method not decompiled: zg.a0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        b0 b0Var = this.f53311w;
        sk0 sk0Var = b0Var.f53328n;
        if (b0Var.f53338y != 1 && (sk0Var == null || sk0Var.getDelegate() == null || !sk0Var.getDelegate().p())) {
            return;
        }
        b0Var.f53327m.f35311f0.invalidate();
    }

    @Override
    public final void onMeasure(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: zg.a0.onMeasure(int, int):void");
    }
}
