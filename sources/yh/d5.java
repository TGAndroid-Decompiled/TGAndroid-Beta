package yh;

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
public final class d5 {
    public final int f52472a;
    public final long f52473b;
    public boolean f52474c;
    public boolean d;
    public f5 f52477g;
    public boolean f52479j;
    public boolean f52480k;
    public final ArrayList f52475e = new ArrayList();
    public final ArrayList f52476f = new ArrayList();
    public final HashMap h = new HashMap();
    public int f52478i = -1;

    public d5(int i10, long j3) {
        this.f52472a = i10;
        this.f52473b = j3;
        i();
    }

    public final void a(int i10, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        f5 e7 = e(i10);
        int i11 = 0;
        long j3 = this.f52473b;
        int i12 = this.f52472a;
        if (e7 != null) {
            e7.f52606l.addAll(0, arrayList);
            e7.f52608n = arrayList.size() + e7.f52608n;
            NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(j3), e7);
            n(i10);
        }
        TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
        updatestargiftcollection.peer = MessagesController.getInstance(i12).getInputPeer(j3);
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
                tL_inputSavedStarGiftChat.peer = MessagesController.getInstance(i12).getInputPeer(j3);
                tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
                updatestargiftcollection.add_stargift.add(tL_inputSavedStarGiftChat);
            } else {
                FileLog.w("can't convert gift to inputgift to add into the collection");
            }
        }
        ConnectionsManager.getInstance(i12).sendRequest(updatestargiftcollection, new b5(this, 1));
    }

    public final void b(String str, Utilities.Callback callback) {
        if (this.f52480k) {
            return;
        }
        this.f52480k = true;
        TL_stars.TL_starGiftCollection tL_starGiftCollection = new TL_stars.TL_starGiftCollection();
        tL_starGiftCollection.collection_id = -1;
        tL_starGiftCollection.title = str;
        this.f52475e.add(tL_starGiftCollection);
        j();
        int i10 = this.f52472a;
        long j3 = this.f52473b;
        f5 f5Var = new f5(i10, j3, false);
        f5Var.f52599c = true;
        f5Var.d = -1;
        f5Var.f52608n = 0;
        f5Var.f52604j = true;
        this.h.put(-1, f5Var);
        TL_stars.createStarGiftCollection createstargiftcollection = new TL_stars.createStarGiftCollection();
        createstargiftcollection.peer = MessagesController.getInstance(i10).getInputPeer(j3);
        createstargiftcollection.title = str;
        ConnectionsManager.getInstance(i10).sendRequest(createstargiftcollection, new ai.q3(this, tL_starGiftCollection, f5Var, callback, 20));
    }

    public final TL_stars.TL_starGiftCollection c(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f52475e;
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
            return this.f52475e;
        }
        return this.f52476f;
    }

    public final f5 e(int i10) {
        return (f5) this.h.get(Integer.valueOf(i10));
    }

    public final int f(int i10) {
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f52475e;
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
        if (this.f52478i != -1) {
            ConnectionsManager.getInstance(this.f52472a).cancelRequest(this.f52478i, true);
            this.f52478i = -1;
        }
        this.f52474c = false;
        this.d = false;
        if (this.f52479j) {
            i();
        }
    }

    public final boolean h() {
        long j3 = this.f52473b;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        int i11 = this.f52472a;
        if (i10 >= 0) {
            if (j3 != 0 && j3 != UserConfig.getInstance(i11).getClientUserId()) {
                return false;
            }
            return true;
        }
        return ChatObject.canUserDoAction(MessagesController.getInstance(i11).getChat(Long.valueOf(-j3)), 5);
    }

    public final void i() {
        if (!this.f52474c && !this.d) {
            this.f52474c = true;
            TL_stars.getStarGiftCollections getstargiftcollections = new TL_stars.getStarGiftCollections();
            int i10 = this.f52472a;
            getstargiftcollections.peer = MessagesController.getInstance(i10).getInputPeer(this.f52473b);
            ArrayList arrayList = this.f52475e;
            int size = arrayList.size();
            long j3 = 0;
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                j3 = MediaDataController.calcHash(j3, ((TL_stars.TL_starGiftCollection) obj).hash);
            }
            getstargiftcollections.hash = j3;
            this.f52478i = ConnectionsManager.getInstance(i10).sendRequest(getstargiftcollections, new b5(this, 0));
        }
    }

    public final void j() {
        ArrayList arrayList = this.f52476f;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f52475e;
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
        f5 e7 = e(i10);
        char c11 = 1;
        boolean z11 = false;
        if (e7 != null) {
            ArrayList arrayList2 = e7.f52606l;
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
                            e7.f52608n = Math.max(0, e7.f52608n - 1);
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
        int i13 = this.f52472a;
        MessagesController messagesController = MessagesController.getInstance(i13);
        long j3 = this.f52473b;
        updatestargiftcollection.peer = messagesController.getInputPeer(j3);
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
                tL_inputSavedStarGiftChat.peer = MessagesController.getInstance(i13).getInputPeer(j3);
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
        ConnectionsManager.getInstance(i13).sendRequest(updatestargiftcollection, new b5(this, 2));
        NotificationCenter notificationCenter = NotificationCenter.getInstance(i13);
        int i15 = NotificationCenter.starUserGiftsLoaded;
        Object[] objArr = new Object[2];
        objArr[z12 ? 1 : 0] = Long.valueOf(j3);
        objArr[c11] = e7;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i15, objArr);
    }

    public final void l(TL_stars.SavedStarGift savedStarGift, int i10, boolean z10) {
        for (f5 f5Var : this.h.values()) {
            f5Var.n(savedStarGift, i10, z10);
        }
        f5 f5Var2 = this.f52477g;
        if (f5Var2 != null) {
            f5Var2.n(savedStarGift, i10, z10);
        }
    }

    public final void m(TL_stars.SavedStarGift savedStarGift, boolean z10) {
        for (f5 f5Var : this.h.values()) {
            f5Var.o(savedStarGift, z10);
        }
        f5 f5Var2 = this.f52477g;
        if (f5Var2 != null) {
            f5Var2.o(savedStarGift, z10);
        }
    }

    public final void n(int i10) {
        TL_stars.SavedStarGift savedStarGift;
        f5 e7 = e(i10);
        TL_stars.TL_starGiftCollection c10 = c(i10);
        if (e7 != null) {
            ArrayList arrayList = e7.f52606l;
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
                NotificationCenter.getInstance(this.f52472a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(this.f52473b), this);
            }
        }
    }
}
