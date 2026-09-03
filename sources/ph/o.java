package ph;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.gj0;
public final class o extends Drawable {
    public final Paint f42077a;
    public float f42078b;
    public float f42079c;
    public long d;
    public boolean e;
    public boolean f42080f;
    public boolean f42081g;
    public final gj0 h;
    public final t9 f42082i;
    public final t9 f42083j;

    public o(t9 t9Var, t9 t9Var2) {
        this.f42083j = t9Var;
        Paint paint = new Paint(1);
        this.f42077a = paint;
        this.f42079c = 1.0f;
        this.f42082i = t9Var2;
        gj0 gj0Var = new gj0(R.raw.chat_audio_record_delete_3, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.h = gj0Var;
        gj0Var.m0 = true;
        paint.setColor(-2406842);
        gj0Var.X = true;
        gj0Var.O(-2406842, "Cup Red");
        gj0Var.O(-2406842, "Box");
        gj0Var.m();
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z4 = this.f42081g;
        gj0 gj0Var = this.h;
        if (z4) {
            gj0Var.setAlpha((int) (this.f42078b * 255.0f * this.f42079c));
        }
        Paint paint = this.f42077a;
        paint.setAlpha((int) (this.f42078b * 255.0f * this.f42079c));
        long currentTimeMillis = System.currentTimeMillis() - this.d;
        if (!this.e && !this.f42081g) {
            float f10 = this.f42078b - (((float) currentTimeMillis) / 600.0f);
            this.f42078b = f10;
            if (f10 <= 0.0f) {
                this.f42078b = 0.0f;
                this.e = true;
            }
        } else {
            float f11 = (((float) currentTimeMillis) / 600.0f) + this.f42078b;
            this.f42078b = f11;
            if (f11 >= 1.0f) {
                this.f42078b = 1.0f;
                this.e = false;
            }
        }
        this.d = System.currentTimeMillis();
        gj0Var.setBounds(getBounds());
        if (this.f42081g) {
            gj0Var.draw(canvas);
        }
        if (!this.f42081g || !gj0Var.s()) {
            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), AndroidUtilities.dp(5.0f), paint);
        }
        this.f42083j.invalidate();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f42079c = i10 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
