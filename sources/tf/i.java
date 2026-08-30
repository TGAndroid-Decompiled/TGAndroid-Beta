package tf;

import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
public final class i extends bg.b {
    public final TLRPC.Dialog f44746c;
    public final TLRPC.RecentMeUrl d;
    public final TLRPC.TL_contact e;
    public final boolean f44747f;
    public final boolean f44748g;
    public final boolean h;
    public final TL_chatlists.TL_chatlists_chatlistUpdates f44749i;
    public final int f44750j;
    public final int f44751k;
    public final String f44752l;
    public final TLRPC.Chat f44753m;
    public final TLRPC.User f44754n;

    public i(k kVar, TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates) {
        super(17, true);
        this.f44749i = tL_chatlists_chatlistUpdates;
        int i10 = kVar.T;
        kVar.T = i10 + 1;
        this.f44751k = i10;
    }

    public final int hashCode() {
        return Objects.hash(this.f44746c, this.f44753m, this.d, this.e, this.f44752l);
    }

    public i(k kVar, String str) {
        super(22, false);
        HashMap hashMap = kVar.V;
        Integer num = (Integer) hashMap.get(str);
        if (num != null) {
            this.f44751k = num.intValue();
        } else {
            int i10 = kVar.T;
            kVar.T = i10 + 1;
            this.f44751k = i10;
            hashMap.put(str, Integer.valueOf(i10));
        }
        this.f44752l = str;
    }

    public i(k kVar, TLRPC.User user) {
        super(23, false);
        this.f44754n = user;
        long j10 = user.f19331id;
        LongSparseIntArray longSparseIntArray = kVar.U;
        int i10 = longSparseIntArray.get(j10, -1);
        if (i10 >= 0) {
            this.f44751k = i10;
            return;
        }
        int i11 = kVar.T;
        kVar.T = i11 + 1;
        this.f44751k = i11;
        longSparseIntArray.put(user.f19331id, i11);
    }

    public i(k kVar, TLRPC.Chat chat) {
        super(23, false);
        this.f44753m = chat;
        long j10 = chat.f19184id;
        LongSparseIntArray longSparseIntArray = kVar.U;
        int i10 = longSparseIntArray.get(-j10, -1);
        if (i10 >= 0) {
            this.f44751k = i10;
            return;
        }
        int i11 = kVar.T;
        kVar.T = i11 + 1;
        this.f44751k = i11;
        longSparseIntArray.put(-chat.f19184id, i11);
    }

    public i(k kVar, int i10, TLRPC.Dialog dialog) {
        super(i10, true);
        LongSparseIntArray longSparseIntArray = kVar.U;
        boolean z4 = true;
        this.f44746c = dialog;
        if (dialog != null) {
            int i11 = longSparseIntArray.get(dialog.f19188id, -1);
            if (i11 >= 0) {
                this.f44751k = i11;
            } else {
                int i12 = kVar.T;
                kVar.T = i12 + 1;
                this.f44751k = i12;
                longSparseIntArray.put(dialog.f19188id, i12);
            }
        } else if (i10 == 19) {
            this.f44751k = 5;
        } else {
            int i13 = kVar.T;
            kVar.T = i13 + 1;
            this.f44751k = i13;
        }
        if (dialog != null) {
            int i14 = kVar.h;
            int i15 = kVar.C;
            if (i14 != 7 && i14 != 8) {
                this.f44748g = dialog.pinned;
            } else {
                MessagesController.DialogFilter dialogFilter = MessagesController.getInstance(i15).selectedDialogFilter[kVar.h == 8 ? (char) 1 : (char) 0];
                this.f44748g = (dialogFilter == null || dialogFilter.pinnedDialogs.indexOfKey(dialog.f19188id) < 0) ? false : false;
            }
            this.h = dialog.isFolder;
            this.f44747f = MessagesController.getInstance(i15).isForum(dialog.f19188id);
        }
    }

    public i(k kVar, TLRPC.RecentMeUrl recentMeUrl) {
        super(4, true);
        this.d = recentMeUrl;
        int i10 = kVar.T;
        kVar.T = i10 + 1;
        this.f44751k = i10;
    }

    public i(k kVar, int i10) {
        super(i10, true);
        this.f44750j = i10;
        if (i10 == 10) {
            this.f44751k = 1;
        } else if (i10 == 19) {
            this.f44751k = 5;
        } else {
            int i11 = kVar.T;
            kVar.T = i11 + 1;
            this.f44751k = i11;
        }
    }

    public i(k kVar, int i10, int i11) {
        super(5, true);
        this.f44750j = i10;
        int i12 = kVar.T;
        kVar.T = i12 + 1;
        this.f44751k = i12;
    }

    public i(k kVar, TLRPC.TL_contact tL_contact) {
        super(6, true);
        LongSparseIntArray longSparseIntArray = kVar.U;
        this.e = tL_contact;
        if (tL_contact != null) {
            int i10 = longSparseIntArray.get(tL_contact.user_id, -1);
            if (i10 > 0) {
                this.f44751k = i10;
                return;
            }
            int i11 = kVar.T;
            kVar.T = i11 + 1;
            this.f44751k = i11;
            longSparseIntArray.put(tL_contact.user_id, i11);
            return;
        }
        int i12 = kVar.T;
        kVar.T = i12 + 1;
        this.f44751k = i12;
    }
}
