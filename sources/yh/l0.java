package yh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class l0 extends p3 {
    public final float[] A0;
    public final Path B0;
    public final float[] C0;
    public final r0 D0;

    public l0(r0 r0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, j0 j0Var, ai.e2 e2Var, ai.e2 e2Var2, ai.e2 e2Var3, ai.e2 e2Var4, ai.e2 e2Var5, ai.e2 e2Var6) {
        super(context, d6Var, j0Var, e2Var, null, e2Var2, e2Var3, e2Var4, e2Var5, e2Var6);
        this.D0 = r0Var;
        this.A0 = new float[3];
        this.B0 = new Path();
        this.C0 = new float[8];
    }

    @Override
    public final void d(f4.d dVar) {
        super.d(dVar);
        this.D0.U(true);
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
        ai.x7[] x7VarArr;
        r0 r0Var = this.D0;
        ImageView imageView = r0Var.m0;
        if (imageView != null && org.telegram.ui.ActionBar.h6.C1(imageView.getBackground(), i10, false)) {
            r0Var.m0.invalidate();
        }
        ImageView imageView2 = r0Var.f53224n0;
        if (imageView2 != null && org.telegram.ui.ActionBar.h6.C1(imageView2.getBackground(), i10, false)) {
            r0Var.f53224n0.invalidate();
        }
        for (ai.x7 x7Var : r0Var.Z) {
            Drawable background = x7Var.getBackground();
            org.telegram.ui.Components.r6 r6Var = (org.telegram.ui.Components.r6) x7Var.d;
            if (org.telegram.ui.ActionBar.h6.C1(background, i10, false)) {
                x7Var.invalidate();
            }
            int d = i0.a.d(0.33f, i10, -1);
            float[] fArr = this.A0;
            Color.colorToHSV(d, fArr);
            fArr[1] = Math.min(1.0f, fArr[1] * 1.1f);
            fArr[2] = Math.min(1.0f, fArr[2] * 1.1f);
            int HSVToColor = Color.HSVToColor(fArr);
            if (r6Var.getSizeableBackground() instanceof g3) {
                ((g3) r6Var.getSizeableBackground()).f52705b.setColor(HSVToColor);
                r6Var.invalidate();
            } else if (org.telegram.ui.ActionBar.h6.C1(r6Var.getSizeableBackground(), HSVToColor, false)) {
                r6Var.invalidate();
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
