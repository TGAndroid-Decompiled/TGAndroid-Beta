package yh;

import ai.o8;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.lb1;
public final class f5 implements g5 {
    public final int f52597a;
    public final long f52598b;
    public int d;
    public Boolean h;
    public boolean f52603i;
    public boolean f52604j;
    public String f52605k;
    public int f52608n;
    public boolean f52609o;
    public ArrayList f52611q;
    public boolean f52599c = false;
    public boolean f52600e = true;
    public boolean f52601f = false;
    public int f52602g = 783;
    public final ArrayList f52606l = new ArrayList();
    public int f52607m = -1;
    public long f52610p = 0;

    public f5(int i10, long j3, boolean z10) {
        this.f52597a = i10;
        this.f52598b = j3;
        if (z10) {
            a();
        }
    }

    @Override
    public final void a() {
        boolean z10;
        TL_stars.getSavedStarGifts getsavedstargifts;
        if (!this.f52603i && !this.f52604j) {
            if (this.f52605k == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f52603i = true;
            int i10 = (this.f52610p > 0L ? 1 : (this.f52610p == 0L ? 0 : -1));
            int i11 = 30;
            String str = "";
            int i12 = this.f52597a;
            if (i10 != 0) {
                TL_stars.getCraftStarGifts getcraftstargifts = new TL_stars.getCraftStarGifts();
                getcraftstargifts.gift_id = this.f52610p;
                if (!z10) {
                    str = this.f52605k;
                }
                getcraftstargifts.offset = str;
                if (z10) {
                    i11 = 15;
                }
                getcraftstargifts.limit = i11;
                getsavedstargifts = getcraftstargifts;
            } else {
                TL_stars.getSavedStarGifts getsavedstargifts2 = new TL_stars.getSavedStarGifts();
                getsavedstargifts2.sort_by_value = !this.f52600e;
                getsavedstargifts2.exclude_unupgradable = !TLObject.hasFlag(this.f52602g, 2);
                getsavedstargifts2.exclude_upgradable = !TLObject.hasFlag(this.f52602g, 4);
                getsavedstargifts2.exclude_unlimited = !TLObject.hasFlag(this.f52602g, 1);
                getsavedstargifts2.exclude_unique = !TLObject.hasFlag(this.f52602g, 8);
                getsavedstargifts2.exclude_saved = !TLObject.hasFlag(this.f52602g, 256);
                getsavedstargifts2.exclude_unsaved = !TLObject.hasFlag(this.f52602g, 512);
                getsavedstargifts2.peer_color_available = this.f52601f;
                long j3 = this.f52598b;
                if (j3 == 0) {
                    getsavedstargifts2.peer = new TLRPC.TL_inputPeerSelf();
                } else {
                    getsavedstargifts2.peer = MessagesController.getInstance(i12).getInputPeer(j3);
                }
                if (!z10) {
                    str = this.f52605k;
                }
                getsavedstargifts2.offset = str;
                if (z10) {
                    i11 = Math.max(MessagesController.getInstance(i12).stargiftsPinnedToTopLimit, 15);
                }
                getsavedstargifts2.limit = i11;
                getsavedstargifts = getsavedstargifts2;
                if (this.f52599c) {
                    getsavedstargifts2.flags |= 64;
                    getsavedstargifts2.collection_id = this.d;
                    getsavedstargifts = getsavedstargifts2;
                }
            }
            int sendRequest = ConnectionsManager.getInstance(i12).sendRequest(getsavedstargifts, new ci.u1(this, r2, z10, 8));
            this.f52607m = sendRequest;
            int[] iArr = {sendRequest};
        }
    }

    @Override
    public final int b(int i10) {
        if (!s3.P1(this.f52597a, this.f52598b)) {
            return -1;
        }
        int i11 = i10 + 1;
        while (true) {
            ArrayList arrayList = this.f52606l;
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
        return this.f52608n;
    }

    @Override
    public final void d() {
        NotificationCenter.getInstance(this.f52597a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.f52598b), this);
    }

    @Override
    public final int e() {
        return this.f52606l.size();
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
        int i12 = this.f52602g;
        int i13 = i10 | ((~i11) & i12);
        if (i12 != i13) {
            this.f52602g = i13;
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
        tL_inputSavedStarGiftChat.peer = MessagesController.getInstance(this.f52597a).getInputPeer(this.f52598b);
        tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
        return tL_inputSavedStarGiftChat;
    }

    @Override
    public final Object get(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f52606l;
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
            ArrayList arrayList2 = this.f52606l;
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
        if (this.f52607m != -1) {
            ConnectionsManager.getInstance(this.f52597a).cancelRequest(this.f52607m, true);
            this.f52607m = -1;
        }
        this.f52603i = false;
        this.f52606l.clear();
        this.f52605k = null;
        this.f52604j = false;
        if (!z10 && !this.f52609o) {
            return;
        }
        a();
    }

    @Override
    public final int indexOf(Object obj) {
        return this.f52606l.indexOf(obj);
    }

    public final void j(ArrayList arrayList, TL_stars.StarGift starGift) {
        int i10 = this.f52597a;
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
                    ArrayList arrayList2 = this.f52606l;
                    if (i12 < arrayList2.size()) {
                        TL_stars.StarGift starGift3 = ((TL_stars.SavedStarGift) arrayList2.get(i12)).gift;
                        if (starGift3 != null && starGift3.f20259id == starGift2.f20259id) {
                            arrayList2.remove(i12);
                            this.f52608n = Math.max(0, this.f52608n - 1);
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
                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.f52598b), this);
            }
        }
        if (starGift != null) {
            TL_stars.getSavedStarGift getsavedstargift = new TL_stars.getSavedStarGift();
            TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
            tL_inputSavedStarGiftSlug.slug = starGift.slug;
            getsavedstargift.stargift.add(tL_inputSavedStarGiftSlug);
            ConnectionsManager.getInstance(i10).sendRequest(getsavedstargift, new o8(this, 28));
        }
    }

    public final void k(int i10, int i11) {
        ArrayList arrayList = this.f52606l;
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
        boolean z10 = this.f52599c;
        int i10 = 0;
        long j3 = this.f52598b;
        int i11 = this.f52597a;
        if (z10) {
            TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
            updatestargiftcollection.peer = MessagesController.getInstance(i11).getInputPeer(j3);
            updatestargiftcollection.collection_id = this.d;
            updatestargiftcollection.flags |= 8;
            ArrayList arrayList = this.f52606l;
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
        ConnectionsManager.getInstance(i11).sendRequest(togglestargiftspinnedtotop, new ai.v7(8), 64);
    }

    public final boolean m(TL_stars.SavedStarGift savedStarGift, boolean z10, boolean z11) {
        boolean z12;
        ArrayList arrayList;
        if (savedStarGift != null) {
            ArrayList h = h();
            boolean contains = h.contains(savedStarGift);
            int i10 = this.f52597a;
            if (contains) {
                if (!z10) {
                    h.remove(savedStarGift);
                    z12 = false;
                    savedStarGift.pinned_to_top = z10;
                    arrayList = this.f52606l;
                    arrayList.removeAll(h);
                    if (this.f52600e && !this.f52599c) {
                        Collections.sort(arrayList, new lb1(23));
                    }
                    arrayList.addAll(0, h);
                    NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.f52598b), this);
                    l();
                    return z12;
                }
            } else if (z10) {
                if (h.size() + 1 > MessagesController.getInstance(i10).stargiftsPinnedToTopLimit) {
                    if (!z11) {
                        return true;
                    }
                    while (h.size() > 0 && h.size() + 1 > MessagesController.getInstance(i10).stargiftsPinnedToTopLimit) {
                        ((TL_stars.SavedStarGift) hg.c.x(1, h)).pinned_to_top = false;
                    }
                    z12 = true;
                } else {
                    z12 = false;
                }
                h.add(savedStarGift);
                savedStarGift.pinned_to_top = z10;
                arrayList = this.f52606l;
                arrayList.removeAll(h);
                if (this.f52600e) {
                    Collections.sort(arrayList, new lb1(23));
                }
                arrayList.addAll(0, h);
                NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.f52598b), this);
                l();
                return z12;
            }
        }
        return false;
    }

    public final void n(TL_stars.SavedStarGift savedStarGift, int i10, boolean z10) {
        ArrayList arrayList = this.f52606l;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj;
            if (n5.k(savedStarGift2, savedStarGift)) {
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
        ArrayList arrayList = this.f52606l;
        int size = arrayList.size();
        boolean z11 = false;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj;
            if (n5.k(savedStarGift2, savedStarGift) && savedStarGift2.unsaved != z10) {
                savedStarGift2.unsaved = z10;
                z11 = true;
            }
        }
        if (z11) {
            NotificationCenter.getInstance(this.f52597a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftsLoaded, Long.valueOf(this.f52598b), this);
        }
    }
}
