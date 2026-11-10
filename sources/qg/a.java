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
import org.telegram.messenger.rz;
import org.telegram.messenger.sz;
import org.telegram.ui.ActionBar.m6;
public final class a extends Drawable {
    public static rz f54122j;
    public static final int[] f54123k = {7322096, 16766590, 13338331, 9367192, 16749490, 16478047};
    public static final SparseArray f54124l;
    public final rz f54125a;
    public LinearGradient f54126b;
    public int f54128e;
    public final Paint f54129f;
    public final Paint f54130g;
    public int[] h;
    public final Matrix f54127c = new Matrix();
    public final ArrayList d = new ArrayList();
    public int f54131i = -1;

    static {
        SparseArray sparseArray = new SparseArray();
        f54124l = sparseArray;
        sparseArray.put(7322096, new int[]{-16687423, -11814913});
        sparseArray.put(16766590, new int[]{-1419264, -9380});
        sparseArray.put(13338331, new int[]{-6014789, -1737985});
        sparseArray.put(9367192, new int[]{-15617007, -6823116});
        sparseArray.put(16749490, new int[]{-1826470, -34407});
        sparseArray.put(16478047, new int[]{-3795707, -36532});
    }

    public a(int i7) {
        if (f54122j == null) {
            f54122j = sz.h(2131624293, -1);
        }
        rz clone = f54122j.clone();
        SparseArray sparseArray = clone.f25398r;
        this.f54125a = clone;
        ArrayList arrayList = clone.f25383a;
        arrayList.add(arrayList.get(0));
        Paint paint = new Paint(1);
        this.f54130g = paint;
        Paint paint2 = new Paint(1);
        this.f54129f = paint2;
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
        int i10 = this.f54131i;
        if (i10 == i7 && i10 == -1) {
            return;
        }
        this.f54131i = i7;
        int[] iArr2 = f54123k;
        int a10 = a(iArr2[0], i7);
        this.f54128e = 0;
        for (int i11 = 0; i11 < 6; i11++) {
            int a11 = a(iArr2[i11], i7);
            if (a11 < a10) {
                this.f54128e = i11;
                a10 = a11;
            }
        }
        int[] iArr3 = (int[]) f54124l.get(iArr2[this.f54128e]);
        if (m6.I.q()) {
            iArr = new int[]{i0.a.f(0.2f, iArr3[0], -1), i0.a.f(0.2f, iArr3[1], -1)};
        } else {
            iArr = iArr3;
        }
        this.h = iArr;
        Paint paint = new Paint(1);
        LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, iArr, (float[]) null, Shader.TileMode.CLAMP);
        this.f54126b = linearGradient;
        linearGradient.setLocalMatrix(this.f54127c);
        paint.setShader(this.f54126b);
        this.f54125a.f25398r.put(0, paint);
        this.f54130g.setColor(i0.a.f(0.1f, iArr[1], -1));
        this.f54129f.setColor(i0.a.f(0.1f, iArr[0], -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        Matrix matrix = this.f54127c;
        matrix.reset();
        matrix.setScale(1.0f, getBounds().height() / 100.0f);
        this.f54126b.setLocalMatrix(matrix);
        Rect bounds = getBounds();
        rz rzVar = this.f54125a;
        rzVar.setBounds(bounds);
        rzVar.draw(canvas);
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
        this.f54125a.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
