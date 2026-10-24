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
    public final int f43851c;
    public final SparseArray d;
    public final boolean e;
    public final List f43852f;
    public final MessageObject f43853g;
    public final org.telegram.ui.Components.fk0 h;
    public final MessageObject f43854i;
    public final SparseIntArray f43855j;
    public final int f43856k;
    public final z4.h f43857l;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f43858m;
    public final int[] f43859n;
    public final int f43860o;
    public final sn f43861p;

    public yh(sn snVar, int i10, SparseArray sparseArray, boolean z10, List list, MessageObject messageObject, org.telegram.ui.Components.fk0 fk0Var, MessageObject messageObject2, SparseIntArray sparseIntArray, int i11, z4.h hVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i12) {
        this.f43861p = snVar;
        this.f43851c = i10;
        this.d = sparseArray;
        this.e = z10;
        this.f43852f = list;
        this.f43853g = messageObject;
        this.h = fk0Var;
        this.f43854i = messageObject2;
        this.f43855j = sparseIntArray;
        this.f43856k = i11;
        this.f43857l = hVar;
        this.f43858m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f43859n = iArr;
        this.f43860o = i12;
    }

    @Override
    public final void a(z4.h hVar, Object obj) {
        hVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f43851c;
    }

    @Override
    public final Object e(z4.h hVar, int i10) {
        int i11;
        TLRPC.ReactionCount reactionCount;
        int i12;
        SparseArray sparseArray = this.d;
        View view = (View) sparseArray.get(i10);
        if (view != null) {
            hVar.addView(view);
            return view;
        }
        if (this.e) {
            i11 = i10 - 1;
        } else {
            i11 = i10;
        }
        if (i11 >= 0) {
            reactionCount = (TLRPC.ReactionCount) this.f43852f.get(i11);
        } else {
            reactionCount = null;
        }
        TLRPC.ReactionCount reactionCount2 = reactionCount;
        Context context = hVar.getContext();
        sn snVar = this.f43861p;
        qn qnVar = snVar.f41651qa;
        i12 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
        org.telegram.ui.Components.pk0 pk0Var = new org.telegram.ui.Components.pk0(context, qnVar, i12, this.f43853g, reactionCount2, true);
        org.telegram.ui.Components.fk0 fk0Var = this.h;
        pk0Var.h(fk0Var.getSeenUsers());
        pk0Var.G = new a1(this, 16);
        pk0Var.E = new m4.w0(15, this, this.f43854i);
        pk0Var.f29587y = new gi.j4(this.f43855j, i10, this.f43856k, this.f43857l, this.f43858m, this.f43859n);
        if (i11 < 0) {
            pk0Var.setPredictiveCount(this.f43860o);
            fk0Var.setSeenCallback(new i3(pk0Var, 1));
        }
        hVar.addView(pk0Var);
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
