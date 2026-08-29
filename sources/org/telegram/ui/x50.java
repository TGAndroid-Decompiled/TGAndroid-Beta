package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class x50 extends org.telegram.ui.Components.il0 {
    public ChatObject.Call f44469c;
    public final int d;
    public ArrayList f44471f;
    public j30 h;
    public final r50 f44472n;
    public final ArrayList f44470e = new ArrayList();
    public boolean f44473r = false;

    public x50(ChatObject.Call call, int i10, r50 r50Var) {
        this.f44469c = call;
        this.d = i10;
        this.f44472n = r50Var;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        return false;
    }

    public final void E(org.telegram.ui.Components.voip.l lVar, boolean z10) {
        if (z10 && lVar.getRenderer() == null) {
            lVar.setRenderer(org.telegram.ui.Components.voip.u.c(this.f44471f, this.h, null, null, lVar, lVar.getParticipant(), this.f44469c, this.f44472n));
        } else if (!z10 && lVar.getRenderer() != null) {
            lVar.getRenderer().setTabletGridView(null);
            lVar.setRenderer(null);
        }
    }

    public final int F() {
        org.telegram.ui.Components.jl0 jl0Var = this.f44472n.f41908j2;
        int size = this.f44470e.size();
        if (size <= 1) {
            return jl0Var.getMeasuredHeight();
        }
        if (size <= 4) {
            return jl0Var.getMeasuredHeight() / 2;
        }
        return (int) (jl0Var.getMeasuredHeight() / 2.5f);
    }

    public final void G(ArrayList arrayList, j30 j30Var) {
        this.f44471f = arrayList;
        this.h = j30Var;
    }

    public final void H(org.telegram.ui.Components.jl0 jl0Var, boolean z10, boolean z11) {
        this.f44473r = z10;
        if (z11) {
            for (int i10 = 0; i10 < jl0Var.getChildCount(); i10++) {
                View childAt = jl0Var.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Components.voip.l) {
                    org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) childAt;
                    if (lVar.getParticipant() != null) {
                        E(lVar, z10);
                    }
                }
            }
        }
    }

    public final void I(org.telegram.ui.Components.jl0 jl0Var, boolean z10) {
        if (this.f44469c == null) {
            return;
        }
        ArrayList arrayList = this.f44470e;
        if (z10) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(arrayList);
            arrayList.clear();
            arrayList.addAll(this.f44469c.visibleVideoParticipants);
            f2.q.c(new w50(this, arrayList2), true).b(this);
            AndroidUtilities.updateVisibleRows(jl0Var);
            return;
        }
        arrayList.clear();
        arrayList.addAll(this.f44469c.visibleVideoParticipants);
        l();
    }

    @Override
    public final int h() {
        return this.f44470e.size();
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        org.telegram.ui.Components.voip.l lVar = (org.telegram.ui.Components.voip.l) n1Var.f6432a;
        ChatObject.VideoParticipant participant = lVar.getParticipant();
        ArrayList arrayList = this.f44470e;
        ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(i10);
        TLRPC.GroupCallParticipant groupCallParticipant = ((ChatObject.VideoParticipant) arrayList.get(i10)).participant;
        int size = arrayList.size();
        int i11 = 6;
        if (size > 1 && size != 2 && (size != 3 || i10 == 0 || i10 == 1)) {
            i11 = 3;
        }
        lVar.f33789a = i11;
        lVar.f33790b = this;
        if (lVar.getMeasuredHeight() != F()) {
            lVar.requestLayout();
        }
        AccountInstance.getInstance(this.d);
        MessageObject.getPeerId(this.f44469c.selfPeer);
        lVar.d = videoParticipant;
        if (participant != null && !participant.equals(videoParticipant) && lVar.f33792e && lVar.getRenderer() != null) {
            E(lVar, false);
            E(lVar, true);
        } else if (lVar.getRenderer() != null) {
            lVar.getRenderer().j(true);
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        return new f2.n1(new v50(this, viewGroup.getContext()));
    }
}
