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
    public final int f43857c;
    public final SparseArray d;
    public final boolean e;
    public final List f43858f;
    public final MessageObject f43859g;
    public final org.telegram.ui.Components.gk0 h;
    public final MessageObject f43860i;
    public final SparseIntArray f43861j;
    public final int f43862k;
    public final z4.h f43863l;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f43864m;
    public final int[] f43865n;
    public final int f43866o;
    public final sn f43867p;

    public yh(sn snVar, int i10, SparseArray sparseArray, boolean z10, List list, MessageObject messageObject, org.telegram.ui.Components.gk0 gk0Var, MessageObject messageObject2, SparseIntArray sparseIntArray, int i11, z4.h hVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr, int i12) {
        this.f43867p = snVar;
        this.f43857c = i10;
        this.d = sparseArray;
        this.e = z10;
        this.f43858f = list;
        this.f43859g = messageObject;
        this.h = gk0Var;
        this.f43860i = messageObject2;
        this.f43861j = sparseIntArray;
        this.f43862k = i11;
        this.f43863l = hVar;
        this.f43864m = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f43865n = iArr;
        this.f43866o = i12;
    }

    @Override
    public final void a(z4.h hVar, Object obj) {
        hVar.removeView((View) obj);
    }

    @Override
    public final int b() {
        return this.f43857c;
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
            reactionCount = (TLRPC.ReactionCount) this.f43858f.get(i11);
        } else {
            reactionCount = null;
        }
        TLRPC.ReactionCount reactionCount2 = reactionCount;
        Context context = hVar.getContext();
        sn snVar = this.f43867p;
        qn qnVar = snVar.f41654qa;
        i12 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
        org.telegram.ui.Components.qk0 qk0Var = new org.telegram.ui.Components.qk0(context, qnVar, i12, this.f43859g, reactionCount2, true);
        org.telegram.ui.Components.gk0 gk0Var = this.h;
        qk0Var.h(gk0Var.getSeenUsers());
        qk0Var.G = new a1(this, 16);
        qk0Var.E = new m4.w0(15, this, this.f43860i);
        qk0Var.f29935y = new gi.j4(this.f43861j, i10, this.f43862k, this.f43863l, this.f43864m, this.f43865n);
        if (i11 < 0) {
            qk0Var.setPredictiveCount(this.f43866o);
            gk0Var.setSeenCallback(new i3(qk0Var, 1));
        }
        hVar.addView(qk0Var);
        sparseArray.put(i10, qk0Var);
        return qk0Var;
    }

    @Override
    public final boolean f(View view, Object obj) {
        if (view == obj) {
            return true;
        }
        return false;
    }
}
