package pg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import java.util.Arrays;
import k7.n;
import lf.l0;
public final class a {
    public int d;
    public boolean e;
    public int f41206f;
    public float f41208i;
    public float f41209j;
    public final Rect f41203a = new Rect();
    public final float[] f41204b = new float[8];
    public final float[] f41205c = new float[8];
    public float f41207g = 0.75f;
    public final float h = 1.5f;
    public final Path f41210k = new Path();
    public boolean f41211l = true;
    public final Rect f41212m = new Rect();
    public final Path f41213n = new Path();
    public final Path f41214o = new Path();

    public final void a() {
        float[] fArr = this.f41204b;
        this.f41211l = l0.c(fArr);
        Rect rect = this.f41203a;
        Rect rect2 = this.f41212m;
        rect2.set(rect);
        int i10 = this.d;
        rect2.inset(i10, i10);
        Path path = this.f41210k;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rect2.left, rect2.top, rect2.right, rect2.bottom, this.f41204b, direction);
        path.close();
        float min = Math.min(rect2.width(), rect2.height()) / 2.0f;
        float[] fArr2 = b.C;
        Arrays.fill(fArr2, 0.0f);
        fArr2[0] = fArr[0];
        fArr2[1] = fArr[1];
        fArr2[2] = fArr[2];
        fArr2[3] = fArr[3];
        if (this.f41211l && fArr[0] > min) {
            fArr2[3] = min;
            fArr2[2] = min;
            fArr2[1] = min;
            fArr2[0] = min;
        }
        Path path2 = this.f41213n;
        path2.rewind();
        float f10 = rect2.left;
        int i11 = rect2.top;
        path2.addRoundRect(f10, i11, rect2.right, Math.min(i11 + fArr[0], rect2.bottom), fArr2, direction);
        int i12 = rect2.top;
        float min2 = Math.min(i12 + fArr[0], rect2.bottom);
        Path.Direction direction2 = Path.Direction.CCW;
        path2.addRoundRect(rect2.left, i12 + this.f41208i, rect2.right, min2, fArr2, direction2);
        path2.close();
        Arrays.fill(fArr2, 0.0f);
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[5];
        fArr2[6] = fArr[6];
        fArr2[7] = fArr[7];
        if (this.f41211l && fArr[0] > min) {
            fArr2[7] = min;
            fArr2[6] = min;
            fArr2[5] = min;
            fArr2[4] = min;
        }
        Path path3 = this.f41214o;
        path3.rewind();
        path3.addRoundRect(rect2.left, Math.max(rect2.bottom - fArr[4], rect2.top), rect2.right, rect2.bottom, fArr2, direction);
        path3.addRoundRect(rect2.left, Math.max(rect2.bottom - fArr[4], rect2.top), rect2.right, rect2.bottom - this.f41209j, fArr2, direction2);
        path3.close();
    }

    public final void b(Canvas canvas, Paint paint) {
        Rect rect;
        if (this.f41211l) {
            float f10 = this.f41212m.bottom;
            float f11 = this.f41204b[0];
            canvas.drawRoundRect(rect.left, rect.top, rect.right, f10, f11, f11, paint);
            return;
        }
        canvas.drawPath(this.f41210k, paint);
    }

    public final void c(Canvas canvas, Paint paint, boolean z4) {
        Rect rect;
        if (z4) {
            float f10 = this.f41212m.top;
            float[] fArr = this.f41204b;
            float a2 = n.a((fArr[0] * 2.0f) + f10, f10, rect.bottom);
            canvas.save();
            Rect rect2 = this.f41203a;
            canvas.clipRect(rect2.left, rect2.top, rect2.right, a2);
            float f11 = fArr[0];
            canvas.drawRoundRect(rect.left, rect.top, rect.right, a2, f11, f11, paint);
            canvas.restore();
            return;
        }
        b(canvas, paint);
    }
}
