package yh;

import android.content.Context;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.tr;
public final class r0 extends oh.c implements le.d {
    public static final int f51883s = 0;
    public final le.e f51884f;
    public final ii.q1 h;
    public final oh.b[] f51885n;
    public int f51886r;

    public r0(Context context, org.telegram.ui.ActionBar.d6 d6Var, ii.q1 q1Var) {
        super(context);
        this.f51884f = new le.e(0, this, tr.h, 1600L);
        this.h = q1Var;
        int i10 = org.telegram.ui.ActionBar.i6.Wk;
        int l1 = org.telegram.ui.ActionBar.i6.l1(0.09411765f, org.telegram.ui.ActionBar.i6.v0(i10, d6Var));
        org.telegram.ui.ActionBar.i6.l1(0.1254902f, org.telegram.ui.ActionBar.i6.v0(i10, d6Var));
        this.f17216e.setColor(l1);
        this.f51885n = new oh.b[]{oh.b.b(context, d6Var, oh.a.G, R.string.GiftPreviewModels), oh.b.b(context, d6Var, oh.a.v, R.string.GiftPreviewBackdrops), oh.b.b(context, d6Var, oh.a.J, R.string.GiftPreviewSymbols)};
        int i11 = 0;
        while (true) {
            oh.b[] bVarArr = this.f51885n;
            if (i11 < bVarArr.length) {
                this.f17213a.addView(bVarArr[i11], w7.z5.l(1.0f, 0, -1));
                this.f51885n[i11].setOnClickListener(new ci.n4(this, i11, 27));
                i11++;
            } else {
                bVarArr[0].e(true, false);
                return;
            }
        }
    }

    public final void a(int i10) {
        int i11 = this.f51886r;
        if (i11 != i10) {
            oh.b[] bVarArr = this.f51885n;
            bVarArr[i11].e(false, true);
            bVarArr[i10].e(true, true);
            this.f51886r = i10;
            this.f51884f.a(i10);
            this.h.run(Integer.valueOf(i10));
        }
    }

    @Override
    public final void a0(int i10, float f7, float f10, le.e eVar) {
        b();
        invalidate();
    }

    public final void b() {
        float f7 = this.f51884f.f15444e;
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(8.0f);
        Rect rect = this.f17215c;
        rect.set(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), getMeasuredWidth() - AndroidUtilities.dp(8.0f), f7 / 3.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), getMeasuredWidth() - AndroidUtilities.dp(8.0f), (f7 + 1.0f) / 3.0f), measuredHeight);
        int dp = AndroidUtilities.dp(this.f17214b * 7.0f);
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
    public final void V(float f7, int i10) {
    }
}
