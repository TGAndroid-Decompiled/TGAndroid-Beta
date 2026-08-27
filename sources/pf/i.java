package pf;

import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;

public final class i extends xf.a {

    public final TLRPC.Dialog f45823c;
    public final TLRPC.RecentMeUrl d;

    public final TLRPC.TL_contact f45824e;

    public final boolean f45825f;

    public final boolean f45826g;
    public final boolean h;

    public final TL_chatlists.TL_chatlists_chatlistUpdates f45827i;

    public final int f45828j;

    public final int f45829k;

    public final String f45830l;

    public final TLRPC.Chat f45831m;

    public final TLRPC.User f45832n;

    public i(k kVar, TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates) {
        super(17, true);
        this.f45827i = tL_chatlists_chatlistUpdates;
        int i10 = kVar.S;
        kVar.S = i10 + 1;
        this.f45829k = i10;
    }

    public final int hashCode() {
        return Objects.hash(this.f45823c, this.f45831m, this.d, this.f45824e, this.f45830l);
    }

    public i(k kVar, String str) {
        super(22, false);
        HashMap map = kVar.U;
        Integer num = (Integer) map.get(str);
        if (num != null) {
            this.f45829k = num.intValue();
        } else {
            int i10 = kVar.S;
            kVar.S = i10 + 1;
            this.f45829k = i10;
            map.put(str, Integer.valueOf(i10));
        }
        this.f45830l = str;
    }

    public i(k kVar, TLRPC.User user) {
        super(23, false);
        this.f45832n = user;
        long j10 = user.f22527id;
        LongSparseIntArray longSparseIntArray = kVar.T;
        int i10 = longSparseIntArray.get(j10, -1);
        if (i10 >= 0) {
            this.f45829k = i10;
            return;
        }
        int i11 = kVar.S;
        kVar.S = i11 + 1;
        this.f45829k = i11;
        longSparseIntArray.put(user.f22527id, i11);
    }

    public i(k kVar, TLRPC.Chat chat) {
        super(23, false);
        this.f45831m = chat;
        long j10 = chat.f22380id;
        LongSparseIntArray longSparseIntArray = kVar.T;
        int i10 = longSparseIntArray.get(-j10, -1);
        if (i10 >= 0) {
            this.f45829k = i10;
            return;
        }
        int i11 = kVar.S;
        kVar.S = i11 + 1;
        this.f45829k = i11;
        longSparseIntArray.put(-chat.f22380id, i11);
    }

    public i(k kVar, int i10, TLRPC.Dialog dialog) {
        super(i10, true);
        LongSparseIntArray longSparseIntArray = kVar.T;
        this.f45823c = dialog;
        if (dialog != null) {
            int i11 = longSparseIntArray.get(dialog.f22384id, -1);
            if (i11 >= 0) {
                this.f45829k = i11;
            } else {
                int i12 = kVar.S;
                kVar.S = i12 + 1;
                this.f45829k = i12;
                longSparseIntArray.put(dialog.f22384id, i12);
            }
        } else if (i10 == 19) {
            this.f45829k = 5;
        } else {
            int i13 = kVar.S;
            kVar.S = i13 + 1;
            this.f45829k = i13;
        }
        if (dialog != null) {
            int i14 = kVar.h;
            int i15 = kVar.B;
            if (i14 != 7 && i14 != 8) {
                this.f45826g = dialog.pinned;
            } else {
                MessagesController.DialogFilter dialogFilter = MessagesController.getInstance(i15).selectedDialogFilter[kVar.h == 8 ? (char) 1 : (char) 0];
                this.f45826g = dialogFilter != null && dialogFilter.pinnedDialogs.indexOfKey(dialog.f22384id) >= 0;
            }
            this.h = dialog.isFolder;
            this.f45825f = MessagesController.getInstance(i15).isForum(dialog.f22384id);
        }
    }

    public i(k kVar, TLRPC.RecentMeUrl recentMeUrl) {
        super(4, true);
        this.d = recentMeUrl;
        int i10 = kVar.S;
        kVar.S = i10 + 1;
        this.f45829k = i10;
    }

    public i(k kVar, int i10) {
        super(i10, true);
        this.f45828j = i10;
        if (i10 == 10) {
            this.f45829k = 1;
        } else {
            if (i10 == 19) {
                this.f45829k = 5;
                return;
            }
            int i11 = kVar.S;
            kVar.S = i11 + 1;
            this.f45829k = i11;
        }
    }

    public i(k kVar, int i10, int i11) {
        super(5, true);
        this.f45828j = i10;
        int i12 = kVar.S;
        kVar.S = i12 + 1;
        this.f45829k = i12;
    }

    public i(k kVar, TLRPC.TL_contact tL_contact) {
        super(6, true);
        LongSparseIntArray longSparseIntArray = kVar.T;
        this.f45824e = tL_contact;
        if (tL_contact != null) {
            int i10 = longSparseIntArray.get(tL_contact.user_id, -1);
            if (i10 > 0) {
                this.f45829k = i10;
                return;
            }
            int i11 = kVar.S;
            kVar.S = i11 + 1;
            this.f45829k = i11;
            longSparseIntArray.put(tL_contact.user_id, i11);
            return;
        }
        int i12 = kVar.S;
        kVar.S = i12 + 1;
        this.f45829k = i12;
    }
}
