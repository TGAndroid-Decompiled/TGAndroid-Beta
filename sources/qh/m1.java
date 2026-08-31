package qh;

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
import org.telegram.ui.Components.dd0;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.wk;
import org.telegram.ui.ko0;
import org.telegram.ui.yh;
public final class m1 implements MediaDataController.KeywordResultCallback, org.telegram.ui.ActionBar.c2, ko0, wk {
    public final int f45657a;
    public final Object f45658b;
    public final Object f45659c;
    public final Object d;

    public m1(Object obj, Object obj2, Object obj3, int i10) {
        this.f45657a = i10;
        this.f45658b = obj;
        this.f45659c = obj2;
        this.d = obj3;
    }

    @Override
    public void a(int i10) {
        sh.k2 k2Var = (sh.k2) this.f45658b;
        dd0 dd0Var = (dd0) this.d;
        String str = (String) this.f45659c;
        if (i10 != 3) {
            dd0Var.dismiss();
        }
        k2Var.d.f47612x.C(str, yh.B(i10).toLowerCase(Locale.ROOT), false);
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z4, int i11, long j10) {
        switch (this.f45657a) {
            case 5:
                wh.q qVar = (wh.q) this.f45658b;
                wh.a aVar = (wh.a) this.f45659c;
                mi miVar = (mi) this.d;
                wh.r3 r3Var = qVar.f49929r;
                if (messageMedia != null && messageMedia.geo != null) {
                    wh.d2 d2Var = r3Var.G3;
                    if (d2Var != null) {
                        d2Var.d();
                    }
                    TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) aVar.f49616b;
                    pageblockmap.geo = messageMedia.geo;
                    pageblockmap.zoom = 15;
                    if (pageblockmap.f21066w <= 0 || pageblockmap.h <= 0) {
                        pageblockmap.f21066w = 600;
                        pageblockmap.h = 400;
                    }
                    wh.d2 d2Var2 = r3Var.G3;
                    if (d2Var2 != null) {
                        d2Var2.h();
                    }
                    qVar.V(true);
                    miVar.dismiss(true);
                    r3Var.post(new wh.g(qVar, aVar, 0));
                    return;
                }
                return;
            default:
                wh.z1 z1Var = (wh.z1) this.f45658b;
                wh.a aVar2 = (wh.a) this.f45659c;
                mi miVar2 = (mi) this.d;
                if (messageMedia != null && messageMedia.geo != null) {
                    wh.d2 d2Var3 = z1Var.M.G3;
                    if (d2Var3 != null) {
                        d2Var3.d();
                    }
                    TL_iv.pageBlockMap pageblockmap2 = (TL_iv.pageBlockMap) aVar2.f49616b;
                    pageblockmap2.geo = messageMedia.geo;
                    pageblockmap2.zoom = 15;
                    if (pageblockmap2.f21066w <= 0 || pageblockmap2.h <= 0) {
                        pageblockmap2.f21066w = 600;
                        pageblockmap2.h = 400;
                    }
                    wh.d2 d2Var4 = z1Var.M.G3;
                    if (d2Var4 != null) {
                        d2Var4.h();
                    }
                    miVar2.dismiss(true);
                    z1Var.M.post(new wh.j1(z1Var, aVar2, 9));
                    return;
                }
                return;
        }
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f45657a) {
            case 1:
                ((d8) this.f45658b).g1((b8) this.f45659c, (Runnable) this.d, true);
                return;
            case 2:
                Activity activity = (Activity) this.f45658b;
                boolean[] zArr = (boolean[]) this.f45659c;
                org.telegram.ui.web.s sVar = (org.telegram.ui.web.s) this.d;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    activity.startActivity(intent);
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                zArr[0] = true;
                Boolean bool = Boolean.FALSE;
                sVar.run(bool, bool);
                return;
            case 3:
            default:
                wh.y3 y3Var = (wh.y3) this.d;
                String trim = ((EditTextBoldCursor) this.f45658b).getText().toString().trim();
                String trim2 = ((EditTextBoldCursor) this.f45659c).getText().toString().trim();
                if (!TextUtils.isEmpty(trim) && !TextUtils.isEmpty(trim2)) {
                    int i11 = y3Var.f50171a;
                    wh.o3 o3Var = y3Var.f50172b;
                    switch (i11) {
                        case 1:
                            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = new TL_keyboard.TL_inlineButtonTypeUrl();
                            tL_inlineButtonTypeUrl.url = trim2;
                            o3Var.a(trim, tL_inlineButtonTypeUrl);
                            return;
                        default:
                            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = new TL_keyboard.TL_inlineButtonTypeCopy();
                            tL_inlineButtonTypeCopy.copy_text = trim2;
                            o3Var.a(trim, tL_inlineButtonTypeCopy);
                            return;
                    }
                }
                return;
            case 4:
                uf.u0 u0Var = (uf.u0) this.f45658b;
                TLRPC.User user = (TLRPC.User) this.d;
                u0Var.getClass();
                ((boolean[]) this.f45659c)[0] = true;
                if (user != null) {
                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(u0Var.f48700f).edit();
                    edit.putBoolean("inlinegeo_" + user.f20990id, true).commit();
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
        n1 n1Var = (n1) this.f45658b;
        MediaDataController mediaDataController = (MediaDataController) this.d;
        ArrayList arrayList6 = n1Var.h;
        SparseIntArray sparseIntArray = n1Var.f45763y;
        ArrayList arrayList7 = n1Var.f45758n;
        o1 o1Var = n1Var.K;
        ArrayList arrayList8 = n1Var.v;
        HashSet hashSet = n1Var.I;
        ArrayList arrayList9 = n1Var.f45760s;
        if (!TextUtils.equals((String) this.f45659c, n1Var.E)) {
            return;
        }
        ArrayList<Emoji.EmojiSpanRange> parseEmojis = Emoji.parseEmojis(n1Var.E);
        for (int i10 = 0; i10 < parseEmojis.size(); i10++) {
            try {
                MediaDataController.KeywordResult keywordResult = new MediaDataController.KeywordResult();
                keywordResult.emoji = parseEmojis.get(i10).code.toString();
                arrayList5.add(keywordResult);
            } catch (Exception unused) {
            }
        }
        n1Var.f45762x = 0;
        arrayList9.clear();
        arrayList8.clear();
        sparseIntArray.clear();
        arrayList7.clear();
        n1Var.f45762x++;
        arrayList9.add(null);
        arrayList8.add(0L);
        if (o1Var.f45454a == 0) {
            hashSet.clear();
            for (int i11 = 0; i11 < arrayList5.size(); i11++) {
                MediaDataController.KeywordResult keywordResult2 = (MediaDataController.KeywordResult) arrayList5.get(i11);
                String str2 = keywordResult2.emoji;
                if (str2 != null && !str2.startsWith("animated_") && (arrayList4 = (ArrayList) n1Var.d.get(keywordResult2.emoji)) != null) {
                    hashSet.addAll(arrayList4);
                }
            }
            arrayList8.addAll(hashSet);
            for (int i12 = 0; i12 < hashSet.size(); i12++) {
                arrayList9.add(null);
            }
            n1Var.f45762x = hashSet.size() + n1Var.f45762x;
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
                            n1Var.f45762x++;
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
                                n1Var.f45762x++;
                            }
                        }
                    }
                }
                i15++;
                arrayList5 = arrayList;
            }
        }
        String translitSafe = AndroidUtilities.translitSafe((n1Var.E + "").toLowerCase());
        for (int i18 = 0; i18 < arrayList6.size(); i18++) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList6.get(i18);
            if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                String translitSafe2 = AndroidUtilities.translitSafe((tL_messages_stickerSet.set.title + "").toLowerCase());
                if (translitSafe2.startsWith(translitSafe) || org.telegram.messenger.y3.w(" ", translitSafe, translitSafe2)) {
                    int size = arrayList7.size();
                    arrayList7.add(tL_messages_stickerSet);
                    sparseIntArray.put(n1Var.f45762x, size);
                    arrayList9.add(null);
                    n1Var.f45762x++;
                    arrayList9.addAll(tL_messages_stickerSet.documents);
                    n1Var.f45762x = tL_messages_stickerSet.documents.size() + n1Var.f45762x;
                }
            }
        }
        if (arrayList8.size() <= 1 && arrayList9.size() <= 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        n1Var.f45761w = z4;
        if (z4) {
            n1Var.f45762x++;
        }
        if (!z4) {
            n1Var.H++;
        }
        n1Var.F = n1Var.E;
        n1Var.l();
        d1.w1(o1Var.f45820b, 0, 0);
        o1Var.f45823f.c(false);
        o1Var.f45822e.n(false);
    }

    public m1(sh.k2 k2Var, dd0 dd0Var, String str) {
        this.f45657a = 3;
        this.f45658b = k2Var;
        this.d = dd0Var;
        this.f45659c = str;
    }
}
