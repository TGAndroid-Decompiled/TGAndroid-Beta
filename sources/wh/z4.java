package wh;

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
import xh.v5;
import xh.z7;
public final class z4 extends View {
    public final xh.z3 f44470a;
    public final f6 f44471b;
    public float f44472c;
    public float d;
    public Drawable e;

    public z4(Context context, int i10, f6 f6Var) {
        super(context);
        this.f44471b = f6Var;
        xh.z3 z3Var = new xh.z3(i10, this, f6Var);
        this.f44470a = z3Var;
        z3Var.f46373y.setCallback(this);
        NotificationCenter.listenEmojiLoading(this);
    }

    public final void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, String str, boolean z10) {
        float dp;
        float f7;
        xh.z3 z3Var = this.f44470a;
        n5 n5Var = z3Var.e;
        k1 k1Var = z3Var.f46359j;
        ImageReceiver imageReceiver = z3Var.d;
        z3Var.K = false;
        z3Var.N = null;
        z3Var.O = null;
        z3Var.f46365p = false;
        z3Var.f46360k = (TL_stars.starGiftAttributeBackdrop) v5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        z3Var.f46361l = (TL_stars.starGiftAttributePattern) v5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeModel stargiftattributemodel = z3Var.f46362m;
        z3Var.f46362m = (TL_stars.starGiftAttributeModel) v5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        Paint paint = z3Var.f46356f;
        z3Var.h = null;
        paint.setShader(null);
        TL_stars.starGiftAttributePattern stargiftattributepattern = z3Var.f46361l;
        if (stargiftattributepattern != null) {
            n5Var.i(stargiftattributepattern.document, false);
        } else {
            n5Var.g(null, false);
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel2 = z3Var.f46362m;
        if (stargiftattributemodel2 != null && (stargiftattributemodel == null || stargiftattributemodel.document.f17201id != stargiftattributemodel2.document.f17201id)) {
            imageReceiver.setAutoRepeatCount(0);
            imageReceiver.clearDecorators();
            imageReceiver.setAutoRepeat(0);
            z7.Z0(imageReceiver, z3Var.f46362m.document, 110);
        }
        boolean z11 = tL_starGiftUnique.burned;
        z3Var.J = z11;
        if (z11) {
            int v02 = j6.v0(j6.f18162q7, z3Var.f46355c);
            Paint paint2 = k1Var.f29125a;
            paint2.setShader(null);
            paint2.setColor(v02);
            k1Var.e(11, LocaleController.getString(R.string.Gift2UniqueRibbonBurned), true);
        } else {
            k1Var.d(z3Var.f46360k, true, false);
            k1Var.e(11, LocaleController.getString(R.string.Gift2UniqueRibbon), true);
        }
        if (z3Var.P) {
            imageReceiver.onAttachedToWindow();
            n5Var.a();
            z3Var.f46373y.d.onAttachedToWindow();
        }
        if (AndroidUtilities.isTablet()) {
            dp = AndroidUtilities.getMinTabletSide() * 0.6f;
        } else {
            dp = (AndroidUtilities.displaySize.x * 0.62f) - AndroidUtilities.dp(34.0f);
        }
        z3Var.L = Math.min((int) dp, ((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(64.0f));
        if (!AndroidUtilities.isTablet()) {
            z3Var.L = (int) (z3Var.L * 1.2f);
        }
        z3Var.L -= AndroidUtilities.dp(8.0f);
        z3Var.h(tL_starGiftUnique, j3, tL_textWithEntities, str);
        le.e eVar = z3Var.Q;
        if (z10) {
            if (eVar.f12878g) {
                f7 = eVar.f12877f;
            } else {
                f7 = eVar.e;
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

    public xh.z3 getLayout() {
        return this.f44470a;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        xh.z3 z3Var = this.f44470a;
        z3Var.P = true;
        if (z3Var.N != null) {
            z3Var.d.onAttachedToWindow();
            z3Var.e.a();
            z3Var.f46373y.d.onAttachedToWindow();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        xh.z3 z3Var = this.f44470a;
        z3Var.P = false;
        z3Var.d.onDetachedFromWindow();
        z3Var.e.b();
        l0 l0Var = z3Var.f46373y;
        l0Var.d.onDetachedFromWindow();
        y5.release((View) null, l0Var.f44193q);
        l0Var.f44193q = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        if (getParent() instanceof View) {
            i10 = ((View) getParent()).getHeight();
        } else {
            i10 = 0;
        }
        f6 f6Var = this.f44471b;
        if (f6Var != null) {
            f6Var.l(0.0f, getY(), getMeasuredWidth(), i10);
        } else {
            j6.q(0.0f, getY(), getMeasuredWidth(), i10);
        }
        xh.z3 z3Var = this.f44470a;
        this.f44472c = (getWidth() - ((int) z3Var.Q.e)) / 2.0f;
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
        canvas.translate(this.f44472c, this.d);
        z3Var.a(canvas);
        z3Var.b(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        xh.z3 z3Var = this.f44470a;
        this.f44472c = (size - ((int) z3Var.Q.e)) / 2.0f;
        float paddingTop = getPaddingTop();
        this.d = paddingTop;
        setMeasuredDimension(size, getPaddingBottom() + ((int) paddingTop) + z3Var.M);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f44470a.e(this.f44472c, this.d, motionEvent);
    }

    public void setLayoutBackground(Drawable drawable) {
        this.e = drawable;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f44470a.f46373y) {
            return false;
        }
        return true;
    }
}
