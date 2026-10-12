package xh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
public final class j1 extends View {
    public final l1 f51545a;
    public CharSequence f51546b;

    public j1(Context context) {
        super(context);
        l1 l1Var = new l1(this);
        this.f51545a = l1Var;
        l1Var.setCallback(this);
    }

    public final void a(int i10, int i11) {
        ((Paint) this.f51545a.f27633b).setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), new int[]{i10, i11}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }

    public final void b(String str, boolean z10) {
        int i10;
        this.f51546b = str;
        if (z10) {
            i10 = 10;
        } else {
            i10 = 11;
        }
        this.f51545a.f(i10, str, z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        l1 l1Var = this.f51545a;
        l1Var.setBounds(0, 0, width, height);
        l1Var.draw(canvas);
    }

    public CharSequence getText() {
        return this.f51546b;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f));
    }

    public void setBackdrop(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.f51545a.e(stargiftattributebackdrop, false, false);
        invalidate();
    }

    public void setColor(int i10) {
        Paint paint = (Paint) this.f51545a.f27633b;
        paint.setShader(null);
        paint.setColor(i10);
    }

    public void setStrokeColor(int i10) {
        this.f51545a.f51573r.setColor(i10);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f51545a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
