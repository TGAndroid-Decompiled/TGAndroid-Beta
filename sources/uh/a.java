package uh;

import ag.v;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import oe.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ds;
public final class a extends c implements oe.d {
    public final oe.b d;
    public final int[] e;
    public final Drawable f49933f;
    public final TextPaint h;
    public StaticLayout f49934n;
    public int f49935r;
    public int f49936s;

    public a(Context context, u6 u6Var) {
        super(u6Var);
        this.d = new oe.b(0, this, ds.h, 320L, false);
        this.e = new int[]{16842910, 16842919};
        this.f49933f = context.getResources().getDrawable(R.drawable.outline_poll_add_24).mutate();
        this.h = new TextPaint(y6.P2);
        int w02 = y6.w0(y6.f23449i6, u6Var);
        if (this.f49948b != w02) {
            y6.E1(this.f49947a, w02, false);
            this.f49948b = w02;
        }
        b();
        c();
    }

    @Override
    public final void E(int i10, float f7, float f10, e eVar) {
        b();
        c();
        invalidateSelf();
    }

    @Override
    public final void a(int i10) {
        this.f49947a.setAlpha(i10);
        b();
        c();
    }

    public final void b() {
        Drawable drawable = this.f49933f;
        drawable.setAlpha((int) ((1.0f - this.d.e) * this.f49949c));
    }

    public final void c() {
        TextPaint textPaint = this.h;
        textPaint.setAlpha((int) ((1.0f - this.d.e) * this.f49949c));
    }

    public final void d(boolean z10, boolean z11) {
        this.d.a(z10, z11);
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f49947a.draw(canvas);
        v.b(canvas, this.f49933f, 1.0f - this.d.e);
        if (this.f49934n != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.dp(44.0f) + bounds.left, AndroidUtilities.dp(13.66f) + bounds.top);
            this.f49934n.draw(canvas);
            canvas.restore();
        }
    }

    public final void e(int i10) {
        if (this.f49936s != i10) {
            this.f49936s = i10;
            this.h.setColor(i10);
            this.f49933f.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
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
        v.d(this.f49933f, dp, exactCenterY, 17);
        int width = rect.width() - AndroidUtilities.dp(56.0f);
        if (this.f49934n != null && this.f49935r == width) {
            return;
        }
        this.f49935r = width;
        this.f49934n = new StaticLayout(LocaleController.getString(R.string.PollAddAnOption), this.h, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    @Override
    public final void z(float f7, int i10) {
    }
}
