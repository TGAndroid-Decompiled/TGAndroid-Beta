package zh;

import android.text.TextUtils;
import bi.ea;
import bi.k7;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.c20;
import org.telegram.messenger.hd;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.up0;
public final class p1 implements Runnable {
    public final int f60411a;
    public final Object f60412b;
    public final TLObject f60413c;
    public final Object d;

    public p1(Object obj, TLObject tLObject, Object obj2, int i7) {
        this.f60411a = i7;
        this.f60412b = obj;
        this.f60413c = tLObject;
        this.d = obj2;
    }

    @Override
    public final void run() {
        boolean z9;
        boolean z10;
        boolean z11;
        int i7 = this.f60411a;
        Object obj = this.d;
        TLObject tLObject = this.f60413c;
        Object obj2 = this.f60412b;
        switch (i7) {
            case 0:
                a2 a2Var = (a2) obj2;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) tLObject;
                up0 up0Var = a2Var.f60111a;
                up0Var.f60220e.k(a2Var.f60114e.d, savedStarGift);
                ((k60) obj).u();
                up0Var.o();
                TL_stars.TL_starGiftCollection c10 = up0Var.f60220e.c(a2Var.f60114e.d);
                if (c10 != null) {
                    hc.a0(up0Var.f60217a).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.X2(hd.a0(null, null, 2131750036, k7.A1(savedStarGift.gift), c10.title))).j();
                    return;
                }
                return;
            case 1:
                a2 a2Var2 = (a2) obj2;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) tLObject;
                z0 z0Var = (z0) obj;
                if (!a2Var2.d && savedStarGift2.pinned_to_top && !savedStarGift2.unsaved) {
                    z9 = true;
                    z0Var.d(false, true);
                    a2Var2.f60114e.o(savedStarGift2, false, false);
                } else {
                    z9 = true;
                }
                savedStarGift2.unsaved ^= z9;
                z0Var.i(savedStarGift2, z9, a2Var2.d);
                a2Var2.f60111a.f60220e.m(savedStarGift2, savedStarGift2.unsaved);
                TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                savestargift.stargift = a2Var2.f60114e.h(savedStarGift2);
                savestargift.unsave = savedStarGift2.unsaved;
                ConnectionsManager.getInstance(a2Var2.f60112b).sendRequest(savestargift, null);
                return;
            default:
                d3 d3Var = (d3) obj2;
                TL_stars.getResaleStarGifts getresalestargifts = (TL_stars.getResaleStarGifts) obj;
                HashMap hashMap = d3Var.f60188m;
                HashMap hashMap2 = d3Var.f60190o;
                HashMap hashMap3 = d3Var.f60189n;
                ArrayList arrayList = d3Var.h;
                ArrayList arrayList2 = d3Var.f60183g;
                ArrayList arrayList3 = d3Var.f60182f;
                int i10 = d3Var.f60178a;
                ArrayList arrayList4 = d3Var.d;
                d3Var.v = -1;
                if (tLObject instanceof TL_stars.resaleStarGifts) {
                    TL_stars.resaleStarGifts resalestargifts = (TL_stars.resaleStarGifts) tLObject;
                    qp.s1(i10).Y3(resalestargifts.users, false);
                    qp.s1(i10).S3(resalestargifts.chats, false);
                    d3Var.f60181e = resalestargifts.count;
                    if (TextUtils.isEmpty(getresalestargifts.offset)) {
                        arrayList4.clear();
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ArrayList<TL_stars.StarGift> arrayList5 = resalestargifts.gifts;
                    int size = arrayList5.size();
                    int i11 = 0;
                    while (i11 < size) {
                        TL_stars.StarGift starGift = arrayList5.get(i11);
                        i11++;
                        TL_stars.StarGift starGift2 = starGift;
                        if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                            arrayList4.add((TL_stars.TL_starGiftUnique) starGift2);
                        }
                    }
                    if (arrayList4.size() < d3Var.f60181e && !TextUtils.isEmpty(resalestargifts.next_offset)) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    d3Var.f60196u = z11;
                    d3Var.f60192q = resalestargifts.next_offset;
                    d3Var.f60195t = false;
                    ArrayList<TL_stars.StarGiftAttribute> arrayList6 = resalestargifts.attributes;
                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                        arrayList3.clear();
                        arrayList2.clear();
                        arrayList.clear();
                        arrayList3.addAll(ea.m(resalestargifts.attributes, TL_stars.starGiftAttributeModel.class));
                        arrayList2.addAll(ea.m(resalestargifts.attributes, TL_stars.starGiftAttributeBackdrop.class));
                        arrayList.addAll(ea.m(resalestargifts.attributes, TL_stars.starGiftAttributePattern.class));
                        d3Var.f60184i = resalestargifts.attributes_hash;
                    }
                    if (!resalestargifts.counters.isEmpty()) {
                        hashMap3.clear();
                        hashMap2.clear();
                        hashMap.clear();
                        ArrayList<TL_stars.starGiftAttributeCounter> arrayList7 = resalestargifts.counters;
                        int size2 = arrayList7.size();
                        int i12 = 0;
                        while (i12 < size2) {
                            TL_stars.starGiftAttributeCounter stargiftattributecounter = arrayList7.get(i12);
                            i12++;
                            TL_stars.starGiftAttributeCounter stargiftattributecounter2 = stargiftattributecounter;
                            TL_stars.StarGiftAttributeId starGiftAttributeId = stargiftattributecounter2.attribute;
                            if (starGiftAttributeId instanceof TL_stars.starGiftAttributeIdBackdrop) {
                                hashMap3.put(Integer.valueOf(starGiftAttributeId.backdrop_id), Integer.valueOf(stargiftattributecounter2.count));
                            } else if (starGiftAttributeId instanceof TL_stars.starGiftAttributeIdPattern) {
                                hashMap2.put(Long.valueOf(starGiftAttributeId.document_id), Integer.valueOf(stargiftattributecounter2.count));
                            } else if (starGiftAttributeId instanceof TL_stars.starGiftAttributeIdModel) {
                                hashMap.put(Long.valueOf(starGiftAttributeId.document_id), Integer.valueOf(stargiftattributecounter2.count));
                            }
                        }
                    }
                    c20 c20Var = d3Var.f60180c;
                    if (c20Var != null) {
                        c20Var.a(Boolean.valueOf(z10));
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
