package zf;

import j$.util.Objects;
import java.util.HashMap;
import org.telegram.messenger.ap;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
public final class k extends hg.b {
    public final TLRPC.Dialog f55544c;
    public final TLRPC.RecentMeUrl d;
    public final TLRPC.TL_contact e;
    public final boolean f55545f;
    public final boolean f55546g;
    public final boolean h;
    public final TL_chatlists.TL_chatlists_chatlistUpdates f55547i;
    public final int f55548j;
    public final int f55549k;
    public final String f55550l;
    public final TLRPC.Chat f55551m;
    public final TLRPC.User f55552n;

    public k(m mVar, TL_chatlists.TL_chatlists_chatlistUpdates tL_chatlists_chatlistUpdates) {
        super(17, true);
        this.f55547i = tL_chatlists_chatlistUpdates;
        int i10 = mVar.W;
        mVar.W = i10 + 1;
        this.f55549k = i10;
    }

    public final int hashCode() {
        return Objects.hash(this.f55544c, this.f55551m, this.d, this.e, this.f55550l);
    }

    public k(m mVar, String str) {
        super(22, false);
        HashMap hashMap = mVar.Y;
        Integer num = (Integer) hashMap.get(str);
        if (num != null) {
            this.f55549k = num.intValue();
        } else {
            int i10 = mVar.W;
            mVar.W = i10 + 1;
            this.f55549k = i10;
            hashMap.put(str, Integer.valueOf(i10));
        }
        this.f55550l = str;
    }

    public k(m mVar, TLRPC.User user) {
        super(23, false);
        this.f55552n = user;
        long j10 = user.f19942id;
        LongSparseIntArray longSparseIntArray = mVar.X;
        int i10 = longSparseIntArray.get(j10, -1);
        if (i10 >= 0) {
            this.f55549k = i10;
            return;
        }
        int i11 = mVar.W;
        mVar.W = i11 + 1;
        this.f55549k = i11;
        longSparseIntArray.put(user.f19942id, i11);
    }

    public k(m mVar, TLRPC.Chat chat) {
        super(23, false);
        this.f55551m = chat;
        long j10 = chat.f19793id;
        LongSparseIntArray longSparseIntArray = mVar.X;
        int i10 = longSparseIntArray.get(-j10, -1);
        if (i10 >= 0) {
            this.f55549k = i10;
            return;
        }
        int i11 = mVar.W;
        mVar.W = i11 + 1;
        this.f55549k = i11;
        longSparseIntArray.put(-chat.f19793id, i11);
    }

    public k(m mVar, int i10, TLRPC.Dialog dialog) {
        super(i10, true);
        LongSparseIntArray longSparseIntArray = mVar.X;
        boolean z10 = true;
        this.f55544c = dialog;
        if (dialog != null) {
            int i11 = longSparseIntArray.get(dialog.f19797id, -1);
            if (i11 >= 0) {
                this.f55549k = i11;
            } else {
                int i12 = mVar.W;
                mVar.W = i12 + 1;
                this.f55549k = i12;
                longSparseIntArray.put(dialog.f19797id, i12);
            }
        } else if (i10 == 19) {
            this.f55549k = 5;
        } else {
            int i13 = mVar.W;
            mVar.W = i13 + 1;
            this.f55549k = i13;
        }
        if (dialog != null) {
            int i14 = mVar.h;
            int i15 = mVar.F;
            if (i14 != 7 && i14 != 8) {
                this.f55546g = dialog.pinned;
            } else {
                ap apVar = vp.r1(i15).M[mVar.h == 8 ? (char) 1 : (char) 0];
                this.f55546g = (apVar == null || apVar.f14651j.indexOfKey(dialog.f19797id) < 0) ? false : z10;
            }
            this.h = dialog.isFolder;
            this.f55545f = vp.r1(i15).s2(dialog.f19797id);
        }
    }

    public k(m mVar, TLRPC.RecentMeUrl recentMeUrl) {
        super(4, true);
        this.d = recentMeUrl;
        int i10 = mVar.W;
        mVar.W = i10 + 1;
        this.f55549k = i10;
    }

    public k(m mVar, int i10) {
        super(i10, true);
        this.f55548j = i10;
        if (i10 == 10) {
            this.f55549k = 1;
        } else if (i10 == 19) {
            this.f55549k = 5;
        } else {
            int i11 = mVar.W;
            mVar.W = i11 + 1;
            this.f55549k = i11;
        }
    }

    public k(m mVar, int i10, int i11) {
        super(5, true);
        this.f55548j = i10;
        int i12 = mVar.W;
        mVar.W = i12 + 1;
        this.f55549k = i12;
    }

    public k(m mVar, TLRPC.TL_contact tL_contact) {
        super(6, true);
        LongSparseIntArray longSparseIntArray = mVar.X;
        this.e = tL_contact;
        if (tL_contact != null) {
            int i10 = longSparseIntArray.get(tL_contact.user_id, -1);
            if (i10 > 0) {
                this.f55549k = i10;
                return;
            }
            int i11 = mVar.W;
            mVar.W = i11 + 1;
            this.f55549k = i11;
            longSparseIntArray.put(tL_contact.user_id, i11);
            return;
        }
        int i12 = mVar.W;
        mVar.W = i12 + 1;
        this.f55549k = i12;
    }
}
