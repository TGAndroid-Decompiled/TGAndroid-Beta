package yh;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.o91;
import org.telegram.ui.Components.qm0;
public final class o7 extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int f52975a;
    public final o91 f52976b;
    public final n7 f52977c;

    public o7(Context context, int i10, boolean z10, long j3, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f52975a = i10;
        setOrientation(1);
        o91 o91Var = new o91(context, null);
        this.f52976b = o91Var;
        n7 n7Var = new n7(context, i10, z10, j3, i11, e6Var);
        this.f52977c = n7Var;
        o91Var.setAdapter(n7Var);
        View n10 = o91Var.n(3, true);
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20798d7, e6Var));
        addView(n10, w7.x5.n(-1, 48));
        addView(view, new LinearLayout.LayoutParams(w7.x5.z(-1.0f), w7.x5.z(1.0f / AndroidUtilities.density)));
        addView(o91Var, w7.x5.n(-1, -1));
        setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20868h5, e6Var));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starTransactionsLoaded) {
            this.f52977c.i();
            this.f52976b.o(true);
        }
    }

    public qm0 getCurrentListView() {
        View currentView = this.f52976b.getCurrentView();
        if (!(currentView instanceof m7)) {
            return null;
        }
        return ((m7) currentView).f52903a;
    }

    @Override
    public final void onAttachedToWindow() {
        this.f52977c.i();
        this.f52976b.o(false);
        NotificationCenter.getInstance(this.f52975a).addObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        NotificationCenter.getInstance(this.f52975a).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onDetachedFromWindow();
    }
}
