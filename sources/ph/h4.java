package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a30;
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.o5;
import rh.e6;
import rh.h8;
public final class h4 extends View {
    public final rh.g4 f45118a;
    public final p6 f45119b;
    public float f45120c;
    public float d;
    public Drawable e;

    public h4(int i10, Context context, p6 p6Var) {
        super(context);
        this.f45119b = p6Var;
        rh.g4 g4Var = new rh.g4(i10, this, p6Var);
        this.f45118a = g4Var;
        g4Var.f46987y.setCallback(this);
        at.i(this);
    }

    public final void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, String str, boolean z10) {
        float L;
        float f7;
        rh.g4 g4Var = this.f45118a;
        d5 d5Var = g4Var.e;
        f1 f1Var = g4Var.f46973j;
        ImageReceiver imageReceiver = g4Var.d;
        g4Var.N = false;
        g4Var.Q = null;
        g4Var.R = null;
        g4Var.f46979p = false;
        g4Var.f46974k = (TL_stars.starGiftAttributeBackdrop) e6.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        g4Var.f46975l = (TL_stars.starGiftAttributePattern) e6.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeModel stargiftattributemodel = g4Var.f46976m;
        g4Var.f46976m = (TL_stars.starGiftAttributeModel) e6.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        Paint paint = g4Var.f46970f;
        g4Var.h = null;
        paint.setShader(null);
        TL_stars.starGiftAttributePattern stargiftattributepattern = g4Var.f46975l;
        if (stargiftattributepattern != null) {
            d5Var.i(stargiftattributepattern.document, false);
        } else {
            d5Var.g(null, false);
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel2 = g4Var.f46976m;
        if (stargiftattributemodel2 != null && (stargiftattributemodel == null || stargiftattributemodel.document.f19800id != stargiftattributemodel2.document.f19800id)) {
            imageReceiver.X(0);
            imageReceiver.e();
            imageReceiver.W(0);
            h8.c1(imageReceiver, g4Var.f46976m.document, 110);
        }
        boolean z11 = tL_starGiftUnique.burned;
        g4Var.L = z11;
        if (z11) {
            int w02 = t6.w0(t6.f21171q7, g4Var.f46969c);
            Paint paint2 = (Paint) f1Var.f26519b;
            paint2.setShader(null);
            paint2.setColor(w02);
            g4Var.M = a7.f20159b;
            f1Var.f(11, dd.L0(2131749902, null), true);
        } else {
            f1Var.e(g4Var.f46974k, true, false);
            f1Var.f(11, dd.L0(2131749903, null), true);
        }
        if (g4Var.S) {
            imageReceiver.P();
            d5Var.a();
            g4Var.f46987y.d.P();
        }
        if (org.telegram.messenger.i0.Q1()) {
            L = org.telegram.messenger.i0.Q0() * 0.6f;
        } else {
            L = (org.telegram.messenger.i0.f16172q.x * 0.62f) - org.telegram.messenger.i0.L(34.0f);
        }
        g4Var.O = a30.C(64.0f, (org.telegram.messenger.i0.f16172q.y - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - org.telegram.messenger.i0.f16166m, (int) L);
        if (!org.telegram.messenger.i0.Q1()) {
            g4Var.O = (int) (g4Var.O * 1.2f);
        }
        g4Var.O -= org.telegram.messenger.i0.L(8.0f);
        g4Var.h(tL_starGiftUnique, j10, tL_textWithEntities, str);
        fe.f fVar = g4Var.T;
        if (z10) {
            if (fVar.h) {
                f7 = fVar.f7033g;
            } else {
                f7 = fVar.f7032f;
            }
            int round = Math.round(f7);
            int i10 = g4Var.O;
            if (round != i10) {
                fVar.a(i10);
            }
        } else {
            fVar.c(g4Var.O);
        }
        requestLayout();
        invalidate();
    }

    public rh.g4 getLayout() {
        return this.f45118a;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f45118a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        rh.g4 g4Var = this.f45118a;
        g4Var.S = false;
        g4Var.d.R();
        g4Var.e.b();
        l0 l0Var = g4Var.f46987y;
        l0Var.d.R();
        o5.release((View) null, l0Var.f45199q);
        l0Var.f45199q = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        if (getParent() instanceof View) {
            i10 = ((View) getParent()).getHeight();
        } else {
            i10 = 0;
        }
        p6 p6Var = this.f45119b;
        if (p6Var != null) {
            p6Var.b(0.0f, getY(), getMeasuredWidth(), i10);
        } else {
            t6.r(0.0f, getY(), getMeasuredWidth(), i10);
        }
        rh.g4 g4Var = this.f45118a;
        this.f45120c = (getWidth() - ((int) g4Var.T.f7032f)) / 2.0f;
        float L = g4Var.T.f7032f + org.telegram.messenger.i0.L(8.0f);
        float width = (getWidth() - L) / 2.0f;
        float L2 = this.d - org.telegram.messenger.i0.L(4.0f);
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(width, L2, L + width, g4Var.P + L2 + org.telegram.messenger.i0.L(8.0f));
        Rect rect = org.telegram.messenger.i0.Q;
        rectF.round(rect);
        this.e.setBounds(rect);
        this.e.draw(canvas);
        canvas.save();
        canvas.translate(this.f45120c, this.d);
        g4Var.b(canvas);
        g4Var.c(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        rh.g4 g4Var = this.f45118a;
        this.f45120c = (size - ((int) g4Var.T.f7032f)) / 2.0f;
        float paddingTop = getPaddingTop();
        this.d = paddingTop;
        setMeasuredDimension(size, getPaddingBottom() + ((int) paddingTop) + g4Var.P);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f45118a.e(this.f45120c, this.d, motionEvent);
    }

    public void setLayoutBackground(Drawable drawable) {
        this.e = drawable;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f45118a.f46987y) {
            return false;
        }
        return true;
    }
}
