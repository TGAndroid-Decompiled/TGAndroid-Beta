package zh;

import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import gi.q2;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.bd;
import org.telegram.messenger.l10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.e5;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.u8;
import u4.d1;
import vg.g1;
public final class f extends sj0 {
    public final k f60562c;

    public f(k kVar) {
        this.f60562c = kVar;
    }

    @Override
    public final boolean D(d1 d1Var) {
        if (d1Var.f55544f == 0) {
            return true;
        }
        return false;
    }

    public final void E(List list) {
        k kVar = this.f60562c;
        ArrayList arrayList = kVar.f60582c;
        boolean isEmpty = arrayList.isEmpty();
        int i3 = 0;
        while (i3 < list.size()) {
            long j10 = ((TLRPC.TL_chatInviteImporter) list.get(i3)).user_id;
            int i10 = i3 + 1;
            while (true) {
                if (i10 >= list.size()) {
                    break;
                } else if (((TLRPC.TL_chatInviteImporter) list.get(i10)).user_id == j10) {
                    list.remove(i3);
                    i3--;
                    break;
                } else {
                    i10++;
                }
            }
            i3++;
        }
        arrayList.clear();
        arrayList.addAll(list);
        if (isEmpty) {
            o(!kVar.B ? 1 : 0, arrayList.size());
        } else {
            f();
        }
    }

    @Override
    public final int b() {
        k kVar = this.f60562c;
        int i3 = 1;
        return ((kVar.f60582c.isEmpty() || !kVar.f60600x) ? 0 : 0) + kVar.f60582c.size() + (!kVar.B ? 1 : 0);
    }

    @Override
    public final int d(int i3) {
        k kVar = this.f60562c;
        if (i3 == 0 && !kVar.B) {
            return 2;
        }
        if (i3 == b() - 1 && !kVar.f60582c.isEmpty() && kVar.f60600x) {
            return 4;
        }
        return 0;
    }

    @Override
    public final void t(d1 d1Var, int i3) {
        boolean z10;
        k kVar = this.f60562c;
        ArrayList arrayList = kVar.f60582c;
        int i10 = d1Var.f55544f;
        View view = d1Var.f55540a;
        if (i10 == 0) {
            e5 e5Var = (e5) view;
            int i11 = i3 - (!kVar.B ? 1 : 0);
            LongSparseArray longSparseArray = kVar.d;
            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(i11);
            if (i11 == arrayList.size() - 1 && !kVar.f60600x) {
                z10 = false;
            } else {
                z10 = true;
            }
            k5 k5Var = e5Var.d;
            e5Var.f29123e = tL_chatInviteImporter;
            e5Var.f29124f = z10;
            e5Var.setWillNotDraw(!z10);
            TLRPC.User user = (TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id);
            u8 u8Var = e5Var.f29120a;
            u8Var.r(user);
            e5Var.f29121b.e(user, u8Var);
            e5Var.f29122c.l(l10.p(user), false);
            String s6 = bd.s(tL_chatInviteImporter.date, false);
            if (tL_chatInviteImporter.via_chatlist) {
                k5Var.l(bd.M0(2131749077, null), false);
                return;
            }
            long j10 = tL_chatInviteImporter.approved_by;
            if (j10 == 0) {
                k5Var.l(bd.a0("RequestedToJoinAt", null, 2131746170, s6), false);
                return;
            }
            TLRPC.User user2 = (TLRPC.User) longSparseArray.get(j10);
            if (user2 != null) {
                k5Var.l(bd.a0("AddedBy", null, 2131754361, l10.j(user2, true), s6), false);
            } else {
                k5Var.l("", false);
            }
        } else if (i10 == 2) {
            view.requestLayout();
        }
    }

    @Override
    public final d1 x(ViewGroup viewGroup, int i3) {
        e5 e5Var;
        k kVar = this.f60562c;
        boolean z10 = kVar.f60580a;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        e5Var = new e5(viewGroup.getContext(), kVar, z10);
                    } else {
                        d2 d2Var = kVar.f60585g;
                        q2 q2Var = new q2(2, d2Var.getParentActivity(), d2Var.getResourceProvider());
                        if (kVar.B) {
                            r6.i(k6.f27878d6, q2Var, d2Var.getResourceProvider());
                        }
                        q2Var.e(k6.f27878d6, k6.f27824a7, -1);
                        q2Var.setViewType(15);
                        q2Var.setMemberRequestButton(z10);
                        q2Var.setIsSingleCell(true);
                        q2Var.setItemsCount(1);
                        q2Var.setTag(-33024);
                        e5Var = q2Var;
                    }
                } else {
                    e5Var = new View(viewGroup.getContext());
                }
            } else {
                g1 g1Var = new g1(viewGroup.getContext(), 1);
                g1Var.setTag(-33024);
                e5Var = g1Var;
            }
        } else {
            e5Var = new View(viewGroup.getContext());
        }
        return new d1(e5Var);
    }
}
