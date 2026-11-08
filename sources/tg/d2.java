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
import org.telegram.ui.Components.ki0;
import org.telegram.ui.Components.mt0;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.v5;
import org.telegram.ui.Components.w5;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.zg0;
public class d2 extends j {
    public final TLRPC.Document f55624q0;
    public final Object f55625r0;
    public final int f55626s0;
    public boolean f55627t0;
    public final w5 f55628u0;
    public final mt0 f55629v0;
    public final v41 f55630w0;
    public final ImageReceiver f55631x0;

    public d2(Context context, PointF pointF, float f10, float f11, mt0 mt0Var, TLRPC.Document document, Object obj) {
        super(context, pointF);
        this.f55626s0 = -1;
        this.f55627t0 = false;
        this.f55631x0 = new ImageReceiver(null);
        setRotation(f10);
        setScale(f11);
        this.f55624q0 = document;
        this.f55629v0 = mt0Var;
        this.f55625r0 = obj;
        int i7 = 0;
        while (true) {
            if (i7 >= document.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i7);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                TLRPC.TL_maskCoords tL_maskCoords = documentAttribute.mask_coords;
                if (tL_maskCoords != null) {
                    this.f55626s0 = tL_maskCoords.f27031n;
                }
            } else {
                i7++;
            }
        }
        v41 v41Var = new v41(this, context);
        this.f55630w0 = v41Var;
        addView(v41Var, ha.c(-1.0f, -1));
        this.f55628u0 = new w5(v41Var, 0L, 500L, xq.h);
        ImageReceiver imageReceiver = this.f55631x0;
        imageReceiver.R0 = true;
        imageReceiver.J0 = true;
        imageReceiver.H0(v41Var);
        this.f55631x0.t0(hc.b(document), null, hc.c(w7.w(document.thumbs, 90, false, null, false), document), null, "webp", obj, 1);
        this.f55631x0.f21195g1 = new m3(this, 26);
        k();
    }

    @Override
    public final i a() {
        p1 p1Var = new p1(this, getContext(), 2);
        p1Var.f55902r = new RectF();
        return p1Var;
    }

    public int getAnchor() {
        return this.f55626s0;
    }

    public mt0 getBaseSize() {
        return this.f55629v0;
    }

    public long getDuration() {
        ImageReceiver imageReceiver = this.f55631x0;
        zg0 B = imageReceiver.B();
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
        return this.f55625r0;
    }

    @Override
    public ki0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.5f) * getMeasuredWidth();
        float f10 = scale / 2.0f;
        float f11 = scale * scaleX;
        return new ki0((getPositionX() - f10) * scaleX, (getPositionY() - f10) * scaleX, f11, f11);
    }

    public TLRPC.Document getSticker() {
        return this.f55624q0;
    }

    @Override
    public final void k() {
        mt0 mt0Var = this.f55629v0;
        setX(getPositionX() - (mt0Var.f36114a / 2.0f));
        setY(getPositionY() - (mt0Var.f36115b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f55631x0.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f55631x0.R();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        mt0 mt0Var = this.f55629v0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) mt0Var.f36114a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) mt0Var.f36115b, 1073741824));
    }

    public final void r(boolean z9) {
        boolean z10 = !this.f55627t0;
        this.f55627t0 = z10;
        if (!z9) {
            this.f55628u0.f(z10, true);
        }
        this.f55630w0.invalidate();
    }

    public void q(zg0 zg0Var) {
    }

    public d2(Context context, d2 d2Var, PointF pointF) {
        this(context, pointF, d2Var.getRotation(), d2Var.getScale(), d2Var.f55629v0, d2Var.f55624q0, d2Var.f55625r0);
        if (d2Var.f55627t0) {
            r(false);
        }
    }
}
