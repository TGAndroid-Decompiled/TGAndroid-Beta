package yh;

import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import fi.s2;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.id;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.e5;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.w8;
import v4.d1;
public final class h extends oj0 {
    public final m f59525c;

    public h(m mVar) {
        this.f59525c = mVar;
    }

    @Override
    public final boolean D(d1 d1Var) {
        if (d1Var.f57048f == 0) {
            return true;
        }
        return false;
    }

    public final void E(List list) {
        m mVar = this.f59525c;
        ArrayList arrayList = mVar.f59545c;
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
            o(!mVar.B ? 1 : 0, arrayList.size());
        } else {
            f();
        }
    }

    @Override
    public final int b() {
        m mVar = this.f59525c;
        int i7 = 1;
        return ((mVar.f59545c.isEmpty() || !mVar.f59563x) ? 0 : 0) + mVar.f59545c.size() + (!mVar.B ? 1 : 0);
    }

    @Override
    public final int d(int i7) {
        m mVar = this.f59525c;
        if (i7 == 0 && !mVar.B) {
            return 2;
        }
        if (i7 == b() - 1 && !mVar.f59545c.isEmpty() && mVar.f59563x) {
            return 4;
        }
        return 0;
    }

    @Override
    public final void t(d1 d1Var, int i7) {
        boolean z9;
        m mVar = this.f59525c;
        ArrayList arrayList = mVar.f59545c;
        int i10 = d1Var.f57048f;
        View view = d1Var.f57044a;
        if (i10 == 0) {
            e5 e5Var = (e5) view;
            int i11 = i7 - (!mVar.B ? 1 : 0);
            LongSparseArray longSparseArray = mVar.d;
            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(i11);
            if (i11 == arrayList.size() - 1 && !mVar.f59563x) {
                z9 = false;
            } else {
                z9 = true;
            }
            k5 k5Var = e5Var.d;
            e5Var.f29065e = tL_chatInviteImporter;
            e5Var.f29066f = z9;
            e5Var.setWillNotDraw(!z9);
            TLRPC.User user = (TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id);
            w8 w8Var = e5Var.f29062a;
            w8Var.r(user);
            e5Var.f29063b.e(user, w8Var);
            e5Var.f29064c.l(t10.p(user), false);
            String s5 = id.s(tL_chatInviteImporter.date, false);
            if (tL_chatInviteImporter.via_chatlist) {
                k5Var.l(id.M0(2131749070, null), false);
                return;
            }
            long j3 = tL_chatInviteImporter.approved_by;
            if (j3 == 0) {
                k5Var.l(id.a0("RequestedToJoinAt", null, 2131746163, s5), false);
                return;
            }
            TLRPC.User user2 = (TLRPC.User) longSparseArray.get(j3);
            if (user2 != null) {
                k5Var.l(id.a0("AddedBy", null, 2131754361, t10.j(user2, true), s5), false);
            } else {
                k5Var.l("", false);
            }
        } else if (i10 == 2) {
            view.requestLayout();
        }
    }

    @Override
    public final d1 x(ViewGroup viewGroup, int i7) {
        e5 e5Var;
        m mVar = this.f59525c;
        boolean z9 = mVar.f59543a;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        e5Var = new e5(viewGroup.getContext(), mVar, z9);
                    } else {
                        f2 f2Var = mVar.f59548g;
                        s2 s2Var = new s2(2, f2Var.getParentActivity(), f2Var.getResourceProvider());
                        if (mVar.B) {
                            r6.i(k6.f27852d6, s2Var, f2Var.getResourceProvider());
                        }
                        s2Var.e(k6.f27852d6, k6.f27796a7, -1);
                        s2Var.setViewType(15);
                        s2Var.setMemberRequestButton(z9);
                        s2Var.setIsSingleCell(true);
                        s2Var.setItemsCount(1);
                        s2Var.setTag(-33024);
                        e5Var = s2Var;
                    }
                } else {
                    e5Var = new View(viewGroup.getContext());
                }
            } else {
                g gVar = new g(viewGroup.getContext(), 0);
                gVar.setTag(-33024);
                e5Var = gVar;
            }
        } else {
            e5Var = new View(viewGroup.getContext());
        }
        return new d1(e5Var);
    }
}
