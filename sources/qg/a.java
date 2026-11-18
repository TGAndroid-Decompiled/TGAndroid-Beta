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
import org.telegram.messenger.lz;
import org.telegram.messenger.mz;
import org.telegram.ui.ActionBar.n6;
public final class a extends Drawable {
    public static lz f56131j;
    public static final int[] f56132k = {7322096, 16766590, 13338331, 9367192, 16749490, 16478047};
    public static final SparseArray f56133l;
    public final lz f56134a;
    public LinearGradient f56135b;
    public int f56137e;
    public final Paint f56138f;
    public final Paint f56139g;
    public int[] h;
    public final Matrix f56136c = new Matrix();
    public final ArrayList d = new ArrayList();
    public int f56140i = -1;

    static {
        SparseArray sparseArray = new SparseArray();
        f56133l = sparseArray;
        sparseArray.put(7322096, new int[]{-16687423, -11814913});
        sparseArray.put(16766590, new int[]{-1419264, -9380});
        sparseArray.put(13338331, new int[]{-6014789, -1737985});
        sparseArray.put(9367192, new int[]{-15617007, -6823116});
        sparseArray.put(16749490, new int[]{-1826470, -34407});
        sparseArray.put(16478047, new int[]{-3795707, -36532});
    }

    public a(int i7) {
        if (f56131j == null) {
            f56131j = mz.h(2131624294, -1);
        }
        lz clone = f56131j.clone();
        SparseArray sparseArray = clone.f25500r;
        this.f56134a = clone;
        ArrayList arrayList = clone.f25485a;
        arrayList.add(arrayList.get(0));
        Paint paint = new Paint(1);
        this.f56139g = paint;
        Paint paint2 = new Paint(1);
        this.f56138f = paint2;
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
        int i10 = this.f56140i;
        if (i10 == i7 && i10 == -1) {
            return;
        }
        this.f56140i = i7;
        int[] iArr2 = f56132k;
        int a10 = a(iArr2[0], i7);
        this.f56137e = 0;
        for (int i11 = 0; i11 < 6; i11++) {
            int a11 = a(iArr2[i11], i7);
            if (a11 < a10) {
                this.f56137e = i11;
                a10 = a11;
            }
        }
        int[] iArr3 = (int[]) f56133l.get(iArr2[this.f56137e]);
        if (n6.I.q()) {
            iArr = new int[]{i0.a.f(0.2f, iArr3[0], -1), i0.a.f(0.2f, iArr3[1], -1)};
        } else {
            iArr = iArr3;
        }
        this.h = iArr;
        Paint paint = new Paint(1);
        LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, iArr, (float[]) null, Shader.TileMode.CLAMP);
        this.f56135b = linearGradient;
        linearGradient.setLocalMatrix(this.f56136c);
        paint.setShader(this.f56135b);
        this.f56134a.f25500r.put(0, paint);
        this.f56139g.setColor(i0.a.f(0.1f, iArr[1], -1));
        this.f56138f.setColor(i0.a.f(0.1f, iArr[0], -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        Matrix matrix = this.f56136c;
        matrix.reset();
        matrix.setScale(1.0f, getBounds().height() / 100.0f);
        this.f56135b.setLocalMatrix(matrix);
        Rect bounds = getBounds();
        lz lzVar = this.f56134a;
        lzVar.setBounds(bounds);
        lzVar.draw(canvas);
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
        this.f56134a.setAlpha(i7);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
