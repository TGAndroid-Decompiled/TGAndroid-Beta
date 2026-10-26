package zh;

import android.text.TextUtils;
import bi.ca;
import bi.h7;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.vs0;
import org.telegram.ui.Components.wc;
public final class s1 implements Runnable {
    public final int f53242a;
    public final Object f53243b;
    public final TLObject f53244c;
    public final Object d;

    public s1(Object obj, TLObject tLObject, Object obj2, int i10) {
        this.f53242a = i10;
        this.f53243b = obj;
        this.f53244c = tLObject;
        this.d = obj2;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        boolean z12;
        int i10 = this.f53242a;
        Object obj = this.d;
        TLObject tLObject = this.f53244c;
        Object obj2 = this.f53243b;
        switch (i10) {
            case 0:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) tLObject;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) obj;
                ((vs0) obj2).H = -1;
                if (tL_error != null) {
                    wc.b0(r2Var).g0(tL_error, false);
                    return;
                }
                return;
            case 1:
                m2 m2Var = (m2) obj2;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) tLObject;
                vs0 vs0Var = m2Var.f53143a;
                vs0Var.e.k(m2Var.e.d, savedStarGift);
                ((k80) obj).u();
                vs0Var.o();
                TL_stars.TL_starGiftCollection c10 = vs0Var.e.c(m2Var.e.d);
                if (c10 != null) {
                    wc.b0(vs0Var.f53230a).S(savedStarGift.gift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2RemovedFromCollection, h7.X1(savedStarGift.gift), c10.title))).j();
                    return;
                }
                return;
            case 2:
                m2 m2Var2 = (m2) obj2;
                TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) tLObject;
                g1 g1Var = (g1) obj;
                if (!m2Var2.d && savedStarGift2.pinned_to_top && !savedStarGift2.unsaved) {
                    z10 = true;
                    g1Var.d(false, true);
                    m2Var2.e.o(savedStarGift2, false, false);
                } else {
                    z10 = true;
                }
                savedStarGift2.unsaved ^= z10;
                g1Var.i(savedStarGift2, z10, m2Var2.d);
                m2Var2.f53143a.e.m(savedStarGift2, savedStarGift2.unsaved);
                TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                savestargift.stargift = m2Var2.e.h(savedStarGift2);
                savestargift.unsave = savedStarGift2.unsaved;
                ConnectionsManager.getInstance(m2Var2.f53144b).sendRequest(savestargift, null);
                return;
            default:
                u3 u3Var = (u3) obj2;
                TL_stars.getResaleStarGifts getresalestargifts = (TL_stars.getResaleStarGifts) obj;
                HashMap hashMap = u3Var.f53274m;
                HashMap hashMap2 = u3Var.f53276o;
                HashMap hashMap3 = u3Var.f53275n;
                ArrayList arrayList = u3Var.h;
                ArrayList arrayList2 = u3Var.f53269g;
                ArrayList arrayList3 = u3Var.f53268f;
                int i11 = u3Var.f53265a;
                ArrayList arrayList4 = u3Var.d;
                u3Var.v = -1;
                if (tLObject instanceof TL_stars.resaleStarGifts) {
                    TL_stars.resaleStarGifts resalestargifts = (TL_stars.resaleStarGifts) tLObject;
                    MessagesController.getInstance(i11).putUsers(resalestargifts.users, false);
                    MessagesController.getInstance(i11).putChats(resalestargifts.chats, false);
                    u3Var.e = resalestargifts.count;
                    if (TextUtils.isEmpty(getresalestargifts.offset)) {
                        arrayList4.clear();
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    ArrayList<TL_stars.StarGift> arrayList5 = resalestargifts.gifts;
                    int size = arrayList5.size();
                    int i12 = 0;
                    while (i12 < size) {
                        TL_stars.StarGift starGift = arrayList5.get(i12);
                        i12++;
                        TL_stars.StarGift starGift2 = starGift;
                        if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                            arrayList4.add((TL_stars.TL_starGiftUnique) starGift2);
                        }
                    }
                    if (arrayList4.size() < u3Var.e && !TextUtils.isEmpty(resalestargifts.next_offset)) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    u3Var.f53282u = z12;
                    u3Var.f53278q = resalestargifts.next_offset;
                    u3Var.f53281t = false;
                    ArrayList<TL_stars.StarGiftAttribute> arrayList6 = resalestargifts.attributes;
                    if (arrayList6 != null && !arrayList6.isEmpty()) {
                        arrayList3.clear();
                        arrayList2.clear();
                        arrayList.clear();
                        arrayList3.addAll(ca.m(resalestargifts.attributes, TL_stars.starGiftAttributeModel.class));
                        arrayList2.addAll(ca.m(resalestargifts.attributes, TL_stars.starGiftAttributeBackdrop.class));
                        arrayList.addAll(ca.m(resalestargifts.attributes, TL_stars.starGiftAttributePattern.class));
                        u3Var.f53270i = resalestargifts.attributes_hash;
                    }
                    if (!resalestargifts.counters.isEmpty()) {
                        hashMap3.clear();
                        hashMap2.clear();
                        hashMap.clear();
                        ArrayList<TL_stars.starGiftAttributeCounter> arrayList7 = resalestargifts.counters;
                        int size2 = arrayList7.size();
                        int i13 = 0;
                        while (i13 < size2) {
                            TL_stars.starGiftAttributeCounter stargiftattributecounter = arrayList7.get(i13);
                            i13++;
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
                    Utilities.Callback callback = u3Var.f53267c;
                    if (callback != null) {
                        callback.run(Boolean.valueOf(z11));
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
