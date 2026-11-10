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
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.up0;
public final class o1 implements Runnable {
    public final int f60505a;
    public final Object f60506b;
    public final TLObject f60507c;
    public final Object d;

    public o1(Object obj, TLObject tLObject, Object obj2, int i7) {
        this.f60505a = i7;
        this.f60506b = obj;
        this.f60507c = tLObject;
        this.d = obj2;
    }

    @Override
    public final void run() {
        boolean z9;
        boolean z10;
        boolean z11;
        int i7 = this.f60505a;
        Object obj = this.d;
        TLObject tLObject = this.f60507c;
        Object obj2 = this.f60506b;
        switch (i7) {
            case 0:
                z1 z1Var = (z1) obj2;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) tLObject;
                up0 up0Var = z1Var.f60651a;
                up0Var.f60297e.k(z1Var.f60654e.d, savedStarGift);
                ((k60) obj).u();
                up0Var.o();
                TL_stars.TL_starGiftCollection c10 = up0Var.f60297e.c(z1Var.f60654e.d);
                if (c10 != null) {
                    gc.a0(up0Var.f60294a).R(savedStarGift.gift.getDocument(), org.telegram.messenger.g0.X2(id.a0(null, null, 2131750037, k7.z1(savedStarGift.gift), c10.title))).j();
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
                    z1Var2.f60654e.o(savedStarGift2, false, false);
                } else {
                    z9 = true;
                }
                savedStarGift2.unsaved ^= z9;
                y0Var.i(savedStarGift2, z9, z1Var2.d);
                z1Var2.f60651a.f60297e.m(savedStarGift2, savedStarGift2.unsaved);
                TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                savestargift.stargift = z1Var2.f60654e.h(savedStarGift2);
                savestargift.unsave = savedStarGift2.unsaved;
                ConnectionsManager.getInstance(z1Var2.f60652b).sendRequest(savestargift, null);
                return;
            default:
                c3 c3Var = (c3) obj2;
                TL_stars.getResaleStarGifts getresalestargifts = (TL_stars.getResaleStarGifts) obj;
                HashMap hashMap = c3Var.f60273m;
                HashMap hashMap2 = c3Var.f60275o;
                HashMap hashMap3 = c3Var.f60274n;
                ArrayList arrayList = c3Var.h;
                ArrayList arrayList2 = c3Var.f60268g;
                ArrayList arrayList3 = c3Var.f60267f;
                int i10 = c3Var.f60263a;
                ArrayList arrayList4 = c3Var.d;
                c3Var.v = -1;
                if (tLObject instanceof TL_stars.resaleStarGifts) {
                    TL_stars.resaleStarGifts resalestargifts = (TL_stars.resaleStarGifts) tLObject;
                    qp.s1(i10).Y3(resalestargifts.users, false);
                    qp.s1(i10).S3(resalestargifts.chats, false);
                    c3Var.f60266e = resalestargifts.count;
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
                    if (arrayList4.size() < c3Var.f60266e && !TextUtils.isEmpty(resalestargifts.next_offset)) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    c3Var.f60281u = z11;
                    c3Var.f60277q = resalestargifts.next_offset;
                    c3Var.f60280t = false;
                    ArrayList<TL_stars.StarGiftAttribute> arrayList6 = resalestargifts.attributes;
                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                        arrayList3.clear();
                        arrayList2.clear();
                        arrayList.clear();
                        arrayList3.addAll(ea.m(resalestargifts.attributes, TL_stars.starGiftAttributeModel.class));
                        arrayList2.addAll(ea.m(resalestargifts.attributes, TL_stars.starGiftAttributeBackdrop.class));
                        arrayList.addAll(ea.m(resalestargifts.attributes, TL_stars.starGiftAttributePattern.class));
                        c3Var.f60269i = resalestargifts.attributes_hash;
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
                    c20 c20Var = c3Var.f60265c;
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
