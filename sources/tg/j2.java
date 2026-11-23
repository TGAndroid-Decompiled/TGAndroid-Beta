package tg;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import c8.na;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.fc;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.w01;
import org.telegram.ui.Components.xt0;
public class j2 extends n {
    public final TLRPC.Document f58001s0;
    public final Object f58002t0;
    public final int f58003u0;
    public boolean f58004v0;
    public final c6 f58005w0;
    public final xt0 f58006x0;
    public final w01 f58007y0;
    public final ImageReceiver f58008z0;

    public j2(Context context, PointF pointF, float f10, float f11, xt0 xt0Var, TLRPC.Document document, Object obj) {
        super(context, pointF);
        this.f58003u0 = -1;
        this.f58004v0 = false;
        this.f58008z0 = new ImageReceiver(null);
        setRotation(f10);
        setScale(f11);
        this.f58001s0 = document;
        this.f58006x0 = xt0Var;
        this.f58002t0 = obj;
        int i7 = 0;
        while (true) {
            if (i7 >= document.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i7);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                TLRPC.TL_maskCoords tL_maskCoords = documentAttribute.mask_coords;
                if (tL_maskCoords != null) {
                    this.f58003u0 = tL_maskCoords.f28567n;
                }
            } else {
                i7++;
            }
        }
        w01 w01Var = new w01(this, context);
        this.f58007y0 = w01Var;
        addView(w01Var, na.c(-1.0f, -1));
        this.f58005w0 = new c6(w01Var, 0L, 500L, kr.h);
        ImageReceiver imageReceiver = this.f58008z0;
        imageReceiver.S0 = true;
        imageReceiver.K0 = true;
        imageReceiver.I0(w01Var);
        this.f58008z0.u0(fc.b(document), null, fc.c(w7.w(document.thumbs, 90, false, null, false), document), null, "webp", obj, 1);
        this.f58008z0.f22737h1 = new s(this, 5);
        k();
    }

    @Override
    public final m a() {
        u1 u1Var = new u1(this, getContext(), 2);
        u1Var.f58263r = new RectF();
        return u1Var;
    }

    public int getAnchor() {
        return this.f58003u0;
    }

    public xt0 getBaseSize() {
        return this.f58006x0;
    }

    public long getDuration() {
        ImageReceiver imageReceiver = this.f58008z0;
        nh0 C = imageReceiver.C();
        if (C != null) {
            return C.r();
        }
        b6 m10 = imageReceiver.m();
        if (m10 != null) {
            return m10.d[4];
        }
        return 0L;
    }

    public Object getParentObject() {
        return this.f58002t0;
    }

    @Override
    public aj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = (getScale() + 0.5f) * getMeasuredWidth();
        float f10 = scale / 2.0f;
        float f11 = scale * scaleX;
        return new aj0((getPositionX() - f10) * scaleX, (getPositionY() - f10) * scaleX, f11, f11);
    }

    public TLRPC.Document getSticker() {
        return this.f58001s0;
    }

    @Override
    public final void k() {
        xt0 xt0Var = this.f58006x0;
        setX(getPositionX() - (xt0Var.f42189a / 2.0f));
        setY(getPositionY() - (xt0Var.f42190b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f58008z0.Q();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f58008z0.S();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        xt0 xt0Var = this.f58006x0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) xt0Var.f42189a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) xt0Var.f42190b, 1073741824));
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f58004v0;
        this.f58004v0 = z11;
        if (!z10) {
            this.f58005w0.f(z11, true);
        }
        this.f58007y0.invalidate();
    }

    public void q(nh0 nh0Var) {
    }

    public j2(Context context, j2 j2Var, PointF pointF) {
        this(context, pointF, j2Var.getRotation(), j2Var.getScale(), j2Var.f58006x0, j2Var.f58001s0, j2Var.f58002t0);
        if (j2Var.f58004v0) {
            r(false);
        }
    }
}
