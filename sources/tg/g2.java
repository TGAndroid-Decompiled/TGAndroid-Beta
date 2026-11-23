package tg;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import c8.ma;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.gc;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.x01;
import org.telegram.ui.Components.yt0;
public class g2 extends j {
    public final TLRPC.Document f57900r0;
    public final Object f57901s0;
    public final int f57902t0;
    public boolean f57903u0;
    public final d6 f57904v0;
    public final yt0 f57905w0;
    public final x01 f57906x0;
    public final ImageReceiver f57907y0;

    public g2(Context context, PointF pointF, float f10, float f11, yt0 yt0Var, TLRPC.Document document, Object obj) {
        super(context, pointF);
        this.f57902t0 = -1;
        this.f57903u0 = false;
        this.f57907y0 = new ImageReceiver(null);
        setRotation(f10);
        setScale(f11);
        this.f57900r0 = document;
        this.f57905w0 = yt0Var;
        this.f57901s0 = obj;
        int i7 = 0;
        while (true) {
            if (i7 >= document.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i7);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                TLRPC.TL_maskCoords tL_maskCoords = documentAttribute.mask_coords;
                if (tL_maskCoords != null) {
                    this.f57902t0 = tL_maskCoords.f28509n;
                }
            } else {
                i7++;
            }
        }
        x01 x01Var = new x01(this, context);
        this.f57906x0 = x01Var;
        addView(x01Var, ma.c(-1.0f, -1));
        this.f57904v0 = new d6(x01Var, 0L, 500L, nr.h);
        ImageReceiver imageReceiver = this.f57907y0;
        imageReceiver.S0 = true;
        imageReceiver.K0 = true;
        imageReceiver.H0(x01Var);
        this.f57907y0.t0(gc.b(document), null, gc.c(w7.w(document.thumbs, 90, false, null, false), document), null, "webp", obj, 1);
        this.f57907y0.f22670h1 = new o1(this, 3);
        k();
    }

    @Override
    public final i a() {
        r1 r1Var = new r1(this, getContext(), 2);
        r1Var.f58156r = new RectF();
        return r1Var;
    }

    public int getAnchor() {
        return this.f57902t0;
    }

    public yt0 getBaseSize() {
        return this.f57905w0;
    }

    public long getDuration() {
        ImageReceiver imageReceiver = this.f57907y0;
        oh0 B = imageReceiver.B();
        if (B != null) {
            return B.r();
        }
        c6 m10 = imageReceiver.m();
        if (m10 != null) {
            return m10.d[4];
        }
        return 0L;
    }

    public Object getParentObject() {
        return this.f57901s0;
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
        return this.f57900r0;
    }

    @Override
    public final void k() {
        yt0 yt0Var = this.f57905w0;
        setX(getPositionX() - (yt0Var.f42546a / 2.0f));
        setY(getPositionY() - (yt0Var.f42547b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f57907y0.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f57907y0.R();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        yt0 yt0Var = this.f57905w0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) yt0Var.f42546a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) yt0Var.f42547b, 1073741824));
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f57903u0;
        this.f57903u0 = z11;
        if (!z10) {
            this.f57904v0.f(z11, true);
        }
        this.f57906x0.invalidate();
    }

    public void q(oh0 oh0Var) {
    }

    public g2(Context context, g2 g2Var, PointF pointF) {
        this(context, pointF, g2Var.getRotation(), g2Var.getScale(), g2Var.f57905w0, g2Var.f57900r0, g2Var.f57901s0);
        if (g2Var.f57903u0) {
            r(false);
        }
    }
}
