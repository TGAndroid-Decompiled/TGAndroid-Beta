package sh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import me.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.is;
import yf.p;
public final class a extends c implements me.d {
    public final me.b d;
    public final int[] f48284e;
    public final Drawable f48285f;
    public final TextPaint h;
    public StaticLayout f48286n;
    public int f48287r;
    public int f48288s;

    public a(Context context, d6 d6Var) {
        super(d6Var);
        this.d = new me.b(0, this, is.h, 320L, false);
        this.f48284e = new int[]{16842910, 16842919};
        this.f48285f = context.getResources().getDrawable(R.drawable.outline_poll_add_24).mutate();
        this.h = new TextPaint(h6.P2);
        int w02 = h6.w0(h6.f20913i6, d6Var);
        if (this.f48301b != w02) {
            h6.C1(this.f48300a, w02, false);
            this.f48301b = w02;
        }
        b();
        c();
    }

    @Override
    public final void a(int i10) {
        this.f48300a.setAlpha(i10);
        b();
        c();
    }

    public final void b() {
        Drawable drawable = this.f48285f;
        drawable.setAlpha((int) ((1.0f - this.d.f16401e) * this.f48302c));
    }

    public final void c() {
        TextPaint textPaint = this.h;
        textPaint.setAlpha((int) ((1.0f - this.d.f16401e) * this.f48302c));
    }

    public final void d(boolean z10, boolean z11) {
        this.d.a(z10, z11);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f48300a.draw(canvas);
        p.b(canvas, this.f48285f, 1.0f - this.d.f16401e);
        if (this.f48286n != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(44.0f) + bounds.left, AndroidUtilities.dp(13.66f) + bounds.top);
            this.f48286n.draw(canvas);
            canvas.restore();
        }
    }

    public final void e(int i10) {
        if (this.f48288s != i10) {
            this.f48288s = i10;
            this.h.setColor(i10);
            this.f48285f.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
            c();
        }
    }

    @Override
    public final void n(int i10, float f7, float f10, e eVar) {
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
        p.d(this.f48285f, dp, exactCenterY, 17);
        int width = rect.width() - AndroidUtilities.dp(56.0f);
        if (this.f48286n != null && this.f48287r == width) {
            return;
        }
        this.f48287r = width;
        this.f48286n = new StaticLayout(LocaleController.getString(R.string.PollAddAnOption), this.h, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    @Override
    public final void A(float f7, int i10) {
    }
}
