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
import org.telegram.ui.Components.tk0;
public final class a0 extends FrameLayout {
    public final Drawable f49341a;
    public final Rect f49342b;
    public final Paint f49343c;
    public final int[] d;
    public final HashMap e;
    public float f49344f;
    public float h;
    public float f49345n;
    public float f49346r;
    public float f49347s;
    public final Path v;
    public final b0 f49348w;

    public a0(b0 b0Var, Context context) {
        super(context);
        this.f49348w = b0Var;
        Rect rect = new Rect();
        this.f49342b = rect;
        Paint paint = new Paint(1);
        this.f49343c = paint;
        this.d = new int[4];
        this.e = new HashMap();
        this.f49344f = 0.0f;
        this.h = 0.0f;
        this.f49345n = 1.0f;
        this.f49346r = 0.0f;
        this.f49347s = 0.0f;
        this.v = new Path();
        Drawable mutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.f49341a = mutate;
        int dp = AndroidUtilities.dp(7.0f);
        rect.bottom = dp;
        rect.right = dp;
        rect.top = dp;
        rect.left = dp;
        int i10 = h6.Td;
        d6 d6Var = b0Var.f49368s;
        mutate.setColorFilter(new PorterDuffColorFilter(h6.v0(i10, d6Var), PorterDuff.Mode.MULTIPLY));
        if (b0Var.f49373y == 2) {
            paint.setColor(i0.a.d(0.13f, -16777216, -1));
        } else {
            paint.setColor(h6.v0(h6.G8, d6Var));
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r38) {
        throw new UnsupportedOperationException("Method not decompiled: zg.a0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        b0 b0Var = this.f49348w;
        tk0 tk0Var = b0Var.f49363n;
        if (b0Var.f49373y != 1 && (tk0Var == null || tk0Var.getDelegate() == null || !tk0Var.getDelegate().p())) {
            return;
        }
        b0Var.f49362m.f32097f0.invalidate();
    }

    @Override
    public final void onMeasure(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: zg.a0.onMeasure(int, int):void");
    }
}
