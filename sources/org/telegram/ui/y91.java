package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class y91 extends v4.v {
    public boolean d;
    public final z91 f51980e;

    public y91(z91 z91Var) {
        this.f51980e = z91Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, v4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        d1Var.f57052a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, v4.d1 d1Var) {
        z91 z91Var = this.f51980e;
        ArrayList arrayList = z91Var.f52346b;
        int l10 = v4.v.l(0, 0);
        int b10 = d1Var.b();
        if (b10 >= 0 && b10 < arrayList.size() && ((r91) arrayList.get(b10)).f49322c != null && org.telegram.messenger.t3.y(15, z91Var.g())) {
            TLRPC.TL_forumTopic tL_forumTopic = ((r91) arrayList.get(b10)).f49322c;
            if (z91Var.f52344a0.isEmpty()) {
                View view = d1Var.f57052a;
                if ((view instanceof w91) && tL_forumTopic.f27012id == 1) {
                    this.d = true;
                    ((w91) view).setSliding(true);
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
        return !this.f51980e.f52344a0.isEmpty();
    }

    @Override
    public final boolean n(RecyclerView recyclerView, v4.d1 d1Var, v4.d1 d1Var2) {
        int b10;
        z91 z91Var = this.f51980e;
        ArrayList arrayList = z91Var.f52346b;
        if (d1Var.f57056f == d1Var2.f57056f && (b10 = d1Var2.b()) >= 0 && b10 < arrayList.size() && ((r91) arrayList.get(b10)).f49322c != null && ((r91) arrayList.get(b10)).f49322c.pinned) {
            q91 q91Var = z91Var.f52379r;
            int b11 = d1Var.b();
            int b12 = d1Var2.b();
            z91 z91Var2 = q91Var.d;
            ArrayList arrayList2 = z91Var2.f52346b;
            arrayList2.add(b12, (r91) arrayList2.remove(b11));
            v4.l0 itemAnimator = z91Var2.N.getItemAnimator();
            n91 n91Var = z91Var2.I0;
            if (itemAnimator != n91Var) {
                z91Var2.N.setItemAnimator(n91Var);
            }
            q91Var.j(b11, b12);
            return true;
        }
        return false;
    }

    @Override
    public final void p(v4.d1 d1Var, int i7) {
        z91 z91Var = this.f51980e;
        if (i7 == 0) {
            ArrayList arrayList = z91Var.f52346b;
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TLRPC.TL_forumTopic tL_forumTopic = ((r91) arrayList.get(i10)).f49322c;
                if (tL_forumTopic != null && tL_forumTopic.pinned) {
                    arrayList2.add(Integer.valueOf(tL_forumTopic.f27012id));
                }
            }
            z91Var.getMessagesController().f24881q7.w(arrayList2, z91Var.f52343a);
            return;
        }
        z91Var.N.I0(false);
        d1Var.f57052a.setPressed(true);
    }

    @Override
    public final void q(v4.d1 d1Var) {
        if (d1Var != null) {
            w91 w91Var = (w91) d1Var.f57052a;
            TLRPC.TL_forumTopic tL_forumTopic = w91Var.N;
            z91 z91Var = this.f51980e;
            if (tL_forumTopic != null) {
                org.telegram.messenger.k00 k00Var = z91Var.getMessagesController().f24881q7;
                long j3 = z91Var.f52343a;
                TLRPC.TL_forumTopic tL_forumTopic2 = w91Var.N;
                k00Var.A(tL_forumTopic2.f27012id, j3, tL_forumTopic2.hidden);
            }
            z91Var.f52351c1 = w91Var;
            int i7 = x91.f51654n3;
            z91Var.N.B1(!w91Var.N.hidden, w91Var);
            z91Var.Z0(true, true);
            TLRPC.TL_forumTopic tL_forumTopic3 = w91Var.f50955c5;
            if (tL_forumTopic3 != null) {
                w91Var.setTopicIcon(tL_forumTopic3);
            }
        }
    }
}
