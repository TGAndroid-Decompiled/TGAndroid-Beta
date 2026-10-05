package xh;

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
import org.telegram.messenger.bi;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.z5;
import yh.u5;
import yh.z7;
public final class a5 extends View {
    public final yh.a4 f49894a;
    public final d6 f49895b;
    public float f49896c;
    public float d;
    public Drawable f49897e;

    public a5(Context context, int i10, d6 d6Var) {
        super(context);
        this.f49895b = d6Var;
        yh.a4 a4Var = new yh.a4(i10, this, d6Var);
        this.f49894a = a4Var;
        a4Var.f51103y.setCallback(this);
        NotificationCenter.listenEmojiLoading(this);
    }

    public final void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, String str, boolean z10) {
        float dp;
        float f7;
        yh.a4 a4Var = this.f49894a;
        o5 o5Var = a4Var.f51085e;
        l1 l1Var = a4Var.f51089j;
        ImageReceiver imageReceiver = a4Var.d;
        a4Var.K = false;
        a4Var.N = null;
        a4Var.O = null;
        a4Var.f51095p = false;
        a4Var.f51090k = (TL_stars.starGiftAttributeBackdrop) u5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        a4Var.f51091l = (TL_stars.starGiftAttributePattern) u5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeModel stargiftattributemodel = a4Var.f51092m;
        a4Var.f51092m = (TL_stars.starGiftAttributeModel) u5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        Paint paint = a4Var.f51086f;
        a4Var.h = null;
        paint.setShader(null);
        TL_stars.starGiftAttributePattern stargiftattributepattern = a4Var.f51091l;
        if (stargiftattributepattern != null) {
            o5Var.i(stargiftattributepattern.document, false);
        } else {
            o5Var.g(null, false);
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel2 = a4Var.f51092m;
        if (stargiftattributemodel2 != null && (stargiftattributemodel == null || stargiftattributemodel.document.f20053id != stargiftattributemodel2.document.f20053id)) {
            imageReceiver.setAutoRepeatCount(0);
            imageReceiver.clearDecorators();
            imageReceiver.setAutoRepeat(0);
            z7.f1(imageReceiver, a4Var.f51092m.document, 110);
        }
        boolean z11 = tL_starGiftUnique.burned;
        a4Var.J = z11;
        if (z11) {
            int v02 = i6.v0(i6.f21068q7, a4Var.f51084c);
            Paint paint2 = l1Var.f31500a;
            paint2.setShader(null);
            paint2.setColor(v02);
            l1Var.e(11, LocaleController.getString(R.string.Gift2UniqueRibbonBurned), true);
        } else {
            l1Var.d(a4Var.f51090k, true, false);
            l1Var.e(11, LocaleController.getString(R.string.Gift2UniqueRibbon), true);
        }
        if (a4Var.P) {
            imageReceiver.onAttachedToWindow();
            o5Var.a();
            a4Var.f51103y.d.onAttachedToWindow();
        }
        if (AndroidUtilities.isTablet()) {
            dp = AndroidUtilities.getMinTabletSide() * 0.6f;
        } else {
            dp = (AndroidUtilities.displaySize.x * 0.62f) - AndroidUtilities.dp(34.0f);
        }
        a4Var.L = bi.C(64.0f, (AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight, (int) dp);
        if (!AndroidUtilities.isTablet()) {
            a4Var.L = (int) (a4Var.L * 1.2f);
        }
        a4Var.L -= AndroidUtilities.dp(8.0f);
        a4Var.h(tL_starGiftUnique, j3, tL_textWithEntities, str);
        le.e eVar = a4Var.Q;
        if (z10) {
            if (eVar.f15446g) {
                f7 = eVar.f15445f;
            } else {
                f7 = eVar.f15444e;
            }
            int round = Math.round(f7);
            int i10 = a4Var.L;
            if (round != i10) {
                eVar.a(i10);
            }
        } else {
            eVar.c(a4Var.L);
        }
        requestLayout();
        invalidate();
    }

    public yh.a4 getLayout() {
        return this.f49894a;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        yh.a4 a4Var = this.f49894a;
        a4Var.P = true;
        if (a4Var.N != null) {
            a4Var.d.onAttachedToWindow();
            a4Var.f51085e.a();
            a4Var.f51103y.d.onAttachedToWindow();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yh.a4 a4Var = this.f49894a;
        a4Var.P = false;
        a4Var.d.onDetachedFromWindow();
        a4Var.f51085e.b();
        k0 k0Var = a4Var.f51103y;
        k0Var.d.onDetachedFromWindow();
        z5.release((View) null, k0Var.f50072q);
        k0Var.f50072q = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        if (getParent() instanceof View) {
            i10 = ((View) getParent()).getHeight();
        } else {
            i10 = 0;
        }
        d6 d6Var = this.f49895b;
        if (d6Var != null) {
            d6Var.m(0.0f, getY(), getMeasuredWidth(), i10);
        } else {
            i6.q(0.0f, getY(), getMeasuredWidth(), i10);
        }
        yh.a4 a4Var = this.f49894a;
        this.f49896c = (getWidth() - ((int) a4Var.Q.f15444e)) / 2.0f;
        float dp = a4Var.Q.f15444e + AndroidUtilities.dp(8.0f);
        float width = (getWidth() - dp) / 2.0f;
        float dp2 = this.d - AndroidUtilities.dp(4.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width, dp2, dp + width, a4Var.M + dp2 + AndroidUtilities.dp(8.0f));
        Rect rect = AndroidUtilities.rectTmp2;
        rectF.round(rect);
        this.f49897e.setBounds(rect);
        this.f49897e.draw(canvas);
        canvas.save();
        canvas.translate(this.f49896c, this.d);
        a4Var.a(canvas);
        a4Var.b(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        yh.a4 a4Var = this.f49894a;
        this.f49896c = (size - ((int) a4Var.Q.f15444e)) / 2.0f;
        float paddingTop = getPaddingTop();
        this.d = paddingTop;
        setMeasuredDimension(size, getPaddingBottom() + ((int) paddingTop) + a4Var.M);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f49894a.e(this.f49896c, this.d, motionEvent);
    }

    public void setLayoutBackground(Drawable drawable) {
        this.f49897e = drawable;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f49894a.f51103y) {
            return false;
        }
        return true;
    }
}
