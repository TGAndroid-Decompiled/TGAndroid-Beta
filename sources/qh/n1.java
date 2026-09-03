package qh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.pr;
public final class n1 extends i1 {
    public final d1 f45792b;
    public final m1 f45793c;
    public final f2.w d;
    public final k1 f45794e;
    public final r1 f45795f;
    public int h;
    public float f45796n;
    public boolean f45797r;
    public final x1 f45798s;

    public n1(x1 x1Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.g6 g6Var;
        org.telegram.ui.ActionBar.g6 g6Var2;
        this.f45798s = x1Var;
        this.h = 8;
        this.f45796n = -1.0f;
        this.f45797r = false;
        d1 d1Var = new d1(context);
        this.f45792b = d1Var;
        m1 m1Var = new m1(this);
        this.f45793c = m1Var;
        d1Var.setAdapter(m1Var);
        f2.w wVar = new f2.w(this.h);
        this.d = wVar;
        d1Var.setLayoutManager(wVar);
        d1Var.setClipToPadding(true);
        d1Var.setVerticalScrollBarEnabled(false);
        wVar.O = new lh.n5(this, 8);
        d1Var.setOnItemClickListener(new ag.h(this, 16));
        d1Var.setOnScrollListener(new nb0(this, 13));
        f2.l lVar = new f2.l();
        lVar.f5930c = 220L;
        lVar.f5931e = 220L;
        lVar.f5932f = 160L;
        lVar.f5933g = 160L;
        lVar.f5934i = pr.f30169g;
        d1Var.setItemAnimator(lVar);
        addView(d1Var, k7.c6.c(-1.0f, -1));
        g6Var = ((org.telegram.ui.ActionBar.h3) x1Var).resourcesProvider;
        r1 r1Var = new r1(context, g6Var);
        this.f45795f = r1Var;
        r1Var.v = new eg.p1(this, 28);
        addView(r1Var, k7.c6.e(-1, -2, 48));
        g6Var2 = ((org.telegram.ui.ActionBar.h3) x1Var).resourcesProvider;
        k1 k1Var = new k1(this, context, g6Var2);
        this.f45794e = k1Var;
        addView(k1Var, k7.c6.c(36.0f, -1));
    }

    @Override
    public final void a(int i10) {
        boolean z4;
        int i11;
        int i12;
        this.f45424a = i10;
        int i13 = 0;
        if (i10 == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f45792b.V2 = z4;
        if (i10 == 0) {
            i11 = 8;
        } else {
            i11 = 5;
        }
        this.h = i11;
        this.d.y1(i11);
        boolean z10 = this.f45797r;
        m1 m1Var = this.f45793c;
        if (!z10) {
            m1Var.D(null);
        }
        x1 x1Var = this.f45798s;
        int i14 = x1Var.f46299c;
        r1 r1Var = this.f45795f;
        if (i14 >= 0) {
            r1Var.f45984r = true;
            r1Var.d.setText("");
            r1Var.f45984r = false;
            q1 q1Var = r1Var.f45982f;
            if (q1Var != null) {
                q1Var.D1(x1Var.f46299c);
                r1Var.f45982f.B1();
                if (r1Var.f45982f.getSelectedCategory() != null) {
                    m1Var.E = r1Var.f45982f.getSelectedCategory().f31422a;
                    org.telegram.ui.web.s0 s0Var = m1Var.J;
                    AndroidUtilities.cancelRunOnUIThread(s0Var);
                    AndroidUtilities.runOnUIThread(s0Var);
                }
            }
        } else if (!TextUtils.isEmpty(x1Var.f46298b)) {
            r1Var.d.setText(x1Var.f46298b);
            q1 q1Var2 = r1Var.f45982f;
            if (q1Var2 != null) {
                q1Var2.E1(null);
                r1Var.f45982f.C1();
            }
            AndroidUtilities.cancelRunOnUIThread(m1Var.J);
            AndroidUtilities.runOnUIThread(m1Var.J);
        } else {
            r1Var.b();
        }
        r1Var.a(i10, x1Var.f46304s);
        i12 = ((org.telegram.ui.ActionBar.h3) x1Var).currentAccount;
        MediaDataController mediaDataController = MediaDataController.getInstance(i12);
        if (i10 == 0) {
            i13 = 5;
        }
        mediaDataController.checkStickers(i13);
    }

    @Override
    public final float b() {
        float f10 = this.f45796n;
        if (f10 >= 0.0f) {
            return f10;
        }
        int i10 = 0;
        while (true) {
            d1 d1Var = this.f45792b;
            if (i10 >= d1Var.getChildCount()) {
                return 0.0f;
            }
            View childAt = d1Var.getChildAt(i10);
            Object tag = childAt.getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                return l.d.c(102.0f, childAt.getBottom(), 0);
            }
            i10++;
        }
    }

    @Override
    public final void c() {
        float max = Math.max(0.0f, b());
        this.f45794e.setTranslationY(AndroidUtilities.dp(16.0f) + max);
        this.f45795f.setTranslationY(AndroidUtilities.dp(52.0f) + max);
        d1 d1Var = this.f45792b;
        d1Var.W2 = max + d1Var.getPaddingTop();
        d1Var.X2 = d1Var.getHeight() - d1Var.getPaddingBottom();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        float f10;
        x1 x1Var = this.f45798s;
        i12 = ((org.telegram.ui.ActionBar.h3) x1Var).backgroundPaddingLeft;
        i13 = ((org.telegram.ui.ActionBar.h3) x1Var).backgroundPaddingLeft;
        setPadding(i12, 0, i13, 0);
        this.f45794e.setTranslationY(AndroidUtilities.dp(16.0f));
        this.f45795f.setTranslationY(AndroidUtilities.dp(52.0f));
        int dp = AndroidUtilities.dp(5.0f);
        int dp2 = AndroidUtilities.dp(102.0f);
        int dp3 = AndroidUtilities.dp(5.0f);
        int i14 = AndroidUtilities.navigationBarHeight;
        if (x1Var.f46303r) {
            f10 = 0.0f;
        } else {
            f10 = 40.0f;
        }
        this.f45792b.setPadding(dp, dp2, dp3, AndroidUtilities.dp(f10) + i14);
        super.onMeasure(i10, i11);
    }
}
