package yh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.g91;
import org.telegram.ui.Components.zl0;
public final class w7 extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int f52176a;
    public final g91 f52177b;
    public final v7 f52178c;
    public final FrameLayout d;
    public final aw0 f52179e;

    public w7(Context context, int i10, boolean z10, long j3, int i11, org.telegram.ui.ActionBar.d6 d6Var, aw0 aw0Var) {
        super(context);
        g91 bm0Var;
        bm0 bm0Var2;
        int i12;
        this.f52179e = aw0Var;
        this.f52176a = i10;
        setOrientation(1);
        if (aw0Var == null) {
            bm0Var = new g91(context, null);
        } else {
            bm0Var = new bm0(context, d6Var, aw0Var);
        }
        g91 g91Var = bm0Var;
        this.f52177b = g91Var;
        v7 v7Var = new v7(context, i10, z10, j3, i11, d6Var);
        this.f52178c = v7Var;
        if (aw0Var == null) {
            bm0Var2 = null;
        } else {
            bm0Var2 = (bm0) g91Var;
        }
        v7Var.f52141g = bm0Var2;
        g91Var.setAdapter(v7Var);
        if (aw0Var == null) {
            i12 = 3;
        } else {
            i12 = -2;
        }
        View n10 = g91Var.n(i12, true);
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20823d7, d6Var));
        if (aw0Var == null) {
            this.d = null;
            addView(n10, w7.z5.n(-1, 48));
            addView(view, new LinearLayout.LayoutParams(w7.z5.z(-1.0f), w7.z5.z(1.0f / AndroidUtilities.density)));
            setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20894h5, d6Var));
        } else {
            setClipChildren(false);
            setClipToPadding(false);
            FrameLayout frameLayout = new FrameLayout(context);
            this.d = frameLayout;
            frameLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
            frameLayout.addView(n10, w7.z5.e(-1, 48, 48));
        }
        addView(g91Var, w7.z5.n(-1, -1));
    }

    public final void a(boolean z10) {
        int i10;
        v7 v7Var = this.f52178c;
        g91 g91Var = this.f52177b;
        aw0 aw0Var = this.f52179e;
        if (aw0Var == null) {
            v7Var.i();
            g91Var.o(z10);
            return;
        }
        ArrayList arrayList = v7Var.f52142i;
        ArrayList arrayList2 = v7Var.f52142i;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            i11 |= 1 << ((g61) arrayList.get(i12)).f26687z;
        }
        View currentView = g91Var.getCurrentView();
        if (currentView instanceof u7) {
            i10 = ((u7) currentView).d;
        } else {
            i10 = 0;
        }
        v7Var.i();
        int i13 = 0;
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            i13 |= 1 << ((g61) arrayList2.get(i14)).f26687z;
        }
        if (i11 != i13) {
            g91Var.onTouchEvent(null);
            int i15 = 0;
            while (true) {
                if (i15 < arrayList2.size()) {
                    if (((g61) arrayList2.get(i15)).f26687z == i10) {
                        break;
                    }
                    i15++;
                } else {
                    i15 = 0;
                    break;
                }
            }
            g91Var.setPosition(i15);
            g91Var.J();
            g91Var.o(false);
            aw0Var.k0();
        } else if (!z10) {
            g91Var.o(false);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starTransactionsLoaded) {
            a(true);
        }
    }

    public zl0 getCurrentListView() {
        View currentView = this.f52177b.getCurrentView();
        if (!(currentView instanceof u7)) {
            return null;
        }
        return ((u7) currentView).f52108a;
    }

    public FrameLayout getTabsContainer() {
        return this.d;
    }

    public g91 getViewPager() {
        return this.f52177b;
    }

    @Override
    public final void onAttachedToWindow() {
        a(false);
        NotificationCenter.getInstance(this.f52176a).addObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        NotificationCenter.getInstance(this.f52176a).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onDetachedFromWindow();
    }

    public void setGlassEngine(li.n nVar) {
        View[] viewPages;
        if (nVar != null) {
            v7 v7Var = this.f52178c;
            if (v7Var.h != nVar) {
                v7Var.h = nVar;
                g91 g91Var = this.f52177b;
                nVar.c(g91Var);
                for (View view : g91Var.getViewPages()) {
                    if (view instanceof u7) {
                        nVar.b(((u7) view).f52108a);
                    }
                }
            }
        }
    }
}
