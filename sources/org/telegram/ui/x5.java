package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
public class x5 extends org.telegram.ui.ActionBar.k2 {
    public v5 f43243a;
    public org.telegram.ui.Components.uk0 f43244b;
    public final ArrayList f43245c;
    public ArrayList d;
    public int e;

    public x5(Bundle bundle) {
        super(bundle);
        this.f43245c = new ArrayList();
        this.d = new ArrayList();
    }

    public final void Z() {
        ArrayList arrayList;
        boolean z10 = this.isPaused;
        ArrayList arrayList2 = this.f43245c;
        if (!z10 && this.f43243a != null) {
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
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            arrayList2.add(new w5(2, (org.telegram.messenger.w2) obj));
            z11 = true;
        }
        if (z11) {
            arrayList2.add(new w5(3, null));
            arrayList2.add(new w5(4, null));
        }
        arrayList2.add(new w5(3, null));
        v5 v5Var = this.f43243a;
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
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ag.e(this, 15));
        this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131747928, null));
        org.telegram.ui.Components.uk0 uk0Var = new org.telegram.ui.Components.uk0(context, null);
        this.f43244b = uk0Var;
        uk0Var.r1();
        this.f43244b.setSectionsDrawBackground(true);
        s4.j jVar = new s4.j();
        jVar.C = false;
        jVar.f47938m = false;
        this.f43244b.setItemAnimator(jVar);
        this.f43244b.setLayoutManager(new s4.a0());
        org.telegram.ui.Components.uk0 uk0Var2 = this.f43244b;
        v5 v5Var = new v5(this);
        this.f43243a = v5Var;
        uk0Var2.setAdapter(v5Var);
        this.f43244b.setOnItemClickListener(new y0(this, 7));
        frameLayout.addView(this.f43244b);
        Z();
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.uk0 getListViewForSimpleGlass() {
        return this.f43244b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.e = getArguments().getInt("type");
        Z();
        return super.onFragmentCreate();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
