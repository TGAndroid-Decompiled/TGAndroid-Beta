package rg;

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
import org.telegram.ui.Components.qr;
import org.telegram.ui.nb0;
import w7.y5;
public final class n0 extends FrameLayout implements l0 {
    public final f6 f42688a;
    public final ArrayList f42689b;
    public final m0 f42690c;
    public final m0 d;
    public final m0 e;
    public final boolean f42691f;

    public n0(Context context, f6 f6Var) {
        super(context);
        nb0[] values;
        this.f42689b = new ArrayList();
        this.f42688a = f6Var;
        for (nb0 nb0Var : nb0.values()) {
            if (nb0Var.e) {
                this.f42689b.add(nb0Var);
            }
            if (this.f42689b.size() == 3) {
                break;
            }
        }
        if (this.f42689b.size() < 3) {
            FileLog.e(new IllegalArgumentException("There should be at least 3 premium icons!"));
            this.f42691f = true;
            return;
        }
        this.f42690c = a(context, 0);
        this.d = a(context, 1);
        this.e = a(context, 2);
        setClipChildren(false);
    }

    public final m0 a(Context context, int i10) {
        nb0 nb0Var = (nb0) this.f42689b.get(i10);
        ?? qVar = new org.telegram.ui.Cells.q(context);
        v1 v1Var = new v1(20);
        qVar.e = v1Var;
        Paint paint = new Paint(1);
        qVar.f42679f = paint;
        v1Var.f42814r = 12;
        v1Var.f42815s = 8;
        v1Var.f42816t = 6;
        if (i10 == 1) {
            v1Var.N = 1001;
        }
        if (i10 == 0) {
            v1Var.N = 1002;
        }
        v1Var.O = this.f42688a;
        v1Var.P = j6.Zj;
        v1Var.c();
        paint.setColor(-1);
        qVar.setLayoutParams(y5.d(-2, -2.0f, 17, 0.0f, 52.0f, 0.0f, 0.0f));
        qVar.setForeground(nb0Var.f35963c);
        qVar.setBackgroundResource(nb0Var.f35962b);
        qVar.setPadding(AndroidUtilities.dp(8.0f));
        qVar.setBackgroundOuterPadding(AndroidUtilities.dp(32.0f));
        addView(qVar);
        return qVar;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f42691f) {
            return;
        }
        int min = Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        int dp = AndroidUtilities.dp(76.0f);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f42690c.getLayoutParams();
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
        if (this.f42691f) {
            return;
        }
        float abs = Math.abs(f7 / getMeasuredWidth());
        float interpolation = qr.f27644i.getInterpolation(abs);
        int right = getRight();
        m0 m0Var = this.e;
        m0Var.setTranslationX(((m0Var.getWidth() * 1.5f) + (right - m0Var.getRight()) + AndroidUtilities.dp(32.0f)) * interpolation);
        m0Var.setTranslationY(AndroidUtilities.dp(16.0f) * interpolation);
        float f10 = 1.0f;
        float clamp = Utilities.clamp(AndroidUtilities.lerp(1.0f, 1.5f, interpolation), 1.0f, 0.0f);
        m0Var.setScaleX(clamp);
        m0Var.setScaleY(clamp);
        int top = getTop();
        m0 m0Var2 = this.f42690c;
        m0Var2.setTranslationY((((top - m0Var2.getTop()) - (m0Var2.getHeight() * 1.8f)) - AndroidUtilities.dp(32.0f)) * abs);
        m0Var2.setTranslationX(AndroidUtilities.dp(16.0f) * abs);
        float clamp2 = Utilities.clamp(AndroidUtilities.lerp(1.0f, 1.8f, abs), 1.0f, 0.0f);
        m0Var2.setScaleX(clamp2);
        m0Var2.setScaleY(clamp2);
        float interpolation2 = qr.f27643g.getInterpolation(abs);
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
