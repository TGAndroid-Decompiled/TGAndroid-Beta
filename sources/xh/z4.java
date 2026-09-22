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
import org.telegram.ui.Components.m5;
import org.telegram.ui.Components.x5;
import yh.u5;
import yh.x7;
public final class z4 extends View {
    public final yh.b4 f46239a;
    public final e6 f46240b;
    public float f46241c;
    public float d;
    public Drawable e;

    public z4(Context context, int i10, e6 e6Var) {
        super(context);
        this.f46240b = e6Var;
        yh.b4 b4Var = new yh.b4(i10, this, e6Var);
        this.f46239a = b4Var;
        b4Var.f46964y.setCallback(this);
        NotificationCenter.listenEmojiLoading(this);
    }

    public final void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, String str, boolean z10) {
        float dp;
        float f7;
        yh.b4 b4Var = this.f46239a;
        m5 m5Var = b4Var.e;
        l1 l1Var = b4Var.f46950j;
        ImageReceiver imageReceiver = b4Var.d;
        b4Var.K = false;
        b4Var.N = null;
        b4Var.O = null;
        b4Var.f46956p = false;
        b4Var.f46951k = (TL_stars.starGiftAttributeBackdrop) u5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        b4Var.f46952l = (TL_stars.starGiftAttributePattern) u5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeModel stargiftattributemodel = b4Var.f46953m;
        b4Var.f46953m = (TL_stars.starGiftAttributeModel) u5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        Paint paint = b4Var.f46947f;
        b4Var.h = null;
        paint.setShader(null);
        TL_stars.starGiftAttributePattern stargiftattributepattern = b4Var.f46952l;
        if (stargiftattributepattern != null) {
            m5Var.i(stargiftattributepattern.document, false);
        } else {
            m5Var.g(null, false);
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel2 = b4Var.f46953m;
        if (stargiftattributemodel2 != null && (stargiftattributemodel == null || stargiftattributemodel.document.f18115id != stargiftattributemodel2.document.f18115id)) {
            imageReceiver.setAutoRepeatCount(0);
            imageReceiver.clearDecorators();
            imageReceiver.setAutoRepeat(0);
            x7.Z0(imageReceiver, b4Var.f46953m.document, 110);
        }
        boolean z11 = tL_starGiftUnique.burned;
        b4Var.J = z11;
        if (z11) {
            int v02 = i6.v0(i6.f19071q7, b4Var.f46946c);
            Paint paint2 = l1Var.f27661a;
            paint2.setShader(null);
            paint2.setColor(v02);
            l1Var.e(11, LocaleController.getString(R.string.Gift2UniqueRibbonBurned), true);
        } else {
            l1Var.d(b4Var.f46951k, true, false);
            l1Var.e(11, LocaleController.getString(R.string.Gift2UniqueRibbon), true);
        }
        if (b4Var.P) {
            imageReceiver.onAttachedToWindow();
            m5Var.a();
            b4Var.f46964y.d.onAttachedToWindow();
        }
        if (AndroidUtilities.isTablet()) {
            dp = AndroidUtilities.getMinTabletSide() * 0.6f;
        } else {
            dp = (AndroidUtilities.displaySize.x * 0.62f) - AndroidUtilities.dp(34.0f);
        }
        b4Var.L = Math.min((int) dp, ((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(64.0f));
        if (!AndroidUtilities.isTablet()) {
            b4Var.L = (int) (b4Var.L * 1.2f);
        }
        b4Var.L -= AndroidUtilities.dp(8.0f);
        b4Var.h(tL_starGiftUnique, j3, tL_textWithEntities, str);
        le.e eVar = b4Var.Q;
        if (z10) {
            if (eVar.f13981g) {
                f7 = eVar.f13980f;
            } else {
                f7 = eVar.e;
            }
            int round = Math.round(f7);
            int i10 = b4Var.L;
            if (round != i10) {
                eVar.a(i10);
            }
        } else {
            eVar.c(b4Var.L);
        }
        requestLayout();
        invalidate();
    }

    public yh.b4 getLayout() {
        return this.f46239a;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        yh.b4 b4Var = this.f46239a;
        b4Var.P = true;
        if (b4Var.N != null) {
            b4Var.d.onAttachedToWindow();
            b4Var.e.a();
            b4Var.f46964y.d.onAttachedToWindow();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yh.b4 b4Var = this.f46239a;
        b4Var.P = false;
        b4Var.d.onDetachedFromWindow();
        b4Var.e.b();
        k0 k0Var = b4Var.f46964y;
        k0Var.d.onDetachedFromWindow();
        x5.release((View) null, k0Var.f45957q);
        k0Var.f45957q = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        if (getParent() instanceof View) {
            i10 = ((View) getParent()).getHeight();
        } else {
            i10 = 0;
        }
        e6 e6Var = this.f46240b;
        if (e6Var != null) {
            e6Var.m(0.0f, getY(), getMeasuredWidth(), i10);
        } else {
            i6.q(0.0f, getY(), getMeasuredWidth(), i10);
        }
        yh.b4 b4Var = this.f46239a;
        this.f46241c = (getWidth() - ((int) b4Var.Q.e)) / 2.0f;
        float dp = b4Var.Q.e + AndroidUtilities.dp(8.0f);
        float width = (getWidth() - dp) / 2.0f;
        float dp2 = this.d - AndroidUtilities.dp(4.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width, dp2, dp + width, b4Var.M + dp2 + AndroidUtilities.dp(8.0f));
        Rect rect = AndroidUtilities.rectTmp2;
        rectF.round(rect);
        this.e.setBounds(rect);
        this.e.draw(canvas);
        canvas.save();
        canvas.translate(this.f46241c, this.d);
        b4Var.a(canvas);
        b4Var.b(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        yh.b4 b4Var = this.f46239a;
        this.f46241c = (size - ((int) b4Var.Q.e)) / 2.0f;
        float paddingTop = getPaddingTop();
        this.d = paddingTop;
        setMeasuredDimension(size, getPaddingBottom() + ((int) paddingTop) + b4Var.M);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f46239a.e(this.f46241c, this.d, motionEvent);
    }

    public void setLayoutBackground(Drawable drawable) {
        this.e = drawable;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f46239a.f46964y) {
            return false;
        }
        return true;
    }
}
