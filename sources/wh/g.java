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
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.wq0;
import rg.j1;
import s4.d1;
public final class g extends rm0 {
    public final l f50498c;

    public g(l lVar) {
        this.f50498c = lVar;
    }

    @Override
    public final boolean D(d1 d1Var) {
        if (d1Var.f47752f == 0) {
            return true;
        }
        return false;
    }

    public final void E(List list) {
        l lVar = this.f50498c;
        ArrayList arrayList = lVar.f50518c;
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
        l lVar = this.f50498c;
        int i10 = 1;
        return ((lVar.f50518c.isEmpty() || !lVar.f50536x) ? 0 : 0) + lVar.f50518c.size() + (!lVar.B ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        l lVar = this.f50498c;
        if (i10 == 0 && !lVar.B) {
            return 2;
        }
        if (i10 == h() - 1 && !lVar.f50518c.isEmpty() && lVar.f50536x) {
            return 4;
        }
        return 0;
    }

    @Override
    public final void v(d1 d1Var, int i10) {
        boolean z10;
        l lVar = this.f50498c;
        ArrayList arrayList = lVar.f50518c;
        int i11 = d1Var.f47752f;
        View view = d1Var.f47748a;
        if (i11 == 0) {
            g5 g5Var = (g5) view;
            int i12 = i10 - (!lVar.B ? 1 : 0);
            LongSparseArray longSparseArray = lVar.d;
            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(i12);
            if (i12 == arrayList.size() - 1 && !lVar.f50536x) {
                z10 = false;
            } else {
                z10 = true;
            }
            h5 h5Var = g5Var.d;
            g5Var.f22128e = tL_chatInviteImporter;
            g5Var.f22129f = z10;
            g5Var.setWillNotDraw(!z10);
            TLRPC.User user = (TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id);
            j9 j9Var = g5Var.f22125a;
            j9Var.r(user);
            g5Var.f22126b.e(user, j9Var);
            g5Var.f22127c.l(UserObject.getUserName(user), false);
            String formatDateAudio = LocaleController.formatDateAudio(tL_chatInviteImporter.date, false);
            if (tL_chatInviteImporter.via_chatlist) {
                h5Var.l(LocaleController.getString(R.string.JoinedViaFolder), false);
                return;
            }
            long j3 = tL_chatInviteImporter.approved_by;
            if (j3 == 0) {
                h5Var.l(LocaleController.formatString("RequestedToJoinAt", R.string.RequestedToJoinAt, formatDateAudio), false);
                return;
            }
            TLRPC.User user2 = (TLRPC.User) longSparseArray.get(j3);
            if (user2 != null) {
                h5Var.l(LocaleController.formatString("AddedBy", R.string.AddedBy, UserObject.getFirstName(user2), formatDateAudio), false);
            } else {
                h5Var.l("", false);
            }
        } else if (i11 == 2) {
            view.requestLayout();
        }
    }

    @Override
    public final d1 x(ViewGroup viewGroup, int i10) {
        g5 g5Var;
        l lVar = this.f50498c;
        boolean z10 = lVar.f50516a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        g5Var = new g5(viewGroup.getContext(), lVar, z10);
                    } else {
                        m2 m2Var = lVar.f50521g;
                        wq0 wq0Var = new wq0(m2Var.getParentActivity(), 1, m2Var.getResourceProvider());
                        if (lVar.B) {
                            wq0Var.setBackgroundColor(h6.w0(h6.f20786d6, m2Var.getResourceProvider()));
                        }
                        wq0Var.f(h6.f20786d6, h6.f20730a7, -1);
                        wq0Var.setViewType(15);
                        wq0Var.setMemberRequestButton(z10);
                        wq0Var.setIsSingleCell(true);
                        wq0Var.setItemsCount(1);
                        wq0Var.setTag(-33024);
                        g5Var = wq0Var;
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
