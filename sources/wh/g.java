package wh;

import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.yq0;
import rg.i1;
import s4.c1;
public final class g extends vl0 {
    public final n f45341c;

    public g(n nVar) {
        this.f45341c = nVar;
    }

    @Override
    public final boolean D(c1 c1Var) {
        if (c1Var.f42932f == 0) {
            return true;
        }
        return false;
    }

    public final void E(List list) {
        n nVar = this.f45341c;
        ArrayList arrayList = nVar.f45364c;
        boolean isEmpty = arrayList.isEmpty();
        int i10 = 0;
        while (i10 < list.size()) {
            long j3 = ((TLRPC.TL_chatInviteImporter) list.get(i10)).user_id;
            int i11 = i10 + 1;
            while (true) {
                if (i11 >= list.size()) {
                    break;
                } else if (((TLRPC.TL_chatInviteImporter) list.get(i11)).user_id == j3) {
                    list.remove(i10);
                    i10--;
                    break;
                } else {
                    i11++;
                }
            }
            i10++;
        }
        arrayList.clear();
        arrayList.addAll(list);
        if (isEmpty) {
            s(!nVar.B ? 1 : 0, arrayList.size());
        } else {
            l();
        }
    }

    @Override
    public final int h() {
        n nVar = this.f45341c;
        int i10 = 1;
        return ((nVar.f45364c.isEmpty() || !nVar.f45381x) ? 0 : 0) + nVar.f45364c.size() + (!nVar.B ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        n nVar = this.f45341c;
        if (i10 == 0 && !nVar.B) {
            return 2;
        }
        if (i10 == h() - 1 && !nVar.f45364c.isEmpty() && nVar.f45381x) {
            return 4;
        }
        return 0;
    }

    @Override
    public final void v(c1 c1Var, int i10) {
        boolean z10;
        n nVar = this.f45341c;
        ArrayList arrayList = nVar.f45364c;
        int i11 = c1Var.f42932f;
        View view = c1Var.f42929a;
        if (i11 == 0) {
            g5 g5Var = (g5) view;
            int i12 = i10 - (!nVar.B ? 1 : 0);
            LongSparseArray longSparseArray = nVar.d;
            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(i12);
            if (i12 == arrayList.size() - 1 && !nVar.f45381x) {
                z10 = false;
            } else {
                z10 = true;
            }
            j5 j5Var = g5Var.d;
            g5Var.e = tL_chatInviteImporter;
            g5Var.f20312f = z10;
            g5Var.setWillNotDraw(!z10);
            TLRPC.User user = (TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id);
            h9 h9Var = g5Var.f20309a;
            h9Var.r(user);
            g5Var.f20310b.e(user, h9Var);
            g5Var.f20311c.l(UserObject.getUserName(user), false);
            String formatDateAudio = LocaleController.formatDateAudio(tL_chatInviteImporter.date, false);
            if (tL_chatInviteImporter.via_chatlist) {
                j5Var.l(LocaleController.getString(R.string.JoinedViaFolder), false);
                return;
            }
            long j3 = tL_chatInviteImporter.approved_by;
            if (j3 == 0) {
                j5Var.l(LocaleController.formatString("RequestedToJoinAt", R.string.RequestedToJoinAt, formatDateAudio), false);
                return;
            }
            TLRPC.User user2 = (TLRPC.User) longSparseArray.get(j3);
            if (user2 != null) {
                j5Var.l(LocaleController.formatString("AddedBy", R.string.AddedBy, UserObject.getFirstName(user2), formatDateAudio), false);
            } else {
                j5Var.l("", false);
            }
        } else if (i11 == 2) {
            view.requestLayout();
        }
    }

    @Override
    public final c1 x(ViewGroup viewGroup, int i10) {
        g5 g5Var;
        n nVar = this.f45341c;
        boolean z10 = nVar.f45362a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        g5Var = new g5(viewGroup.getContext(), nVar, z10);
                    } else {
                        n2 n2Var = nVar.f45366g;
                        yq0 yq0Var = new yq0(n2Var.getParentActivity(), 1, n2Var.getResourceProvider());
                        if (nVar.B) {
                            yq0Var.setBackgroundColor(j6.v0(j6.f19062d6, n2Var.getResourceProvider()));
                        }
                        yq0Var.f(j6.f19062d6, j6.f19006a7, -1);
                        yq0Var.setViewType(15);
                        yq0Var.setMemberRequestButton(z10);
                        yq0Var.setIsSingleCell(true);
                        yq0Var.setItemsCount(1);
                        yq0Var.setTag(-33024);
                        g5Var = yq0Var;
                    }
                } else {
                    g5Var = new View(viewGroup.getContext());
                }
            } else {
                i1 i1Var = new i1(viewGroup.getContext(), 1);
                i1Var.setTag(-33024);
                g5Var = i1Var;
            }
        } else {
            g5Var = new View(viewGroup.getContext());
        }
        return new c1(g5Var);
    }
}
