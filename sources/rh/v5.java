package rh;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ex0;
import org.telegram.ui.wd;
public final class v5 implements w5 {
    public final int f47574a;
    public final long f47575b;
    public int d;
    public Boolean h;
    public boolean f47579i;
    public boolean f47580j;
    public String f47581k;
    public int f47584n;
    public boolean f47585o;
    public ArrayList f47587q;
    public boolean f47576c = false;
    public boolean e = true;
    public boolean f47577f = false;
    public int f47578g = 783;
    public final ArrayList f47582l = new ArrayList();
    public int f47583m = -1;
    public long f47586p = 0;

    public v5(int i10, long j10, boolean z10) {
        this.f47574a = i10;
        this.f47575b = j10;
        if (z10) {
            b();
        }
    }

    @Override
    public final int a(int i10) {
        if (!e4.L1(this.f47574a, this.f47575b)) {
            return -1;
        }
        int i11 = i10 + 1;
        while (true) {
            ArrayList arrayList = this.f47582l;
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
    public final void b() {
        boolean z10;
        TL_stars.getSavedStarGifts getsavedstargifts;
        if (!this.f47579i && !this.f47580j) {
            if (this.f47581k == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f47579i = true;
            int i10 = (this.f47586p > 0L ? 1 : (this.f47586p == 0L ? 0 : -1));
            int i11 = 30;
            String str = "";
            int i12 = this.f47574a;
            if (i10 != 0) {
                TL_stars.getCraftStarGifts getcraftstargifts = new TL_stars.getCraftStarGifts();
                getcraftstargifts.gift_id = this.f47586p;
                if (!z10) {
                    str = this.f47581k;
                }
                getcraftstargifts.offset = str;
                if (z10) {
                    i11 = 15;
                }
                getcraftstargifts.limit = i11;
                getsavedstargifts = getcraftstargifts;
            } else {
                TL_stars.getSavedStarGifts getsavedstargifts2 = new TL_stars.getSavedStarGifts();
                getsavedstargifts2.sort_by_value = !this.e;
                getsavedstargifts2.exclude_unupgradable = !TLObject.hasFlag(this.f47578g, 2);
                getsavedstargifts2.exclude_upgradable = !TLObject.hasFlag(this.f47578g, 4);
                getsavedstargifts2.exclude_unlimited = !TLObject.hasFlag(this.f47578g, 1);
                getsavedstargifts2.exclude_unique = !TLObject.hasFlag(this.f47578g, 8);
                getsavedstargifts2.exclude_saved = !TLObject.hasFlag(this.f47578g, 256);
                getsavedstargifts2.exclude_unsaved = !TLObject.hasFlag(this.f47578g, 512);
                getsavedstargifts2.peer_color_available = this.f47577f;
                long j10 = this.f47575b;
                if (j10 == 0) {
                    getsavedstargifts2.peer = new TLRPC.TL_inputPeerSelf();
                } else {
                    getsavedstargifts2.peer = vp.r1(i12).i1(j10);
                }
                if (!z10) {
                    str = this.f47581k;
                }
                getsavedstargifts2.offset = str;
                if (z10) {
                    i11 = Math.max(vp.r1(i12).L6, 15);
                }
                getsavedstargifts2.limit = i11;
                getsavedstargifts = getsavedstargifts2;
                if (this.f47576c) {
                    getsavedstargifts2.flags |= 64;
                    getsavedstargifts2.collection_id = this.d;
                    getsavedstargifts = getsavedstargifts2;
                }
            }
            int sendRequest = ConnectionsManager.getInstance(i12).sendRequest(getsavedstargifts, new wd(this, r2, z10, 6));
            this.f47583m = sendRequest;
            int[] iArr = {sendRequest};
        }
    }

    @Override
    public final int c() {
        return this.f47584n;
    }

    @Override
    public final void d() {
        zs.f(this.f47574a).k(zs.G3, Long.valueOf(this.f47575b), this);
    }

    @Override
    public final int e() {
        return this.f47582l.size();
    }

    public final void f() {
        if (this.f47583m != -1) {
            ConnectionsManager.getInstance(this.f47574a).cancelRequest(this.f47583m, true);
            this.f47583m = -1;
        }
        this.f47579i = false;
    }

    public final void g(int i10, boolean z10) {
        int i11;
        if ((i10 & 15) != 0) {
            i11 = 15;
        } else if ((i10 & 768) != 0) {
            i11 = 768;
        } else {
            i11 = 0;
        }
        int i12 = this.f47578g;
        int i13 = i10 | ((~i11) & i12);
        if (i12 != i13) {
            this.f47578g = i13;
            if (z10) {
                j(true);
            }
        }
    }

    @Override
    public final Object get(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.f47582l;
            if (i10 < arrayList.size()) {
                return arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    public final TL_stars.InputSavedStarGift h(TL_stars.SavedStarGift savedStarGift) {
        if (savedStarGift == null) {
            return null;
        }
        if ((savedStarGift.flags & 8) != 0) {
            TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
            tL_inputSavedStarGiftUser.msg_id = savedStarGift.msg_id;
            return tL_inputSavedStarGiftUser;
        }
        TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
        tL_inputSavedStarGiftChat.peer = vp.r1(this.f47574a).i1(this.f47575b);
        tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
        return tL_inputSavedStarGiftChat;
    }

    public final ArrayList i() {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f47582l;
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

    @Override
    public final int indexOf(Object obj) {
        return this.f47582l.indexOf(obj);
    }

    public final void j(boolean z10) {
        if (this.f47583m != -1) {
            ConnectionsManager.getInstance(this.f47574a).cancelRequest(this.f47583m, true);
            this.f47583m = -1;
        }
        this.f47579i = false;
        this.f47582l.clear();
        this.f47581k = null;
        this.f47580j = false;
        if (!z10 && !this.f47585o) {
            return;
        }
        b();
    }

    public final void k(ArrayList arrayList, TL_stars.StarGift starGift) {
        int i10 = this.f47574a;
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
                    ArrayList arrayList2 = this.f47582l;
                    if (i12 < arrayList2.size()) {
                        TL_stars.StarGift starGift3 = ((TL_stars.SavedStarGift) arrayList2.get(i12)).gift;
                        if (starGift3 != null && starGift3.f20021id == starGift2.f20021id) {
                            arrayList2.remove(i12);
                            this.f47584n = Math.max(0, this.f47584n - 1);
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
                zs.f(i10).k(zs.G3, Long.valueOf(this.f47575b), this);
            }
        }
        if (starGift != null) {
            TL_stars.getSavedStarGift getsavedstargift = new TL_stars.getSavedStarGift();
            TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
            tL_inputSavedStarGiftSlug.slug = starGift.slug;
            getsavedstargift.stargift.add(tL_inputSavedStarGiftSlug);
            ConnectionsManager.getInstance(i10).sendRequest(getsavedstargift, new ag.c(this, 17));
        }
    }

    public final boolean l(TL_stars.SavedStarGift savedStarGift) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f47582l;
            if (i10 >= arrayList.size()) {
                return false;
            }
            if (e6.k((TL_stars.SavedStarGift) arrayList.get(i10), savedStarGift)) {
                arrayList.remove(i10);
                this.f47584n = Math.max(0, this.f47584n - 1);
                zs.f(this.f47574a).k(zs.G3, Long.valueOf(this.f47575b), this);
                return true;
            }
            i10++;
        }
    }

    public final void m(int i10, int i11) {
        ArrayList arrayList = this.f47582l;
        int j10 = Utilities.j(i10, arrayList.size() - 1, 0);
        if (j10 >= 0 && j10 < arrayList.size()) {
            TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) arrayList.remove(j10);
            int j11 = Utilities.j(i11, arrayList.size() - 1, 0);
            if (j11 >= 0 && j11 < arrayList.size()) {
                arrayList.add(j11, savedStarGift);
            }
        }
    }

    public final void n() {
        boolean z10 = this.f47576c;
        int i10 = 0;
        long j10 = this.f47575b;
        int i11 = this.f47574a;
        if (z10) {
            TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
            updatestargiftcollection.peer = vp.r1(i11).i1(j10);
            updatestargiftcollection.collection_id = this.d;
            updatestargiftcollection.flags |= 8;
            ArrayList arrayList = this.f47582l;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                updatestargiftcollection.order.add(h((TL_stars.SavedStarGift) obj));
            }
            ConnectionsManager.getInstance(i11).sendRequest(updatestargiftcollection, null, 64);
            return;
        }
        TL_stars.toggleStarGiftsPinnedToTop togglestargiftspinnedtotop = new TL_stars.toggleStarGiftsPinnedToTop();
        togglestargiftspinnedtotop.peer = vp.r1(i11).i1(j10);
        ArrayList i12 = i();
        int size2 = i12.size();
        while (i10 < size2) {
            Object obj2 = i12.get(i10);
            i10++;
            togglestargiftspinnedtotop.stargift.add(h((TL_stars.SavedStarGift) obj2));
        }
        ConnectionsManager.getInstance(i11).sendRequest(togglestargiftspinnedtotop, new ag.c3(4), 64);
    }

    public final boolean o(TL_stars.SavedStarGift savedStarGift, boolean z10, boolean z11) {
        boolean z12;
        ArrayList arrayList;
        if (savedStarGift != null) {
            ArrayList i10 = i();
            boolean contains = i10.contains(savedStarGift);
            int i11 = this.f47574a;
            if (contains) {
                if (!z10) {
                    i10.remove(savedStarGift);
                    z12 = false;
                    savedStarGift.pinned_to_top = z10;
                    arrayList = this.f47582l;
                    arrayList.removeAll(i10);
                    if (this.e && !this.f47576c) {
                        Collections.sort(arrayList, new ex0(12));
                    }
                    arrayList.addAll(0, i10);
                    zs.f(i11).k(zs.G3, Long.valueOf(this.f47575b), this);
                    n();
                    return z12;
                }
            } else if (z10) {
                if (i10.size() + 1 > vp.r1(i11).L6) {
                    if (!z11) {
                        return true;
                    }
                    while (i10.size() > 0 && i10.size() + 1 > vp.r1(i11).L6) {
                        ((TL_stars.SavedStarGift) i0.a.v(1, i10)).pinned_to_top = false;
                    }
                    z12 = true;
                } else {
                    z12 = false;
                }
                i10.add(savedStarGift);
                savedStarGift.pinned_to_top = z10;
                arrayList = this.f47582l;
                arrayList.removeAll(i10);
                if (this.e) {
                    Collections.sort(arrayList, new ex0(12));
                }
                arrayList.addAll(0, i10);
                zs.f(i11).k(zs.G3, Long.valueOf(this.f47575b), this);
                n();
                return z12;
            }
        }
        return false;
    }

    public final void p(TL_stars.SavedStarGift savedStarGift, int i10, boolean z10) {
        ArrayList arrayList = this.f47582l;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj;
            if (e6.k(savedStarGift2, savedStarGift)) {
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

    public final void q(TL_stars.SavedStarGift savedStarGift, boolean z10) {
        ArrayList arrayList = this.f47582l;
        int size = arrayList.size();
        boolean z11 = false;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj;
            if (e6.k(savedStarGift2, savedStarGift) && savedStarGift2.unsaved != z10) {
                savedStarGift2.unsaved = z10;
                z11 = true;
            }
        }
        if (z11) {
            zs.f(this.f47574a).k(zs.G3, Long.valueOf(this.f47575b), this);
        }
    }
}
