package yf;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import org.telegram.ui.Cells.u0;
import org.telegram.ui.Cells.v0;
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final int f50522a;
    public final Object f50523b;
    public final Object f50524c;

    public a(int i10, Object obj, Object obj2) {
        this.f50522a = i10;
        this.f50523b = obj;
        this.f50524c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f50522a) {
            case 0:
                b bVar = (b) this.f50523b;
                int[] iArr = (int[]) this.f50524c;
                bVar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Paint paint = new Paint(1);
                LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, new int[]{i0.a.d(floatValue, iArr[0], bVar.h[0]), i0.a.d(floatValue, iArr[1], bVar.h[1])}, (float[]) null, Shader.TileMode.CLAMP);
                bVar.f50529b = linearGradient;
                linearGradient.setLocalMatrix(bVar.f50530c);
                paint.setShader(bVar.f50529b);
                bVar.f50528a.setPaint(paint, 0);
                bVar.f50533g.setColor(i0.a.d(0.1f, i0.a.d(floatValue, iArr[1], bVar.h[1]), -1));
                bVar.f50532f.setColor(i0.a.d(0.1f, i0.a.d(floatValue, iArr[0], bVar.h[0]), -16777216));
                bVar.invalidateSelf();
                return;
            default:
                ((u0) this.f50523b).f25715c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((v0) this.f50524c).invalidate();
                return;
        }
    }
}
