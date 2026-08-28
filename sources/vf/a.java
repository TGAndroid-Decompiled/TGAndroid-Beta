package vf;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.ui.ActionBar.f6;
public final class a extends Drawable {
    public static SvgHelper.SvgDrawable f48389j;
    public static final int[] f48390k = {7322096, 16766590, 13338331, 9367192, 16749490, 16478047};
    public static final SparseArray f48391l;
    public final SvgHelper.SvgDrawable f48392a;
    public LinearGradient f48393b;
    public int f48395e;
    public final Paint f48396f;
    public final Paint f48397g;
    public int[] h;
    public final Matrix f48394c = new Matrix();
    public final ArrayList d = new ArrayList();
    public int f48398i = -1;

    static {
        SparseArray sparseArray = new SparseArray();
        f48391l = sparseArray;
        sparseArray.put(7322096, new int[]{-16687423, -11814913});
        sparseArray.put(16766590, new int[]{-1419264, -9380});
        sparseArray.put(13338331, new int[]{-6014789, -1737985});
        sparseArray.put(9367192, new int[]{-15617007, -6823116});
        sparseArray.put(16749490, new int[]{-1826470, -34407});
        sparseArray.put(16478047, new int[]{-3795707, -36532});
    }

    public a(int i9) {
        if (f48389j == null) {
            f48389j = SvgHelper.getDrawable(R.raw.topic_bubble, -1);
        }
        SvgHelper.SvgDrawable clone = f48389j.clone();
        this.f48392a = clone;
        clone.copyCommandFromPosition(0);
        Paint paint = new Paint(1);
        this.f48397g = paint;
        Paint paint2 = new Paint(1);
        this.f48396f = paint2;
        paint2.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint2.setStyle(Paint.Style.STROKE);
        clone.setPaint(paint, 1);
        clone.setPaint(paint2, 2);
        b(i9);
    }

    public static int a(int i9, int i10) {
        int abs = Math.abs(Color.red(i9) - Color.red(i10));
        return Math.abs(Color.blue(i9) - Color.blue(i10)) + Math.abs(Color.green(i9) - Color.green(i10)) + abs;
    }

    public final void b(int i9) {
        int[] iArr;
        int i10 = this.f48398i;
        if (i10 == i9 && i10 == -1) {
            return;
        }
        this.f48398i = i9;
        int[] iArr2 = f48390k;
        int a2 = a(iArr2[0], i9);
        this.f48395e = 0;
        for (int i11 = 0; i11 < 6; i11++) {
            int a3 = a(iArr2[i11], i9);
            if (a3 < a2) {
                this.f48395e = i11;
                a2 = a3;
            }
        }
        int[] iArr3 = (int[]) f48391l.get(iArr2[this.f48395e]);
        if (f6.I.q()) {
            iArr = new int[]{i0.a.d(0.2f, iArr3[0], -1), i0.a.d(0.2f, iArr3[1], -1)};
        } else {
            iArr = iArr3;
        }
        this.h = iArr;
        Paint paint = new Paint(1);
        LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, iArr, (float[]) null, Shader.TileMode.CLAMP);
        this.f48393b = linearGradient;
        linearGradient.setLocalMatrix(this.f48394c);
        paint.setShader(this.f48393b);
        this.f48392a.setPaint(paint, 0);
        this.f48397g.setColor(i0.a.d(0.1f, iArr[1], -1));
        this.f48396f.setColor(i0.a.d(0.1f, iArr[0], -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        Matrix matrix = this.f48394c;
        matrix.reset();
        matrix.setScale(1.0f, getBounds().height() / 100.0f);
        this.f48393b.setLocalMatrix(matrix);
        Rect bounds = getBounds();
        SvgHelper.SvgDrawable svgDrawable = this.f48392a;
        svgDrawable.setBounds(bounds);
        svgDrawable.draw(canvas);
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(24.0f);
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void invalidateSelf() {
        super.invalidateSelf();
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i9 < arrayList.size()) {
                ((View) arrayList.get(i9)).invalidate();
                i9++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void setAlpha(int i9) {
        this.f48392a.setAlpha(i9);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
