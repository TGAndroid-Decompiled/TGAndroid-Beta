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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.f5;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.im0;
import org.telegram.ui.fq0;
import s4.b1;
import sg.k1;
public final class f extends im0 {
    public final k f49847c;

    public f(k kVar) {
        this.f49847c = kVar;
    }

    @Override
    public final boolean D(b1 b1Var) {
        if (b1Var.f45920f == 0) {
            return true;
        }
        return false;
    }

    public final void E(List list) {
        k kVar = this.f49847c;
        ArrayList arrayList = kVar.f49865c;
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
        k kVar = this.f49847c;
        int i10 = 1;
        return ((kVar.f49865c.isEmpty() || !kVar.f49882x) ? 0 : 0) + kVar.f49865c.size() + (!kVar.B ? 1 : 0);
    }

    @Override
    public final int j(int i10) {
        k kVar = this.f49847c;
        if (i10 == 0 && !kVar.B) {
            return 2;
        }
        if (i10 == h() - 1 && !kVar.f49865c.isEmpty() && kVar.f49882x) {
            return 4;
        }
        return 0;
    }

    @Override
    public final void v(b1 b1Var, int i10) {
        boolean z10;
        k kVar = this.f49847c;
        ArrayList arrayList = kVar.f49865c;
        int i11 = b1Var.f45920f;
        View view = b1Var.f45917a;
        if (i11 == 0) {
            f5 f5Var = (f5) view;
            int i12 = i10 - (!kVar.B ? 1 : 0);
            LongSparseArray longSparseArray = kVar.d;
            TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) arrayList.get(i12);
            if (i12 == arrayList.size() - 1 && !kVar.f49882x) {
                z10 = false;
            } else {
                z10 = true;
            }
            j5 j5Var = f5Var.d;
            f5Var.e = tL_chatInviteImporter;
            f5Var.f22249f = z10;
            f5Var.setWillNotDraw(!z10);
            TLRPC.User user = (TLRPC.User) longSparseArray.get(tL_chatInviteImporter.user_id);
            h9 h9Var = f5Var.f22246a;
            h9Var.r(user);
            f5Var.f22247b.e(user, h9Var);
            f5Var.f22248c.l(UserObject.getUserName(user), false);
            String formatDateAudio = LocaleController.formatDateAudio(tL_chatInviteImporter.date, false);
            if (tL_chatInviteImporter.via_chatlist) {
                j5Var.l(LocaleController.getString(R.string.JoinedViaFolder), false);
                return;
            }
            long j10 = tL_chatInviteImporter.approved_by;
            if (j10 == 0) {
                j5Var.l(LocaleController.formatString("RequestedToJoinAt", R.string.RequestedToJoinAt, formatDateAudio), false);
                return;
            }
            TLRPC.User user2 = (TLRPC.User) longSparseArray.get(j10);
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
    public final b1 x(ViewGroup viewGroup, int i10) {
        f5 f5Var;
        k kVar = this.f49847c;
        boolean z10 = kVar.f49863a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        f5Var = new f5(viewGroup.getContext(), kVar, z10);
                    } else {
                        n2 n2Var = kVar.f49867g;
                        fq0 fq0Var = new fq0(n2Var.getParentActivity(), 1, n2Var.getResourceProvider());
                        if (kVar.B) {
                            fq0Var.setBackgroundColor(h6.w0(h6.f20990d6, n2Var.getResourceProvider()));
                        }
                        fq0Var.f(h6.f20990d6, h6.f20932a7, -1);
                        fq0Var.setViewType(15);
                        fq0Var.setMemberRequestButton(z10);
                        fq0Var.setIsSingleCell(true);
                        fq0Var.setItemsCount(1);
                        fq0Var.setTag(-33024);
                        f5Var = fq0Var;
                    }
                } else {
                    f5Var = new View(viewGroup.getContext());
                }
            } else {
                k1 k1Var = new k1(viewGroup.getContext(), 1);
                k1Var.setTag(-33024);
                f5Var = k1Var;
            }
        } else {
            f5Var = new View(viewGroup.getContext());
        }
        return new b1(f5Var);
    }
}
