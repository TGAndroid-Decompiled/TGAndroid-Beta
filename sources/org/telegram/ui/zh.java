package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class zh extends a5.a {
    public final int f46292c;
    public final SparseArray d;
    public final boolean e;
    public final List f46293f;
    public final MessageObject f46294g;
    public final org.telegram.ui.Components.fk0 h;
    public final MessageObject f46295i;
    public final SparseIntArray f46296j;
    public final int f46297k;
    public final a5.m f46298l;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f46299m;
    public final int[] f46300n;
    public final int f46301o;
    public final un f46302p;

    public zh(un unVar, int i10, SparseArray sparseArray, boolean z10, List list, MessageObject messageObject, org.telegram.ui.Components.fk0 fk0Var, MessageObject messageObject2, SparseIntArray sparseIntArray, int i11, a5.m mVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i12) {
        this.f46302p = unVar;
        this.f46292c = i10;
        this.d = sparseArray;
        this.e = z10;
        this.f46293f = list;
        this.f46294g = messageObject;
        this.h = fk0Var;
        this.f46295i = messageObject2;
        this.f46296j = sparseIntArray;
        this.f46297k = i11;
        this.f46298l = mVar;
        this.f46299m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f46300n = iArr;
        this.f46301o = i12;
    }

    @Override
    public final void a(a5.m mVar, Object obj) {
        mVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f46292c;
    }

    @Override
    public final Object e(a5.m mVar, int i10) {
        int i11;
        TLRPC.ReactionCount reactionCount;
        int i12;
        SparseArray sparseArray = this.d;
        View view = (View) sparseArray.get(i10);
        if (view != null) {
            mVar.addView(view);
            return view;
        }
        if (this.e) {
            i11 = i10 - 1;
        } else {
            i11 = i10;
        }
        if (i11 >= 0) {
            reactionCount = (TLRPC.ReactionCount) this.f46293f.get(i11);
        } else {
            reactionCount = null;
        }
        TLRPC.ReactionCount reactionCount2 = reactionCount;
        Context context = mVar.getContext();
        un unVar = this.f46302p;
        sn snVar = unVar.f44388qa;
        i12 = ((org.telegram.ui.ActionBar.r2) unVar).currentAccount;
        org.telegram.ui.Components.pk0 pk0Var = new org.telegram.ui.Components.pk0(context, snVar, i12, this.f46294g, reactionCount2, true);
        org.telegram.ui.Components.fk0 fk0Var = this.h;
        pk0Var.h(fk0Var.getSeenUsers());
        pk0Var.G = new y0(this, 18);
        pk0Var.E = new m4.s0(18, this, this.f46295i);
        pk0Var.f31593y = new hi.s4(this.f46296j, i10, this.f46297k, this.f46298l, this.f46299m, this.f46300n);
        if (i11 < 0) {
            pk0Var.setPredictiveCount(this.f46301o);
            fk0Var.setSeenCallback(new h3(pk0Var, 1));
        }
        mVar.addView(pk0Var);
        sparseArray.put(i10, pk0Var);
        return pk0Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
