package ug;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import b8.mf;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ac;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.lt0;
import org.telegram.ui.Components.ni0;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.xq;
public class d2 extends j {
    public final TLRPC.Document f55941r0;
    public final Object f55942s0;
    public final int f55943t0;
    public boolean f55944u0;
    public final u5 f55945v0;
    public final lt0 f55946w0;
    public final kw0 f55947x0;
    public final ImageReceiver f55948y0;

    public d2(Context context, PointF pointF, float f10, float f11, lt0 lt0Var, TLRPC.Document document, Object obj) {
        super(context, pointF);
        this.f55943t0 = -1;
        this.f55944u0 = false;
        this.f55948y0 = new ImageReceiver(null);
        setRotation(f10);
        setScale(f11);
        this.f55941r0 = document;
        this.f55946w0 = lt0Var;
        this.f55942s0 = obj;
        int i3 = 0;
        while (true) {
            if (i3 >= document.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i3);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                TLRPC.TL_maskCoords tL_maskCoords = documentAttribute.mask_coords;
                if (tL_maskCoords != null) {
                    this.f55943t0 = tL_maskCoords.f27076n;
                }
            } else {
                i3++;
            }
        }
        kw0 kw0Var = new kw0(this, context);
        this.f55947x0 = kw0Var;
        addView(kw0Var, mf.c(-1.0f, -1));
        this.f55945v0 = new u5(kw0Var, 0L, 500L, xq.h);
        ImageReceiver imageReceiver = this.f55948y0;
        imageReceiver.S0 = true;
        imageReceiver.K0 = true;
        imageReceiver.H0(kw0Var);
        this.f55948y0.t0(ac.b(document), null, ac.c(w7.w(document.thumbs, 90, false, null, false), document), null, "webp", obj, 1);
        this.f55948y0.f21247h1 = new e3(this, 24);
        k();
    }

    @Override
    public final i a() {
        p1 p1Var = new p1(this, getContext(), 2);
        p1Var.f56212r = new RectF();
        return p1Var;
    }

    public int getAnchor() {
        return this.f55943t0;
    }

    public lt0 getBaseSize() {
        return this.f55946w0;
    }

    public long getDuration() {
        ImageReceiver imageReceiver = this.f55948y0;
        ch0 B = imageReceiver.B();
        if (B != null) {
            return B.r();
        }
        t5 m10 = imageReceiver.m();
        if (m10 != null) {
            return m10.d[4];
        }
        return 0L;
    }

    public Object getParentObject() {
        return this.f55942s0;
    }

    @Override
    public ni0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.5f) * getMeasuredWidth();
        float f10 = scale / 2.0f;
        float f11 = scale * scaleX;
        return new ni0((getPositionX() - f10) * scaleX, (getPositionY() - f10) * scaleX, f11, f11);
    }

    public TLRPC.Document getSticker() {
        return this.f55941r0;
    }

    @Override
    public final void k() {
        lt0 lt0Var = this.f55946w0;
        setX(getPositionX() - (lt0Var.f35877a / 2.0f));
        setY(getPositionY() - (lt0Var.f35878b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f55948y0.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f55948y0.R();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        lt0 lt0Var = this.f55946w0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) lt0Var.f35877a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) lt0Var.f35878b, 1073741824));
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f55944u0;
        this.f55944u0 = z11;
        if (!z10) {
            this.f55945v0.f(z11, true);
        }
        this.f55947x0.invalidate();
    }

    public void q(ch0 ch0Var) {
    }

    public d2(Context context, d2 d2Var, PointF pointF) {
        this(context, pointF, d2Var.getRotation(), d2Var.getScale(), d2Var.f55946w0, d2Var.f55941r0, d2Var.f55942s0);
        if (d2Var.f55944u0) {
            r(false);
        }
    }
}
