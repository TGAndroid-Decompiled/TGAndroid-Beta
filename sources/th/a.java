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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.es;
import zf.q;
public final class a extends c implements ne.d {
    public final ne.b d;
    public final int[] e;
    public final Drawable f45817f;
    public final TextPaint h;
    public StaticLayout f45818n;
    public int f45819r;
    public int f45820s;

    public a(Context context, c6 c6Var) {
        super(c6Var);
        this.d = new ne.b(0, this, es.h, 320L, false);
        this.e = new int[]{16842910, 16842919};
        this.f45817f = context.getResources().getDrawable(R.drawable.outline_poll_add_24).mutate();
        this.h = new TextPaint(g6.P2);
        int w02 = g6.w0(g6.f19690i6, c6Var);
        if (this.f45832b != w02) {
            g6.C1(this.f45831a, w02, false);
            this.f45832b = w02;
        }
        b();
        c();
    }

    @Override
    public final void a(int i10) {
        this.f45831a.setAlpha(i10);
        b();
        c();
    }

    public final void b() {
        Drawable drawable = this.f45817f;
        drawable.setAlpha((int) ((1.0f - this.d.e) * this.f45833c));
    }

    public final void c() {
        TextPaint textPaint = this.h;
        textPaint.setAlpha((int) ((1.0f - this.d.e) * this.f45833c));
    }

    public final void d(boolean z10, boolean z11) {
        this.d.a(z10, z11);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f45831a.draw(canvas);
        q.b(canvas, this.f45817f, 1.0f - this.d.e);
        if (this.f45818n != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(44.0f) + bounds.left, AndroidUtilities.dp(13.66f) + bounds.top);
            this.f45818n.draw(canvas);
            canvas.restore();
        }
    }

    public final void e(int i10) {
        if (this.f45820s != i10) {
            this.f45820s = i10;
            this.h.setColor(i10);
            this.f45817f.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
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
        q.d(this.f45817f, dp, exactCenterY, 17);
        int width = rect.width() - AndroidUtilities.dp(56.0f);
        if (this.f45818n != null && this.f45819r == width) {
            return;
        }
        this.f45819r = width;
        this.f45818n = new StaticLayout(LocaleController.getString(R.string.PollAddAnOption), this.h, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    @Override
    public final void p(int i10, float f7, float f10, e eVar) {
        b();
        c();
        invalidateSelf();
    }

    @Override
    public final void A(float f7, int i10) {
    }
}
