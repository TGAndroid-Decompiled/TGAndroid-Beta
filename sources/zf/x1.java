package zf;

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
import g7.o8;
import h7.z5;
import lh.z7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.tu0;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.di1;

public final class x1 extends j {
    public final Rect A0;
    public final Paint B0;
    public MediaController.CropState C0;
    public final TLObject m0;

    public final String f50763n0;

    public final int f50764o0;

    public boolean f50765p0;

    public final y5 f50766q0;

    public final tu0 f50767r0;

    public final int f50768s0;

    public boolean f50769t0;

    public final y5 f50770u0;

    public final qg.f f50771v0;

    public final Bitmap f50772w0;

    public boolean f50773x0;

    public boolean f50774y0;

    public final Rect f50775z0;

    public x1(Context context, PointF pointF, tu0 tu0Var, String str, int i10) {
        super(context, pointF);
        this.f50764o0 = -1;
        this.f50765p0 = false;
        this.f50769t0 = false;
        new Rect();
        new RectF();
        new Paint(3);
        this.f50775z0 = new Rect();
        this.A0 = new Rect();
        this.B0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.f50763n0 = str;
        this.f50767r0 = tu0Var;
        qg.f fVar = new qg.f(this, context);
        this.f50771v0 = fVar;
        addView(fVar, z5.c(-1.0f, -1));
        er erVar = er.h;
        this.f50766q0 = new y5(fVar, 0L, 500L, erVar);
        this.f50770u0 = new y5(fVar, 0L, 350L, erVar);
        this.f50768s0 = i10;
        Bitmap bitmapQ = z7.q(new t0.c(str, 11), 1920, 1920, 0, false);
        this.f50772w0 = bitmapQ;
        if (bitmapQ != null) {
            s(bitmapQ);
        }
        k();
    }

    private String getImageFilter() {
        Point point = AndroidUtilities.displaySize;
        int iRound = Math.round((Math.min(point.x, point.y) * 0.8f) / AndroidUtilities.density);
        return com.google.android.recaptcha.internal.a.l(iRound, "_", iRound);
    }

    @Override
    public final i a() {
        return new o0(this, getContext());
    }

    public int getAnchor() {
        return this.f50764o0;
    }

    public tu0 getBaseSize() {
        return this.f50767r0;
    }

    public int getContentHeight() {
        Bitmap bitmap = this.f50772w0;
        if (bitmap == null) {
            return 1;
        }
        return bitmap.getHeight();
    }

    public int getContentWidth() {
        Bitmap bitmap = this.f50772w0;
        if (bitmap == null) {
            return 1;
        }
        return bitmap.getWidth();
    }

    public int getOrientation() {
        return this.f50768s0;
    }

    public Bitmap getSegmentedOutBitmap() {
        return null;
    }

    @Override
    public yj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new yj0();
        }
        float scaleX = viewGroup.getScaleX();
        float fDp = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float fDp2 = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float fDp3 = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        getMeasuredHeight();
        getScale();
        AndroidUtilities.dp(64.0f);
        float fT = rl.t(fDp, 2.0f, getPositionX(), scaleX);
        return new yj0(fT, rl.t(fDp2, 2.0f, getPositionY(), scaleX), ((fDp3 * scaleX) + fT) - fT, fDp2 * scaleX);
    }

    @Override
    public final void k() {
        tu0 tu0Var = this.f50767r0;
        float f10 = tu0Var.f32893a / 2.0f;
        float f11 = tu0Var.f32894b / 2.0f;
        MediaController.CropState cropState = this.C0;
        if (cropState != null) {
            f10 *= cropState.cropPw;
            f11 *= cropState.cropPh;
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
    public final void onMeasure(int i10, int i11) {
        tu0 tu0Var = this.f50767r0;
        float f10 = tu0Var.f32893a;
        float f11 = tu0Var.f32894b;
        MediaController.CropState cropState = this.C0;
        if (cropState != null) {
            f10 *= cropState.cropPw;
            f11 *= cropState.cropPh;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f10, 1073741824), View.MeasureSpec.makeMeasureSpec((int) f11, 1073741824));
    }

    public final String q(int i10) {
        TLObject tLObject = this.m0;
        if (tLObject instanceof TLRPC.Photo) {
            try {
                return FileLoader.getInstance(i10).getPathToAttach(FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, 1000), true).getAbsolutePath();
            } catch (Exception unused) {
            }
        }
        return this.f50763n0;
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f50765p0;
        this.f50765p0 = z11;
        if (!z10) {
            this.f50766q0.f(z11, true);
        }
        qg.f fVar = this.f50771v0;
        if (fVar != null) {
            fVar.invalidate();
        }
    }

    public final void s(Bitmap bitmap) {
        if (this.f50774y0 || this.f50773x0 || bitmap == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        jb.d dVar = new jb.d();
        dVar.f12885a = true;
        zzd zzdVarA = o8.a(new jb.e(dVar));
        this.f50773x0 = true;
        zzdVarA.g(eb.a.a(bitmap, this.f50768s0)).addOnSuccessListener(new t0.c(this, 12)).addOnFailureListener(new di1(14, this, bitmap));
    }

    public final void t(boolean z10) {
        boolean z11 = !this.f50769t0;
        this.f50769t0 = z11;
        if (!z10) {
            this.f50770u0.f(z11, true);
        }
        qg.f fVar = this.f50771v0;
        if (fVar != null) {
            fVar.invalidate();
        }
    }

    public x1(Context context, PointF pointF, tu0 tu0Var, TLObject tLObject) {
        super(context, pointF);
        this.f50764o0 = -1;
        this.f50765p0 = false;
        this.f50769t0 = false;
        new Rect();
        new RectF();
        new Paint(3);
        this.f50775z0 = new Rect();
        this.A0 = new Rect();
        this.B0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.m0 = tLObject;
        this.f50767r0 = tu0Var;
        qg.f fVar = new qg.f(this, context);
        this.f50771v0 = fVar;
        addView(fVar, z5.c(-1.0f, -1));
        er erVar = er.h;
        this.f50766q0 = new y5(fVar, 0L, 500L, erVar);
        this.f50770u0 = new y5(fVar, 0L, 350L, erVar);
        k();
    }
}
