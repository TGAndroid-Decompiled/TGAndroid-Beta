package uf;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import k7.b6;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.g61;
import ph.d4;
import ph.ga;
import ph.z8;
public final class z0 extends p2 {
    public final CharSequence f45550a;
    public final ArrayList f45551b;
    public final int f45552c;
    public final int d;
    public final int e;
    public ga f45553f;
    public d0 h;
    public g61 f45554n;
    public boolean f45555r;

    public z0(CharSequence charSequence, ArrayList arrayList, int i10, int i11, int i12) {
        super(null);
        this.f45550a = charSequence;
        this.f45551b = arrayList;
        this.f45552c = i10;
        this.d = i11;
        this.e = i12;
        this.f45555r = !arrayList.isEmpty();
    }

    public final boolean U() {
        ArrayList arrayList = this.f45551b;
        if (arrayList.size() != 1 || ((w0) arrayList.get(0)).f45534a != 0 || ((w0) arrayList.get(0)).f45535b != 1439) {
            return false;
        }
        return true;
    }

    public final boolean V() {
        ArrayList arrayList = this.f45551b;
        if (arrayList.size() >= this.e) {
            return false;
        }
        if (!arrayList.isEmpty() && !U() && ((w0) kf.k0.i(1, arrayList)).f45535b >= Math.min(1438, this.d - 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(this.f45550a);
        this.actionBar.setActionBarMenuOnItemClick(new sh.e(this, 12));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(j6.w0(null, j6.f19827a7, false));
        g61 g61Var = new g61(this, new d4(this, 23), new z8(this, 8), null);
        this.f45554n = g61Var;
        g61Var.o1();
        this.actionBar.setAdaptiveBackground(this.f45554n);
        frameLayout.addView(this.f45554n, b6.c(-1.0f, -1));
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
        if (!this.f45555r) {
            ArrayList arrayList = this.f45551b;
            if (!arrayList.isEmpty()) {
                arrayList.clear();
                ga gaVar = this.f45553f;
                if (gaVar != null) {
                    gaVar.run();
                }
            }
        }
    }
}
