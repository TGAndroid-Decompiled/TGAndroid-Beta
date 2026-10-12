package zh;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class e5 {
    public final int f50440a;
    public final long f50441b;
    public boolean f50442c;
    public boolean d;
    public f5 f50444g;
    public boolean f50446j;
    public boolean f50447k;
    public final ArrayList e = new ArrayList();
    public final ArrayList f50443f = new ArrayList();
    public final HashMap h = new HashMap();
    public int f50445i = -1;

    public e5(int i10, long j10) {
        this.f50440a = i10;
        this.f50441b = j10;
        i();
    }

    public final void a(int i10, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        f5 e = e(i10);
        int i11 = 0;
        long j10 = this.f50441b;
        int i12 = this.f50440a;
        if (e != null) {
            e.f50509l.addAll(0, arrayList);
            e.f50511n = arrayList.size() + e.f50511n;
            NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(j10), e);
            n(i10);
        }
        TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
        updatestargiftcollection.peer = MessagesController.getInstance(i12).getInputPeer(j10);
        updatestargiftcollection.collection_id = i10;
        updatestargiftcollection.flags |= 4;
        int size = arrayList.size();
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
            l(savedStarGift, i10, true);
            if (savedStarGift.msg_id > 0) {
                TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
                tL_inputSavedStarGiftUser.msg_id = savedStarGift.msg_id;
                updatestargiftcollection.add_stargift.add(tL_inputSavedStarGiftUser);
            } else if (savedStarGift.saved_id != 0) {
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
                tL_inputSavedStarGiftChat.peer = MessagesController.getInstance(i12).getInputPeer(j10);
                tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
                updatestargiftcollection.add_stargift.add(tL_inputSavedStarGiftChat);
            } else {
                FileLog.w("can't convert gift to inputgift to add into the collection");
            }
        }
        ConnectionsManager.getInstance(i12).sendRequest(updatestargiftcollection, new c5(this, 1));
    }

    public final void b(String str, Utilities.Callback callback) {
        if (this.f50447k) {
            return;
        }
        this.f50447k = true;
        TL_stars.TL_starGiftCollection tL_starGiftCollection = new TL_stars.TL_starGiftCollection();
        tL_starGiftCollection.collection_id = -1;
        tL_starGiftCollection.title = str;
        this.e.add(tL_starGiftCollection);
        j();
        int i10 = this.f50440a;
        long j10 = this.f50441b;
        f5 f5Var = new f5(i10, j10, false);
        f5Var.f50503c = true;
        f5Var.d = -1;
        f5Var.f50511n = 0;
        f5Var.f50507j = true;
        this.h.put(-1, f5Var);
        TL_stars.createStarGiftCollection createstargiftcollection = new TL_stars.createStarGiftCollection();
        createstargiftcollection.peer = MessagesController.getInstance(i10).getInputPeer(j10);
        createstargiftcollection.title = str;
        ConnectionsManager.getInstance(i10).sendRequest(createstargiftcollection, new bi.f3(this, tL_starGiftCollection, f5Var, callback, 20));
    }

    public final TL_stars.TL_starGiftCollection c(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i11 < arrayList.size()) {
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) arrayList.get(i11);
                if (i10 == tL_starGiftCollection.collection_id) {
                    return tL_starGiftCollection;
                }
                i11++;
            } else {
                return null;
            }
        }
    }

    public final ArrayList d() {
        if (h()) {
            return this.e;
        }
        return this.f50443f;
    }

    public final f5 e(int i10) {
        return (f5) this.h.get(Integer.valueOf(i10));
    }

    public final int f(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i11 < arrayList.size()) {
                if (i10 == ((TL_stars.TL_starGiftCollection) arrayList.get(i11)).collection_id) {
                    return i11;
                }
                i11++;
            } else {
                return -1;
            }
        }
    }

    public final void g() {
        if (this.f50445i != -1) {
            ConnectionsManager.getInstance(this.f50440a).cancelRequest(this.f50445i, true);
            this.f50445i = -1;
        }
        this.f50442c = false;
        this.d = false;
        if (this.f50446j) {
            i();
        }
    }

    public final boolean h() {
        long j10 = this.f50441b;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i11 = this.f50440a;
        if (i10 >= 0) {
            if (j10 != 0 && j10 != UserConfig.getInstance(i11).getClientUserId()) {
                return false;
            }
            return true;
        }
        return ChatObject.canUserDoAction(MessagesController.getInstance(i11).getChat(Long.valueOf(-j10)), 5);
    }

    public final void i() {
        if (!this.f50442c && !this.d) {
            this.f50442c = true;
            TL_stars.getStarGiftCollections getstargiftcollections = new TL_stars.getStarGiftCollections();
            int i10 = this.f50440a;
            getstargiftcollections.peer = MessagesController.getInstance(i10).getInputPeer(this.f50441b);
            ArrayList arrayList = this.e;
            int size = arrayList.size();
            long j10 = 0;
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                j10 = MediaDataController.calcHash(j10, ((TL_stars.TL_starGiftCollection) obj).hash);
            }
            getstargiftcollections.hash = j10;
            this.f50445i = ConnectionsManager.getInstance(i10).sendRequest(getstargiftcollections, new c5(this, 0));
        }
    }

    public final void j() {
        ArrayList arrayList = this.f50443f;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i10 < arrayList2.size()) {
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) arrayList2.get(i10);
                if (tL_starGiftCollection.gifts_count > 0) {
                    arrayList.add(tL_starGiftCollection);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void k(int i10, TL_stars.SavedStarGift savedStarGift) {
        char c10;
        boolean z10;
        ArrayList arrayList = new ArrayList();
        arrayList.add(savedStarGift);
        if (arrayList.isEmpty()) {
            return;
        }
        f5 e = e(i10);
        char c11 = 1;
        boolean z11 = false;
        if (e != null) {
            ArrayList arrayList2 = e.f50509l;
            if (!arrayList2.isEmpty()) {
                int i11 = 0;
                while (i11 < arrayList2.size()) {
                    TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) arrayList2.get(i11);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList.size()) {
                            break;
                        } else if (n5.k(savedStarGift2, (TL_stars.SavedStarGift) arrayList.get(i12))) {
                            arrayList2.remove(i11);
                            e.f50511n = Math.max(0, e.f50511n - 1);
                            i11--;
                            break;
                        } else {
                            i12++;
                        }
                    }
                    i11++;
                }
            }
        }
        n(i10);
        TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
        int i13 = this.f50440a;
        MessagesController messagesController = MessagesController.getInstance(i13);
        long j10 = this.f50441b;
        updatestargiftcollection.peer = messagesController.getInputPeer(j10);
        updatestargiftcollection.collection_id = i10;
        updatestargiftcollection.flags |= 2;
        int size = arrayList.size();
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList.get(i14);
            i14++;
            TL_stars.SavedStarGift savedStarGift3 = (TL_stars.SavedStarGift) obj;
            l(savedStarGift3, i10, z11);
            if (savedStarGift3.msg_id > 0) {
                TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
                tL_inputSavedStarGiftUser.msg_id = savedStarGift3.msg_id;
                updatestargiftcollection.delete_stargift.add(tL_inputSavedStarGiftUser);
                c10 = c11;
                z10 = z11;
            } else if (savedStarGift3.saved_id != 0) {
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
                tL_inputSavedStarGiftChat.peer = MessagesController.getInstance(i13).getInputPeer(j10);
                c10 = c11;
                z10 = z11;
                tL_inputSavedStarGiftChat.saved_id = savedStarGift3.saved_id;
                updatestargiftcollection.delete_stargift.add(tL_inputSavedStarGiftChat);
            } else {
                c10 = c11;
                z10 = z11;
                FileLog.w("can't convert gift to inputgift to add into the collection");
            }
            c11 = c10;
            z11 = z10;
        }
        boolean z12 = z11;
        updatestargiftcollection.delete_stargift.size();
        ConnectionsManager.getInstance(i13).sendRequest(updatestargiftcollection, new c5(this, 2));
        NotificationCenter notificationCenter = NotificationCenter.getInstance(i13);
        int i15 = NotificationCenter.starUserGiftsLoaded;
        Object[] objArr = new Object[2];
        objArr[z12 ? 1 : 0] = Long.valueOf(j10);
        objArr[c11] = e;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i15, objArr);
    }

    public final void l(TL_stars.SavedStarGift savedStarGift, int i10, boolean z10) {
        for (f5 f5Var : this.h.values()) {
            f5Var.n(savedStarGift, i10, z10);
        }
        f5 f5Var2 = this.f50444g;
        if (f5Var2 != null) {
            f5Var2.n(savedStarGift, i10, z10);
        }
    }

    public final void m(TL_stars.SavedStarGift savedStarGift, boolean z10) {
        for (f5 f5Var : this.h.values()) {
            f5Var.o(savedStarGift, z10);
        }
        f5 f5Var2 = this.f50444g;
        if (f5Var2 != null) {
            f5Var2.o(savedStarGift, z10);
        }
    }

    public final void n(int i10) {
        TL_stars.SavedStarGift savedStarGift;
        f5 e = e(i10);
        TL_stars.TL_starGiftCollection c10 = c(i10);
        if (e != null) {
            ArrayList arrayList = e.f50509l;
            if (c10 != null) {
                if (arrayList.isEmpty()) {
                    savedStarGift = null;
                } else {
                    savedStarGift = (TL_stars.SavedStarGift) arrayList.get(0);
                }
                if (savedStarGift == null) {
                    c10.flags &= -2;
                    c10.icon = null;
                } else {
                    c10.flags |= 1;
                    c10.icon = savedStarGift.gift.getDocument();
                }
                NotificationCenter.getInstance(this.f50440a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(this.f50441b), this);
            }
        }
    }
}
