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
    public final int f43494c;
    public final SparseArray d;
    public final boolean e;
    public final List f43495f;
    public final MessageObject f43496g;
    public final org.telegram.ui.Components.dk0 h;
    public final MessageObject f43497i;
    public final SparseIntArray f43498j;
    public final int f43499k;
    public final z4.g f43500l;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f43501m;
    public final int[] f43502n;
    public final int f43503o;
    public final qn f43504p;

    public yh(qn qnVar, int i10, SparseArray sparseArray, boolean z10, List list, MessageObject messageObject, org.telegram.ui.Components.dk0 dk0Var, MessageObject messageObject2, SparseIntArray sparseIntArray, int i11, z4.g gVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i12) {
        this.f43504p = qnVar;
        this.f43494c = i10;
        this.d = sparseArray;
        this.e = z10;
        this.f43495f = list;
        this.f43496g = messageObject;
        this.h = dk0Var;
        this.f43497i = messageObject2;
        this.f43498j = sparseIntArray;
        this.f43499k = i11;
        this.f43500l = gVar;
        this.f43501m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f43502n = iArr;
        this.f43503o = i12;
    }

    @Override
    public final void a(z4.g gVar, Object obj) {
        gVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f43494c;
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
            reactionCount = (TLRPC.ReactionCount) this.f43495f.get(i11);
        } else {
            reactionCount = null;
        }
        TLRPC.ReactionCount reactionCount2 = reactionCount;
        Context context = gVar.getContext();
        qn qnVar = this.f43504p;
        on onVar = qnVar.f40677ea;
        i12 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
        org.telegram.ui.Components.nk0 nk0Var = new org.telegram.ui.Components.nk0(context, onVar, i12, this.f43496g, reactionCount2, true);
        org.telegram.ui.Components.dk0 dk0Var = this.h;
        nk0Var.h(dk0Var.getSeenUsers());
        nk0Var.G = new b1(this, 16);
        nk0Var.E = new m4.w0(15, this, this.f43497i);
        nk0Var.f28841y = new gi.j4(this.f43498j, i10, this.f43499k, this.f43500l, this.f43501m, this.f43502n);
        if (i11 < 0) {
            nk0Var.setPredictiveCount(this.f43503o);
            dk0Var.setSeenCallback(new j3(nk0Var, 1));
        }
        gVar.addView(nk0Var);
        sparseArray.put(i10, nk0Var);
        return nk0Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
