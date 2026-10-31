package sg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.f8;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.mj0;
public final class a0 extends FrameLayout implements k6 {
    public final Drawable f48262a;
    public final Rect f48263b;
    public final Paint f48264c;
    public final int[] d;
    public final HashMap e;
    public float f48265f;
    public float h;
    public float f48266n;
    public float f48267r;
    public float f48268s;
    public final Path f48269w;
    public final b0 f48270x;

    public a0(b0 b0Var, Context context) {
        super(context);
        this.f48270x = b0Var;
        Rect rect = new Rect();
        this.f48263b = rect;
        Paint paint = new Paint(1);
        this.f48264c = paint;
        this.d = new int[4];
        this.e = new HashMap();
        this.f48265f = 0.0f;
        this.h = 0.0f;
        this.f48266n = 1.0f;
        this.f48267r = 0.0f;
        this.f48268s = 0.0f;
        this.f48269w = new Path();
        Drawable mutate = context.getDrawable(2131232670).mutate();
        this.f48262a = mutate;
        int L = org.telegram.messenger.i0.L(7.0f);
        rect.bottom = L;
        rect.right = L;
        rect.top = L;
        rect.left = L;
        int i10 = t6.He;
        p6 p6Var = b0Var.f48290s;
        a7.y(this, mutate, i10, p6Var, PorterDuff.Mode.MULTIPLY);
        if (b0Var.f48295y == 2) {
            paint.setColor(i0.b.f(0.13f, -16777216, -1));
        } else {
            paint.setColor(t6.w0(t6.G8, p6Var));
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r38) {
        throw new UnsupportedOperationException("Method not decompiled: sg.a0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        b0 b0Var = this.f48270x;
        mj0 mj0Var = b0Var.f48285n;
        if (b0Var.f48295y != 1 && (mj0Var == null || mj0Var.getDelegate() == null || !mj0Var.getDelegate().A())) {
            return;
        }
        b0Var.f48284m.f38125f0.invalidate();
    }

    @Override
    public final void onMeasure(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: sg.a0.onMeasure(int, int):void");
    }

    @Override
    public final void updateColors() {
        Paint paint;
        try {
            b0 b0Var = this.f48270x;
            if (b0Var.f48295y != 2 && (paint = this.f48264c) != null) {
                paint.setColor(t6.w0(t6.G8, b0Var.f48290s));
                invalidate();
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
