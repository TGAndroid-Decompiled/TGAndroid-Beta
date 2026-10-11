package yh;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.p91;
import org.telegram.ui.Components.rm0;
public final class o7 extends LinearLayout implements NotificationCenter.NotificationCenterDelegate {
    public final int f53098a;
    public final p91 f53099b;
    public final n7 f53100c;

    public o7(Context context, int i10, boolean z10, long j3, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f53098a = i10;
        setOrientation(1);
        p91 p91Var = new p91(context, null);
        this.f53099b = p91Var;
        n7 n7Var = new n7(context, i10, z10, j3, i11, d6Var);
        this.f53100c = n7Var;
        p91Var.setAdapter(n7Var);
        View n10 = p91Var.n(3, true);
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20823d7, d6Var));
        addView(n10, w7.x5.n(-1, 48));
        addView(view, new LinearLayout.LayoutParams(w7.x5.z(-1.0f), w7.x5.z(1.0f / AndroidUtilities.density)));
        addView(p91Var, w7.x5.n(-1, -1));
        setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20893h5, d6Var));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starTransactionsLoaded) {
            this.f53100c.i();
            this.f53099b.o(true);
        }
    }

    public rm0 getCurrentListView() {
        View currentView = this.f53099b.getCurrentView();
        if (!(currentView instanceof m7)) {
            return null;
        }
        return ((m7) currentView).f53006a;
    }

    @Override
    public final void onAttachedToWindow() {
        this.f53100c.i();
        this.f53099b.o(false);
        NotificationCenter.getInstance(this.f53098a).addObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        NotificationCenter.getInstance(this.f53098a).removeObserver(this, NotificationCenter.starTransactionsLoaded);
        super.onDetachedFromWindow();
    }
}
