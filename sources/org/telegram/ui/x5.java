package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
public class x5 extends org.telegram.ui.ActionBar.h2 {
    public v5 f53587a;
    public org.telegram.ui.Components.ck0 f53588b;
    public final ArrayList f53589c;
    public ArrayList d;
    public int f53590e;

    public x5(Bundle bundle) {
        super(bundle);
        this.f53589c = new ArrayList();
        this.d = new ArrayList();
    }

    public final void Z() {
        ArrayList arrayList;
        boolean z10 = this.isPaused;
        ArrayList arrayList2 = this.f53589c;
        if (!z10 && this.f53587a != null) {
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
        v5 v5Var = this.f53587a;
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
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.r1(this, 28));
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131747719, null));
        org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(context, null);
        this.f53588b = ck0Var;
        ck0Var.r1();
        this.f53588b.setSectionsDrawBackground(true);
        v4.k kVar = new v4.k();
        kVar.C = false;
        kVar.f59152m = false;
        this.f53588b.setItemAnimator(kVar);
        this.f53588b.setLayoutManager(new v4.c0());
        org.telegram.ui.Components.ck0 ck0Var2 = this.f53588b;
        v5 v5Var = new v5(this);
        this.f53587a = v5Var;
        ck0Var2.setAdapter(v5Var);
        this.f53588b.setOnItemClickListener(new w0(this, 7));
        frameLayout.addView(this.f53588b);
        Z();
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.ck0 getListViewForSimpleGlass() {
        return this.f53588b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f53590e = getArguments().getInt("type");
        Z();
        return super.onFragmentCreate();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
