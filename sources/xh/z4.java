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
import org.telegram.ui.Components.m5;
import org.telegram.ui.Components.x5;
import yh.v5;
import yh.y7;
public final class z4 extends View {
    public final yh.c4 f46271a;
    public final f6 f46272b;
    public float f46273c;
    public float d;
    public Drawable e;

    public z4(Context context, int i10, f6 f6Var) {
        super(context);
        this.f46272b = f6Var;
        yh.c4 c4Var = new yh.c4(i10, this, f6Var);
        this.f46271a = c4Var;
        c4Var.f47084y.setCallback(this);
        NotificationCenter.listenEmojiLoading(this);
    }

    public final void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, String str, boolean z10) {
        float dp;
        float f7;
        yh.c4 c4Var = this.f46271a;
        m5 m5Var = c4Var.e;
        l1 l1Var = c4Var.f47070j;
        ImageReceiver imageReceiver = c4Var.d;
        c4Var.K = false;
        c4Var.N = null;
        c4Var.O = null;
        c4Var.f47076p = false;
        c4Var.f47071k = (TL_stars.starGiftAttributeBackdrop) v5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        c4Var.f47072l = (TL_stars.starGiftAttributePattern) v5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeModel stargiftattributemodel = c4Var.f47073m;
        c4Var.f47073m = (TL_stars.starGiftAttributeModel) v5.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        Paint paint = c4Var.f47067f;
        c4Var.h = null;
        paint.setShader(null);
        TL_stars.starGiftAttributePattern stargiftattributepattern = c4Var.f47072l;
        if (stargiftattributepattern != null) {
            m5Var.i(stargiftattributepattern.document, false);
        } else {
            m5Var.g(null, false);
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel2 = c4Var.f47073m;
        if (stargiftattributemodel2 != null && (stargiftattributemodel == null || stargiftattributemodel.document.f18127id != stargiftattributemodel2.document.f18127id)) {
            imageReceiver.setAutoRepeatCount(0);
            imageReceiver.clearDecorators();
            imageReceiver.setAutoRepeat(0);
            y7.Z0(imageReceiver, c4Var.f47073m.document, 110);
        }
        boolean z11 = tL_starGiftUnique.burned;
        c4Var.J = z11;
        if (z11) {
            int v02 = j6.v0(j6.f19101q7, c4Var.f47066c);
            Paint paint2 = l1Var.f27673a;
            paint2.setShader(null);
            paint2.setColor(v02);
            l1Var.e(11, LocaleController.getString(R.string.Gift2UniqueRibbonBurned), true);
        } else {
            l1Var.d(c4Var.f47071k, true, false);
            l1Var.e(11, LocaleController.getString(R.string.Gift2UniqueRibbon), true);
        }
        if (c4Var.P) {
            imageReceiver.onAttachedToWindow();
            m5Var.a();
            c4Var.f47084y.d.onAttachedToWindow();
        }
        if (AndroidUtilities.isTablet()) {
            dp = AndroidUtilities.getMinTabletSide() * 0.6f;
        } else {
            dp = (AndroidUtilities.displaySize.x * 0.62f) - AndroidUtilities.dp(34.0f);
        }
        c4Var.L = Math.min((int) dp, ((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(64.0f));
        if (!AndroidUtilities.isTablet()) {
            c4Var.L = (int) (c4Var.L * 1.2f);
        }
        c4Var.L -= AndroidUtilities.dp(8.0f);
        c4Var.h(tL_starGiftUnique, j3, tL_textWithEntities, str);
        le.e eVar = c4Var.Q;
        if (z10) {
            if (eVar.f13993g) {
                f7 = eVar.f13992f;
            } else {
                f7 = eVar.e;
            }
            int round = Math.round(f7);
            int i10 = c4Var.L;
            if (round != i10) {
                eVar.a(i10);
            }
        } else {
            eVar.c(c4Var.L);
        }
        requestLayout();
        invalidate();
    }

    public yh.c4 getLayout() {
        return this.f46271a;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        yh.c4 c4Var = this.f46271a;
        c4Var.P = true;
        if (c4Var.N != null) {
            c4Var.d.onAttachedToWindow();
            c4Var.e.a();
            c4Var.f47084y.d.onAttachedToWindow();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yh.c4 c4Var = this.f46271a;
        c4Var.P = false;
        c4Var.d.onDetachedFromWindow();
        c4Var.e.b();
        k0 k0Var = c4Var.f47084y;
        k0Var.d.onDetachedFromWindow();
        x5.release((View) null, k0Var.f45989q);
        k0Var.f45989q = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        if (getParent() instanceof View) {
            i10 = ((View) getParent()).getHeight();
        } else {
            i10 = 0;
        }
        f6 f6Var = this.f46272b;
        if (f6Var != null) {
            f6Var.m(0.0f, getY(), getMeasuredWidth(), i10);
        } else {
            j6.q(0.0f, getY(), getMeasuredWidth(), i10);
        }
        yh.c4 c4Var = this.f46271a;
        this.f46273c = (getWidth() - ((int) c4Var.Q.e)) / 2.0f;
        float dp = c4Var.Q.e + AndroidUtilities.dp(8.0f);
        float width = (getWidth() - dp) / 2.0f;
        float dp2 = this.d - AndroidUtilities.dp(4.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width, dp2, dp + width, c4Var.M + dp2 + AndroidUtilities.dp(8.0f));
        Rect rect = AndroidUtilities.rectTmp2;
        rectF.round(rect);
        this.e.setBounds(rect);
        this.e.draw(canvas);
        canvas.save();
        canvas.translate(this.f46273c, this.d);
        c4Var.a(canvas);
        c4Var.b(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        yh.c4 c4Var = this.f46271a;
        this.f46273c = (size - ((int) c4Var.Q.e)) / 2.0f;
        float paddingTop = getPaddingTop();
        this.d = paddingTop;
        setMeasuredDimension(size, getPaddingBottom() + ((int) paddingTop) + c4Var.M);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f46271a.e(this.f46273c, this.d, motionEvent);
    }

    public void setLayoutBackground(Drawable drawable) {
        this.e = drawable;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f46271a.f47084y) {
            return false;
        }
        return true;
    }
}
