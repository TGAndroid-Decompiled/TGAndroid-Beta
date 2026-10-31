package vh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.bi0;
public final class o extends Drawable {
    public final Paint f51579a;
    public float f51580b;
    public float f51581c;
    public long d;
    public boolean e;
    public boolean f51582f;
    public boolean f51583g;
    public final bi0 h;
    public final e8 f51584i;
    public final e8 f51585j;

    public o(e8 e8Var, e8 e8Var2) {
        this.f51585j = e8Var;
        Paint paint = new Paint(1);
        this.f51579a = paint;
        this.f51581c = 1.0f;
        this.f51584i = e8Var2;
        bi0 bi0Var = new bi0(2131623976, org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(28.0f), false, null);
        this.h = bi0Var;
        bi0Var.f24769o0 = true;
        paint.setColor(-2406842);
        bi0Var.Z = true;
        bi0Var.Q(-2406842, "Cup Red");
        bi0Var.Q(-2406842, "Box");
        bi0Var.o();
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10 = this.f51583g;
        bi0 bi0Var = this.h;
        if (z10) {
            bi0Var.setAlpha((int) (this.f51580b * 255.0f * this.f51581c));
        }
        Paint paint = this.f51579a;
        paint.setAlpha((int) (this.f51580b * 255.0f * this.f51581c));
        long currentTimeMillis = System.currentTimeMillis() - this.d;
        if (!this.e && !this.f51583g) {
            float f7 = this.f51580b - (((float) currentTimeMillis) / 600.0f);
            this.f51580b = f7;
            if (f7 <= 0.0f) {
                this.f51580b = 0.0f;
                this.e = true;
            }
        } else {
            float f10 = (((float) currentTimeMillis) / 600.0f) + this.f51580b;
            this.f51580b = f10;
            if (f10 >= 1.0f) {
                this.f51580b = 1.0f;
                this.e = false;
            }
        }
        this.d = System.currentTimeMillis();
        bi0Var.setBounds(getBounds());
        if (this.f51583g) {
            bi0Var.draw(canvas);
        }
        if (!this.f51583g || !bi0Var.u()) {
            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), org.telegram.messenger.i0.L(5.0f), paint);
        }
        this.f51585j.invalidate();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f51581c = i10 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
