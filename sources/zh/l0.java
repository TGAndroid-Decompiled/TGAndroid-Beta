package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
public final class l0 extends o3 {
    public final float[] A0;
    public final Path B0;
    public final float[] C0;
    public final r0 D0;

    public l0(r0 r0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, j0 j0Var, ah.f fVar, ah.f fVar2, ah.f fVar3, ah.f fVar4, ah.f fVar5, ah.f fVar6) {
        super(context, c6Var, j0Var, fVar, null, fVar2, fVar3, fVar4, fVar5, fVar6);
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
        bi.i7[] i7VarArr;
        r0 r0Var = this.D0;
        ImageView imageView = r0Var.m0;
        if (imageView != null && org.telegram.ui.ActionBar.g6.C1(imageView.getBackground(), i10, false)) {
            r0Var.m0.invalidate();
        }
        ImageView imageView2 = r0Var.f51045n0;
        if (imageView2 != null && org.telegram.ui.ActionBar.g6.C1(imageView2.getBackground(), i10, false)) {
            r0Var.f51045n0.invalidate();
        }
        for (bi.i7 i7Var : r0Var.Z) {
            Drawable background = i7Var.getBackground();
            org.telegram.ui.Components.s6 s6Var = (org.telegram.ui.Components.s6) i7Var.d;
            if (org.telegram.ui.ActionBar.g6.C1(background, i10, false)) {
                i7Var.invalidate();
            }
            int d = i0.a.d(0.33f, i10, -1);
            float[] fArr = this.A0;
            Color.colorToHSV(d, fArr);
            fArr[1] = Math.min(1.0f, fArr[1] * 1.1f);
            fArr[2] = Math.min(1.0f, fArr[2] * 1.1f);
            int HSVToColor = Color.HSVToColor(fArr);
            if (s6Var.getSizeableBackground() instanceof f3) {
                ((f3) s6Var.getSizeableBackground()).f50497b.setColor(HSVToColor);
                s6Var.invalidate();
            } else if (org.telegram.ui.ActionBar.g6.C1(s6Var.getSizeableBackground(), HSVToColor, false)) {
                s6Var.invalidate();
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
