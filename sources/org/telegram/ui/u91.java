package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class u91 extends v4.v {
    public boolean d;
    public final v91 f50359e;

    public u91(v91 v91Var) {
        this.f50359e = v91Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, v4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        d1Var.f56951a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, v4.d1 d1Var) {
        v91 v91Var = this.f50359e;
        ArrayList arrayList = v91Var.f50631b;
        int l10 = v4.v.l(0, 0);
        int b10 = d1Var.b();
        if (b10 >= 0 && b10 < arrayList.size() && ((n91) arrayList.get(b10)).f47999c != null && org.telegram.messenger.t3.y(15, v91Var.g())) {
            TLRPC.TL_forumTopic tL_forumTopic = ((n91) arrayList.get(b10)).f47999c;
            if (v91Var.f50629a0.isEmpty()) {
                View view = d1Var.f56951a;
                if ((view instanceof s91) && tL_forumTopic.f27005id == 1) {
                    this.d = true;
                    ((s91) view).setSliding(true);
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
        return !this.f50359e.f50629a0.isEmpty();
    }

    @Override
    public final boolean n(RecyclerView recyclerView, v4.d1 d1Var, v4.d1 d1Var2) {
        int b10;
        v91 v91Var = this.f50359e;
        ArrayList arrayList = v91Var.f50631b;
        if (d1Var.f56955f == d1Var2.f56955f && (b10 = d1Var2.b()) >= 0 && b10 < arrayList.size() && ((n91) arrayList.get(b10)).f47999c != null && ((n91) arrayList.get(b10)).f47999c.pinned) {
            m91 m91Var = v91Var.f50664r;
            int b11 = d1Var.b();
            int b12 = d1Var2.b();
            v91 v91Var2 = m91Var.d;
            ArrayList arrayList2 = v91Var2.f50631b;
            arrayList2.add(b12, (n91) arrayList2.remove(b11));
            v4.l0 itemAnimator = v91Var2.N.getItemAnimator();
            k91 k91Var = v91Var2.I0;
            if (itemAnimator != k91Var) {
                v91Var2.N.setItemAnimator(k91Var);
            }
            m91Var.j(b11, b12);
            return true;
        }
        return false;
    }

    @Override
    public final void p(v4.d1 d1Var, int i7) {
        v91 v91Var = this.f50359e;
        if (i7 == 0) {
            ArrayList arrayList = v91Var.f50631b;
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TLRPC.TL_forumTopic tL_forumTopic = ((n91) arrayList.get(i10)).f47999c;
                if (tL_forumTopic != null && tL_forumTopic.pinned) {
                    arrayList2.add(Integer.valueOf(tL_forumTopic.f27005id));
                }
            }
            v91Var.getMessagesController().f24870q7.w(arrayList2, v91Var.f50628a);
            return;
        }
        v91Var.N.I0(false);
        d1Var.f56951a.setPressed(true);
    }

    @Override
    public final void q(v4.d1 d1Var) {
        if (d1Var != null) {
            s91 s91Var = (s91) d1Var.f56951a;
            TLRPC.TL_forumTopic tL_forumTopic = s91Var.N;
            v91 v91Var = this.f50359e;
            if (tL_forumTopic != null) {
                org.telegram.messenger.k00 k00Var = v91Var.getMessagesController().f24870q7;
                long j3 = v91Var.f50628a;
                TLRPC.TL_forumTopic tL_forumTopic2 = s91Var.N;
                k00Var.A(tL_forumTopic2.f27005id, j3, tL_forumTopic2.hidden);
            }
            v91Var.f50636c1 = s91Var;
            int i7 = t91.f49994n3;
            v91Var.N.B1(!s91Var.N.hidden, s91Var);
            v91Var.Z0(true, true);
            TLRPC.TL_forumTopic tL_forumTopic3 = s91Var.f49706c5;
            if (tL_forumTopic3 != null) {
                s91Var.setTopicIcon(tL_forumTopic3);
            }
        }
    }
}
