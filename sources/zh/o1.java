package zh;

import android.text.TextUtils;
import bi.ea;
import bi.k7;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.up0;
public final class o1 implements Runnable {
    public final int f60488a;
    public final Object f60489b;
    public final TLObject f60490c;
    public final Object d;

    public o1(Object obj, TLObject tLObject, Object obj2, int i7) {
        this.f60488a = i7;
        this.f60489b = obj;
        this.f60490c = tLObject;
        this.d = obj2;
    }

    @Override
    public final void run() {
        boolean z9;
        boolean z10;
        boolean z11;
        int i7 = this.f60488a;
        Object obj = this.d;
        TLObject tLObject = this.f60490c;
        Object obj2 = this.f60489b;
        switch (i7) {
            case 0:
                z1 z1Var = (z1) obj2;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) tLObject;
                up0 up0Var = z1Var.f60621a;
                up0Var.f60285e.k(z1Var.f60624e.d, savedStarGift);
                ((k60) obj).u();
                up0Var.o();
                TL_stars.TL_starGiftCollection c10 = up0Var.f60285e.c(z1Var.f60624e.d);
                if (c10 != null) {
                    hc.a0(up0Var.f60282a).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.X2(id.a0(null, null, 2131750038, k7.A1(savedStarGift.gift), c10.title))).j();
                    return;
                }
                return;
            case 1:
                z1 z1Var2 = (z1) obj2;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) tLObject;
                y0 y0Var = (y0) obj;
                if (!z1Var2.d && savedStarGift2.pinned_to_top && !savedStarGift2.unsaved) {
                    z9 = true;
                    y0Var.d(false, true);
                    z1Var2.f60624e.o(savedStarGift2, false, false);
                } else {
                    z9 = true;
                }
                savedStarGift2.unsaved ^= z9;
                y0Var.i(savedStarGift2, z9, z1Var2.d);
                z1Var2.f60621a.f60285e.m(savedStarGift2, savedStarGift2.unsaved);
                TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                savestargift.stargift = z1Var2.f60624e.h(savedStarGift2);
                savestargift.unsave = savedStarGift2.unsaved;
                ConnectionsManager.getInstance(z1Var2.f60622b).sendRequest(savestargift, null);
                return;
            default:
                b3 b3Var = (b3) obj2;
                TL_stars.getResaleStarGifts getresalestargifts = (TL_stars.getResaleStarGifts) obj;
                HashMap hashMap = b3Var.f60243m;
                HashMap hashMap2 = b3Var.f60245o;
                HashMap hashMap3 = b3Var.f60244n;
                ArrayList arrayList = b3Var.h;
                ArrayList arrayList2 = b3Var.f60238g;
                ArrayList arrayList3 = b3Var.f60237f;
                int i10 = b3Var.f60233a;
                ArrayList arrayList4 = b3Var.d;
                b3Var.v = -1;
                if (tLObject instanceof TL_stars.resaleStarGifts) {
                    TL_stars.resaleStarGifts resalestargifts = (TL_stars.resaleStarGifts) tLObject;
                    qp.s1(i10).Y3(resalestargifts.users, false);
                    qp.s1(i10).S3(resalestargifts.chats, false);
                    b3Var.f60236e = resalestargifts.count;
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
                    if (arrayList4.size() < b3Var.f60236e && !TextUtils.isEmpty(resalestargifts.next_offset)) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    b3Var.f60251u = z11;
                    b3Var.f60247q = resalestargifts.next_offset;
                    b3Var.f60250t = false;
                    ArrayList<TL_stars.StarGiftAttribute> arrayList6 = resalestargifts.attributes;
                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                        arrayList3.clear();
                        arrayList2.clear();
                        arrayList.clear();
                        arrayList3.addAll(ea.m(resalestargifts.attributes, TL_stars.starGiftAttributeModel.class));
                        arrayList2.addAll(ea.m(resalestargifts.attributes, TL_stars.starGiftAttributeBackdrop.class));
                        arrayList.addAll(ea.m(resalestargifts.attributes, TL_stars.starGiftAttributePattern.class));
                        b3Var.f60239i = resalestargifts.attributes_hash;
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
                    c20 c20Var = b3Var.f60235c;
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
