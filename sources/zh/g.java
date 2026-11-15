package zh;

import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import hi.q2;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.hd;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Cells.e5;
import org.telegram.ui.Components.t8;
import org.telegram.ui.Components.tj0;
import v4.e1;
public final class g extends tj0 {
    public final l f61424c;

    public g(l lVar) {
        this.f61424c = lVar;
    }

    @Override
    public final boolean D(e1 e1Var) {
        if (e1Var.f58539f == 0) {
            return true;
        }
        return false;
    }

    public final void E(List list) {
        l lVar = this.f61424c;
        ArrayList arrayList = lVar.f61444c;
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
        l lVar = this.f61424c;
        int i7 = 1;
        return ((lVar.f61444c.isEmpty() || !lVar.f61462x) ? 0 : 0) + lVar.f61444c.size() + (!lVar.B ? 1 : 0);
    }

    @Override
    public final int d(int i7) {
        l lVar = this.f61424c;
        if (i7 == 0 && !lVar.B) {
            return 2;
        }
        if (i7 == b() - 1 && !lVar.f61444c.isEmpty() && lVar.f61462x) {
            return 4;
        }
        return 0;
    }

    @Override
    public final void t(e1 e1Var, int i7) {
        boolean z10;
        l lVar = this.f61424c;
        ArrayList arrayList = lVar.f61444c;
        int i10 = e1Var.f58539f;
        View view = e1Var.f58535a;
        if (i10 == 0) {
            e5 e5Var = (e5) view;
            int i11 = i7 - (!lVar.B ? 1 : 0);
            LongSparseArray longSparseArray = lVar.d;
            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(i11);
            if (i11 == arrayList.size() - 1 && !lVar.f61462x) {
                z10 = false;
            } else {
                z10 = true;
            }
            j5 j5Var = e5Var.d;
            e5Var.f30179e = tL_chatInviteImporter;
            e5Var.f30180f = z10;
            e5Var.setWillNotDraw(!z10);
            TLRPC.User user = (TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id);
            t8 t8Var = e5Var.f30176a;
            t8Var.r(user);
            e5Var.f30177b.f(user, t8Var);
            e5Var.f30178c.l(q10.p(user), false);
            String s5 = hd.s(tL_chatInviteImporter.date, false);
            if (tL_chatInviteImporter.via_chatlist) {
                j5Var.l(hd.M0(2131749069, null), false);
                return;
            }
            long j3 = tL_chatInviteImporter.approved_by;
            if (j3 == 0) {
                j5Var.l(hd.a0("RequestedToJoinAt", null, 2131746160, s5), false);
                return;
            }
            TLRPC.User user2 = (TLRPC.User) longSparseArray.get(j3);
            if (user2 != null) {
                j5Var.l(hd.a0("AddedBy", null, 2131754361, q10.j(user2, true), s5), false);
            } else {
                j5Var.l("", false);
            }
        } else if (i10 == 2) {
            view.requestLayout();
        }
    }

    @Override
    public final e1 x(ViewGroup viewGroup, int i7) {
        e5 e5Var;
        l lVar = this.f61424c;
        boolean z10 = lVar.f61442a;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        e5Var = new e5(viewGroup.getContext(), lVar, z10);
                    } else {
                        e2 e2Var = lVar.f61447g;
                        q2 q2Var = new q2(2, e2Var.getParentActivity(), e2Var.getResourceProvider());
                        if (lVar.B) {
                            q6.h(j6.f28849d6, q2Var, e2Var.getResourceProvider());
                        }
                        q2Var.e(j6.f28849d6, j6.f28792a7, -1);
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
                f fVar = new f(viewGroup.getContext(), 0);
                fVar.setTag(-33024);
                e5Var = fVar;
            }
        } else {
            e5Var = new View(viewGroup.getContext());
        }
        return new e1(e5Var);
    }
}
