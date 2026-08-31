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
    public final CharSequence f49247a;
    public final ArrayList f49248b;
    public final int f49249c;
    public final int d;
    public final int f49250e;
    public v9 f49251f;
    public d0 h;
    public i61 f49252n;
    public boolean f49253r;

    public z0(CharSequence charSequence, ArrayList arrayList, int i10, int i11, int i12) {
        super(null);
        this.f49247a = charSequence;
        this.f49248b = arrayList;
        this.f49249c = i10;
        this.d = i11;
        this.f49250e = i12;
        this.f49253r = !arrayList.isEmpty();
    }

    public final boolean U() {
        ArrayList arrayList = this.f49248b;
        if (arrayList.size() != 1 || ((w0) arrayList.get(0)).f49230a != 0 || ((w0) arrayList.get(0)).f49231b != 1439) {
            return false;
        }
        return true;
    }

    public final boolean V() {
        ArrayList arrayList = this.f49248b;
        if (arrayList.size() >= this.f49250e) {
            return false;
        }
        if (!arrayList.isEmpty() && !U() && ((w0) l.d.i(1, arrayList)).f49231b >= Math.min(1438, this.d - 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(this.f49247a);
        this.actionBar.setActionBarMenuOnItemClick(new th.e(this, 12));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(k6.w0(null, k6.f21605a7, false));
        i61 i61Var = new i61(this, new d4(this, 23), new sf.g(this, 7), null);
        this.f49252n = i61Var;
        i61Var.p1();
        this.actionBar.setAdaptiveBackground(this.f49252n);
        frameLayout.addView(this.f49252n, c6.c(-1.0f, -1));
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
        if (!this.f49253r) {
            ArrayList arrayList = this.f49248b;
            if (!arrayList.isEmpty()) {
                arrayList.clear();
                v9 v9Var = this.f49251f;
                if (v9Var != null) {
                    v9Var.run();
                }
            }
        }
    }
}
