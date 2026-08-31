package qh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ij0;
public final class o extends Drawable {
    public final Paint f45805a;
    public float f45806b;
    public float f45807c;
    public long d;
    public boolean f45808e;
    public boolean f45809f;
    public boolean f45810g;
    public final ij0 h;
    public final r9 f45811i;
    public final r9 f45812j;

    public o(r9 r9Var, r9 r9Var2) {
        this.f45812j = r9Var;
        Paint paint = new Paint(1);
        this.f45805a = paint;
        this.f45807c = 1.0f;
        this.f45811i = r9Var2;
        int i10 = R.raw.chat_audio_record_delete_3;
        ij0 ij0Var = new ij0(i10, l.d.j(i10, ""), AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.h = ij0Var;
        ij0Var.m0 = true;
        paint.setColor(-2406842);
        ij0Var.X = true;
        ij0Var.O(-2406842, "Cup Red");
        ij0Var.O(-2406842, "Box");
        ij0Var.m();
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z4 = this.f45810g;
        ij0 ij0Var = this.h;
        if (z4) {
            ij0Var.setAlpha((int) (this.f45806b * 255.0f * this.f45807c));
        }
        Paint paint = this.f45805a;
        paint.setAlpha((int) (this.f45806b * 255.0f * this.f45807c));
        long currentTimeMillis = System.currentTimeMillis() - this.d;
        if (!this.f45808e && !this.f45810g) {
            float f10 = this.f45806b - (((float) currentTimeMillis) / 600.0f);
            this.f45806b = f10;
            if (f10 <= 0.0f) {
                this.f45806b = 0.0f;
                this.f45808e = true;
            }
        } else {
            float f11 = (((float) currentTimeMillis) / 600.0f) + this.f45806b;
            this.f45806b = f11;
            if (f11 >= 1.0f) {
                this.f45806b = 1.0f;
                this.f45808e = false;
            }
        }
        this.d = System.currentTimeMillis();
        ij0Var.setBounds(getBounds());
        if (this.f45810g) {
            ij0Var.draw(canvas);
        }
        if (!this.f45810g || !ij0Var.s()) {
            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), AndroidUtilities.dp(5.0f), paint);
        }
        this.f45812j.invalidate();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f45807c = i10 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
