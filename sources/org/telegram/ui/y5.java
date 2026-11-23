package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
public class y5 extends org.telegram.ui.ActionBar.g2 {
    public w5 f54224a;
    public org.telegram.ui.Components.ek0 f54225b;
    public final ArrayList f54226c;
    public ArrayList d;
    public int f54227e;

    public y5(Bundle bundle) {
        super(bundle);
        this.f54226c = new ArrayList();
        this.d = new ArrayList();
    }

    public final void Z() {
        ArrayList arrayList;
        boolean z10 = this.isPaused;
        ArrayList arrayList2 = this.f54226c;
        if (!z10 && this.f54224a != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        arrayList2.add(new x5(1, null));
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        boolean z11 = false;
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList3.get(i7);
            i7++;
            arrayList2.add(new x5(2, (org.telegram.messenger.t2) obj));
            z11 = true;
        }
        if (z11) {
            arrayList2.add(new x5(3, null));
            arrayList2.add(new x5(4, null));
        }
        arrayList2.add(new x5(3, null));
        w5 w5Var = this.f54224a;
        if (w5Var != null) {
            if (arrayList != null) {
                w5Var.E(arrayList, arrayList2);
            } else {
                w5Var.f();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.w1(this, 28));
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131747718, null));
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.f54225b = ek0Var;
        ek0Var.r1();
        this.f54225b.setSectionsDrawBackground(true);
        v4.l lVar = new v4.l();
        lVar.C = false;
        lVar.f59274m = false;
        this.f54225b.setItemAnimator(lVar);
        this.f54225b.setLayoutManager(new v4.c0());
        org.telegram.ui.Components.ek0 ek0Var2 = this.f54225b;
        w5 w5Var = new w5(this);
        this.f54224a = w5Var;
        ek0Var2.setAdapter(w5Var);
        this.f54225b.setOnItemClickListener(new w0(this, 7));
        frameLayout.addView(this.f54225b);
        Z();
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f54225b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f54227e = getArguments().getInt("type");
        Z();
        return super.onFragmentCreate();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
