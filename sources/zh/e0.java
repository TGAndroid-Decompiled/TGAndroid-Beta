package zh;

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
import org.telegram.messenger.AndroidUtilities;
public final class e0 implements Consumer {
    public final n0 f51990a;
    public final m f51991b;

    public e0(n0 n0Var, m mVar) {
        this.f51990a = n0Var;
        this.f51991b = mVar;
    }

    @Override
    public final void accept(Object obj) {
        c cVar;
        float f7;
        float f10;
        float[] fArr;
        e0 e0Var = this;
        Canvas canvas = (Canvas) obj;
        n0 n0Var = e0Var.f51990a;
        c cVar2 = n0Var.f52065x;
        RectF rectF = cVar2.M;
        WeakHashMap weakHashMap = cVar2.N;
        Paint paint = cVar2.f51695c;
        long b10 = c.b();
        int i10 = 0;
        while (true) {
            m mVar = e0Var.f51991b;
            if (i10 >= mVar.getChildCount()) {
                break;
            }
            View childAt = mVar.getChildAt(i10);
            if ((childAt instanceof l) && childAt.getVisibility() == 0) {
                if (!weakHashMap.containsKey(childAt)) {
                    weakHashMap.put(childAt, Boolean.TRUE);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setColor(-1);
                    gradientDrawable.setCornerRadius(AndroidUtilities.dp(10.0f));
                    f10 = 2.5f;
                    f7 = 10.0f;
                    childAt.setBackground(new RippleDrawable(ColorStateList.valueOf(788529151), null, new InsetDrawable((Drawable) gradientDrawable, (int) AndroidUtilities.dpf2(2.5f))));
                } else {
                    f7 = 10.0f;
                    f10 = 2.5f;
                }
                String key = ((l) childAt).getKey();
                if (key != null && (fArr = (float[]) cVar2.f51700n.get(key)) != null) {
                    float c10 = c.c(fArr, b10);
                    if (c10 > 0.004f) {
                        float translationX = childAt.getTranslationX() + childAt.getLeft();
                        float translationY = childAt.getTranslationY() + childAt.getTop();
                        float dpf2 = (int) AndroidUtilities.dpf2(f10);
                        cVar = cVar2;
                        rectF.set(translationX + dpf2, translationY + dpf2, (translationX + childAt.getWidth()) - dpf2, (translationY + childAt.getHeight()) - dpf2);
                        if (!childAt.isPressed()) {
                            paint.setColor(788529151);
                            paint.setAlpha((int) (Color.alpha(788529151) * c10));
                            canvas.drawRoundRect(rectF, AndroidUtilities.dp(f7), AndroidUtilities.dp(f7), paint);
                        }
                        i10++;
                        e0Var = this;
                        cVar2 = cVar;
                    }
                }
            }
            cVar = cVar2;
            i10++;
            e0Var = this;
            cVar2 = cVar;
        }
        if (!n0Var.d.I.isEmpty()) {
            n0Var.f52065x.invalidate();
        }
    }

    public Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
