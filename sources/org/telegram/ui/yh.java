package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class yh extends z4.a {
    public final int f43486c;
    public final SparseArray d;
    public final boolean e;
    public final List f43487f;
    public final MessageObject f43488g;
    public final org.telegram.ui.Components.ck0 h;
    public final MessageObject f43489i;
    public final SparseIntArray f43490j;
    public final int f43491k;
    public final z4.g f43492l;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f43493m;
    public final int[] f43494n;
    public final int f43495o;
    public final qn f43496p;

    public yh(qn qnVar, int i10, SparseArray sparseArray, boolean z10, List list, MessageObject messageObject, org.telegram.ui.Components.ck0 ck0Var, MessageObject messageObject2, SparseIntArray sparseIntArray, int i11, z4.g gVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i12) {
        this.f43496p = qnVar;
        this.f43486c = i10;
        this.d = sparseArray;
        this.e = z10;
        this.f43487f = list;
        this.f43488g = messageObject;
        this.h = ck0Var;
        this.f43489i = messageObject2;
        this.f43490j = sparseIntArray;
        this.f43491k = i11;
        this.f43492l = gVar;
        this.f43493m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f43494n = iArr;
        this.f43495o = i12;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f43486c;
    }

    @Override
    public final Object e(z4.g gVar, int i10) {
        int i11;
        TLRPC.ReactionCount reactionCount;
        int i12;
        SparseArray sparseArray = this.d;
        View view = (View) sparseArray.get(i10);
        if (view != null) {
            gVar.addView(view);
            return view;
        }
        if (this.e) {
            i11 = i10 - 1;
        } else {
            i11 = i10;
        }
        if (i11 >= 0) {
            reactionCount = (TLRPC.ReactionCount) this.f43487f.get(i11);
        } else {
            reactionCount = null;
        }
        TLRPC.ReactionCount reactionCount2 = reactionCount;
        Context context = gVar.getContext();
        qn qnVar = this.f43496p;
        on onVar = qnVar.f40675ea;
        i12 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
        org.telegram.ui.Components.mk0 mk0Var = new org.telegram.ui.Components.mk0(context, onVar, i12, this.f43488g, reactionCount2, true);
        org.telegram.ui.Components.ck0 ck0Var = this.h;
        mk0Var.h(ck0Var.getSeenUsers());
        mk0Var.G = new b1(this, 16);
        mk0Var.E = new m4.w0(15, this, this.f43489i);
        mk0Var.f28561y = new gi.j4(this.f43490j, i10, this.f43491k, this.f43492l, this.f43493m, this.f43494n);
        if (i11 < 0) {
            mk0Var.setPredictiveCount(this.f43495o);
            ck0Var.setSeenCallback(new j3(mk0Var, 1));
        }
        gVar.addView(mk0Var);
        sparseArray.put(i10, mk0Var);
        return mk0Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
