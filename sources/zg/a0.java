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
import org.telegram.ui.Components.pk0;
public final class a0 extends FrameLayout {
    public final Drawable f49260a;
    public final Rect f49261b;
    public final Paint f49262c;
    public final int[] d;
    public final HashMap e;
    public float f49263f;
    public float h;
    public float f49264n;
    public float f49265r;
    public float f49266s;
    public final Path v;
    public final b0 f49267w;

    public a0(b0 b0Var, Context context) {
        super(context);
        this.f49267w = b0Var;
        Rect rect = new Rect();
        this.f49261b = rect;
        Paint paint = new Paint(1);
        this.f49262c = paint;
        this.d = new int[4];
        this.e = new HashMap();
        this.f49263f = 0.0f;
        this.h = 0.0f;
        this.f49264n = 1.0f;
        this.f49265r = 0.0f;
        this.f49266s = 0.0f;
        this.v = new Path();
        Drawable mutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.f49260a = mutate;
        int dp = AndroidUtilities.dp(7.0f);
        rect.bottom = dp;
        rect.right = dp;
        rect.top = dp;
        rect.left = dp;
        int i10 = j6.Td;
        f6 f6Var = b0Var.f49287s;
        mutate.setColorFilter(new PorterDuffColorFilter(j6.v0(i10, f6Var), PorterDuff.Mode.MULTIPLY));
        if (b0Var.f49292y == 2) {
            paint.setColor(i0.a.d(0.13f, -16777216, -1));
        } else {
            paint.setColor(j6.v0(j6.G8, f6Var));
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r38) {
        throw new UnsupportedOperationException("Method not decompiled: zg.a0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        b0 b0Var = this.f49267w;
        pk0 pk0Var = b0Var.f49282n;
        if (b0Var.f49292y != 1 && (pk0Var == null || pk0Var.getDelegate() == null || !pk0Var.getDelegate().r())) {
            return;
        }
        b0Var.f49281m.f34788f0.invalidate();
    }

    @Override
    public final void onMeasure(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: zg.a0.onMeasure(int, int):void");
    }
}
