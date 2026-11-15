package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class t91 extends v4.v {
    public boolean d;
    public final u91 f51513e;

    public t91(u91 u91Var) {
        this.f51513e = u91Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, v4.e1 e1Var) {
        super.a(recyclerView, e1Var);
        e1Var.f58535a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, v4.e1 e1Var) {
        u91 u91Var = this.f51513e;
        ArrayList arrayList = u91Var.f51838b;
        int l10 = v4.v.l(0, 0);
        int b10 = e1Var.b();
        if (b10 >= 0 && b10 < arrayList.size() && ((m91) arrayList.get(b10)).f49187c != null && org.telegram.messenger.t3.y(15, u91Var.g())) {
            TLRPC.TL_forumTopic tL_forumTopic = ((m91) arrayList.get(b10)).f49187c;
            if (u91Var.f51839b0.isEmpty()) {
                View view = e1Var.f58535a;
                if ((view instanceof r91) && tL_forumTopic.f28103id == 1) {
                    this.d = true;
                    ((r91) view).setSliding(true);
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
        return !this.f51513e.f51839b0.isEmpty();
    }

    @Override
    public final boolean n(RecyclerView recyclerView, v4.e1 e1Var, v4.e1 e1Var2) {
        int b10;
        u91 u91Var = this.f51513e;
        ArrayList arrayList = u91Var.f51838b;
        if (e1Var.f58539f == e1Var2.f58539f && (b10 = e1Var2.b()) >= 0 && b10 < arrayList.size() && ((m91) arrayList.get(b10)).f49187c != null && ((m91) arrayList.get(b10)).f49187c.pinned) {
            l91 l91Var = u91Var.f51872r;
            int b11 = e1Var.b();
            int b12 = e1Var2.b();
            u91 u91Var2 = l91Var.d;
            ArrayList arrayList2 = u91Var2.f51838b;
            arrayList2.add(b12, (m91) arrayList2.remove(b11));
            v4.m0 itemAnimator = u91Var2.O.getItemAnimator();
            i91 i91Var = u91Var2.J0;
            if (itemAnimator != i91Var) {
                u91Var2.O.setItemAnimator(i91Var);
            }
            l91Var.j(b11, b12);
            return true;
        }
        return false;
    }

    @Override
    public final void p(v4.e1 e1Var, int i7) {
        u91 u91Var = this.f51513e;
        if (i7 == 0) {
            ArrayList arrayList = u91Var.f51838b;
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TLRPC.TL_forumTopic tL_forumTopic = ((m91) arrayList.get(i10)).f49187c;
                if (tL_forumTopic != null && tL_forumTopic.pinned) {
                    arrayList2.add(Integer.valueOf(tL_forumTopic.f28103id));
                }
            }
            u91Var.getMessagesController().f25386r7.w(arrayList2, u91Var.f51835a);
            return;
        }
        u91Var.O.I0(false);
        e1Var.f58535a.setPressed(true);
    }

    @Override
    public final void q(v4.e1 e1Var) {
        if (e1Var != null) {
            r91 r91Var = (r91) e1Var.f58535a;
            TLRPC.TL_forumTopic tL_forumTopic = r91Var.O;
            u91 u91Var = this.f51513e;
            if (tL_forumTopic != null) {
                org.telegram.messenger.h00 h00Var = u91Var.getMessagesController().f25386r7;
                long j3 = u91Var.f51835a;
                TLRPC.TL_forumTopic tL_forumTopic2 = r91Var.O;
                h00Var.A(tL_forumTopic2.f28103id, j3, tL_forumTopic2.hidden);
            }
            u91Var.f51845d1 = r91Var;
            int i7 = s91.f51160o3;
            u91Var.O.B1(!r91Var.O.hidden, r91Var);
            u91Var.Z0(true, true);
            TLRPC.TL_forumTopic tL_forumTopic3 = r91Var.f50881d5;
            if (tL_forumTopic3 != null) {
                r91Var.setTopicIcon(tL_forumTopic3);
            }
        }
    }
}
