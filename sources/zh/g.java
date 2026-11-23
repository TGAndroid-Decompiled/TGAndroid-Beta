package zh;

import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import hi.z2;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.f5;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.dk0;
import v4.f1;
public final class g extends dk0 {
    public final l f62119c;

    public g(l lVar) {
        this.f62119c = lVar;
    }

    @Override
    public final boolean D(f1 f1Var) {
        if (f1Var.f59249f == 0) {
            return true;
        }
        return false;
    }

    public final void E(List list) {
        l lVar = this.f62119c;
        ArrayList arrayList = lVar.f62139c;
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
        l lVar = this.f62119c;
        int i7 = 1;
        return ((lVar.f62139c.isEmpty() || !lVar.f62157x) ? 0 : 0) + lVar.f62139c.size() + (!lVar.B ? 1 : 0);
    }

    @Override
    public final int d(int i7) {
        l lVar = this.f62119c;
        if (i7 == 0 && !lVar.B) {
            return 2;
        }
        if (i7 == b() - 1 && !lVar.f62139c.isEmpty() && lVar.f62157x) {
            return 4;
        }
        return 0;
    }

    @Override
    public final void t(f1 f1Var, int i7) {
        boolean z10;
        l lVar = this.f62119c;
        ArrayList arrayList = lVar.f62139c;
        int i10 = f1Var.f59249f;
        View view = f1Var.f59245a;
        if (i10 == 0) {
            f5 f5Var = (f5) view;
            int i11 = i7 - (!lVar.B ? 1 : 0);
            LongSparseArray longSparseArray = lVar.d;
            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(i11);
            if (i11 == arrayList.size() - 1 && !lVar.f62157x) {
                z10 = false;
            } else {
                z10 = true;
            }
            n5 n5Var = f5Var.d;
            f5Var.f30699e = tL_chatInviteImporter;
            f5Var.f30700f = z10;
            f5Var.setWillNotDraw(!z10);
            TLRPC.User user = (TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id);
            a9 a9Var = f5Var.f30696a;
            a9Var.r(user);
            f5Var.f30697b.f(user, a9Var);
            f5Var.f30698c.l(n10.q(user), false);
            String s5 = gd.s(tL_chatInviteImporter.date, false);
            if (tL_chatInviteImporter.via_chatlist) {
                n5Var.l(gd.N0(2131748876, null), false);
                return;
            }
            long j3 = tL_chatInviteImporter.approved_by;
            if (j3 == 0) {
                n5Var.l(gd.a0("RequestedToJoinAt", null, 2131745964, s5), false);
                return;
            }
            TLRPC.User user2 = (TLRPC.User) longSparseArray.get(j3);
            if (user2 != null) {
                n5Var.l(gd.a0("AddedBy", null, 2131754358, n10.k(user2, true), s5), false);
            } else {
                n5Var.l("", false);
            }
        } else if (i10 == 2) {
            view.requestLayout();
        }
    }

    @Override
    public final f1 x(ViewGroup viewGroup, int i7) {
        f5 f5Var;
        l lVar = this.f62119c;
        boolean z10 = lVar.f62137a;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        f5Var = new f5(viewGroup.getContext(), lVar, z10);
                    } else {
                        g2 g2Var = lVar.f62142g;
                        z2 z2Var = new z2(3, g2Var.getParentActivity(), g2Var.getResourceProvider());
                        if (lVar.B) {
                            u6.h(n6.f29451d6, z2Var, g2Var.getResourceProvider());
                        }
                        z2Var.e(n6.f29451d6, n6.f29394a7, -1);
                        z2Var.setViewType(15);
                        z2Var.setMemberRequestButton(z10);
                        z2Var.setIsSingleCell(true);
                        z2Var.setItemsCount(1);
                        z2Var.setTag(-33024);
                        f5Var = z2Var;
                    }
                } else {
                    f5Var = new View(viewGroup.getContext());
                }
            } else {
                f fVar = new f(viewGroup.getContext(), 0);
                fVar.setTag(-33024);
                f5Var = fVar;
            }
        } else {
            f5Var = new View(viewGroup.getContext());
        }
        return new f1(f5Var);
    }
}
