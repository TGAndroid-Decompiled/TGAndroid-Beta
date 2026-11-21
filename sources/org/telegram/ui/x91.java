package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class x91 extends v4.w {
    public boolean d;
    public final y91 f53798e;

    public x91(y91 y91Var) {
        this.f53798e = y91Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, v4.f1 f1Var) {
        super.a(recyclerView, f1Var);
        f1Var.f59161a.setPressed(false);
    }

    @Override
    public final int e(RecyclerView recyclerView, v4.f1 f1Var) {
        y91 y91Var = this.f53798e;
        ArrayList arrayList = y91Var.f54098b;
        int l10 = v4.w.l(0, 0);
        int b10 = f1Var.b();
        if (b10 >= 0 && b10 < arrayList.size() && ((q91) arrayList.get(b10)).f51149c != null && org.telegram.messenger.v3.y(15, y91Var.g())) {
            TLRPC.TL_forumTopic tL_forumTopic = ((q91) arrayList.get(b10)).f51149c;
            if (y91Var.f54099b0.isEmpty()) {
                View view = f1Var.f59161a;
                if ((view instanceof v91) && tL_forumTopic.f28483id == 1) {
                    this.d = true;
                    ((v91) view).setSliding(true);
                    return v4.w.l(0, 4);
                }
            }
            if (tL_forumTopic.pinned) {
                return v4.w.l(3, 0);
            }
        }
        return l10;
    }

    @Override
    public final boolean k() {
        return !this.f53798e.f54099b0.isEmpty();
    }

    @Override
    public final boolean n(RecyclerView recyclerView, v4.f1 f1Var, v4.f1 f1Var2) {
        int b10;
        y91 y91Var = this.f53798e;
        ArrayList arrayList = y91Var.f54098b;
        if (f1Var.f59165f == f1Var2.f59165f && (b10 = f1Var2.b()) >= 0 && b10 < arrayList.size() && ((q91) arrayList.get(b10)).f51149c != null && ((q91) arrayList.get(b10)).f51149c.pinned) {
            p91 p91Var = y91Var.f54132r;
            int b11 = f1Var.b();
            int b12 = f1Var2.b();
            y91 y91Var2 = p91Var.d;
            ArrayList arrayList2 = y91Var2.f54098b;
            arrayList2.add(b12, (q91) arrayList2.remove(b11));
            v4.n0 itemAnimator = y91Var2.O.getItemAnimator();
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
    public final void p(v4.f1 f1Var, int i7) {
        y91 y91Var = this.f53798e;
        if (i7 == 0) {
            ArrayList arrayList = y91Var.f54098b;
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                TLRPC.TL_forumTopic tL_forumTopic = ((q91) arrayList.get(i10)).f51149c;
                if (tL_forumTopic != null && tL_forumTopic.pinned) {
                    arrayList2.add(Integer.valueOf(tL_forumTopic.f28483id));
                }
            }
            y91Var.getMessagesController().f25797t7.w(arrayList2, y91Var.f54095a);
            return;
        }
        y91Var.O.I0(false);
        f1Var.f59161a.setPressed(true);
    }

    @Override
    public final void q(v4.f1 f1Var) {
        if (f1Var != null) {
            v91 v91Var = (v91) f1Var.f59161a;
            TLRPC.TL_forumTopic tL_forumTopic = v91Var.O;
            y91 y91Var = this.f53798e;
            if (tL_forumTopic != null) {
                org.telegram.messenger.e00 e00Var = y91Var.getMessagesController().f25797t7;
                long j3 = y91Var.f54095a;
                TLRPC.TL_forumTopic tL_forumTopic2 = v91Var.O;
                e00Var.A(tL_forumTopic2.f28483id, j3, tL_forumTopic2.hidden);
            }
            y91Var.f54105d1 = v91Var;
            int i7 = w91.f53035o3;
            y91Var.O.B1(!v91Var.O.hidden, v91Var);
            y91Var.Z0(true, true);
            TLRPC.TL_forumTopic tL_forumTopic3 = v91Var.f52760d5;
            if (tL_forumTopic3 != null) {
                v91Var.setTopicIcon(tL_forumTopic3);
            }
        }
    }
}
