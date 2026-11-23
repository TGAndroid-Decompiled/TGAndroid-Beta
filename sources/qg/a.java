package qg;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.g0;
import org.telegram.messenger.mz;
import org.telegram.messenger.nz;
import org.telegram.ui.ActionBar.m6;
public final class a extends Drawable {
    public static mz f56141j;
    public static final int[] f56142k = {7322096, 16766590, 13338331, 9367192, 16749490, 16478047};
    public static final SparseArray f56143l;
    public final mz f56144a;
    public LinearGradient f56145b;
    public int f56147e;
    public final Paint f56148f;
    public final Paint f56149g;
    public int[] h;
    public final Matrix f56146c = new Matrix();
    public final ArrayList d = new ArrayList();
    public int f56150i = -1;

    static {
        SparseArray sparseArray = new SparseArray();
        f56143l = sparseArray;
        sparseArray.put(7322096, new int[]{-16687423, -11814913});
        sparseArray.put(16766590, new int[]{-1419264, -9380});
        sparseArray.put(13338331, new int[]{-6014789, -1737985});
        sparseArray.put(9367192, new int[]{-15617007, -6823116});
        sparseArray.put(16749490, new int[]{-1826470, -34407});
        sparseArray.put(16478047, new int[]{-3795707, -36532});
    }

    public a(int i7) {
        if (f56141j == null) {
            f56141j = nz.h(2131624294, -1);
        }
        mz clone = f56141j.clone();
        SparseArray sparseArray = clone.f25668r;
        this.f56144a = clone;
        ArrayList arrayList = clone.f25653a;
        arrayList.add(arrayList.get(0));
        Paint paint = new Paint(1);
        this.f56149g = paint;
        Paint paint2 = new Paint(1);
        this.f56148f = paint2;
        paint2.setStrokeWidth(g0.L(1.0f));
        paint2.setStyle(Paint.Style.STROKE);
        sparseArray.put(1, paint);
        sparseArray.put(2, paint2);
        b(i7);
    }

    public static int a(int i7, int i10) {
        int abs = Math.abs(Color.red(i7) - Color.red(i10));
        return Math.abs(Color.blue(i7) - Color.blue(i10)) + Math.abs(Color.green(i7) - Color.green(i10)) + abs;
    }

    public final void b(int i7) {
        int[] iArr;
        int i10 = this.f56150i;
        if (i10 == i7 && i10 == -1) {
            return;
        }
        this.f56150i = i7;
        int[] iArr2 = f56142k;
        int a10 = a(iArr2[0], i7);
        this.f56147e = 0;
        for (int i11 = 0; i11 < 6; i11++) {
            int a11 = a(iArr2[i11], i7);
            if (a11 < a10) {
                this.f56147e = i11;
                a10 = a11;
            }
        }
        int[] iArr3 = (int[]) f56143l.get(iArr2[this.f56147e]);
        if (m6.I.q()) {
            iArr = new int[]{i0.a.f(0.2f, iArr3[0], -1), i0.a.f(0.2f, iArr3[1], -1)};
        } else {
            iArr = iArr3;
        }
        this.h = iArr;
        Paint paint = new Paint(1);
        LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, iArr, (float[]) null, Shader.TileMode.CLAMP);
        this.f56145b = linearGradient;
        linearGradient.setLocalMatrix(this.f56146c);
        paint.setShader(this.f56145b);
        this.f56144a.f25668r.put(0, paint);
        this.f56149g.setColor(i0.a.f(0.1f, iArr[1], -1));
        this.f56148f.setColor(i0.a.f(0.1f, iArr[0], -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        Matrix matrix = this.f56146c;
        matrix.reset();
        matrix.setScale(1.0f, getBounds().height() / 100.0f);
        this.f56145b.setLocalMatrix(matrix);
        Rect bounds = getBounds();
        mz mzVar = this.f56144a;
        mzVar.setBounds(bounds);
        mzVar.draw(canvas);
    }

    @Override
    public final int getIntrinsicHeight() {
        return g0.L(24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return g0.L(24.0f);
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i7 < arrayList.size()) {
                ((View) arrayList.get(i7)).invalidate();
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void setAlpha(int i7) {
        this.f56144a.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
