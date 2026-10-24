package yh;

import ai.ha;
import ai.n7;
import ai.nd;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.n5;
import org.telegram.ui.Components.y5;
public final class y4 extends View {
    public final n7 f51076a;
    public final g6 f51077b;
    public float f51078c;
    public float d;
    public Drawable e;

    public y4(Context context, int i10, g6 g6Var) {
        super(context);
        this.f51077b = g6Var;
        n7 n7Var = new n7(i10, this, g6Var);
        this.f51076a = n7Var;
        n7Var.f1888y.setCallback(this);
        NotificationCenter.listenEmojiLoading(this);
    }

    public final void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, String str, boolean z10) {
        float dp;
        float f7;
        n7 n7Var = this.f51076a;
        n5 n5Var = n7Var.e;
        j1 j1Var = n7Var.f1874j;
        ImageReceiver imageReceiver = n7Var.d;
        n7Var.N = false;
        n7Var.Q = null;
        n7Var.R = null;
        n7Var.f1880p = false;
        n7Var.f1875k = (TL_stars.starGiftAttributeBackdrop) ha.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        n7Var.f1876l = (TL_stars.starGiftAttributePattern) ha.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeModel stargiftattributemodel = n7Var.f1877m;
        n7Var.f1877m = (TL_stars.starGiftAttributeModel) ha.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        Paint paint = n7Var.f1871f;
        n7Var.h = null;
        paint.setShader(null);
        TL_stars.starGiftAttributePattern stargiftattributepattern = n7Var.f1876l;
        if (stargiftattributepattern != null) {
            n5Var.i(stargiftattributepattern.document, false);
        } else {
            n5Var.g(null, false);
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel2 = n7Var.f1877m;
        if (stargiftattributemodel2 != null && (stargiftattributemodel == null || stargiftattributemodel.document.f20350id != stargiftattributemodel2.document.f20350id)) {
            imageReceiver.setAutoRepeatCount(0);
            imageReceiver.clearDecorators();
            imageReceiver.setAutoRepeat(0);
            nd.a1(imageReceiver, n7Var.f1877m.document, 110);
        }
        boolean z11 = tL_starGiftUnique.burned;
        n7Var.L = z11;
        if (z11) {
            int w02 = k6.w0(k6.f21422q7, n7Var.f1870c);
            Paint paint2 = (Paint) j1Var.f33024b;
            paint2.setShader(null);
            paint2.setColor(w02);
            n7Var.M = r6.f21818b;
            j1Var.f(11, LocaleController.getString(R.string.Gift2UniqueRibbonBurned), true);
        } else {
            j1Var.e(n7Var.f1875k, true, false);
            j1Var.f(11, LocaleController.getString(R.string.Gift2UniqueRibbon), true);
        }
        if (n7Var.S) {
            imageReceiver.onAttachedToWindow();
            n5Var.a();
            n7Var.f1888y.d.onAttachedToWindow();
        }
        if (AndroidUtilities.isTablet()) {
            dp = AndroidUtilities.getMinTabletSide() * 0.6f;
        } else {
            dp = (AndroidUtilities.displaySize.x * 0.62f) - AndroidUtilities.dp(34.0f);
        }
        n7Var.O = Math.min((int) dp, ((AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(64.0f));
        if (!AndroidUtilities.isTablet()) {
            n7Var.O = (int) (n7Var.O * 1.2f);
        }
        n7Var.O -= AndroidUtilities.dp(8.0f);
        n7Var.h(tL_starGiftUnique, j10, tL_textWithEntities, str);
        ne.e eVar = n7Var.T;
        if (z10) {
            if (eVar.f17455g) {
                f7 = eVar.f17454f;
            } else {
                f7 = eVar.e;
            }
            int round = Math.round(f7);
            int i10 = n7Var.O;
            if (round != i10) {
                eVar.a(i10);
            }
        } else {
            eVar.c(n7Var.O);
        }
        requestLayout();
        invalidate();
    }

    public n7 getLayout() {
        return this.f51076a;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f51076a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        n7 n7Var = this.f51076a;
        n7Var.S = false;
        n7Var.d.onDetachedFromWindow();
        n7Var.e.b();
        j0 j0Var = n7Var.f1888y;
        j0Var.d.onDetachedFromWindow();
        y5.release((View) null, j0Var.f50775q);
        j0Var.f50775q = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        if (getParent() instanceof View) {
            i10 = ((View) getParent()).getHeight();
        } else {
            i10 = 0;
        }
        g6 g6Var = this.f51077b;
        if (g6Var != null) {
            g6Var.b(0.0f, getY(), getMeasuredWidth(), i10);
        } else {
            k6.q(0.0f, getY(), getMeasuredWidth(), i10);
        }
        n7 n7Var = this.f51076a;
        this.f51078c = (getWidth() - ((int) n7Var.T.e)) / 2.0f;
        float dp = n7Var.T.e + AndroidUtilities.dp(8.0f);
        float width = (getWidth() - dp) / 2.0f;
        float dp2 = this.d - AndroidUtilities.dp(4.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width, dp2, dp + width, n7Var.P + dp2 + AndroidUtilities.dp(8.0f));
        Rect rect = AndroidUtilities.rectTmp2;
        rectF.round(rect);
        this.e.setBounds(rect);
        this.e.draw(canvas);
        canvas.save();
        canvas.translate(this.f51078c, this.d);
        n7Var.b(canvas);
        n7Var.c(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        n7 n7Var = this.f51076a;
        this.f51078c = (size - ((int) n7Var.T.e)) / 2.0f;
        float paddingTop = getPaddingTop();
        this.d = paddingTop;
        setMeasuredDimension(size, getPaddingBottom() + ((int) paddingTop) + n7Var.P);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f51076a.e(this.f51078c, this.d, motionEvent);
    }

    public void setLayoutBackground(Drawable drawable) {
        this.e = drawable;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f51076a.f1888y) {
            return false;
        }
        return true;
    }
}
