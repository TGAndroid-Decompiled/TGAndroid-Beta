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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.z5;
import zh.s5;
import zh.v7;
public final class y4 extends View {
    public final zh.y3 f50658a;
    public final f6 f50659b;
    public float f50660c;
    public float d;
    public Drawable f50661e;

    public y4(Context context, int i10, f6 f6Var) {
        super(context);
        this.f50659b = f6Var;
        zh.y3 y3Var = new zh.y3(i10, this, f6Var);
        this.f50658a = y3Var;
        y3Var.f52893y.setCallback(this);
        NotificationCenter.listenEmojiLoading(this);
    }

    public final void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, String str, boolean z10) {
        float dp;
        float f7;
        zh.y3 y3Var = this.f50658a;
        o5 o5Var = y3Var.f52875e;
        k1 k1Var = y3Var.f52879j;
        ImageReceiver imageReceiver = y3Var.d;
        y3Var.K = false;
        y3Var.N = null;
        y3Var.O = null;
        y3Var.f52885p = false;
        y3Var.f52880k = (TL_stars.starGiftAttributeBackdrop) s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        y3Var.f52881l = (TL_stars.starGiftAttributePattern) s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeModel stargiftattributemodel = y3Var.f52882m;
        y3Var.f52882m = (TL_stars.starGiftAttributeModel) s5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        Paint paint = y3Var.f52876f;
        y3Var.h = null;
        paint.setShader(null);
        TL_stars.starGiftAttributePattern stargiftattributepattern = y3Var.f52881l;
        if (stargiftattributepattern != null) {
            o5Var.i(stargiftattributepattern.document, false);
        } else {
            o5Var.g(null, false);
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel2 = y3Var.f52882m;
        if (stargiftattributemodel2 != null && (stargiftattributemodel == null || stargiftattributemodel.document.f19875id != stargiftattributemodel2.document.f19875id)) {
            imageReceiver.setAutoRepeatCount(0);
            imageReceiver.clearDecorators();
            imageReceiver.setAutoRepeat(0);
            v7.Z0(imageReceiver, y3Var.f52882m.document, 110);
        }
        boolean z11 = tL_starGiftUnique.burned;
        y3Var.J = z11;
        if (z11) {
            int v02 = j6.v0(j6.f20898q7, y3Var.f52874c);
            Paint paint2 = k1Var.f29797a;
            paint2.setShader(null);
            paint2.setColor(v02);
            k1Var.e(11, LocaleController.getString(R.string.Gift2UniqueRibbonBurned), true);
        } else {
            k1Var.d(y3Var.f52880k, true, false);
            k1Var.e(11, LocaleController.getString(R.string.Gift2UniqueRibbon), true);
        }
        if (y3Var.P) {
            imageReceiver.onAttachedToWindow();
            o5Var.a();
            y3Var.f52893y.d.onAttachedToWindow();
        }
        if (AndroidUtilities.isTablet()) {
            dp = AndroidUtilities.getMinTabletSide() * 0.6f;
        } else {
            dp = (AndroidUtilities.displaySize.x * 0.62f) - AndroidUtilities.dp(34.0f);
        }
        y3Var.L = Math.min((int) dp, ((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(64.0f));
        if (!AndroidUtilities.isTablet()) {
            y3Var.L = (int) (y3Var.L * 1.2f);
        }
        y3Var.L -= AndroidUtilities.dp(8.0f);
        y3Var.h(tL_starGiftUnique, j3, tL_textWithEntities, str);
        le.e eVar = y3Var.Q;
        if (z10) {
            if (eVar.f15378g) {
                f7 = eVar.f15377f;
            } else {
                f7 = eVar.f15376e;
            }
            int round = Math.round(f7);
            int i10 = y3Var.L;
            if (round != i10) {
                eVar.a(i10);
            }
        } else {
            eVar.c(y3Var.L);
        }
        requestLayout();
        invalidate();
    }

    public zh.y3 getLayout() {
        return this.f50658a;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        zh.y3 y3Var = this.f50658a;
        y3Var.P = true;
        if (y3Var.N != null) {
            y3Var.d.onAttachedToWindow();
            y3Var.f52875e.a();
            y3Var.f52893y.d.onAttachedToWindow();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zh.y3 y3Var = this.f50658a;
        y3Var.P = false;
        y3Var.d.onDetachedFromWindow();
        y3Var.f52875e.b();
        k0 k0Var = y3Var.f52893y;
        k0Var.d.onDetachedFromWindow();
        z5.release((View) null, k0Var.f50370q);
        k0Var.f50370q = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        if (getParent() instanceof View) {
            i10 = ((View) getParent()).getHeight();
        } else {
            i10 = 0;
        }
        f6 f6Var = this.f50659b;
        if (f6Var != null) {
            f6Var.l(0.0f, getY(), getMeasuredWidth(), i10);
        } else {
            j6.q(0.0f, getY(), getMeasuredWidth(), i10);
        }
        zh.y3 y3Var = this.f50658a;
        this.f50660c = (getWidth() - ((int) y3Var.Q.f15376e)) / 2.0f;
        float dp = y3Var.Q.f15376e + AndroidUtilities.dp(8.0f);
        float width = (getWidth() - dp) / 2.0f;
        float dp2 = this.d - AndroidUtilities.dp(4.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width, dp2, dp + width, y3Var.M + dp2 + AndroidUtilities.dp(8.0f));
        Rect rect = AndroidUtilities.rectTmp2;
        rectF.round(rect);
        this.f50661e.setBounds(rect);
        this.f50661e.draw(canvas);
        canvas.save();
        canvas.translate(this.f50660c, this.d);
        y3Var.a(canvas);
        y3Var.b(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        zh.y3 y3Var = this.f50658a;
        this.f50660c = (size - ((int) y3Var.Q.f15376e)) / 2.0f;
        float paddingTop = getPaddingTop();
        this.d = paddingTop;
        setMeasuredDimension(size, getPaddingBottom() + ((int) paddingTop) + y3Var.M);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f50658a.e(this.f50660c, this.d, motionEvent);
    }

    public void setLayoutBackground(Drawable drawable) {
        this.f50661e = drawable;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f50658a.f52893y) {
            return false;
        }
        return true;
    }
}
