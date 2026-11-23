package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class x91 extends v4.v {
    public boolean d;
    public final y91 f53722e;

    public x91(y91 y91Var) {
        this.f53722e = y91Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, v4.e1 e1Var) {
        super.a(recyclerView, e1Var);
        e1Var.f59111a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, v4.e1 e1Var) {
        y91 y91Var = this.f53722e;
        ArrayList arrayList = y91Var.f54078b;
        int l10 = v4.v.l(0, 0);
        int b10 = e1Var.b();
        if (b10 >= 0 && b10 < arrayList.size() && ((q91) arrayList.get(b10)).f51084c != null && org.telegram.messenger.v3.y(15, y91Var.g())) {
            TLRPC.TL_forumTopic tL_forumTopic = ((q91) arrayList.get(b10)).f51084c;
            if (y91Var.f54079b0.isEmpty()) {
                View view = e1Var.f59111a;
                if ((view instanceof v91) && tL_forumTopic.f28450id == 1) {
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
        return !this.f53722e.f54079b0.isEmpty();
    }

    @Override
    public final boolean n(RecyclerView recyclerView, v4.e1 e1Var, v4.e1 e1Var2) {
        int b10;
        y91 y91Var = this.f53722e;
        ArrayList arrayList = y91Var.f54078b;
        if (e1Var.f59115f == e1Var2.f59115f && (b10 = e1Var2.b()) >= 0 && b10 < arrayList.size() && ((q91) arrayList.get(b10)).f51084c != null && ((q91) arrayList.get(b10)).f51084c.pinned) {
            p91 p91Var = y91Var.f54112r;
            int b11 = e1Var.b();
            int b12 = e1Var2.b();
            y91 y91Var2 = p91Var.d;
            ArrayList arrayList2 = y91Var2.f54078b;
            arrayList2.add(b12, (q91) arrayList2.remove(b11));
            v4.m0 itemAnimator = y91Var2.O.getItemAnimator();
            m91 m91Var = y91Var2.J0;
            if (itemAnimator != m91Var) {
                y91Var2.O.setItemAnimator(m91Var);
            }
            p91Var.j(b11, b12);
            return true;
        }
        return false;
    }

    @Override
    public final void p(v4.e1 e1Var, int i7) {
        y91 y91Var = this.f53722e;
        if (i7 == 0) {
            ArrayList arrayList = y91Var.f54078b;
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TLRPC.TL_forumTopic tL_forumTopic = ((q91) arrayList.get(i10)).f51084c;
                if (tL_forumTopic != null && tL_forumTopic.pinned) {
                    arrayList2.add(Integer.valueOf(tL_forumTopic.f28450id));
                }
            }
            y91Var.getMessagesController().f25932t7.w(arrayList2, y91Var.f54075a);
            return;
        }
        y91Var.O.I0(false);
        e1Var.f59111a.setPressed(true);
    }

    @Override
    public final void q(v4.e1 e1Var) {
        if (e1Var != null) {
            v91 v91Var = (v91) e1Var.f59111a;
            TLRPC.TL_forumTopic tL_forumTopic = v91Var.O;
            y91 y91Var = this.f53722e;
            if (tL_forumTopic != null) {
                org.telegram.messenger.f00 f00Var = y91Var.getMessagesController().f25932t7;
                long j3 = y91Var.f54075a;
                TLRPC.TL_forumTopic tL_forumTopic2 = v91Var.O;
                f00Var.A(tL_forumTopic2.f28450id, j3, tL_forumTopic2.hidden);
            }
            y91Var.f54085d1 = v91Var;
            int i7 = w91.f53002o3;
            y91Var.O.B1(!v91Var.O.hidden, v91Var);
            y91Var.Z0(true, true);
            TLRPC.TL_forumTopic tL_forumTopic3 = v91Var.f52743d5;
            if (tL_forumTopic3 != null) {
                v91Var.setTopicIcon(tL_forumTopic3);
            }
        }
    }
}
