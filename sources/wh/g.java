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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.f5;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.yq0;
import rg.i1;
import s4.c1;
public final class g extends ll0 {
    public final n f45113c;

    public g(n nVar) {
        this.f45113c = nVar;
    }

    @Override
    public final boolean D(c1 c1Var) {
        if (c1Var.f42700f == 0) {
            return true;
        }
        return false;
    }

    public final void E(List list) {
        n nVar = this.f45113c;
        ArrayList arrayList = nVar.f45136c;
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
        n nVar = this.f45113c;
        int i10 = 1;
        return ((nVar.f45136c.isEmpty() || !nVar.f45153x) ? 0 : 0) + nVar.f45136c.size() + (!nVar.B ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        n nVar = this.f45113c;
        if (i10 == 0 && !nVar.B) {
            return 2;
        }
        if (i10 == h() - 1 && !nVar.f45136c.isEmpty() && nVar.f45153x) {
            return 4;
        }
        return 0;
    }

    @Override
    public final void v(c1 c1Var, int i10) {
        boolean z10;
        n nVar = this.f45113c;
        ArrayList arrayList = nVar.f45136c;
        int i11 = c1Var.f42700f;
        View view = c1Var.f42697a;
        if (i11 == 0) {
            f5 f5Var = (f5) view;
            int i12 = i10 - (!nVar.B ? 1 : 0);
            LongSparseArray longSparseArray = nVar.d;
            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(i12);
            if (i12 == arrayList.size() - 1 && !nVar.f45153x) {
                z10 = false;
            } else {
                z10 = true;
            }
            k5 k5Var = f5Var.d;
            f5Var.e = tL_chatInviteImporter;
            f5Var.f20094f = z10;
            f5Var.setWillNotDraw(!z10);
            TLRPC.User user = (TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id);
            f9 f9Var = f5Var.f20091a;
            f9Var.r(user);
            f5Var.f20092b.e(user, f9Var);
            f5Var.f20093c.l(UserObject.getUserName(user), false);
            String formatDateAudio = LocaleController.formatDateAudio(tL_chatInviteImporter.date, false);
            if (tL_chatInviteImporter.via_chatlist) {
                k5Var.l(LocaleController.getString(R.string.JoinedViaFolder), false);
                return;
            }
            long j3 = tL_chatInviteImporter.approved_by;
            if (j3 == 0) {
                k5Var.l(LocaleController.formatString("RequestedToJoinAt", R.string.RequestedToJoinAt, formatDateAudio), false);
                return;
            }
            TLRPC.User user2 = (TLRPC.User) longSparseArray.get(j3);
            if (user2 != null) {
                k5Var.l(LocaleController.formatString("AddedBy", R.string.AddedBy, UserObject.getFirstName(user2), formatDateAudio), false);
            } else {
                k5Var.l("", false);
            }
        } else if (i11 == 2) {
            view.requestLayout();
        }
    }

    @Override
    public final c1 x(ViewGroup viewGroup, int i10) {
        f5 f5Var;
        n nVar = this.f45113c;
        boolean z10 = nVar.f45134a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        f5Var = new f5(viewGroup.getContext(), nVar, z10);
                    } else {
                        o2 o2Var = nVar.f45138g;
                        yq0 yq0Var = new yq0(o2Var.getParentActivity(), 1, o2Var.getResourceProvider());
                        if (nVar.B) {
                            yq0Var.setBackgroundColor(j6.v0(j6.f18862d6, o2Var.getResourceProvider()));
                        }
                        yq0Var.f(j6.f18862d6, j6.f18806a7, -1);
                        yq0Var.setViewType(15);
                        yq0Var.setMemberRequestButton(z10);
                        yq0Var.setIsSingleCell(true);
                        yq0Var.setItemsCount(1);
                        yq0Var.setTag(-33024);
                        f5Var = yq0Var;
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
