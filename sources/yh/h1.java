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
public final class h1 extends View {
    public final j1 f50282a;
    public CharSequence f50283b;

    public h1(Context context) {
        super(context);
        j1 j1Var = new j1(this);
        this.f50282a = j1Var;
        j1Var.setCallback(this);
    }

    public final void a(int i10, int i11) {
        ((Paint) this.f50282a.f25027b).setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), new int[]{i10, i11}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
    }

    public final void b(String str, boolean z10) {
        int i10;
        this.f50283b = str;
        if (z10) {
            i10 = 10;
        } else {
            i10 = 11;
        }
        this.f50282a.f(i10, str, z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        j1 j1Var = this.f50282a;
        j1Var.setBounds(0, 0, width, height);
        j1Var.draw(canvas);
    }

    public CharSequence getText() {
        return this.f50283b;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f));
    }

    public void setBackdrop(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        this.f50282a.e(stargiftattributebackdrop, false, false);
        invalidate();
    }

    public void setColor(int i10) {
        Paint paint = (Paint) this.f50282a.f25027b;
        paint.setShader(null);
        paint.setColor(i10);
    }

    public void setStrokeColor(int i10) {
        this.f50282a.f50322r.setColor(i10);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f50282a != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
