package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.TLRPC;
public final class ze1 extends s4.w {
    public boolean d;
    public final af1 e;

    public ze1(af1 af1Var) {
        this.e = af1Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.e1 e1Var) {
        super.a(recyclerView, e1Var);
        e1Var.f47735a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.e1 e1Var) {
        int l4 = s4.w.l(0, 0);
        int b10 = e1Var.b();
        if (b10 >= 0) {
            af1 af1Var = this.e;
            if (b10 < af1Var.f37734b.size() && ((re1) af1Var.f37734b.get(b10)).f43132c != null && ChatObject.canManageTopics(af1Var.g())) {
                TLRPC.TL_forumTopic tL_forumTopic = ((re1) af1Var.f37734b.get(b10)).f43132c;
                if (af1Var.f37732a0.isEmpty()) {
                    View view = e1Var.f47735a;
                    if ((view instanceof xe1) && tL_forumTopic.f22079id == 1) {
                        this.d = true;
                        ((xe1) view).setSliding(true);
                        return s4.w.l(0, 4);
                    }
                }
                if (!tL_forumTopic.pinned) {
                    return l4;
                }
                return s4.w.l(3, 0);
            }
        }
        return l4;
    }

    @Override
    public final boolean k() {
        return !this.e.f37732a0.isEmpty();
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.e1 e1Var, s4.e1 e1Var2) {
        int b10;
        af1 af1Var = this.e;
        ArrayList arrayList = af1Var.f37734b;
        if (e1Var.f47738f == e1Var2.f47738f && (b10 = e1Var2.b()) >= 0 && b10 < arrayList.size() && ((re1) arrayList.get(b10)).f43132c != null && ((re1) arrayList.get(b10)).f43132c.pinned) {
            pe1 pe1Var = af1Var.f37767r;
            int b11 = e1Var.b();
            int b12 = e1Var2.b();
            af1 af1Var2 = pe1Var.d;
            ArrayList arrayList2 = af1Var2.f37734b;
            arrayList2.add(b12, (re1) arrayList2.remove(b11));
            s4.m0 itemAnimator = af1Var2.N.getItemAnimator();
            ne1 ne1Var = af1Var2.I0;
            if (itemAnimator != ne1Var) {
                af1Var2.N.setItemAnimator(ne1Var);
            }
            pe1Var.p(b11, b12);
            return true;
        }
        return false;
    }

    @Override
    public final void p(s4.e1 e1Var, int i10) {
        af1 af1Var = this.e;
        if (i10 == 0) {
            ArrayList arrayList = af1Var.f37734b;
            ArrayList<Integer> arrayList2 = new ArrayList<>();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TLRPC.TL_forumTopic tL_forumTopic = ((re1) arrayList.get(i11)).f43132c;
                if (tL_forumTopic != null && tL_forumTopic.pinned) {
                    arrayList2.add(Integer.valueOf(tL_forumTopic.f22079id));
                }
            }
            af1Var.getMessagesController().getTopicsController().reorderPinnedTopics(af1Var.f37731a, arrayList2);
            return;
        }
        af1Var.N.I0(false);
        e1Var.f47735a.setPressed(true);
    }

    @Override
    public final void q(s4.e1 e1Var) {
        if (e1Var != null) {
            xe1 xe1Var = (xe1) e1Var.f47735a;
            TLRPC.TL_forumTopic tL_forumTopic = xe1Var.N;
            af1 af1Var = this.e;
            if (tL_forumTopic != null) {
                TopicsController topicsController = af1Var.getMessagesController().getTopicsController();
                long j10 = af1Var.f37731a;
                TLRPC.TL_forumTopic tL_forumTopic2 = xe1Var.N;
                topicsController.toggleShowTopic(j10, tL_forumTopic2.f22079id, tL_forumTopic2.hidden);
            }
            af1Var.f37739c1 = xe1Var;
            int i10 = ye1.f46048o3;
            af1Var.N.F1(!xe1Var.N.hidden, xe1Var);
            af1Var.V0(true, true);
            TLRPC.TL_forumTopic tL_forumTopic3 = xe1Var.f45748c5;
            if (tL_forumTopic3 != null) {
                xe1Var.setTopicIcon(tL_forumTopic3);
            }
        }
    }
}
