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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.n5;
import org.telegram.ui.Components.y5;
import yh.u5;
import yh.w7;
public final class a5 extends View {
    public final yh.a4 f46096a;
    public final f6 f46097b;
    public float f46098c;
    public float d;
    public Drawable e;

    public a5(Context context, int i10, f6 f6Var) {
        super(context);
        this.f46097b = f6Var;
        yh.a4 a4Var = new yh.a4(i10, this, f6Var);
        this.f46096a = a4Var;
        a4Var.f47249y.setCallback(this);
        NotificationCenter.listenEmojiLoading(this);
    }

    public final void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, String str, boolean z10) {
        float dp;
        float f7;
        yh.a4 a4Var = this.f46096a;
        n5 n5Var = a4Var.e;
        m1 m1Var = a4Var.f47235j;
        ImageReceiver imageReceiver = a4Var.d;
        a4Var.K = false;
        a4Var.N = null;
        a4Var.O = null;
        a4Var.f47241p = false;
        a4Var.f47236k = (TL_stars.starGiftAttributeBackdrop) u5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        a4Var.f47237l = (TL_stars.starGiftAttributePattern) u5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeModel stargiftattributemodel = a4Var.f47238m;
        a4Var.f47238m = (TL_stars.starGiftAttributeModel) u5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        Paint paint = a4Var.f47232f;
        a4Var.h = null;
        paint.setShader(null);
        TL_stars.starGiftAttributePattern stargiftattributepattern = a4Var.f47237l;
        if (stargiftattributepattern != null) {
            n5Var.i(stargiftattributepattern.document, false);
        } else {
            n5Var.g(null, false);
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel2 = a4Var.f47238m;
        if (stargiftattributemodel2 != null && (stargiftattributemodel == null || stargiftattributemodel.document.f18334id != stargiftattributemodel2.document.f18334id)) {
            imageReceiver.setAutoRepeatCount(0);
            imageReceiver.clearDecorators();
            imageReceiver.setAutoRepeat(0);
            w7.Z0(imageReceiver, a4Var.f47238m.document, 110);
        }
        boolean z11 = tL_starGiftUnique.burned;
        a4Var.J = z11;
        if (z11) {
            int v02 = j6.v0(j6.f19333q7, a4Var.f47231c);
            Paint paint2 = m1Var.f27939a;
            paint2.setShader(null);
            paint2.setColor(v02);
            m1Var.e(11, LocaleController.getString(R.string.Gift2UniqueRibbonBurned), true);
        } else {
            m1Var.d(a4Var.f47236k, true, false);
            m1Var.e(11, LocaleController.getString(R.string.Gift2UniqueRibbon), true);
        }
        if (a4Var.P) {
            imageReceiver.onAttachedToWindow();
            n5Var.a();
            a4Var.f47249y.d.onAttachedToWindow();
        }
        if (AndroidUtilities.isTablet()) {
            dp = AndroidUtilities.getMinTabletSide() * 0.6f;
        } else {
            dp = (AndroidUtilities.displaySize.x * 0.62f) - AndroidUtilities.dp(34.0f);
        }
        a4Var.L = Math.min((int) dp, ((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(64.0f));
        if (!AndroidUtilities.isTablet()) {
            a4Var.L = (int) (a4Var.L * 1.2f);
        }
        a4Var.L -= AndroidUtilities.dp(8.0f);
        a4Var.h(tL_starGiftUnique, j3, tL_textWithEntities, str);
        le.e eVar = a4Var.Q;
        if (z10) {
            if (eVar.f14178g) {
                f7 = eVar.f14177f;
            } else {
                f7 = eVar.e;
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
        return this.f46096a;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        yh.a4 a4Var = this.f46096a;
        a4Var.P = true;
        if (a4Var.N != null) {
            a4Var.d.onAttachedToWindow();
            a4Var.e.a();
            a4Var.f47249y.d.onAttachedToWindow();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yh.a4 a4Var = this.f46096a;
        a4Var.P = false;
        a4Var.d.onDetachedFromWindow();
        a4Var.e.b();
        k0 k0Var = a4Var.f47249y;
        k0Var.d.onDetachedFromWindow();
        y5.release((View) null, k0Var.f46265q);
        k0Var.f46265q = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        if (getParent() instanceof View) {
            i10 = ((View) getParent()).getHeight();
        } else {
            i10 = 0;
        }
        f6 f6Var = this.f46097b;
        if (f6Var != null) {
            f6Var.m(0.0f, getY(), getMeasuredWidth(), i10);
        } else {
            j6.q(0.0f, getY(), getMeasuredWidth(), i10);
        }
        yh.a4 a4Var = this.f46096a;
        this.f46098c = (getWidth() - ((int) a4Var.Q.e)) / 2.0f;
        float dp = a4Var.Q.e + AndroidUtilities.dp(8.0f);
        float width = (getWidth() - dp) / 2.0f;
        float dp2 = this.d - AndroidUtilities.dp(4.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width, dp2, dp + width, a4Var.M + dp2 + AndroidUtilities.dp(8.0f));
        Rect rect = AndroidUtilities.rectTmp2;
        rectF.round(rect);
        this.e.setBounds(rect);
        this.e.draw(canvas);
        canvas.save();
        canvas.translate(this.f46098c, this.d);
        a4Var.a(canvas);
        a4Var.b(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        yh.a4 a4Var = this.f46096a;
        this.f46098c = (size - ((int) a4Var.Q.e)) / 2.0f;
        float paddingTop = getPaddingTop();
        this.d = paddingTop;
        setMeasuredDimension(size, getPaddingBottom() + ((int) paddingTop) + a4Var.M);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f46096a.e(this.f46098c, this.d, motionEvent);
    }

    public void setLayoutBackground(Drawable drawable) {
        this.e = drawable;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f46096a.f47249y) {
            return false;
        }
        return true;
    }
}
