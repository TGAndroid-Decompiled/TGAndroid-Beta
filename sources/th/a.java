package th;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import ne.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.bs;
import zf.p;
public final class a extends c implements ne.d {
    public final ne.b d;
    public final int[] e;
    public final Drawable f47631f;
    public final TextPaint h;
    public StaticLayout f47632n;
    public int f47633r;
    public int f47634s;

    public a(Context context, g6 g6Var) {
        super(g6Var);
        this.d = new ne.b(0, this, bs.h, 320L, false);
        this.e = new int[]{16842910, 16842919};
        this.f47631f = context.getResources().getDrawable(R.drawable.outline_poll_add_24).mutate();
        this.h = new TextPaint(k6.P2);
        int w02 = k6.w0(k6.f21272i6, g6Var);
        if (this.f47646b != w02) {
            k6.E1(this.f47645a, w02, false);
            this.f47646b = w02;
        }
        b();
        c();
    }

    @Override
    public final void a(int i10) {
        this.f47645a.setAlpha(i10);
        b();
        c();
    }

    public final void b() {
        Drawable drawable = this.f47631f;
        drawable.setAlpha((int) ((1.0f - this.d.e) * this.f47647c));
    }

    public final void c() {
        TextPaint textPaint = this.h;
        textPaint.setAlpha((int) ((1.0f - this.d.e) * this.f47647c));
    }

    public final void d(boolean z10, boolean z11) {
        this.d.a(z10, z11);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f47645a.draw(canvas);
        p.b(canvas, this.f47631f, 1.0f - this.d.e);
        if (this.f47632n != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(44.0f) + bounds.left, AndroidUtilities.dp(13.66f) + bounds.top);
            this.f47632n.draw(canvas);
            canvas.restore();
        }
    }

    public final void e(int i10) {
        if (this.f47634s != i10) {
            this.f47634s = i10;
            this.h.setColor(i10);
            this.f47631f.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
            c();
        }
    }

    @Override
    public final void o(int i10, float f7, float f10, e eVar) {
        b();
        c();
        invalidateSelf();
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        float exactCenterY = rect.exactCenterY();
        float dp = AndroidUtilities.dp(22.33f) + rect.left;
        AndroidUtilities.dp(27.0f);
        AndroidUtilities.dp(44.0f);
        p.d(this.f47631f, dp, exactCenterY, 17);
        int width = rect.width() - AndroidUtilities.dp(56.0f);
        if (this.f47632n != null && this.f47633r == width) {
            return;
        }
        this.f47633r = width;
        this.f47632n = new StaticLayout(LocaleController.getString(R.string.PollAddAnOption), this.h, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    @Override
    public final void H(float f7, int i10) {
    }
}
