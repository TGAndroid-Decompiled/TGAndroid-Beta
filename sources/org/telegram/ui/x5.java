package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
public class x5 extends org.telegram.ui.ActionBar.f2 {
    public v5 f51522a;
    public org.telegram.ui.Components.pj0 f51523b;
    public final ArrayList f51524c;
    public ArrayList d;
    public int f51525e;

    public x5(Bundle bundle) {
        super(bundle);
        this.f51524c = new ArrayList();
        this.d = new ArrayList();
    }

    public final void Z() {
        ArrayList arrayList;
        boolean z9 = this.isPaused;
        ArrayList arrayList2 = this.f51524c;
        if (!z9 && this.f51522a != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        arrayList2.add(new w5(1, null));
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        boolean z10 = false;
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList3.get(i7);
            i7++;
            arrayList2.add(new w5(2, (org.telegram.messenger.s2) obj));
            z10 = true;
        }
        if (z10) {
            arrayList2.add(new w5(3, null));
            arrayList2.add(new w5(4, null));
        }
        arrayList2.add(new w5(3, null));
        v5 v5Var = this.f51522a;
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
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.s(this, 25));
        this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131747912, null));
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.f51523b = pj0Var;
        pj0Var.r1();
        this.f51523b.setSectionsDrawBackground(true);
        v4.k kVar = new v4.k();
        kVar.C = false;
        kVar.f57079m = false;
        this.f51523b.setItemAnimator(kVar);
        this.f51523b.setLayoutManager(new v4.b0());
        org.telegram.ui.Components.pj0 pj0Var2 = this.f51523b;
        v5 v5Var = new v5(this);
        this.f51522a = v5Var;
        pj0Var2.setAdapter(v5Var);
        this.f51523b.setOnItemClickListener(new w0(this, 7));
        frameLayout.addView(this.f51523b);
        Z();
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.f51523b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f51525e = getArguments().getInt("type");
        Z();
        return super.onFragmentCreate();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
