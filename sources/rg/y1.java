package rg;

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
import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import ei.a8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.mk;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.fw0;
import w7.z5;
public final class y1 extends j {
    public final Bitmap A0;
    public boolean B0;
    public boolean C0;
    public final Rect D0;
    public final Rect E0;
    public final Paint F0;
    public MediaController.CropState G0;
    public final TLObject f45713q0;
    public final String f45714r0;
    public final int f45715s0;
    public boolean f45716t0;
    public final f6 f45717u0;
    public final fw0 f45718v0;
    public final int f45719w0;
    public boolean f45720x0;
    public final f6 f45721y0;
    public final x1 f45722z0;

    public y1(Context context, PointF pointF, fw0 fw0Var, String str, int i10) {
        super(context, pointF);
        this.f45715s0 = -1;
        this.f45716t0 = false;
        this.f45720x0 = false;
        new Rect();
        new RectF();
        new Paint(3);
        this.D0 = new Rect();
        this.E0 = new Rect();
        this.F0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.f45714r0 = str;
        this.f45718v0 = fw0Var;
        x1 x1Var = new x1(this, context);
        this.f45722z0 = x1Var;
        addView(x1Var, z5.c(-1.0f, -1));
        bs bsVar = bs.h;
        this.f45717u0 = new f6(x1Var, 0L, 500L, bsVar);
        this.f45721y0 = new f6(x1Var, 0L, 350L, bsVar);
        this.f45719w0 = i10;
        Bitmap q6 = a8.q(new qg.h0(str, 10), 1920, 1920, 0, false);
        this.A0 = q6;
        if (q6 != null) {
            s(q6);
        }
        k();
    }

    private String getImageFilter() {
        Point point = AndroidUtilities.displaySize;
        int round = Math.round((Math.min(point.x, point.y) * 0.8f) / AndroidUtilities.density);
        return a1.g.k(round, round, "_");
    }

    @Override
    public final i a() {
        return new p0(this, getContext());
    }

    public int getAnchor() {
        return this.f45715s0;
    }

    public fw0 getBaseSize() {
        return this.f45718v0;
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
        return this.f45719w0;
    }

    public Bitmap getSegmentedOutBitmap() {
        return null;
    }

    @Override
    public fl0 getSelectionBounds() {
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
        float z10 = mk.z(dp, 2.0f, getPositionX(), scaleX);
        return new fl0(z10, mk.z(dp2, 2.0f, getPositionY(), scaleX), ((((AndroidUtilities.dp(64.0f) / scaleX) + scale2) * scaleX) + z10) - z10, dp2 * scaleX);
    }

    @Override
    public final void k() {
        fw0 fw0Var = this.f45718v0;
        float f7 = fw0Var.f26428a / 2.0f;
        float f10 = fw0Var.f26429b / 2.0f;
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
        fw0 fw0Var = this.f45718v0;
        float f7 = fw0Var.f26428a;
        float f10 = fw0Var.f26429b;
        MediaController.CropState cropState = this.G0;
        if (cropState != null) {
            f7 *= cropState.cropPw;
            f10 *= cropState.cropPh;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f7, 1073741824), View.MeasureSpec.makeMeasureSpec((int) f10, 1073741824));
    }

    public final String q(int i10) {
        TLObject tLObject = this.f45713q0;
        if (tLObject instanceof TLRPC.Photo) {
            try {
                return FileLoader.getInstance(i10).getPathToAttach(FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, 1000), true).getAbsolutePath();
            } catch (Exception unused) {
            }
        }
        return this.f45714r0;
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f45716t0;
        this.f45716t0 = z11;
        if (!z10) {
            this.f45717u0.f(z11, true);
        }
        x1 x1Var = this.f45722z0;
        if (x1Var != null) {
            x1Var.invalidate();
        }
    }

    public final void s(Bitmap bitmap) {
        if (!this.C0 && !this.B0 && bitmap != null && Build.VERSION.SDK_INT >= 24) {
            bc.d dVar = new bc.d();
            dVar.f4246a = true;
            zzd a2 = v7.f0.a(new bc.e(dVar));
            this.B0 = true;
            a2.g(wb.a.a(bitmap, this.f45719w0)).addOnSuccessListener(new qg.h0(this, 11)).addOnFailureListener(new org.telegram.ui.web.m(7, this, bitmap));
        }
    }

    public final void t(boolean z10) {
        boolean z11 = !this.f45720x0;
        this.f45720x0 = z11;
        if (!z10) {
            this.f45721y0.f(z11, true);
        }
        x1 x1Var = this.f45722z0;
        if (x1Var != null) {
            x1Var.invalidate();
        }
    }

    public y1(Context context, PointF pointF, fw0 fw0Var, TLObject tLObject) {
        super(context, pointF);
        this.f45715s0 = -1;
        this.f45716t0 = false;
        this.f45720x0 = false;
        new Rect();
        new RectF();
        new Paint(3);
        this.D0 = new Rect();
        this.E0 = new Rect();
        this.F0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.f45713q0 = tLObject;
        this.f45718v0 = fw0Var;
        x1 x1Var = new x1(this, context);
        this.f45722z0 = x1Var;
        addView(x1Var, z5.c(-1.0f, -1));
        bs bsVar = bs.h;
        this.f45717u0 = new f6(x1Var, 0L, 500L, bsVar);
        this.f45721y0 = new f6(x1Var, 0L, 350L, bsVar);
        k();
    }
}
