package rh;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.at;
import org.telegram.messenger.e20;
import org.telegram.messenger.r20;
import org.telegram.messenger.vi;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.mb;
public final class u5 {
    public final int f47552a;
    public final long f47553b;
    public boolean f47554c;
    public boolean d;
    public v5 f47556g;
    public boolean f47558j;
    public boolean f47559k;
    public final ArrayList e = new ArrayList();
    public final ArrayList f47555f = new ArrayList();
    public final HashMap h = new HashMap();
    public int f47557i = -1;

    public u5(int i10, long j10) {
        this.f47552a = i10;
        this.f47553b = j10;
        i();
    }

    public final void a(int i10, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        v5 e = e(i10);
        int i11 = 0;
        long j10 = this.f47553b;
        int i12 = this.f47552a;
        if (e != null) {
            e.f47596l.addAll(0, arrayList);
            e.f47598n = arrayList.size() + e.f47598n;
            at.f(i12).k(at.G3, Long.valueOf(j10), e);
            n(i10);
        }
        TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
        updatestargiftcollection.peer = wp.r1(i12).i1(j10);
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
                tL_inputSavedStarGiftChat.peer = wp.r1(i12).i1(j10);
                tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
                updatestargiftcollection.add_stargift.add(tL_inputSavedStarGiftChat);
            } else {
                org.telegram.messenger.f8.l("can't convert gift to inputgift to add into the collection");
            }
        }
        ConnectionsManager.getInstance(i12).sendRequest(updatestargiftcollection, new s5(this, 1));
    }

    public final void b(String str, r20 r20Var) {
        if (this.f47559k) {
            return;
        }
        this.f47559k = true;
        TL_stars.TL_starGiftCollection tL_starGiftCollection = new TL_stars.TL_starGiftCollection();
        tL_starGiftCollection.collection_id = -1;
        tL_starGiftCollection.title = str;
        this.e.add(tL_starGiftCollection);
        j();
        int i10 = this.f47552a;
        long j10 = this.f47553b;
        v5 v5Var = new v5(i10, j10, false);
        v5Var.f47590c = true;
        v5Var.d = -1;
        v5Var.f47598n = 0;
        v5Var.f47594j = true;
        this.h.put(-1, v5Var);
        TL_stars.createStarGiftCollection createstargiftcollection = new TL_stars.createStarGiftCollection();
        createstargiftcollection.peer = wp.r1(i10).i1(j10);
        createstargiftcollection.title = str;
        ConnectionsManager.getInstance(i10).sendRequest(createstargiftcollection, new mb(this, tL_starGiftCollection, v5Var, r20Var, 16));
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
        return this.f47555f;
    }

    public final v5 e(int i10) {
        return (v5) this.h.get(Integer.valueOf(i10));
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
        if (this.f47557i != -1) {
            ConnectionsManager.getInstance(this.f47552a).cancelRequest(this.f47557i, true);
            this.f47557i = -1;
        }
        this.f47554c = false;
        this.d = false;
        if (this.f47558j) {
            i();
        }
    }

    public final boolean h() {
        long j10 = this.f47553b;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        int i11 = this.f47552a;
        if (i10 >= 0) {
            if (i10 != 0 && j10 != e20.i(i11).e()) {
                return false;
            }
            return true;
        }
        return org.telegram.messenger.w3.w(5, wp.r1(i11).L0(Long.valueOf(-j10)));
    }

    public final void i() {
        if (!this.f47554c && !this.d) {
            this.f47554c = true;
            TL_stars.getStarGiftCollections getstargiftcollections = new TL_stars.getStarGiftCollections();
            int i10 = this.f47552a;
            getstargiftcollections.peer = wp.r1(i10).i1(this.f47553b);
            ArrayList arrayList = this.e;
            int size = arrayList.size();
            long j10 = 0;
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                j10 = vi.p(j10, ((TL_stars.TL_starGiftCollection) obj).hash);
            }
            getstargiftcollections.hash = j10;
            this.f47557i = ConnectionsManager.getInstance(i10).sendRequest(getstargiftcollections, new s5(this, 0));
        }
    }

    public final void j() {
        ArrayList arrayList = this.f47555f;
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
        v5 e = e(i10);
        char c11 = 1;
        boolean z11 = false;
        if (e != null) {
            ArrayList arrayList2 = e.f47596l;
            if (!arrayList2.isEmpty()) {
                int i11 = 0;
                while (i11 < arrayList2.size()) {
                    TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) arrayList2.get(i11);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList.size()) {
                            break;
                        } else if (e6.k(savedStarGift2, (TL_stars.SavedStarGift) arrayList.get(i12))) {
                            arrayList2.remove(i11);
                            e.f47598n = Math.max(0, e.f47598n - 1);
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
        int i13 = this.f47552a;
        wp r12 = wp.r1(i13);
        long j10 = this.f47553b;
        updatestargiftcollection.peer = r12.i1(j10);
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
                tL_inputSavedStarGiftChat.peer = wp.r1(i13).i1(j10);
                c10 = c11;
                z10 = z11;
                tL_inputSavedStarGiftChat.saved_id = savedStarGift3.saved_id;
                updatestargiftcollection.delete_stargift.add(tL_inputSavedStarGiftChat);
            } else {
                c10 = c11;
                z10 = z11;
                org.telegram.messenger.f8.l("can't convert gift to inputgift to add into the collection");
            }
            c11 = c10;
            z11 = z10;
        }
        char c12 = c11;
        updatestargiftcollection.delete_stargift.size();
        ConnectionsManager.getInstance(i13).sendRequest(updatestargiftcollection, new s5(this, 2));
        at f7 = at.f(i13);
        Object[] objArr = new Object[2];
        objArr[z11 ? 1 : 0] = Long.valueOf(j10);
        objArr[c12] = e;
        f7.k(at.G3, objArr);
    }

    public final void l(TL_stars.SavedStarGift savedStarGift, int i10, boolean z10) {
        for (v5 v5Var : this.h.values()) {
            v5Var.p(savedStarGift, i10, z10);
        }
        v5 v5Var2 = this.f47556g;
        if (v5Var2 != null) {
            v5Var2.p(savedStarGift, i10, z10);
        }
    }

    public final void m(TL_stars.SavedStarGift savedStarGift, boolean z10) {
        for (v5 v5Var : this.h.values()) {
            v5Var.q(savedStarGift, z10);
        }
        v5 v5Var2 = this.f47556g;
        if (v5Var2 != null) {
            v5Var2.q(savedStarGift, z10);
        }
    }

    public final void n(int i10) {
        TL_stars.SavedStarGift savedStarGift;
        v5 e = e(i10);
        TL_stars.TL_starGiftCollection c10 = c(i10);
        if (e != null) {
            ArrayList arrayList = e.f47596l;
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
                at.f(this.f47552a).k(at.H3, Long.valueOf(this.f47553b), this);
            }
        }
    }
}
