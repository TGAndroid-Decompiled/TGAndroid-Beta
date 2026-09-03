package ph;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.uk;
import org.telegram.ui.ai;
import org.telegram.ui.ko0;
public final class l1 implements MediaDataController.KeywordResultCallback, org.telegram.ui.ActionBar.c2, ko0, uk {
    public final int f41939a;
    public final Object f41940b;
    public final Object f41941c;
    public final Object d;

    public l1(Object obj, Object obj2, Object obj3, int i10) {
        this.f41939a = i10;
        this.f41940b = obj;
        this.f41941c = obj2;
        this.d = obj3;
    }

    @Override
    public void a(int i10) {
        rh.k2 k2Var = (rh.k2) this.f41940b;
        cd0 cd0Var = (cd0) this.d;
        String str = (String) this.f41941c;
        if (i10 != 3) {
            cd0Var.dismiss();
        }
        k2Var.d.f43760x.G(str, ai.B(i10).toLowerCase(Locale.ROOT), false);
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z4, int i11, long j10) {
        switch (this.f41939a) {
            case 5:
                vh.q qVar = (vh.q) this.f41940b;
                vh.a aVar = (vh.a) this.f41941c;
                li liVar = (li) this.d;
                vh.s3 s3Var = qVar.f46156r;
                if (messageMedia != null && messageMedia.geo != null) {
                    vh.d2 d2Var = s3Var.G3;
                    if (d2Var != null) {
                        d2Var.d();
                    }
                    TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) aVar.f45853b;
                    pageblockmap.geo = messageMedia.geo;
                    pageblockmap.zoom = 15;
                    if (pageblockmap.f19380w <= 0 || pageblockmap.h <= 0) {
                        pageblockmap.f19380w = 600;
                        pageblockmap.h = 400;
                    }
                    vh.d2 d2Var2 = s3Var.G3;
                    if (d2Var2 != null) {
                        d2Var2.h();
                    }
                    qVar.V(true);
                    liVar.dismiss(true);
                    s3Var.post(new vh.g(qVar, aVar, 0));
                    return;
                }
                return;
            default:
                vh.y1 y1Var = (vh.y1) this.f41940b;
                vh.a aVar2 = (vh.a) this.f41941c;
                li liVar2 = (li) this.d;
                if (messageMedia != null && messageMedia.geo != null) {
                    vh.d2 d2Var3 = y1Var.M.G3;
                    if (d2Var3 != null) {
                        d2Var3.d();
                    }
                    TL_iv.pageBlockMap pageblockmap2 = (TL_iv.pageBlockMap) aVar2.f45853b;
                    pageblockmap2.geo = messageMedia.geo;
                    pageblockmap2.zoom = 15;
                    if (pageblockmap2.f19380w <= 0 || pageblockmap2.h <= 0) {
                        pageblockmap2.f19380w = 600;
                        pageblockmap2.h = 400;
                    }
                    vh.d2 d2Var4 = y1Var.M.G3;
                    if (d2Var4 != null) {
                        d2Var4.h();
                    }
                    liVar2.dismiss(true);
                    y1Var.M.post(new vh.j1(y1Var, aVar2, 9));
                    return;
                }
                return;
        }
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f41939a) {
            case 1:
                ((e8) this.f41940b).g1((c8) this.f41941c, (Runnable) this.d, true);
                return;
            case 2:
                Activity activity = (Activity) this.f41940b;
                boolean[] zArr = (boolean[]) this.f41941c;
                org.telegram.ui.web.r rVar = (org.telegram.ui.web.r) this.d;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    activity.startActivity(intent);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                zArr[0] = true;
                Boolean bool = Boolean.FALSE;
                rVar.run(bool, bool);
                return;
            case 3:
            default:
                vh.z3 z3Var = (vh.z3) this.d;
                String trim = ((EditTextBoldCursor) this.f41940b).getText().toString().trim();
                String trim2 = ((EditTextBoldCursor) this.f41941c).getText().toString().trim();
                if (!TextUtils.isEmpty(trim) && !TextUtils.isEmpty(trim2)) {
                    int i11 = z3Var.f46423a;
                    vh.p3 p3Var = z3Var.f46424b;
                    switch (i11) {
                        case 1:
                            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = new TL_keyboard.TL_inlineButtonTypeUrl();
                            tL_inlineButtonTypeUrl.url = trim2;
                            p3Var.a(trim, tL_inlineButtonTypeUrl);
                            return;
                        default:
                            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = new TL_keyboard.TL_inlineButtonTypeCopy();
                            tL_inlineButtonTypeCopy.copy_text = trim2;
                            p3Var.a(trim, tL_inlineButtonTypeCopy);
                            return;
                    }
                }
                return;
            case 4:
                tf.u0 u0Var = (tf.u0) this.f41940b;
                TLRPC.User user = (TLRPC.User) this.d;
                u0Var.getClass();
                ((boolean[]) this.f41941c)[0] = true;
                if (user != null) {
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(u0Var.f44905f).edit();
                    edit.putBoolean("inlinegeo_" + user.f19306id, true).commit();
                    u0Var.G();
                    return;
                }
                return;
        }
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        ArrayList<TLRPC.Document> arrayList2;
        ArrayList<TLRPC.Document> arrayList3;
        boolean z4;
        ArrayList arrayList4;
        ArrayList arrayList5 = arrayList;
        m1 m1Var = (m1) this.f41940b;
        MediaDataController mediaDataController = (MediaDataController) this.d;
        ArrayList arrayList6 = m1Var.h;
        SparseIntArray sparseIntArray = m1Var.f42004y;
        ArrayList arrayList7 = m1Var.f41999n;
        n1 n1Var = m1Var.K;
        ArrayList arrayList8 = m1Var.v;
        HashSet hashSet = m1Var.I;
        ArrayList arrayList9 = m1Var.f42001s;
        if (!TextUtils.equals((String) this.f41941c, m1Var.E)) {
            return;
        }
        ArrayList<Emoji.EmojiSpanRange> parseEmojis = Emoji.parseEmojis(m1Var.E);
        for (int i10 = 0; i10 < parseEmojis.size(); i10++) {
            try {
                MediaDataController.KeywordResult keywordResult = new MediaDataController.KeywordResult();
                keywordResult.emoji = parseEmojis.get(i10).code.toString();
                arrayList5.add(keywordResult);
            } catch (Exception unused) {
            }
        }
        m1Var.f42003x = 0;
        arrayList9.clear();
        arrayList8.clear();
        sparseIntArray.clear();
        arrayList7.clear();
        m1Var.f42003x++;
        arrayList9.add(null);
        arrayList8.add(0L);
        if (n1Var.f41768a == 0) {
            hashSet.clear();
            for (int i11 = 0; i11 < arrayList5.size(); i11++) {
                MediaDataController.KeywordResult keywordResult2 = (MediaDataController.KeywordResult) arrayList5.get(i11);
                String str2 = keywordResult2.emoji;
                if (str2 != null && !str2.startsWith("animated_") && (arrayList4 = (ArrayList) m1Var.d.get(keywordResult2.emoji)) != null) {
                    hashSet.addAll(arrayList4);
                }
            }
            arrayList8.addAll(hashSet);
            for (int i12 = 0; i12 < hashSet.size(); i12++) {
                arrayList9.add(null);
            }
            m1Var.f42003x = hashSet.size() + m1Var.f42003x;
        } else {
            HashMap<String, ArrayList<TLRPC.Document>> allStickers = mediaDataController.getAllStickers();
            for (int i13 = 0; i13 < arrayList5.size(); i13++) {
                MediaDataController.KeywordResult keywordResult3 = (MediaDataController.KeywordResult) arrayList5.get(i13);
                String str3 = keywordResult3.emoji;
                if (str3 != null && !str3.startsWith("animated_") && (arrayList3 = allStickers.get(keywordResult3.emoji)) != null && !arrayList3.isEmpty()) {
                    for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                        TLRPC.Document document = arrayList3.get(i14);
                        if (document != null && !arrayList9.contains(document)) {
                            arrayList9.add(document);
                            m1Var.f42003x++;
                        }
                    }
                }
            }
            ArrayList<TLRPC.StickerSetCovered> featuredStickerSets = mediaDataController.getFeaturedStickerSets();
            int i15 = 0;
            while (i15 < arrayList5.size()) {
                MediaDataController.KeywordResult keywordResult4 = (MediaDataController.KeywordResult) arrayList5.get(i15);
                String str4 = keywordResult4.emoji;
                if (str4 != null && !str4.startsWith("animated_")) {
                    for (int i16 = 0; i16 < featuredStickerSets.size(); i16++) {
                        TLRPC.StickerSetCovered stickerSetCovered = featuredStickerSets.get(i16);
                        if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                            arrayList2 = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                        } else if (!stickerSetCovered.covers.isEmpty()) {
                            arrayList2 = stickerSetCovered.covers;
                        } else if (stickerSetCovered.cover != null) {
                            ArrayList<TLRPC.Document> arrayList10 = new ArrayList<>();
                            arrayList10.add(stickerSetCovered.cover);
                            arrayList2 = arrayList10;
                        }
                        for (int i17 = 0; i17 < arrayList2.size(); i17++) {
                            String findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(arrayList2.get(i17), null);
                            if (findAnimatedEmojiEmoticon != null && findAnimatedEmojiEmoticon.contains(keywordResult4.emoji)) {
                                arrayList9.add(arrayList2.get(i17));
                                m1Var.f42003x++;
                            }
                        }
                    }
                }
                i15++;
                arrayList5 = arrayList;
            }
        }
        String translitSafe = AndroidUtilities.translitSafe((m1Var.E + "").toLowerCase());
        for (int i18 = 0; i18 < arrayList6.size(); i18++) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList6.get(i18);
            if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                String translitSafe2 = AndroidUtilities.translitSafe((tL_messages_stickerSet.set.title + "").toLowerCase());
                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.y3.w(" ", translitSafe, translitSafe2)) {
                    int size = arrayList7.size();
                    arrayList7.add(tL_messages_stickerSet);
                    sparseIntArray.put(m1Var.f42003x, size);
                    arrayList9.add(null);
                    m1Var.f42003x++;
                    arrayList9.addAll(tL_messages_stickerSet.documents);
                    m1Var.f42003x = tL_messages_stickerSet.documents.size() + m1Var.f42003x;
                }
            }
        }
        if (arrayList8.size() <= 1 && arrayList9.size() <= 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        m1Var.f42002w = z4;
        if (z4) {
            m1Var.f42003x++;
        }
        if (!z4) {
            m1Var.H++;
        }
        m1Var.F = m1Var.E;
        m1Var.l();
        d1.v1(n1Var.f42035b, 0, 0);
        n1Var.f42037f.c(false);
        n1Var.e.n(false);
    }

    public l1(rh.k2 k2Var, cd0 cd0Var, String str) {
        this.f41939a = 3;
        this.f41940b = k2Var;
        this.d = cd0Var;
        this.f41941c = str;
    }
}
