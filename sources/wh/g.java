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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.xq0;
import rg.j1;
import s4.d1;
public final class g extends pm0 {
    public final l f50410c;

    public g(l lVar) {
        this.f50410c = lVar;
    }

    @Override
    public final boolean D(d1 d1Var) {
        if (d1Var.f47662f == 0) {
            return true;
        }
        return false;
    }

    public final void E(List list) {
        l lVar = this.f50410c;
        ArrayList arrayList = lVar.f50430c;
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
            s(!lVar.B ? 1 : 0, arrayList.size());
        } else {
            l();
        }
    }

    @Override
    public final int h() {
        l lVar = this.f50410c;
        int i10 = 1;
        return ((lVar.f50430c.isEmpty() || !lVar.f50448x) ? 0 : 0) + lVar.f50430c.size() + (!lVar.B ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        l lVar = this.f50410c;
        if (i10 == 0 && !lVar.B) {
            return 2;
        }
        if (i10 == h() - 1 && !lVar.f50430c.isEmpty() && lVar.f50448x) {
            return 4;
        }
        return 0;
    }

    @Override
    public final void v(d1 d1Var, int i10) {
        boolean z10;
        l lVar = this.f50410c;
        ArrayList arrayList = lVar.f50430c;
        int i11 = d1Var.f47662f;
        View view = d1Var.f47658a;
        if (i11 == 0) {
            g5 g5Var = (g5) view;
            int i12 = i10 - (!lVar.B ? 1 : 0);
            LongSparseArray longSparseArray = lVar.d;
            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(i12);
            if (i12 == arrayList.size() - 1 && !lVar.f50448x) {
                z10 = false;
            } else {
                z10 = true;
            }
            j5 j5Var = g5Var.d;
            g5Var.f22136e = tL_chatInviteImporter;
            g5Var.f22137f = z10;
            g5Var.setWillNotDraw(!z10);
            TLRPC.User user = (TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id);
            j9 j9Var = g5Var.f22133a;
            j9Var.r(user);
            g5Var.f22134b.e(user, j9Var);
            g5Var.f22135c.l(UserObject.getUserName(user), false);
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
    public final d1 x(ViewGroup viewGroup, int i10) {
        g5 g5Var;
        l lVar = this.f50410c;
        boolean z10 = lVar.f50428a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        g5Var = new g5(viewGroup.getContext(), lVar, z10);
                    } else {
                        n2 n2Var = lVar.f50433g;
                        xq0 xq0Var = new xq0(n2Var.getParentActivity(), 1, n2Var.getResourceProvider());
                        if (lVar.B) {
                            xq0Var.setBackgroundColor(i6.w0(i6.f20797d6, n2Var.getResourceProvider()));
                        }
                        xq0Var.f(i6.f20797d6, i6.f20741a7, -1);
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
                j1 j1Var = new j1(viewGroup.getContext(), 1);
                j1Var.setTag(-33024);
                g5Var = j1Var;
            }
        } else {
            g5Var = new View(viewGroup.getContext());
        }
        return new d1(g5Var);
    }
}
