package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.TLRPC;
public final class ve1 extends f2.d0 {
    public boolean d;
    public final we1 f43465e;

    public ve1(we1 we1Var) {
        this.f43465e = we1Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, f2.q1 q1Var) {
        super.a(recyclerView, q1Var);
        q1Var.f5501a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, f2.q1 q1Var) {
        int l10 = f2.d0.l(0, 0);
        int b10 = q1Var.b();
        if (b10 >= 0) {
            we1 we1Var = this.f43465e;
            if (b10 < we1Var.f43744b.size() && ((me1) we1Var.f43744b.get(b10)).f40405c != null && ChatObject.canManageTopics(we1Var.g())) {
                TLRPC.TL_forumTopic tL_forumTopic = ((me1) we1Var.f43744b.get(b10)).f40405c;
                if (we1Var.W.isEmpty()) {
                    View view = q1Var.f5501a;
                    if ((view instanceof se1) && tL_forumTopic.f22432id == 1) {
                        this.d = true;
                        ((se1) view).setSliding(true);
                        return f2.d0.l(0, 4);
                    }
                }
                if (!tL_forumTopic.pinned) {
                    return l10;
                }
                return f2.d0.l(3, 0);
            }
        }
        return l10;
    }

    @Override
    public final boolean k() {
        return !this.f43465e.W.isEmpty();
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f2.q1 q1Var, f2.q1 q1Var2) {
        int b10;
        we1 we1Var = this.f43465e;
        ArrayList arrayList = we1Var.f43744b;
        if (q1Var.f5505f == q1Var2.f5505f && (b10 = q1Var2.b()) >= 0 && b10 < arrayList.size() && ((me1) arrayList.get(b10)).f40405c != null && ((me1) arrayList.get(b10)).f40405c.pinned) {
            ke1 ke1Var = we1Var.f43772r;
            int b11 = q1Var.b();
            int b12 = q1Var2.b();
            we1 we1Var2 = ke1Var.d;
            ArrayList arrayList2 = we1Var2.f43744b;
            arrayList2.add(b12, (me1) arrayList2.remove(b11));
            f2.w0 itemAnimator = we1Var2.J.getItemAnimator();
            ie1 ie1Var = we1Var2.E0;
            if (itemAnimator != ie1Var) {
                we1Var2.J.setItemAnimator(ie1Var);
            }
            ke1Var.p(b11, b12);
            return true;
        }
        return false;
    }

    @Override
    public final void p(f2.q1 q1Var, int i9) {
        we1 we1Var = this.f43465e;
        if (i9 == 0) {
            ArrayList arrayList = we1Var.f43744b;
            ArrayList<Integer> arrayList2 = new ArrayList<>();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TLRPC.TL_forumTopic tL_forumTopic = ((me1) arrayList.get(i10)).f40405c;
                if (tL_forumTopic != null && tL_forumTopic.pinned) {
                    arrayList2.add(Integer.valueOf(tL_forumTopic.f22432id));
                }
            }
            we1Var.getMessagesController().getTopicsController().reorderPinnedTopics(we1Var.f43741a, arrayList2);
            return;
        }
        we1Var.J.I0(false);
        q1Var.f5501a.setPressed(true);
    }

    @Override
    public final void q(f2.q1 q1Var) {
        if (q1Var != null) {
            se1 se1Var = (se1) q1Var.f5501a;
            TLRPC.TL_forumTopic tL_forumTopic = se1Var.J;
            we1 we1Var = this.f43465e;
            if (tL_forumTopic != null) {
                TopicsController topicsController = we1Var.getMessagesController().getTopicsController();
                long j10 = we1Var.f43741a;
                TLRPC.TL_forumTopic tL_forumTopic2 = se1Var.J;
                topicsController.toggleShowTopic(j10, tL_forumTopic2.f22432id, tL_forumTopic2.hidden);
            }
            we1Var.X0 = se1Var;
            int i9 = ue1.f43239d3;
            we1Var.J.z1(!se1Var.J.hidden, se1Var);
            we1Var.U0(true, true);
            TLRPC.TL_forumTopic tL_forumTopic3 = se1Var.U4;
            if (tL_forumTopic3 != null) {
                se1Var.setTopicIcon(tL_forumTopic3);
            }
        }
    }
}
