package tf;

import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
public final class i extends bg.b {
    public final TLRPC.Dialog f44807c;
    public final TLRPC.RecentMeUrl d;
    public final TLRPC.TL_contact e;
    public final boolean f44808f;
    public final boolean f44809g;
    public final boolean h;
    public final TL_chatlists.TL_chatlists_chatlistUpdates f44810i;
    public final int f44811j;
    public final int f44812k;
    public final String f44813l;
    public final TLRPC.Chat f44814m;
    public final TLRPC.User f44815n;

    public i(k kVar, TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates) {
        super(17, true);
        this.f44810i = tL_chatlists_chatlistUpdates;
        int i10 = kVar.T;
        kVar.T = i10 + 1;
        this.f44812k = i10;
    }

    public final int hashCode() {
        return Objects.hash(this.f44807c, this.f44814m, this.d, this.e, this.f44813l);
    }

    public i(k kVar, String str) {
        super(22, false);
        HashMap hashMap = kVar.V;
        Integer num = (Integer) hashMap.get(str);
        if (num != null) {
            this.f44812k = num.intValue();
        } else {
            int i10 = kVar.T;
            kVar.T = i10 + 1;
            this.f44812k = i10;
            hashMap.put(str, Integer.valueOf(i10));
        }
        this.f44813l = str;
    }

    public i(k kVar, TLRPC.User user) {
        super(23, false);
        this.f44815n = user;
        long j10 = user.f19306id;
        LongSparseIntArray longSparseIntArray = kVar.U;
        int i10 = longSparseIntArray.get(j10, -1);
        if (i10 >= 0) {
            this.f44812k = i10;
            return;
        }
        int i11 = kVar.T;
        kVar.T = i11 + 1;
        this.f44812k = i11;
        longSparseIntArray.put(user.f19306id, i11);
    }

    public i(k kVar, TLRPC.Chat chat) {
        super(23, false);
        this.f44814m = chat;
        long j10 = chat.f19159id;
        LongSparseIntArray longSparseIntArray = kVar.U;
        int i10 = longSparseIntArray.get(-j10, -1);
        if (i10 >= 0) {
            this.f44812k = i10;
            return;
        }
        int i11 = kVar.T;
        kVar.T = i11 + 1;
        this.f44812k = i11;
        longSparseIntArray.put(-chat.f19159id, i11);
    }

    public i(k kVar, int i10, TLRPC.Dialog dialog) {
        super(i10, true);
        LongSparseIntArray longSparseIntArray = kVar.U;
        boolean z4 = true;
        this.f44807c = dialog;
        if (dialog != null) {
            int i11 = longSparseIntArray.get(dialog.f19163id, -1);
            if (i11 >= 0) {
                this.f44812k = i11;
            } else {
                int i12 = kVar.T;
                kVar.T = i12 + 1;
                this.f44812k = i12;
                longSparseIntArray.put(dialog.f19163id, i12);
            }
        } else if (i10 == 19) {
            this.f44812k = 5;
        } else {
            int i13 = kVar.T;
            kVar.T = i13 + 1;
            this.f44812k = i13;
        }
        if (dialog != null) {
            int i14 = kVar.h;
            int i15 = kVar.C;
            if (i14 != 7 && i14 != 8) {
                this.f44809g = dialog.pinned;
            } else {
                MessagesController.DialogFilter dialogFilter = MessagesController.getInstance(i15).selectedDialogFilter[kVar.h == 8 ? (char) 1 : (char) 0];
                this.f44809g = (dialogFilter == null || dialogFilter.pinnedDialogs.indexOfKey(dialog.f19163id) < 0) ? false : false;
            }
            this.h = dialog.isFolder;
            this.f44808f = MessagesController.getInstance(i15).isForum(dialog.f19163id);
        }
    }

    public i(k kVar, TLRPC.RecentMeUrl recentMeUrl) {
        super(4, true);
        this.d = recentMeUrl;
        int i10 = kVar.T;
        kVar.T = i10 + 1;
        this.f44812k = i10;
    }

    public i(k kVar, int i10) {
        super(i10, true);
        this.f44811j = i10;
        if (i10 == 10) {
            this.f44812k = 1;
        } else if (i10 == 19) {
            this.f44812k = 5;
        } else {
            int i11 = kVar.T;
            kVar.T = i11 + 1;
            this.f44812k = i11;
        }
    }

    public i(k kVar, int i10, int i11) {
        super(5, true);
        this.f44811j = i10;
        int i12 = kVar.T;
        kVar.T = i12 + 1;
        this.f44812k = i12;
    }

    public i(k kVar, TLRPC.TL_contact tL_contact) {
        super(6, true);
        LongSparseIntArray longSparseIntArray = kVar.U;
        this.e = tL_contact;
        if (tL_contact != null) {
            int i10 = longSparseIntArray.get(tL_contact.user_id, -1);
            if (i10 > 0) {
                this.f44812k = i10;
                return;
            }
            int i11 = kVar.T;
            kVar.T = i11 + 1;
            this.f44812k = i11;
            longSparseIntArray.put(tL_contact.user_id, i11);
            return;
        }
        int i12 = kVar.T;
        kVar.T = i12 + 1;
        this.f44812k = i12;
    }
}
