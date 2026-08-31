package uf;

import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
public final class i extends cg.b {
    public final TLRPC.Dialog f48593c;
    public final TLRPC.RecentMeUrl d;
    public final TLRPC.TL_contact f48594e;
    public final boolean f48595f;
    public final boolean f48596g;
    public final boolean h;
    public final TL_chatlists.TL_chatlists_chatlistUpdates f48597i;
    public final int f48598j;
    public final int f48599k;
    public final String f48600l;
    public final TLRPC.Chat f48601m;
    public final TLRPC.User f48602n;

    public i(k kVar, TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates) {
        super(17, true);
        this.f48597i = tL_chatlists_chatlistUpdates;
        int i10 = kVar.T;
        kVar.T = i10 + 1;
        this.f48599k = i10;
    }

    public final int hashCode() {
        return Objects.hash(this.f48593c, this.f48601m, this.d, this.f48594e, this.f48600l);
    }

    public i(k kVar, String str) {
        super(22, false);
        HashMap hashMap = kVar.V;
        Integer num = (Integer) hashMap.get(str);
        if (num != null) {
            this.f48599k = num.intValue();
        } else {
            int i10 = kVar.T;
            kVar.T = i10 + 1;
            this.f48599k = i10;
            hashMap.put(str, Integer.valueOf(i10));
        }
        this.f48600l = str;
    }

    public i(k kVar, TLRPC.User user) {
        super(23, false);
        this.f48602n = user;
        long j10 = user.f20990id;
        LongSparseIntArray longSparseIntArray = kVar.U;
        int i10 = longSparseIntArray.get(j10, -1);
        if (i10 >= 0) {
            this.f48599k = i10;
            return;
        }
        int i11 = kVar.T;
        kVar.T = i11 + 1;
        this.f48599k = i11;
        longSparseIntArray.put(user.f20990id, i11);
    }

    public i(k kVar, TLRPC.Chat chat) {
        super(23, false);
        this.f48601m = chat;
        long j10 = chat.f20843id;
        LongSparseIntArray longSparseIntArray = kVar.U;
        int i10 = longSparseIntArray.get(-j10, -1);
        if (i10 >= 0) {
            this.f48599k = i10;
            return;
        }
        int i11 = kVar.T;
        kVar.T = i11 + 1;
        this.f48599k = i11;
        longSparseIntArray.put(-chat.f20843id, i11);
    }

    public i(k kVar, int i10, TLRPC.Dialog dialog) {
        super(i10, true);
        LongSparseIntArray longSparseIntArray = kVar.U;
        boolean z4 = true;
        this.f48593c = dialog;
        if (dialog != null) {
            int i11 = longSparseIntArray.get(dialog.f20847id, -1);
            if (i11 >= 0) {
                this.f48599k = i11;
            } else {
                int i12 = kVar.T;
                kVar.T = i12 + 1;
                this.f48599k = i12;
                longSparseIntArray.put(dialog.f20847id, i12);
            }
        } else if (i10 == 19) {
            this.f48599k = 5;
        } else {
            int i13 = kVar.T;
            kVar.T = i13 + 1;
            this.f48599k = i13;
        }
        if (dialog != null) {
            int i14 = kVar.h;
            int i15 = kVar.C;
            if (i14 != 7 && i14 != 8) {
                this.f48596g = dialog.pinned;
            } else {
                MessagesController.DialogFilter dialogFilter = MessagesController.getInstance(i15).selectedDialogFilter[kVar.h == 8 ? (char) 1 : (char) 0];
                this.f48596g = (dialogFilter == null || dialogFilter.pinnedDialogs.indexOfKey(dialog.f20847id) < 0) ? false : false;
            }
            this.h = dialog.isFolder;
            this.f48595f = MessagesController.getInstance(i15).isForum(dialog.f20847id);
        }
    }

    public i(k kVar, TLRPC.RecentMeUrl recentMeUrl) {
        super(4, true);
        this.d = recentMeUrl;
        int i10 = kVar.T;
        kVar.T = i10 + 1;
        this.f48599k = i10;
    }

    public i(k kVar, int i10) {
        super(i10, true);
        this.f48598j = i10;
        if (i10 == 10) {
            this.f48599k = 1;
        } else if (i10 == 19) {
            this.f48599k = 5;
        } else {
            int i11 = kVar.T;
            kVar.T = i11 + 1;
            this.f48599k = i11;
        }
    }

    public i(k kVar, int i10, int i11) {
        super(5, true);
        this.f48598j = i10;
        int i12 = kVar.T;
        kVar.T = i12 + 1;
        this.f48599k = i12;
    }

    public i(k kVar, TLRPC.TL_contact tL_contact) {
        super(6, true);
        LongSparseIntArray longSparseIntArray = kVar.U;
        this.f48594e = tL_contact;
        if (tL_contact != null) {
            int i10 = longSparseIntArray.get(tL_contact.user_id, -1);
            if (i10 > 0) {
                this.f48599k = i10;
                return;
            }
            int i11 = kVar.T;
            kVar.T = i11 + 1;
            this.f48599k = i11;
            longSparseIntArray.put(tL_contact.user_id, i11);
            return;
        }
        int i12 = kVar.T;
        kVar.T = i12 + 1;
        this.f48599k = i12;
    }
}
