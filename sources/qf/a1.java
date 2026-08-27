package qf;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import h7.z5;
import java.util.ArrayList;
import lh.a8;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.k51;
import org.telegram.ui.ed1;
import org.telegram.ui.zh1;

public final class a1 extends n2 {

    public final CharSequence f46230a;

    public final ArrayList f46231b;

    public final int f46232c;
    public final int d;

    public final int f46233e;

    public b f46234f;
    public zh1 h;

    public k51 f46235n;

    public boolean f46236r;

    public a1(CharSequence charSequence, ArrayList arrayList, int i10, int i11, int i12) {
        super(null);
        this.f46230a = charSequence;
        this.f46231b = arrayList;
        this.f46232c = i10;
        this.d = i11;
        this.f46233e = i12;
        this.f46236r = !arrayList.isEmpty();
    }

    public final boolean U() {
        ArrayList arrayList = this.f46231b;
        return arrayList.size() == 1 && ((x0) arrayList.get(0)).f46493a == 0 && ((x0) arrayList.get(0)).f46494b == 1439;
    }

    public final boolean V() {
        ArrayList arrayList = this.f46231b;
        if (arrayList.size() >= this.f46233e) {
            return false;
        }
        return arrayList.isEmpty() || U() || ((x0) i0.a.i(1, arrayList)).f46494b < Math.min(1438, this.d + (-2));
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(this.f46230a);
        this.actionBar.setActionBarMenuOnItemClick(new ed1(12, this));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(g6.w0(null, g6.f22999a7, false));
        k51 k51Var = new k51(this, new a8(this, 22), new lh.p(this, 17), null);
        this.f46235n = k51Var;
        k51Var.p1();
        this.actionBar.setAdaptiveBackground(this.f46235n);
        frameLayout.addView(this.f46235n, z5.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void onBecomeFullyHidden() {
        zh1 zh1Var = this.h;
        if (zh1Var != null) {
            zh1Var.run();
        }
        super.onBecomeFullyHidden();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.f46236r) {
            return;
        }
        ArrayList arrayList = this.f46231b;
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.clear();
        b bVar = this.f46234f;
        if (bVar != null) {
            bVar.run();
        }
    }
}
