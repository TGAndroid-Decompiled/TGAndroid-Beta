package vf;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import k7.c6;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.h61;
import qh.c4;
import qh.u9;
public final class z0 extends p2 {
    public final CharSequence f49284a;
    public final ArrayList f49285b;
    public final int f49286c;
    public final int d;
    public final int f49287e;
    public u9 f49288f;
    public k0 h;
    public h61 f49289n;
    public boolean f49290r;

    public z0(CharSequence charSequence, ArrayList arrayList, int i10, int i11, int i12) {
        super(null);
        this.f49284a = charSequence;
        this.f49285b = arrayList;
        this.f49286c = i10;
        this.d = i11;
        this.f49287e = i12;
        this.f49290r = !arrayList.isEmpty();
    }

    public final boolean U() {
        ArrayList arrayList = this.f49285b;
        if (arrayList.size() != 1 || ((w0) arrayList.get(0)).f49267a != 0 || ((w0) arrayList.get(0)).f49268b != 1439) {
            return false;
        }
        return true;
    }

    public final boolean V() {
        ArrayList arrayList = this.f49285b;
        if (arrayList.size() >= this.f49287e) {
            return false;
        }
        if (!arrayList.isEmpty() && !U() && ((w0) l.d.i(1, arrayList)).f49268b >= Math.min(1438, this.d - 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(this.f49284a);
        this.actionBar.setActionBarMenuOnItemClick(new th.e(this, 12));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(k6.w0(null, k6.f21607a7, false));
        h61 h61Var = new h61(this, new c4(this, 23), new sf.h(this, 7), null);
        this.f49289n = h61Var;
        h61Var.o1();
        this.actionBar.setAdaptiveBackground(this.f49289n);
        frameLayout.addView(this.f49289n, c6.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void onBecomeFullyHidden() {
        k0 k0Var = this.h;
        if (k0Var != null) {
            k0Var.run();
        }
        super.onBecomeFullyHidden();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f49290r) {
            ArrayList arrayList = this.f49285b;
            if (!arrayList.isEmpty()) {
                arrayList.clear();
                u9 u9Var = this.f49288f;
                if (u9Var != null) {
                    u9Var.run();
                }
            }
        }
    }
}
