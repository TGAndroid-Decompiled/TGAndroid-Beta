package qg;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.wr;
import org.telegram.ui.lb0;
import w7.a6;
public final class p0 extends FrameLayout implements n0 {
    public final f6 f40852a;
    public final ArrayList f40853b;
    public final o0 f40854c;
    public final o0 d;
    public final o0 e;
    public final boolean f40855f;

    public p0(Context context, f6 f6Var) {
        super(context);
        lb0[] values;
        this.f40853b = new ArrayList();
        this.f40852a = f6Var;
        for (lb0 lb0Var : lb0.values()) {
            if (lb0Var.e) {
                this.f40853b.add(lb0Var);
            }
            if (this.f40853b.size() == 3) {
                break;
            }
        }
        if (this.f40853b.size() < 3) {
            FileLog.e(new IllegalArgumentException("There should be at least 3 premium icons!"));
            this.f40855f = true;
            return;
        }
        this.f40854c = a(context, 0);
        this.d = a(context, 1);
        this.e = a(context, 2);
        setClipChildren(false);
    }

    public final o0 a(Context context, int i10) {
        lb0 lb0Var = (lb0) this.f40853b.get(i10);
        ?? qVar = new org.telegram.ui.Cells.q(context);
        w1 w1Var = new w1(20);
        qVar.e = w1Var;
        Paint paint = new Paint(1);
        qVar.f40847f = paint;
        w1Var.f40969r = 12;
        w1Var.f40970s = 8;
        w1Var.f40971t = 6;
        if (i10 == 1) {
            w1Var.N = 1001;
        }
        if (i10 == 0) {
            w1Var.N = 1002;
        }
        w1Var.O = this.f40852a;
        w1Var.P = j6.Zj;
        w1Var.c();
        paint.setColor(-1);
        qVar.setLayoutParams(a6.d(-2, -2.0f, 17, 0.0f, 52.0f, 0.0f, 0.0f));
        qVar.setForeground(lb0Var.f34636c);
        qVar.setBackgroundResource(lb0Var.f34635b);
        qVar.setPadding(AndroidUtilities.dp(8.0f));
        qVar.setBackgroundOuterPadding(AndroidUtilities.dp(32.0f));
        addView(qVar);
        return qVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f40855f) {
            return;
        }
        int min = Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        int dp = AndroidUtilities.dp(76.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f40854c.getLayoutParams();
        layoutParams.height = dp;
        layoutParams.width = dp;
        float f7 = dp;
        layoutParams.bottomMargin = (int) ((min * 0.1f) + f7);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.d.getLayoutParams();
        layoutParams2.height = dp;
        layoutParams2.width = dp;
        int i12 = (int) (f7 * 0.95f);
        layoutParams2.rightMargin = i12;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.e.getLayoutParams();
        layoutParams3.height = dp;
        layoutParams3.width = dp;
        layoutParams3.leftMargin = i12;
    }

    @Override
    public void setOffset(float f7) {
        if (this.f40855f) {
            return;
        }
        float abs = Math.abs(f7 / getMeasuredWidth());
        float interpolation = wr.f28821i.getInterpolation(abs);
        int right = getRight();
        o0 o0Var = this.e;
        o0Var.setTranslationX(((o0Var.getWidth() * 1.5f) + (right - o0Var.getRight()) + AndroidUtilities.dp(32.0f)) * interpolation);
        o0Var.setTranslationY(AndroidUtilities.dp(16.0f) * interpolation);
        float f10 = 1.0f;
        float clamp = Utilities.clamp(AndroidUtilities.lerp(1.0f, 1.5f, interpolation), 1.0f, 0.0f);
        o0Var.setScaleX(clamp);
        o0Var.setScaleY(clamp);
        int top = getTop();
        o0 o0Var2 = this.f40854c;
        o0Var2.setTranslationY((((top - o0Var2.getTop()) - (o0Var2.getHeight() * 1.8f)) - AndroidUtilities.dp(32.0f)) * abs);
        o0Var2.setTranslationX(AndroidUtilities.dp(16.0f) * abs);
        float clamp2 = Utilities.clamp(AndroidUtilities.lerp(1.0f, 1.8f, abs), 1.0f, 0.0f);
        o0Var2.setScaleX(clamp2);
        o0Var2.setScaleY(clamp2);
        float interpolation2 = wr.f28820g.getInterpolation(abs);
        int left = getLeft();
        o0 o0Var3 = this.d;
        o0Var3.setTranslationX((((left - o0Var3.getLeft()) - (o0Var3.getWidth() * 2.5f)) + AndroidUtilities.dp(32.0f)) * interpolation2);
        o0Var3.setTranslationY(((o0Var3.getHeight() * 2.5f) + (getBottom() - o0Var3.getBottom()) + AndroidUtilities.dp(32.0f)) * interpolation2);
        float clamp3 = Utilities.clamp(AndroidUtilities.lerp(1.0f, 2.5f, abs), 1.0f, 0.0f);
        o0Var3.setScaleX(clamp3);
        o0Var3.setScaleY(clamp3);
        if (abs < 0.4f) {
            f10 = abs / 0.4f;
        }
        o0Var.h = f10;
        o0Var2.h = f10;
        o0Var3.h = f10;
    }
}
