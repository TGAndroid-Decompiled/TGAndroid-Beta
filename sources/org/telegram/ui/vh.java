package org.telegram.ui;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import java.util.List;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class vh extends m2.a {
    public final int f43482c;
    public final SparseArray d;
    public final boolean f43483e;
    public final List f43484f;
    public final MessageObject f43485g;
    public final org.telegram.ui.Components.ui0 h;
    public final MessageObject f43486i;
    public final SparseIntArray f43487j;
    public final int f43488k;
    public final m2.g f43489l;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f43490m;
    public final int[] f43491n;
    public final int f43492o;
    public final qn f43493p;

    public vh(qn qnVar, int i9, SparseArray sparseArray, boolean z10, List list, MessageObject messageObject, org.telegram.ui.Components.ui0 ui0Var, MessageObject messageObject2, SparseIntArray sparseIntArray, int i10, m2.g gVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i11) {
        this.f43493p = qnVar;
        this.f43482c = i9;
        this.d = sparseArray;
        this.f43483e = z10;
        this.f43484f = list;
        this.f43485g = messageObject;
        this.h = ui0Var;
        this.f43486i = messageObject2;
        this.f43487j = sparseIntArray;
        this.f43488k = i10;
        this.f43489l = gVar;
        this.f43490m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f43491n = iArr;
        this.f43492o = i11;
    }

    @Override
    public final void a(m2.g gVar, Object obj) {
        gVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f43482c;
    }

    @Override
    public final Object e(m2.g gVar, int i9) {
        int i10;
        TLRPC.ReactionCount reactionCount;
        int i11;
        SparseArray sparseArray = this.d;
        View view = (View) sparseArray.get(i9);
        if (view != null) {
            gVar.addView(view);
            return view;
        }
        if (this.f43483e) {
            i10 = i9 - 1;
        } else {
            i10 = i9;
        }
        if (i10 >= 0) {
            reactionCount = (TLRPC.ReactionCount) this.f43484f.get(i10);
        } else {
            reactionCount = null;
        }
        TLRPC.ReactionCount reactionCount2 = reactionCount;
        Context context = gVar.getContext();
        qn qnVar = this.f43493p;
        on onVar = qnVar.f41848aa;
        i11 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
        org.telegram.ui.Components.ej0 ej0Var = new org.telegram.ui.Components.ej0(context, onVar, i11, this.f43485g, reactionCount2, true);
        org.telegram.ui.Components.ui0 ui0Var = this.h;
        ej0Var.h(ui0Var.getSeenUsers());
        ej0Var.C = new b1(this, 16);
        ej0Var.A = new ih.v3(18, this, this.f43486i);
        ej0Var.f28047y = new bg.g(this.f43487j, i9, this.f43488k, this.f43489l, this.f43490m, this.f43491n);
        if (i10 < 0) {
            ej0Var.setPredictiveCount(this.f43492o);
            ui0Var.setSeenCallback(new k3(ej0Var, 1));
        }
        gVar.addView(ej0Var);
        sparseArray.put(i9, ej0Var);
        return ej0Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
