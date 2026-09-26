package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.TLRPC;
public final class vf1 extends s4.v {
    public boolean d;
    public final wf1 e;

    public vf1(wf1 wf1Var) {
        this.e = wf1Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.f42959a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        int l4 = s4.v.l(0, 0);
        int b10 = c1Var.b();
        if (b10 >= 0) {
            wf1 wf1Var = this.e;
            if (b10 < wf1Var.f39310b.size() && ((nf1) wf1Var.f39310b.get(b10)).f35872c != null && ChatObject.canManageTopics(wf1Var.g())) {
                TLRPC.TL_forumTopic tL_forumTopic = ((nf1) wf1Var.f39310b.get(b10)).f35872c;
                if (wf1Var.f39308a0.isEmpty()) {
                    View view = c1Var.f42959a;
                    if ((view instanceof tf1) && tL_forumTopic.f18387id == 1) {
                        this.d = true;
                        ((tf1) view).setSliding(true);
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
        return !this.e.f39308a0.isEmpty();
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        int b10;
        wf1 wf1Var = this.e;
        ArrayList arrayList = wf1Var.f39310b;
        if (c1Var.f42962f == c1Var2.f42962f && (b10 = c1Var2.b()) >= 0 && b10 < arrayList.size() && ((nf1) arrayList.get(b10)).f35872c != null && ((nf1) arrayList.get(b10)).f35872c.pinned) {
            lf1 lf1Var = wf1Var.f39340r;
            int b11 = c1Var.b();
            int b12 = c1Var2.b();
            wf1 wf1Var2 = lf1Var.d;
            ArrayList arrayList2 = wf1Var2.f39310b;
            arrayList2.add(b12, (nf1) arrayList2.remove(b11));
            s4.m0 itemAnimator = wf1Var2.N.getItemAnimator();
            jf1 jf1Var = wf1Var2.I0;
            if (itemAnimator != jf1Var) {
                wf1Var2.N.setItemAnimator(jf1Var);
            }
            lf1Var.p(b11, b12);
            return true;
        }
        return false;
    }

    @Override
    public final void p(s4.c1 c1Var, int i10) {
        wf1 wf1Var = this.e;
        if (i10 == 0) {
            ArrayList arrayList = wf1Var.f39310b;
            ArrayList<Integer> arrayList2 = new ArrayList<>();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TLRPC.TL_forumTopic tL_forumTopic = ((nf1) arrayList.get(i11)).f35872c;
                if (tL_forumTopic != null && tL_forumTopic.pinned) {
                    arrayList2.add(Integer.valueOf(tL_forumTopic.f18387id));
                }
            }
            wf1Var.getMessagesController().getTopicsController().reorderPinnedTopics(wf1Var.f39307a, arrayList2);
            return;
        }
        wf1Var.N.I0(false);
        c1Var.f42959a.setPressed(true);
    }

    @Override
    public final void q(s4.c1 c1Var) {
        if (c1Var != null) {
            tf1 tf1Var = (tf1) c1Var.f42959a;
            TLRPC.TL_forumTopic tL_forumTopic = tf1Var.N;
            wf1 wf1Var = this.e;
            if (tL_forumTopic != null) {
                TopicsController topicsController = wf1Var.getMessagesController().getTopicsController();
                long j3 = wf1Var.f39307a;
                TLRPC.TL_forumTopic tL_forumTopic2 = tf1Var.N;
                topicsController.toggleShowTopic(j3, tL_forumTopic2.f18387id, tL_forumTopic2.hidden);
            }
            wf1Var.f39312b1 = tf1Var;
            int i10 = uf1.f38465h3;
            wf1Var.N.z1(!tf1Var.N.hidden, tf1Var);
            wf1Var.U0(true, true);
            TLRPC.TL_forumTopic tL_forumTopic3 = tf1Var.Y4;
            if (tL_forumTopic3 != null) {
                tf1Var.setTopicIcon(tL_forumTopic3);
            }
        }
    }
}
