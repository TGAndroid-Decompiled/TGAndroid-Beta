package vh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.ci0;
public final class o extends Drawable {
    public final Paint f51594a;
    public float f51595b;
    public float f51596c;
    public long d;
    public boolean e;
    public boolean f51597f;
    public boolean f51598g;
    public final ci0 h;
    public final e8 f51599i;
    public final e8 f51600j;

    public o(e8 e8Var, e8 e8Var2) {
        this.f51600j = e8Var;
        Paint paint = new Paint(1);
        this.f51594a = paint;
        this.f51596c = 1.0f;
        this.f51599i = e8Var2;
        ci0 ci0Var = new ci0(2131623976, org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(28.0f), false, null);
        this.h = ci0Var;
        ci0Var.f25148o0 = true;
        paint.setColor(-2406842);
        ci0Var.Z = true;
        ci0Var.Q(-2406842, "Cup Red");
        ci0Var.Q(-2406842, "Box");
        ci0Var.o();
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z10 = this.f51598g;
        ci0 ci0Var = this.h;
        if (z10) {
            ci0Var.setAlpha((int) (this.f51595b * 255.0f * this.f51596c));
        }
        Paint paint = this.f51594a;
        paint.setAlpha((int) (this.f51595b * 255.0f * this.f51596c));
        long currentTimeMillis = System.currentTimeMillis() - this.d;
        if (!this.e && !this.f51598g) {
            float f7 = this.f51595b - (((float) currentTimeMillis) / 600.0f);
            this.f51595b = f7;
            if (f7 <= 0.0f) {
                this.f51595b = 0.0f;
                this.e = true;
            }
        } else {
            float f10 = (((float) currentTimeMillis) / 600.0f) + this.f51595b;
            this.f51595b = f10;
            if (f10 >= 1.0f) {
                this.f51595b = 1.0f;
                this.e = false;
            }
        }
        this.d = System.currentTimeMillis();
        ci0Var.setBounds(getBounds());
        if (this.f51598g) {
            ci0Var.draw(canvas);
        }
        if (!this.f51598g || !ci0Var.u()) {
            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), org.telegram.messenger.i0.L(5.0f), paint);
        }
        this.f51600j.invalidate();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f51596c = i10 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
