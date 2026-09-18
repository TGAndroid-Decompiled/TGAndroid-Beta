package yh;

import android.content.Context;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.qr;
public final class r0 extends oh.c implements le.d {
    public static final int f47937s = 0;
    public final le.e f47938f;
    public final org.telegram.ui.web.b1 h;
    public final oh.b[] f47939n;
    public int f47940r;

    public r0(Context context, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.web.b1 b1Var) {
        super(context);
        this.f47938f = new le.e(0, this, qr.h, 1600L);
        this.h = b1Var;
        int i10 = org.telegram.ui.ActionBar.j6.Wk;
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.09411765f, org.telegram.ui.ActionBar.j6.v0(i10, e6Var));
        org.telegram.ui.ActionBar.j6.l1(0.1254902f, org.telegram.ui.ActionBar.j6.v0(i10, e6Var));
        this.e.setColor(l1);
        this.f47939n = new oh.b[]{oh.b.b(context, e6Var, oh.a.G, R.string.GiftPreviewModels), oh.b.b(context, e6Var, oh.a.v, R.string.GiftPreviewBackdrops), oh.b.b(context, e6Var, oh.a.J, R.string.GiftPreviewSymbols)};
        int i11 = 0;
        while (true) {
            oh.b[] bVarArr = this.f47939n;
            if (i11 < bVarArr.length) {
                this.f15695a.addView(bVarArr[i11], w7.y5.l(1.0f, 0, -1));
                this.f47939n[i11].setOnClickListener(new ci.o4(this, i11, 27));
                i11++;
            } else {
                bVarArr[0].e(true, false);
                return;
            }
        }
    }

    @Override
    public final void D(int i10, float f7, float f10, le.e eVar) {
        b();
        invalidate();
    }

    public final void a(int i10) {
        int i11 = this.f47940r;
        if (i11 != i10) {
            oh.b[] bVarArr = this.f47939n;
            bVarArr[i11].e(false, true);
            bVarArr[i10].e(true, true);
            this.f47940r = i10;
            this.f47938f.a(i10);
            this.h.run(Integer.valueOf(i10));
        }
    }

    public final void b() {
        float f7 = this.f47938f.e;
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(8.0f);
        Rect rect = this.f15697c;
        rect.set(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), getMeasuredWidth() - AndroidUtilities.dp(8.0f), f7 / 3.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), getMeasuredWidth() - AndroidUtilities.dp(8.0f), (f7 + 1.0f) / 3.0f), measuredHeight);
        int dp = AndroidUtilities.dp(this.f15696b * 7.0f);
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
