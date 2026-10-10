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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.q5;
import yh.m5;
import yh.p7;
public final class a5 extends View {
    public final yh.u3 f51216a;
    public final e6 f51217b;
    public float f51218c;
    public float d;
    public Drawable f51219e;

    public a5(Context context, int i10, e6 e6Var) {
        super(context);
        this.f51217b = e6Var;
        yh.u3 u3Var = new yh.u3(i10, this, e6Var);
        this.f51216a = u3Var;
        u3Var.f53328y.setCallback(this);
        NotificationCenter.listenEmojiLoading(this);
    }

    public final void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, String str, boolean z10) {
        float dp;
        float f7;
        yh.u3 u3Var = this.f51216a;
        q5 q5Var = u3Var.f53310e;
        m1 m1Var = u3Var.f53314j;
        ImageReceiver imageReceiver = u3Var.d;
        u3Var.K = false;
        u3Var.N = null;
        u3Var.O = null;
        u3Var.f53320p = false;
        u3Var.f53315k = (TL_stars.starGiftAttributeBackdrop) m5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        u3Var.f53316l = (TL_stars.starGiftAttributePattern) m5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeModel stargiftattributemodel = u3Var.f53317m;
        u3Var.f53317m = (TL_stars.starGiftAttributeModel) m5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        Paint paint = u3Var.f53311f;
        u3Var.h = null;
        paint.setShader(null);
        TL_stars.starGiftAttributePattern stargiftattributepattern = u3Var.f53316l;
        if (stargiftattributepattern != null) {
            q5Var.i(stargiftattributepattern.document, false);
        } else {
            q5Var.g(null, false);
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel2 = u3Var.f53317m;
        if (stargiftattributemodel2 != null && (stargiftattributemodel == null || stargiftattributemodel.document.f20048id != stargiftattributemodel2.document.f20048id)) {
            imageReceiver.setAutoRepeatCount(0);
            imageReceiver.clearDecorators();
            imageReceiver.setAutoRepeat(0);
            p7.a1(imageReceiver, u3Var.f53317m.document, 110);
        }
        boolean z11 = tL_starGiftUnique.burned;
        u3Var.J = z11;
        if (z11) {
            int w02 = i6.w0(i6.f21041q7, u3Var.f53309c);
            Paint paint2 = (Paint) m1Var.f27132b;
            paint2.setShader(null);
            paint2.setColor(w02);
            m1Var.f(11, LocaleController.getString(R.string.Gift2UniqueRibbonBurned), true);
        } else {
            m1Var.e(u3Var.f53315k, true, false);
            m1Var.f(11, LocaleController.getString(R.string.Gift2UniqueRibbon), true);
        }
        if (u3Var.P) {
            imageReceiver.onAttachedToWindow();
            q5Var.a();
            u3Var.f53328y.d.onAttachedToWindow();
        }
        if (AndroidUtilities.isTablet()) {
            dp = AndroidUtilities.getMinTabletSide() * 0.6f;
        } else {
            dp = (AndroidUtilities.displaySize.x * 0.62f) - AndroidUtilities.dp(34.0f);
        }
        u3Var.L = Math.min((int) dp, ((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(64.0f));
        if (!AndroidUtilities.isTablet()) {
            u3Var.L = (int) (u3Var.L * 1.2f);
        }
        u3Var.L -= AndroidUtilities.dp(8.0f);
        u3Var.h(tL_starGiftUnique, j3, tL_textWithEntities, str);
        me.e eVar = u3Var.Q;
        if (z10) {
            if (eVar.f16351g) {
                f7 = eVar.f16350f;
            } else {
                f7 = eVar.f16349e;
            }
            int round = Math.round(f7);
            int i10 = u3Var.L;
            if (round != i10) {
                eVar.a(i10);
            }
        } else {
            eVar.c(u3Var.L);
        }
        requestLayout();
        invalidate();
    }

    public yh.u3 getLayout() {
        return this.f51216a;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f51216a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yh.u3 u3Var = this.f51216a;
        u3Var.P = false;
        u3Var.d.onDetachedFromWindow();
        u3Var.f53310e.b();
        m0 m0Var = u3Var.f53328y;
        m0Var.d.onDetachedFromWindow();
        b6.release((View) null, m0Var.f51407q);
        m0Var.f51407q = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        if (getParent() instanceof View) {
            i10 = ((View) getParent()).getHeight();
        } else {
            i10 = 0;
        }
        e6 e6Var = this.f51217b;
        if (e6Var != null) {
            e6Var.m(0.0f, getY(), getMeasuredWidth(), i10);
        } else {
            i6.q(0.0f, getY(), getMeasuredWidth(), i10);
        }
        yh.u3 u3Var = this.f51216a;
        this.f51218c = (getWidth() - ((int) u3Var.Q.f16349e)) / 2.0f;
        float dp = u3Var.Q.f16349e + AndroidUtilities.dp(8.0f);
        float width = (getWidth() - dp) / 2.0f;
        float dp2 = this.d - AndroidUtilities.dp(4.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width, dp2, dp + width, u3Var.M + dp2 + AndroidUtilities.dp(8.0f));
        Rect rect = AndroidUtilities.rectTmp2;
        rectF.round(rect);
        this.f51219e.setBounds(rect);
        this.f51219e.draw(canvas);
        canvas.save();
        canvas.translate(this.f51218c, this.d);
        u3Var.b(canvas);
        u3Var.c(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        yh.u3 u3Var = this.f51216a;
        this.f51218c = (size - ((int) u3Var.Q.f16349e)) / 2.0f;
        float paddingTop = getPaddingTop();
        this.d = paddingTop;
        setMeasuredDimension(size, getPaddingBottom() + ((int) paddingTop) + u3Var.M);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f51216a.e(this.f51218c, this.d, motionEvent);
    }

    public void setLayoutBackground(Drawable drawable) {
        this.f51219e = drawable;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f51216a.f53328y) {
            return false;
        }
        return true;
    }
}
