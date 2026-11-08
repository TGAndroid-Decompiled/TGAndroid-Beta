package tg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import c8.ha;
import c8.ke;
import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import fi.e7;
import org.telegram.messenger.w7;
import org.telegram.messenger.ye;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.m3;
import org.telegram.ui.Components.ki0;
import org.telegram.ui.Components.mt0;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w5;
import org.telegram.ui.Components.xq;
public final class n1 extends j {
    public final Bitmap A0;
    public boolean B0;
    public boolean C0;
    public final Rect D0;
    public final Rect E0;
    public final Paint F0;
    public ye G0;
    public final TLObject f55859q0;
    public final String f55860r0;
    public final int f55861s0;
    public boolean f55862t0;
    public final w5 f55863u0;
    public final mt0 f55864v0;
    public final int f55865w0;
    public boolean f55866x0;
    public final w5 f55867y0;
    public final v41 f55868z0;

    public n1(Context context, PointF pointF, mt0 mt0Var, String str, int i7) {
        super(context, pointF);
        this.f55861s0 = -1;
        this.f55862t0 = false;
        this.f55866x0 = false;
        new Rect();
        new RectF();
        new Paint(3);
        this.D0 = new Rect();
        this.E0 = new Rect();
        this.F0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.f55860r0 = str;
        this.f55864v0 = mt0Var;
        v41 v41Var = new v41(this, context);
        this.f55868z0 = v41Var;
        addView(v41Var, ha.c(-1.0f, -1));
        xq xqVar = xq.h;
        this.f55863u0 = new w5(v41Var, 0L, 500L, xqVar);
        this.f55867y0 = new w5(v41Var, 0L, 350L, xqVar);
        this.f55865w0 = i7;
        Bitmap q10 = e7.q(new ab.t(str, 2), 1920, 1920, 0, false);
        this.A0 = q10;
        if (q10 != null) {
            s(q10);
        }
        k();
    }

    private String getImageFilter() {
        Point point = org.telegram.messenger.g0.f22563q;
        int round = Math.round((Math.min(point.x, point.y) * 0.8f) / org.telegram.messenger.g0.f22562p);
        return com.google.android.recaptcha.internal.a.j(round, "_", round);
    }

    @Override
    public final i a() {
        return new j0(this, getContext());
    }

    public int getAnchor() {
        return this.f55861s0;
    }

    public mt0 getBaseSize() {
        return this.f55864v0;
    }

    public int getContentHeight() {
        Bitmap bitmap = this.A0;
        if (bitmap == null) {
            return 1;
        }
        return bitmap.getHeight();
    }

    public int getContentWidth() {
        Bitmap bitmap = this.A0;
        if (bitmap == null) {
            return 1;
        }
        return bitmap.getWidth();
    }

    public int getOrientation() {
        return this.f55865w0;
    }

    public Bitmap getSegmentedOutBitmap() {
        return null;
    }

    @Override
    public ki0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = getScale();
        float L = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (scale * getMeasuredWidth());
        float L2 = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float scale2 = getScale() * getMeasuredWidth();
        getMeasuredHeight();
        getScale();
        org.telegram.messenger.g0.L(64.0f);
        float x10 = org.telegram.messenger.camera.q.x(L, 2.0f, getPositionX(), scaleX);
        return new ki0(x10, org.telegram.messenger.camera.q.x(L2, 2.0f, getPositionY(), scaleX), ((((org.telegram.messenger.g0.L(64.0f) / scaleX) + scale2) * scaleX) + x10) - x10, L2 * scaleX);
    }

    @Override
    public final void k() {
        mt0 mt0Var = this.f55864v0;
        float f10 = mt0Var.f36114a / 2.0f;
        float f11 = mt0Var.f36115b / 2.0f;
        ye yeVar = this.G0;
        if (yeVar != null) {
            f10 *= yeVar.f26638e;
            f11 *= yeVar.f26639f;
        }
        setX(getPositionX() - f10);
        setY(getPositionY() - f11);
        m();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        mt0 mt0Var = this.f55864v0;
        float f10 = mt0Var.f36114a;
        float f11 = mt0Var.f36115b;
        ye yeVar = this.G0;
        if (yeVar != null) {
            f10 *= yeVar.f26638e;
            f11 *= yeVar.f26639f;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f10, 1073741824), View.MeasureSpec.makeMeasureSpec((int) f11, 1073741824));
    }

    public final String q(int i7) {
        TLObject tLObject = this.f55859q0;
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.PhotoSize w10 = w7.w(((TLRPC.Photo) tLObject).sizes, 1000, false, null, false);
            try {
                w7.G(i7);
                return w7.J(w10, null, true, true).getAbsolutePath();
            } catch (Exception unused) {
            }
        }
        return this.f55860r0;
    }

    public final void r(boolean z9) {
        boolean z10 = !this.f55862t0;
        this.f55862t0 = z10;
        if (!z9) {
            this.f55863u0.f(z10, true);
        }
        v41 v41Var = this.f55868z0;
        if (v41Var != null) {
            v41Var.invalidate();
        }
    }

    public final void s(Bitmap bitmap) {
        if (!this.C0 && !this.B0 && bitmap != null && Build.VERSION.SDK_INT >= 24) {
            ia.a aVar = new ia.a();
            aVar.f15410a = true;
            zzd a10 = ke.a(new zb.d(aVar));
            this.B0 = true;
            a10.g(ub.a.a(this.f55865w0, bitmap)).addOnSuccessListener(new m3(this, 23)).addOnFailureListener(new org.telegram.ui.web.a0(9, this, bitmap));
        }
    }

    public final void t(boolean z9) {
        boolean z10 = !this.f55866x0;
        this.f55866x0 = z10;
        if (!z9) {
            this.f55867y0.f(z10, true);
        }
        v41 v41Var = this.f55868z0;
        if (v41Var != null) {
            v41Var.invalidate();
        }
    }

    public n1(Context context, PointF pointF, mt0 mt0Var, TLObject tLObject) {
        super(context, pointF);
        this.f55861s0 = -1;
        this.f55862t0 = false;
        this.f55866x0 = false;
        new Rect();
        new RectF();
        new Paint(3);
        this.D0 = new Rect();
        this.E0 = new Rect();
        this.F0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.f55859q0 = tLObject;
        this.f55864v0 = mt0Var;
        v41 v41Var = new v41(this, context);
        this.f55868z0 = v41Var;
        addView(v41Var, ha.c(-1.0f, -1));
        xq xqVar = xq.h;
        this.f55863u0 = new w5(v41Var, 0L, 500L, xqVar);
        this.f55867y0 = new w5(v41Var, 0L, 350L, xqVar);
        k();
    }
}
