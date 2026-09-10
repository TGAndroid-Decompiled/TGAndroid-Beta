package pg;

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
import bi.ld;
import bi.r9;
import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.em;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.tv0;
import org.telegram.ui.Components.wr;
import org.telegram.ui.fz0;
import w7.a6;
public final class x1 extends j {
    public final Bitmap A0;
    public boolean B0;
    public boolean C0;
    public final Rect D0;
    public final Rect E0;
    public final Paint F0;
    public MediaController.CropState G0;
    public final TLObject f40360q0;
    public final String f40361r0;
    public final int f40362s0;
    public boolean f40363t0;
    public final d6 f40364u0;
    public final tv0 f40365v0;
    public final int f40366w0;
    public boolean f40367x0;
    public final d6 f40368y0;
    public final ld f40369z0;

    public x1(Context context, PointF pointF, tv0 tv0Var, String str, int i10) {
        super(context, pointF);
        this.f40362s0 = -1;
        this.f40363t0 = false;
        this.f40367x0 = false;
        new Rect();
        new RectF();
        new Paint(3);
        this.D0 = new Rect();
        this.E0 = new Rect();
        this.F0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.f40361r0 = str;
        this.f40365v0 = tv0Var;
        ld ldVar = new ld(this, context);
        this.f40369z0 = ldVar;
        addView(ldVar, a6.c(-1.0f, -1));
        wr wrVar = wr.h;
        this.f40364u0 = new d6(ldVar, 0L, 500L, wrVar);
        this.f40368y0 = new d6(ldVar, 0L, 350L, wrVar);
        this.f40366w0 = i10;
        Bitmap q6 = r9.q(new org.telegram.tgnet.j(str, 11), 1920, 1920, 0, false);
        this.A0 = q6;
        if (q6 != null) {
            s(q6);
        }
        k();
    }

    private String getImageFilter() {
        Point point = AndroidUtilities.displaySize;
        int round = Math.round((Math.min(point.x, point.y) * 0.8f) / AndroidUtilities.density);
        return a4.a.k(round, round, "_");
    }

    @Override
    public final i a() {
        return new p0(this, getContext());
    }

    public int getAnchor() {
        return this.f40362s0;
    }

    public tv0 getBaseSize() {
        return this.f40365v0;
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
        return this.f40366w0;
    }

    public Bitmap getSegmentedOutBitmap() {
        return null;
    }

    @Override
    public rk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = getScale();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (scale * getMeasuredWidth());
        float dp2 = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float scale2 = getScale() * getMeasuredWidth();
        getMeasuredHeight();
        getScale();
        AndroidUtilities.dp(64.0f);
        float u10 = em.u(dp, 2.0f, getPositionX(), scaleX);
        return new rk0(u10, em.u(dp2, 2.0f, getPositionY(), scaleX), ((((AndroidUtilities.dp(64.0f) / scaleX) + scale2) * scaleX) + u10) - u10, dp2 * scaleX);
    }

    @Override
    public final void k() {
        tv0 tv0Var = this.f40365v0;
        float f7 = tv0Var.f27499a / 2.0f;
        float f10 = tv0Var.f27500b / 2.0f;
        MediaController.CropState cropState = this.G0;
        if (cropState != null) {
            f7 *= cropState.cropPw;
            f10 *= cropState.cropPh;
        }
        setX(getPositionX() - f7);
        setY(getPositionY() - f10);
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
    public final void onMeasure(int i10, int i11) {
        tv0 tv0Var = this.f40365v0;
        float f7 = tv0Var.f27499a;
        float f10 = tv0Var.f27500b;
        MediaController.CropState cropState = this.G0;
        if (cropState != null) {
            f7 *= cropState.cropPw;
            f10 *= cropState.cropPh;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f7, 1073741824), View.MeasureSpec.makeMeasureSpec((int) f10, 1073741824));
    }

    public final String q(int i10) {
        TLObject tLObject = this.f40360q0;
        if (tLObject instanceof TLRPC.Photo) {
            try {
                return FileLoader.getInstance(i10).getPathToAttach(FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, 1000), true).getAbsolutePath();
            } catch (Exception unused) {
            }
        }
        return this.f40361r0;
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f40363t0;
        this.f40363t0 = z11;
        if (!z10) {
            this.f40364u0.f(z11, true);
        }
        ld ldVar = this.f40369z0;
        if (ldVar != null) {
            ldVar.invalidate();
        }
    }

    public final void s(Bitmap bitmap) {
        if (!this.C0 && !this.B0 && bitmap != null && Build.VERSION.SDK_INT >= 24) {
            ac.d dVar = new ac.d();
            dVar.f378a = true;
            zzd a2 = i8.d.a(new ac.e(dVar));
            this.B0 = true;
            a2.g(vb.a.a(bitmap, this.f40366w0)).addOnSuccessListener(new org.telegram.tgnet.j(this, 12)).addOnFailureListener(new fz0(20, this, bitmap));
        }
    }

    public final void t(boolean z10) {
        boolean z11 = !this.f40367x0;
        this.f40367x0 = z11;
        if (!z10) {
            this.f40368y0.f(z11, true);
        }
        ld ldVar = this.f40369z0;
        if (ldVar != null) {
            ldVar.invalidate();
        }
    }

    public x1(Context context, PointF pointF, tv0 tv0Var, TLObject tLObject) {
        super(context, pointF);
        this.f40362s0 = -1;
        this.f40363t0 = false;
        this.f40367x0 = false;
        new Rect();
        new RectF();
        new Paint(3);
        this.D0 = new Rect();
        this.E0 = new Rect();
        this.F0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.f40360q0 = tLObject;
        this.f40365v0 = tv0Var;
        ld ldVar = new ld(this, context);
        this.f40369z0 = ldVar;
        addView(ldVar, a6.c(-1.0f, -1));
        wr wrVar = wr.h;
        this.f40364u0 = new d6(ldVar, 0L, 500L, wrVar);
        this.f40368y0 = new d6(ldVar, 0L, 350L, wrVar);
        k();
    }
}
