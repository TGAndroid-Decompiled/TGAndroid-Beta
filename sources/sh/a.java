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
import le.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.tr;
import yf.p;
public final class a extends c implements le.d {
    public final le.b d;
    public final int[] f46849e;
    public final Drawable f46850f;
    public final TextPaint h;
    public StaticLayout f46851n;
    public int f46852r;
    public int f46853s;

    public a(Context context, d6 d6Var) {
        super(d6Var);
        this.d = new le.b(0, this, tr.h, 320L, false);
        this.f46849e = new int[]{16842910, 16842919};
        this.f46850f = context.getResources().getDrawable(R.drawable.outline_poll_add_24).mutate();
        this.h = new TextPaint(i6.P2);
        int v02 = i6.v0(i6.f20908i6, d6Var);
        if (this.f46866b != v02) {
            i6.B1(this.f46865a, v02, false);
            this.f46866b = v02;
        }
        b();
        c();
    }

    @Override
    public final void a(int i10) {
        this.f46865a.setAlpha(i10);
        b();
        c();
    }

    @Override
    public final void a0(int i10, float f7, float f10, e eVar) {
        b();
        c();
        invalidateSelf();
    }

    public final void b() {
        Drawable drawable = this.f46850f;
        drawable.setAlpha((int) ((1.0f - this.d.f15434e) * this.f46867c));
    }

    public final void c() {
        TextPaint textPaint = this.h;
        textPaint.setAlpha((int) ((1.0f - this.d.f15434e) * this.f46867c));
    }

    public final void d(boolean z10, boolean z11) {
        this.d.a(z10, z11);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f46865a.draw(canvas);
        p.b(canvas, this.f46850f, 1.0f - this.d.f15434e);
        if (this.f46851n != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(44.0f) + bounds.left, AndroidUtilities.dp(13.66f) + bounds.top);
            this.f46851n.draw(canvas);
            canvas.restore();
        }
    }

    public final void e(int i10) {
        if (this.f46853s != i10) {
            this.f46853s = i10;
            this.h.setColor(i10);
            this.f46850f.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
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
        p.d(this.f46850f, dp, exactCenterY, 17);
        int width = rect.width() - AndroidUtilities.dp(56.0f);
        if (this.f46851n != null && this.f46852r == width) {
            return;
        }
        this.f46852r = width;
        this.f46851n = new StaticLayout(LocaleController.getString(R.string.PollAddAnOption), this.h, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    @Override
    public final void V(float f7, int i10) {
    }
}
