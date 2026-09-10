package vh;

import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.xq0;
import s4.c1;
public final class i extends ul0 {
    public final p f43377c;

    public i(p pVar) {
        this.f43377c = pVar;
    }

    @Override
    public final boolean D(c1 c1Var) {
        if (c1Var.f41613f == 0) {
            return true;
        }
        return false;
    }

    public final void E(List list) {
        p pVar = this.f43377c;
        ArrayList arrayList = pVar.f43400c;
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
            s(!pVar.B ? 1 : 0, arrayList.size());
        } else {
            l();
        }
    }

    @Override
    public final int h() {
        p pVar = this.f43377c;
        int i10 = 1;
        return ((pVar.f43400c.isEmpty() || !pVar.f43417x) ? 0 : 0) + pVar.f43400c.size() + (!pVar.B ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        p pVar = this.f43377c;
        if (i10 == 0 && !pVar.B) {
            return 2;
        }
        if (i10 == h() - 1 && !pVar.f43400c.isEmpty() && pVar.f43417x) {
            return 4;
        }
        return 0;
    }

    @Override
    public final void v(c1 c1Var, int i10) {
        boolean z10;
        p pVar = this.f43377c;
        ArrayList arrayList = pVar.f43400c;
        int i11 = c1Var.f41613f;
        View view = c1Var.f41610a;
        if (i11 == 0) {
            g5 g5Var = (g5) view;
            int i12 = i10 - (!pVar.B ? 1 : 0);
            LongSparseArray longSparseArray = pVar.d;
            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(i12);
            if (i12 == arrayList.size() - 1 && !pVar.f43417x) {
                z10 = false;
            } else {
                z10 = true;
            }
            l5 l5Var = g5Var.d;
            g5Var.e = tL_chatInviteImporter;
            g5Var.f19199f = z10;
            g5Var.setWillNotDraw(!z10);
            TLRPC.User user = (TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id);
            g9 g9Var = g5Var.f19196a;
            g9Var.r(user);
            g5Var.f19197b.e(user, g9Var);
            g5Var.f19198c.l(UserObject.getUserName(user), false);
            String formatDateAudio = LocaleController.formatDateAudio(tL_chatInviteImporter.date, false);
            if (tL_chatInviteImporter.via_chatlist) {
                l5Var.l(LocaleController.getString(R.string.JoinedViaFolder), false);
                return;
            }
            long j3 = tL_chatInviteImporter.approved_by;
            if (j3 == 0) {
                l5Var.l(LocaleController.formatString("RequestedToJoinAt", R.string.RequestedToJoinAt, formatDateAudio), false);
                return;
            }
            TLRPC.User user2 = (TLRPC.User) longSparseArray.get(j3);
            if (user2 != null) {
                l5Var.l(LocaleController.formatString("AddedBy", R.string.AddedBy, UserObject.getFirstName(user2), formatDateAudio), false);
            } else {
                l5Var.l("", false);
            }
        } else if (i11 == 2) {
            view.requestLayout();
        }
    }

    @Override
    public final c1 x(ViewGroup viewGroup, int i10) {
        g5 g5Var;
        p pVar = this.f43377c;
        boolean z10 = pVar.f43398a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        g5Var = new g5(viewGroup.getContext(), pVar, z10);
                    } else {
                        p2 p2Var = pVar.f43402g;
                        xq0 xq0Var = new xq0(p2Var.getParentActivity(), 1, p2Var.getResourceProvider());
                        if (pVar.B) {
                            xq0Var.setBackgroundColor(j6.v0(j6.f17928d6, p2Var.getResourceProvider()));
                        }
                        xq0Var.f(j6.f17928d6, j6.f17872a7, -1);
                        xq0Var.setViewType(15);
                        xq0Var.setMemberRequestButton(z10);
                        xq0Var.setIsSingleCell(true);
                        xq0Var.setItemsCount(1);
                        xq0Var.setTag(-33024);
                        g5Var = xq0Var;
                    }
                } else {
                    g5Var = new View(viewGroup.getContext());
                }
            } else {
                h hVar = new h(viewGroup.getContext(), 0);
                hVar.setTag(-33024);
                g5Var = hVar;
            }
        } else {
            g5Var = new View(viewGroup.getContext());
        }
        return new c1(g5Var);
    }
}
