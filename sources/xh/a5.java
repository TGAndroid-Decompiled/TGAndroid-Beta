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
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.z5;
import yh.s5;
import yh.w7;
public final class a5 extends View {
    public final yh.z3 f46075a;
    public final d6 f46076b;
    public float f46077c;
    public float d;
    public Drawable e;

    public a5(Context context, int i10, d6 d6Var) {
        super(context);
        this.f46076b = d6Var;
        yh.z3 z3Var = new yh.z3(i10, this, d6Var);
        this.f46075a = z3Var;
        z3Var.f48336y.setCallback(this);
        NotificationCenter.listenEmojiLoading(this);
    }

    public final void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, String str, boolean z10) {
        float dp;
        float f7;
        yh.z3 z3Var = this.f46075a;
        o5 o5Var = z3Var.e;
        m1 m1Var = z3Var.f48322j;
        ImageReceiver imageReceiver = z3Var.d;
        z3Var.K = false;
        z3Var.N = null;
        z3Var.O = null;
        z3Var.f48328p = false;
        z3Var.f48323k = (TL_stars.starGiftAttributeBackdrop) s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        z3Var.f48324l = (TL_stars.starGiftAttributePattern) s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeModel stargiftattributemodel = z3Var.f48325m;
        z3Var.f48325m = (TL_stars.starGiftAttributeModel) s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        Paint paint = z3Var.f48319f;
        z3Var.h = null;
        paint.setShader(null);
        TL_stars.starGiftAttributePattern stargiftattributepattern = z3Var.f48324l;
        if (stargiftattributepattern != null) {
            o5Var.i(stargiftattributepattern.document, false);
        } else {
            o5Var.g(null, false);
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel2 = z3Var.f48325m;
        if (stargiftattributemodel2 != null && (stargiftattributemodel == null || stargiftattributemodel.document.f18341id != stargiftattributemodel2.document.f18341id)) {
            imageReceiver.setAutoRepeatCount(0);
            imageReceiver.clearDecorators();
            imageReceiver.setAutoRepeat(0);
            w7.Z0(imageReceiver, z3Var.f48325m.document, 110);
        }
        boolean z11 = tL_starGiftUnique.burned;
        z3Var.J = z11;
        if (z11) {
            int v02 = h6.v0(h6.f19298q7, z3Var.f48318c);
            Paint paint2 = m1Var.f28594a;
            paint2.setShader(null);
            paint2.setColor(v02);
            m1Var.e(11, LocaleController.getString(R.string.Gift2UniqueRibbonBurned), true);
        } else {
            m1Var.d(z3Var.f48323k, true, false);
            m1Var.e(11, LocaleController.getString(R.string.Gift2UniqueRibbon), true);
        }
        if (z3Var.P) {
            imageReceiver.onAttachedToWindow();
            o5Var.a();
            z3Var.f48336y.d.onAttachedToWindow();
        }
        if (AndroidUtilities.isTablet()) {
            dp = AndroidUtilities.getMinTabletSide() * 0.6f;
        } else {
            dp = (AndroidUtilities.displaySize.x * 0.62f) - AndroidUtilities.dp(34.0f);
        }
        z3Var.L = Math.min((int) dp, ((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(64.0f));
        if (!AndroidUtilities.isTablet()) {
            z3Var.L = (int) (z3Var.L * 1.2f);
        }
        z3Var.L -= AndroidUtilities.dp(8.0f);
        z3Var.h(tL_starGiftUnique, j3, tL_textWithEntities, str);
        le.f fVar = z3Var.Q;
        if (z10) {
            if (fVar.f14209g) {
                f7 = fVar.f14208f;
            } else {
                f7 = fVar.e;
            }
            int round = Math.round(f7);
            int i10 = z3Var.L;
            if (round != i10) {
                fVar.a(i10);
            }
        } else {
            fVar.c(z3Var.L);
        }
        requestLayout();
        invalidate();
    }

    public yh.z3 getLayout() {
        return this.f46075a;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        yh.z3 z3Var = this.f46075a;
        z3Var.P = true;
        if (z3Var.N != null) {
            z3Var.d.onAttachedToWindow();
            z3Var.e.a();
            z3Var.f48336y.d.onAttachedToWindow();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yh.z3 z3Var = this.f46075a;
        z3Var.P = false;
        z3Var.d.onDetachedFromWindow();
        z3Var.e.b();
        k0 k0Var = z3Var.f48336y;
        k0Var.d.onDetachedFromWindow();
        z5.release((View) null, k0Var.f46244q);
        k0Var.f46244q = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        if (getParent() instanceof View) {
            i10 = ((View) getParent()).getHeight();
        } else {
            i10 = 0;
        }
        d6 d6Var = this.f46076b;
        if (d6Var != null) {
            d6Var.m(0.0f, getY(), getMeasuredWidth(), i10);
        } else {
            h6.q(0.0f, getY(), getMeasuredWidth(), i10);
        }
        yh.z3 z3Var = this.f46075a;
        this.f46077c = (getWidth() - ((int) z3Var.Q.e)) / 2.0f;
        float dp = z3Var.Q.e + AndroidUtilities.dp(8.0f);
        float width = (getWidth() - dp) / 2.0f;
        float dp2 = this.d - AndroidUtilities.dp(4.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width, dp2, dp + width, z3Var.M + dp2 + AndroidUtilities.dp(8.0f));
        Rect rect = AndroidUtilities.rectTmp2;
        rectF.round(rect);
        this.e.setBounds(rect);
        this.e.draw(canvas);
        canvas.save();
        canvas.translate(this.f46077c, this.d);
        z3Var.a(canvas);
        z3Var.b(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        yh.z3 z3Var = this.f46075a;
        this.f46077c = (size - ((int) z3Var.Q.e)) / 2.0f;
        float paddingTop = getPaddingTop();
        this.d = paddingTop;
        setMeasuredDimension(size, getPaddingBottom() + ((int) paddingTop) + z3Var.M);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f46075a.e(this.f46077c, this.d, motionEvent);
    }

    public void setLayoutBackground(Drawable drawable) {
        this.e = drawable;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f46075a.f48336y) {
            return false;
        }
        return true;
    }
}
