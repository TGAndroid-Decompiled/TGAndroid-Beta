package pf;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import g7.e6;
import java.util.ArrayList;
import kh.b8;
import mh.m2;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.i51;
import org.telegram.ui.ai1;
import org.telegram.ui.xe1;
public final class a1 extends o2 {
    public final CharSequence f45559a;
    public final ArrayList f45560b;
    public final int f45561c;
    public final int d;
    public final int f45562e;
    public m2 f45563f;
    public ai1 h;
    public i51 f45564n;
    public boolean f45565r;

    public a1(CharSequence charSequence, ArrayList arrayList, int i9, int i10, int i11) {
        super(null);
        this.f45559a = charSequence;
        this.f45560b = arrayList;
        this.f45561c = i9;
        this.d = i10;
        this.f45562e = i11;
        this.f45565r = !arrayList.isEmpty();
    }

    public final boolean T() {
        ArrayList arrayList = this.f45560b;
        if (arrayList.size() != 1 || ((x0) arrayList.get(0)).f45825a != 0 || ((x0) arrayList.get(0)).f45826b != 1439) {
            return false;
        }
        return true;
    }

    public final boolean U() {
        ArrayList arrayList = this.f45560b;
        if (arrayList.size() >= this.f45562e) {
            return false;
        }
        if (!arrayList.isEmpty() && !T() && ((x0) j3.r0.j(1, arrayList)).f45826b >= Math.min(1438, this.d - 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(this.f45559a);
        this.actionBar.setActionBarMenuOnItemClick(new xe1(this, 11));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(f6.w0(null, f6.f22947a7, false));
        i51 i51Var = new i51(this, new b8(this, 22), new kh.p(this, 17), null);
        this.f45564n = i51Var;
        i51Var.p1();
        this.actionBar.setAdaptiveBackground(this.f45564n);
        frameLayout.addView(this.f45564n, e6.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void onBecomeFullyHidden() {
        ai1 ai1Var = this.h;
        if (ai1Var != null) {
            ai1Var.run();
        }
        super.onBecomeFullyHidden();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f45565r) {
            ArrayList arrayList = this.f45560b;
            if (!arrayList.isEmpty()) {
                arrayList.clear();
                m2 m2Var = this.f45563f;
                if (m2Var != null) {
                    m2Var.run();
                }
            }
        }
    }
}
