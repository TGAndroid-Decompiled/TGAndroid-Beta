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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.nl0;
public final class z extends FrameLayout {
    public final Drawable f54909a;
    public final Rect f54910b;
    public final Paint f54911c;
    public final int[] d;
    public final HashMap f54912e;
    public float f54913f;
    public float h;
    public float f54914n;
    public float f54915r;
    public float f54916s;
    public final Path v;
    public final a0 f54917w;

    public z(a0 a0Var, Context context) {
        super(context);
        this.f54917w = a0Var;
        Rect rect = new Rect();
        this.f54910b = rect;
        Paint paint = new Paint(1);
        this.f54911c = paint;
        this.d = new int[4];
        this.f54912e = new HashMap();
        this.f54913f = 0.0f;
        this.h = 0.0f;
        this.f54914n = 1.0f;
        this.f54915r = 0.0f;
        this.f54916s = 0.0f;
        this.v = new Path();
        Drawable mutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.f54909a = mutate;
        int dp = AndroidUtilities.dp(7.0f);
        rect.bottom = dp;
        rect.right = dp;
        rect.top = dp;
        rect.left = dp;
        int i10 = h6.Td;
        c6 c6Var = a0Var.f54689s;
        mutate.setColorFilter(new PorterDuffColorFilter(h6.w0(i10, c6Var), PorterDuff.Mode.MULTIPLY));
        if (a0Var.f54694y == 2) {
            paint.setColor(i0.a.d(0.13f, -16777216, -1));
        } else {
            paint.setColor(h6.w0(h6.G8, c6Var));
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r38) {
        throw new UnsupportedOperationException("Method not decompiled: zg.z.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        a0 a0Var = this.f54917w;
        nl0 nl0Var = a0Var.f54684n;
        if (a0Var.f54694y != 1 && (nl0Var == null || nl0Var.getDelegate() == null || !nl0Var.getDelegate().q())) {
            return;
        }
        a0Var.f54683m.f40268f0.invalidate();
    }

    @Override
    public final void onMeasure(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: zg.z.onMeasure(int, int):void");
    }
}
