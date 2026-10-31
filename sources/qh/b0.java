package qh;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import j$.util.function.Consumer$CC;
import java.util.WeakHashMap;
import java.util.function.Consumer;
public final class b0 implements Consumer {
    public final i0 f45570a;
    public final m f45571b;

    public b0(i0 i0Var, m mVar) {
        this.f45570a = i0Var;
        this.f45571b = mVar;
    }

    @Override
    public final void accept(Object obj) {
        c cVar;
        float f7;
        float f10;
        float[] fArr;
        b0 b0Var = this;
        Canvas canvas = (Canvas) obj;
        i0 i0Var = b0Var.f45570a;
        c cVar2 = i0Var.f45668y;
        RectF rectF = cVar2.M;
        WeakHashMap weakHashMap = cVar2.N;
        Paint paint = cVar2.f45578c;
        long b10 = c.b();
        int i10 = 0;
        while (true) {
            m mVar = b0Var.f45571b;
            if (i10 >= mVar.getChildCount()) {
                break;
            }
            View childAt = mVar.getChildAt(i10);
            if ((childAt instanceof l) && childAt.getVisibility() == 0) {
                if (!weakHashMap.containsKey(childAt)) {
                    weakHashMap.put(childAt, Boolean.TRUE);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setColor(-1);
                    gradientDrawable.setCornerRadius(org.telegram.messenger.i0.L(10.0f));
                    f10 = 2.5f;
                    f7 = 10.0f;
                    childAt.setBackground(new RippleDrawable(ColorStateList.valueOf(788529151), null, new InsetDrawable((Drawable) gradientDrawable, (int) org.telegram.messenger.i0.N(2.5f))));
                } else {
                    f7 = 10.0f;
                    f10 = 2.5f;
                }
                String key = ((l) childAt).getKey();
                if (key != null && (fArr = (float[]) cVar2.f45583n.get(key)) != null) {
                    float c10 = c.c(fArr, b10);
                    if (c10 > 0.004f) {
                        float translationX = childAt.getTranslationX() + childAt.getLeft();
                        float translationY = childAt.getTranslationY() + childAt.getTop();
                        float N = (int) org.telegram.messenger.i0.N(f10);
                        cVar = cVar2;
                        rectF.set(translationX + N, translationY + N, (translationX + childAt.getWidth()) - N, (translationY + childAt.getHeight()) - N);
                        if (!childAt.isPressed()) {
                            paint.setColor(788529151);
                            paint.setAlpha((int) (Color.alpha(788529151) * c10));
                            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(f7), org.telegram.messenger.i0.L(f7), paint);
                        }
                        i10++;
                        b0Var = this;
                        cVar2 = cVar;
                    }
                }
            }
            cVar = cVar2;
            i10++;
            b0Var = this;
            cVar2 = cVar;
        }
        if (!i0Var.d.I.isEmpty()) {
            i0Var.f45668y.invalidate();
        }
    }

    public Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
