package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public class z5 extends org.telegram.ui.ActionBar.m2 {
    public x5 f44581a;
    public org.telegram.ui.Components.sm0 f44582b;
    public final ArrayList f44583c;
    public ArrayList d;
    public int f44584e;

    public z5(Bundle bundle) {
        super(bundle);
        this.f44583c = new ArrayList();
        this.d = new ArrayList();
    }

    public final void U() {
        ArrayList arrayList;
        boolean z10 = this.isPaused;
        ArrayList arrayList2 = this.f44583c;
        if (!z10 && this.f44581a != null) {
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
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList3.get(i10);
            i10++;
            arrayList2.add(new y5(2, (CacheByChatsController.KeepMediaException) obj));
            z11 = true;
        }
        if (z11) {
            arrayList2.add(new y5(3, null));
            arrayList2.add(new y5(4, null));
        }
        arrayList2.add(new y5(3, null));
        x5 x5Var = this.f44581a;
        if (x5Var != null) {
            if (arrayList != null) {
                x5Var.E(arrayList, arrayList2);
            } else {
                x5Var.l();
            }
        }
    }

    @Override
    public final View createView(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        hg.c.v(false, this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 21));
        this.actionBar.setTitle(LocaleController.getString(R.string.NotificationsExceptions));
        this.f44582b = new org.telegram.ui.Components.sm0(context, null);
        s4.j jVar = new s4.j();
        jVar.C = false;
        jVar.f47788m = false;
        this.f44582b.setItemAnimator(jVar);
        this.f44582b.setLayoutManager(new s4.d0());
        org.telegram.ui.Components.sm0 sm0Var = this.f44582b;
        x5 x5Var = new x5(this);
        this.f44581a = x5Var;
        sm0Var.setAdapter(x5Var);
        this.f44582b.setOnItemClickListener(new y0(this, 7));
        frameLayout.addView(this.f44582b);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20730a7, false));
        U();
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f44584e = getArguments().getInt("type");
        U();
        return super.onFragmentCreate();
    }
}
