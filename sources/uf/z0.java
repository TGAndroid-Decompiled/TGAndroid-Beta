package uf;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import k7.b6;
import kh.a2;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.g61;
import ph.d4;
import ph.ga;
public final class z0 extends p2 {
    public final CharSequence f45486a;
    public final ArrayList f45487b;
    public final int f45488c;
    public final int d;
    public final int e;
    public ga f45489f;
    public v0 h;
    public g61 f45490n;
    public boolean f45491r;

    public z0(CharSequence charSequence, ArrayList arrayList, int i10, int i11, int i12) {
        super(null);
        this.f45486a = charSequence;
        this.f45487b = arrayList;
        this.f45488c = i10;
        this.d = i11;
        this.e = i12;
        this.f45491r = !arrayList.isEmpty();
    }

    public final boolean U() {
        ArrayList arrayList = this.f45487b;
        if (arrayList.size() != 1 || ((w0) arrayList.get(0)).f45470a != 0 || ((w0) arrayList.get(0)).f45471b != 1439) {
            return false;
        }
        return true;
    }

    public final boolean V() {
        ArrayList arrayList = this.f45487b;
        if (arrayList.size() >= this.e) {
            return false;
        }
        if (!arrayList.isEmpty() && !U() && ((w0) a2.i(1, arrayList)).f45471b >= Math.min(1438, this.d - 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(this.f45486a);
        this.actionBar.setActionBarMenuOnItemClick(new sh.e(this, 12));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(j6.w0(null, j6.f19852a7, false));
        g61 g61Var = new g61(this, new d4(this, 23), new rh.e(this, 5), null);
        this.f45490n = g61Var;
        g61Var.p1();
        this.actionBar.setAdaptiveBackground(this.f45490n);
        frameLayout.addView(this.f45490n, b6.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void onBecomeFullyHidden() {
        v0 v0Var = this.h;
        if (v0Var != null) {
            v0Var.run();
        }
        super.onBecomeFullyHidden();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f45491r) {
            ArrayList arrayList = this.f45487b;
            if (!arrayList.isEmpty()) {
                arrayList.clear();
                ga gaVar = this.f45489f;
                if (gaVar != null) {
                    gaVar.run();
                }
            }
        }
    }
}
