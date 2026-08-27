package zf;

import android.animation.ValueAnimator;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;

public final class z1 implements ValueAnimator.AnimatorUpdateListener {

    public final int f50792a;

    public final Object f50793b;

    public final Object f50794c;

    public z1(int i10, Object obj, Object obj2) {
        this.f50792a = i10;
        this.f50793b = obj;
        this.f50794c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f50792a) {
            case 0:
                b2 b2Var = (b2) this.f50793b;
                boolean[] zArr = (boolean[]) this.f50794c;
                b2Var.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (fFloatValue >= 0.5f) {
                    if (!zArr[0]) {
                        zArr[0] = true;
                        b2Var.f50348n0.b(b2Var.f50355u0, false);
                    }
                    float f10 = (fFloatValue - 0.5f) / 0.5f;
                    b2Var.setRotationY((1.0f - f10) * (-90.0f));
                    b2Var.f50356v0 = (f10 * 0.3f) + 0.7f;
                    b2Var.invalidate();
                } else {
                    float f11 = fFloatValue / 0.5f;
                    b2Var.setRotationY(90.0f * f11);
                    b2Var.f50356v0 = ((1.0f - f11) * 0.3f) + 0.7f;
                    b2Var.invalidate();
                }
                break;
            default:
                wf.a aVar = (wf.a) this.f50793b;
                int[] iArr = (int[]) this.f50794c;
                aVar.getClass();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Paint paint = new Paint(1);
                LinearGradient linearGradient = new LinearGradient(0.0f, 100.0f, 0.0f, 0.0f, new int[]{i0.b.d(fFloatValue2, iArr[0], aVar.h[0]), i0.b.d(fFloatValue2, iArr[1], aVar.h[1])}, (float[]) null, Shader.TileMode.CLAMP);
                aVar.f49304b = linearGradient;
                linearGradient.setLocalMatrix(aVar.f49305c);
                paint.setShader(aVar.f49304b);
                aVar.f49303a.setPaint(paint, 0);
                aVar.f49308g.setColor(i0.b.d(0.1f, i0.b.d(fFloatValue2, iArr[1], aVar.h[1]), -1));
                aVar.f49307f.setColor(i0.b.d(0.1f, i0.b.d(fFloatValue2, iArr[0], aVar.h[0]), -16777216));
                aVar.invalidateSelf();
                break;
        }
    }
}
