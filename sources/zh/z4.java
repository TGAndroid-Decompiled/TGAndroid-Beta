package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import bi.ca;
import bi.dd;
import bi.j7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.r5;
public final class z4 extends View {
    public final j7 f53429a;
    public final u6 f53430b;
    public float f53431c;
    public float d;
    public Drawable e;

    public z4(Context context, int i10, u6 u6Var) {
        super(context);
        this.f53430b = u6Var;
        j7 j7Var = new j7(i10, this, u6Var);
        this.f53429a = j7Var;
        j7Var.f4895y.setCallback(this);
        NotificationCenter.listenEmojiLoading(this);
    }

    public final void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, String str, boolean z10) {
        float dp;
        float f7;
        j7 j7Var = this.f53429a;
        r5 r5Var = j7Var.e;
        j1 j1Var = j7Var.f4881j;
        ImageReceiver imageReceiver = j7Var.d;
        j7Var.N = false;
        j7Var.Q = null;
        j7Var.R = null;
        j7Var.f4887p = false;
        j7Var.f4882k = (TL_stars.starGiftAttributeBackdrop) ca.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        j7Var.f4883l = (TL_stars.starGiftAttributePattern) ca.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeModel stargiftattributemodel = j7Var.f4884m;
        j7Var.f4884m = (TL_stars.starGiftAttributeModel) ca.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        Paint paint = j7Var.f4878f;
        j7Var.h = null;
        paint.setShader(null);
        TL_stars.starGiftAttributePattern stargiftattributepattern = j7Var.f4883l;
        if (stargiftattributepattern != null) {
            r5Var.i(stargiftattributepattern.document, false);
        } else {
            r5Var.g(null, false);
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel2 = j7Var.f4884m;
        if (stargiftattributemodel2 != null && (stargiftattributemodel == null || stargiftattributemodel.document.f22034id != stargiftattributemodel2.document.f22034id)) {
            imageReceiver.setAutoRepeatCount(0);
            imageReceiver.clearDecorators();
            imageReceiver.setAutoRepeat(0);
            dd.Y0(imageReceiver, j7Var.f4884m.document, 110);
        }
        boolean z11 = tL_starGiftUnique.burned;
        j7Var.L = z11;
        if (z11) {
            int w02 = y6.w0(y6.f23599q7, j7Var.f4877c);
            Paint paint2 = (Paint) j1Var.f27238b;
            paint2.setShader(null);
            paint2.setColor(w02);
            j7Var.M = f7.f22629b;
            j1Var.f(11, LocaleController.getString(R.string.Gift2UniqueRibbonBurned), true);
        } else {
            j1Var.e(j7Var.f4882k, true, false);
            j1Var.f(11, LocaleController.getString(R.string.Gift2UniqueRibbon), true);
        }
        if (j7Var.S) {
            imageReceiver.onAttachedToWindow();
            r5Var.a();
            j7Var.f4895y.d.onAttachedToWindow();
        }
        if (AndroidUtilities.isTablet()) {
            dp = AndroidUtilities.getMinTabletSide() * 0.6f;
        } else {
            dp = (AndroidUtilities.displaySize.x * 0.62f) - AndroidUtilities.dp(34.0f);
        }
        j7Var.O = org.telegram.ui.d3.g(64.0f, (AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight, (int) dp);
        if (!AndroidUtilities.isTablet()) {
            j7Var.O = (int) (j7Var.O * 1.2f);
        }
        j7Var.O -= AndroidUtilities.dp(8.0f);
        j7Var.h(tL_starGiftUnique, j10, tL_textWithEntities, str);
        oe.e eVar = j7Var.T;
        if (z10) {
            if (eVar.h) {
                f7 = eVar.f19334g;
            } else {
                f7 = eVar.f19333f;
            }
            int round = Math.round(f7);
            int i10 = j7Var.O;
            if (round != i10) {
                eVar.a(i10);
            }
        } else {
            eVar.c(j7Var.O);
        }
        requestLayout();
        invalidate();
    }

    public j7 getLayout() {
        return this.f53429a;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f53429a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j7 j7Var = this.f53429a;
        j7Var.S = false;
        j7Var.d.onDetachedFromWindow();
        j7Var.e.b();
        j0 j0Var = j7Var.f4895y;
        j0Var.d.onDetachedFromWindow();
        c6.release((View) null, j0Var.f53123q);
        j0Var.f53123q = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        if (getParent() instanceof View) {
            i10 = ((View) getParent()).getHeight();
        } else {
            i10 = 0;
        }
        u6 u6Var = this.f53430b;
        if (u6Var != null) {
            u6Var.b(0.0f, getY(), getMeasuredWidth(), i10);
        } else {
            y6.q(0.0f, getY(), getMeasuredWidth(), i10);
        }
        j7 j7Var = this.f53429a;
        this.f53431c = (getWidth() - ((int) j7Var.T.f19333f)) / 2.0f;
        float dp = j7Var.T.f19333f + AndroidUtilities.dp(8.0f);
        float width = (getWidth() - dp) / 2.0f;
        float dp2 = this.d - AndroidUtilities.dp(4.0f);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(width, dp2, dp + width, j7Var.P + dp2 + AndroidUtilities.dp(8.0f));
        Rect rect = AndroidUtilities.rectTmp2;
        rectF.round(rect);
        this.e.setBounds(rect);
        this.e.draw(canvas);
        canvas.save();
        canvas.translate(this.f53431c, this.d);
        j7Var.b(canvas);
        j7Var.c(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        j7 j7Var = this.f53429a;
        this.f53431c = (size - ((int) j7Var.T.f19333f)) / 2.0f;
        float paddingTop = getPaddingTop();
        this.d = paddingTop;
        setMeasuredDimension(size, getPaddingBottom() + ((int) paddingTop) + j7Var.P);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f53429a.e(this.f53431c, this.d, motionEvent);
    }

    public void setLayoutBackground(Drawable drawable) {
        this.e = drawable;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f53429a.f4895y) {
            return false;
        }
        return true;
    }
}
