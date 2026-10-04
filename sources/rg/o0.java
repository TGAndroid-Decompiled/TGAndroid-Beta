package rg;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.tr;
import org.telegram.ui.jb0;
import w7.z5;
public final class o0 extends FrameLayout implements m0 {
    public final d6 f46232a;
    public final ArrayList f46233b;
    public final n0 f46234c;
    public final n0 d;
    public final n0 f46235e;
    public final boolean f46236f;

    public o0(Context context, d6 d6Var) {
        super(context);
        jb0[] values;
        this.f46233b = new ArrayList();
        this.f46232a = d6Var;
        for (jb0 jb0Var : jb0.values()) {
            if (jb0Var.f37634e) {
                this.f46233b.add(jb0Var);
            }
            if (this.f46233b.size() == 3) {
                break;
            }
        }
        if (this.f46233b.size() < 3) {
            FileLog.e(new IllegalArgumentException("There should be at least 3 premium icons!"));
            this.f46236f = true;
            return;
        }
        this.f46234c = a(context, 0);
        this.d = a(context, 1);
        this.f46235e = a(context, 2);
        setClipChildren(false);
    }

    public final n0 a(Context context, int i10) {
        jb0 jb0Var = (jb0) this.f46233b.get(i10);
        ?? qVar = new org.telegram.ui.Cells.q(context);
        x1 x1Var = new x1(20);
        qVar.f46226e = x1Var;
        Paint paint = new Paint(1);
        qVar.f46227f = paint;
        x1Var.f46380r = 12;
        x1Var.f46381s = 8;
        x1Var.f46382t = 6;
        if (i10 == 1) {
            x1Var.N = 1001;
        }
        if (i10 == 0) {
            x1Var.N = 1002;
        }
        x1Var.O = this.f46232a;
        x1Var.P = i6.Zj;
        x1Var.c();
        paint.setColor(-1);
        qVar.setLayoutParams(z5.d(-2, -2.0f, 17, 0.0f, 52.0f, 0.0f, 0.0f));
        qVar.setForeground(jb0Var.f37633c);
        qVar.setBackgroundResource(jb0Var.f37632b);
        qVar.setPadding(AndroidUtilities.dp(8.0f));
        qVar.setBackgroundOuterPadding(AndroidUtilities.dp(32.0f));
        addView(qVar);
        return qVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f46236f) {
            return;
        }
        int min = Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        int dp = AndroidUtilities.dp(76.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f46234c.getLayoutParams();
        layoutParams.height = dp;
        layoutParams.width = dp;
        float f7 = dp;
        layoutParams.bottomMargin = (int) ((min * 0.1f) + f7);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.d.getLayoutParams();
        layoutParams2.height = dp;
        layoutParams2.width = dp;
        int i12 = (int) (f7 * 0.95f);
        layoutParams2.rightMargin = i12;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f46235e.getLayoutParams();
        layoutParams3.height = dp;
        layoutParams3.width = dp;
        layoutParams3.leftMargin = i12;
    }

    @Override
    public void setOffset(float f7) {
        if (this.f46236f) {
            return;
        }
        float abs = Math.abs(f7 / getMeasuredWidth());
        float interpolation = tr.f31149i.getInterpolation(abs);
        int right = getRight();
        n0 n0Var = this.f46235e;
        n0Var.setTranslationX(((n0Var.getWidth() * 1.5f) + (right - n0Var.getRight()) + AndroidUtilities.dp(32.0f)) * interpolation);
        n0Var.setTranslationY(AndroidUtilities.dp(16.0f) * interpolation);
        float f10 = 1.0f;
        float clamp = Utilities.clamp(AndroidUtilities.lerp(1.0f, 1.5f, interpolation), 1.0f, 0.0f);
        n0Var.setScaleX(clamp);
        n0Var.setScaleY(clamp);
        int top = getTop();
        n0 n0Var2 = this.f46234c;
        n0Var2.setTranslationY((((top - n0Var2.getTop()) - (n0Var2.getHeight() * 1.8f)) - AndroidUtilities.dp(32.0f)) * abs);
        n0Var2.setTranslationX(AndroidUtilities.dp(16.0f) * abs);
        float clamp2 = Utilities.clamp(AndroidUtilities.lerp(1.0f, 1.8f, abs), 1.0f, 0.0f);
        n0Var2.setScaleX(clamp2);
        n0Var2.setScaleY(clamp2);
        float interpolation2 = tr.f31148g.getInterpolation(abs);
        int left = getLeft();
        n0 n0Var3 = this.d;
        n0Var3.setTranslationX((((left - n0Var3.getLeft()) - (n0Var3.getWidth() * 2.5f)) + AndroidUtilities.dp(32.0f)) * interpolation2);
        n0Var3.setTranslationY(((n0Var3.getHeight() * 2.5f) + (getBottom() - n0Var3.getBottom()) + AndroidUtilities.dp(32.0f)) * interpolation2);
        float clamp3 = Utilities.clamp(AndroidUtilities.lerp(1.0f, 2.5f, abs), 1.0f, 0.0f);
        n0Var3.setScaleX(clamp3);
        n0Var3.setScaleY(clamp3);
        if (abs < 0.4f) {
            f10 = abs / 0.4f;
        }
        n0Var.h = f10;
        n0Var2.h = f10;
        n0Var3.h = f10;
    }
}
