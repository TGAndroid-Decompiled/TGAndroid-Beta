package qh;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.ui.BubbleActivity;
public final class e0 extends View {
    public final Paint f45254a;
    public final Path f45255b;
    public final RectF f45256c;
    public final f0 d;

    public e0(f0 f0Var, Context context) {
        super(context);
        this.d = f0Var;
        this.f45254a = new Paint(1);
        this.f45255b = new Path();
        this.f45256c = new RectF();
        new Matrix();
        new Matrix();
        new Matrix();
    }

    private float getContainerHeight() {
        int i10;
        boolean z4 = getContext() instanceof BubbleActivity;
        a0 a0Var = this.d.h;
        float f10 = a0Var.B;
        if (!z4) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        float f11 = f10 + i10;
        return ((getHeight() - f11) - a0Var.f51211y) - AndroidUtilities.dp(32.0f);
    }

    private float getContainerWidth() {
        return getWidth() - AndroidUtilities.dp(32.0f);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        int currentWidth;
        int currentHeight;
        float lerp;
        float lerp2;
        boolean z4;
        MediaController.CropState cropState;
        float f10;
        float f11;
        eg.t2 t2Var;
        float f12;
        float f13;
        f0 f0Var = this.d;
        a0 a0Var = f0Var.h;
        int[] iArr = f0Var.f45329x;
        i5 i5Var = f0Var.f45320a;
        if (f0Var.f45321b == null) {
            return;
        }
        canvas.save();
        Paint paint = this.f45254a;
        paint.setColor(-16777216);
        paint.setAlpha((int) (f0Var.f45327s * 255.0f));
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        if (f0Var.f45327s < 1.0f) {
            Path path = this.f45255b;
            path.rewind();
            RectF rectF = this.f45256c;
            rectF.set(0.0f, 0.0f, i5Var.getWidth(), i5Var.getHeight());
            int[] iArr2 = f0Var.f45328w;
            rectF.offset(iArr2[0], iArr2[1]);
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
            AndroidUtilities.lerp(rectF, rectF2, f0Var.f45327s, rectF);
            float lerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), 0, f0Var.f45327s);
            path.addRoundRect(rectF, lerp3, lerp3, Path.Direction.CW);
            canvas.clipPath(path);
        }
        float f14 = f0Var.f45327s;
        float f15 = 1.0f - f14;
        int[] iArr3 = f0Var.v;
        canvas.translate((-iArr3[0]) * f15, (-iArr3[1]) * f15);
        int i11 = (f15 > 0.0f ? 1 : (f15 == 0.0f ? 0 : -1));
        if (i11 > 0) {
            if (f0Var.B) {
                f0Var.f45321b.getLocationOnScreen(iArr);
            }
            canvas.translate(iArr[0] * f15, iArr[1] * f15);
            MediaController.CropState cropState2 = f0Var.f45321b.D0;
            if (cropState2 != null) {
                f13 = cropState2.cropPw;
                f12 = cropState2.cropPh;
            } else {
                f12 = 1.0f;
                f13 = 1.0f;
            }
            float lerp4 = AndroidUtilities.lerp(1.0f, (f0Var.f45321b.getScaleX() * (t2Var.getWidth() / f13)) / i5Var.getWidth(), f15);
            canvas.scale(lerp4, lerp4);
            canvas.rotate(f0Var.f45321b.getRotation() * f15);
            canvas.translate(((f0Var.f45321b.getContentWidth() * f13) / 2.0f) * f15, ((f0Var.f45321b.getContentHeight() * f12) / 2.0f) * f15);
        }
        boolean z10 = getContext() instanceof BubbleActivity;
        float f16 = a0Var.B;
        if (!z10) {
            i10 = AndroidUtilities.statusBarHeight;
        } else {
            i10 = 0;
        }
        canvas.translate(((getContainerWidth() / 2.0f) + AndroidUtilities.dp(16.0f)) * f14, (((getContainerHeight() + AndroidUtilities.dp(32.0f)) / 2.0f) + f16 + i10) * f14);
        if (i11 > 0) {
            float contentWidth = f0Var.f45321b.getContentWidth();
            float contentHeight = f0Var.f45321b.getContentHeight();
            MediaController.CropState cropState3 = f0Var.f45321b.D0;
            if (cropState3 != null) {
                f10 = cropState3.cropPw;
            } else {
                f10 = 1.0f;
            }
            if (cropState3 != null) {
                f11 = cropState3.cropPh;
            } else {
                f11 = 1.0f;
            }
            float lerp5 = (AndroidUtilities.lerp(1.0f, f10, f15) * contentWidth) / 2.0f;
            float lerp6 = (AndroidUtilities.lerp(1.0f, f11, f15) * contentHeight) / 2.0f;
            float lerp7 = AndroidUtilities.lerp(1.0f, 4.0f, f14);
            canvas.clipRect((-lerp5) * lerp7, (-lerp6) * lerp7, lerp5 * lerp7, lerp6 * lerp7);
        }
        currentWidth = f0Var.getCurrentWidth();
        zf.f fVar = f0Var.f45330y;
        currentHeight = f0Var.getCurrentHeight();
        int i12 = fVar.f51165i;
        if (i12 == 90 || i12 == 270) {
            currentHeight = currentWidth;
            currentWidth = currentHeight;
        }
        float w10 = e2.c.w(fVar.f51168l, 1.0f, f15, 1.0f);
        float f17 = currentWidth;
        float containerWidth = getContainerWidth() / f17;
        float f18 = currentHeight;
        if (containerWidth * f18 > getContainerHeight()) {
            containerWidth = getContainerHeight() / f18;
        }
        canvas.translate(fVar.d * 1.0f, fVar.f51162e * 1.0f);
        float f19 = (fVar.f51163f / w10) * containerWidth;
        eg.t2 t2Var2 = f0Var.f45321b;
        if (t2Var2 != null && (cropState = t2Var2.D0) != null) {
            lerp = AndroidUtilities.lerp(cropState.cropScale, f19, f14);
        } else {
            lerp = AndroidUtilities.lerp(1.0f, f19, f14);
        }
        canvas.scale(lerp, lerp);
        canvas.translate(fVar.f51160b * f17 * 1.0f, fVar.f51161c * f18 * 1.0f);
        float d = f0Var.d.d(i12, false) + f0Var.f45321b.getOrientation() + fVar.f51164g;
        MediaController.CropState cropState4 = f0Var.f45321b.D0;
        if (cropState4 == null) {
            lerp2 = AndroidUtilities.lerp(0.0f, d, f0Var.f45327s);
        } else {
            lerp2 = AndroidUtilities.lerp(cropState4.cropRotate + cropState4.transformRotation, d, f0Var.f45327s);
        }
        canvas.rotate(lerp2);
        canvas.rotate(f0Var.f45321b.getOrientation());
        org.telegram.ui.Components.z5 z5Var = f0Var.f45322c;
        if (f0Var.B) {
            MediaController.CropState cropState5 = f0Var.f45321b.D0;
            if (cropState5 != null && cropState5.mirrored) {
                z4 = true;
            }
            z4 = false;
        } else {
            zf.l lVar = a0Var.I;
            if (lVar != null) {
                z4 = lVar.f51198j;
            }
            z4 = false;
        }
        canvas.scale(AndroidUtilities.lerp(1.0f, -1.0f, z5Var.e(z4)), 1.0f);
        canvas.translate((-f0Var.f45321b.getContentWidth()) / 2.0f, (-f0Var.f45321b.getContentHeight()) / 2.0f);
        eg.t2 t2Var3 = f0Var.f45321b;
        Paint paint2 = t2Var3.C0;
        Bitmap bitmap = t2Var3.f5492x0;
        if (bitmap != null) {
            paint2.setAlpha(255);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
        }
        canvas.restore();
    }
}
