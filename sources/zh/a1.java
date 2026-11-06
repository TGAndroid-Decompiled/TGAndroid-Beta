package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class a1 extends View {
    public final c1 f60079a;
    public CharSequence f60080b;

    public a1(Context context) {
        super(context);
        c1 c1Var = new c1(this);
        this.f60079a = c1Var;
        c1Var.setCallback(this);
    }

    public final void a(int i7, int i10) {
        ((Paint) this.f60079a.f220b).setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(48.0f), new int[]{i7, i10}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }

    public final void b(String str, boolean z9) {
        int i7;
        this.f60080b = str;
        if (z9) {
            i7 = 10;
        } else {
            i7 = 11;
        }
        this.f60079a.f(i7, str, z9);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        c1 c1Var = this.f60079a;
        c1Var.setBounds(0, 0, width, height);
        c1Var.draw(canvas);
    }

    public CharSequence getText() {
        return this.f60080b;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f));
    }

    public void setBackdrop(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.f60079a.e(stargiftattributebackdrop, false, false);
        invalidate();
    }

    public void setColor(int i7) {
        Paint paint = (Paint) this.f60079a.f220b;
        paint.setShader(null);
        paint.setColor(i7);
    }

    public void setStrokeColor(int i7) {
        this.f60079a.f60123r.setColor(i7);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f60079a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
