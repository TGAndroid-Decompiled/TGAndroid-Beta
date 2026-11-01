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
import org.telegram.ui.Components.nj0;
public final class a0 extends FrameLayout implements k6 {
    public final Drawable f48273a;
    public final Rect f48274b;
    public final Paint f48275c;
    public final int[] d;
    public final HashMap e;
    public float f48276f;
    public float h;
    public float f48277n;
    public float f48278r;
    public float f48279s;
    public final Path f48280w;
    public final b0 f48281x;

    public a0(b0 b0Var, Context context) {
        super(context);
        this.f48281x = b0Var;
        Rect rect = new Rect();
        this.f48274b = rect;
        Paint paint = new Paint(1);
        this.f48275c = paint;
        this.d = new int[4];
        this.e = new HashMap();
        this.f48276f = 0.0f;
        this.h = 0.0f;
        this.f48277n = 1.0f;
        this.f48278r = 0.0f;
        this.f48279s = 0.0f;
        this.f48280w = new Path();
        Drawable mutate = context.getDrawable(2131232670).mutate();
        this.f48273a = mutate;
        int L = org.telegram.messenger.i0.L(7.0f);
        rect.bottom = L;
        rect.right = L;
        rect.top = L;
        rect.left = L;
        int i10 = t6.He;
        p6 p6Var = b0Var.f48301s;
        a7.y(this, mutate, i10, p6Var, PorterDuff.Mode.MULTIPLY);
        if (b0Var.f48306y == 2) {
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
        b0 b0Var = this.f48281x;
        nj0 nj0Var = b0Var.f48296n;
        if (b0Var.f48306y != 1 && (nj0Var == null || nj0Var.getDelegate() == null || !nj0Var.getDelegate().A())) {
            return;
        }
        b0Var.f48295m.f37301f0.invalidate();
    }

    @Override
    public final void onMeasure(int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: sg.a0.onMeasure(int, int):void");
    }

    @Override
    public final void updateColors() {
        Paint paint;
        try {
            b0 b0Var = this.f48281x;
            if (b0Var.f48306y != 2 && (paint = this.f48275c) != null) {
                paint.setColor(t6.w0(t6.G8, b0Var.f48301s));
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
