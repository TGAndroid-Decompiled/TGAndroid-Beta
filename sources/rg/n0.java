package rg;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.hs;
import org.telegram.ui.jb0;
import w7.x5;
public final class n0 extends FrameLayout implements l0 {
    public final e6 f47358a;
    public final ArrayList f47359b;
    public final m0 f47360c;
    public final m0 d;
    public final m0 f47361e;
    public final boolean f47362f;

    public n0(Context context, e6 e6Var) {
        super(context);
        jb0[] values;
        this.f47359b = new ArrayList();
        this.f47358a = e6Var;
        for (jb0 jb0Var : jb0.values()) {
            if (jb0Var.f38902e) {
                this.f47359b.add(jb0Var);
            }
            if (this.f47359b.size() == 3) {
                break;
            }
        }
        if (this.f47359b.size() < 3) {
            FileLog.e(new IllegalArgumentException("There should be at least 3 premium icons!"));
            this.f47362f = true;
            return;
        }
        this.f47360c = a(context, 0);
        this.d = a(context, 1);
        this.f47361e = a(context, 2);
        setClipChildren(false);
    }

    public final m0 a(Context context, int i10) {
        jb0 jb0Var = (jb0) this.f47359b.get(i10);
        ?? qVar = new org.telegram.ui.Cells.q(context);
        v1 v1Var = new v1(20);
        qVar.f47347e = v1Var;
        Paint paint = new Paint(1);
        qVar.f47348f = paint;
        v1Var.f47491r = 12;
        v1Var.f47492s = 8;
        v1Var.f47493t = 6;
        if (i10 == 1) {
            v1Var.N = 1001;
        }
        if (i10 == 0) {
            v1Var.N = 1002;
        }
        v1Var.O = this.f47358a;
        v1Var.P = i6.Zj;
        v1Var.c();
        paint.setColor(-1);
        qVar.setLayoutParams(x5.a(-2.0f, 0.0f, 52.0f, 0.0f, 0.0f, -2, 17));
        qVar.setForeground(jb0Var.f38901c);
        qVar.setBackgroundResource(jb0Var.f38900b);
        qVar.setPadding(AndroidUtilities.dp(8.0f));
        qVar.setBackgroundOuterPadding(AndroidUtilities.dp(32.0f));
        addView(qVar);
        return qVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f47362f) {
            return;
        }
        int min = Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        int dp = AndroidUtilities.dp(76.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f47360c.getLayoutParams();
        layoutParams.height = dp;
        layoutParams.width = dp;
        float f7 = dp;
        layoutParams.bottomMargin = (int) ((min * 0.1f) + f7);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.d.getLayoutParams();
        layoutParams2.height = dp;
        layoutParams2.width = dp;
        int i12 = (int) (f7 * 0.95f);
        layoutParams2.rightMargin = i12;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f47361e.getLayoutParams();
        layoutParams3.height = dp;
        layoutParams3.width = dp;
        layoutParams3.leftMargin = i12;
    }

    @Override
    public void setOffset(float f7) {
        if (this.f47362f) {
            return;
        }
        float abs = Math.abs(f7 / getMeasuredWidth());
        float interpolation = hs.f27120i.getInterpolation(abs);
        int right = getRight();
        m0 m0Var = this.f47361e;
        m0Var.setTranslationX(((m0Var.getWidth() * 1.5f) + (right - m0Var.getRight()) + AndroidUtilities.dp(32.0f)) * interpolation);
        m0Var.setTranslationY(AndroidUtilities.dp(16.0f) * interpolation);
        float f10 = 1.0f;
        float clamp = Utilities.clamp(AndroidUtilities.lerp(1.0f, 1.5f, interpolation), 1.0f, 0.0f);
        m0Var.setScaleX(clamp);
        m0Var.setScaleY(clamp);
        int top = getTop();
        m0 m0Var2 = this.f47360c;
        m0Var2.setTranslationY((((top - m0Var2.getTop()) - (m0Var2.getHeight() * 1.8f)) - AndroidUtilities.dp(32.0f)) * abs);
        m0Var2.setTranslationX(AndroidUtilities.dp(16.0f) * abs);
        float clamp2 = Utilities.clamp(AndroidUtilities.lerp(1.0f, 1.8f, abs), 1.0f, 0.0f);
        m0Var2.setScaleX(clamp2);
        m0Var2.setScaleY(clamp2);
        float interpolation2 = hs.f27119g.getInterpolation(abs);
        int left = getLeft();
        m0 m0Var3 = this.d;
        m0Var3.setTranslationX((((left - m0Var3.getLeft()) - (m0Var3.getWidth() * 2.5f)) + AndroidUtilities.dp(32.0f)) * interpolation2);
        m0Var3.setTranslationY(((m0Var3.getHeight() * 2.5f) + (getBottom() - m0Var3.getBottom()) + AndroidUtilities.dp(32.0f)) * interpolation2);
        float clamp3 = Utilities.clamp(AndroidUtilities.lerp(1.0f, 2.5f, abs), 1.0f, 0.0f);
        m0Var3.setScaleX(clamp3);
        m0Var3.setScaleY(clamp3);
        if (abs < 0.4f) {
            f10 = abs / 0.4f;
        }
        m0Var.h = f10;
        m0Var2.h = f10;
        m0Var3.h = f10;
    }
}
