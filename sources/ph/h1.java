package ph;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.d81;
public final class h1 extends i1 implements NotificationCenter.NotificationCenterDelegate {
    public final d81 f41735b;
    public final f1 f41736c;
    public final r1 d;
    public final g1 e;
    public final e1 f41737f;
    public final ArrayList h;
    public final ArrayList f41738n;
    public final y1 f41739r;

    public h1(y1 y1Var, Context context) {
        super(context);
        org.telegram.ui.ActionBar.f6 f6Var;
        this.f41739r = y1Var;
        this.f41737f = new Object();
        this.h = new ArrayList();
        this.f41738n = new ArrayList();
        d81 d81Var = new d81(this, context, 1);
        this.f41735b = d81Var;
        f1 f1Var = new f1(this);
        this.f41736c = f1Var;
        d81Var.setAdapter(f1Var);
        g1 g1Var = new g1(this);
        this.e = g1Var;
        d81Var.setLayoutManager(g1Var);
        d81Var.i(new gg.e2(this, 8));
        d81Var.setClipToPadding(true);
        d81Var.setVerticalScrollBarEnabled(false);
        dg.n nVar = new dg.n(this, 14);
        d81Var.setOnTouchListener(new org.telegram.ui.ActionBar.i1(7, this, nVar));
        d81Var.setOnItemClickListener(nVar);
        d81Var.setOnScrollListener(new mb0(this, 12));
        addView(d81Var, k7.b6.d(-1, -1.0f, 119, 0.0f, 58.0f, 0.0f, 40.0f));
        f6Var = ((org.telegram.ui.ActionBar.g3) y1Var).resourcesProvider;
        r1 r1Var = new r1(context, f6Var);
        this.d = r1Var;
        r1Var.v = new dg.r1(this, 27);
        r1Var.a(2, false);
        addView(r1Var, k7.b6.e(-1, -2, 48));
    }

    @Override
    public final void a(int i10) {
        f1 f1Var = this.f41736c;
        f1.E(f1Var, false);
        if (this.f41738n.isEmpty() && TextUtils.isEmpty(this.f41739r.f42640b)) {
            f1Var.G();
        }
        f1Var.H(null);
    }

    @Override
    public final float b() {
        int i10 = 0;
        while (true) {
            d81 d81Var = this.f41735b;
            if (i10 < d81Var.getChildCount()) {
                View childAt = d81Var.getChildAt(i10);
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
            f1.E(this.f41736c, true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        int i10;
        super.onAttachedToWindow();
        i10 = ((org.telegram.ui.ActionBar.g3) this.f41739r).currentAccount;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
    }

    @Override
    public final void onDetachedFromWindow() {
        int i10;
        super.onDetachedFromWindow();
        i10 = ((org.telegram.ui.ActionBar.g3) this.f41739r).currentAccount;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.recentDocumentsDidLoad);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        y1 y1Var = this.f41739r;
        i12 = ((org.telegram.ui.ActionBar.g3) y1Var).backgroundPaddingLeft;
        i13 = ((org.telegram.ui.ActionBar.g3) y1Var).backgroundPaddingLeft;
        setPadding(i12, 0, i13, AndroidUtilities.navigationBarHeight);
        super.onMeasure(i10, i11);
    }
}
