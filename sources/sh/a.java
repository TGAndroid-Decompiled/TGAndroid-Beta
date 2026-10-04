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
    public final int[] f46857e;
    public final Drawable f46858f;
    public final TextPaint h;
    public StaticLayout f46859n;
    public int f46860r;
    public int f46861s;

    public a(Context context, d6 d6Var) {
        super(d6Var);
        this.d = new le.b(0, this, tr.h, 320L, false);
        this.f46857e = new int[]{16842910, 16842919};
        this.f46858f = context.getResources().getDrawable(R.drawable.outline_poll_add_24).mutate();
        this.h = new TextPaint(i6.P2);
        int v02 = i6.v0(i6.f20913i6, d6Var);
        if (this.f46874b != v02) {
            i6.B1(this.f46873a, v02, false);
            this.f46874b = v02;
        }
        b();
        c();
    }

    @Override
    public final void a(int i10) {
        this.f46873a.setAlpha(i10);
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
        Drawable drawable = this.f46858f;
        drawable.setAlpha((int) ((1.0f - this.d.f15436e) * this.f46875c));
    }

    public final void c() {
        TextPaint textPaint = this.h;
        textPaint.setAlpha((int) ((1.0f - this.d.f15436e) * this.f46875c));
    }

    public final void d(boolean z10, boolean z11) {
        this.d.a(z10, z11);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f46873a.draw(canvas);
        p.b(canvas, this.f46858f, 1.0f - this.d.f15436e);
        if (this.f46859n != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(44.0f) + bounds.left, AndroidUtilities.dp(13.66f) + bounds.top);
            this.f46859n.draw(canvas);
            canvas.restore();
        }
    }

    public final void e(int i10) {
        if (this.f46861s != i10) {
            this.f46861s = i10;
            this.h.setColor(i10);
            this.f46858f.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
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
        p.d(this.f46858f, dp, exactCenterY, 17);
        int width = rect.width() - AndroidUtilities.dp(56.0f);
        if (this.f46859n != null && this.f46860r == width) {
            return;
        }
        this.f46860r = width;
        this.f46859n = new StaticLayout(LocaleController.getString(R.string.PollAddAnOption), this.h, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    @Override
    public final void V(float f7, int i10) {
    }
}
