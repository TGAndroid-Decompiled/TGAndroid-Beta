package yh;

import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.k5;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.pq0;
import s4.e1;
import tg.k1;
public final class f extends mm0 {
    public final k f52652c;

    public f(k kVar) {
        this.f52652c = kVar;
    }

    @Override
    public final boolean D(e1 e1Var) {
        if (e1Var.f47776f == 0) {
            return true;
        }
        return false;
    }

    public final void E(List list) {
        k kVar = this.f52652c;
        ArrayList arrayList = kVar.f52670c;
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
            s(!kVar.B ? 1 : 0, arrayList.size());
        } else {
            l();
        }
    }

    @Override
    public final int h() {
        k kVar = this.f52652c;
        int i10 = 1;
        return ((kVar.f52670c.isEmpty() || !kVar.f52687x) ? 0 : 0) + kVar.f52670c.size() + (!kVar.B ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        k kVar = this.f52652c;
        if (i10 == 0 && !kVar.B) {
            return 2;
        }
        if (i10 == h() - 1 && !kVar.f52670c.isEmpty() && kVar.f52687x) {
            return 4;
        }
        return 0;
    }

    @Override
    public final void v(e1 e1Var, int i10) {
        boolean z10;
        k kVar = this.f52652c;
        ArrayList arrayList = kVar.f52670c;
        int i11 = e1Var.f47776f;
        View view = e1Var.f47773a;
        if (i11 == 0) {
            k5 k5Var = (k5) view;
            int i12 = i10 - (!kVar.B ? 1 : 0);
            LongSparseArray longSparseArray = kVar.d;
            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(i12);
            if (i12 == arrayList.size() - 1 && !kVar.f52687x) {
                z10 = false;
            } else {
                z10 = true;
            }
            b6 b6Var = k5Var.d;
            k5Var.e = tL_chatInviteImporter;
            k5Var.f24336f = z10;
            k5Var.setWillNotDraw(!z10);
            TLRPC.User user = (TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id);
            j9 j9Var = k5Var.f24333a;
            j9Var.r(user);
            k5Var.f24334b.f(user, j9Var);
            k5Var.f24335c.l(UserObject.getUserName(user), false);
            String formatDateAudio = LocaleController.formatDateAudio(tL_chatInviteImporter.date, false);
            if (tL_chatInviteImporter.via_chatlist) {
                b6Var.l(LocaleController.getString(R.string.JoinedViaFolder), false);
                return;
            }
            long j10 = tL_chatInviteImporter.approved_by;
            if (j10 == 0) {
                b6Var.l(LocaleController.formatString("RequestedToJoinAt", R.string.RequestedToJoinAt, formatDateAudio), false);
                return;
            }
            TLRPC.User user2 = (TLRPC.User) longSparseArray.get(j10);
            if (user2 != null) {
                b6Var.l(LocaleController.formatString("AddedBy", R.string.AddedBy, UserObject.getFirstName(user2), formatDateAudio), false);
            } else {
                b6Var.l("", false);
            }
        } else if (i11 == 2) {
            view.requestLayout();
        }
    }

    @Override
    public final e1 x(ViewGroup viewGroup, int i10) {
        k5 k5Var;
        k kVar = this.f52652c;
        boolean z10 = kVar.f52668a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        k5Var = new k5(viewGroup.getContext(), kVar, z10);
                    } else {
                        r2 r2Var = kVar.f52672g;
                        pq0 pq0Var = new pq0(r2Var.getParentActivity(), 1, r2Var.getResourceProvider());
                        if (kVar.B) {
                            f7.i(y6.f23357d6, pq0Var, r2Var.getResourceProvider());
                        }
                        pq0Var.e(y6.f23357d6, y6.f23300a7, -1);
                        pq0Var.setViewType(15);
                        pq0Var.setMemberRequestButton(z10);
                        pq0Var.setIsSingleCell(true);
                        pq0Var.setItemsCount(1);
                        pq0Var.setTag(-33024);
                        k5Var = pq0Var;
                    }
                } else {
                    k5Var = new View(viewGroup.getContext());
                }
            } else {
                k1 k1Var = new k1(viewGroup.getContext(), 1);
                k1Var.setTag(-33024);
                k5Var = k1Var;
            }
        } else {
            k5Var = new View(viewGroup.getContext());
        }
        return new e1(k5Var);
    }
}
