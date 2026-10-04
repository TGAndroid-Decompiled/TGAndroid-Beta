package yh;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.gb1;
public final class k5 implements l5 {
    public final int f51518a;
    public final long f51519b;
    public int d;
    public Boolean h;
    public boolean f51524i;
    public boolean f51525j;
    public String f51526k;
    public int f51529n;
    public boolean f51530o;
    public ArrayList f51532q;
    public boolean f51520c = false;
    public boolean f51521e = true;
    public boolean f51522f = false;
    public int f51523g = 783;
    public final ArrayList f51527l = new ArrayList();
    public int f51528m = -1;
    public long f51531p = 0;

    public k5(int i10, long j3, boolean z10) {
        this.f51518a = i10;
        this.f51519b = j3;
        if (z10) {
            a();
        }
    }

    @Override
    public final void a() {
        boolean z10;
        TL_stars.getSavedStarGifts getsavedstargifts;
        if (!this.f51524i && !this.f51525j) {
            if (this.f51526k == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f51524i = true;
            long j3 = this.f51531p;
            int i10 = 30;
            String str = "";
            int i11 = this.f51518a;
            if (j3 != 0) {
                TL_stars.getCraftStarGifts getcraftstargifts = new TL_stars.getCraftStarGifts();
                getcraftstargifts.gift_id = this.f51531p;
                if (!z10) {
                    str = this.f51526k;
                }
                getcraftstargifts.offset = str;
                if (z10) {
                    i10 = 15;
                }
                getcraftstargifts.limit = i10;
                getsavedstargifts = getcraftstargifts;
            } else {
                TL_stars.getSavedStarGifts getsavedstargifts2 = new TL_stars.getSavedStarGifts();
                getsavedstargifts2.sort_by_value = !this.f51521e;
                getsavedstargifts2.exclude_unupgradable = !TLObject.hasFlag(this.f51523g, 2);
                getsavedstargifts2.exclude_upgradable = !TLObject.hasFlag(this.f51523g, 4);
                getsavedstargifts2.exclude_unlimited = !TLObject.hasFlag(this.f51523g, 1);
                getsavedstargifts2.exclude_unique = !TLObject.hasFlag(this.f51523g, 8);
                getsavedstargifts2.exclude_saved = !TLObject.hasFlag(this.f51523g, 256);
                getsavedstargifts2.exclude_unsaved = !TLObject.hasFlag(this.f51523g, 512);
                getsavedstargifts2.peer_color_available = this.f51522f;
                long j10 = this.f51519b;
                if (j10 == 0) {
                    getsavedstargifts2.peer = new TLRPC.TL_inputPeerSelf();
                } else {
                    getsavedstargifts2.peer = MessagesController.getInstance(i11).getInputPeer(j10);
                }
                if (!z10) {
                    str = this.f51526k;
                }
                getsavedstargifts2.offset = str;
                if (z10) {
                    i10 = Math.max(MessagesController.getInstance(i11).stargiftsPinnedToTopLimit, 15);
                }
                getsavedstargifts2.limit = i10;
                getsavedstargifts = getsavedstargifts2;
                if (this.f51520c) {
                    getsavedstargifts2.flags |= 64;
                    getsavedstargifts2.collection_id = this.d;
                    getsavedstargifts = getsavedstargifts2;
                }
            }
            int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(getsavedstargifts, new ci.v1(this, r2, z10, 8));
            this.f51528m = sendRequest;
            int[] iArr = {sendRequest};
        }
    }

    @Override
    public final int b(int i10) {
        if (!x3.O1(this.f51518a, this.f51519b)) {
            return -1;
        }
        int i11 = i10 + 1;
        while (true) {
            ArrayList arrayList = this.f51527l;
            if (i11 < arrayList.size()) {
                if (((TL_stars.SavedStarGift) arrayList.get(i11)).can_upgrade) {
                    return i11;
                }
                i11++;
            } else {
                for (int i12 = i10 - 1; i12 >= 0; i12--) {
                    if (((TL_stars.SavedStarGift) arrayList.get(i12)).can_upgrade) {
                        return i12;
                    }
                }
                return -1;
            }
        }
    }

    @Override
    public final int c() {
        return this.f51529n;
    }

    @Override
    public final void d() {
        NotificationCenter.getInstance(this.f51518a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.f51519b), this);
    }

    @Override
    public final int e() {
        return this.f51527l.size();
    }

    public final void f(int i10, boolean z10) {
        int i11;
        if ((i10 & 15) != 0) {
            i11 = 15;
        } else if ((i10 & 768) != 0) {
            i11 = 768;
        } else {
            i11 = 0;
        }
        int i12 = this.f51523g;
        int i13 = i10 | ((~i11) & i12);
        if (i12 != i13) {
            this.f51523g = i13;
            if (z10) {
                i(true);
            }
        }
    }

    public final TL_stars.InputSavedStarGift g(TL_stars.SavedStarGift savedStarGift) {
        if (savedStarGift == null) {
            return null;
        }
        if ((savedStarGift.flags & 8) != 0) {
            TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
            tL_inputSavedStarGiftUser.msg_id = savedStarGift.msg_id;
            return tL_inputSavedStarGiftUser;
        }
        TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
        tL_inputSavedStarGiftChat.peer = MessagesController.getInstance(this.f51518a).getInputPeer(this.f51519b);
        tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
        return tL_inputSavedStarGiftChat;
    }

    @Override
    public final Object get(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f51527l;
            if (i10 < arrayList.size()) {
                return arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    public final ArrayList h() {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f51527l;
            if (i10 < arrayList2.size()) {
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList2.get(i10);
                if (savedStarGift.pinned_to_top && !savedStarGift.unsaved) {
                    arrayList.add(savedStarGift);
                }
                i10++;
            } else {
                return arrayList;
            }
        }
    }

    public final void i(boolean z10) {
        if (this.f51528m != -1) {
            ConnectionsManager.getInstance(this.f51518a).cancelRequest(this.f51528m, true);
            this.f51528m = -1;
        }
        this.f51524i = false;
        this.f51527l.clear();
        this.f51526k = null;
        this.f51525j = false;
        if (!z10 && !this.f51530o) {
            return;
        }
        a();
    }

    @Override
    public final int indexOf(Object obj) {
        return this.f51527l.indexOf(obj);
    }

    public final void j(ArrayList arrayList, TL_stars.StarGift starGift) {
        int i10 = this.f51518a;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            boolean z10 = false;
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                TL_stars.StarGift starGift2 = (TL_stars.StarGift) obj;
                int i12 = 0;
                while (true) {
                    ArrayList arrayList2 = this.f51527l;
                    if (i12 < arrayList2.size()) {
                        TL_stars.StarGift starGift3 = ((TL_stars.SavedStarGift) arrayList2.get(i12)).gift;
                        if (starGift3 != null && starGift3.f20264id == starGift2.f20264id) {
                            arrayList2.remove(i12);
                            this.f51529n = Math.max(0, this.f51529n - 1);
                            z10 = true;
                            break;
                        }
                        i12++;
                    } else {
                        break;
                    }
                }
            }
            if (z10) {
                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.f51519b), this);
            }
        }
        if (starGift != null) {
            TL_stars.getSavedStarGift getsavedstargift = new TL_stars.getSavedStarGift();
            TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
            tL_inputSavedStarGiftSlug.slug = starGift.slug;
            getsavedstargift.stargift.add(tL_inputSavedStarGiftSlug);
            ConnectionsManager.getInstance(i10).sendRequest(getsavedstargift, new ai.n8(this, 28));
        }
    }

    public final void k(int i10, int i11) {
        ArrayList arrayList = this.f51527l;
        int clamp = Utilities.clamp(i10, arrayList.size() - 1, 0);
        if (clamp >= 0 && clamp < arrayList.size()) {
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.remove(clamp);
            int clamp2 = Utilities.clamp(i11, arrayList.size() - 1, 0);
            if (clamp2 >= 0 && clamp2 < arrayList.size()) {
                arrayList.add(clamp2, savedStarGift);
            }
        }
    }

    public final void l() {
        boolean z10 = this.f51520c;
        int i10 = 0;
        long j3 = this.f51519b;
        int i11 = this.f51518a;
        if (z10) {
            TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
            updatestargiftcollection.peer = MessagesController.getInstance(i11).getInputPeer(j3);
            updatestargiftcollection.collection_id = this.d;
            updatestargiftcollection.flags |= 8;
            ArrayList arrayList = this.f51527l;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                updatestargiftcollection.order.add(g((TL_stars.SavedStarGift) obj));
            }
            ConnectionsManager.getInstance(i11).sendRequest(updatestargiftcollection, null, 64);
            return;
        }
        TL_stars.toggleStarGiftsPinnedToTop togglestargiftspinnedtotop = new TL_stars.toggleStarGiftsPinnedToTop();
        togglestargiftspinnedtotop.peer = MessagesController.getInstance(i11).getInputPeer(j3);
        ArrayList h = h();
        int size2 = h.size();
        while (i10 < size2) {
            Object obj2 = h.get(i10);
            i10++;
            togglestargiftspinnedtotop.stargift.add(g((TL_stars.SavedStarGift) obj2));
        }
        ConnectionsManager.getInstance(i11).sendRequest(togglestargiftspinnedtotop, new ai.u7(8), 64);
    }

    public final boolean m(TL_stars.SavedStarGift savedStarGift, boolean z10, boolean z11) {
        boolean z12;
        ArrayList arrayList;
        if (savedStarGift != null) {
            ArrayList h = h();
            boolean contains = h.contains(savedStarGift);
            int i10 = this.f51518a;
            if (contains) {
                if (!z10) {
                    h.remove(savedStarGift);
                    z12 = false;
                    savedStarGift.pinned_to_top = z10;
                    arrayList = this.f51527l;
                    arrayList.removeAll(h);
                    if (this.f51521e && !this.f51520c) {
                        Collections.sort(arrayList, new gb1(20));
                    }
                    arrayList.addAll(0, h);
                    NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.f51519b), this);
                    l();
                    return z12;
                }
            } else if (z10) {
                if (h.size() + 1 > MessagesController.getInstance(i10).stargiftsPinnedToTopLimit) {
                    if (!z11) {
                        return true;
                    }
                    while (h.size() > 0 && h.size() + 1 > MessagesController.getInstance(i10).stargiftsPinnedToTopLimit) {
                        ((TL_stars.SavedStarGift) hg.k0.w(1, h)).pinned_to_top = false;
                    }
                    z12 = true;
                } else {
                    z12 = false;
                }
                h.add(savedStarGift);
                savedStarGift.pinned_to_top = z10;
                arrayList = this.f51527l;
                arrayList.removeAll(h);
                if (this.f51521e) {
                    Collections.sort(arrayList, new gb1(20));
                }
                arrayList.addAll(0, h);
                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.f51519b), this);
                l();
                return z12;
            }
        }
        return false;
    }

    public final void n(TL_stars.SavedStarGift savedStarGift, int i10, boolean z10) {
        ArrayList arrayList = this.f51527l;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj;
            if (t5.k(savedStarGift2, savedStarGift)) {
                if (z10) {
                    if (!savedStarGift2.collection_id.contains(Integer.valueOf(i10))) {
                        savedStarGift2.collection_id.add(Integer.valueOf(i10));
                    }
                } else {
                    savedStarGift2.collection_id.remove(Integer.valueOf(i10));
                }
            }
        }
    }

    public final void o(TL_stars.SavedStarGift savedStarGift, boolean z10) {
        ArrayList arrayList = this.f51527l;
        int size = arrayList.size();
        boolean z11 = false;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj;
            if (t5.k(savedStarGift2, savedStarGift) && savedStarGift2.unsaved != z10) {
                savedStarGift2.unsaved = z10;
                z11 = true;
            }
        }
        if (z11) {
            NotificationCenter.getInstance(this.f51518a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.f51519b), this);
        }
    }
}
