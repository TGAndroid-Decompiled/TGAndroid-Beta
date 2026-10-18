package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.TLRPC;
public final class se1 extends s4.v {
    public boolean d;
    public final te1 e;

    public se1(te1 te1Var) {
        this.e = te1Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.b1 b1Var) {
        super.a(recyclerView, b1Var);
        b1Var.f45910a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.b1 b1Var) {
        int l4 = s4.v.l(0, 0);
        int b10 = b1Var.b();
        if (b10 >= 0) {
            te1 te1Var = this.e;
            if (b10 < te1Var.f41673b.size() && ((ke1) te1Var.f41673b.get(b10)).f38501c != null && ChatObject.canManageTopics(te1Var.g())) {
                TLRPC.TL_forumTopic tL_forumTopic = ((ke1) te1Var.f41673b.get(b10)).f38501c;
                if (te1Var.f41671a0.isEmpty()) {
                    View view = b1Var.f45910a;
                    if ((view instanceof qe1) && tL_forumTopic.f20324id == 1) {
                        this.d = true;
                        ((qe1) view).setSliding(true);
                        return s4.v.l(0, 4);
                    }
                }
                if (!tL_forumTopic.pinned) {
                    return l4;
                }
                return s4.v.l(3, 0);
            }
        }
        return l4;
    }

    @Override
    public final boolean k() {
        return !this.e.f41671a0.isEmpty();
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2) {
        int b10;
        te1 te1Var = this.e;
        ArrayList arrayList = te1Var.f41673b;
        if (b1Var.f45913f == b1Var2.f45913f && (b10 = b1Var2.b()) >= 0 && b10 < arrayList.size() && ((ke1) arrayList.get(b10)).f38501c != null && ((ke1) arrayList.get(b10)).f38501c.pinned) {
            ie1 ie1Var = te1Var.f41703r;
            int b11 = b1Var.b();
            int b12 = b1Var2.b();
            te1 te1Var2 = ie1Var.d;
            ArrayList arrayList2 = te1Var2.f41673b;
            arrayList2.add(b12, (ke1) arrayList2.remove(b11));
            s4.l0 itemAnimator = te1Var2.N.getItemAnimator();
            ge1 ge1Var = te1Var2.I0;
            if (itemAnimator != ge1Var) {
                te1Var2.N.setItemAnimator(ge1Var);
            }
            ie1Var.p(b11, b12);
            return true;
        }
        return false;
    }

    @Override
    public final void p(s4.b1 b1Var, int i10) {
        te1 te1Var = this.e;
        if (i10 == 0) {
            ArrayList arrayList = te1Var.f41673b;
            ArrayList<Integer> arrayList2 = new ArrayList<>();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TLRPC.TL_forumTopic tL_forumTopic = ((ke1) arrayList.get(i11)).f38501c;
                if (tL_forumTopic != null && tL_forumTopic.pinned) {
                    arrayList2.add(Integer.valueOf(tL_forumTopic.f20324id));
                }
            }
            te1Var.getMessagesController().getTopicsController().reorderPinnedTopics(te1Var.f41670a, arrayList2);
            return;
        }
        te1Var.N.I0(false);
        b1Var.f45910a.setPressed(true);
    }

    @Override
    public final void q(s4.b1 b1Var) {
        if (b1Var != null) {
            qe1 qe1Var = (qe1) b1Var.f45910a;
            TLRPC.TL_forumTopic tL_forumTopic = qe1Var.N;
            te1 te1Var = this.e;
            if (tL_forumTopic != null) {
                TopicsController topicsController = te1Var.getMessagesController().getTopicsController();
                long j10 = te1Var.f41670a;
                TLRPC.TL_forumTopic tL_forumTopic2 = qe1Var.N;
                topicsController.toggleShowTopic(j10, tL_forumTopic2.f20324id, tL_forumTopic2.hidden);
            }
            te1Var.f41675b1 = qe1Var;
            int i10 = re1.f40703f3;
            te1Var.N.A1(!qe1Var.N.hidden, qe1Var);
            te1Var.U0(true, true);
            TLRPC.TL_forumTopic tL_forumTopic3 = qe1Var.f40368c5;
            if (tL_forumTopic3 != null) {
                qe1Var.setTopicIcon(tL_forumTopic3);
            }
        }
    }
}
