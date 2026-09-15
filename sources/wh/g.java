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
import org.telegram.ui.Cells.f5;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.wq0;
import rg.i1;
import s4.c1;
public final class g extends kl0 {
    public final n f45090c;

    public g(n nVar) {
        this.f45090c = nVar;
    }

    @Override
    public final boolean D(c1 c1Var) {
        if (c1Var.f42678f == 0) {
            return true;
        }
        return false;
    }

    public final void E(List list) {
        n nVar = this.f45090c;
        ArrayList arrayList = nVar.f45113c;
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
        n nVar = this.f45090c;
        int i10 = 1;
        return ((nVar.f45113c.isEmpty() || !nVar.f45130x) ? 0 : 0) + nVar.f45113c.size() + (!nVar.B ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        n nVar = this.f45090c;
        if (i10 == 0 && !nVar.B) {
            return 2;
        }
        if (i10 == h() - 1 && !nVar.f45113c.isEmpty() && nVar.f45130x) {
            return 4;
        }
        return 0;
    }

    @Override
    public final void v(c1 c1Var, int i10) {
        boolean z10;
        n nVar = this.f45090c;
        ArrayList arrayList = nVar.f45113c;
        int i11 = c1Var.f42678f;
        View view = c1Var.f42675a;
        if (i11 == 0) {
            f5 f5Var = (f5) view;
            int i12 = i10 - (!nVar.B ? 1 : 0);
            LongSparseArray longSparseArray = nVar.d;
            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(i12);
            if (i12 == arrayList.size() - 1 && !nVar.f45130x) {
                z10 = false;
            } else {
                z10 = true;
            }
            j5 j5Var = f5Var.d;
            f5Var.e = tL_chatInviteImporter;
            f5Var.f20084f = z10;
            f5Var.setWillNotDraw(!z10);
            TLRPC.User user = (TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id);
            f9 f9Var = f5Var.f20081a;
            f9Var.r(user);
            f5Var.f20082b.e(user, f9Var);
            f5Var.f20083c.l(UserObject.getUserName(user), false);
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
        n nVar = this.f45090c;
        boolean z10 = nVar.f45111a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        f5Var = new f5(viewGroup.getContext(), nVar, z10);
                    } else {
                        n2 n2Var = nVar.f45115g;
                        wq0 wq0Var = new wq0(n2Var.getParentActivity(), 1, n2Var.getResourceProvider());
                        if (nVar.B) {
                            wq0Var.setBackgroundColor(i6.v0(i6.f18836d6, n2Var.getResourceProvider()));
                        }
                        wq0Var.f(i6.f18836d6, i6.f18780a7, -1);
                        wq0Var.setViewType(15);
                        wq0Var.setMemberRequestButton(z10);
                        wq0Var.setIsSingleCell(true);
                        wq0Var.setItemsCount(1);
                        wq0Var.setTag(-33024);
                        f5Var = wq0Var;
                    }
                } else {
                    f5Var = new View(viewGroup.getContext());
                }
            } else {
                i1 i1Var = new i1(viewGroup.getContext(), 1);
                i1Var.setTag(-33024);
                f5Var = i1Var;
            }
        } else {
            f5Var = new View(viewGroup.getContext());
        }
        return new c1(f5Var);
    }
}
