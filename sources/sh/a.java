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
import le.f;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.sr;
import yf.p;
public final class a extends c implements e {
    public final le.c d;
    public final int[] e;
    public final Drawable f43259f;
    public final TextPaint h;
    public StaticLayout f43260n;
    public int f43261r;
    public int f43262s;

    public a(Context context, d6 d6Var) {
        super(d6Var);
        this.d = new le.c(0, this, sr.h, 320L, false);
        this.e = new int[]{16842910, 16842919};
        this.f43259f = context.getResources().getDrawable(R.drawable.outline_poll_add_24).mutate();
        this.h = new TextPaint(h6.P2);
        int v02 = h6.v0(h6.f19148i6, d6Var);
        if (this.f43274b != v02) {
            h6.B1(this.f43273a, v02, false);
            this.f43274b = v02;
        }
        b();
        c();
    }

    @Override
    public final void D(int i10, float f7, float f10, f fVar) {
        b();
        c();
        invalidateSelf();
    }

    @Override
    public final void a(int i10) {
        this.f43273a.setAlpha(i10);
        b();
        c();
    }

    public final void b() {
        Drawable drawable = this.f43259f;
        drawable.setAlpha((int) ((1.0f - this.d.e) * this.f43275c));
    }

    public final void c() {
        TextPaint textPaint = this.h;
        textPaint.setAlpha((int) ((1.0f - this.d.e) * this.f43275c));
    }

    public final void d(boolean z10, boolean z11) {
        this.d.a(z10, z11);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f43273a.draw(canvas);
        p.b(canvas, this.f43259f, 1.0f - this.d.e);
        if (this.f43260n != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(44.0f) + bounds.left, AndroidUtilities.dp(13.66f) + bounds.top);
            this.f43260n.draw(canvas);
            canvas.restore();
        }
    }

    public final void e(int i10) {
        if (this.f43262s != i10) {
            this.f43262s = i10;
            this.h.setColor(i10);
            this.f43259f.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
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
        p.d(this.f43259f, dp, exactCenterY, 17);
        int width = rect.width() - AndroidUtilities.dp(56.0f);
        if (this.f43260n != null && this.f43261r == width) {
            return;
        }
        this.f43261r = width;
        this.f43260n = new StaticLayout(LocaleController.getString(R.string.PollAddAnOption), this.h, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
