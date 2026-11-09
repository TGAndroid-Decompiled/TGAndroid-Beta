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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.xq;
public final class a extends c implements te.b {
    public final te.a d;
    public final int[] f56905e;
    public final Drawable f56906f;
    public final TextPaint h;
    public StaticLayout f56907n;
    public int f56908r;
    public int f56909s;

    public a(Context context, g6 g6Var) {
        super(g6Var);
        this.d = new te.a(0, this, xq.h, 320L, false);
        this.f56905e = new int[]{16842910, 16842919};
        this.f56906f = g.h(context, 2131232488);
        this.h = new TextPaint(l6.P2);
        int w02 = l6.w0(l6.f27957i6, g6Var);
        if (this.f56922b != w02) {
            l6.H1(this.f56921a, w02, false);
            this.f56922b = w02;
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
        this.f56921a.setAlpha(i7);
        b();
        c();
    }

    public final void b() {
        Drawable drawable = this.f56906f;
        drawable.setAlpha((int) ((1.0f - this.d.f55499e) * this.f56923c));
    }

    public final void c() {
        TextPaint textPaint = this.h;
        textPaint.setAlpha((int) ((1.0f - this.d.f55499e) * this.f56923c));
    }

    public final void d(boolean z9, boolean z10) {
        this.d.a(z9, z10);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f56921a.draw(canvas);
        s.b(canvas, this.f56906f, 1.0f - this.d.f55499e);
        if (this.f56907n != null) {
            canvas.save();
            canvas.translate(g0.L(44.0f) + bounds.left, g0.L(13.66f) + bounds.top);
            this.f56907n.draw(canvas);
            canvas.restore();
        }
    }

    public final void e(int i7) {
        if (this.f56909s != i7) {
            this.f56909s = i7;
            this.h.setColor(i7);
            this.f56906f.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
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
        s.d(this.f56906f, L, exactCenterY, 17);
        int width = rect.width() - g0.L(56.0f);
        if (this.f56907n != null && this.f56908r == width) {
            return;
        }
        this.f56908r = width;
        this.f56907n = new StaticLayout(id.M0(2131747184, null), this.h, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    @Override
    public final void F(float f10, int i7) {
    }
}
