package yh;

import android.content.Context;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.rr;
public final class r0 extends oh.c implements le.e {
    public static final int f47926s = 0;
    public final le.f f47927f;
    public final ii.q1 h;
    public final oh.b[] f47928n;
    public int f47929r;

    public r0(Context context, org.telegram.ui.ActionBar.d6 d6Var, ii.q1 q1Var) {
        super(context);
        this.f47927f = new le.f(0, this, rr.h, 1600L);
        this.h = q1Var;
        int i10 = org.telegram.ui.ActionBar.h6.Wk;
        int l1 = org.telegram.ui.ActionBar.h6.l1(0.09411765f, org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
        org.telegram.ui.ActionBar.h6.l1(0.1254902f, org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
        this.e.setColor(l1);
        this.f47928n = new oh.b[]{oh.b.b(context, d6Var, oh.a.G, R.string.GiftPreviewModels), oh.b.b(context, d6Var, oh.a.v, R.string.GiftPreviewBackdrops), oh.b.b(context, d6Var, oh.a.J, R.string.GiftPreviewSymbols)};
        int i11 = 0;
        while (true) {
            oh.b[] bVarArr = this.f47928n;
            if (i11 < bVarArr.length) {
                this.f15723a.addView(bVarArr[i11], w7.y5.l(1.0f, 0, -1));
                this.f47928n[i11].setOnClickListener(new ci.n4(this, i11, 27));
                i11++;
            } else {
                bVarArr[0].e(true, false);
                return;
            }
        }
    }

    @Override
    public final void D(int i10, float f7, float f10, le.f fVar) {
        b();
        invalidate();
    }

    public final void a(int i10) {
        int i11 = this.f47929r;
        if (i11 != i10) {
            oh.b[] bVarArr = this.f47928n;
            bVarArr[i11].e(false, true);
            bVarArr[i10].e(true, true);
            this.f47929r = i10;
            this.f47927f.a(i10);
            this.h.run(Integer.valueOf(i10));
        }
    }

    public final void b() {
        float f7 = this.f47927f.e;
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(8.0f);
        Rect rect = this.f15725c;
        rect.set(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), getMeasuredWidth() - AndroidUtilities.dp(8.0f), f7 / 3.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), getMeasuredWidth() - AndroidUtilities.dp(8.0f), (f7 + 1.0f) / 3.0f), measuredHeight);
        int dp = AndroidUtilities.dp(this.f15724b * 7.0f);
        Rect rect2 = this.d;
        rect2.set(rect);
        int i10 = -dp;
        rect2.inset(i10, i10);
        Math.abs(f7 - 1.0f);
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        b();
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
