package tg;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import c8.ma;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fc;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.vt0;
import org.telegram.ui.Components.w01;
import org.telegram.ui.Components.yi0;
public class f2 extends j {
    public final TLRPC.Document f57840r0;
    public final Object f57841s0;
    public final int f57842t0;
    public boolean f57843u0;
    public final c6 f57844v0;
    public final vt0 f57845w0;
    public final w01 f57846x0;
    public final ImageReceiver f57847y0;

    public f2(Context context, PointF pointF, float f10, float f11, vt0 vt0Var, TLRPC.Document document, Object obj) {
        super(context, pointF);
        this.f57842t0 = -1;
        this.f57843u0 = false;
        this.f57847y0 = new ImageReceiver(null);
        setRotation(f10);
        setScale(f11);
        this.f57840r0 = document;
        this.f57845w0 = vt0Var;
        this.f57841s0 = obj;
        int i7 = 0;
        while (true) {
            if (i7 >= document.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i7);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                TLRPC.TL_maskCoords tL_maskCoords = documentAttribute.mask_coords;
                if (tL_maskCoords != null) {
                    this.f57842t0 = tL_maskCoords.f28478n;
                }
            } else {
                i7++;
            }
        }
        w01 w01Var = new w01(this, context);
        this.f57846x0 = w01Var;
        addView(w01Var, ma.c(-1.0f, -1));
        this.f57844v0 = new c6(w01Var, 0L, 500L, lr.h);
        ImageReceiver imageReceiver = this.f57847y0;
        imageReceiver.S0 = true;
        imageReceiver.K0 = true;
        imageReceiver.H0(w01Var);
        this.f57847y0.t0(fc.b(document), null, fc.c(w7.w(document.thumbs, 90, false, null, false), document), null, "webp", obj, 1);
        this.f57847y0.f22639h1 = new z1(this, 2);
        k();
    }

    @Override
    public final i a() {
        p1 p1Var = new p1(this, getContext(), 2);
        p1Var.f58091r = new RectF();
        return p1Var;
    }

    public int getAnchor() {
        return this.f57842t0;
    }

    public vt0 getBaseSize() {
        return this.f57845w0;
    }

    public long getDuration() {
        ImageReceiver imageReceiver = this.f57847y0;
        mh0 B = imageReceiver.B();
        if (B != null) {
            return B.r();
        }
        b6 m10 = imageReceiver.m();
        if (m10 != null) {
            return m10.d[4];
        }
        return 0L;
    }

    public Object getParentObject() {
        return this.f57841s0;
    }

    @Override
    public yi0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.5f) * getMeasuredWidth();
        float f10 = scale / 2.0f;
        float f11 = scale * scaleX;
        return new yi0((getPositionX() - f10) * scaleX, (getPositionY() - f10) * scaleX, f11, f11);
    }

    public TLRPC.Document getSticker() {
        return this.f57840r0;
    }

    @Override
    public final void k() {
        vt0 vt0Var = this.f57845w0;
        setX(getPositionX() - (vt0Var.f41433a / 2.0f));
        setY(getPositionY() - (vt0Var.f41434b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f57847y0.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f57847y0.R();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        vt0 vt0Var = this.f57845w0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) vt0Var.f41433a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) vt0Var.f41434b, 1073741824));
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f57843u0;
        this.f57843u0 = z11;
        if (!z10) {
            this.f57844v0.f(z11, true);
        }
        this.f57846x0.invalidate();
    }

    public void q(mh0 mh0Var) {
    }

    public f2(Context context, f2 f2Var, PointF pointF) {
        this(context, pointF, f2Var.getRotation(), f2Var.getScale(), f2Var.f57845w0, f2Var.f57840r0, f2Var.f57841s0);
        if (f2Var.f57843u0) {
            r(false);
        }
    }
}
