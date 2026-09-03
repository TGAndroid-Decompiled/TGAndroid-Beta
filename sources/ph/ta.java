package ph;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class ta extends View implements c2 {
    public Paint f42453a;
    public Paint f42454b;
    public org.telegram.ui.Components.j6 f42455c;
    public boolean d;
    public org.telegram.ui.Components.z5 e;

    public final void a(long j10, boolean z4) {
        long j11 = j10 % 60;
        long j12 = (j10 - j11) / 60;
        StringBuilder sb = new StringBuilder(5);
        if (j12 < 10) {
            sb.append('0');
        }
        sb.append(j12);
        sb.append(':');
        if (j11 < 10) {
            sb.append('0');
        }
        sb.append(j11);
        this.f42455c.q(sb, z4, true);
    }

    public final void b(boolean z4, boolean z10) {
        float f10;
        this.d = z4;
        if (!z10) {
            org.telegram.ui.Components.z5 z5Var = this.e;
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            z5Var.d(f10, true);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        Paint paint = this.f42454b;
        org.telegram.ui.Components.j6 j6Var = this.f42455c;
        super.onDraw(canvas);
        org.telegram.ui.Components.z5 z5Var = this.e;
        if (this.d) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        float d = z5Var.d(f10, false);
        float dp = AndroidUtilities.dp(12.66f) * d;
        float d10 = j6Var.d() + dp;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(((getWidth() - d10) / 2.0f) - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(18.0f), ((getWidth() + d10) / 2.0f) + AndroidUtilities.dp(8.0f), AndroidUtilities.dp(40.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), this.f42453a);
        if (d > 0.0f) {
            paint.setAlpha((int) (Utilities.clamp((((float) Math.sin((((float) (System.currentTimeMillis() % 2000)) / 1000.0f) * 3.141592653589793d)) / 4.0f) + 0.75f, 1.0f, 0.0f) * 255.0f));
            invalidate();
            canvas.drawCircle(rectF.left + AndroidUtilities.dp(10.66f), rectF.centerY(), AndroidUtilities.dp(4.0f) * d, paint);
        }
        j6Var.setBounds((int) (rectF.left + dp), ((int) rectF.top) - AndroidUtilities.dp(1.0f), (int) rectF.right, (int) rectF.bottom);
        j6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(45.0f), 1073741824));
    }

    @Override
    public void setInvert(float f10) {
        this.f42453a.setColor(i0.a.d(f10, 1056964608, 268435456));
        this.f42455c.r(i0.a.d(f10, -1, -16777216));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f42455c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
