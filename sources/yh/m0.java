package yh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class m0 extends x3 {
    public final float[] A0;
    public final Path B0;
    public final float[] C0;
    public final s0 D0;

    public m0(s0 s0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, k0 k0Var, ai.e2 e2Var, ai.e2 e2Var2, ai.e2 e2Var3, ai.e2 e2Var4, ai.e2 e2Var5, ai.e2 e2Var6) {
        super(context, f6Var, k0Var, e2Var, null, e2Var2, e2Var3, e2Var4, e2Var5, e2Var6);
        this.D0 = s0Var;
        this.A0 = new float[3];
        this.B0 = new Path();
        this.C0 = new float[8];
    }

    @Override
    public final void d(f4.d dVar) {
        super.d(dVar);
        this.D0.T(true);
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
        ai.v7[] v7VarArr;
        s0 s0Var = this.D0;
        ImageView imageView = s0Var.m0;
        if (imageView != null && org.telegram.ui.ActionBar.j6.B1(imageView.getBackground(), i10, false)) {
            s0Var.m0.invalidate();
        }
        ImageView imageView2 = s0Var.f47777n0;
        if (imageView2 != null && org.telegram.ui.ActionBar.j6.B1(imageView2.getBackground(), i10, false)) {
            s0Var.f47777n0.invalidate();
        }
        for (ai.v7 v7Var : s0Var.Z) {
            Drawable background = v7Var.getBackground();
            org.telegram.ui.Components.n6 n6Var = (org.telegram.ui.Components.n6) v7Var.d;
            if (org.telegram.ui.ActionBar.j6.B1(background, i10, false)) {
                v7Var.invalidate();
            }
            int d = i0.a.d(0.33f, i10, -1);
            float[] fArr = this.A0;
            Color.colorToHSV(d, fArr);
            fArr[1] = Math.min(1.0f, fArr[1] * 1.1f);
            fArr[2] = Math.min(1.0f, fArr[2] * 1.1f);
            int HSVToColor = Color.HSVToColor(fArr);
            if (n6Var.getSizeableBackground() instanceof n3) {
                ((n3) n6Var.getSizeableBackground()).f47514b.setColor(HSVToColor);
                n6Var.invalidate();
            } else if (org.telegram.ui.ActionBar.j6.B1(n6Var.getSizeableBackground(), HSVToColor, false)) {
                n6Var.invalidate();
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
