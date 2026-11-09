package tg;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import c8.ha;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.hc;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.li0;
import org.telegram.ui.Components.ot0;
import org.telegram.ui.Components.v5;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.w5;
import org.telegram.ui.Components.xq;
public class d2 extends j {
    public final TLRPC.Document f55637q0;
    public final Object f55638r0;
    public final int f55639s0;
    public boolean f55640t0;
    public final w5 f55641u0;
    public final ot0 f55642v0;
    public final w41 f55643w0;
    public final ImageReceiver f55644x0;

    public d2(Context context, PointF pointF, float f10, float f11, ot0 ot0Var, TLRPC.Document document, Object obj) {
        super(context, pointF);
        this.f55639s0 = -1;
        this.f55640t0 = false;
        this.f55644x0 = new ImageReceiver(null);
        setRotation(f10);
        setScale(f11);
        this.f55637q0 = document;
        this.f55642v0 = ot0Var;
        this.f55638r0 = obj;
        int i7 = 0;
        while (true) {
            if (i7 >= document.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i7);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                TLRPC.TL_maskCoords tL_maskCoords = documentAttribute.mask_coords;
                if (tL_maskCoords != null) {
                    this.f55639s0 = tL_maskCoords.f27031n;
                }
            } else {
                i7++;
            }
        }
        w41 w41Var = new w41(this, context);
        this.f55643w0 = w41Var;
        addView(w41Var, ha.c(-1.0f, -1));
        this.f55641u0 = new w5(w41Var, 0L, 500L, xq.h);
        ImageReceiver imageReceiver = this.f55644x0;
        imageReceiver.R0 = true;
        imageReceiver.J0 = true;
        imageReceiver.H0(w41Var);
        this.f55644x0.t0(hc.b(document), null, hc.c(w7.w(document.thumbs, 90, false, null, false), document), null, "webp", obj, 1);
        this.f55644x0.f21195g1 = new m3(this, 26);
        k();
    }

    @Override
    public final i a() {
        p1 p1Var = new p1(this, getContext(), 2);
        p1Var.f55915r = new RectF();
        return p1Var;
    }

    public int getAnchor() {
        return this.f55639s0;
    }

    public ot0 getBaseSize() {
        return this.f55642v0;
    }

    public long getDuration() {
        ImageReceiver imageReceiver = this.f55644x0;
        ah0 B = imageReceiver.B();
        if (B != null) {
            return B.r();
        }
        v5 m10 = imageReceiver.m();
        if (m10 != null) {
            return m10.d[4];
        }
        return 0L;
    }

    public Object getParentObject() {
        return this.f55638r0;
    }

    @Override
    public li0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.5f) * getMeasuredWidth();
        float f10 = scale / 2.0f;
        float f11 = scale * scaleX;
        return new li0((getPositionX() - f10) * scaleX, (getPositionY() - f10) * scaleX, f11, f11);
    }

    public TLRPC.Document getSticker() {
        return this.f55637q0;
    }

    @Override
    public final void k() {
        ot0 ot0Var = this.f55642v0;
        setX(getPositionX() - (ot0Var.f36801a / 2.0f));
        setY(getPositionY() - (ot0Var.f36802b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f55644x0.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f55644x0.R();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        ot0 ot0Var = this.f55642v0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) ot0Var.f36801a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) ot0Var.f36802b, 1073741824));
    }

    public final void r(boolean z9) {
        boolean z10 = !this.f55640t0;
        this.f55640t0 = z10;
        if (!z9) {
            this.f55641u0.f(z10, true);
        }
        this.f55643w0.invalidate();
    }

    public void q(ah0 ah0Var) {
    }

    public d2(Context context, d2 d2Var, PointF pointF) {
        this(context, pointF, d2Var.getRotation(), d2Var.getScale(), d2Var.f55642v0, d2Var.f55637q0, d2Var.f55638r0);
        if (d2Var.f55640t0) {
            r(false);
        }
    }
}
