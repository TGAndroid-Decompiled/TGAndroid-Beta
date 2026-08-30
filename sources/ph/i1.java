package ph;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.lb0;
public final class i1 extends j1 implements NotificationCenter.NotificationCenterDelegate {
    public final e1 f41733b;
    public final g1 f41734c;
    public final s1 d;
    public final h1 e;
    public final f1 f41735f;
    public final ArrayList h;
    public final ArrayList f41736n;
    public final y1 f41737r;

    public i1(y1 y1Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var;
        this.f41737r = y1Var;
        this.f41735f = new Object();
        this.h = new ArrayList();
        this.f41736n = new ArrayList();
        e1 e1Var = new e1(this, context, 0);
        this.f41733b = e1Var;
        g1 g1Var = new g1(this);
        this.f41734c = g1Var;
        e1Var.setAdapter(g1Var);
        h1 h1Var = new h1(this);
        this.e = h1Var;
        e1Var.setLayoutManager(h1Var);
        e1Var.i(new gg.e2(this, 8));
        e1Var.setClipToPadding(true);
        e1Var.setVerticalScrollBarEnabled(false);
        dg.n nVar = new dg.n(this, 14);
        e1Var.setOnTouchListener(new org.telegram.ui.ActionBar.i1(7, this, nVar));
        e1Var.setOnItemClickListener(nVar);
        e1Var.setOnScrollListener(new lb0(this, 12));
        addView(e1Var, k7.b6.d(-1, -1.0f, 119, 0.0f, 58.0f, 0.0f, 40.0f));
        f6Var = ((org.telegram.ui.ActionBar.g3) y1Var).resourcesProvider;
        s1 s1Var = new s1(context, f6Var);
        this.d = s1Var;
        s1Var.v = new dg.r1(this, 27);
        s1Var.a(2, false);
        addView(s1Var, k7.b6.e(-1, -2, 48));
    }

    @Override
    public final void a(int i10) {
        g1 g1Var = this.f41734c;
        g1.E(g1Var, false);
        if (this.f41736n.isEmpty() && TextUtils.isEmpty(this.f41737r.f42603b)) {
            g1Var.G();
        }
        g1Var.H(null);
    }

    @Override
    public final float b() {
        int i10 = 0;
        while (true) {
            e1 e1Var = this.f41733b;
            if (i10 < e1Var.getChildCount()) {
                View childAt = e1Var.getChildAt(i10);
                Object tag = childAt.getTag();
                if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                    return Math.max(0, childAt.getBottom());
                }
                i10++;
            } else {
                return 0.0f;
            }
        }
    }

    @Override
    public final void c() {
        this.d.setTranslationY(AndroidUtilities.dp(10.0f) + Math.max(0.0f, b()));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.recentDocumentsDidLoad) {
            g1.E(this.f41734c, true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        int i10;
        super.onAttachedToWindow();
        i10 = ((org.telegram.ui.ActionBar.g3) this.f41737r).currentAccount;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
    }

    @Override
    public final void onDetachedFromWindow() {
        int i10;
        super.onDetachedFromWindow();
        i10 = ((org.telegram.ui.ActionBar.g3) this.f41737r).currentAccount;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.recentDocumentsDidLoad);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        y1 y1Var = this.f41737r;
        i12 = ((org.telegram.ui.ActionBar.g3) y1Var).backgroundPaddingLeft;
        i13 = ((org.telegram.ui.ActionBar.g3) y1Var).backgroundPaddingLeft;
        setPadding(i12, 0, i13, AndroidUtilities.navigationBarHeight);
        super.onMeasure(i10, i11);
    }
}
