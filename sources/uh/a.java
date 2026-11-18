package uh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import bg.t;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.lr;
public final class a extends c implements te.b {
    public final te.a d;
    public final int[] f58970e;
    public final Drawable f58971f;
    public final TextPaint h;
    public StaticLayout f58972n;
    public int f58973r;
    public int f58974s;

    public a(Context context, i6 i6Var) {
        super(i6Var);
        this.d = new te.a(0, this, lr.h, 320L, false);
        this.f58970e = new int[]{16842910, 16842919};
        this.f58971f = i5.c.g(context, 2131232490);
        this.h = new TextPaint(n6.P2);
        int w02 = n6.w0(n6.f29488i6, i6Var);
        if (this.f58987b != w02) {
            n6.H1(this.f58986a, w02, false);
            this.f58987b = w02;
        }
        b();
        c();
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
        b();
        c();
        invalidateSelf();
    }

    @Override
    public final void a(int i7) {
        this.f58986a.setAlpha(i7);
        b();
        c();
    }

    public final void b() {
        Drawable drawable = this.f58971f;
        drawable.setAlpha((int) ((1.0f - this.d.f57657e) * this.f58988c));
    }

    public final void c() {
        TextPaint textPaint = this.h;
        textPaint.setAlpha((int) ((1.0f - this.d.f57657e) * this.f58988c));
    }

    public final void d(boolean z10, boolean z11) {
        this.d.a(z10, z11);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f58986a.draw(canvas);
        t.b(canvas, this.f58971f, 1.0f - this.d.f57657e);
        if (this.f58972n != null) {
            canvas.save();
            canvas.translate(g0.L(44.0f) + bounds.left, g0.L(13.66f) + bounds.top);
            this.f58972n.draw(canvas);
            canvas.restore();
        }
    }

    public final void e(int i7) {
        if (this.f58974s != i7) {
            this.f58974s = i7;
            this.h.setColor(i7);
            this.f58971f.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
            c();
        }
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        float exactCenterY = rect.exactCenterY();
        float L = g0.L(22.33f) + rect.left;
        g0.L(27.0f);
        g0.L(44.0f);
        t.d(this.f58971f, L, exactCenterY, 17);
        int width = rect.width() - g0.L(56.0f);
        if (this.f58972n != null && this.f58973r == width) {
            return;
        }
        this.f58973r = width;
        this.f58972n = new StaticLayout(gd.M0(2131746991, null), this.h, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    @Override
    public final void D(float f10, int i7) {
    }
}
