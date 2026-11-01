package xh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.dd;
import org.telegram.messenger.f8;
import org.telegram.messenger.m5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ci0;
import org.telegram.ui.Components.pv0;
public final class w extends View implements k6 {
    public final org.telegram.ui.Cells.y D;
    public boolean E;
    public int F;
    public ci0 G;
    public int H;
    public int I;
    public final RectF f54105a;
    public final Paint f54106b;
    public final TextPaint f54107c;
    public final t d;
    public final ci0 e;
    public boolean f54108f;
    public float h;
    public String f54109n;
    public StaticLayout f54110r;
    public float f54111s;
    public boolean f54112w;
    public boolean f54113x;
    public boolean f54114y;

    public w(Context context) {
        super(context);
        this.f54105a = new RectF();
        this.f54106b = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f54107c = textPaint;
        t tVar = new t(this);
        this.d = tVar;
        ci0 ci0Var = new ci0(2131623945, org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(20.0f));
        this.e = ci0Var;
        this.f54109n = dd.L0(2131752891, null);
        this.E = true;
        updateColors();
        tVar.f20156n = true;
        tVar.h = false;
        tVar.a(false, 0.0f);
        tVar.setCallback(this);
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        tVar.f20146a.setStrokeCap(Paint.Cap.ROUND);
        tVar.f20154l = true;
        int L = org.telegram.messenger.i0.L(16.0f);
        int x02 = t6.x0(null, t6.Ei, false);
        this.F = x02;
        org.telegram.ui.Cells.y k02 = t6.k0(L, L, L, L, 0, x02, x02);
        this.D = k02;
        k02.setCallback(this);
        ci0Var.setCallback(this);
        ci0Var.R(this);
        setContentDescription(dd.L0(2131754917, "AccDescrBotMenu"));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(t6.Rf));
        hashSet.add(Integer.valueOf(t6.Tf));
        hashSet.add(Integer.valueOf(t6.Ei));
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r11) {
        throw new UnsupportedOperationException("Method not decompiled: xh.w.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.D.setState(getDrawableState());
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.D.jumpToCurrentState();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int size = (View.MeasureSpec.getSize(i11) + View.MeasureSpec.getSize(i10)) << 16;
        if (this.I != size || this.f54110r == null) {
            this.d.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            TextPaint textPaint = this.f54107c;
            textPaint.setTextSize(org.telegram.messenger.i0.L(15.0f));
            this.I = size;
            CharSequence m10 = org.telegram.messenger.k6.m(this.f54109n, textPaint.getFontMetricsInt(), false, null, 0);
            int i12 = (int) (org.telegram.messenger.i0.f16172q.x * 0.6f);
            StaticLayout c10 = pv0.c(m10, textPaint, i12, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, i12, 1, true);
            this.f54110r = c10;
            if (c10.getLineCount() > 0) {
                f7 = this.f54110r.getLineWidth(0);
            } else {
                f7 = 0.0f;
            }
            this.f54111s = f7;
        }
        org.telegram.messenger.i0.L(4.0f);
        int L = org.telegram.messenger.i0.L(40.0f);
        if (this.f54108f) {
            L = m5.C(4.0f, (int) this.f54111s, L);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(L, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(32.0f), 1073741824));
    }

    public void setDrawBackgroundDrawable(boolean z10) {
        this.E = z10;
        invalidate();
    }

    public void setOpened(boolean z10) {
        float f7;
        if (this.f54112w != z10) {
            this.f54112w = z10;
        }
        int i10 = 1;
        if (this.f54113x) {
            if (this.f54114y != z10) {
                ci0 ci0Var = this.e;
                ci0Var.stop();
                ci0Var.h = true;
                if (z10) {
                    i10 = ci0Var.e[0];
                }
                ci0Var.P(i10);
                ci0Var.start();
                this.f54114y = z10;
                return;
            }
            return;
        }
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.d.a(true, f7);
    }

    public void setWebView(boolean z10) {
        this.f54113x = z10;
        invalidate();
    }

    @Override
    public final void updateColors() {
        TextPaint textPaint = this.f54107c;
        try {
            this.f54106b.setColor(t6.x0(null, t6.Rf, false));
            int x02 = t6.x0(null, t6.Tf, false);
            t tVar = this.d;
            tVar.f20153k = x02;
            tVar.f20152j = x02;
            ci0 ci0Var = this.e;
            if (ci0Var != null) {
                if (ci0Var == this.G) {
                    if (x02 != this.H) {
                    }
                }
                this.G = ci0Var;
                this.H = x02;
                ci0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
            }
            int alpha = textPaint.getAlpha();
            textPaint.setColor(x02);
            if (alpha != 255) {
                textPaint.setAlpha(alpha);
            }
            invalidate();
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && this.D != drawable) {
            return false;
        }
        return true;
    }
}
