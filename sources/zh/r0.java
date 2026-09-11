package zh;

import android.content.Context;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.pr;
public final class r0 extends ph.c implements le.d {
    public static final int f52498s = 0;
    public final le.e f52499f;
    public final org.telegram.ui.web.b1 h;
    public final ph.b[] f52500n;
    public int f52501r;

    public r0(Context context, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.web.b1 b1Var) {
        super(context);
        this.f52499f = new le.e(0, this, pr.h, 1600L);
        this.h = b1Var;
        int i10 = org.telegram.ui.ActionBar.j6.Wk;
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.09411765f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        org.telegram.ui.ActionBar.j6.l1(0.1254902f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        this.f44099e.setColor(l1);
        this.f52500n = new ph.b[]{ph.b.b(context, f6Var, ph.a.G, R.string.GiftPreviewModels), ph.b.b(context, f6Var, ph.a.v, R.string.GiftPreviewBackdrops), ph.b.b(context, f6Var, ph.a.J, R.string.GiftPreviewSymbols)};
        int i11 = 0;
        while (true) {
            ph.b[] bVarArr = this.f52500n;
            if (i11 < bVarArr.length) {
                this.f44096a.addView(bVarArr[i11], w7.x5.l(1.0f, 0, -1));
                this.f52500n[i11].setOnClickListener(new di.o4(this, i11, 27));
                i11++;
            } else {
                bVarArr[0].e(true, false);
                return;
            }
        }
    }

    @Override
    public final void E(int i10, float f7, float f10, le.e eVar) {
        b();
        invalidate();
    }

    public final void a(int i10) {
        int i11 = this.f52501r;
        if (i11 != i10) {
            ph.b[] bVarArr = this.f52500n;
            bVarArr[i11].e(false, true);
            bVarArr[i10].e(true, true);
            this.f52501r = i10;
            this.f52499f.a(i10);
            this.h.run(Integer.valueOf(i10));
        }
    }

    public final void b() {
        float f7 = this.f52499f.f15376e;
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(8.0f);
        Rect rect = this.f44098c;
        rect.set(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), getMeasuredWidth() - AndroidUtilities.dp(8.0f), f7 / 3.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), getMeasuredWidth() - AndroidUtilities.dp(8.0f), (f7 + 1.0f) / 3.0f), measuredHeight);
        int dp = AndroidUtilities.dp(this.f44097b * 7.0f);
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
    public final void z(float f7, int i10) {
    }
}
