package rf;

import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
public final class j extends zf.a {
    public final TLRPC.Dialog f47264c;
    public final TLRPC.RecentMeUrl d;
    public final TLRPC.TL_contact f47265e;
    public final boolean f47266f;
    public final boolean f47267g;
    public final boolean h;
    public final TL_chatlists.TL_chatlists_chatlistUpdates f47268i;
    public final int f47269j;
    public final int f47270k;
    public final String f47271l;
    public final TLRPC.Chat f47272m;
    public final TLRPC.User f47273n;

    public j(l lVar, TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates) {
        super(17, true);
        this.f47268i = tL_chatlists_chatlistUpdates;
        int i10 = lVar.S;
        lVar.S = i10 + 1;
        this.f47270k = i10;
    }

    public final int hashCode() {
        return Objects.hash(this.f47264c, this.f47272m, this.d, this.f47265e, this.f47271l);
    }

    public j(l lVar, String str) {
        super(22, false);
        HashMap hashMap = lVar.U;
        Integer num = (Integer) hashMap.get(str);
        if (num != null) {
            this.f47270k = num.intValue();
        } else {
            int i10 = lVar.S;
            lVar.S = i10 + 1;
            this.f47270k = i10;
            hashMap.put(str, Integer.valueOf(i10));
        }
        this.f47271l = str;
    }

    public j(l lVar, TLRPC.User user) {
        super(23, false);
        this.f47273n = user;
        long j10 = user.f22539id;
        LongSparseIntArray longSparseIntArray = lVar.T;
        int i10 = longSparseIntArray.get(j10, -1);
        if (i10 >= 0) {
            this.f47270k = i10;
            return;
        }
        int i11 = lVar.S;
        lVar.S = i11 + 1;
        this.f47270k = i11;
        longSparseIntArray.put(user.f22539id, i11);
    }

    public j(l lVar, TLRPC.Chat chat) {
        super(23, false);
        this.f47272m = chat;
        long j10 = chat.f22392id;
        LongSparseIntArray longSparseIntArray = lVar.T;
        int i10 = longSparseIntArray.get(-j10, -1);
        if (i10 >= 0) {
            this.f47270k = i10;
            return;
        }
        int i11 = lVar.S;
        lVar.S = i11 + 1;
        this.f47270k = i11;
        longSparseIntArray.put(-chat.f22392id, i11);
    }

    public j(l lVar, int i10, TLRPC.Dialog dialog) {
        super(i10, true);
        LongSparseIntArray longSparseIntArray = lVar.T;
        boolean z10 = true;
        this.f47264c = dialog;
        if (dialog != null) {
            int i11 = longSparseIntArray.get(dialog.f22396id, -1);
            if (i11 >= 0) {
                this.f47270k = i11;
            } else {
                int i12 = lVar.S;
                lVar.S = i12 + 1;
                this.f47270k = i12;
                longSparseIntArray.put(dialog.f22396id, i12);
            }
        } else if (i10 == 19) {
            this.f47270k = 5;
        } else {
            int i13 = lVar.S;
            lVar.S = i13 + 1;
            this.f47270k = i13;
        }
        if (dialog != null) {
            int i14 = lVar.h;
            int i15 = lVar.B;
            if (i14 != 7 && i14 != 8) {
                this.f47267g = dialog.pinned;
            } else {
                MessagesController.DialogFilter dialogFilter = MessagesController.getInstance(i15).selectedDialogFilter[lVar.h == 8 ? (char) 1 : (char) 0];
                this.f47267g = (dialogFilter == null || dialogFilter.pinnedDialogs.indexOfKey(dialog.f22396id) < 0) ? false : false;
            }
            this.h = dialog.isFolder;
            this.f47266f = MessagesController.getInstance(i15).isForum(dialog.f22396id);
        }
    }

    public j(l lVar, TLRPC.RecentMeUrl recentMeUrl) {
        super(4, true);
        this.d = recentMeUrl;
        int i10 = lVar.S;
        lVar.S = i10 + 1;
        this.f47270k = i10;
    }

    public j(l lVar, int i10) {
        super(i10, true);
        this.f47269j = i10;
        if (i10 == 10) {
            this.f47270k = 1;
        } else if (i10 == 19) {
            this.f47270k = 5;
        } else {
            int i11 = lVar.S;
            lVar.S = i11 + 1;
            this.f47270k = i11;
        }
    }

    public j(l lVar, int i10, int i11) {
        super(5, true);
        this.f47269j = i10;
        int i12 = lVar.S;
        lVar.S = i12 + 1;
        this.f47270k = i12;
    }

    public j(l lVar, TLRPC.TL_contact tL_contact) {
        super(6, true);
        LongSparseIntArray longSparseIntArray = lVar.T;
        this.f47265e = tL_contact;
        if (tL_contact != null) {
            int i10 = longSparseIntArray.get(tL_contact.user_id, -1);
            if (i10 > 0) {
                this.f47270k = i10;
                return;
            }
            int i11 = lVar.S;
            lVar.S = i11 + 1;
            this.f47270k = i11;
            longSparseIntArray.put(tL_contact.user_id, i11);
            return;
        }
        int i12 = lVar.S;
        lVar.S = i12 + 1;
        this.f47270k = i12;
    }
}
