package yh;

import ai.ga;
import ai.m7;
import ai.md;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.a6;
import org.telegram.ui.Components.p5;
public final class y4 extends View {
    public final m7 f50607a;
    public final d6 f50608b;
    public float f50609c;
    public float d;
    public Drawable e;

    public y4(Context context, int i10, d6 d6Var) {
        super(context);
        this.f50608b = d6Var;
        m7 m7Var = new m7(i10, this, d6Var);
        this.f50607a = m7Var;
        m7Var.f1834y.setCallback(this);
        NotificationCenter.listenEmojiLoading(this);
    }

    public final void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, String str, boolean z10) {
        float dp;
        float f7;
        m7 m7Var = this.f50607a;
        p5 p5Var = m7Var.e;
        j1 j1Var = m7Var.f1820j;
        ImageReceiver imageReceiver = m7Var.d;
        m7Var.M = false;
        m7Var.P = null;
        m7Var.Q = null;
        m7Var.f1826p = false;
        m7Var.f1821k = (TL_stars.starGiftAttributeBackdrop) ga.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        m7Var.f1822l = (TL_stars.starGiftAttributePattern) ga.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeModel stargiftattributemodel = m7Var.f1823m;
        m7Var.f1823m = (TL_stars.starGiftAttributeModel) ga.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        Paint paint = m7Var.f1817f;
        m7Var.h = null;
        paint.setShader(null);
        TL_stars.starGiftAttributePattern stargiftattributepattern = m7Var.f1822l;
        if (stargiftattributepattern != null) {
            p5Var.i(stargiftattributepattern.document, false);
        } else {
            p5Var.g(null, false);
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel2 = m7Var.f1823m;
        if (stargiftattributemodel2 != null && (stargiftattributemodel == null || stargiftattributemodel.document.f20281id != stargiftattributemodel2.document.f20281id)) {
            imageReceiver.setAutoRepeatCount(0);
            imageReceiver.clearDecorators();
            imageReceiver.setAutoRepeat(0);
            md.a1(imageReceiver, m7Var.f1823m.document, 110);
        }
        boolean z11 = tL_starGiftUnique.burned;
        m7Var.L = z11;
        if (z11) {
            int w02 = h6.w0(h6.f21227q7, m7Var.f1816c);
            Paint paint2 = (Paint) j1Var.f25011b;
            paint2.setShader(null);
            paint2.setColor(w02);
            j1Var.f(11, LocaleController.getString(R.string.Gift2UniqueRibbonBurned), true);
        } else {
            j1Var.e(m7Var.f1821k, true, false);
            j1Var.f(11, LocaleController.getString(R.string.Gift2UniqueRibbon), true);
        }
        if (m7Var.R) {
            imageReceiver.onAttachedToWindow();
            p5Var.a();
            m7Var.f1834y.d.onAttachedToWindow();
        }
        if (AndroidUtilities.isTablet()) {
            dp = AndroidUtilities.getMinTabletSide() * 0.6f;
        } else {
            dp = (AndroidUtilities.displaySize.x * 0.62f) - AndroidUtilities.dp(34.0f);
        }
        m7Var.N = Math.min((int) dp, ((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(64.0f));
        if (!AndroidUtilities.isTablet()) {
            m7Var.N = (int) (m7Var.N * 1.2f);
        }
        m7Var.N -= AndroidUtilities.dp(8.0f);
        m7Var.h(tL_starGiftUnique, j10, tL_textWithEntities, str);
        ne.e eVar = m7Var.S;
        if (z10) {
            if (eVar.f17394g) {
                f7 = eVar.f17393f;
            } else {
                f7 = eVar.e;
            }
            int round = Math.round(f7);
            int i10 = m7Var.N;
            if (round != i10) {
                eVar.a(i10);
            }
        } else {
            eVar.c(m7Var.N);
        }
        requestLayout();
        invalidate();
    }

    public m7 getLayout() {
        return this.f50607a;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f50607a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m7 m7Var = this.f50607a;
        m7Var.R = false;
        m7Var.d.onDetachedFromWindow();
        m7Var.e.b();
        j0 j0Var = m7Var.f1834y;
        j0Var.d.onDetachedFromWindow();
        a6.release((View) null, j0Var.f50313q);
        j0Var.f50313q = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        if (getParent() instanceof View) {
            i10 = ((View) getParent()).getHeight();
        } else {
            i10 = 0;
        }
        d6 d6Var = this.f50608b;
        if (d6Var != null) {
            d6Var.d(0.0f, getY(), getMeasuredWidth(), i10);
        } else {
            h6.q(0.0f, getY(), getMeasuredWidth(), i10);
        }
        m7 m7Var = this.f50607a;
        this.f50609c = (getWidth() - ((int) m7Var.S.e)) / 2.0f;
        float dp = m7Var.S.e + AndroidUtilities.dp(8.0f);
        float width = (getWidth() - dp) / 2.0f;
        float dp2 = this.d - AndroidUtilities.dp(4.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width, dp2, dp + width, m7Var.O + dp2 + AndroidUtilities.dp(8.0f));
        Rect rect = AndroidUtilities.rectTmp2;
        rectF.round(rect);
        this.e.setBounds(rect);
        this.e.draw(canvas);
        canvas.save();
        canvas.translate(this.f50609c, this.d);
        m7Var.b(canvas);
        m7Var.c(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        m7 m7Var = this.f50607a;
        this.f50609c = (size - ((int) m7Var.S.e)) / 2.0f;
        float paddingTop = getPaddingTop();
        this.d = paddingTop;
        setMeasuredDimension(size, getPaddingBottom() + ((int) paddingTop) + m7Var.O);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f50607a.e(this.f50609c, this.d, motionEvent);
    }

    public void setLayoutBackground(Drawable drawable) {
        this.e = drawable;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f50607a.f1834y) {
            return false;
        }
        return true;
    }
}
