package rh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
public final class m0 extends y3 {
    public final float[] D0;
    public final Path E0;
    public final float[] F0;
    public final t0 G0;

    public m0(t0 t0Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, ph.x1 x1Var, bh.c cVar, bh.c cVar2, bh.c cVar3, bh.c cVar4, bh.c cVar5, bh.c cVar6) {
        super(context, p6Var, x1Var, cVar, null, cVar2, cVar3, cVar4, cVar5, cVar6);
        this.G0 = t0Var;
        this.D0 = new float[3];
        this.E0 = new Path();
        this.F0 = new float[8];
    }

    @Override
    public final void d(f4.d dVar) {
        super.d(dVar);
        this.G0.h1(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.E0);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final int getFinalHeight() {
        return org.telegram.messenger.i0.L(315.0f);
    }

    @Override
    public final float getRealHeight() {
        return org.telegram.messenger.i0.L(315.0f);
    }

    @Override
    public final void k(int i10) {
        jg.a3[] a3VarArr;
        t0 t0Var = this.G0;
        ImageView imageView = t0Var.f47486e2;
        if (imageView != null && org.telegram.ui.ActionBar.t6.H1(imageView.getBackground(), i10, false)) {
            t0Var.f47486e2.invalidate();
        }
        ImageView imageView2 = t0Var.f47487f2;
        if (imageView2 != null && org.telegram.ui.ActionBar.t6.H1(imageView2.getBackground(), i10, false)) {
            t0Var.f47487f2.invalidate();
        }
        for (jg.a3 a3Var : t0Var.R1) {
            Drawable background = a3Var.getBackground();
            org.telegram.ui.Components.f6 f6Var = (org.telegram.ui.Components.f6) a3Var.f9891b;
            if (org.telegram.ui.ActionBar.t6.H1(background, i10, false)) {
                a3Var.invalidate();
            }
            int f7 = i0.b.f(0.33f, i10, -1);
            float[] fArr = this.D0;
            Color.colorToHSV(f7, fArr);
            fArr[1] = Math.min(1.0f, fArr[1] * 1.1f);
            fArr[2] = Math.min(1.0f, fArr[2] * 1.1f);
            int HSVToColor = Color.HSVToColor(fArr);
            if (f6Var.getSizeableBackground() instanceof o3) {
                ((o3) f6Var.getSizeableBackground()).f47293b.setColor(HSVToColor);
                f6Var.invalidate();
            } else if (org.telegram.ui.ActionBar.t6.H1(f6Var.getSizeableBackground(), HSVToColor, false)) {
                f6Var.invalidate();
            }
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float L = org.telegram.messenger.i0.L(12.0f);
        float[] fArr = this.F0;
        fArr[3] = L;
        fArr[2] = L;
        fArr[1] = L;
        fArr[0] = L;
        Path path = this.E0;
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, i10, i11, this.F0, Path.Direction.CW);
    }
}
