package qh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.nb0;
public final class i1 extends j1 implements NotificationCenter.NotificationCenterDelegate {
    public final e1 f45401b;
    public final g1 f45402c;
    public final s1 d;
    public final h1 f45403e;
    public final f1 f45404f;
    public final ArrayList h;
    public final ArrayList f45405n;
    public final y1 f45406r;

    public i1(y1 y1Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.g6 g6Var;
        this.f45406r = y1Var;
        this.f45404f = new Object();
        this.h = new ArrayList();
        this.f45405n = new ArrayList();
        e1 e1Var = new e1(this, context, 0);
        this.f45401b = e1Var;
        g1 g1Var = new g1(this);
        this.f45402c = g1Var;
        e1Var.setAdapter(g1Var);
        h1 h1Var = new h1(this);
        this.f45403e = h1Var;
        e1Var.setLayoutManager(h1Var);
        e1Var.i(new hg.e2(this, 8));
        e1Var.setClipToPadding(true);
        e1Var.setVerticalScrollBarEnabled(false);
        ag.h hVar = new ag.h(this, 15);
        e1Var.setOnTouchListener(new org.telegram.ui.ActionBar.i1(7, this, hVar));
        e1Var.setOnItemClickListener(hVar);
        e1Var.setOnScrollListener(new nb0(this, 12));
        addView(e1Var, k7.c6.d(-1, -1.0f, 119, 0.0f, 58.0f, 0.0f, 40.0f));
        g6Var = ((org.telegram.ui.ActionBar.h3) y1Var).resourcesProvider;
        s1 s1Var = new s1(context, g6Var);
        this.d = s1Var;
        s1Var.v = new eg.p1(this, 27);
        s1Var.a(2, false);
        addView(s1Var, k7.c6.e(-1, -2, 48));
    }

    @Override
    public final void a(int i10) {
        g1 g1Var = this.f45402c;
        g1.E(g1Var, false);
        if (this.f45405n.isEmpty() && TextUtils.isEmpty(this.f45406r.f46342b)) {
            g1Var.G();
        }
        g1Var.H(null);
    }

    @Override
    public final float b() {
        int i10 = 0;
        while (true) {
            e1 e1Var = this.f45401b;
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
            g1.E(this.f45402c, true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        int i10;
        super.onAttachedToWindow();
        i10 = ((org.telegram.ui.ActionBar.h3) this.f45406r).currentAccount;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
    }

    @Override
    public final void onDetachedFromWindow() {
        int i10;
        super.onDetachedFromWindow();
        i10 = ((org.telegram.ui.ActionBar.h3) this.f45406r).currentAccount;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.recentDocumentsDidLoad);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        y1 y1Var = this.f45406r;
        i12 = ((org.telegram.ui.ActionBar.h3) y1Var).backgroundPaddingLeft;
        i13 = ((org.telegram.ui.ActionBar.h3) y1Var).backgroundPaddingLeft;
        setPadding(i12, 0, i13, AndroidUtilities.navigationBarHeight);
        super.onMeasure(i10, i11);
    }
}
