package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

public final class xh extends m2.a {

    public final int f44453c;
    public final SparseArray d;

    public final boolean f44454e;

    public final List f44455f;

    public final MessageObject f44456g;
    public final org.telegram.ui.Components.wi0 h;

    public final MessageObject f44457i;

    public final SparseIntArray f44458j;

    public final int f44459k;

    public final m2.g f44460l;

    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f44461m;

    public final int[] f44462n;

    public final int f44463o;

    public final rn f44464p;

    public xh(rn rnVar, int i10, SparseArray sparseArray, boolean z10, List list, MessageObject messageObject, org.telegram.ui.Components.wi0 wi0Var, MessageObject messageObject2, SparseIntArray sparseIntArray, int i11, m2.g gVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i12) {
        this.f44464p = rnVar;
        this.f44453c = i10;
        this.d = sparseArray;
        this.f44454e = z10;
        this.f44455f = list;
        this.f44456g = messageObject;
        this.h = wi0Var;
        this.f44457i = messageObject2;
        this.f44458j = sparseIntArray;
        this.f44459k = i11;
        this.f44460l = gVar;
        this.f44461m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f44462n = iArr;
        this.f44463o = i12;
    }

    @Override
    public final void a(m2.g gVar, Object obj) {
        gVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f44453c;
    }

    @Override
    public final Object e(m2.g gVar, int i10) {
        SparseArray sparseArray = this.d;
        View view = (View) sparseArray.get(i10);
        if (view != null) {
            gVar.addView(view);
            return view;
        }
        int i11 = this.f44454e ? i10 - 1 : i10;
        TLRPC.ReactionCount reactionCount = i11 >= 0 ? (TLRPC.ReactionCount) this.f44455f.get(i11) : null;
        Context context = gVar.getContext();
        rn rnVar = this.f44464p;
        org.telegram.ui.Components.gj0 gj0Var = new org.telegram.ui.Components.gj0(context, rnVar.f41983aa, ((org.telegram.ui.ActionBar.n2) rnVar).currentAccount, this.f44456g, reactionCount, true);
        org.telegram.ui.Components.wi0 wi0Var = this.h;
        gj0Var.h(wi0Var.getSeenUsers());
        gj0Var.C = new c1(this, 16);
        gj0Var.A = new jh.z1(18, this, this.f44457i);
        gj0Var.f28733y = new cg.e(this.f44458j, i10, this.f44459k, this.f44460l, this.f44461m, this.f44462n);
        if (i11 < 0) {
            gj0Var.setPredictiveCount(this.f44463o);
            wi0Var.setSeenCallback(new l3(gj0Var, 1));
        }
        gVar.addView(gj0Var);
        sparseArray.put(i10, gj0Var);
        return gj0Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        return view == obj;
    }
}
