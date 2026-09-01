package vf;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import k7.c6;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.i61;
import qh.d4;
import qh.v9;
public final class z0 extends p2 {
    public final CharSequence f49248a;
    public final ArrayList f49249b;
    public final int f49250c;
    public final int d;
    public final int f49251e;
    public v9 f49252f;
    public d0 h;
    public i61 f49253n;
    public boolean f49254r;

    public z0(CharSequence charSequence, ArrayList arrayList, int i10, int i11, int i12) {
        super(null);
        this.f49248a = charSequence;
        this.f49249b = arrayList;
        this.f49250c = i10;
        this.d = i11;
        this.f49251e = i12;
        this.f49254r = !arrayList.isEmpty();
    }

    public final boolean U() {
        ArrayList arrayList = this.f49249b;
        if (arrayList.size() != 1 || ((w0) arrayList.get(0)).f49231a != 0 || ((w0) arrayList.get(0)).f49232b != 1439) {
            return false;
        }
        return true;
    }

    public final boolean V() {
        ArrayList arrayList = this.f49249b;
        if (arrayList.size() >= this.f49251e) {
            return false;
        }
        if (!arrayList.isEmpty() && !U() && ((w0) l.d.i(1, arrayList)).f49232b >= Math.min(1438, this.d - 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(this.f49248a);
        this.actionBar.setActionBarMenuOnItemClick(new th.e(this, 12));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(k6.w0(null, k6.f21605a7, false));
        i61 i61Var = new i61(this, new d4(this, 23), new sf.g(this, 7), null);
        this.f49253n = i61Var;
        i61Var.p1();
        this.actionBar.setAdaptiveBackground(this.f49253n);
        frameLayout.addView(this.f49253n, c6.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void onBecomeFullyHidden() {
        d0 d0Var = this.h;
        if (d0Var != null) {
            d0Var.run();
        }
        super.onBecomeFullyHidden();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f49254r) {
            ArrayList arrayList = this.f49249b;
            if (!arrayList.isEmpty()) {
                arrayList.clear();
                v9 v9Var = this.f49252f;
                if (v9Var != null) {
                    v9Var.run();
                }
            }
        }
    }
}
