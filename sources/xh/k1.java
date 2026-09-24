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
public final class k1 extends View {
    public final m1 f46236a;
    public CharSequence f46237b;

    public k1(Context context) {
        super(context);
        m1 m1Var = new m1(this);
        this.f46236a = m1Var;
        m1Var.setCallback(this);
    }

    public final void a(int i10, int i11) {
        this.f46236a.f28301a.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), new int[]{i10, i11}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }

    public final void b(String str, boolean z10) {
        int i10;
        this.f46237b = str;
        if (z10) {
            i10 = 10;
        } else {
            i10 = 11;
        }
        this.f46236a.e(i10, str, z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        m1 m1Var = this.f46236a;
        m1Var.setBounds(0, 0, width, height);
        m1Var.draw(canvas);
    }

    public CharSequence getText() {
        return this.f46237b;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f));
    }

    public void setBackdrop(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.f46236a.d(stargiftattributebackdrop, false, false);
        invalidate();
    }

    public void setColor(int i10) {
        Paint paint = this.f46236a.f28301a;
        paint.setShader(null);
        paint.setColor(i10);
    }

    public void setStrokeColor(int i10) {
        this.f46236a.d.setColor(i10);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f46236a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
