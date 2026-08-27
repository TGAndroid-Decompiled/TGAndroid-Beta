package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.TLRPC;

public final class ve1 extends f2.c0 {
    public boolean d;

    public final we1 f43439e;

    public ve1(we1 we1Var) {
        this.f43439e = we1Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, f2.o1 o1Var) {
        super.a(recyclerView, o1Var);
        o1Var.f5789a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, f2.o1 o1Var) {
        int iL = f2.c0.l(0, 0);
        int iB = o1Var.b();
        if (iB >= 0) {
            we1 we1Var = this.f43439e;
            if (iB < we1Var.f43722b.size() && ((ne1) we1Var.f43722b.get(iB)).f40813c != null && ChatObject.canManageTopics(we1Var.g())) {
                TLRPC.TL_forumTopic tL_forumTopic = ((ne1) we1Var.f43722b.get(iB)).f40813c;
                if (we1Var.W.isEmpty()) {
                    View view = o1Var.f5789a;
                    if ((view instanceof te1) && tL_forumTopic.f22432id == 1) {
                        this.d = true;
                        ((te1) view).setSliding(true);
                        return f2.c0.l(0, 4);
                    }
                }
                return !tL_forumTopic.pinned ? iL : f2.c0.l(3, 0);
            }
        }
        return iL;
    }

    @Override
    public final boolean k() {
        return !this.f43439e.W.isEmpty();
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f2.o1 o1Var, f2.o1 o1Var2) {
        int iB;
        we1 we1Var = this.f43439e;
        ArrayList arrayList = we1Var.f43722b;
        if (o1Var.f5793f != o1Var2.f5793f || (iB = o1Var2.b()) < 0 || iB >= arrayList.size() || ((ne1) arrayList.get(iB)).f40813c == null || !((ne1) arrayList.get(iB)).f40813c.pinned) {
            return false;
        }
        le1 le1Var = we1Var.f43750r;
        int iB2 = o1Var.b();
        int iB3 = o1Var2.b();
        we1 we1Var2 = le1Var.d;
        ArrayList arrayList2 = we1Var2.f43722b;
        arrayList2.add(iB3, (ne1) arrayList2.remove(iB2));
        f2.v0 itemAnimator = we1Var2.J.getItemAnimator();
        je1 je1Var = we1Var2.E0;
        if (itemAnimator != je1Var) {
            we1Var2.J.setItemAnimator(je1Var);
        }
        le1Var.p(iB2, iB3);
        return true;
    }

    @Override
    public final void p(f2.o1 o1Var, int i10) {
        we1 we1Var = this.f43439e;
        if (i10 != 0) {
            we1Var.J.I0(false);
            o1Var.f5789a.setPressed(true);
            return;
        }
        ArrayList arrayList = we1Var.f43722b;
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.TL_forumTopic tL_forumTopic = ((ne1) arrayList.get(i11)).f40813c;
            if (tL_forumTopic != null && tL_forumTopic.pinned) {
                arrayList2.add(Integer.valueOf(tL_forumTopic.f22432id));
            }
        }
        we1Var.getMessagesController().getTopicsController().reorderPinnedTopics(we1Var.f43719a, arrayList2);
    }

    @Override
    public final void q(f2.o1 o1Var) {
        if (o1Var != null) {
            te1 te1Var = (te1) o1Var.f5789a;
            TLRPC.TL_forumTopic tL_forumTopic = te1Var.J;
            we1 we1Var = this.f43439e;
            if (tL_forumTopic != null) {
                TopicsController topicsController = we1Var.getMessagesController().getTopicsController();
                long j10 = we1Var.f43719a;
                TLRPC.TL_forumTopic tL_forumTopic2 = te1Var.J;
                topicsController.toggleShowTopic(j10, tL_forumTopic2.f22432id, tL_forumTopic2.hidden);
            }
            we1Var.X0 = te1Var;
            he1 he1Var = we1Var.J;
            boolean z10 = !te1Var.J.hidden;
            int i10 = ue1.f43208d3;
            he1Var.z1(z10, te1Var);
            we1Var.U0(true, true);
            TLRPC.TL_forumTopic tL_forumTopic3 = te1Var.U4;
            if (tL_forumTopic3 != null) {
                te1Var.setTopicIcon(tL_forumTopic3);
            }
        }
    }
}
