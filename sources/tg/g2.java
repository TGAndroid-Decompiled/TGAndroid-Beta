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
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.y01;
import org.telegram.ui.Components.yt0;
public class g2 extends j {
    public final TLRPC.Document f57896r0;
    public final Object f57897s0;
    public final int f57898t0;
    public boolean f57899u0;
    public final d6 f57900v0;
    public final yt0 f57901w0;
    public final y01 f57902x0;
    public final ImageReceiver f57903y0;

    public g2(Context context, PointF pointF, float f10, float f11, yt0 yt0Var, TLRPC.Document document, Object obj) {
        super(context, pointF);
        this.f57898t0 = -1;
        this.f57899u0 = false;
        this.f57903y0 = new ImageReceiver(null);
        setRotation(f10);
        setScale(f11);
        this.f57896r0 = document;
        this.f57901w0 = yt0Var;
        this.f57897s0 = obj;
        int i7 = 0;
        while (true) {
            if (i7 >= document.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i7);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                TLRPC.TL_maskCoords tL_maskCoords = documentAttribute.mask_coords;
                if (tL_maskCoords != null) {
                    this.f57898t0 = tL_maskCoords.f28506n;
                }
            } else {
                i7++;
            }
        }
        y01 y01Var = new y01(this, context);
        this.f57902x0 = y01Var;
        addView(y01Var, ma.c(-1.0f, -1));
        this.f57900v0 = new d6(y01Var, 0L, 500L, nr.h);
        ImageReceiver imageReceiver = this.f57903y0;
        imageReceiver.S0 = true;
        imageReceiver.K0 = true;
        imageReceiver.H0(y01Var);
        this.f57903y0.t0(fc.b(document), null, fc.c(w7.w(document.thumbs, 90, false, null, false), document), null, "webp", obj, 1);
        this.f57903y0.f22667h1 = new o1(this, 3);
        k();
    }

    @Override
    public final i a() {
        r1 r1Var = new r1(this, getContext(), 2);
        r1Var.f58152r = new RectF();
        return r1Var;
    }

    public int getAnchor() {
        return this.f57898t0;
    }

    public yt0 getBaseSize() {
        return this.f57901w0;
    }

    public long getDuration() {
        ImageReceiver imageReceiver = this.f57903y0;
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
        return this.f57897s0;
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
        return this.f57896r0;
    }

    @Override
    public final void k() {
        yt0 yt0Var = this.f57901w0;
        setX(getPositionX() - (yt0Var.f42553a / 2.0f));
        setY(getPositionY() - (yt0Var.f42554b / 2.0f));
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f57903y0.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f57903y0.R();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        yt0 yt0Var = this.f57901w0;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) yt0Var.f42553a, 1073741824), View.MeasureSpec.makeMeasureSpec((int) yt0Var.f42554b, 1073741824));
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f57899u0;
        this.f57899u0 = z11;
        if (!z10) {
            this.f57900v0.f(z11, true);
        }
        this.f57902x0.invalidate();
    }

    public void q(oh0 oh0Var) {
    }

    public g2(Context context, g2 g2Var, PointF pointF) {
        this(context, pointF, g2Var.getRotation(), g2Var.getScale(), g2Var.f57901w0, g2Var.f57896r0, g2Var.f57897s0);
        if (g2Var.f57899u0) {
            r(false);
        }
    }
}
