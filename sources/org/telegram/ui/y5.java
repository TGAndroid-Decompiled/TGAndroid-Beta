package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
public class y5 extends org.telegram.ui.ActionBar.e2 {
    public w5 f53413a;
    public org.telegram.ui.Components.uj0 f53414b;
    public final ArrayList f53415c;
    public ArrayList d;
    public int f53416e;

    public y5(Bundle bundle) {
        super(bundle);
        this.f53415c = new ArrayList();
        this.d = new ArrayList();
    }

    public final void Z() {
        ArrayList arrayList;
        boolean z10 = this.isPaused;
        ArrayList arrayList2 = this.f53415c;
        if (!z10 && this.f53413a != null) {
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
            arrayList2.add(new x5(2, (org.telegram.messenger.s2) obj));
            z11 = true;
        }
        if (z11) {
            arrayList2.add(new x5(3, null));
            arrayList2.add(new x5(4, null));
        }
        arrayList2.add(new x5(3, null));
        w5 w5Var = this.f53413a;
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
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.x4(this, 26));
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131747912, null));
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
        this.f53414b = uj0Var;
        uj0Var.r1();
        this.f53414b.setSectionsDrawBackground(true);
        v4.k kVar = new v4.k();
        kVar.C = false;
        kVar.f58564m = false;
        this.f53414b.setItemAnimator(kVar);
        this.f53414b.setLayoutManager(new v4.b0());
        org.telegram.ui.Components.uj0 uj0Var2 = this.f53414b;
        w5 w5Var = new w5(this);
        this.f53413a = w5Var;
        uj0Var2.setAdapter(w5Var);
        this.f53414b.setOnItemClickListener(new w0(this, 7));
        frameLayout.addView(this.f53414b);
        Z();
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.f53414b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f53416e = getArguments().getInt("type");
        Z();
        return super.onFragmentCreate();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
