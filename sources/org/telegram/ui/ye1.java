package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.TLRPC;
public final class ye1 extends f2.b0 {
    public boolean d;
    public final ze1 f44856e;

    public ye1(ze1 ze1Var) {
        this.f44856e = ze1Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, f2.n1 n1Var) {
        super.a(recyclerView, n1Var);
        n1Var.f6432a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, f2.n1 n1Var) {
        int l10 = f2.b0.l(0, 0);
        int b10 = n1Var.b();
        if (b10 >= 0) {
            ze1 ze1Var = this.f44856e;
            if (b10 < ze1Var.f45158b.size() && ((pe1) ze1Var.f45158b.get(b10)).f41396c != null && ChatObject.canManageTopics(ze1Var.g())) {
                TLRPC.TL_forumTopic tL_forumTopic = ((pe1) ze1Var.f45158b.get(b10)).f41396c;
                if (ze1Var.W.isEmpty()) {
                    View view = n1Var.f6432a;
                    if ((view instanceof we1) && tL_forumTopic.f22444id == 1) {
                        this.d = true;
                        ((we1) view).setSliding(true);
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
        return !this.f44856e.W.isEmpty();
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f2.n1 n1Var, f2.n1 n1Var2) {
        int b10;
        ze1 ze1Var = this.f44856e;
        ArrayList arrayList = ze1Var.f45158b;
        if (n1Var.f6436f == n1Var2.f6436f && (b10 = n1Var2.b()) >= 0 && b10 < arrayList.size() && ((pe1) arrayList.get(b10)).f41396c != null && ((pe1) arrayList.get(b10)).f41396c.pinned) {
            ne1 ne1Var = ze1Var.f45186r;
            int b11 = n1Var.b();
            int b12 = n1Var2.b();
            ze1 ze1Var2 = ne1Var.d;
            ArrayList arrayList2 = ze1Var2.f45158b;
            arrayList2.add(b12, (pe1) arrayList2.remove(b11));
            f2.u0 itemAnimator = ze1Var2.J.getItemAnimator();
            le1 le1Var = ze1Var2.E0;
            if (itemAnimator != le1Var) {
                ze1Var2.J.setItemAnimator(le1Var);
            }
            ne1Var.p(b11, b12);
            return true;
        }
        return false;
    }

    @Override
    public final void p(f2.n1 n1Var, int i10) {
        ze1 ze1Var = this.f44856e;
        if (i10 == 0) {
            ArrayList arrayList = ze1Var.f45158b;
            ArrayList<Integer> arrayList2 = new ArrayList<>();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TLRPC.TL_forumTopic tL_forumTopic = ((pe1) arrayList.get(i11)).f41396c;
                if (tL_forumTopic != null && tL_forumTopic.pinned) {
                    arrayList2.add(Integer.valueOf(tL_forumTopic.f22444id));
                }
            }
            ze1Var.getMessagesController().getTopicsController().reorderPinnedTopics(ze1Var.f45155a, arrayList2);
            return;
        }
        ze1Var.J.I0(false);
        n1Var.f6432a.setPressed(true);
    }

    @Override
    public final void q(f2.n1 n1Var) {
        if (n1Var != null) {
            we1 we1Var = (we1) n1Var.f6432a;
            TLRPC.TL_forumTopic tL_forumTopic = we1Var.J;
            ze1 ze1Var = this.f44856e;
            if (tL_forumTopic != null) {
                TopicsController topicsController = ze1Var.getMessagesController().getTopicsController();
                long j10 = ze1Var.f45155a;
                TLRPC.TL_forumTopic tL_forumTopic2 = we1Var.J;
                topicsController.toggleShowTopic(j10, tL_forumTopic2.f22444id, tL_forumTopic2.hidden);
            }
            ze1Var.X0 = we1Var;
            int i10 = xe1.f44578d3;
            ze1Var.J.z1(!we1Var.J.hidden, we1Var);
            ze1Var.U0(true, true);
            TLRPC.TL_forumTopic tL_forumTopic3 = we1Var.U4;
            if (tL_forumTopic3 != null) {
                we1Var.setTopicIcon(tL_forumTopic3);
            }
        }
    }
}
