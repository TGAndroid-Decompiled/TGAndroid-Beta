package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.TLRPC;
public final class xf1 extends s4.v {
    public boolean d;
    public final yf1 f42879e;

    public xf1(yf1 yf1Var) {
        this.f42879e = yf1Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, s4.c1 c1Var) {
        super.a(recyclerView, c1Var);
        c1Var.f46524a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        int l4 = s4.v.l(0, 0);
        int b10 = c1Var.b();
        if (b10 >= 0) {
            yf1 yf1Var = this.f42879e;
            if (b10 < yf1Var.f43166b.size() && ((pf1) yf1Var.f43166b.get(b10)).f39472c != null && ChatObject.canManageTopics(yf1Var.g())) {
                TLRPC.TL_forumTopic tL_forumTopic = ((pf1) yf1Var.f43166b.get(b10)).f39472c;
                if (yf1Var.f43164a0.isEmpty()) {
                    View view = c1Var.f46524a;
                    if ((view instanceof vf1) && tL_forumTopic.f20090id == 1) {
                        this.d = true;
                        ((vf1) view).setSliding(true);
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
        return !this.f42879e.f43164a0.isEmpty();
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        int b10;
        yf1 yf1Var = this.f42879e;
        ArrayList arrayList = yf1Var.f43166b;
        if (c1Var.f46528f == c1Var2.f46528f && (b10 = c1Var2.b()) >= 0 && b10 < arrayList.size() && ((pf1) arrayList.get(b10)).f39472c != null && ((pf1) arrayList.get(b10)).f39472c.pinned) {
            nf1 nf1Var = yf1Var.f43197r;
            int b11 = c1Var.b();
            int b12 = c1Var2.b();
            yf1 yf1Var2 = nf1Var.d;
            ArrayList arrayList2 = yf1Var2.f43166b;
            arrayList2.add(b12, (pf1) arrayList2.remove(b11));
            s4.m0 itemAnimator = yf1Var2.N.getItemAnimator();
            lf1 lf1Var = yf1Var2.I0;
            if (itemAnimator != lf1Var) {
                yf1Var2.N.setItemAnimator(lf1Var);
            }
            nf1Var.p(b11, b12);
            return true;
        }
        return false;
    }

    @Override
    public final void p(s4.c1 c1Var, int i10) {
        yf1 yf1Var = this.f42879e;
        if (i10 == 0) {
            ArrayList arrayList = yf1Var.f43166b;
            ArrayList<Integer> arrayList2 = new ArrayList<>();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TLRPC.TL_forumTopic tL_forumTopic = ((pf1) arrayList.get(i11)).f39472c;
                if (tL_forumTopic != null && tL_forumTopic.pinned) {
                    arrayList2.add(Integer.valueOf(tL_forumTopic.f20090id));
                }
            }
            yf1Var.getMessagesController().getTopicsController().reorderPinnedTopics(yf1Var.f43163a, arrayList2);
            return;
        }
        yf1Var.N.J0(false);
        c1Var.f46524a.setPressed(true);
    }

    @Override
    public final void q(s4.c1 c1Var) {
        if (c1Var != null) {
            vf1 vf1Var = (vf1) c1Var.f46524a;
            TLRPC.TL_forumTopic tL_forumTopic = vf1Var.N;
            yf1 yf1Var = this.f42879e;
            if (tL_forumTopic != null) {
                TopicsController topicsController = yf1Var.getMessagesController().getTopicsController();
                long j3 = yf1Var.f43163a;
                TLRPC.TL_forumTopic tL_forumTopic2 = vf1Var.N;
                topicsController.toggleShowTopic(j3, tL_forumTopic2.f20090id, tL_forumTopic2.hidden);
            }
            yf1Var.f43168b1 = vf1Var;
            int i10 = wf1.f42447o3;
            yf1Var.N.B1(!vf1Var.N.hidden, vf1Var);
            yf1Var.U0(true, true);
            TLRPC.TL_forumTopic tL_forumTopic3 = vf1Var.Y4;
            if (tL_forumTopic3 != null) {
                vf1Var.setTopicIcon(tL_forumTopic3);
            }
        }
    }
}
