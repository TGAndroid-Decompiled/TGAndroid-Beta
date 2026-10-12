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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.js;
import yf.p;
public final class a extends c implements me.d {
    public final me.b d;
    public final int[] f48391e;
    public final Drawable f48392f;
    public final TextPaint h;
    public StaticLayout f48393n;
    public int f48394r;
    public int f48395s;

    public a(Context context, c6 c6Var) {
        super(c6Var);
        this.d = new me.b(0, this, js.h, 320L, false);
        this.f48391e = new int[]{16842910, 16842919};
        this.f48392f = context.getResources().getDrawable(R.drawable.outline_poll_add_24).mutate();
        this.h = new TextPaint(h6.P2);
        int w02 = h6.w0(h6.f20650i6, c6Var);
        if (this.f48408b != w02) {
            h6.C1(this.f48407a, w02, false);
            this.f48408b = w02;
        }
        b();
        c();
    }

    @Override
    public final void a(int i10) {
        this.f48407a.setAlpha(i10);
        b();
        c();
    }

    public final void b() {
        Drawable drawable = this.f48392f;
        drawable.setAlpha((int) ((1.0f - this.d.f16087e) * this.f48409c));
    }

    public final void c() {
        TextPaint textPaint = this.h;
        textPaint.setAlpha((int) ((1.0f - this.d.f16087e) * this.f48409c));
    }

    public final void d(boolean z10, boolean z11) {
        this.d.a(z10, z11);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f48407a.draw(canvas);
        p.b(canvas, this.f48392f, 1.0f - this.d.f16087e);
        if (this.f48393n != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(44.0f) + bounds.left, AndroidUtilities.dp(13.66f) + bounds.top);
            this.f48393n.draw(canvas);
            canvas.restore();
        }
    }

    public final void e(int i10) {
        if (this.f48395s != i10) {
            this.f48395s = i10;
            this.h.setColor(i10);
            this.f48392f.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
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
        p.d(this.f48392f, dp, exactCenterY, 17);
        int width = rect.width() - AndroidUtilities.dp(56.0f);
        if (this.f48393n != null && this.f48394r == width) {
            return;
        }
        this.f48394r = width;
        this.f48393n = new StaticLayout(LocaleController.getString(R.string.PollAddAnOption), this.h, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
