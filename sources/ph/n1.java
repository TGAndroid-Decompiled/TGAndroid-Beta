package ph;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.Components.mr;
public final class n1 extends i1 {
    public final d1 f42035b;
    public final m1 f42036c;
    public final f2.w d;
    public final k1 e;
    public final r1 f42037f;
    public int h;
    public float f42038n;
    public boolean f42039r;
    public final y1 f42040s;

    public n1(y1 y1Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        this.f42040s = y1Var;
        this.h = 8;
        this.f42038n = -1.0f;
        this.f42039r = false;
        d1 d1Var = new d1(context);
        this.f42035b = d1Var;
        m1 m1Var = new m1(this);
        this.f42036c = m1Var;
        d1Var.setAdapter(m1Var);
        f2.w wVar = new f2.w(this.h);
        this.d = wVar;
        d1Var.setLayoutManager(wVar);
        d1Var.setClipToPadding(true);
        d1Var.setVerticalScrollBarEnabled(false);
        wVar.O = new kh.m5(this, 8);
        d1Var.setOnItemClickListener(new dg.n(this, 15));
        d1Var.setOnScrollListener(new mb0(this, 13));
        f2.l lVar = new f2.l();
        lVar.f5826c = 220L;
        lVar.e = 220L;
        lVar.f5827f = 160L;
        lVar.f5828g = 160L;
        lVar.f5829i = mr.f27123g;
        d1Var.setItemAnimator(lVar);
        addView(d1Var, k7.b6.c(-1.0f, -1));
        f6Var = ((org.telegram.ui.ActionBar.g3) y1Var).resourcesProvider;
        r1 r1Var = new r1(context, f6Var);
        this.f42037f = r1Var;
        r1Var.v = new dg.r1(this, 28);
        addView(r1Var, k7.b6.e(-1, -2, 48));
        f6Var2 = ((org.telegram.ui.ActionBar.g3) y1Var).resourcesProvider;
        k1 k1Var = new k1(this, context, f6Var2);
        this.e = k1Var;
        addView(k1Var, k7.b6.c(36.0f, -1));
    }

    @Override
    public final void a(int i10) {
        boolean z4;
        int i11;
        int i12;
        this.f41768a = i10;
        int i13 = 0;
        if (i10 == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f42035b.V2 = z4;
        if (i10 == 0) {
            i11 = 8;
        } else {
            i11 = 5;
        }
        this.h = i11;
        this.d.y1(i11);
        boolean z10 = this.f42039r;
        m1 m1Var = this.f42036c;
        if (!z10) {
            m1Var.D(null);
        }
        y1 y1Var = this.f42040s;
        int i14 = y1Var.f42641c;
        r1 r1Var = this.f42037f;
        if (i14 >= 0) {
            r1Var.f42272r = true;
            r1Var.d.setText("");
            r1Var.f42272r = false;
            q1 q1Var = r1Var.f42270f;
            if (q1Var != null) {
                q1Var.D1(y1Var.f42641c);
                r1Var.f42270f.B1();
                if (r1Var.f42270f.getSelectedCategory() != null) {
                    m1Var.E = r1Var.f42270f.getSelectedCategory().f29037a;
                    org.telegram.ui.web.q0 q0Var = m1Var.J;
                    AndroidUtilities.cancelRunOnUIThread(q0Var);
                    AndroidUtilities.runOnUIThread(q0Var);
                }
            }
        } else if (!TextUtils.isEmpty(y1Var.f42640b)) {
            r1Var.d.setText(y1Var.f42640b);
            q1 q1Var2 = r1Var.f42270f;
            if (q1Var2 != null) {
                q1Var2.E1(null);
                r1Var.f42270f.C1();
            }
            AndroidUtilities.cancelRunOnUIThread(m1Var.J);
            AndroidUtilities.runOnUIThread(m1Var.J);
        } else {
            r1Var.b();
        }
        r1Var.a(i10, y1Var.f42645s);
        i12 = ((org.telegram.ui.ActionBar.g3) y1Var).currentAccount;
        MediaDataController mediaDataController = MediaDataController.getInstance(i12);
        if (i10 == 0) {
            i13 = 5;
        }
        mediaDataController.checkStickers(i13);
    }

    @Override
    public final float b() {
        float f10 = this.f42038n;
        if (f10 >= 0.0f) {
            return f10;
        }
        int i10 = 0;
        while (true) {
            d1 d1Var = this.f42035b;
            if (i10 >= d1Var.getChildCount()) {
                return 0.0f;
            }
            View childAt = d1Var.getChildAt(i10);
            Object tag = childAt.getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                return kf.k0.c(102.0f, childAt.getBottom(), 0);
            }
            i10++;
        }
    }

    @Override
    public final void c() {
        float max = Math.max(0.0f, b());
        this.e.setTranslationY(AndroidUtilities.dp(16.0f) + max);
        this.f42037f.setTranslationY(AndroidUtilities.dp(52.0f) + max);
        d1 d1Var = this.f42035b;
        d1Var.W2 = max + d1Var.getPaddingTop();
        d1Var.X2 = d1Var.getHeight() - d1Var.getPaddingBottom();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        float f10;
        y1 y1Var = this.f42040s;
        i12 = ((org.telegram.ui.ActionBar.g3) y1Var).backgroundPaddingLeft;
        i13 = ((org.telegram.ui.ActionBar.g3) y1Var).backgroundPaddingLeft;
        setPadding(i12, 0, i13, 0);
        this.e.setTranslationY(AndroidUtilities.dp(16.0f));
        this.f42037f.setTranslationY(AndroidUtilities.dp(52.0f));
        int dp = AndroidUtilities.dp(5.0f);
        int dp2 = AndroidUtilities.dp(102.0f);
        int dp3 = AndroidUtilities.dp(5.0f);
        int i14 = AndroidUtilities.navigationBarHeight;
        if (y1Var.f42644r) {
            f10 = 0.0f;
        } else {
            f10 = 40.0f;
        }
        this.f42035b.setPadding(dp, dp2, dp3, AndroidUtilities.dp(f10) + i14);
        super.onMeasure(i10, i11);
    }
}
