package ph;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.nr;
public final class o1 extends j1 {
    public final d1 f42038b;
    public final n1 f42039c;
    public final f2.w d;
    public final l1 e;
    public final s1 f42040f;
    public int h;
    public float f42041n;
    public boolean f42042r;
    public final y1 f42043s;

    public o1(y1 y1Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        this.f42043s = y1Var;
        this.h = 8;
        this.f42041n = -1.0f;
        this.f42042r = false;
        d1 d1Var = new d1(context);
        this.f42038b = d1Var;
        n1 n1Var = new n1(this);
        this.f42039c = n1Var;
        d1Var.setAdapter(n1Var);
        f2.w wVar = new f2.w(this.h);
        this.d = wVar;
        d1Var.setLayoutManager(wVar);
        d1Var.setClipToPadding(true);
        d1Var.setVerticalScrollBarEnabled(false);
        wVar.O = new kh.n5(this, 8);
        d1Var.setOnItemClickListener(new dg.n(this, 15));
        d1Var.setOnScrollListener(new lb0(this, 13));
        f2.l lVar = new f2.l();
        lVar.f5837c = 220L;
        lVar.e = 220L;
        lVar.f5838f = 160L;
        lVar.f5839g = 160L;
        lVar.f5840i = nr.f27347g;
        d1Var.setItemAnimator(lVar);
        addView(d1Var, k7.b6.c(-1.0f, -1));
        f6Var = ((org.telegram.ui.ActionBar.g3) y1Var).resourcesProvider;
        s1 s1Var = new s1(context, f6Var);
        this.f42040f = s1Var;
        s1Var.v = new dg.r1(this, 28);
        addView(s1Var, k7.b6.e(-1, -2, 48));
        f6Var2 = ((org.telegram.ui.ActionBar.g3) y1Var).resourcesProvider;
        l1 l1Var = new l1(this, context, f6Var2);
        this.e = l1Var;
        addView(l1Var, k7.b6.c(36.0f, -1));
    }

    @Override
    public final void a(int i10) {
        boolean z4;
        int i11;
        int i12;
        this.f41774a = i10;
        int i13 = 0;
        if (i10 == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f42038b.V2 = z4;
        if (i10 == 0) {
            i11 = 8;
        } else {
            i11 = 5;
        }
        this.h = i11;
        this.d.y1(i11);
        boolean z10 = this.f42042r;
        n1 n1Var = this.f42039c;
        if (!z10) {
            n1Var.D(null);
        }
        y1 y1Var = this.f42043s;
        int i14 = y1Var.f42604c;
        s1 s1Var = this.f42040f;
        if (i14 >= 0) {
            s1Var.f42301r = true;
            s1Var.d.setText("");
            s1Var.f42301r = false;
            r1 r1Var = s1Var.f42299f;
            if (r1Var != null) {
                r1Var.E1(y1Var.f42604c);
                s1Var.f42299f.C1();
                if (s1Var.f42299f.getSelectedCategory() != null) {
                    n1Var.E = s1Var.f42299f.getSelectedCategory().f29058a;
                    org.telegram.ui.web.o0 o0Var = n1Var.J;
                    AndroidUtilities.cancelRunOnUIThread(o0Var);
                    AndroidUtilities.runOnUIThread(o0Var);
                }
            }
        } else if (!TextUtils.isEmpty(y1Var.f42603b)) {
            s1Var.d.setText(y1Var.f42603b);
            r1 r1Var2 = s1Var.f42299f;
            if (r1Var2 != null) {
                r1Var2.F1(null);
                s1Var.f42299f.D1();
            }
            AndroidUtilities.cancelRunOnUIThread(n1Var.J);
            AndroidUtilities.runOnUIThread(n1Var.J);
        } else {
            s1Var.b();
        }
        s1Var.a(i10, y1Var.f42608s);
        i12 = ((org.telegram.ui.ActionBar.g3) y1Var).currentAccount;
        MediaDataController mediaDataController = MediaDataController.getInstance(i12);
        if (i10 == 0) {
            i13 = 5;
        }
        mediaDataController.checkStickers(i13);
    }

    @Override
    public final float b() {
        float f10 = this.f42041n;
        if (f10 >= 0.0f) {
            return f10;
        }
        int i10 = 0;
        while (true) {
            d1 d1Var = this.f42038b;
            if (i10 >= d1Var.getChildCount()) {
                return 0.0f;
            }
            View childAt = d1Var.getChildAt(i10);
            Object tag = childAt.getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                return kh.a2.c(102.0f, childAt.getBottom(), 0);
            }
            i10++;
        }
    }

    @Override
    public final void c() {
        float max = Math.max(0.0f, b());
        this.e.setTranslationY(AndroidUtilities.dp(16.0f) + max);
        this.f42040f.setTranslationY(AndroidUtilities.dp(52.0f) + max);
        d1 d1Var = this.f42038b;
        d1Var.W2 = max + d1Var.getPaddingTop();
        d1Var.X2 = d1Var.getHeight() - d1Var.getPaddingBottom();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        float f10;
        y1 y1Var = this.f42043s;
        i12 = ((org.telegram.ui.ActionBar.g3) y1Var).backgroundPaddingLeft;
        i13 = ((org.telegram.ui.ActionBar.g3) y1Var).backgroundPaddingLeft;
        setPadding(i12, 0, i13, 0);
        this.e.setTranslationY(AndroidUtilities.dp(16.0f));
        this.f42040f.setTranslationY(AndroidUtilities.dp(52.0f));
        int dp = AndroidUtilities.dp(5.0f);
        int dp2 = AndroidUtilities.dp(102.0f);
        int dp3 = AndroidUtilities.dp(5.0f);
        int i14 = AndroidUtilities.navigationBarHeight;
        if (y1Var.f42607r) {
            f10 = 0.0f;
        } else {
            f10 = 40.0f;
        }
        this.f42038b.setPadding(dp, dp2, dp3, AndroidUtilities.dp(f10) + i14);
        super.onMeasure(i10, i11);
    }
}
