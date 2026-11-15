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
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.er;
public final class a extends c implements te.b {
    public final te.a d;
    public final int[] f58403e;
    public final Drawable f58404f;
    public final TextPaint h;
    public StaticLayout f58405n;
    public int f58406r;
    public int f58407s;

    public a(Context context, e6 e6Var) {
        super(e6Var);
        this.d = new te.a(0, this, er.h, 320L, false);
        this.f58403e = new int[]{16842910, 16842919};
        this.f58404f = i5.c.g(context, 2131232489);
        this.h = new TextPaint(j6.P2);
        int w02 = j6.w0(j6.f28941i6, e6Var);
        if (this.f58420b != w02) {
            j6.H1(this.f58419a, w02, false);
            this.f58420b = w02;
        }
        b();
        c();
    }

    @Override
    public final void G(int i7, float f10, float f11, te.c cVar) {
        b();
        c();
        invalidateSelf();
    }

    @Override
    public final void a(int i7) {
        this.f58419a.setAlpha(i7);
        b();
        c();
    }

    public final void b() {
        Drawable drawable = this.f58404f;
        drawable.setAlpha((int) ((1.0f - this.d.f57085e) * this.f58421c));
    }

    public final void c() {
        TextPaint textPaint = this.h;
        textPaint.setAlpha((int) ((1.0f - this.d.f57085e) * this.f58421c));
    }

    public final void d(boolean z10, boolean z11) {
        this.d.a(z10, z11);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f58419a.draw(canvas);
        s.b(canvas, this.f58404f, 1.0f - this.d.f57085e);
        if (this.f58405n != null) {
            canvas.save();
            canvas.translate(g0.L(44.0f) + bounds.left, g0.L(13.66f) + bounds.top);
            this.f58405n.draw(canvas);
            canvas.restore();
        }
    }

    public final void e(int i7) {
        if (this.f58407s != i7) {
            this.f58407s = i7;
            this.h.setColor(i7);
            this.f58404f.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
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
        s.d(this.f58404f, L, exactCenterY, 17);
        int width = rect.width() - g0.L(56.0f);
        if (this.f58405n != null && this.f58406r == width) {
            return;
        }
        this.f58406r = width;
        this.f58405n = new StaticLayout(hd.M0(2131747184, null), this.h, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    @Override
    public final void E(float f10, int i7) {
    }
}
