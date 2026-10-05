package yh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class n0 extends v3 {
    public final float[] A0;
    public final Path B0;
    public final float[] C0;
    public final t0 D0;

    public n0(t0 t0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, rg.s1 s1Var, ai.e2 e2Var, ai.e2 e2Var2, ai.e2 e2Var3, ai.e2 e2Var4, ai.e2 e2Var5, ai.e2 e2Var6) {
        super(context, d6Var, s1Var, e2Var, null, e2Var2, e2Var3, e2Var4, e2Var5, e2Var6);
        this.D0 = t0Var;
        this.A0 = new float[3];
        this.B0 = new Path();
        this.C0 = new float[8];
    }

    @Override
    public final void d(f4.d dVar) {
        super.d(dVar);
        this.D0.R(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.B0);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final int getFinalHeight() {
        return AndroidUtilities.dp(315.0f);
    }

    @Override
    public final float getRealHeight() {
        return AndroidUtilities.dp(315.0f);
    }

    @Override
    public final void j(int i10) {
        ai.w7[] w7VarArr;
        t0 t0Var = this.D0;
        ImageView imageView = t0Var.m0;
        if (imageView != null && org.telegram.ui.ActionBar.i6.B1(imageView.getBackground(), i10, false)) {
            t0Var.m0.invalidate();
        }
        ImageView imageView2 = t0Var.f51998n0;
        if (imageView2 != null && org.telegram.ui.ActionBar.i6.B1(imageView2.getBackground(), i10, false)) {
            t0Var.f51998n0.invalidate();
        }
        for (ai.w7 w7Var : t0Var.Z) {
            Drawable background = w7Var.getBackground();
            org.telegram.ui.Components.p6 p6Var = (org.telegram.ui.Components.p6) w7Var.d;
            if (org.telegram.ui.ActionBar.i6.B1(background, i10, false)) {
                w7Var.invalidate();
            }
            int d = i0.a.d(0.33f, i10, -1);
            float[] fArr = this.A0;
            Color.colorToHSV(d, fArr);
            fArr[1] = Math.min(1.0f, fArr[1] * 1.1f);
            fArr[2] = Math.min(1.0f, fArr[2] * 1.1f);
            int HSVToColor = Color.HSVToColor(fArr);
            if (p6Var.getSizeableBackground() instanceof l3) {
                ((l3) p6Var.getSizeableBackground()).f51576b.setColor(HSVToColor);
                p6Var.invalidate();
            } else if (org.telegram.ui.ActionBar.i6.B1(p6Var.getSizeableBackground(), HSVToColor, false)) {
                p6Var.invalidate();
            }
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        float dp = AndroidUtilities.dp(12.0f);
        float[] fArr = this.C0;
        fArr[3] = dp;
        fArr[2] = dp;
        fArr[1] = dp;
        fArr[0] = dp;
        Path path = this.B0;
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, i10, i11, this.C0, Path.Direction.CW);
    }
}
