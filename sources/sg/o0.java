package sg;

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
import org.telegram.ui.Components.pr;
import org.telegram.ui.lb0;
import w7.x5;
public final class o0 extends FrameLayout implements m0 {
    public final f6 f46189a;
    public final ArrayList f46190b;
    public final n0 f46191c;
    public final n0 d;
    public final n0 f46192e;
    public final boolean f46193f;

    public o0(Context context, f6 f6Var) {
        super(context);
        lb0[] values;
        this.f46190b = new ArrayList();
        this.f46189a = f6Var;
        for (lb0 lb0Var : lb0.values()) {
            if (lb0Var.f38264e) {
                this.f46190b.add(lb0Var);
            }
            if (this.f46190b.size() == 3) {
                break;
            }
        }
        if (this.f46190b.size() < 3) {
            FileLog.e(new IllegalArgumentException("There should be at least 3 premium icons!"));
            this.f46193f = true;
            return;
        }
        this.f46191c = a(context, 0);
        this.d = a(context, 1);
        this.f46192e = a(context, 2);
        setClipChildren(false);
    }

    public final n0 a(Context context, int i10) {
        lb0 lb0Var = (lb0) this.f46190b.get(i10);
        ?? qVar = new org.telegram.ui.Cells.q(context);
        y1 y1Var = new y1(20);
        qVar.f46183e = y1Var;
        Paint paint = new Paint(1);
        qVar.f46184f = paint;
        y1Var.f46359r = 12;
        y1Var.f46360s = 8;
        y1Var.f46361t = 6;
        if (i10 == 1) {
            y1Var.N = 1001;
        }
        if (i10 == 0) {
            y1Var.N = 1002;
        }
        y1Var.O = this.f46189a;
        y1Var.P = j6.Zj;
        y1Var.c();
        paint.setColor(-1);
        qVar.setLayoutParams(x5.d(-2, -2.0f, 17, 0.0f, 52.0f, 0.0f, 0.0f));
        qVar.setForeground(lb0Var.f38263c);
        qVar.setBackgroundResource(lb0Var.f38262b);
        qVar.setPadding(AndroidUtilities.dp(8.0f));
        qVar.setBackgroundOuterPadding(AndroidUtilities.dp(32.0f));
        addView(qVar);
        return qVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f46193f) {
            return;
        }
        int min = Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        int dp = AndroidUtilities.dp(76.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f46191c.getLayoutParams();
        layoutParams.height = dp;
        layoutParams.width = dp;
        float f7 = dp;
        layoutParams.bottomMargin = (int) ((min * 0.1f) + f7);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.d.getLayoutParams();
        layoutParams2.height = dp;
        layoutParams2.width = dp;
        int i12 = (int) (f7 * 0.95f);
        layoutParams2.rightMargin = i12;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f46192e.getLayoutParams();
        layoutParams3.height = dp;
        layoutParams3.width = dp;
        layoutParams3.leftMargin = i12;
    }

    @Override
    public void setOffset(float f7) {
        if (this.f46193f) {
            return;
        }
        float abs = Math.abs(f7 / getMeasuredWidth());
        float interpolation = pr.f29468i.getInterpolation(abs);
        int right = getRight();
        n0 n0Var = this.f46192e;
        n0Var.setTranslationX(((n0Var.getWidth() * 1.5f) + (right - n0Var.getRight()) + AndroidUtilities.dp(32.0f)) * interpolation);
        n0Var.setTranslationY(AndroidUtilities.dp(16.0f) * interpolation);
        float f10 = 1.0f;
        float clamp = Utilities.clamp(AndroidUtilities.lerp(1.0f, 1.5f, interpolation), 1.0f, 0.0f);
        n0Var.setScaleX(clamp);
        n0Var.setScaleY(clamp);
        int top = getTop();
        n0 n0Var2 = this.f46191c;
        n0Var2.setTranslationY((((top - n0Var2.getTop()) - (n0Var2.getHeight() * 1.8f)) - AndroidUtilities.dp(32.0f)) * abs);
        n0Var2.setTranslationX(AndroidUtilities.dp(16.0f) * abs);
        float clamp2 = Utilities.clamp(AndroidUtilities.lerp(1.0f, 1.8f, abs), 1.0f, 0.0f);
        n0Var2.setScaleX(clamp2);
        n0Var2.setScaleY(clamp2);
        float interpolation2 = pr.f29467g.getInterpolation(abs);
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
