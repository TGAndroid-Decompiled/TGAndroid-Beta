package xh;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.je;
public final class m5 implements Runnable {
    public final int f45716a = 0;
    public final boolean f45717b;
    public final Object f45718c;
    public final Object d;
    public final Object e;

    public m5(n5 n5Var, int[] iArr, TLObject tLObject, boolean z10) {
        this.f45718c = n5Var;
        this.d = iArr;
        this.e = tLObject;
        this.f45717b = z10;
    }

    @Override
    public final void run() {
        Boolean bool;
        boolean z10;
        int i10 = this.f45716a;
        boolean z11 = this.f45717b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f45718c;
        switch (i10) {
            case 0:
                n5 n5Var = (n5) obj3;
                TLObject tLObject = (TLObject) obj;
                ArrayList arrayList = n5Var.f45761l;
                int i11 = n5Var.f45753a;
                if (((int[]) obj2)[0] == n5Var.f45762m) {
                    n5Var.f45758i = false;
                    n5Var.f45762m = -1;
                    if (tLObject instanceof TL_stars.TL_payments_savedStarGifts) {
                        TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject;
                        MessagesController.getInstance(i11).putUsers(tL_payments_savedStarGifts.users, false);
                        MessagesController.getInstance(i11).putChats(tL_payments_savedStarGifts.chats, false);
                        if (z11) {
                            arrayList.clear();
                        }
                        arrayList.addAll(tL_payments_savedStarGifts.gifts);
                        n5Var.f45760k = tL_payments_savedStarGifts.next_offset;
                        n5Var.f45763n = tL_payments_savedStarGifts.count;
                        if ((tL_payments_savedStarGifts.flags & 2) != 0) {
                            bool = Boolean.valueOf(tL_payments_savedStarGifts.chat_notifications_enabled);
                        } else {
                            bool = null;
                        }
                        n5Var.h = bool;
                        if (arrayList.size() <= n5Var.f45763n && n5Var.f45760k != null) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        n5Var.f45759j = z10;
                    } else {
                        n5Var.f45759j = true;
                    }
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(n5Var.f45754b), n5Var);
                    return;
                }
                return;
            default:
                zh.e2 e2Var = (zh.e2) obj3;
                zh.a3 a3Var = e2Var.f48368a;
                org.telegram.ui.Components.d5.a0(a3Var.C2, 1, a3Var.B1, new je(e2Var, z11, (yg.p0) obj, (View) obj2));
                return;
        }
    }

    public m5(zh.e2 e2Var, View view, yg.p0 p0Var, boolean z10, boolean z11) {
        this.f45718c = e2Var;
        this.d = view;
        this.e = p0Var;
        this.f45717b = z10;
    }
}
