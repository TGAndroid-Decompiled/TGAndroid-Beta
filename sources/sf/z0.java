package sf;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import i7.f6;
import java.util.ArrayList;
import nh.t4;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.u51;
public final class z0 extends o2 {
    public final CharSequence f48012a;
    public final ArrayList f48013b;
    public final int f48014c;
    public final int d;
    public final int f48015e;
    public org.telegram.ui.web.t1 f48016f;
    public org.telegram.ui.web.y h;
    public u51 f48017n;
    public boolean f48018r;

    public z0(CharSequence charSequence, ArrayList arrayList, int i10, int i11, int i12) {
        super(null);
        this.f48012a = charSequence;
        this.f48013b = arrayList;
        this.f48014c = i10;
        this.d = i11;
        this.f48015e = i12;
        this.f48018r = !arrayList.isEmpty();
    }

    public final boolean U() {
        ArrayList arrayList = this.f48013b;
        if (arrayList.size() != 1 || ((w0) arrayList.get(0)).f47997a != 0 || ((w0) arrayList.get(0)).f47998b != 1439) {
            return false;
        }
        return true;
    }

    public final boolean V() {
        ArrayList arrayList = this.f48013b;
        if (arrayList.size() >= this.f48015e) {
            return false;
        }
        if (!arrayList.isEmpty() && !U() && ((w0) j7.l1.i(1, arrayList)).f47998b >= Math.min(1438, this.d - 2)) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(this.f48012a);
        this.actionBar.setActionBarMenuOnItemClick(new qh.e(this, 12));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(g6.w0(null, g6.f23009a7, false));
        u51 u51Var = new u51(this, new t4(this, 23), new l4.s0(this, 29), null);
        this.f48017n = u51Var;
        u51Var.p1();
        this.actionBar.setAdaptiveBackground(this.f48017n);
        frameLayout.addView(this.f48017n, f6.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void onBecomeFullyHidden() {
        org.telegram.ui.web.y yVar = this.h;
        if (yVar != null) {
            yVar.run();
        }
        super.onBecomeFullyHidden();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (!this.f48018r) {
            ArrayList arrayList = this.f48013b;
            if (!arrayList.isEmpty()) {
                arrayList.clear();
                org.telegram.ui.web.t1 t1Var = this.f48016f;
                if (t1Var != null) {
                    t1Var.run();
                }
            }
        }
    }
}
