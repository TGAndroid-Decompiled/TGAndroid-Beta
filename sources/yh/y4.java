package yh;

import ai.ga;
import ai.md;
import ai.n7;
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
    public final n7 f50618a;
    public final d6 f50619b;
    public float f50620c;
    public float d;
    public Drawable e;

    public y4(Context context, int i10, d6 d6Var) {
        super(context);
        this.f50619b = d6Var;
        n7 n7Var = new n7(i10, this, d6Var);
        this.f50618a = n7Var;
        n7Var.f1898y.setCallback(this);
        NotificationCenter.listenEmojiLoading(this);
    }

    public final void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, String str, boolean z10) {
        float dp;
        float f7;
        n7 n7Var = this.f50618a;
        p5 p5Var = n7Var.e;
        j1 j1Var = n7Var.f1884j;
        ImageReceiver imageReceiver = n7Var.d;
        n7Var.M = false;
        n7Var.P = null;
        n7Var.Q = null;
        n7Var.f1890p = false;
        n7Var.f1885k = (TL_stars.starGiftAttributeBackdrop) ga.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        n7Var.f1886l = (TL_stars.starGiftAttributePattern) ga.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeModel stargiftattributemodel = n7Var.f1887m;
        n7Var.f1887m = (TL_stars.starGiftAttributeModel) ga.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        Paint paint = n7Var.f1881f;
        n7Var.h = null;
        paint.setShader(null);
        TL_stars.starGiftAttributePattern stargiftattributepattern = n7Var.f1886l;
        if (stargiftattributepattern != null) {
            p5Var.i(stargiftattributepattern.document, false);
        } else {
            p5Var.g(null, false);
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel2 = n7Var.f1887m;
        if (stargiftattributemodel2 != null && (stargiftattributemodel == null || stargiftattributemodel.document.f20286id != stargiftattributemodel2.document.f20286id)) {
            imageReceiver.setAutoRepeatCount(0);
            imageReceiver.clearDecorators();
            imageReceiver.setAutoRepeat(0);
            md.a1(imageReceiver, n7Var.f1887m.document, 110);
        }
        boolean z11 = tL_starGiftUnique.burned;
        n7Var.L = z11;
        if (z11) {
            int w02 = h6.w0(h6.f21232q7, n7Var.f1880c);
            Paint paint2 = (Paint) j1Var.f25016b;
            paint2.setShader(null);
            paint2.setColor(w02);
            j1Var.f(11, LocaleController.getString(R.string.Gift2UniqueRibbonBurned), true);
        } else {
            j1Var.e(n7Var.f1885k, true, false);
            j1Var.f(11, LocaleController.getString(R.string.Gift2UniqueRibbon), true);
        }
        if (n7Var.R) {
            imageReceiver.onAttachedToWindow();
            p5Var.a();
            n7Var.f1898y.d.onAttachedToWindow();
        }
        if (AndroidUtilities.isTablet()) {
            dp = AndroidUtilities.getMinTabletSide() * 0.6f;
        } else {
            dp = (AndroidUtilities.displaySize.x * 0.62f) - AndroidUtilities.dp(34.0f);
        }
        n7Var.N = Math.min((int) dp, ((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(64.0f));
        if (!AndroidUtilities.isTablet()) {
            n7Var.N = (int) (n7Var.N * 1.2f);
        }
        n7Var.N -= AndroidUtilities.dp(8.0f);
        n7Var.h(tL_starGiftUnique, j10, tL_textWithEntities, str);
        ne.e eVar = n7Var.S;
        if (z10) {
            if (eVar.f17392g) {
                f7 = eVar.f17391f;
            } else {
                f7 = eVar.e;
            }
            int round = Math.round(f7);
            int i10 = n7Var.N;
            if (round != i10) {
                eVar.a(i10);
            }
        } else {
            eVar.c(n7Var.N);
        }
        requestLayout();
        invalidate();
    }

    public n7 getLayout() {
        return this.f50618a;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f50618a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        n7 n7Var = this.f50618a;
        n7Var.R = false;
        n7Var.d.onDetachedFromWindow();
        n7Var.e.b();
        j0 j0Var = n7Var.f1898y;
        j0Var.d.onDetachedFromWindow();
        a6.release((View) null, j0Var.f50324q);
        j0Var.f50324q = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        if (getParent() instanceof View) {
            i10 = ((View) getParent()).getHeight();
        } else {
            i10 = 0;
        }
        d6 d6Var = this.f50619b;
        if (d6Var != null) {
            d6Var.d(0.0f, getY(), getMeasuredWidth(), i10);
        } else {
            h6.q(0.0f, getY(), getMeasuredWidth(), i10);
        }
        n7 n7Var = this.f50618a;
        this.f50620c = (getWidth() - ((int) n7Var.S.e)) / 2.0f;
        float dp = n7Var.S.e + AndroidUtilities.dp(8.0f);
        float width = (getWidth() - dp) / 2.0f;
        float dp2 = this.d - AndroidUtilities.dp(4.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width, dp2, dp + width, n7Var.O + dp2 + AndroidUtilities.dp(8.0f));
        Rect rect = AndroidUtilities.rectTmp2;
        rectF.round(rect);
        this.e.setBounds(rect);
        this.e.draw(canvas);
        canvas.save();
        canvas.translate(this.f50620c, this.d);
        n7Var.b(canvas);
        n7Var.c(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        n7 n7Var = this.f50618a;
        this.f50620c = (size - ((int) n7Var.S.e)) / 2.0f;
        float paddingTop = getPaddingTop();
        this.d = paddingTop;
        setMeasuredDimension(size, getPaddingBottom() + ((int) paddingTop) + n7Var.O);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f50618a.e(this.f50620c, this.d, motionEvent);
    }

    public void setLayoutBackground(Drawable drawable) {
        this.e = drawable;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f50618a.f1898y) {
            return false;
        }
        return true;
    }
}
