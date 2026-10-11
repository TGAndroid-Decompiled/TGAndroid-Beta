package yh;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.q91;
import org.telegram.ui.Components.sm0;
public final class o7 extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int f53064a;
    public final q91 f53065b;
    public final n7 f53066c;

    public o7(Context context, int i10, boolean z10, long j3, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f53064a = i10;
        setOrientation(1);
        q91 q91Var = new q91(context, null);
        this.f53065b = q91Var;
        n7 n7Var = new n7(context, i10, z10, j3, i11, d6Var);
        this.f53066c = n7Var;
        q91Var.setAdapter(n7Var);
        View n10 = q91Var.n(3, true);
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20787d7, d6Var));
        addView(n10, w7.x5.n(-1, 48));
        addView(view, new LinearLayout.LayoutParams(w7.x5.z(-1.0f), w7.x5.z(1.0f / AndroidUtilities.density)));
        addView(q91Var, w7.x5.n(-1, -1));
        setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20857h5, d6Var));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starTransactionsLoaded) {
            this.f53066c.i();
            this.f53065b.o(true);
        }
    }

    public sm0 getCurrentListView() {
        View currentView = this.f53065b.getCurrentView();
        if (!(currentView instanceof m7)) {
            return null;
        }
        return ((m7) currentView).f52972a;
    }

    @Override
    public final void onAttachedToWindow() {
        this.f53066c.i();
        this.f53065b.o(false);
        NotificationCenter.getInstance(this.f53064a).addObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        NotificationCenter.getInstance(this.f53064a).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onDetachedFromWindow();
    }
}
