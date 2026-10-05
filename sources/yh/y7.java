package yh;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.h91;
import org.telegram.ui.Components.zl0;
public final class y7 extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int f52330a;
    public final h91 f52331b;
    public final x7 f52332c;
    public final FrameLayout d;
    public final bw0 f52333e;
    public final long f52334f;

    public y7(Context context, int i10, boolean z10, long j3, int i11, org.telegram.ui.ActionBar.d6 d6Var, bw0 bw0Var) {
        super(context);
        h91 bm0Var;
        bm0 bm0Var2;
        int i12;
        this.f52333e = bw0Var;
        this.f52330a = i10;
        this.f52334f = j3;
        setOrientation(1);
        if (bw0Var == null) {
            bm0Var = new h91(context, null);
        } else {
            bm0Var = new bm0(context, d6Var, bw0Var);
        }
        h91 h91Var = bm0Var;
        this.f52331b = h91Var;
        x7 x7Var = new x7(context, i10, z10, j3, i11, d6Var);
        this.f52332c = x7Var;
        if (bw0Var == null) {
            bm0Var2 = null;
        } else {
            bm0Var2 = (bm0) h91Var;
        }
        x7Var.f52246g = bm0Var2;
        h91Var.setAdapter(x7Var);
        if (bw0Var == null) {
            i12 = 3;
        } else {
            i12 = -2;
        }
        View n10 = h91Var.n(i12, true);
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20828d7, d6Var));
        if (bw0Var == null) {
            this.d = null;
            addView(n10, w7.z5.n(-1, 48));
            addView(view, new LinearLayout.LayoutParams(w7.z5.z(-1.0f), w7.z5.z(1.0f / AndroidUtilities.density)));
            setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20899h5, d6Var));
        } else {
            setClipChildren(false);
            setClipToPadding(false);
            FrameLayout frameLayout = new FrameLayout(context);
            this.d = frameLayout;
            frameLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
            frameLayout.addView(n10, w7.z5.e(-1, 48, 48));
        }
        addView(h91Var, w7.z5.n(-1, -1));
    }

    public final void a(boolean z10) {
        int i10;
        x7 x7Var = this.f52332c;
        h91 h91Var = this.f52331b;
        bw0 bw0Var = this.f52333e;
        if (bw0Var == null) {
            x7Var.i();
            h91Var.o(z10);
            return;
        }
        ArrayList arrayList = x7Var.f52247i;
        ArrayList arrayList2 = x7Var.f52247i;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            i11 |= 1 << ((h61) arrayList.get(i12)).f27106z;
        }
        View currentView = h91Var.getCurrentView();
        if (currentView instanceof w7) {
            i10 = ((w7) currentView).d;
        } else {
            i10 = 0;
        }
        x7Var.i();
        int i13 = 0;
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            i13 |= 1 << ((h61) arrayList2.get(i14)).f27106z;
        }
        if (i11 != i13) {
            h91Var.onTouchEvent(null);
            int i15 = 0;
            while (true) {
                if (i15 < arrayList2.size()) {
                    if (((h61) arrayList2.get(i15)).f27106z == i10) {
                        break;
                    }
                    i15++;
                } else {
                    i15 = 0;
                    break;
                }
            }
            h91Var.setPosition(i15);
            h91Var.J();
            h91Var.o(false);
            bw0Var.l();
        } else if (!z10) {
            h91Var.o(false);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.starTransactionsLoaded;
        long j3 = this.f52334f;
        if ((i10 == i12 && j3 == 0) || (i10 == NotificationCenter.botStarsTransactionsLoaded && j3 != 0 && ((Long) objArr[0]).longValue() == j3)) {
            a(true);
        }
    }

    public zl0 getCurrentListView() {
        View currentView = this.f52331b.getCurrentView();
        if (!(currentView instanceof w7)) {
            return null;
        }
        return ((w7) currentView).f52203a;
    }

    public FrameLayout getTabsContainer() {
        return this.d;
    }

    public h91 getViewPager() {
        return this.f52331b;
    }

    @Override
    public final void onAttachedToWindow() {
        int i10;
        a(false);
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f52330a);
        if (this.f52334f == 0) {
            i10 = NotificationCenter.starTransactionsLoaded;
        } else {
            i10 = NotificationCenter.botStarsTransactionsLoaded;
        }
        notificationCenter.addObserver(this, i10);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        int i10;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.f52330a);
        if (this.f52334f == 0) {
            i10 = NotificationCenter.starTransactionsLoaded;
        } else {
            i10 = NotificationCenter.botStarsTransactionsLoaded;
        }
        notificationCenter.removeObserver(this, i10);
        super.onDetachedFromWindow();
    }

    public void setGlassEngine(li.p pVar) {
        View[] viewPages;
        if (pVar != null) {
            x7 x7Var = this.f52332c;
            if (x7Var.h != pVar) {
                x7Var.h = pVar;
                h91 h91Var = this.f52331b;
                pVar.c(h91Var);
                for (View view : h91Var.getViewPages()) {
                    if (view instanceof w7) {
                        pVar.b(((w7) view).f52203a);
                    }
                }
            }
        }
    }
}
