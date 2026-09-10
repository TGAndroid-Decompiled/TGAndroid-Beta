package yg;

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
import org.telegram.ui.Components.pk0;
public final class b0 extends FrameLayout {
    public final Drawable f46938a;
    public final Rect f46939b;
    public final Paint f46940c;
    public final int[] d;
    public final HashMap e;
    public float f46941f;
    public float h;
    public float f46942n;
    public float f46943r;
    public float f46944s;
    public final Path v;
    public final c0 f46945w;

    public b0(c0 c0Var, Context context) {
        super(context);
        this.f46945w = c0Var;
        Rect rect = new Rect();
        this.f46939b = rect;
        Paint paint = new Paint(1);
        this.f46940c = paint;
        this.d = new int[4];
        this.e = new HashMap();
        this.f46941f = 0.0f;
        this.h = 0.0f;
        this.f46942n = 1.0f;
        this.f46943r = 0.0f;
        this.f46944s = 0.0f;
        this.v = new Path();
        Drawable mutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.f46938a = mutate;
        int dp = AndroidUtilities.dp(7.0f);
        rect.bottom = dp;
        rect.right = dp;
        rect.top = dp;
        rect.left = dp;
        int i10 = j6.Td;
        f6 f6Var = c0Var.f46965s;
        mutate.setColorFilter(new PorterDuffColorFilter(j6.v0(i10, f6Var), PorterDuff.Mode.MULTIPLY));
        if (c0Var.f46970y == 2) {
            paint.setColor(i0.a.d(0.13f, -16777216, -1));
        } else {
            paint.setColor(j6.v0(j6.G8, f6Var));
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r38) {
        throw new UnsupportedOperationException("Method not decompiled: yg.b0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        c0 c0Var = this.f46945w;
        pk0 pk0Var = c0Var.f46960n;
        if (c0Var.f46970y != 1 && (pk0Var == null || pk0Var.getDelegate() == null || !pk0Var.getDelegate().t())) {
            return;
        }
        c0Var.f46959m.f34566f0.invalidate();
    }

    @Override
    public final void onMeasure(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: yg.b0.onMeasure(int, int):void");
    }
}
