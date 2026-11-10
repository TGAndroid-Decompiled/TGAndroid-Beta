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
import bg.s;
import jg.g;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.wq;
public final class a extends c implements te.b {
    public final te.a d;
    public final int[] f56901e;
    public final Drawable f56902f;
    public final TextPaint h;
    public StaticLayout f56903n;
    public int f56904r;
    public int f56905s;

    public a(Context context, h6 h6Var) {
        super(h6Var);
        this.d = new te.a(0, this, wq.h, 320L, false);
        this.f56901e = new int[]{16842910, 16842919};
        this.f56902f = g.h(context, 2131232488);
        this.h = new TextPaint(m6.P2);
        int w02 = m6.w0(m6.f27982i6, h6Var);
        if (this.f56918b != w02) {
            m6.H1(this.f56917a, w02, false);
            this.f56918b = w02;
        }
        b();
        c();
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        b();
        c();
        invalidateSelf();
    }

    @Override
    public final void a(int i7) {
        this.f56917a.setAlpha(i7);
        b();
        c();
    }

    public final void b() {
        Drawable drawable = this.f56902f;
        drawable.setAlpha((int) ((1.0f - this.d.f55498e) * this.f56919c));
    }

    public final void c() {
        TextPaint textPaint = this.h;
        textPaint.setAlpha((int) ((1.0f - this.d.f55498e) * this.f56919c));
    }

    public final void d(boolean z9, boolean z10) {
        this.d.a(z9, z10);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f56917a.draw(canvas);
        s.b(canvas, this.f56902f, 1.0f - this.d.f55498e);
        if (this.f56903n != null) {
            canvas.save();
            canvas.translate(g0.L(44.0f) + bounds.left, g0.L(13.66f) + bounds.top);
            this.f56903n.draw(canvas);
            canvas.restore();
        }
    }

    public final void e(int i7) {
        if (this.f56905s != i7) {
            this.f56905s = i7;
            this.h.setColor(i7);
            this.f56902f.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
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
        s.d(this.f56902f, L, exactCenterY, 17);
        int width = rect.width() - g0.L(56.0f);
        if (this.f56903n != null && this.f56904r == width) {
            return;
        }
        this.f56904r = width;
        this.f56903n = new StaticLayout(id.M0(2131747184, null), this.h, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    @Override
    public final void F(float f10, int i7) {
    }
}
