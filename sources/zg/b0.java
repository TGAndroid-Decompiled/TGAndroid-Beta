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
import org.telegram.ui.Components.fk0;
public final class b0 extends FrameLayout {
    public final Drawable f48966a;
    public final Rect f48967b;
    public final Paint f48968c;
    public final int[] d;
    public final HashMap e;
    public float f48969f;
    public float h;
    public float f48970n;
    public float f48971r;
    public float f48972s;
    public final Path v;
    public final c0 f48973w;

    public b0(c0 c0Var, Context context) {
        super(context);
        this.f48973w = c0Var;
        Rect rect = new Rect();
        this.f48967b = rect;
        Paint paint = new Paint(1);
        this.f48968c = paint;
        this.d = new int[4];
        this.e = new HashMap();
        this.f48969f = 0.0f;
        this.h = 0.0f;
        this.f48970n = 1.0f;
        this.f48971r = 0.0f;
        this.f48972s = 0.0f;
        this.v = new Path();
        Drawable mutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.f48966a = mutate;
        int dp = AndroidUtilities.dp(7.0f);
        rect.bottom = dp;
        rect.right = dp;
        rect.top = dp;
        rect.left = dp;
        int i10 = i6.Td;
        e6 e6Var = c0Var.f48998s;
        mutate.setColorFilter(new PorterDuffColorFilter(i6.v0(i10, e6Var), PorterDuff.Mode.MULTIPLY));
        if (c0Var.f49003y == 2) {
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
        c0 c0Var = this.f48973w;
        fk0 fk0Var = c0Var.f48993n;
        if (c0Var.f49003y != 1 && (fk0Var == null || fk0Var.getDelegate() == null || !fk0Var.getDelegate().q())) {
            return;
        }
        c0Var.f48992m.f33792f0.invalidate();
    }

    @Override
    public final void onMeasure(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: zg.b0.onMeasure(int, int):void");
    }
}
