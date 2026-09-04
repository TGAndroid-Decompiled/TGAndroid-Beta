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
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.f5;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.xq0;
import s4.c1;
import sg.m1;
public final class g extends kl0 {
    public final n f49418c;

    public g(n nVar) {
        this.f49418c = nVar;
    }

    @Override
    public final boolean D(c1 c1Var) {
        if (c1Var.f45742f == 0) {
            return true;
        }
        return false;
    }

    public final void E(List list) {
        n nVar = this.f49418c;
        ArrayList arrayList = nVar.f49444c;
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
        n nVar = this.f49418c;
        int i10 = 1;
        return ((nVar.f49444c.isEmpty() || !nVar.f49462x) ? 0 : 0) + nVar.f49444c.size() + (!nVar.B ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        n nVar = this.f49418c;
        if (i10 == 0 && !nVar.B) {
            return 2;
        }
        if (i10 == h() - 1 && !nVar.f49444c.isEmpty() && nVar.f49462x) {
            return 4;
        }
        return 0;
    }

    @Override
    public final void v(c1 c1Var, int i10) {
        boolean z10;
        n nVar = this.f49418c;
        ArrayList arrayList = nVar.f49444c;
        int i11 = c1Var.f45742f;
        View view = c1Var.f45738a;
        if (i11 == 0) {
            f5 f5Var = (f5) view;
            int i12 = i10 - (!nVar.B ? 1 : 0);
            LongSparseArray longSparseArray = nVar.d;
            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(i12);
            if (i12 == arrayList.size() - 1 && !nVar.f49462x) {
                z10 = false;
            } else {
                z10 = true;
            }
            j5 j5Var = f5Var.d;
            f5Var.f21922e = tL_chatInviteImporter;
            f5Var.f21923f = z10;
            f5Var.setWillNotDraw(!z10);
            TLRPC.User user = (TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id);
            i9 i9Var = f5Var.f21919a;
            i9Var.r(user);
            f5Var.f21920b.e(user, i9Var);
            f5Var.f21921c.l(UserObject.getUserName(user), false);
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
        f5 f5Var;
        n nVar = this.f49418c;
        boolean z10 = nVar.f49442a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        f5Var = new f5(viewGroup.getContext(), nVar, z10);
                    } else {
                        n2 n2Var = nVar.f49447g;
                        xq0 xq0Var = new xq0(n2Var.getParentActivity(), 1, n2Var.getResourceProvider());
                        if (nVar.B) {
                            xq0Var.setBackgroundColor(j6.v0(j6.f20663d6, n2Var.getResourceProvider()));
                        }
                        xq0Var.f(j6.f20663d6, j6.f20607a7, -1);
                        xq0Var.setViewType(15);
                        xq0Var.setMemberRequestButton(z10);
                        xq0Var.setIsSingleCell(true);
                        xq0Var.setItemsCount(1);
                        xq0Var.setTag(-33024);
                        f5Var = xq0Var;
                    }
                } else {
                    f5Var = new View(viewGroup.getContext());
                }
            } else {
                m1 m1Var = new m1(viewGroup.getContext(), 1);
                m1Var.setTag(-33024);
                f5Var = m1Var;
            }
        } else {
            f5Var = new View(viewGroup.getContext());
        }
        return new c1(f5Var);
    }
}
