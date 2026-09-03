package qh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.c81;
public final class h1 extends i1 implements NotificationCenter.NotificationCenterDelegate {
    public final c81 f45383b;
    public final f1 f45384c;
    public final r1 d;
    public final g1 f45385e;
    public final e1 f45386f;
    public final ArrayList h;
    public final ArrayList f45387n;
    public final x1 f45388r;

    public h1(x1 x1Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.g6 g6Var;
        this.f45388r = x1Var;
        this.f45386f = new Object();
        this.h = new ArrayList();
        this.f45387n = new ArrayList();
        c81 c81Var = new c81(this, context, 1);
        this.f45383b = c81Var;
        f1 f1Var = new f1(this);
        this.f45384c = f1Var;
        c81Var.setAdapter(f1Var);
        g1 g1Var = new g1(this);
        this.f45385e = g1Var;
        c81Var.setLayoutManager(g1Var);
        c81Var.i(new hg.e2(this, 8));
        c81Var.setClipToPadding(true);
        c81Var.setVerticalScrollBarEnabled(false);
        ag.h hVar = new ag.h(this, 15);
        c81Var.setOnTouchListener(new org.telegram.ui.ActionBar.i1(7, this, hVar));
        c81Var.setOnItemClickListener(hVar);
        c81Var.setOnScrollListener(new nb0(this, 12));
        addView(c81Var, k7.c6.d(-1, -1.0f, 119, 0.0f, 58.0f, 0.0f, 40.0f));
        g6Var = ((org.telegram.ui.ActionBar.h3) x1Var).resourcesProvider;
        r1 r1Var = new r1(context, g6Var);
        this.d = r1Var;
        r1Var.v = new eg.p1(this, 27);
        r1Var.a(2, false);
        addView(r1Var, k7.c6.e(-1, -2, 48));
    }

    @Override
    public final void a(int i10) {
        f1 f1Var = this.f45384c;
        f1.E(f1Var, false);
        if (this.f45387n.isEmpty() && TextUtils.isEmpty(this.f45388r.f46298b)) {
            f1Var.G();
        }
        f1Var.H(null);
    }

    @Override
    public final float b() {
        int i10 = 0;
        while (true) {
            c81 c81Var = this.f45383b;
            if (i10 < c81Var.getChildCount()) {
                View childAt = c81Var.getChildAt(i10);
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
            f1.E(this.f45384c, true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        int i10;
        super.onAttachedToWindow();
        i10 = ((org.telegram.ui.ActionBar.h3) this.f45388r).currentAccount;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
    }

    @Override
    public final void onDetachedFromWindow() {
        int i10;
        super.onDetachedFromWindow();
        i10 = ((org.telegram.ui.ActionBar.h3) this.f45388r).currentAccount;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.recentDocumentsDidLoad);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        x1 x1Var = this.f45388r;
        i12 = ((org.telegram.ui.ActionBar.h3) x1Var).backgroundPaddingLeft;
        i13 = ((org.telegram.ui.ActionBar.h3) x1Var).backgroundPaddingLeft;
        setPadding(i12, 0, i13, AndroidUtilities.navigationBarHeight);
        super.onMeasure(i10, i11);
    }
}
