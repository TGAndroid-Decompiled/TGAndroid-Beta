package th;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
public final class b2 extends FrameLayout {
    public final int f48797a;
    public final z2 f48798b;

    public b2(z2 z2Var, Context context, int i10) {
        super(context);
        this.f48797a = i10;
        this.f48798b = z2Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int x10;
        switch (this.f48797a) {
            case 0:
                z2 z2Var = this.f48798b;
                if (z2Var.f49741o2.getVisibility() == 0 && z2Var.f49741o2.getLayoutParams().width != (x10 = (int) (((z2Var.f49723j2.getX() + z2Var.f49723j2.getMeasuredWidth()) - z2Var.f49741o2.getX()) + org.telegram.messenger.i0.L(10.0f)))) {
                    z2Var.f49741o2.getLayoutParams().width = x10;
                    z2Var.f49741o2.invalidate();
                    z2Var.f49741o2.requestLayout();
                }
                super.dispatchDraw(canvas);
                return;
            case 1:
                super.dispatchDraw(canvas);
                z2 z2Var2 = this.f48798b;
                if (z2Var2.f49732m1 && z2Var2.A0 != null) {
                    canvas.save();
                    float f7 = 0.0f;
                    canvas.translate((getMeasuredWidth() - z2Var2.A0.c()) - org.telegram.messenger.i0.L(6.0f), 0.0f);
                    org.telegram.ui.Components.t5 t5Var = z2Var2.C0;
                    if (z2Var2.E0) {
                        f7 = 1.0f;
                    }
                    float e = t5Var.e(false, f7);
                    canvas.scale(e, e, z2Var2.A0.c() / 2.0f, org.telegram.messenger.i0.L(20.0f));
                    org.telegram.ui.Components.e6 e6Var = z2Var2.A0;
                    e6Var.B = 255;
                    e6Var.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                z2 z2Var3 = this.f48798b;
                if (z2Var3.f49732m1 && z2Var3.f49782z0 != null) {
                    canvas.save();
                    float f10 = 0.0f;
                    canvas.translate((getMeasuredWidth() - z2Var3.f49782z0.c()) - org.telegram.messenger.i0.L(6.0f), 0.0f);
                    org.telegram.ui.Components.t5 t5Var2 = z2Var3.B0;
                    if (z2Var3.D0) {
                        f10 = 1.0f;
                    }
                    float e7 = t5Var2.e(false, f10);
                    canvas.scale(e7, e7, z2Var3.f49782z0.c() / 2.0f, org.telegram.messenger.i0.L(20.0f));
                    org.telegram.ui.Components.e6 e6Var2 = z2Var3.f49782z0;
                    e6Var2.B = 255;
                    e6Var2.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f48797a) {
            case 1:
                if (drawable != this.f48798b.A0 && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 2:
                if (drawable != this.f48798b.f49782z0 && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }
}
