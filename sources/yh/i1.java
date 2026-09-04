package yh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
public final class i1 extends View {
    public final k1 f50332a;
    public CharSequence f50333b;

    public i1(Context context) {
        super(context);
        k1 k1Var = new k1(this);
        this.f50332a = k1Var;
        k1Var.setCallback(this);
    }

    public final void a(int i10, int i11) {
        this.f50332a.f29797a.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), new int[]{i10, i11}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }

    public final void b(String str, boolean z10) {
        int i10;
        this.f50333b = str;
        if (z10) {
            i10 = 10;
        } else {
            i10 = 11;
        }
        this.f50332a.e(i10, str, z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        k1 k1Var = this.f50332a;
        k1Var.setBounds(0, 0, width, height);
        k1Var.draw(canvas);
    }

    public CharSequence getText() {
        return this.f50333b;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f));
    }

    public void setBackdrop(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.f50332a.d(stargiftattributebackdrop, false, false);
        invalidate();
    }

    public void setColor(int i10) {
        Paint paint = this.f50332a.f29797a;
        paint.setShader(null);
        paint.setColor(i10);
    }

    public void setStrokeColor(int i10) {
        this.f50332a.d.setColor(i10);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f50332a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
