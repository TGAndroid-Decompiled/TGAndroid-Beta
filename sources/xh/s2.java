package xh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.e20;
import org.telegram.messenger.o00;
import org.telegram.messenger.w3;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.z60;
import org.telegram.ui.ox0;
public final class s2 implements View.OnClickListener {
    public final int f54053a = 1;
    public final int f54054b;
    public final org.telegram.ui.ActionBar.z2 f54055c;
    public final p6 d;
    public final long e;
    public final Context f54056f;
    public final TL_payments.connectedBotStarRef h;
    public final Object f54057n;

    public s2(int i10, org.telegram.ui.ActionBar.z2 z2Var, p6 p6Var, LinearLayout linearLayout, long j10, Context context, TL_payments.connectedBotStarRef connectedbotstarref) {
        this.f54054b = i10;
        this.f54055c = z2Var;
        this.d = p6Var;
        this.f54057n = linearLayout;
        this.e = j10;
        this.f54056f = context;
        this.h = connectedbotstarref;
    }

    @Override
    public final void onClick(View view) {
        long j10;
        boolean z10;
        switch (this.f54053a) {
            case 0:
                ox0 ox0Var = (ox0) this.f54057n;
                TL_payments.connectedBotStarRef connectedbotstarref = this.h;
                if (connectedbotstarref.revoked) {
                    int i10 = this.f54054b;
                    TLRPC.User Z1 = wp.r1(i10).Z1(Long.valueOf(connectedbotstarref.bot_id));
                    if (Z1 != null) {
                        wp.r1(i10).U2(Z1, 0, true, new q2(this.f54055c, this.f54056f, i10, this.e, this.d, 0));
                        return;
                    }
                    return;
                }
                ox0Var.run();
                return;
            default:
                LinearLayout linearLayout = (LinearLayout) this.f54057n;
                int i11 = this.f54054b;
                rh.r g10 = rh.r.g(i11);
                g10.n();
                g10.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g10.f47402j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g10.f47404l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, e20.i(i11).f());
                org.telegram.ui.ActionBar.z2 z2Var = this.f54055c;
                ViewGroup viewGroup = z2Var.f21587b;
                p6 p6Var = this.d;
                z60 F = z60.F(viewGroup, p6Var, linearLayout);
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    int i13 = i12 + 1;
                    TLObject tLObject = (TLObject) arrayList.get(i12);
                    if (tLObject instanceof TLRPC.User) {
                        j10 = ((TLRPC.User) tLObject).f19943id;
                    } else {
                        if (tLObject instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            if (w3.V(chat)) {
                                j10 = -chat.f19794id;
                            }
                        }
                        i12 = i13;
                    }
                    if (j10 == this.e) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    F.g(tLObject, z10, new o00(i11, j10, this.f54056f, this.h, z2Var, p6Var));
                    i12 = i13;
                }
                F.f33045t = false;
                F.f33044s = 0;
                F.V(5);
                F.a0(org.telegram.messenger.i0.L(24.0f), 0.0f);
                F.Z();
                return;
        }
    }

    public s2(TL_payments.connectedBotStarRef connectedbotstarref, int i10, org.telegram.ui.ActionBar.z2 z2Var, Context context, long j10, p6 p6Var, ox0 ox0Var) {
        this.h = connectedbotstarref;
        this.f54054b = i10;
        this.f54055c = z2Var;
        this.f54056f = context;
        this.e = j10;
        this.d = p6Var;
        this.f54057n = ox0Var;
    }
}
