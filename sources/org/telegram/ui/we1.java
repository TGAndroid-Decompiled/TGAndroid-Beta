package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.TLRPC;
public final class we1 extends s4.v {
    public boolean d;
    public final xe1 e;

    public we1(xe1 xe1Var) {
        this.e = xe1Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.b1 b1Var) {
        super.a(recyclerView, b1Var);
        b1Var.f46342a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.b1 b1Var) {
        int l4 = s4.v.l(0, 0);
        int b10 = b1Var.b();
        if (b10 >= 0) {
            xe1 xe1Var = this.e;
            if (b10 < xe1Var.f43548b.size() && ((ne1) xe1Var.f43548b.get(b10)).f39813c != null && ChatObject.canManageTopics(xe1Var.g())) {
                TLRPC.TL_forumTopic tL_forumTopic = ((ne1) xe1Var.f43548b.get(b10)).f39813c;
                if (xe1Var.f43546a0.isEmpty()) {
                    View view = b1Var.f46342a;
                    if ((view instanceof te1) && tL_forumTopic.f20396id == 1) {
                        this.d = true;
                        ((te1) view).setSliding(true);
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
        return !this.e.f43546a0.isEmpty();
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.b1 b1Var, s4.b1 b1Var2) {
        int b10;
        xe1 xe1Var = this.e;
        ArrayList arrayList = xe1Var.f43548b;
        if (b1Var.f46345f == b1Var2.f46345f && (b10 = b1Var2.b()) >= 0 && b10 < arrayList.size() && ((ne1) arrayList.get(b10)).f39813c != null && ((ne1) arrayList.get(b10)).f39813c.pinned) {
            le1 le1Var = xe1Var.f43581r;
            int b11 = b1Var.b();
            int b12 = b1Var2.b();
            xe1 xe1Var2 = le1Var.d;
            ArrayList arrayList2 = xe1Var2.f43548b;
            arrayList2.add(b12, (ne1) arrayList2.remove(b11));
            s4.l0 itemAnimator = xe1Var2.N.getItemAnimator();
            je1 je1Var = xe1Var2.I0;
            if (itemAnimator != je1Var) {
                xe1Var2.N.setItemAnimator(je1Var);
            }
            le1Var.p(b11, b12);
            return true;
        }
        return false;
    }

    @Override
    public final void p(s4.b1 b1Var, int i10) {
        xe1 xe1Var = this.e;
        if (i10 == 0) {
            ArrayList arrayList = xe1Var.f43548b;
            ArrayList<Integer> arrayList2 = new ArrayList<>();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TLRPC.TL_forumTopic tL_forumTopic = ((ne1) arrayList.get(i11)).f39813c;
                if (tL_forumTopic != null && tL_forumTopic.pinned) {
                    arrayList2.add(Integer.valueOf(tL_forumTopic.f20396id));
                }
            }
            xe1Var.getMessagesController().getTopicsController().reorderPinnedTopics(xe1Var.f43545a, arrayList2);
            return;
        }
        xe1Var.N.I0(false);
        b1Var.f46342a.setPressed(true);
    }

    @Override
    public final void q(s4.b1 b1Var) {
        if (b1Var != null) {
            te1 te1Var = (te1) b1Var.f46342a;
            TLRPC.TL_forumTopic tL_forumTopic = te1Var.N;
            xe1 xe1Var = this.e;
            if (tL_forumTopic != null) {
                TopicsController topicsController = xe1Var.getMessagesController().getTopicsController();
                long j10 = xe1Var.f43545a;
                TLRPC.TL_forumTopic tL_forumTopic2 = te1Var.N;
                topicsController.toggleShowTopic(j10, tL_forumTopic2.f20396id, tL_forumTopic2.hidden);
            }
            xe1Var.f43553c1 = te1Var;
            int i10 = ve1.f42712i3;
            xe1Var.N.F1(!te1Var.N.hidden, te1Var);
            xe1Var.U0(true, true);
            TLRPC.TL_forumTopic tL_forumTopic3 = te1Var.f42027c5;
            if (tL_forumTopic3 != null) {
                te1Var.setTopicIcon(tL_forumTopic3);
            }
        }
    }
}
