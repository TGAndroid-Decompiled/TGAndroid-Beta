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
import yh.t5;
import yh.x7;
public final class a5 extends View {
    public final yh.z3 f49887a;
    public final d6 f49888b;
    public float f49889c;
    public float d;
    public Drawable f49890e;

    public a5(Context context, int i10, d6 d6Var) {
        super(context);
        this.f49888b = d6Var;
        yh.z3 z3Var = new yh.z3(i10, this, d6Var);
        this.f49887a = z3Var;
        z3Var.f52335y.setCallback(this);
        NotificationCenter.listenEmojiLoading(this);
    }

    public final void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, String str, boolean z10) {
        float dp;
        float f7;
        yh.z3 z3Var = this.f49887a;
        o5 o5Var = z3Var.f52317e;
        l1 l1Var = z3Var.f52321j;
        ImageReceiver imageReceiver = z3Var.d;
        z3Var.K = false;
        z3Var.N = null;
        z3Var.O = null;
        z3Var.f52327p = false;
        z3Var.f52322k = (TL_stars.starGiftAttributeBackdrop) t5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        z3Var.f52323l = (TL_stars.starGiftAttributePattern) t5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeModel stargiftattributemodel = z3Var.f52324m;
        z3Var.f52324m = (TL_stars.starGiftAttributeModel) t5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        Paint paint = z3Var.f52318f;
        z3Var.h = null;
        paint.setShader(null);
        TL_stars.starGiftAttributePattern stargiftattributepattern = z3Var.f52323l;
        if (stargiftattributepattern != null) {
            o5Var.i(stargiftattributepattern.document, false);
        } else {
            o5Var.g(null, false);
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel2 = z3Var.f52324m;
        if (stargiftattributemodel2 != null && (stargiftattributemodel == null || stargiftattributemodel.document.f20048id != stargiftattributemodel2.document.f20048id)) {
            imageReceiver.setAutoRepeatCount(0);
            imageReceiver.clearDecorators();
            imageReceiver.setAutoRepeat(0);
            x7.f1(imageReceiver, z3Var.f52324m.document, 110);
        }
        boolean z11 = tL_starGiftUnique.burned;
        z3Var.J = z11;
        if (z11) {
            int v02 = i6.v0(i6.f21063q7, z3Var.f52316c);
            Paint paint2 = l1Var.f31426a;
            paint2.setShader(null);
            paint2.setColor(v02);
            l1Var.e(11, LocaleController.getString(R.string.Gift2UniqueRibbonBurned), true);
        } else {
            l1Var.d(z3Var.f52322k, true, false);
            l1Var.e(11, LocaleController.getString(R.string.Gift2UniqueRibbon), true);
        }
        if (z3Var.P) {
            imageReceiver.onAttachedToWindow();
            o5Var.a();
            z3Var.f52335y.d.onAttachedToWindow();
        }
        if (AndroidUtilities.isTablet()) {
            dp = AndroidUtilities.getMinTabletSide() * 0.6f;
        } else {
            dp = (AndroidUtilities.displaySize.x * 0.62f) - AndroidUtilities.dp(34.0f);
        }
        z3Var.L = bi.C(64.0f, (AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight, (int) dp);
        if (!AndroidUtilities.isTablet()) {
            z3Var.L = (int) (z3Var.L * 1.2f);
        }
        z3Var.L -= AndroidUtilities.dp(8.0f);
        z3Var.h(tL_starGiftUnique, j3, tL_textWithEntities, str);
        le.e eVar = z3Var.Q;
        if (z10) {
            if (eVar.f15446g) {
                f7 = eVar.f15445f;
            } else {
                f7 = eVar.f15444e;
            }
            int round = Math.round(f7);
            int i10 = z3Var.L;
            if (round != i10) {
                eVar.a(i10);
            }
        } else {
            eVar.c(z3Var.L);
        }
        requestLayout();
        invalidate();
    }

    public yh.z3 getLayout() {
        return this.f49887a;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        yh.z3 z3Var = this.f49887a;
        z3Var.P = true;
        if (z3Var.N != null) {
            z3Var.d.onAttachedToWindow();
            z3Var.f52317e.a();
            z3Var.f52335y.d.onAttachedToWindow();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yh.z3 z3Var = this.f49887a;
        z3Var.P = false;
        z3Var.d.onDetachedFromWindow();
        z3Var.f52317e.b();
        k0 k0Var = z3Var.f52335y;
        k0Var.d.onDetachedFromWindow();
        z5.release((View) null, k0Var.f50065q);
        k0Var.f50065q = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        if (getParent() instanceof View) {
            i10 = ((View) getParent()).getHeight();
        } else {
            i10 = 0;
        }
        d6 d6Var = this.f49888b;
        if (d6Var != null) {
            d6Var.m(0.0f, getY(), getMeasuredWidth(), i10);
        } else {
            i6.q(0.0f, getY(), getMeasuredWidth(), i10);
        }
        yh.z3 z3Var = this.f49887a;
        this.f49889c = (getWidth() - ((int) z3Var.Q.f15444e)) / 2.0f;
        float dp = z3Var.Q.f15444e + AndroidUtilities.dp(8.0f);
        float width = (getWidth() - dp) / 2.0f;
        float dp2 = this.d - AndroidUtilities.dp(4.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width, dp2, dp + width, z3Var.M + dp2 + AndroidUtilities.dp(8.0f));
        Rect rect = AndroidUtilities.rectTmp2;
        rectF.round(rect);
        this.f49890e.setBounds(rect);
        this.f49890e.draw(canvas);
        canvas.save();
        canvas.translate(this.f49889c, this.d);
        z3Var.a(canvas);
        z3Var.b(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        yh.z3 z3Var = this.f49887a;
        this.f49889c = (size - ((int) z3Var.Q.f15444e)) / 2.0f;
        float paddingTop = getPaddingTop();
        this.d = paddingTop;
        setMeasuredDimension(size, getPaddingBottom() + ((int) paddingTop) + z3Var.M);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f49887a.e(this.f49889c, this.d, motionEvent);
    }

    public void setLayoutBackground(Drawable drawable) {
        this.f49890e = drawable;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f49887a.f52335y) {
            return false;
        }
        return true;
    }
}
