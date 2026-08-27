package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

public final class y50 extends org.telegram.ui.Components.yk0 {

    public ChatObject.Call f44702c;
    public final int d;

    public ArrayList f44704f;
    public j30 h;

    public final s50 f44705n;

    public final ArrayList f44703e = new ArrayList();

    public boolean f44706r = false;

    public y50(ChatObject.Call call, int i10, s50 s50Var) {
        this.f44702c = call;
        this.d = i10;
        this.f44705n = s50Var;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return false;
    }

    public final void E(org.telegram.ui.Components.voip.l lVar, boolean z10) {
        if (z10 && lVar.getRenderer() == null) {
            lVar.setRenderer(org.telegram.ui.Components.voip.t.c(this.f44704f, this.h, null, null, lVar, lVar.getParticipant(), this.f44702c, this.f44705n));
        } else {
            if (z10 || lVar.getRenderer() == null) {
                return;
            }
            lVar.getRenderer().setTabletGridView(null);
            lVar.setRenderer(null);
        }
    }

    public final int F() {
        org.telegram.ui.Components.zk0 zk0Var = this.f44705n.f42450j2;
        int size = this.f44703e.size();
        if (size <= 1) {
            return zk0Var.getMeasuredHeight();
        }
        return size <= 4 ? zk0Var.getMeasuredHeight() / 2 : (int) (zk0Var.getMeasuredHeight() / 2.5f);
    }

    public final void G(ArrayList arrayList, j30 j30Var) {
        this.f44704f = arrayList;
        this.h = j30Var;
    }

    public final void H(org.telegram.ui.Components.zk0 zk0Var, boolean z10, boolean z11) {
        this.f44706r = z10;
        if (z11) {
            for (int i10 = 0; i10 < zk0Var.getChildCount(); i10++) {
                View childAt = zk0Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Components.voip.l) {
                    org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) childAt;
                    if (lVar.getParticipant() != null) {
                        E(lVar, z10);
                    }
                }
            }
        }
    }

    public final void I(org.telegram.ui.Components.zk0 zk0Var, boolean z10) {
        if (this.f44702c == null) {
            return;
        }
        ArrayList arrayList = this.f44703e;
        if (!z10) {
            arrayList.clear();
            arrayList.addAll(this.f44702c.visibleVideoParticipants);
            l();
        } else {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            arrayList.clear();
            arrayList.addAll(this.f44702c.visibleVideoParticipants);
            f2.q.c(new x50(this, arrayList2), true).b(this);
            AndroidUtilities.updateVisibleRows(zk0Var);
        }
    }

    @Override
    public final int h() {
        return this.f44703e.size();
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) o1Var.f5789a;
        ChatObject.VideoParticipant participant = lVar.getParticipant();
        ArrayList arrayList = this.f44703e;
        ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(i10);
        TLRPC.GroupCallParticipant groupCallParticipant = ((ChatObject.VideoParticipant) arrayList.get(i10)).participant;
        int size = arrayList.size();
        int i11 = 6;
        if (size > 1 && size != 2 && (size != 3 || i10 == 0 || i10 == 1)) {
            i11 = 3;
        }
        lVar.f33692a = i11;
        lVar.f33693b = this;
        if (lVar.getMeasuredHeight() != F()) {
            lVar.requestLayout();
        }
        AccountInstance.getInstance(this.d);
        MessageObject.getPeerId(this.f44702c.selfPeer);
        lVar.d = videoParticipant;
        if (participant != null && !participant.equals(videoParticipant) && lVar.f33695e && lVar.getRenderer() != null) {
            E(lVar, false);
            E(lVar, true);
        } else if (lVar.getRenderer() != null) {
            lVar.getRenderer().j(true);
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        return new org.telegram.ui.Components.lk0(new w50(this, viewGroup.getContext()));
    }
}
