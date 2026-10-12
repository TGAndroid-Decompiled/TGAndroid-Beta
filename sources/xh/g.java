package xh;

import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.dr0;
import s4.b1;
import sg.k1;
public final class g extends lm0 {
    public final l f48459c;

    public g(l lVar) {
        this.f48459c = lVar;
    }

    @Override
    public final boolean D(b1 b1Var) {
        if (b1Var.f44841f == 0) {
            return true;
        }
        return false;
    }

    public final void E(List list) {
        l lVar = this.f48459c;
        ArrayList arrayList = lVar.f48477c;
        boolean isEmpty = arrayList.isEmpty();
        int i10 = 0;
        while (i10 < list.size()) {
            long j10 = ((TLRPC.TL_chatInviteImporter) list.get(i10)).user_id;
            int i11 = i10 + 1;
            while (true) {
                if (i11 >= list.size()) {
                    break;
                } else if (((TLRPC.TL_chatInviteImporter) list.get(i11)).user_id == j10) {
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
        l lVar = this.f48459c;
        int i10 = 1;
        return ((lVar.f48477c.isEmpty() || !lVar.f48494x) ? 0 : 0) + lVar.f48477c.size() + (!lVar.B ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        l lVar = this.f48459c;
        if (i10 == 0 && !lVar.B) {
            return 2;
        }
        if (i10 == h() - 1 && !lVar.f48477c.isEmpty() && lVar.f48494x) {
            return 4;
        }
        return 0;
    }

    @Override
    public final void v(b1 b1Var, int i10) {
        boolean z10;
        l lVar = this.f48459c;
        ArrayList arrayList = lVar.f48477c;
        int i11 = b1Var.f44841f;
        View view = b1Var.f44838a;
        if (i11 == 0) {
            g5 g5Var = (g5) view;
            int i12 = i10 - (!lVar.B ? 1 : 0);
            LongSparseArray longSparseArray = lVar.d;
            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(i12);
            if (i12 == arrayList.size() - 1 && !lVar.f48494x) {
                z10 = false;
            } else {
                z10 = true;
            }
            h5 h5Var = g5Var.d;
            g5Var.e = tL_chatInviteImporter;
            g5Var.f21218f = z10;
            g5Var.setWillNotDraw(!z10);
            TLRPC.User user = (TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id);
            k9 k9Var = g5Var.f21215a;
            k9Var.r(user);
            g5Var.f21216b.e(user, k9Var);
            g5Var.f21217c.l(UserObject.getUserName(user), false);
            String formatDateAudio = LocaleController.formatDateAudio(tL_chatInviteImporter.date, false);
            if (tL_chatInviteImporter.via_chatlist) {
                h5Var.l(LocaleController.getString(R.string.JoinedViaFolder), false);
                return;
            }
            long j10 = tL_chatInviteImporter.approved_by;
            if (j10 == 0) {
                h5Var.l(LocaleController.formatString("RequestedToJoinAt", R.string.RequestedToJoinAt, formatDateAudio), false);
                return;
            }
            TLRPC.User user2 = (TLRPC.User) longSparseArray.get(j10);
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
    public final b1 x(ViewGroup viewGroup, int i10) {
        g5 g5Var;
        l lVar = this.f48459c;
        boolean z10 = lVar.f48475a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        g5Var = new g5(viewGroup.getContext(), lVar, z10);
                    } else {
                        m2 m2Var = lVar.f48479g;
                        dr0 dr0Var = new dr0(m2Var.getParentActivity(), 1, m2Var.getResourceProvider());
                        if (lVar.B) {
                            dr0Var.setBackgroundColor(g6.w0(g6.f19901d6, m2Var.getResourceProvider()));
                        }
                        dr0Var.f(g6.f19901d6, g6.f19843a7, -1);
                        dr0Var.setViewType(15);
                        dr0Var.setMemberRequestButton(z10);
                        dr0Var.setIsSingleCell(true);
                        dr0Var.setItemsCount(1);
                        dr0Var.setTag(-33024);
                        g5Var = dr0Var;
                    }
                } else {
                    g5Var = new View(viewGroup.getContext());
                }
            } else {
                k1 k1Var = new k1(viewGroup.getContext(), 1);
                k1Var.setTag(-33024);
                g5Var = k1Var;
            }
        } else {
            g5Var = new View(viewGroup.getContext());
        }
        return new b1(g5Var);
    }
}
