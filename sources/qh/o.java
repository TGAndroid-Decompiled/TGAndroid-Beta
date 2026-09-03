package qh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.hj0;
public final class o extends Drawable {
    public final Paint f45818a;
    public float f45819b;
    public float f45820c;
    public long d;
    public boolean f45821e;
    public boolean f45822f;
    public boolean f45823g;
    public final hj0 h;
    public final q9 f45824i;
    public final q9 f45825j;

    public o(q9 q9Var, q9 q9Var2) {
        this.f45825j = q9Var;
        Paint paint = new Paint(1);
        this.f45818a = paint;
        this.f45820c = 1.0f;
        this.f45824i = q9Var2;
        hj0 hj0Var = new hj0(R.raw.chat_audio_record_delete_3, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), false, null);
        this.h = hj0Var;
        hj0Var.m0 = true;
        paint.setColor(-2406842);
        hj0Var.X = true;
        hj0Var.O(-2406842, "Cup Red");
        hj0Var.O(-2406842, "Box");
        hj0Var.m();
    }

    @Override
    public final void draw(Canvas canvas) {
        boolean z4 = this.f45823g;
        hj0 hj0Var = this.h;
        if (z4) {
            hj0Var.setAlpha((int) (this.f45819b * 255.0f * this.f45820c));
        }
        Paint paint = this.f45818a;
        paint.setAlpha((int) (this.f45819b * 255.0f * this.f45820c));
        long currentTimeMillis = System.currentTimeMillis() - this.d;
        if (!this.f45821e && !this.f45823g) {
            float f10 = this.f45819b - (((float) currentTimeMillis) / 600.0f);
            this.f45819b = f10;
            if (f10 <= 0.0f) {
                this.f45819b = 0.0f;
                this.f45821e = true;
            }
        } else {
            float f11 = (((float) currentTimeMillis) / 600.0f) + this.f45819b;
            this.f45819b = f11;
            if (f11 >= 1.0f) {
                this.f45819b = 1.0f;
                this.f45821e = false;
            }
        }
        this.d = System.currentTimeMillis();
        hj0Var.setBounds(getBounds());
        if (this.f45823g) {
            hj0Var.draw(canvas);
        }
        if (!this.f45823g || !hj0Var.s()) {
            canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), AndroidUtilities.dp(5.0f), paint);
        }
        this.f45825j.invalidate();
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i10) {
        this.f45820c = i10 / 255.0f;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
