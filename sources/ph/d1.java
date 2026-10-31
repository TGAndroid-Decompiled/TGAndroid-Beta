package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class d1 extends View {
    public final f1 f45020a;
    public CharSequence f45021b;

    public d1(Context context) {
        super(context);
        f1 f1Var = new f1(this);
        this.f45020a = f1Var;
        f1Var.setCallback(this);
    }

    public final void a(int i10, int i11) {
        ((Paint) this.f45020a.f26491b).setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.i0.L(48.0f), org.telegram.messenger.i0.L(48.0f), new int[]{i10, i11}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }

    public final void b(String str, boolean z10) {
        int i10;
        this.f45021b = str;
        if (z10) {
            i10 = 10;
        } else {
            i10 = 11;
        }
        this.f45020a.f(i10, str, z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        f1 f1Var = this.f45020a;
        f1Var.setBounds(0, 0, width, height);
        f1Var.draw(canvas);
    }

    public CharSequence getText() {
        return this.f45021b;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(org.telegram.messenger.i0.L(50.0f), org.telegram.messenger.i0.L(50.0f));
    }

    public void setBackdrop(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.f45020a.e(stargiftattributebackdrop, false, false);
        invalidate();
    }

    public void setColor(int i10) {
        Paint paint = (Paint) this.f45020a.f26491b;
        paint.setShader(null);
        paint.setColor(i10);
    }

    public void setStrokeColor(int i10) {
        this.f45020a.f45037r.setColor(i10);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f45020a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
