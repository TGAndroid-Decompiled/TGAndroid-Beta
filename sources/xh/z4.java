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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.q5;
import yh.n5;
import yh.p7;
public final class z4 extends View {
    public final yh.u3 f51866a;
    public final c6 f51867b;
    public float f51868c;
    public float d;
    public Drawable f51869e;

    public z4(Context context, int i10, c6 c6Var) {
        super(context);
        this.f51867b = c6Var;
        yh.u3 u3Var = new yh.u3(i10, this, c6Var);
        this.f51866a = u3Var;
        u3Var.f53508y.setCallback(this);
        NotificationCenter.listenEmojiLoading(this);
    }

    public final void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, String str, boolean z10) {
        float dp;
        float f7;
        yh.u3 u3Var = this.f51866a;
        q5 q5Var = u3Var.f53490e;
        l1 l1Var = u3Var.f53494j;
        ImageReceiver imageReceiver = u3Var.d;
        u3Var.K = false;
        u3Var.N = null;
        u3Var.O = null;
        u3Var.f53500p = false;
        u3Var.f53495k = (TL_stars.starGiftAttributeBackdrop) n5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        u3Var.f53496l = (TL_stars.starGiftAttributePattern) n5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeModel stargiftattributemodel = u3Var.f53497m;
        u3Var.f53497m = (TL_stars.starGiftAttributeModel) n5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        Paint paint = u3Var.f53491f;
        u3Var.h = null;
        paint.setShader(null);
        TL_stars.starGiftAttributePattern stargiftattributepattern = u3Var.f53496l;
        if (stargiftattributepattern != null) {
            q5Var.i(stargiftattributepattern.document, false);
        } else {
            q5Var.g(null, false);
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel2 = u3Var.f53497m;
        if (stargiftattributemodel2 != null && (stargiftattributemodel == null || stargiftattributemodel.document.f19808id != stargiftattributemodel2.document.f19808id)) {
            imageReceiver.setAutoRepeatCount(0);
            imageReceiver.clearDecorators();
            imageReceiver.setAutoRepeat(0);
            p7.a1(imageReceiver, u3Var.f53497m.document, 110);
        }
        boolean z11 = tL_starGiftUnique.burned;
        u3Var.J = z11;
        if (z11) {
            int w02 = h6.w0(h6.f20799q7, u3Var.f53489c);
            Paint paint2 = (Paint) l1Var.f27626b;
            paint2.setShader(null);
            paint2.setColor(w02);
            l1Var.f(11, LocaleController.getString(R.string.Gift2UniqueRibbonBurned), true);
        } else {
            l1Var.e(u3Var.f53495k, true, false);
            l1Var.f(11, LocaleController.getString(R.string.Gift2UniqueRibbon), true);
        }
        if (u3Var.P) {
            imageReceiver.onAttachedToWindow();
            q5Var.a();
            u3Var.f53508y.d.onAttachedToWindow();
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
            if (eVar.f16097g) {
                f7 = eVar.f16096f;
            } else {
                f7 = eVar.f16095e;
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
        return this.f51866a;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f51866a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yh.u3 u3Var = this.f51866a;
        u3Var.P = false;
        u3Var.d.onDetachedFromWindow();
        u3Var.f53490e.b();
        m0 m0Var = u3Var.f53508y;
        m0Var.d.onDetachedFromWindow();
        b6.release((View) null, m0Var.f51593q);
        m0Var.f51593q = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        if (getParent() instanceof View) {
            i10 = ((View) getParent()).getHeight();
        } else {
            i10 = 0;
        }
        c6 c6Var = this.f51867b;
        if (c6Var != null) {
            c6Var.m(0.0f, getY(), getMeasuredWidth(), i10);
        } else {
            h6.q(0.0f, getY(), getMeasuredWidth(), i10);
        }
        yh.u3 u3Var = this.f51866a;
        this.f51868c = (getWidth() - ((int) u3Var.Q.f16095e)) / 2.0f;
        float dp = u3Var.Q.f16095e + AndroidUtilities.dp(8.0f);
        float width = (getWidth() - dp) / 2.0f;
        float dp2 = this.d - AndroidUtilities.dp(4.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width, dp2, dp + width, u3Var.M + dp2 + AndroidUtilities.dp(8.0f));
        Rect rect = AndroidUtilities.rectTmp2;
        rectF.round(rect);
        this.f51869e.setBounds(rect);
        this.f51869e.draw(canvas);
        canvas.save();
        canvas.translate(this.f51868c, this.d);
        u3Var.b(canvas);
        u3Var.c(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        yh.u3 u3Var = this.f51866a;
        this.f51868c = (size - ((int) u3Var.Q.f16095e)) / 2.0f;
        float paddingTop = getPaddingTop();
        this.d = paddingTop;
        setMeasuredDimension(size, getPaddingBottom() + ((int) paddingTop) + u3Var.M);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f51866a.e(this.f51868c, this.d, motionEvent);
    }

    public void setLayoutBackground(Drawable drawable) {
        this.f51869e = drawable;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f51866a.f53508y) {
            return false;
        }
        return true;
    }
}
