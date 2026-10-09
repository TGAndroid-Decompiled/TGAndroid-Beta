package yh;

import android.content.Context;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.hs;
public final class q0 extends oh.c implements me.d {
    public static final int f53053s = 0;
    public final me.e f53054f;
    public final ii.q1 h;
    public final oh.b[] f53055n;
    public int f53056r;

    public q0(Context context, org.telegram.ui.ActionBar.e6 e6Var, ii.q1 q1Var) {
        super(context);
        this.f53054f = new me.e(0, this, hs.h, 1600L);
        this.h = q1Var;
        int i10 = org.telegram.ui.ActionBar.i6.Wk;
        int m12 = org.telegram.ui.ActionBar.i6.m1(0.09411765f, org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
        org.telegram.ui.ActionBar.i6.m1(0.1254902f, org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
        this.f17153e.setColor(m12);
        this.f53055n = new oh.b[]{oh.b.b(context, e6Var, oh.a.G, R.string.GiftPreviewModels), oh.b.b(context, e6Var, oh.a.v, R.string.GiftPreviewBackdrops), oh.b.b(context, e6Var, oh.a.J, R.string.GiftPreviewSymbols)};
        int i11 = 0;
        while (true) {
            oh.b[] bVarArr = this.f53055n;
            if (i11 < bVarArr.length) {
                this.f17150a.addView(bVarArr[i11], w7.x5.l(1.0f, 0, -1));
                this.f53055n[i11].setOnClickListener(new ci.m4(this, i11, 28));
                i11++;
            } else {
                bVarArr[0].e(true, false);
                return;
            }
        }
    }

    public final void a(int i10) {
        int i11 = this.f53056r;
        if (i11 != i10) {
            oh.b[] bVarArr = this.f53055n;
            bVarArr[i11].e(false, true);
            bVarArr[i10].e(true, true);
            this.f53056r = i10;
            this.f53054f.a(i10);
            this.h.run(Integer.valueOf(i10));
        }
    }

    public final void b() {
        float f7 = this.f53054f.f16345e;
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(8.0f);
        Rect rect = this.f17152c;
        rect.set(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), getMeasuredWidth() - AndroidUtilities.dp(8.0f), f7 / 3.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), getMeasuredWidth() - AndroidUtilities.dp(8.0f), (f7 + 1.0f) / 3.0f), measuredHeight);
        int dp = AndroidUtilities.dp(this.f17151b * 7.0f);
        Rect rect2 = this.d;
        rect2.set(rect);
        int i10 = -dp;
        rect2.inset(i10, i10);
        Math.abs(f7 - 1.0f);
    }

    @Override
    public final void n(int i10, float f7, float f10, me.e eVar) {
        b();
        invalidate();
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        b();
    }

    @Override
    public final void A(float f7, int i10) {
    }
}
