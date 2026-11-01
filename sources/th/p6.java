package th;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.dd;
import org.telegram.ui.Components.gr;
public final class p6 {
    public final x2 f49386a;
    public final org.telegram.ui.Components.t5 f49387b;
    public final TextPaint f49388c;
    public final StaticLayout d;
    public final float e;
    public final float f49389f;
    public float f49390g;
    public boolean h;
    public int f49391i;

    public p6(z2 z2Var, x2 x2Var) {
        float f7;
        this.f49386a = x2Var;
        this.f49387b = new org.telegram.ui.Components.t5(z2Var, 0L, 360L, gr.h);
        TextPaint textPaint = new TextPaint(1);
        this.f49388c = textPaint;
        textPaint.setTextSize(org.telegram.messenger.i0.L(14.0f));
        textPaint.setColor(-1);
        textPaint.setShadowLayer(org.telegram.messenger.i0.L(3.0f), 0.0f, org.telegram.messenger.i0.L(1.0f), 805306368);
        StaticLayout staticLayout = new StaticLayout(dd.L0(2131744506, null), textPaint, org.telegram.messenger.i0.f16172q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.d = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f7 = staticLayout.getLineLeft(0);
        } else {
            f7 = 0.0f;
        }
        this.e = f7;
        this.f49389f = staticLayout.getLineCount() > 0 ? staticLayout.getLineWidth(0) : 0.0f;
    }
}
