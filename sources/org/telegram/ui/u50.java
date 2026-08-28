package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class u50 extends org.telegram.ui.Components.vk0 {
    public ChatObject.Call f43137c;
    public final int d;
    public ArrayList f43139f;
    public g30 h;
    public final o50 f43140n;
    public final ArrayList f43138e = new ArrayList();
    public boolean f43141r = false;

    public u50(ChatObject.Call call, int i9, o50 o50Var) {
        this.f43137c = call;
        this.d = i9;
        this.f43140n = o50Var;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        return false;
    }

    public final void E(org.telegram.ui.Components.voip.l lVar, boolean z10) {
        if (z10 && lVar.getRenderer() == null) {
            lVar.setRenderer(org.telegram.ui.Components.voip.t.c(this.f43139f, this.h, null, null, lVar, lVar.getParticipant(), this.f43137c, this.f43140n));
        } else if (!z10 && lVar.getRenderer() != null) {
            lVar.getRenderer().setTabletGridView(null);
            lVar.setRenderer(null);
        }
    }

    public final int F() {
        org.telegram.ui.Components.wk0 wk0Var = this.f43140n.f40921j2;
        int size = this.f43138e.size();
        if (size <= 1) {
            return wk0Var.getMeasuredHeight();
        }
        if (size <= 4) {
            return wk0Var.getMeasuredHeight() / 2;
        }
        return (int) (wk0Var.getMeasuredHeight() / 2.5f);
    }

    public final void G(ArrayList arrayList, g30 g30Var) {
        this.f43139f = arrayList;
        this.h = g30Var;
    }

    public final void H(org.telegram.ui.Components.wk0 wk0Var, boolean z10, boolean z11) {
        this.f43141r = z10;
        if (z11) {
            for (int i9 = 0; i9 < wk0Var.getChildCount(); i9++) {
                View childAt = wk0Var.getChildAt(i9);
                if (childAt instanceof org.telegram.ui.Components.voip.l) {
                    org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) childAt;
                    if (lVar.getParticipant() != null) {
                        E(lVar, z10);
                    }
                }
            }
        }
    }

    public final void I(org.telegram.ui.Components.wk0 wk0Var, boolean z10) {
        if (this.f43137c == null) {
            return;
        }
        ArrayList arrayList = this.f43138e;
        if (z10) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            arrayList.clear();
            arrayList.addAll(this.f43137c.visibleVideoParticipants);
            f2.s.c(new t50(this, arrayList2), true).b(this);
            AndroidUtilities.updateVisibleRows(wk0Var);
            return;
        }
        arrayList.clear();
        arrayList.addAll(this.f43137c.visibleVideoParticipants);
        l();
    }

    @Override
    public final int h() {
        return this.f43138e.size();
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) q1Var.f5501a;
        ChatObject.VideoParticipant participant = lVar.getParticipant();
        ArrayList arrayList = this.f43138e;
        ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(i9);
        TLRPC.GroupCallParticipant groupCallParticipant = ((ChatObject.VideoParticipant) arrayList.get(i9)).participant;
        int size = arrayList.size();
        int i10 = 6;
        if (size > 1 && size != 2 && (size != 3 || i9 == 0 || i9 == 1)) {
            i10 = 3;
        }
        lVar.f33642a = i10;
        lVar.f33643b = this;
        if (lVar.getMeasuredHeight() != F()) {
            lVar.requestLayout();
        }
        AccountInstance.getInstance(this.d);
        MessageObject.getPeerId(this.f43137c.selfPeer);
        lVar.d = videoParticipant;
        if (participant != null && !participant.equals(videoParticipant) && lVar.f33645e && lVar.getRenderer() != null) {
            E(lVar, false);
            E(lVar, true);
        } else if (lVar.getRenderer() != null) {
            lVar.getRenderer().j(true);
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        return new f2.q1(new s50(this, viewGroup.getContext()));
    }
}
