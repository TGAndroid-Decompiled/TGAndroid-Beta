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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.qr;
import yf.p;
public final class a extends c implements le.d {
    public final le.b d;
    public final int[] e;
    public final Drawable f42972f;
    public final TextPaint h;
    public StaticLayout f42973n;
    public int f42974r;
    public int f42975s;

    public a(Context context, e6 e6Var) {
        super(e6Var);
        this.d = new le.b(0, this, qr.h, 320L, false);
        this.e = new int[]{16842910, 16842919};
        this.f42972f = context.getResources().getDrawable(R.drawable.outline_poll_add_24).mutate();
        this.h = new TextPaint(i6.P2);
        int v02 = i6.v0(i6.f18926i6, e6Var);
        if (this.f42987b != v02) {
            i6.B1(this.f42986a, v02, false);
            this.f42987b = v02;
        }
        b();
        c();
    }

    @Override
    public final void D(int i10, float f7, float f10, e eVar) {
        b();
        c();
        invalidateSelf();
    }

    @Override
    public final void a(int i10) {
        this.f42986a.setAlpha(i10);
        b();
        c();
    }

    public final void b() {
        Drawable drawable = this.f42972f;
        drawable.setAlpha((int) ((1.0f - this.d.e) * this.f42988c));
    }

    public final void c() {
        TextPaint textPaint = this.h;
        textPaint.setAlpha((int) ((1.0f - this.d.e) * this.f42988c));
    }

    public final void d(boolean z10, boolean z11) {
        this.d.a(z10, z11);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f42986a.draw(canvas);
        p.b(canvas, this.f42972f, 1.0f - this.d.e);
        if (this.f42973n != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(44.0f) + bounds.left, AndroidUtilities.dp(13.66f) + bounds.top);
            this.f42973n.draw(canvas);
            canvas.restore();
        }
    }

    public final void e(int i10) {
        if (this.f42975s != i10) {
            this.f42975s = i10;
            this.h.setColor(i10);
            this.f42972f.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
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
        p.d(this.f42972f, dp, exactCenterY, 17);
        int width = rect.width() - AndroidUtilities.dp(56.0f);
        if (this.f42973n != null && this.f42974r == width) {
            return;
        }
        this.f42974r = width;
        this.f42973n = new StaticLayout(LocaleController.getString(R.string.PollAddAnOption), this.h, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
