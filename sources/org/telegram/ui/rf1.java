package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.TLRPC;
public final class rf1 extends f2.b0 {
    public boolean d;
    public final sf1 f40839e;

    public rf1(sf1 sf1Var) {
        this.f40839e = sf1Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, f2.m1 m1Var) {
        super.a(recyclerView, m1Var);
        m1Var.f5875a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, f2.m1 m1Var) {
        int l10 = f2.b0.l(0, 0);
        int b10 = m1Var.b();
        if (b10 >= 0) {
            sf1 sf1Var = this.f40839e;
            if (b10 < sf1Var.f41191b.size() && ((jf1) sf1Var.f41191b.get(b10)).f38044c != null && ChatObject.canManageTopics(sf1Var.g())) {
                TLRPC.TL_forumTopic tL_forumTopic = ((jf1) sf1Var.f41191b.get(b10)).f38044c;
                if (sf1Var.X.isEmpty()) {
                    View view = m1Var.f5875a;
                    if ((view instanceof pf1) && tL_forumTopic.f20897id == 1) {
                        this.d = true;
                        ((pf1) view).setSliding(true);
                        return f2.b0.l(0, 4);
                    }
                }
                if (!tL_forumTopic.pinned) {
                    return l10;
                }
                return f2.b0.l(3, 0);
            }
        }
        return l10;
    }

    @Override
    public final boolean k() {
        return !this.f40839e.X.isEmpty();
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f2.m1 m1Var, f2.m1 m1Var2) {
        int b10;
        sf1 sf1Var = this.f40839e;
        ArrayList arrayList = sf1Var.f41191b;
        if (m1Var.f5879f == m1Var2.f5879f && (b10 = m1Var2.b()) >= 0 && b10 < arrayList.size() && ((jf1) arrayList.get(b10)).f38044c != null && ((jf1) arrayList.get(b10)).f38044c.pinned) {
            hf1 hf1Var = sf1Var.f41220r;
            int b11 = m1Var.b();
            int b12 = m1Var2.b();
            sf1 sf1Var2 = hf1Var.d;
            ArrayList arrayList2 = sf1Var2.f41191b;
            arrayList2.add(b12, (jf1) arrayList2.remove(b11));
            f2.u0 itemAnimator = sf1Var2.K.getItemAnimator();
            ff1 ff1Var = sf1Var2.F0;
            if (itemAnimator != ff1Var) {
                sf1Var2.K.setItemAnimator(ff1Var);
            }
            hf1Var.p(b11, b12);
            return true;
        }
        return false;
    }

    @Override
    public final void p(f2.m1 m1Var, int i10) {
        sf1 sf1Var = this.f40839e;
        if (i10 == 0) {
            ArrayList arrayList = sf1Var.f41191b;
            ArrayList<Integer> arrayList2 = new ArrayList<>();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TLRPC.TL_forumTopic tL_forumTopic = ((jf1) arrayList.get(i11)).f38044c;
                if (tL_forumTopic != null && tL_forumTopic.pinned) {
                    arrayList2.add(Integer.valueOf(tL_forumTopic.f20897id));
                }
            }
            sf1Var.getMessagesController().getTopicsController().reorderPinnedTopics(sf1Var.f41188a, arrayList2);
            return;
        }
        sf1Var.K.I0(false);
        m1Var.f5875a.setPressed(true);
    }

    @Override
    public final void q(f2.m1 m1Var) {
        if (m1Var != null) {
            pf1 pf1Var = (pf1) m1Var.f5875a;
            TLRPC.TL_forumTopic tL_forumTopic = pf1Var.K;
            sf1 sf1Var = this.f40839e;
            if (tL_forumTopic != null) {
                TopicsController topicsController = sf1Var.getMessagesController().getTopicsController();
                long j10 = sf1Var.f41188a;
                TLRPC.TL_forumTopic tL_forumTopic2 = pf1Var.K;
                topicsController.toggleShowTopic(j10, tL_forumTopic2.f20897id, tL_forumTopic2.hidden);
            }
            sf1Var.Y0 = pf1Var;
            int i10 = qf1.f40462e3;
            sf1Var.K.y1(!pf1Var.K.hidden, pf1Var);
            sf1Var.U0(true, true);
            TLRPC.TL_forumTopic tL_forumTopic3 = pf1Var.V4;
            if (tL_forumTopic3 != null) {
                pf1Var.setTopicIcon(tL_forumTopic3);
            }
        }
    }
}
