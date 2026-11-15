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
import c8.ja;
import c8.ke;
import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import hi.d7;
import org.telegram.messenger.i20;
import org.telegram.messenger.w7;
import org.telegram.messenger.xe;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.m01;
import org.telegram.ui.Components.nt0;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Wallet.k8;
public final class n1 extends j {
    public final m01 A0;
    public final Bitmap B0;
    public boolean C0;
    public boolean D0;
    public final Rect E0;
    public final Rect F0;
    public final Paint G0;
    public xe H0;
    public final TLObject f57465r0;
    public final String f57466s0;
    public final int f57467t0;
    public boolean f57468u0;
    public final u5 f57469v0;
    public final nt0 f57470w0;
    public final int f57471x0;
    public boolean f57472y0;
    public final u5 f57473z0;

    public n1(Context context, PointF pointF, nt0 nt0Var, String str, int i7) {
        super(context, pointF);
        this.f57467t0 = -1;
        this.f57468u0 = false;
        this.f57472y0 = false;
        new Rect();
        new RectF();
        new Paint(3);
        this.E0 = new Rect();
        this.F0 = new Rect();
        this.G0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.f57466s0 = str;
        this.f57470w0 = nt0Var;
        m01 m01Var = new m01(this, context);
        this.A0 = m01Var;
        addView(m01Var, ja.c(-1.0f, -1));
        er erVar = er.h;
        this.f57469v0 = new u5(m01Var, 0L, 500L, erVar);
        this.f57473z0 = new u5(m01Var, 0L, 350L, erVar);
        this.f57471x0 = i7;
        Bitmap q10 = d7.q(new ab.t(str, 2), 1920, 1920, 0, false);
        this.B0 = q10;
        if (q10 != null) {
            s(q10);
        }
        k();
    }

    private String getImageFilter() {
        Point point = org.telegram.messenger.g0.f23611q;
        int round = Math.round((Math.min(point.x, point.y) * 0.8f) / org.telegram.messenger.g0.f23610p);
        return com.google.android.gms.internal.vision.e2.j(round, "_", round);
    }

    @Override
    public final i a() {
        return new j0(this, getContext());
    }

    public int getAnchor() {
        return this.f57467t0;
    }

    public nt0 getBaseSize() {
        return this.f57470w0;
    }

    public int getContentHeight() {
        Bitmap bitmap = this.B0;
        if (bitmap == null) {
            return 1;
        }
        return bitmap.getHeight();
    }

    public int getContentWidth() {
        Bitmap bitmap = this.B0;
        if (bitmap == null) {
            return 1;
        }
        return bitmap.getWidth();
    }

    public int getOrientation() {
        return this.f57471x0;
    }

    public Bitmap getSegmentedOutBitmap() {
        return null;
    }

    @Override
    public pi0 getSelectionBounds() {
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
        float x10 = i20.x(L, 2.0f, getPositionX(), scaleX);
        return new pi0(x10, i20.x(L2, 2.0f, getPositionY(), scaleX), ((((org.telegram.messenger.g0.L(64.0f) / scaleX) + scale2) * scaleX) + x10) - x10, L2 * scaleX);
    }

    @Override
    public final void k() {
        nt0 nt0Var = this.f57470w0;
        float f10 = nt0Var.f37702a / 2.0f;
        float f11 = nt0Var.f37703b / 2.0f;
        xe xeVar = this.H0;
        if (xeVar != null) {
            f10 *= xeVar.f27492e;
            f11 *= xeVar.f27493f;
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
        nt0 nt0Var = this.f57470w0;
        float f10 = nt0Var.f37702a;
        float f11 = nt0Var.f37703b;
        xe xeVar = this.H0;
        if (xeVar != null) {
            f10 *= xeVar.f27492e;
            f11 *= xeVar.f27493f;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f10, 1073741824), View.MeasureSpec.makeMeasureSpec((int) f11, 1073741824));
    }

    public final String q(int i7) {
        TLObject tLObject = this.f57465r0;
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.PhotoSize w10 = w7.w(((TLRPC.Photo) tLObject).sizes, 1000, false, null, false);
            try {
                w7.G(i7);
                return w7.J(w10, null, true, true).getAbsolutePath();
            } catch (Exception unused) {
            }
        }
        return this.f57466s0;
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f57468u0;
        this.f57468u0 = z11;
        if (!z10) {
            this.f57469v0.f(z11, true);
        }
        m01 m01Var = this.A0;
        if (m01Var != null) {
            m01Var.invalidate();
        }
    }

    public final void s(Bitmap bitmap) {
        if (!this.D0 && !this.C0 && bitmap != null && Build.VERSION.SDK_INT >= 24) {
            ia.a aVar = new ia.a();
            aVar.f15865a = true;
            zzd a10 = ke.a(new zb.d(aVar));
            this.C0 = true;
            a10.g(ub.a.a(this.f57471x0, bitmap)).addOnSuccessListener(new org.telegram.ui.ActionBar.z(this, 28)).addOnFailureListener(new k8(15, this, bitmap));
        }
    }

    public final void t(boolean z10) {
        boolean z11 = !this.f57472y0;
        this.f57472y0 = z11;
        if (!z10) {
            this.f57473z0.f(z11, true);
        }
        m01 m01Var = this.A0;
        if (m01Var != null) {
            m01Var.invalidate();
        }
    }

    public n1(Context context, PointF pointF, nt0 nt0Var, TLObject tLObject) {
        super(context, pointF);
        this.f57467t0 = -1;
        this.f57468u0 = false;
        this.f57472y0 = false;
        new Rect();
        new RectF();
        new Paint(3);
        this.E0 = new Rect();
        this.F0 = new Rect();
        this.G0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.f57465r0 = tLObject;
        this.f57470w0 = nt0Var;
        m01 m01Var = new m01(this, context);
        this.A0 = m01Var;
        addView(m01Var, ja.c(-1.0f, -1));
        er erVar = er.h;
        this.f57469v0 = new u5(m01Var, 0L, 500L, erVar);
        this.f57473z0 = new u5(m01Var, 0L, 350L, erVar);
        k();
    }
}
