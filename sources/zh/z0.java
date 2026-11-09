package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class z0 extends View {
    public final b1 f60637a;
    public CharSequence f60638b;

    public z0(Context context) {
        super(context);
        b1 b1Var = new b1(this);
        this.f60637a = b1Var;
        b1Var.setCallback(this);
    }

    public final void a(int i7, int i10) {
        ((Paint) this.f60637a.f220b).setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(48.0f), new int[]{i7, i10}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }

    public final void b(String str, boolean z9) {
        int i7;
        this.f60638b = str;
        if (z9) {
            i7 = 10;
        } else {
            i7 = 11;
        }
        this.f60637a.f(i7, str, z9);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        b1 b1Var = this.f60637a;
        b1Var.setBounds(0, 0, width, height);
        b1Var.draw(canvas);
    }

    public CharSequence getText() {
        return this.f60638b;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f));
    }

    public void setBackdrop(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.f60637a.e(stargiftattributebackdrop, false, false);
        invalidate();
    }

    public void setColor(int i7) {
        Paint paint = (Paint) this.f60637a.f220b;
        paint.setShader(null);
        paint.setColor(i7);
    }

    public void setStrokeColor(int i7) {
        this.f60637a.f60222r.setColor(i7);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f60637a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
