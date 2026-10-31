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
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.m5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.ov0;
public final class w extends View implements k6 {
    public final org.telegram.ui.Cells.y D;
    public boolean E;
    public int F;
    public bi0 G;
    public int H;
    public int I;
    public final RectF f54084a;
    public final Paint f54085b;
    public final TextPaint f54086c;
    public final t d;
    public final bi0 e;
    public boolean f54087f;
    public float h;
    public String f54088n;
    public StaticLayout f54089r;
    public float f54090s;
    public boolean f54091w;
    public boolean f54092x;
    public boolean f54093y;

    public w(Context context) {
        super(context);
        this.f54084a = new RectF();
        this.f54085b = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.f54086c = textPaint;
        t tVar = new t(this);
        this.d = tVar;
        bi0 bi0Var = new bi0(2131623945, org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(20.0f));
        this.e = bi0Var;
        this.f54088n = cd.L0(2131752891, null);
        this.E = true;
        updateColors();
        tVar.f20155n = true;
        tVar.h = false;
        tVar.a(false, 0.0f);
        tVar.setCallback(this);
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        tVar.f20145a.setStrokeCap(Paint.Cap.ROUND);
        tVar.f20153l = true;
        int L = org.telegram.messenger.i0.L(16.0f);
        int x02 = t6.x0(null, t6.Ei, false);
        this.F = x02;
        org.telegram.ui.Cells.y k02 = t6.k0(L, L, L, L, 0, x02, x02);
        this.D = k02;
        k02.setCallback(this);
        bi0Var.setCallback(this);
        bi0Var.R(this);
        setContentDescription(cd.L0(2131754917, "AccDescrBotMenu"));
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
        if (this.I != size || this.f54089r == null) {
            this.d.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            TextPaint textPaint = this.f54086c;
            textPaint.setTextSize(org.telegram.messenger.i0.L(15.0f));
            this.I = size;
            CharSequence m10 = org.telegram.messenger.k6.m(this.f54088n, textPaint.getFontMetricsInt(), false, null, 0);
            int i12 = (int) (org.telegram.messenger.i0.f16026q.x * 0.6f);
            StaticLayout c10 = ov0.c(m10, textPaint, i12, Layout.Alignment.ALIGN_NORMAL, 0.0f, TextUtils.TruncateAt.END, i12, 1, true);
            this.f54089r = c10;
            if (c10.getLineCount() > 0) {
                f7 = this.f54089r.getLineWidth(0);
            } else {
                f7 = 0.0f;
            }
            this.f54090s = f7;
        }
        org.telegram.messenger.i0.L(4.0f);
        int L = org.telegram.messenger.i0.L(40.0f);
        if (this.f54087f) {
            L = m5.C(4.0f, (int) this.f54090s, L);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(L, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(32.0f), 1073741824));
    }

    public void setDrawBackgroundDrawable(boolean z10) {
        this.E = z10;
        invalidate();
    }

    public void setOpened(boolean z10) {
        float f7;
        if (this.f54091w != z10) {
            this.f54091w = z10;
        }
        int i10 = 1;
        if (this.f54092x) {
            if (this.f54093y != z10) {
                bi0 bi0Var = this.e;
                bi0Var.stop();
                bi0Var.h = true;
                if (z10) {
                    i10 = bi0Var.e[0];
                }
                bi0Var.P(i10);
                bi0Var.start();
                this.f54093y = z10;
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
        this.f54092x = z10;
        invalidate();
    }

    @Override
    public final void updateColors() {
        TextPaint textPaint = this.f54086c;
        try {
            this.f54085b.setColor(t6.x0(null, t6.Rf, false));
            int x02 = t6.x0(null, t6.Tf, false);
            t tVar = this.d;
            tVar.f20152k = x02;
            tVar.f20151j = x02;
            bi0 bi0Var = this.e;
            if (bi0Var != null) {
                if (bi0Var == this.G) {
                    if (x02 != this.H) {
                    }
                }
                this.G = bi0Var;
                this.H = x02;
                bi0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
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
