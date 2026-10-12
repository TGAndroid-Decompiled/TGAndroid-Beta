package yh;

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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.q5;
import zh.n5;
import zh.p7;
public final class y4 extends View {
    public final zh.t3 f49229a;
    public final c6 f49230b;
    public float f49231c;
    public float d;
    public Drawable e;

    public y4(Context context, int i10, c6 c6Var) {
        super(context);
        this.f49230b = c6Var;
        zh.t3 t3Var = new zh.t3(i10, this, c6Var);
        this.f49229a = t3Var;
        t3Var.f51193y.setCallback(this);
        NotificationCenter.listenEmojiLoading(this);
    }

    public final void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, String str, boolean z10) {
        float dp;
        float f7;
        zh.t3 t3Var = this.f49229a;
        q5 q5Var = t3Var.e;
        k1 k1Var = t3Var.f51179j;
        ImageReceiver imageReceiver = t3Var.d;
        t3Var.K = false;
        t3Var.N = null;
        t3Var.O = null;
        t3Var.f51185p = false;
        t3Var.f51180k = (TL_stars.starGiftAttributeBackdrop) n5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        t3Var.f51181l = (TL_stars.starGiftAttributePattern) n5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeModel stargiftattributemodel = t3Var.f51182m;
        t3Var.f51182m = (TL_stars.starGiftAttributeModel) n5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        Paint paint = t3Var.f51176f;
        t3Var.h = null;
        paint.setShader(null);
        TL_stars.starGiftAttributePattern stargiftattributepattern = t3Var.f51181l;
        if (stargiftattributepattern != null) {
            q5Var.i(stargiftattributepattern.document, false);
        } else {
            q5Var.g(null, false);
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel2 = t3Var.f51182m;
        if (stargiftattributemodel2 != null && (stargiftattributemodel == null || stargiftattributemodel.document.f19222id != stargiftattributemodel2.document.f19222id)) {
            imageReceiver.setAutoRepeatCount(0);
            imageReceiver.clearDecorators();
            imageReceiver.setAutoRepeat(0);
            p7.a1(imageReceiver, t3Var.f51182m.document, 110);
        }
        boolean z11 = tL_starGiftUnique.burned;
        t3Var.J = z11;
        if (z11) {
            int w02 = g6.w0(g6.f20139q7, t3Var.f51175c);
            Paint paint2 = (Paint) k1Var.f24769b;
            paint2.setShader(null);
            paint2.setColor(w02);
            k1Var.f(11, LocaleController.getString(R.string.Gift2UniqueRibbonBurned), true);
        } else {
            k1Var.e(t3Var.f51180k, true, false);
            k1Var.f(11, LocaleController.getString(R.string.Gift2UniqueRibbon), true);
        }
        if (t3Var.P) {
            imageReceiver.onAttachedToWindow();
            q5Var.a();
            t3Var.f51193y.d.onAttachedToWindow();
        }
        if (AndroidUtilities.isTablet()) {
            dp = AndroidUtilities.getMinTabletSide() * 0.6f;
        } else {
            dp = (AndroidUtilities.displaySize.x * 0.62f) - AndroidUtilities.dp(34.0f);
        }
        t3Var.L = Math.min((int) dp, ((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(64.0f));
        if (!AndroidUtilities.isTablet()) {
            t3Var.L = (int) (t3Var.L * 1.2f);
        }
        t3Var.L -= AndroidUtilities.dp(8.0f);
        t3Var.h(tL_starGiftUnique, j10, tL_textWithEntities, str);
        ne.e eVar = t3Var.Q;
        if (z10) {
            if (eVar.f16301g) {
                f7 = eVar.f16300f;
            } else {
                f7 = eVar.e;
            }
            int round = Math.round(f7);
            int i10 = t3Var.L;
            if (round != i10) {
                eVar.a(i10);
            }
        } else {
            eVar.c(t3Var.L);
        }
        requestLayout();
        invalidate();
    }

    public zh.t3 getLayout() {
        return this.f49229a;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f49229a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zh.t3 t3Var = this.f49229a;
        t3Var.P = false;
        t3Var.d.onDetachedFromWindow();
        t3Var.e.b();
        l0 l0Var = t3Var.f51193y;
        l0Var.d.onDetachedFromWindow();
        b6.release((View) null, l0Var.f48967q);
        l0Var.f48967q = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        if (getParent() instanceof View) {
            i10 = ((View) getParent()).getHeight();
        } else {
            i10 = 0;
        }
        c6 c6Var = this.f49230b;
        if (c6Var != null) {
            c6Var.l(0.0f, getY(), getMeasuredWidth(), i10);
        } else {
            g6.q(0.0f, getY(), getMeasuredWidth(), i10);
        }
        zh.t3 t3Var = this.f49229a;
        this.f49231c = (getWidth() - ((int) t3Var.Q.e)) / 2.0f;
        float dp = t3Var.Q.e + AndroidUtilities.dp(8.0f);
        float width = (getWidth() - dp) / 2.0f;
        float dp2 = this.d - AndroidUtilities.dp(4.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width, dp2, dp + width, t3Var.M + dp2 + AndroidUtilities.dp(8.0f));
        Rect rect = AndroidUtilities.rectTmp2;
        rectF.round(rect);
        this.e.setBounds(rect);
        this.e.draw(canvas);
        canvas.save();
        canvas.translate(this.f49231c, this.d);
        t3Var.b(canvas);
        t3Var.c(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        zh.t3 t3Var = this.f49229a;
        this.f49231c = (size - ((int) t3Var.Q.e)) / 2.0f;
        float paddingTop = getPaddingTop();
        this.d = paddingTop;
        setMeasuredDimension(size, getPaddingBottom() + ((int) paddingTop) + t3Var.M);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f49229a.e(this.f49231c, this.d, motionEvent);
    }

    public void setLayoutBackground(Drawable drawable) {
        this.e = drawable;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f49229a.f51193y) {
            return false;
        }
        return true;
    }
}
