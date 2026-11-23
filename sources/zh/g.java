package zh;

import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import hi.q2;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.dk0;
import v4.f1;
public final class g extends dk0 {
    public final l f62036c;

    public g(l lVar) {
        this.f62036c = lVar;
    }

    @Override
    public final boolean D(f1 f1Var) {
        if (f1Var.f59169f == 0) {
            return true;
        }
        return false;
    }

    public final void E(List list) {
        l lVar = this.f62036c;
        ArrayList arrayList = lVar.f62056c;
        boolean isEmpty = arrayList.isEmpty();
        int i7 = 0;
        while (i7 < list.size()) {
            long j3 = ((TLRPC.TL_chatInviteImporter) list.get(i7)).user_id;
            int i10 = i7 + 1;
            while (true) {
                if (i10 >= list.size()) {
                    break;
                } else if (((TLRPC.TL_chatInviteImporter) list.get(i10)).user_id == j3) {
                    list.remove(i7);
                    i7--;
                    break;
                } else {
                    i10++;
                }
            }
            i7++;
        }
        arrayList.clear();
        arrayList.addAll(list);
        if (isEmpty) {
            o(!lVar.B ? 1 : 0, arrayList.size());
        } else {
            f();
        }
    }

    @Override
    public final int b() {
        l lVar = this.f62036c;
        int i7 = 1;
        return ((lVar.f62056c.isEmpty() || !lVar.f62074x) ? 0 : 0) + lVar.f62056c.size() + (!lVar.B ? 1 : 0);
    }

    @Override
    public final int d(int i7) {
        l lVar = this.f62036c;
        if (i7 == 0 && !lVar.B) {
            return 2;
        }
        if (i7 == b() - 1 && !lVar.f62056c.isEmpty() && lVar.f62074x) {
            return 4;
        }
        return 0;
    }

    @Override
    public final void t(f1 f1Var, int i7) {
        boolean z10;
        l lVar = this.f62036c;
        ArrayList arrayList = lVar.f62056c;
        int i10 = f1Var.f59169f;
        View view = f1Var.f59165a;
        if (i10 == 0) {
            g5 g5Var = (g5) view;
            int i11 = i7 - (!lVar.B ? 1 : 0);
            LongSparseArray longSparseArray = lVar.d;
            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(i11);
            if (i11 == arrayList.size() - 1 && !lVar.f62074x) {
                z10 = false;
            } else {
                z10 = true;
            }
            m5 m5Var = g5Var.d;
            g5Var.f30702e = tL_chatInviteImporter;
            g5Var.f30703f = z10;
            g5Var.setWillNotDraw(!z10);
            TLRPC.User user = (TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id);
            b9 b9Var = g5Var.f30699a;
            b9Var.r(user);
            g5Var.f30700b.f(user, b9Var);
            g5Var.f30701c.l(p10.q(user), false);
            String s5 = hd.s(tL_chatInviteImporter.date, false);
            if (tL_chatInviteImporter.via_chatlist) {
                m5Var.l(hd.N0(2131748876, null), false);
                return;
            }
            long j3 = tL_chatInviteImporter.approved_by;
            if (j3 == 0) {
                m5Var.l(hd.a0("RequestedToJoinAt", null, 2131745964, s5), false);
                return;
            }
            TLRPC.User user2 = (TLRPC.User) longSparseArray.get(j3);
            if (user2 != null) {
                m5Var.l(hd.a0("AddedBy", null, 2131754358, p10.k(user2, true), s5), false);
            } else {
                m5Var.l("", false);
            }
        } else if (i10 == 2) {
            view.requestLayout();
        }
    }

    @Override
    public final f1 x(ViewGroup viewGroup, int i7) {
        g5 g5Var;
        l lVar = this.f62036c;
        boolean z10 = lVar.f62054a;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        g5Var = new g5(viewGroup.getContext(), lVar, z10);
                    } else {
                        g2 g2Var = lVar.f62059g;
                        q2 q2Var = new q2(3, g2Var.getParentActivity(), g2Var.getResourceProvider());
                        if (lVar.B) {
                            t6.h(m6.f29381d6, q2Var, g2Var.getResourceProvider());
                        }
                        q2Var.e(m6.f29381d6, m6.f29324a7, -1);
                        q2Var.setViewType(15);
                        q2Var.setMemberRequestButton(z10);
                        q2Var.setIsSingleCell(true);
                        q2Var.setItemsCount(1);
                        q2Var.setTag(-33024);
                        g5Var = q2Var;
                    }
                } else {
                    g5Var = new View(viewGroup.getContext());
                }
            } else {
                f fVar = new f(viewGroup.getContext(), 0);
                fVar.setTag(-33024);
                g5Var = fVar;
            }
        } else {
            g5Var = new View(viewGroup.getContext());
        }
        return new f1(g5Var);
    }
}
