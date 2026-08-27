package wf;

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
import org.telegram.ui.ActionBar.g6;

public final class a extends Drawable {

    public static SvgHelper.SvgDrawable f49300j;

    public static final int[] f49301k = {7322096, 16766590, 13338331, 9367192, 16749490, 16478047};

    public static final SparseArray f49302l;

    public final SvgHelper.SvgDrawable f49303a;

    public LinearGradient f49304b;

    public int f49306e;

    public final Paint f49307f;

    public final Paint f49308g;
    public int[] h;

    public final Matrix f49305c = new Matrix();
    public final ArrayList d = new ArrayList();

    public int f49309i = -1;

    static {
        SparseArray sparseArray = new SparseArray();
        f49302l = sparseArray;
        sparseArray.put(7322096, new int[]{-16687423, -11814913});
        sparseArray.put(16766590, new int[]{-1419264, -9380});
        sparseArray.put(13338331, new int[]{-6014789, -1737985});
        sparseArray.put(9367192, new int[]{-15617007, -6823116});
        sparseArray.put(16749490, new int[]{-1826470, -34407});
        sparseArray.put(16478047, new int[]{-3795707, -36532});
    }

    public a(int i10) {
        if (f49300j == null) {
            f49300j = SvgHelper.getDrawable(R.raw.topic_bubble, -1);
        }
        SvgHelper.SvgDrawable svgDrawableClone = f49300j.clone();
        this.f49303a = svgDrawableClone;
        svgDrawableClone.copyCommandFromPosition(0);
        Paint paint = new Paint(1);
        this.f49308g = paint;
        Paint paint2 = new Paint(1);
        this.f49307f = paint2;
        paint2.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint2.setStyle(Paint.Style.STROKE);
        svgDrawableClone.setPaint(paint, 1);
        svgDrawableClone.setPaint(paint2, 2);
        b(i10);
    }

    public static int a(int i10, int i11) {
        return Math.abs(Color.blue(i10) - Color.blue(i11)) + Math.abs(Color.green(i10) - Color.green(i11)) + Math.abs(Color.red(i10) - Color.red(i11));
    }

    public final void b(int i10) {
        int i11 = this.f49309i;
        if (i11 == i10 && i11 == -1) {
            return;
        }
        this.f49309i = i10;
        int[] iArr = f49301k;
        int iA = a(iArr[0], i10);
        this.f49306e = 0;
        for (int i12 = 0; i12 < 6; i12++) {
            int iA2 = a(iArr[i12], i10);
            if (iA2 < iA) {
                this.f49306e = i12;
                iA = iA2;
            }
        }
        int[] iArr2 = (int[]) f49302l.get(iArr[this.f49306e]);
        int[] iArr3 = g6.I.q() ? new int[]{i0.b.d(0.2f, iArr2[0], -1), i0.b.d(0.2f, iArr2[1], -1)} : iArr2;
        this.h = iArr3;
        Paint paint = new Paint(1);
        LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, iArr3, (float[]) null, Shader.TileMode.CLAMP);
        this.f49304b = linearGradient;
        linearGradient.setLocalMatrix(this.f49305c);
        paint.setShader(this.f49304b);
        this.f49303a.setPaint(paint, 0);
        this.f49308g.setColor(i0.b.d(0.1f, iArr3[1], -1));
        this.f49307f.setColor(i0.b.d(0.1f, iArr3[0], -16777216));
    }

    @Override
    public final void draw(Canvas canvas) {
        Matrix matrix = this.f49305c;
        matrix.reset();
        matrix.setScale(1.0f, getBounds().height() / 100.0f);
        this.f49304b.setLocalMatrix(matrix);
        Rect bounds = getBounds();
        SvgHelper.SvgDrawable svgDrawable = this.f49303a;
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
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((View) arrayList.get(i10)).invalidate();
            i10++;
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.f49303a.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
