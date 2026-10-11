package qg;

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
import ci.l8;
import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.ai;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.nw0;
import w7.x5;
public final class x1 extends j {
    public final Bitmap A0;
    public boolean B0;
    public boolean C0;
    public final Rect D0;
    public final Rect E0;
    public final Paint F0;
    public MediaController.CropState G0;
    public final TLObject f46735q0;
    public final String f46736r0;
    public final int f46737s0;
    public boolean f46738t0;
    public final g6 f46739u0;
    public final nw0 f46740v0;
    public final int f46741w0;
    public boolean f46742x0;
    public final g6 f46743y0;
    public final ai.f0 f46744z0;

    public x1(Context context, PointF pointF, nw0 nw0Var, String str, int i10) {
        super(context, pointF);
        this.f46737s0 = -1;
        this.f46738t0 = false;
        this.f46742x0 = false;
        new Rect();
        new RectF();
        new Paint(3);
        this.D0 = new Rect();
        this.E0 = new Rect();
        this.F0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.f46736r0 = str;
        this.f46740v0 = nw0Var;
        ai.f0 f0Var = new ai.f0(this, context);
        this.f46744z0 = f0Var;
        addView(f0Var, x5.d(-1.0f, -1));
        is isVar = is.h;
        this.f46739u0 = new g6(f0Var, 0L, 500L, isVar);
        this.f46743y0 = new g6(f0Var, 0L, 350L, isVar);
        this.f46741w0 = i10;
        Bitmap q6 = l8.q(new m4.w(str, 22), 1920, 1920, 0, false);
        this.A0 = q6;
        if (q6 != null) {
            s(q6);
        }
        k();
    }

    private String getImageFilter() {
        Point point = AndroidUtilities.displaySize;
        int round = Math.round((Math.min(point.x, point.y) * 0.8f) / AndroidUtilities.density);
        return a1.g.l(round, round, "_");
    }

    @Override
    public final i a() {
        return new p0(this, getContext());
    }

    public int getAnchor() {
        return this.f46737s0;
    }

    public nw0 getBaseSize() {
        return this.f46740v0;
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
        return this.f46741w0;
    }

    public Bitmap getSegmentedOutBitmap() {
        return null;
    }

    @Override
    public nl0 getSelectionBounds() {
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
        float y3 = ai.y(dp, 2.0f, getPositionX(), scaleX);
        return new nl0(y3, ai.y(dp2, 2.0f, getPositionY(), scaleX), ((((AndroidUtilities.dp(64.0f) / scaleX) + scale2) * scaleX) + y3) - y3, dp2 * scaleX);
    }

    @Override
    public final void k() {
        nw0 nw0Var = this.f46740v0;
        float f7 = nw0Var.f29302a / 2.0f;
        float f10 = nw0Var.f29303b / 2.0f;
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
        nw0 nw0Var = this.f46740v0;
        float f7 = nw0Var.f29302a;
        float f10 = nw0Var.f29303b;
        MediaController.CropState cropState = this.G0;
        if (cropState != null) {
            f7 *= cropState.cropPw;
            f10 *= cropState.cropPh;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) f7, 1073741824), View.MeasureSpec.makeMeasureSpec((int) f10, 1073741824));
    }

    public final String q(int i10) {
        TLObject tLObject = this.f46735q0;
        if (tLObject instanceof TLRPC.Photo) {
            try {
                return FileLoader.getInstance(i10).getPathToAttach(FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, 1000), true).getAbsolutePath();
            } catch (Exception unused) {
            }
        }
        return this.f46736r0;
    }

    public final void r(boolean z10) {
        boolean z11 = !this.f46738t0;
        this.f46738t0 = z11;
        if (!z10) {
            this.f46739u0.f(z11, true);
        }
        ai.f0 f0Var = this.f46744z0;
        if (f0Var != null) {
            f0Var.invalidate();
        }
    }

    public final void s(Bitmap bitmap) {
        if (!this.C0 && !this.B0 && bitmap != null && Build.VERSION.SDK_INT >= 24) {
            ac.d dVar = new ac.d();
            dVar.f409a = true;
            zzd a2 = i8.d.a(new ac.e(dVar));
            this.B0 = true;
            a2.g(vb.a.a(bitmap, this.f46741w0)).addOnSuccessListener(new m4.w(this, 23)).addOnFailureListener(new q9.p(1, this, bitmap));
        }
    }

    public final void t(boolean z10) {
        boolean z11 = !this.f46742x0;
        this.f46742x0 = z11;
        if (!z10) {
            this.f46743y0.f(z11, true);
        }
        ai.f0 f0Var = this.f46744z0;
        if (f0Var != null) {
            f0Var.invalidate();
        }
    }

    public x1(Context context, PointF pointF, nw0 nw0Var, TLObject tLObject) {
        super(context, pointF);
        this.f46737s0 = -1;
        this.f46738t0 = false;
        this.f46742x0 = false;
        new Rect();
        new RectF();
        new Paint(3);
        this.D0 = new Rect();
        this.E0 = new Rect();
        this.F0 = new Paint(3);
        setRotation(0.0f);
        setScale(1.0f);
        this.f46735q0 = tLObject;
        this.f46740v0 = nw0Var;
        ai.f0 f0Var = new ai.f0(this, context);
        this.f46744z0 = f0Var;
        addView(f0Var, x5.d(-1.0f, -1));
        is isVar = is.h;
        this.f46739u0 = new g6(f0Var, 0L, 500L, isVar);
        this.f46743y0 = new g6(f0Var, 0L, 350L, isVar);
        k();
    }
}
