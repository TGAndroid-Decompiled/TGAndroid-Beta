package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
public class z5 extends org.telegram.ui.ActionBar.d2 {
    public x5 f52533a;
    public org.telegram.ui.Components.tj0 f52534b;
    public final ArrayList f52535c;
    public ArrayList d;
    public int f52536e;

    public z5(Bundle bundle) {
        super(bundle);
        this.f52535c = new ArrayList();
        this.d = new ArrayList();
    }

    public final void Z() {
        ArrayList arrayList;
        boolean z10 = this.isPaused;
        ArrayList arrayList2 = this.f52535c;
        if (!z10 && this.f52533a != null) {
            arrayList = new ArrayList();
            arrayList.addAll(arrayList2);
        } else {
            arrayList = null;
        }
        arrayList2.clear();
        arrayList2.add(new y5(1, null));
        ArrayList arrayList3 = this.d;
        int size = arrayList3.size();
        boolean z11 = false;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList3.get(i3);
            i3++;
            arrayList2.add(new y5(2, (org.telegram.messenger.s2) obj));
            z11 = true;
        }
        if (z11) {
            arrayList2.add(new y5(3, null));
            arrayList2.add(new y5(4, null));
        }
        arrayList2.add(new y5(3, null));
        x5 x5Var = this.f52533a;
        if (x5Var != null) {
            if (arrayList != null) {
                x5Var.E(arrayList, arrayList2);
            } else {
                x5Var.f();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.w1(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ai.g5(this, 26));
        this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131747920, null));
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.f52534b = tj0Var;
        tj0Var.r1();
        this.f52534b.setSectionsDrawBackground(true);
        u4.k kVar = new u4.k();
        kVar.C = false;
        kVar.f55567m = false;
        this.f52534b.setItemAnimator(kVar);
        this.f52534b.setLayoutManager(new u4.b0());
        org.telegram.ui.Components.tj0 tj0Var2 = this.f52534b;
        x5 x5Var = new x5(this);
        this.f52533a = x5Var;
        tj0Var2.setAdapter(x5Var);
        this.f52534b.setOnItemClickListener(new x0(this, 7));
        frameLayout.addView(this.f52534b);
        Z();
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.f52534b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f52536e = getArguments().getInt("type");
        Z();
        return super.onFragmentCreate();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
