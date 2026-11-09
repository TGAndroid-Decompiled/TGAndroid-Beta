package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class x91 extends v4.v {
    public boolean d;
    public final y91 f51607e;

    public x91(y91 y91Var) {
        this.f51607e = y91Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, v4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        d1Var.f57056a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, v4.d1 d1Var) {
        y91 y91Var = this.f51607e;
        ArrayList arrayList = y91Var.f52016b;
        int l10 = v4.v.l(0, 0);
        int b10 = d1Var.b();
        if (b10 >= 0 && b10 < arrayList.size() && ((q91) arrayList.get(b10)).f48989c != null && org.telegram.messenger.t3.y(15, y91Var.g())) {
            TLRPC.TL_forumTopic tL_forumTopic = ((q91) arrayList.get(b10)).f48989c;
            if (y91Var.f52014a0.isEmpty()) {
                View view = d1Var.f57056a;
                if ((view instanceof v91) && tL_forumTopic.f27008id == 1) {
                    this.d = true;
                    ((v91) view).setSliding(true);
                    return v4.v.l(0, 4);
                }
            }
            if (tL_forumTopic.pinned) {
                return v4.v.l(3, 0);
            }
        }
        return l10;
    }

    @Override
    public final boolean k() {
        return !this.f51607e.f52014a0.isEmpty();
    }

    @Override
    public final boolean n(RecyclerView recyclerView, v4.d1 d1Var, v4.d1 d1Var2) {
        int b10;
        y91 y91Var = this.f51607e;
        ArrayList arrayList = y91Var.f52016b;
        if (d1Var.f57060f == d1Var2.f57060f && (b10 = d1Var2.b()) >= 0 && b10 < arrayList.size() && ((q91) arrayList.get(b10)).f48989c != null && ((q91) arrayList.get(b10)).f48989c.pinned) {
            p91 p91Var = y91Var.f52049r;
            int b11 = d1Var.b();
            int b12 = d1Var2.b();
            y91 y91Var2 = p91Var.d;
            ArrayList arrayList2 = y91Var2.f52016b;
            arrayList2.add(b12, (q91) arrayList2.remove(b11));
            v4.l0 itemAnimator = y91Var2.N.getItemAnimator();
            m91 m91Var = y91Var2.I0;
            if (itemAnimator != m91Var) {
                y91Var2.N.setItemAnimator(m91Var);
            }
            p91Var.j(b11, b12);
            return true;
        }
        return false;
    }

    @Override
    public final void p(v4.d1 d1Var, int i7) {
        y91 y91Var = this.f51607e;
        if (i7 == 0) {
            ArrayList arrayList = y91Var.f52016b;
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TLRPC.TL_forumTopic tL_forumTopic = ((q91) arrayList.get(i10)).f48989c;
                if (tL_forumTopic != null && tL_forumTopic.pinned) {
                    arrayList2.add(Integer.valueOf(tL_forumTopic.f27008id));
                }
            }
            y91Var.getMessagesController().f24877q7.w(arrayList2, y91Var.f52013a);
            return;
        }
        y91Var.N.I0(false);
        d1Var.f57056a.setPressed(true);
    }

    @Override
    public final void q(v4.d1 d1Var) {
        if (d1Var != null) {
            v91 v91Var = (v91) d1Var.f57056a;
            TLRPC.TL_forumTopic tL_forumTopic = v91Var.N;
            y91 y91Var = this.f51607e;
            if (tL_forumTopic != null) {
                org.telegram.messenger.k00 k00Var = y91Var.getMessagesController().f24877q7;
                long j3 = y91Var.f52013a;
                TLRPC.TL_forumTopic tL_forumTopic2 = v91Var.N;
                k00Var.A(tL_forumTopic2.f27008id, j3, tL_forumTopic2.hidden);
            }
            y91Var.f52021c1 = v91Var;
            int i7 = w91.f50999n3;
            y91Var.N.B1(!v91Var.N.hidden, v91Var);
            y91Var.Z0(true, true);
            TLRPC.TL_forumTopic tL_forumTopic3 = v91Var.f50613c5;
            if (tL_forumTopic3 != null) {
                v91Var.setTopicIcon(tL_forumTopic3);
            }
        }
    }
}
