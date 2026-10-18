package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class x50 extends org.telegram.ui.Components.hm0 {
    public ChatObject.Call f43016c;
    public final int d;
    public ArrayList f43017f;
    public j30 h;
    public final s50 f43018n;
    public final ArrayList e = new ArrayList();
    public boolean f43019r = false;

    public x50(ChatObject.Call call, int i10, s50 s50Var) {
        this.f43016c = call;
        this.d = i10;
        this.f43018n = s50Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    public final void E(org.telegram.ui.Components.voip.l lVar, boolean z10) {
        if (z10 && lVar.getRenderer() == null) {
            lVar.setRenderer(org.telegram.ui.Components.voip.t.c(this.f43017f, this.h, null, null, lVar, lVar.getParticipant(), this.f43016c, this.f43018n));
        } else if (!z10 && lVar.getRenderer() != null) {
            lVar.getRenderer().setTabletGridView(null);
            lVar.setRenderer(null);
        }
    }

    public final int F() {
        org.telegram.ui.Components.im0 im0Var = this.f43018n.f40988n2;
        int size = this.e.size();
        if (size <= 1) {
            return im0Var.getMeasuredHeight();
        }
        if (size <= 4) {
            return im0Var.getMeasuredHeight() / 2;
        }
        return (int) (im0Var.getMeasuredHeight() / 2.5f);
    }

    public final void G(ArrayList arrayList, j30 j30Var) {
        this.f43017f = arrayList;
        this.h = j30Var;
    }

    public final void H(org.telegram.ui.Components.im0 im0Var, boolean z10, boolean z11) {
        this.f43019r = z10;
        if (z11) {
            for (int i10 = 0; i10 < im0Var.getChildCount(); i10++) {
                View childAt = im0Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Components.voip.l) {
                    org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) childAt;
                    if (lVar.getParticipant() != null) {
                        E(lVar, z10);
                    }
                }
            }
        }
    }

    public final void I(org.telegram.ui.Components.im0 im0Var, boolean z10) {
        if (this.f43016c == null) {
            return;
        }
        ArrayList arrayList = this.e;
        if (z10) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            arrayList.clear();
            arrayList.addAll(this.f43016c.visibleVideoParticipants);
            s4.o.c(new w50(this, arrayList2), true).c(this);
            AndroidUtilities.updateVisibleRows(im0Var);
            return;
        }
        arrayList.clear();
        arrayList.addAll(this.f43016c.visibleVideoParticipants);
        l();
    }

    @Override
    public final int h() {
        return this.e.size();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) b1Var.f45958a;
        ChatObject.VideoParticipant participant = lVar.getParticipant();
        ArrayList arrayList = this.e;
        ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(i10);
        TLRPC.GroupCallParticipant groupCallParticipant = ((ChatObject.VideoParticipant) arrayList.get(i10)).participant;
        int size = arrayList.size();
        int i11 = 6;
        if (size > 1 && size != 2 && (size != 3 || i10 == 0 || i10 == 1)) {
            i11 = 3;
        }
        lVar.f31555a = i11;
        lVar.f31556b = this;
        if (lVar.getMeasuredHeight() != F()) {
            lVar.requestLayout();
        }
        AccountInstance.getInstance(this.d);
        MessageObject.getPeerId(this.f43016c.selfPeer);
        lVar.d = videoParticipant;
        if (participant != null && !participant.equals(videoParticipant) && lVar.e && lVar.getRenderer() != null) {
            E(lVar, false);
            E(lVar, true);
        } else if (lVar.getRenderer() != null) {
            lVar.getRenderer().j(true);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        return new s4.b1(new v50(this, viewGroup.getContext()));
    }
}
