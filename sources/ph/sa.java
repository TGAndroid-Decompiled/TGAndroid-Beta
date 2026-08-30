package ph;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nr;
public final class sa extends View {
    public final Paint f42314a;
    public final org.telegram.ui.Components.j6 f42315b;
    public boolean f42316c;

    public sa(Activity activity) {
        super(activity);
        Paint paint = new Paint(1);
        this.f42314a = paint;
        this.f42316c = true;
        paint.setColor(Integer.MIN_VALUE);
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(false, true, true, false);
        this.f42315b = j6Var;
        j6Var.k(0.2f, 200L, nr.h);
        j6Var.t(AndroidUtilities.dp(13.0f));
        j6Var.r(-1);
        j6Var.u(AndroidUtilities.bold());
        j6Var.setCallback(this);
        j6Var.f25884b = 1;
        StringBuilder sb = new StringBuilder(8);
        sb.append("00:00:00");
        if (!TextUtils.equals(sb, j6Var.f25887g)) {
            j6Var.b();
            j6Var.q(sb, false, true);
        }
    }

    public final void a(boolean z4) {
        if (!this.f42316c && z4) {
            return;
        }
        this.f42316c = false;
        animate().cancel();
        if (z4) {
            org.telegram.ui.b.p(animate().translationY(AndroidUtilities.dp(6.0f)).alpha(0.0f).scaleX(0.8f).scaleY(0.8f), nr.h, 220L);
            return;
        }
        setTranslationY(AndroidUtilities.dp(6.0f));
        setScaleX(0.8f);
        setScaleY(0.8f);
        setAlpha(0.0f);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        org.telegram.ui.Components.j6 j6Var = this.f42315b;
        float d = j6Var.d();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(((getWidth() - d) / 2.0f) - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f), ((getWidth() + d) / 2.0f) + AndroidUtilities.dp(6.0f), AndroidUtilities.dp(23.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), this.f42314a);
        j6Var.setBounds((int) rectF.left, ((int) rectF.top) - AndroidUtilities.dp(1.0f), (int) rectF.right, (int) rectF.bottom);
        j6Var.draw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(25.0f), 1073741824));
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f42315b != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
