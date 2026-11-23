package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
public class x5 extends org.telegram.ui.ActionBar.g2 {
    public v5 f53632a;
    public org.telegram.ui.Components.ek0 f53633b;
    public final ArrayList f53634c;
    public ArrayList d;
    public int f53635e;

    public x5(Bundle bundle) {
        super(bundle);
        this.f53634c = new ArrayList();
        this.d = new ArrayList();
    }

    public final void Z() {
        ArrayList arrayList;
        boolean z10 = this.isPaused;
        ArrayList arrayList2 = this.f53634c;
        if (!z10 && this.f53632a != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        arrayList2.add(new w5(1, null));
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        boolean z11 = false;
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList3.get(i7);
            i7++;
            arrayList2.add(new w5(2, (org.telegram.messenger.t2) obj));
            z11 = true;
        }
        if (z11) {
            arrayList2.add(new w5(3, null));
            arrayList2.add(new w5(4, null));
        }
        arrayList2.add(new w5(3, null));
        v5 v5Var = this.f53632a;
        if (v5Var != null) {
            if (arrayList != null) {
                v5Var.E(arrayList, arrayList2);
            } else {
                v5Var.f();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.v1(this, 28));
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131747718, null));
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.f53633b = ek0Var;
        ek0Var.r1();
        this.f53633b.setSectionsDrawBackground(true);
        v4.k kVar = new v4.k();
        kVar.C = false;
        kVar.f59194m = false;
        this.f53633b.setItemAnimator(kVar);
        this.f53633b.setLayoutManager(new v4.c0());
        org.telegram.ui.Components.ek0 ek0Var2 = this.f53633b;
        v5 v5Var = new v5(this);
        this.f53632a = v5Var;
        ek0Var2.setAdapter(v5Var);
        this.f53633b.setOnItemClickListener(new w0(this, 7));
        frameLayout.addView(this.f53633b);
        Z();
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f53633b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f53635e = getArguments().getInt("type");
        Z();
        return super.onFragmentCreate();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
