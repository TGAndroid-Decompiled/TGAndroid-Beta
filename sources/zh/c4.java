package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import bi.dd;
import bi.ea;
import bi.m7;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.id;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.r5;
public final class c4 extends View {
    public final m7 f60280a;
    public final g6 f60281b;
    public float f60282c;
    public float d;
    public Drawable f60283e;

    public c4(int i7, Context context, g6 g6Var) {
        super(context);
        this.f60281b = g6Var;
        m7 m7Var = new m7(i7, this, g6Var);
        this.f60280a = m7Var;
        m7Var.f4352y.setCallback(this);
        qs.i(this);
    }

    public final void a(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, TLRPC.TL_textWithEntities tL_textWithEntities, String str, boolean z9) {
        float L;
        float f10;
        m7 m7Var = this.f60280a;
        g5 g5Var = m7Var.f4334e;
        b1 b1Var = m7Var.f4338j;
        ImageReceiver imageReceiver = m7Var.d;
        m7Var.N = false;
        m7Var.Q = null;
        m7Var.R = null;
        m7Var.f4344p = false;
        m7Var.f4339k = (TL_stars.starGiftAttributeBackdrop) ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
        m7Var.f4340l = (TL_stars.starGiftAttributePattern) ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
        TL_stars.starGiftAttributeModel stargiftattributemodel = m7Var.f4341m;
        m7Var.f4341m = (TL_stars.starGiftAttributeModel) ea.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        Paint paint = m7Var.f4335f;
        m7Var.h = null;
        paint.setShader(null);
        TL_stars.starGiftAttributePattern stargiftattributepattern = m7Var.f4340l;
        if (stargiftattributepattern != null) {
            g5Var.i(stargiftattributepattern.document, false);
        } else {
            g5Var.g(null, false);
        }
        TL_stars.starGiftAttributeModel stargiftattributemodel2 = m7Var.f4341m;
        if (stargiftattributemodel2 != null && (stargiftattributemodel == null || stargiftattributemodel.document.f26962id != stargiftattributemodel2.document.f26962id)) {
            imageReceiver.X(0);
            imageReceiver.e();
            imageReceiver.W(0);
            dd.c1(imageReceiver, m7Var.f4341m.document, 110);
        }
        boolean z10 = tL_starGiftUnique.burned;
        m7Var.L = z10;
        if (z10) {
            int w02 = l6.w0(l6.f28106q7, m7Var.f4333c);
            Paint paint2 = (Paint) b1Var.f220b;
            paint2.setShader(null);
            paint2.setColor(w02);
            m7Var.M = s6.f28501b;
            b1Var.f(11, id.M0(2131749893, null), true);
        } else {
            b1Var.e(m7Var.f4339k, true, false);
            b1Var.f(11, id.M0(2131749894, null), true);
        }
        if (m7Var.S) {
            imageReceiver.P();
            g5Var.a();
            m7Var.f4352y.d.P();
        }
        if (org.telegram.messenger.g0.Q1()) {
            L = org.telegram.messenger.g0.Q0() * 0.6f;
        } else {
            L = (org.telegram.messenger.g0.f22563q.x * 0.62f) - org.telegram.messenger.g0.L(34.0f);
        }
        m7Var.O = org.telegram.messenger.camera.q.C(64.0f, (org.telegram.messenger.g0.f22563q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.f22557m, (int) L);
        if (!org.telegram.messenger.g0.Q1()) {
            m7Var.O = (int) (m7Var.O * 1.2f);
        }
        m7Var.O -= org.telegram.messenger.g0.L(8.0f);
        m7Var.h(tL_starGiftUnique, j3, tL_textWithEntities, str);
        te.c cVar = m7Var.T;
        if (z9) {
            if (cVar.h) {
                f10 = cVar.f55506g;
            } else {
                f10 = cVar.f55505f;
            }
            int round = Math.round(f10);
            int i7 = m7Var.O;
            if (round != i7) {
                cVar.a(i7);
            }
        } else {
            cVar.c(m7Var.O);
        }
        requestLayout();
        invalidate();
    }

    public m7 getLayout() {
        return this.f60280a;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f60280a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m7 m7Var = this.f60280a;
        m7Var.S = false;
        m7Var.d.R();
        m7Var.f4334e.b();
        i0 i0Var = m7Var.f4352y;
        i0Var.d.R();
        r5.release((View) null, i0Var.f60393q);
        i0Var.f60393q = null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        if (getParent() instanceof View) {
            i7 = ((View) getParent()).getHeight();
        } else {
            i7 = 0;
        }
        g6 g6Var = this.f60281b;
        if (g6Var != null) {
            g6Var.b(0.0f, getY(), getMeasuredWidth(), i7);
        } else {
            l6.r(0.0f, getY(), getMeasuredWidth(), i7);
        }
        m7 m7Var = this.f60280a;
        this.f60282c = (getWidth() - ((int) m7Var.T.f55505f)) / 2.0f;
        float L = m7Var.T.f55505f + org.telegram.messenger.g0.L(8.0f);
        float width = (getWidth() - L) / 2.0f;
        float L2 = this.d - org.telegram.messenger.g0.L(4.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(width, L2, L + width, m7Var.P + L2 + org.telegram.messenger.g0.L(8.0f));
        Rect rect = org.telegram.messenger.g0.Q;
        rectF.round(rect);
        this.f60283e.setBounds(rect);
        this.f60283e.draw(canvas);
        canvas.save();
        canvas.translate(this.f60282c, this.d);
        m7Var.b(canvas);
        m7Var.c(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        m7 m7Var = this.f60280a;
        this.f60282c = (size - ((int) m7Var.T.f55505f)) / 2.0f;
        float paddingTop = getPaddingTop();
        this.d = paddingTop;
        setMeasuredDimension(size, getPaddingBottom() + ((int) paddingTop) + m7Var.P);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f60280a.e(this.f60282c, this.d, motionEvent);
    }

    public void setLayoutBackground(Drawable drawable) {
        this.f60283e = drawable;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f60280a.f4352y) {
            return false;
        }
        return true;
    }
}
