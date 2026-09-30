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
import org.telegram.ui.Components.sk0;
public final class a0 extends FrameLayout {
    public final Drawable f49235a;
    public final Rect f49236b;
    public final Paint f49237c;
    public final int[] d;
    public final HashMap e;
    public float f49238f;
    public float h;
    public float f49239n;
    public float f49240r;
    public float f49241s;
    public final Path v;
    public final b0 f49242w;

    public a0(b0 b0Var, Context context) {
        super(context);
        this.f49242w = b0Var;
        Rect rect = new Rect();
        this.f49236b = rect;
        Paint paint = new Paint(1);
        this.f49237c = paint;
        this.d = new int[4];
        this.e = new HashMap();
        this.f49238f = 0.0f;
        this.h = 0.0f;
        this.f49239n = 1.0f;
        this.f49240r = 0.0f;
        this.f49241s = 0.0f;
        this.v = new Path();
        Drawable mutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.f49235a = mutate;
        int dp = AndroidUtilities.dp(7.0f);
        rect.bottom = dp;
        rect.right = dp;
        rect.top = dp;
        rect.left = dp;
        int i10 = h6.Td;
        d6 d6Var = b0Var.f49262s;
        mutate.setColorFilter(new PorterDuffColorFilter(h6.v0(i10, d6Var), PorterDuff.Mode.MULTIPLY));
        if (b0Var.f49267y == 2) {
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
        b0 b0Var = this.f49242w;
        sk0 sk0Var = b0Var.f49257n;
        if (b0Var.f49267y != 1 && (sk0Var == null || sk0Var.getDelegate() == null || !sk0Var.getDelegate().p())) {
            return;
        }
        b0Var.f49256m.f32025f0.invalidate();
    }

    @Override
    public final void onMeasure(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: zg.a0.onMeasure(int, int):void");
    }
}
