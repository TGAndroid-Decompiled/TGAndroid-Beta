package pf;

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.x31;
import org.telegram.ui.rc1;

public final class k1 implements Runnable {

    public final l1 f45863a;

    public k1(l1 l1Var) {
        this.f45863a = l1Var;
    }

    public final void a() {
        l1 l1Var = this.f45863a;
        if (l1Var.M) {
            return;
        }
        l1Var.M = true;
        l1Var.E.clear();
        l1Var.F.clear();
        l1Var.B.clear();
        l1Var.A.clear();
        l1Var.C.clear();
        l1Var.D.clear();
    }

    @Override
    public final void run() {
        int i10;
        int iIndexOfIgnoreCase;
        HashMap map;
        int iIndexOfIgnoreCase2;
        CharSequence charSequence;
        int i11;
        CharSequence charSequenceConcat;
        l1 l1Var = this.f45863a;
        HashMap map2 = l1Var.C;
        HashMap map3 = l1Var.D;
        HashMap map4 = l1Var.E;
        ArrayList arrayList = l1Var.B;
        x31 x31Var = l1Var.f45868e;
        int i12 = l1Var.f45867c;
        if (TextUtils.isEmpty(l1Var.N)) {
            return;
        }
        tp progressDrawable = x31Var.f34463b.h.getProgressDrawable();
        progressDrawable.f32851e = true;
        progressDrawable.f32849b = System.currentTimeMillis();
        progressDrawable.invalidateSelf();
        l1Var.M = false;
        int i13 = l1Var.L + 1;
        l1Var.L = i13;
        ArrayList arrayList2 = new ArrayList(0);
        LongSparseArray longSparseArray = new LongSparseArray(0);
        HashMap<String, ArrayList<TLRPC.Document>> allStickers = MediaDataController.getInstance(i12).getAllStickers();
        if (l1Var.N.length() <= 14) {
            String str = l1Var.N;
            int length = str.length();
            int i14 = 0;
            while (i14 < length) {
                int i15 = i12;
                if (i14 < length - 1) {
                    if (charSequence.charAt(i14) == 55356) {
                        int i16 = i14 + 1;
                        i11 = length;
                        if (charSequence.charAt(i16) < 57339 || charSequence.charAt(i16) > 57343) {
                        }
                        charSequence = str;
                        charSequenceConcat = TextUtils.concat(charSequence.subSequence(0, i14), charSequence.subSequence(i14 + 2, charSequence.length()));
                        length = i11 - 2;
                        i14--;
                        charSequence = charSequenceConcat;
                        i14++;
                        i12 = i15;
                        charSequence = charSequence;
                    } else {
                        charSequence = str;
                        i11 = length;
                    }
                    charSequence = str;
                    charSequence = str;
                    if (charSequence.charAt(i14) == 8205) {
                        int i17 = i14 + 1;
                        if (charSequence.charAt(i17) == 9792 || charSequence.charAt(i17) == 9794) {
                            charSequence = str;
                            charSequenceConcat = TextUtils.concat(charSequence.subSequence(0, i14), charSequence.subSequence(i14 + 2, charSequence.length()));
                            length = i11 - 2;
                        }
                        i14--;
                        charSequence = charSequenceConcat;
                        i14++;
                        i12 = i15;
                        charSequence = charSequence;
                    }
                } else {
                    charSequence = str;
                    i11 = length;
                }
                if (charSequence.charAt(i14) == 65039) {
                    charSequenceConcat = TextUtils.concat(charSequence.subSequence(0, i14), charSequence.subSequence(i14 + 1, charSequence.length()));
                    length = i11 - 1;
                    i14--;
                    charSequence = charSequenceConcat;
                } else {
                    length = i11;
                }
                i14++;
                i12 = i15;
                charSequence = charSequence;
            }
            charSequence = str;
            i10 = i12;
            ArrayList<TLRPC.Document> arrayList3 = allStickers != null ? allStickers.get(charSequence.toString()) : null;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                a();
                arrayList2.addAll(arrayList3);
                int i18 = 0;
                for (int size = arrayList3.size(); i18 < size; size = size) {
                    TLRPC.Document document = arrayList3.get(i18);
                    longSparseArray.put(document.f22386id, document);
                    i18++;
                    arrayList3 = arrayList3;
                }
                map4.put(arrayList2, l1Var.N);
                l1Var.F.add(arrayList2);
            }
        } else {
            i10 = i12;
        }
        if (allStickers != null && !allStickers.isEmpty() && l1Var.N.length() > 1) {
            String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
            if (!Arrays.equals(x31Var.f34462a.b(), currentKeyboardLanguage)) {
                MediaDataController.getInstance(i10).fetchNewEmojiKeywords(currentKeyboardLanguage);
            }
            x31Var.f34462a.i(currentKeyboardLanguage);
            MediaDataController.getInstance(i10).getEmojiSuggestions(x31Var.f34462a.b(), l1Var.N, false, new c3.d(this, i13, allStickers, 15), false);
        }
        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(i10).getStickerSets(0);
        int size2 = stickerSets.size();
        int i19 = 0;
        while (i19 < size2) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i19);
            int iIndexOfIgnoreCase3 = AndroidUtilities.indexOfIgnoreCase(tL_messages_stickerSet.set.title, l1Var.N);
            if (iIndexOfIgnoreCase3 >= 0) {
                if (iIndexOfIgnoreCase3 != 0) {
                    map = map4;
                    if (tL_messages_stickerSet.set.title.charAt(iIndexOfIgnoreCase3 - 1) == ' ') {
                    }
                } else {
                    map = map4;
                }
                a();
                arrayList.add(tL_messages_stickerSet);
                map3.put(tL_messages_stickerSet, Integer.valueOf(iIndexOfIgnoreCase3));
            } else {
                map = map4;
                String str2 = tL_messages_stickerSet.set.short_name;
                if (str2 != null && (iIndexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(str2, l1Var.N)) >= 0 && (iIndexOfIgnoreCase2 == 0 || tL_messages_stickerSet.set.short_name.charAt(iIndexOfIgnoreCase2 - 1) == ' ')) {
                    a();
                    arrayList.add(tL_messages_stickerSet);
                    map2.put(tL_messages_stickerSet, Boolean.TRUE);
                }
            }
            i19++;
            map4 = map;
        }
        HashMap map5 = map4;
        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets2 = MediaDataController.getInstance(i10).getStickerSets(3);
        int size3 = stickerSets2.size();
        for (int i20 = 0; i20 < size3; i20++) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets2.get(i20);
            int iIndexOfIgnoreCase4 = AndroidUtilities.indexOfIgnoreCase(tL_messages_stickerSet2.set.title, l1Var.N);
            if (iIndexOfIgnoreCase4 < 0) {
                String str3 = tL_messages_stickerSet2.set.short_name;
                if (str3 != null && (iIndexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(str3, l1Var.N)) >= 0 && (iIndexOfIgnoreCase == 0 || tL_messages_stickerSet2.set.short_name.charAt(iIndexOfIgnoreCase - 1) == ' ')) {
                    a();
                    arrayList.add(tL_messages_stickerSet2);
                    map2.put(tL_messages_stickerSet2, Boolean.TRUE);
                }
            } else if (iIndexOfIgnoreCase4 == 0 || tL_messages_stickerSet2.set.title.charAt(iIndexOfIgnoreCase4 - 1) == ' ') {
                a();
                arrayList.add(tL_messages_stickerSet2);
                map3.put(tL_messages_stickerSet2, Integer.valueOf(iIndexOfIgnoreCase4));
            }
        }
        if (!arrayList.isEmpty() || !map5.isEmpty()) {
            x31Var.b(true);
        }
        TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = new TLRPC.TL_messages_searchStickerSets();
        tL_messages_searchStickerSets.f22492q = l1Var.N;
        l1Var.J = ConnectionsManager.getInstance(i10).sendRequest(tL_messages_searchStickerSets, new rc1(7, this, tL_messages_searchStickerSets));
        if (Emoji.isValidEmoji(l1Var.N)) {
            TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
            tL_messages_getStickers.emoticon = l1Var.N;
            tL_messages_getStickers.hash = 0L;
            l1Var.K = ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getStickers, new gh.f1(this, tL_messages_getStickers, arrayList2, longSparseArray, 19));
        }
        l1Var.l();
    }
}
