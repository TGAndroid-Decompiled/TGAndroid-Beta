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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.qr;
import yf.p;
public final class a extends c implements le.d {
    public final le.b d;
    public final int[] e;
    public final Drawable f43295f;
    public final TextPaint h;
    public StaticLayout f43296n;
    public int f43297r;
    public int f43298s;

    public a(Context context, f6 f6Var) {
        super(f6Var);
        this.d = new le.b(0, this, qr.h, 320L, false);
        this.e = new int[]{16842910, 16842919};
        this.f43295f = context.getResources().getDrawable(R.drawable.outline_poll_add_24).mutate();
        this.h = new TextPaint(j6.P2);
        int v02 = j6.v0(j6.f19199i6, f6Var);
        if (this.f43310b != v02) {
            j6.B1(this.f43309a, v02, false);
            this.f43310b = v02;
        }
        b();
        c();
    }

    @Override
    public final void H(int i10, float f7, float f10, e eVar) {
        b();
        c();
        invalidateSelf();
    }

    @Override
    public final void a(int i10) {
        this.f43309a.setAlpha(i10);
        b();
        c();
    }

    public final void b() {
        Drawable drawable = this.f43295f;
        drawable.setAlpha((int) ((1.0f - this.d.e) * this.f43311c));
    }

    public final void c() {
        TextPaint textPaint = this.h;
        textPaint.setAlpha((int) ((1.0f - this.d.e) * this.f43311c));
    }

    public final void d(boolean z10, boolean z11) {
        this.d.a(z10, z11);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f43309a.draw(canvas);
        p.b(canvas, this.f43295f, 1.0f - this.d.e);
        if (this.f43296n != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(44.0f) + bounds.left, AndroidUtilities.dp(13.66f) + bounds.top);
            this.f43296n.draw(canvas);
            canvas.restore();
        }
    }

    public final void e(int i10) {
        if (this.f43298s != i10) {
            this.f43298s = i10;
            this.h.setColor(i10);
            this.f43295f.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
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
        p.d(this.f43295f, dp, exactCenterY, 17);
        int width = rect.width() - AndroidUtilities.dp(56.0f);
        if (this.f43296n != null && this.f43297r == width) {
            return;
        }
        this.f43297r = width;
        this.f43296n = new StaticLayout(LocaleController.getString(R.string.PollAddAnOption), this.h, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
