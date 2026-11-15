package tg;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import c8.ja;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gc;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.m01;
import org.telegram.ui.Components.nt0;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.u5;
public class f2 extends j {
    public final TLRPC.Document f57268r0;
    public final Object f57269s0;
    public final int f57270t0;
    public boolean f57271u0;
    public final u5 f57272v0;
    public final nt0 f57273w0;
    public final m01 f57274x0;
    public final ImageReceiver f57275y0;

    public f2(Context context, PointF pointF, float f10, float f11, nt0 nt0Var, TLRPC.Document document, Object obj) {
        super(context, pointF);
        this.f57270t0 = -1;
        this.f57271u0 = false;
        this.f57275y0 = new ImageReceiver(null);
        setRotation(f10);
        setScale(f11);
        this.f57268r0 = document;
        this.f57273w0 = nt0Var;
        this.f57269s0 = obj;
        int i7 = 0;
        while (true) {
            if (i7 >= document.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i7);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                TLRPC.TL_maskCoords tL_maskCoords = documentAttribute.mask_coords;
                if (tL_maskCoords != null) {
                    this.f57270t0 = tL_maskCoords.f28126n;
                }
            } else {
                i7++;
            }
        }
        m01 m01Var = new m01(this, context);
        this.f57274x0 = m01Var;
        addView(m01Var, ja.c(-1.0f, -1));
        this.f57272v0 = new u5(m01Var, 0L, 500L, er.h);
        ImageReceiver imageReceiver = this.f57275y0;
        imageReceiver.S0 = true;
        imageReceiver.K0 = true;
        imageReceiver.H0(m01Var);
        this.f57275y0.t0(gc.b(document), null, gc.c(w7.w(document.thumbs, 90, false, null, false), document), null, "webp", obj, 1);
        this.f57275y0.f22276h1 = new z1(this, 1);
        k();
    }

    @Override
    public final i a() {
        p1 p1Var = new p1(this, getContext(), 2);
        p1Var.f57521r = new RectF();
        return p1Var;
    }

    public int getAnchor() {
        return this.f57270t0;
    }

    public nt0 getBaseSize() {
        return this.f57273w0;
    }

    public long getDuration() {
        ImageReceiver imageReceiver = this.f57275y0;
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
        return this.f57269s0;
    }

    @Override
    public pi0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.5f) * getMeasuredWidth();
        float f10 = scale / 2.0f;
        float f11 = scale * scaleX;
        return new pi0((getPositionX() - f10) * scaleX, (getPositionY() - f10) * scaleX, f11, f11);
    }

    public TLRPC.Document getSticker() {
        return this.f57268r0;
    }

    @Override
    public final void k() {
        nt0 nt0Var = this.f57273w0;
        setX(getPositionX() - (nt0Var.f37702a / 2.0f));
        setY(getPositionY() - (nt0Var.f37703b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f57275y0.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f57275y0.R();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        nt0 nt0Var = this.f57273w0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) nt0Var.f37702a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) nt0Var.f37703b, 1073741824));
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f57271u0;
        this.f57271u0 = z11;
        if (!z10) {
            this.f57272v0.f(z11, true);
        }
        this.f57274x0.invalidate();
    }

    public void q(ch0 ch0Var) {
    }

    public f2(Context context, f2 f2Var, PointF pointF) {
        this(context, pointF, f2Var.getRotation(), f2Var.getScale(), f2Var.f57273w0, f2Var.f57268r0, f2Var.f57269s0);
        if (f2Var.f57271u0) {
            r(false);
        }
    }
}
