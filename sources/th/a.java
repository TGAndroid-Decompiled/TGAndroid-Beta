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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.bs;
import zf.p;
public final class a extends c implements ne.d {
    public final ne.b d;
    public final int[] e;
    public final Drawable f47195f;
    public final TextPaint h;
    public StaticLayout f47196n;
    public int f47197r;
    public int f47198s;

    public a(Context context, d6 d6Var) {
        super(d6Var);
        this.d = new ne.b(0, this, bs.h, 320L, false);
        this.e = new int[]{16842910, 16842919};
        this.f47195f = context.getResources().getDrawable(R.drawable.outline_poll_add_24).mutate();
        this.h = new TextPaint(h6.P2);
        int w02 = h6.w0(h6.f21082i6, d6Var);
        if (this.f47210b != w02) {
            h6.C1(this.f47209a, w02, false);
            this.f47210b = w02;
        }
        b();
        c();
    }

    @Override
    public final void a(int i10) {
        this.f47209a.setAlpha(i10);
        b();
        c();
    }

    public final void b() {
        Drawable drawable = this.f47195f;
        drawable.setAlpha((int) ((1.0f - this.d.e) * this.f47211c));
    }

    public final void c() {
        TextPaint textPaint = this.h;
        textPaint.setAlpha((int) ((1.0f - this.d.e) * this.f47211c));
    }

    public final void d(boolean z10, boolean z11) {
        this.d.a(z10, z11);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f47209a.draw(canvas);
        p.b(canvas, this.f47195f, 1.0f - this.d.e);
        if (this.f47196n != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(44.0f) + bounds.left, AndroidUtilities.dp(13.66f) + bounds.top);
            this.f47196n.draw(canvas);
            canvas.restore();
        }
    }

    public final void e(int i10) {
        if (this.f47198s != i10) {
            this.f47198s = i10;
            this.h.setColor(i10);
            this.f47195f.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
            c();
        }
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        float exactCenterY = rect.exactCenterY();
        float dp = AndroidUtilities.dp(22.33f) + rect.left;
        AndroidUtilities.dp(27.0f);
        AndroidUtilities.dp(44.0f);
        p.d(this.f47195f, dp, exactCenterY, 17);
        int width = rect.width() - AndroidUtilities.dp(56.0f);
        if (this.f47196n != null && this.f47197r == width) {
            return;
        }
        this.f47197r = width;
        this.f47196n = new StaticLayout(LocaleController.getString(R.string.PollAddAnOption), this.h, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    @Override
    public final void r(int i10, float f7, float f10, e eVar) {
        b();
        c();
        invalidateSelf();
    }

    @Override
    public final void H(float f7, int i10) {
    }
}
