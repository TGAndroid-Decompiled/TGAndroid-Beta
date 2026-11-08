package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class v91 extends v4.v {
    public boolean d;
    public final w91 f50619e;

    public v91(w91 w91Var) {
        this.f50619e = w91Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, v4.d1 d1Var) {
        super.a(recyclerView, d1Var);
        d1Var.f57044a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, v4.d1 d1Var) {
        w91 w91Var = this.f50619e;
        ArrayList arrayList = w91Var.f50995b;
        int l10 = v4.v.l(0, 0);
        int b10 = d1Var.b();
        if (b10 >= 0 && b10 < arrayList.size() && ((o91) arrayList.get(b10)).f48337c != null && org.telegram.messenger.t3.y(15, w91Var.g())) {
            TLRPC.TL_forumTopic tL_forumTopic = ((o91) arrayList.get(b10)).f48337c;
            if (w91Var.f50993a0.isEmpty()) {
                View view = d1Var.f57044a;
                if ((view instanceof t91) && tL_forumTopic.f27008id == 1) {
                    this.d = true;
                    ((t91) view).setSliding(true);
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
        return !this.f50619e.f50993a0.isEmpty();
    }

    @Override
    public final boolean n(RecyclerView recyclerView, v4.d1 d1Var, v4.d1 d1Var2) {
        int b10;
        w91 w91Var = this.f50619e;
        ArrayList arrayList = w91Var.f50995b;
        if (d1Var.f57048f == d1Var2.f57048f && (b10 = d1Var2.b()) >= 0 && b10 < arrayList.size() && ((o91) arrayList.get(b10)).f48337c != null && ((o91) arrayList.get(b10)).f48337c.pinned) {
            n91 n91Var = w91Var.f51028r;
            int b11 = d1Var.b();
            int b12 = d1Var2.b();
            w91 w91Var2 = n91Var.d;
            ArrayList arrayList2 = w91Var2.f50995b;
            arrayList2.add(b12, (o91) arrayList2.remove(b11));
            v4.l0 itemAnimator = w91Var2.N.getItemAnimator();
            l91 l91Var = w91Var2.I0;
            if (itemAnimator != l91Var) {
                w91Var2.N.setItemAnimator(l91Var);
            }
            n91Var.j(b11, b12);
            return true;
        }
        return false;
    }

    @Override
    public final void p(v4.d1 d1Var, int i7) {
        w91 w91Var = this.f50619e;
        if (i7 == 0) {
            ArrayList arrayList = w91Var.f50995b;
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TLRPC.TL_forumTopic tL_forumTopic = ((o91) arrayList.get(i10)).f48337c;
                if (tL_forumTopic != null && tL_forumTopic.pinned) {
                    arrayList2.add(Integer.valueOf(tL_forumTopic.f27008id));
                }
            }
            w91Var.getMessagesController().f24877q7.w(arrayList2, w91Var.f50992a);
            return;
        }
        w91Var.N.I0(false);
        d1Var.f57044a.setPressed(true);
    }

    @Override
    public final void q(v4.d1 d1Var) {
        if (d1Var != null) {
            t91 t91Var = (t91) d1Var.f57044a;
            TLRPC.TL_forumTopic tL_forumTopic = t91Var.N;
            w91 w91Var = this.f50619e;
            if (tL_forumTopic != null) {
                org.telegram.messenger.k00 k00Var = w91Var.getMessagesController().f24877q7;
                long j3 = w91Var.f50992a;
                TLRPC.TL_forumTopic tL_forumTopic2 = t91Var.N;
                k00Var.A(tL_forumTopic2.f27008id, j3, tL_forumTopic2.hidden);
            }
            w91Var.f51000c1 = t91Var;
            int i7 = u91.f50272n3;
            w91Var.N.B1(!t91Var.N.hidden, t91Var);
            w91Var.Z0(true, true);
            TLRPC.TL_forumTopic tL_forumTopic3 = t91Var.f49986c5;
            if (tL_forumTopic3 != null) {
                t91Var.setTopicIcon(tL_forumTopic3);
            }
        }
    }
}
