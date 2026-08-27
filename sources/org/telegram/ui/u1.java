package org.telegram.ui;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class u1 implements Runnable {

    public final int f43062a;

    public final Object f43063b;

    public final Object f43064c;
    public final Object d;

    public u1(Object obj, Object obj2, Object obj3, int i10) {
        this.f43062a = i10;
        this.d = obj;
        this.f43063b = obj2;
        this.f43064c = obj3;
    }

    @Override
    public final void run() {
        String str;
        String strExtractMetadata;
        ArrayList arrayList;
        char c10;
        switch (this.f43062a) {
            case 0:
                ArticleViewer$BlockEmbedCell$TelegramWebviewProxy articleViewer$BlockEmbedCell$TelegramWebviewProxy = (ArticleViewer$BlockEmbedCell$TelegramWebviewProxy) this.d;
                String str2 = (String) this.f43063b;
                String str3 = (String) this.f43064c;
                w1 w1Var = articleViewer$BlockEmbedCell$TelegramWebviewProxy.f24023a;
                if ("resize_frame".equals(str2)) {
                    try {
                        w1Var.f43567r = Utilities.parseInt((CharSequence) new JSONObject(str3).getString("height")).intValue();
                        w1Var.requestLayout();
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                return;
            case 1:
                PaymentFormActivity$TelegramWebviewProxy paymentFormActivity$TelegramWebviewProxy = (PaymentFormActivity$TelegramWebviewProxy) this.d;
                String str4 = (String) this.f43063b;
                String str5 = (String) this.f43064c;
                do0 do0Var = paymentFormActivity$TelegramWebviewProxy.f35581a;
                if (do0Var.getParentActivity() != null && str4.equals("payment_form_submit")) {
                    try {
                        JSONObject jSONObject = new JSONObject(str5);
                        do0Var.f37478s0 = jSONObject.getJSONObject("credentials").toString();
                        do0Var.f37479t0 = jSONObject.getString("title");
                        break;
                    } catch (Throwable th) {
                        do0Var.f37478s0 = str5;
                        FileLog.e(th);
                    }
                    do0Var.t0();
                    return;
                }
                return;
            case 2:
                q qVar = (q) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f43063b;
                TLObject tLObject = (TLObject) this.f43064c;
                qVar.getClass();
                if (tL_error == null) {
                    qVar.X((TLRPC.TL_messages_archivedStickers) tLObject);
                    return;
                }
                return;
            case 3:
                z6 z6Var = (z6) this.d;
                ArrayList arrayList2 = (ArrayList) this.f43063b;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.f43064c;
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    ((ih.a) arrayList2.get(i10)).f11476a.delete();
                }
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.l0(15, z6Var, b2Var));
                return;
            case 4:
                s7 s7Var = (s7) this.d;
                ih.a aVar = (ih.a) this.f43063b;
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) this.f43064c;
                String strExtractMetadata2 = "";
                MediaMetadataRetriever mediaMetadataRetriever = null;
                try {
                    try {
                        MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
                        try {
                            try {
                                mediaMetadataRetriever2.setDataSource(s7Var.getContext(), Uri.fromFile(aVar.f11476a));
                                strExtractMetadata = mediaMetadataRetriever2.extractMetadata(7);
                                try {
                                    strExtractMetadata2 = mediaMetadataRetriever2.extractMetadata(2);
                                    try {
                                        mediaMetadataRetriever2.release();
                                        break;
                                    } catch (Throwable unused2) {
                                    }
                                } catch (Exception e9) {
                                    e = e9;
                                    str = strExtractMetadata;
                                    mediaMetadataRetriever = mediaMetadataRetriever2;
                                    FileLog.e(e);
                                    if (mediaMetadataRetriever != null) {
                                        try {
                                            mediaMetadataRetriever.release();
                                            break;
                                        } catch (Throwable unused3) {
                                        }
                                    }
                                    strExtractMetadata = str;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                mediaMetadataRetriever = mediaMetadataRetriever2;
                                if (mediaMetadataRetriever != null) {
                                    try {
                                        mediaMetadataRetriever.release();
                                        break;
                                    } catch (Throwable unused4) {
                                    }
                                }
                                throw th;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            mediaMetadataRetriever = mediaMetadataRetriever2;
                            str = "";
                            FileLog.e(e);
                            if (mediaMetadataRetriever != null) {
                                mediaMetadataRetriever.release();
                                break;
                            }
                            strExtractMetadata = str;
                            AndroidUtilities.runOnUIThread(new cg.k0(s7Var, aVar, tL_documentAttributeAudio, strExtractMetadata, strExtractMetadata2, 20));
                            return;
                        }
                    } catch (Exception e11) {
                        e = e11;
                    }
                    AndroidUtilities.runOnUIThread(new cg.k0(s7Var, aVar, tL_documentAttributeAudio, strExtractMetadata, strExtractMetadata2, 20));
                    return;
                } catch (Throwable th3) {
                    th = th3;
                }
                break;
            case 5:
                c8 c8Var = (c8) this.d;
                rn rnVar = (rn) this.f43063b;
                f8 f8Var = (f8) this.f43064c;
                c8Var.f36993b.f37662x.finishFragment();
                rnVar.G9(f8Var.h);
                return;
            case 6:
                j9.W((j9) this.d, (TLRPC.TL_error) this.f43063b, (TLObject) this.f43064c);
                return;
            case 7:
                String[] strArr = (String[]) this.d;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f43063b;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f43064c;
                AndroidUtilities.addToClipboard(strArr[0]);
                org.telegram.messenger.rl.m(R.string.LinkCopied, new org.telegram.ui.Components.mc(e3Var.topBulletinContainer, c6Var));
                return;
            case 8:
                na.X((na) this.d, (org.telegram.ui.ActionBar.b2) this.f43063b, (TLRPC.User) this.f43064c);
                return;
            case 9:
                qb.Z((qb) this.d, (TLRPC.TL_error) this.f43063b, (TLObject) this.f43064c);
                return;
            case 10:
                vc vcVar = (vc) this.d;
                TLObject tLObject2 = (TLObject) this.f43063b;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f43064c;
                HashMap map = vcVar.f43423w;
                if (!(tLObject2 instanceof TLRPC.TL_wallPaper)) {
                    f6Var.f22950f = true;
                    return;
                }
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject2;
                String attachFileName = FileLoader.getAttachFileName(wallPaper.document);
                if (map.containsKey(attachFileName)) {
                    return;
                }
                map.put(attachFileName, f6Var);
                FileLoader.getInstance(f6Var.A).loadFile(wallPaper.document, wallPaper, 1, 1);
                return;
            case 11:
                id idVar = (id) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f43063b;
                TLObject tLObject3 = (TLObject) this.f43064c;
                if (tL_error2 == null) {
                    idVar.getClass();
                    idVar.Y = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvites) tLObject3).invites.get(0);
                }
                idVar.X = false;
                org.telegram.ui.Components.i80 i80Var = idVar.L;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = idVar.Y;
                i80Var.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
                return;
            case 12:
                fe feVar = (fe) this.d;
                TLObject tLObject4 = (TLObject) this.f43063b;
                Context context = (Context) this.f43064c;
                if (tLObject4 instanceof TLRPC.TL_payments_starsRevenueAdsAccountUrl) {
                    we.e.s(context, ((TLRPC.TL_payments_starsRevenueAdsAccountUrl) tLObject4).url);
                }
                AndroidUtilities.runOnUIThread(new kd(feVar, 5), 1000L);
                return;
            case 13:
                ((q91) this.d).showDialog(fe.d0((Context) this.f43063b, (org.telegram.ui.ActionBar.c6) this.f43064c, false));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new rd(3, (hh.i2) this.f43064c, ((rn) this.d).getMessagesStorage().getUser(((TLRPC.TL_contact) this.f43063b).user_id)));
                return;
            case 15:
                rn.J0((rn) this.d, (TLRPC.User) this.f43063b, (TLRPC.EmojiStatus) this.f43064c);
                return;
            case 16:
                rn rnVar2 = (rn) this.d;
                org.telegram.ui.Components.ol0 ol0Var = (org.telegram.ui.Components.ol0) this.f43063b;
                TLRPC.User user = (TLRPC.User) this.f43064c;
                rnVar2.getClass();
                ol0Var.dismiss();
                rnVar2.presentFragment(ProfileActivity.m4(user.f22527id));
                return;
            case 17:
                rn rnVar3 = (rn) this.d;
                org.telegram.ui.Components.b70 b70Var = (org.telegram.ui.Components.b70) this.f43064c;
                String str6 = (String) this.f43063b;
                b70Var.u();
                oj0 oj0Var = new oj0(rnVar3.getParentActivity(), rnVar3);
                oj0Var.w(str6, false);
                oj0Var.show();
                return;
            case 18:
                rn rnVar4 = (rn) this.d;
                TLRPC.SuggestedPost suggestedPost = (TLRPC.SuggestedPost) this.f43063b;
                org.telegram.ui.Components.y4.T(rnVar4.getParentActivity(), suggestedPost != null ? suggestedPost.schedule_date : 0L, new b7(rnVar4, suggestedPost, (MessageObject) this.f43064c, 5), rnVar4.getResourceProvider(), 0).f23994a.show();
                return;
            case 19:
                rn.f0((rn) this.d, (hf.a) this.f43063b, (Runnable) this.f43064c);
                return;
            case 20:
                rn.l0((rn) this.d, (TLObject) this.f43063b, (TLRPC.User) this.f43064c);
                return;
            case 21:
                rn rnVar5 = (rn) this.d;
                org.telegram.ui.Components.y4.f0(rnVar5.currentAccount, (TLRPC.TL_error) this.f43063b, rnVar5, (TLRPC.TL_messages_editMessage) this.f43064c, new Object[0]);
                return;
            case 22:
                rn rnVar6 = (rn) this.d;
                MessagesStorage messagesStorage = (MessagesStorage) this.f43063b;
                CountDownLatch countDownLatch = (CountDownLatch) this.f43064c;
                rnVar6.f42039f = messagesStorage.getUser(rnVar6.h.user_id);
                countDownLatch.countDown();
                return;
            case 23:
                tl tlVar = (tl) this.d;
                TLObject tLObject5 = (TLObject) this.f43063b;
                MessageObject messageObject = (MessageObject) this.f43064c;
                ul ulVar = tlVar.f42962c;
                if (tLObject5 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject5;
                    rn rnVar7 = ulVar.f43247a.M;
                    rnVar7.getMessagesController().putUsers(tL_photos_photo.users, false);
                    TLRPC.User user2 = rnVar7.getMessagesController().getUser(Long.valueOf(rnVar7.getUserConfig().clientUserId));
                    if ((tL_photos_photo.photo instanceof TLRPC.TL_photo) && user2 != null) {
                        gf.l0.a(messageObject.messageOwner.action.photo, user2, false);
                        rnVar7.getUserConfig().setCurrentUser(user2);
                        rnVar7.getUserConfig().saveConfig(true);
                        org.telegram.ui.Components.mc.a0(rnVar7).V(Collections.singletonList(user2), AndroidUtilities.replaceTags(LocaleController.getString(R.string.ApplyAvatarHintTitle)), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ApplyAvatarHint), new ti(tlVar, 5)), null).j();
                    }
                }
                messageObject.settingAvatar = false;
                return;
            case 24:
                dn.a((dn) this.d, (org.telegram.ui.Cells.s1) this.f43063b, (TLRPC.Document) this.f43064c);
                return;
            case 25:
                ((dn) this.d).n((org.telegram.ui.Cells.s1) this.f43063b, (TLRPC.User) this.f43064c);
                return;
            case 26:
                ((dn) this.d).m((org.telegram.ui.Cells.s1) this.f43063b, (TLRPC.Chat) this.f43064c, 0, false);
                return;
            case 27:
                jo joVar = (jo) this.d;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f43063b;
                TLObject tLObject6 = (TLObject) this.f43064c;
                joVar.getClass();
                if (tL_error3 == null) {
                    joVar.f39430u0.invitesCount = ((TLRPC.TL_messages_exportedChatInvites) tLObject6).count;
                    joVar.getMessagesStorage().saveChatLinksCount(joVar.f39428s0, joVar.f39430u0.invitesCount);
                    joVar.p0(false, false);
                    return;
                }
                return;
            case 28:
                ip ipVar = (ip) this.d;
                String str7 = (String) this.f43063b;
                ArrayList arrayList3 = (ArrayList) this.f43064c;
                ipVar.getClass();
                String lowerCase = str7.trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new u1(ipVar, new ArrayList(), new ArrayList(), 29));
                    return;
                }
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                if (lowerCase.equals(translitString) || translitString.length() == 0) {
                    translitString = null;
                }
                int i11 = (translitString != null ? 1 : 0) + 1;
                String[] strArr2 = new String[i11];
                strArr2[0] = lowerCase;
                if (translitString != null) {
                    strArr2[1] = translitString;
                }
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                int i12 = 0;
                while (i12 < arrayList3.size()) {
                    TLRPC.Chat chat = (TLRPC.Chat) arrayList3.get(i12);
                    String lowerCase2 = chat.title.toLowerCase();
                    String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                    if (lowerCase2.equals(translitString2)) {
                        translitString2 = null;
                    }
                    int i13 = 0;
                    String str8 = null;
                    char c11 = 0;
                    while (true) {
                        if (i13 >= i11) {
                            arrayList = arrayList3;
                        }
                        String str9 = strArr2[i13];
                        if (lowerCase2.startsWith(str9) || org.telegram.messenger.y1.x(" ", str9, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str9) || org.telegram.messenger.y1.x(" ", str9, translitString2)))) {
                            arrayList = arrayList3;
                            c10 = 1;
                        } else {
                            String str10 = chat.username;
                            if (str10 == null || !str10.startsWith(str9)) {
                                ArrayList<TLRPC.TL_username> arrayList6 = chat.usernames;
                                if (arrayList6 != null && !arrayList6.isEmpty()) {
                                    int i14 = 0;
                                    while (true) {
                                        if (i14 < chat.usernames.size()) {
                                            TLRPC.TL_username tL_username = chat.usernames.get(i14);
                                            arrayList = arrayList3;
                                            if (tL_username.active && tL_username.username.startsWith(str9)) {
                                                str8 = tL_username.username;
                                            } else {
                                                i14++;
                                                arrayList3 = arrayList;
                                            }
                                        }
                                    }
                                }
                                arrayList = arrayList3;
                                c10 = c11;
                            } else {
                                str8 = chat.username;
                                arrayList = arrayList3;
                            }
                            c10 = 2;
                        }
                        if (c10 != 0) {
                            if (c10 == 1) {
                                arrayList5.add(AndroidUtilities.generateSearchName(chat.title, null, str9));
                            } else {
                                arrayList5.add(AndroidUtilities.generateSearchName(s3.c.e("@", str8), null, "@" + str9));
                            }
                            arrayList4.add(chat);
                        }
                        i13++;
                        c11 = c10;
                        arrayList3 = arrayList;
                        break;
                        break;
                    }
                    i12++;
                    arrayList3 = arrayList;
                }
                AndroidUtilities.runOnUIThread(new u1(ipVar, arrayList4, arrayList5, 29));
                return;
            default:
                ip.E((ip) this.d, (ArrayList) this.f43063b, (ArrayList) this.f43064c);
                return;
        }
    }

    public u1(rn rnVar, org.telegram.ui.Components.b70 b70Var, String str) {
        this.f43062a = 17;
        this.d = rnVar;
        this.f43064c = b70Var;
        this.f43063b = str;
    }
}
