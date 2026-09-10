package xh;

import android.content.Context;
import android.graphics.Rect;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.wr;
public final class r0 extends nh.c implements le.d {
    public static final int f45945s = 0;
    public final le.e f45946f;
    public final org.telegram.ui.web.y1 h;
    public final nh.b[] f45947n;
    public int f45948r;

    public r0(Context context, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.web.y1 y1Var) {
        super(context);
        this.f45946f = new le.e(0, this, wr.h, 1600L);
        this.h = y1Var;
        int i10 = org.telegram.ui.ActionBar.j6.Wk;
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.09411765f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        org.telegram.ui.ActionBar.j6.l1(0.1254902f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        this.e.setColor(l1);
        this.f45947n = new nh.b[]{nh.b.b(context, f6Var, nh.a.G, R.string.GiftPreviewModels), nh.b.b(context, f6Var, nh.a.v, R.string.GiftPreviewBackdrops), nh.b.b(context, f6Var, nh.a.J, R.string.GiftPreviewSymbols)};
        int i11 = 0;
        while (true) {
            nh.b[] bVarArr = this.f45947n;
            if (i11 < bVarArr.length) {
                this.f14069a.addView(bVarArr[i11], w7.a6.l(1.0f, 0, -1));
                this.f45947n[i11].setOnClickListener(new bi.j5(this, i11, 27));
                i11++;
            } else {
                bVarArr[0].e(true, false);
                return;
            }
        }
    }

    @Override
    public final void G(int i10, float f7, float f10, le.e eVar) {
        b();
        invalidate();
    }

    public final void a(int i10) {
        int i11 = this.f45948r;
        if (i11 != i10) {
            nh.b[] bVarArr = this.f45947n;
            bVarArr[i11].e(false, true);
            bVarArr[i10].e(true, true);
            this.f45948r = i10;
            this.f45946f.a(i10);
            this.h.run(Integer.valueOf(i10));
        }
    }

    public final void b() {
        float f7 = this.f45946f.e;
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(8.0f);
        Rect rect = this.f14071c;
        rect.set(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), getMeasuredWidth() - AndroidUtilities.dp(8.0f), f7 / 3.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), getMeasuredWidth() - AndroidUtilities.dp(8.0f), (f7 + 1.0f) / 3.0f), measuredHeight);
        int dp = AndroidUtilities.dp(this.f14070b * 7.0f);
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
    public final void B(float f7, int i10) {
    }
}
