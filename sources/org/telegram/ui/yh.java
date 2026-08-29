package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class yh extends m2.a {
    public final int f44881c;
    public final SparseArray d;
    public final boolean f44882e;
    public final List f44883f;
    public final MessageObject f44884g;
    public final org.telegram.ui.Components.fj0 h;
    public final MessageObject f44885i;
    public final SparseIntArray f44886j;
    public final int f44887k;
    public final m2.g f44888l;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f44889m;
    public final int[] f44890n;
    public final int f44891o;
    public final tn f44892p;

    public yh(tn tnVar, int i10, SparseArray sparseArray, boolean z10, List list, MessageObject messageObject, org.telegram.ui.Components.fj0 fj0Var, MessageObject messageObject2, SparseIntArray sparseIntArray, int i11, m2.g gVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i12) {
        this.f44892p = tnVar;
        this.f44881c = i10;
        this.d = sparseArray;
        this.f44882e = z10;
        this.f44883f = list;
        this.f44884g = messageObject;
        this.h = fj0Var;
        this.f44885i = messageObject2;
        this.f44886j = sparseIntArray;
        this.f44887k = i11;
        this.f44888l = gVar;
        this.f44889m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f44890n = iArr;
        this.f44891o = i12;
    }

    @Override
    public final void a(m2.g gVar, Object obj) {
        gVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f44881c;
    }

    @Override
    public final Object e(m2.g gVar, int i10) {
        int i11;
        TLRPC.ReactionCount reactionCount;
        int i12;
        SparseArray sparseArray = this.d;
        View view = (View) sparseArray.get(i10);
        if (view != null) {
            gVar.addView(view);
            return view;
        }
        if (this.f44882e) {
            i11 = i10 - 1;
        } else {
            i11 = i10;
        }
        if (i11 >= 0) {
            reactionCount = (TLRPC.ReactionCount) this.f44883f.get(i11);
        } else {
            reactionCount = null;
        }
        TLRPC.ReactionCount reactionCount2 = reactionCount;
        Context context = gVar.getContext();
        tn tnVar = this.f44892p;
        rn rnVar = tnVar.f42746aa;
        i12 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, rnVar, i12, this.f44884g, reactionCount2, true);
        org.telegram.ui.Components.fj0 fj0Var = this.h;
        pj0Var.h(fj0Var.getSeenUsers());
        pj0Var.C = new c1(this, 16);
        pj0Var.A = new kg.w(18, this, this.f44885i);
        pj0Var.f31696y = new eg.e(this.f44886j, i10, this.f44887k, this.f44888l, this.f44889m, this.f44890n);
        if (i11 < 0) {
            pj0Var.setPredictiveCount(this.f44891o);
            fj0Var.setSeenCallback(new l3(pj0Var, 1));
        }
        gVar.addView(pj0Var);
        sparseArray.put(i10, pj0Var);
        return pj0Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
