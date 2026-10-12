package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.logging.Logger;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.zc;
public final class ss0 implements Runnable {
    public final int f40207a;
    public final Object f40208b;
    public final Object f40209c;
    public final Object d;
    public final Object e;

    public ss0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f40207a = i10;
        this.f40209c = obj;
        this.f40208b = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run() {
        Uri fromFile;
        TLObject chat;
        int indexOf;
        TLObject chat2;
        int i10;
        String formatPluralString;
        org.telegram.ui.web.b1 b1Var;
        int i11 = this.f40207a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f40208b;
        Object obj4 = this.f40209c;
        switch (i11) {
            case 0:
                TLObject tLObject = (TLObject) obj3;
                UserConfig userConfig = (UserConfig) obj2;
                TLRPC.Photo photo = (TLRPC.Photo) obj;
                PhotoViewer photoViewer = ((zs0) obj4).f42710b;
                if (tLObject instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                    int i12 = photoViewer.T;
                    ArrayList arrayList = photoViewer.f7;
                    MessagesController.getInstance(i12).putUsers(tL_photos_photo.users, false);
                    TLRPC.User user = MessagesController.getInstance(photoViewer.T).getUser(Long.valueOf(userConfig.clientUserId));
                    if (tL_photos_photo.photo instanceof TLRPC.TL_photo) {
                        int indexOf2 = arrayList.indexOf(photo);
                        if (indexOf2 >= 0) {
                            arrayList.set(indexOf2, tL_photos_photo.photo);
                        }
                        if (user != null) {
                            user.photo.photo_id = tL_photos_photo.photo.f19240id;
                            userConfig.setCurrentUser(user);
                            userConfig.saveConfig(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                zw0.U((zw0) obj4, (TLRPC.TL_error) obj2, (TLObject) obj3, (TL_stars.updatePaidMessagesPrice) obj);
                return;
            case 2:
                PrivacyControlActivity.V((PrivacyControlActivity) obj4, (TLRPC.TL_error) obj2, (TLObject) obj3, (boolean[]) obj);
                return;
            case 3:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj4;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) obj2;
                TLObject tLObject2 = (TLObject) obj3;
                TL_account.setAccountTTL setaccountttl = (TL_account.setAccountTTL) obj;
                privacySettingsActivity.getClass();
                try {
                    a2Var.dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                    privacySettingsActivity.Q = true;
                    privacySettingsActivity.getContactsController().setDeleteAccountTTL(setaccountttl.ttl.days);
                    privacySettingsActivity.f32515a.l();
                    return;
                }
                return;
            case 4:
                boolean[] zArr = (boolean[]) obj3;
                Activity activity = (Activity) obj2;
                File file = (File) obj;
                try {
                    ((org.telegram.ui.ActionBar.a2) obj4).dismiss();
                } catch (Exception unused) {
                }
                if (zArr[0]) {
                    int i13 = Build.VERSION.SDK_INT;
                    if (i13 >= 24) {
                        fromFile = FileProvider.d(activity, ApplicationLoader.getApplicationId() + ".provider", file);
                    } else {
                        fromFile = Uri.fromFile(file);
                    }
                    Intent intent = new Intent("android.intent.action.SEND");
                    if (i13 >= 24) {
                        intent.addFlags(1);
                    }
                    intent.setType("message/rfc822");
                    intent.putExtra("android.intent.extra.EMAIL", "");
                    intent.putExtra("android.intent.extra.SUBJECT", "Logs from " + LocaleController.getInstance().getFormatterStats().format(System.currentTimeMillis()));
                    intent.putExtra("android.intent.extra.STREAM", fromFile);
                    if (activity != null) {
                        try {
                            activity.startActivityForResult(Intent.createChooser(intent, "Select email application."), 500);
                            return;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            return;
                        }
                    }
                    return;
                } else if (activity != null) {
                    Toast.makeText(activity, LocaleController.getString(R.string.ErrorOccurred), 0).show();
                    return;
                } else {
                    return;
                }
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int[] iArr = (int[]) obj;
                if (!(((TLObject) obj3) instanceof TLRPC.TL_boolTrue)) {
                    profileActivity.getClass();
                    org.telegram.ui.Components.zc.a0(profileActivity).f0(tL_error, false);
                }
                if (profileActivity.f32631o4 == iArr[0]) {
                    profileActivity.f32631o4 = 0;
                    return;
                }
                return;
            case 6:
                ProfileActivity profileActivity2 = (ProfileActivity) obj4;
                TLObject tLObject3 = (TLObject) obj3;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                if (tLObject3 instanceof TL_fragment.TL_collectibleInfo) {
                    if (profileActivity2.f32559e1 != 0) {
                        chat = profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.f32559e1));
                    } else {
                        chat = profileActivity2.getMessagesController().getChat(Long.valueOf(profileActivity2.f32567f1));
                    }
                    m20.a(profileActivity2.getParentActivity(), 0, tL_username.username, chat, (TL_fragment.TL_collectibleInfo) tLObject3, profileActivity2.f32703z0);
                    return;
                }
                org.telegram.ui.Components.zc.d0(tL_error2);
                return;
            case 7:
                ProfileActivity profileActivity3 = (ProfileActivity) obj4;
                String[] strArr = (String[]) obj3;
                String str = (String) obj2;
                String str2 = (String) obj;
                if (AndroidUtilities.isContextSafe(profileActivity3.getParentActivity())) {
                    org.telegram.ui.Components.x41.L(profileActivity3.getParentActivity(), profileActivity3, strArr[0], str, str2, new q20(profileActivity3, 2), null);
                    return;
                }
                return;
            case 8:
                ProfileActivity.n0((ProfileActivity) obj4, (TLRPC.TL_error) obj2, (TLObject) obj3, (String) obj);
                return;
            case 9:
                TLObject tLObject4 = (TLObject) obj3;
                UserConfig userConfig2 = (UserConfig) obj2;
                TLRPC.Photo photo2 = (TLRPC.Photo) obj;
                ProfileActivity profileActivity4 = ((n01) obj4).f38393b;
                profileActivity4.f32620n0.f28321c1--;
                if (tLObject4 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo2 = (TLRPC.TL_photos_photo) tLObject4;
                    profileActivity4.getMessagesController().putUsers(tL_photos_photo2.users, false);
                    TLRPC.User user2 = profileActivity4.getMessagesController().getUser(Long.valueOf(userConfig2.clientUserId));
                    TLRPC.Photo photo3 = tL_photos_photo2.photo;
                    if (photo3 instanceof TLRPC.TL_photo) {
                        ArrayList arrayList2 = profileActivity4.f32620n0.V0;
                        if (!arrayList2.isEmpty() && (indexOf = arrayList2.indexOf(photo2)) >= 0) {
                            arrayList2.set(indexOf, photo3);
                        }
                        if (user2 != null) {
                            user2.photo.photo_id = tL_photos_photo2.photo.f19240id;
                            userConfig2.setCurrentUser(user2);
                            userConfig2.saveConfig(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 10:
                TLObject tLObject5 = (TLObject) obj3;
                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                ProfileActivity profileActivity5 = ((y01) obj4).f42001c.e;
                profileActivity5.M4(null);
                if (tLObject5 instanceof TL_fragment.TL_collectibleInfo) {
                    if (profileActivity5.f32559e1 != 0) {
                        chat2 = profileActivity5.getMessagesController().getUser(Long.valueOf(profileActivity5.f32559e1));
                    } else {
                        chat2 = profileActivity5.getMessagesController().getChat(Long.valueOf(profileActivity5.f32567f1));
                    }
                    TLObject tLObject6 = chat2;
                    if (profileActivity5.getParentActivity() != null) {
                        m20.a(profileActivity5.getParentActivity(), 0, tL_username2.username, tLObject6, (TL_fragment.TL_collectibleInfo) tLObject5, profileActivity5.f32703z0);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Components.zc.d0(tL_error3);
                return;
            case 11:
                SessionsActivity sessionsActivity = (SessionsActivity) obj4;
                org.telegram.ui.ActionBar.a2 a2Var2 = (org.telegram.ui.ActionBar.a2) obj3;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) obj;
                sessionsActivity.getClass();
                try {
                    a2Var2.dismiss();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (tL_error4 == null) {
                    sessionsActivity.e.remove(tL_webAuthorization);
                    sessionsActivity.m0();
                    a91 a91Var = sessionsActivity.f32787a;
                    if (a91Var != null) {
                        a91Var.l();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                SessionsActivity sessionsActivity2 = (SessionsActivity) obj4;
                org.telegram.ui.ActionBar.a2 a2Var3 = (org.telegram.ui.ActionBar.a2) obj3;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                sessionsActivity2.getClass();
                try {
                    a2Var3.dismiss();
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                if (tL_error5 == null) {
                    sessionsActivity2.e.remove(tL_authorization);
                    sessionsActivity2.f32790f.remove(tL_authorization);
                    sessionsActivity2.m0();
                    a91 a91Var2 = sessionsActivity2.f32787a;
                    if (a91Var2 != null) {
                        a91Var2.l();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                z81 z81Var = (z81) obj4;
                z81Var.f42544a = (TLObject) obj3;
                z81Var.f42545b = (TLRPC.TL_error) obj2;
                ((o9) obj).run();
                return;
            case 14:
                o91.c0((o91) obj4, (TLRPC.TL_error) obj2, (TLObject) obj3, (String) obj);
                return;
            case 15:
                sa1 sa1Var = (sa1) obj4;
                kg.b bVar = (kg.b) obj3;
                String str3 = (String) obj2;
                gb1 gb1Var = (gb1) obj;
                hb1 hb1Var = sa1Var.f40049w;
                if (bVar != null) {
                    hb1Var.V.put(str3, bVar);
                }
                if (bVar != null && !gb1Var.f36371b && (i10 = gb1Var.f36370a) >= 0) {
                    View m10 = hb1Var.U.m(i10);
                    if (m10 instanceof sa1) {
                        sa1Var.f39723r.e = bVar;
                        sa1 sa1Var2 = (sa1) m10;
                        sa1Var2.f39719b.f13064t0.d(false, false);
                        sa1Var2.g(false);
                    }
                }
                hb1.Z(hb1Var);
                return;
            case 16:
                ta1 ta1Var = (ta1) obj4;
                ta1Var.f40341k = false;
                ta1Var.d = (kg.b) obj3;
                ta1Var.f40338g = (String) obj2;
                ra1 ra1Var = (ra1) ((Utilities.Callback0Return) obj).run();
                if (ra1Var != null) {
                    ra1Var.e(ta1Var, true);
                    return;
                }
                return;
            case 17:
                TLObject tLObject7 = (TLObject) obj3;
                String str4 = (String) obj2;
                org.telegram.ui.ActionBar.a2 a2Var4 = (org.telegram.ui.ActionBar.a2) obj;
                hf1 hf1Var = ((df1) obj4).f35249a;
                if (tLObject7 != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject7;
                    for (int i14 = 0; i14 < updates.updates.size(); i14++) {
                        if (updates.updates.get(i14) instanceof TL_update.TL_updateMessageID) {
                            TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) updates.updates.get(i14);
                            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = new TLRPC.TL_messageActionTopicCreate();
                            tL_messageActionTopicCreate.title = str4;
                            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                            tL_messageService.action = tL_messageActionTopicCreate;
                            tL_messageService.peer_id = hf1Var.getMessagesController().getPeer(hf1Var.f36780a);
                            tL_messageService.dialog_id = hf1Var.f36780a;
                            tL_messageService.f19237id = tL_updateMessageID.f19470id;
                            tL_messageService.date = (int) (System.currentTimeMillis() / 1000);
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(new MessageObject(hf1.X(hf1Var), tL_messageService, false, false));
                            TLRPC.Chat chat3 = hf1Var.getMessagesController().getChat(Long.valueOf(-hf1Var.f36780a));
                            TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                            tL_forumTopic.f19268id = tL_updateMessageID.f19470id;
                            long j10 = hf1Var.f36781b;
                            if (j10 != 0) {
                                tL_forumTopic.icon_emoji_id = j10;
                                tL_forumTopic.flags |= 1;
                            }
                            tL_forumTopic.my = true;
                            tL_forumTopic.flags |= 2;
                            tL_forumTopic.topicStartMessage = tL_messageService;
                            tL_forumTopic.title = str4;
                            tL_forumTopic.top_message = tL_messageService.f19237id;
                            tL_forumTopic.topMessage = tL_messageService;
                            tL_forumTopic.from_id = hf1Var.getMessagesController().getPeer(hf1Var.getUserConfig().clientUserId);
                            tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
                            tL_forumTopic.icon_color = hf1Var.E;
                            fo foVar = hf1Var.f36789y;
                            if (foVar != null) {
                                foVar.Pa();
                                foVar.Ta();
                                foVar.tb(arrayList3, chat3, tL_messageService.f19237id, 1, 1, tL_forumTopic);
                                foVar.f35897c = true;
                                foVar.v8();
                                foVar.Rc(true);
                                foVar.f35872a1.n(true);
                                foVar.Xc();
                                foVar.R1.setCurrentTopic(foVar.d());
                                foVar.Uc(true);
                                foVar.lc(true);
                                foVar.j9(true);
                                foVar.D6(true, true);
                                foVar.Ia();
                                hf1Var.getMessagesController().getTopicsController().onTopicCreated(hf1Var.f36780a, tL_forumTopic, true);
                                hf1Var.finishFragment();
                            } else {
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", -hf1Var.f36780a);
                                bundle.putInt("message_id", 1);
                                bundle.putInt("unread_count", 0);
                                bundle.putBoolean("historyPreloaded", false);
                                fo foVar2 = new fo(bundle);
                                foVar2.tb(arrayList3, chat3, tL_messageService.f19237id, 1, 1, tL_forumTopic);
                                foVar2.f35897c = true;
                                hf1Var.getMessagesController().getTopicsController().onTopicCreated(hf1Var.f36780a, tL_forumTopic, true);
                                hf1Var.presentFragment(foVar2);
                            }
                        }
                    }
                }
                a2Var4.dismiss();
                return;
            case 18:
                TwoStepVerificationActivity.e0((TwoStepVerificationActivity) obj4, (byte[]) obj2, (TLObject) obj3, (byte[]) obj);
                return;
            case 19:
                oh1 oh1Var = (oh1) obj4;
                String str5 = (String) obj2;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj;
                if (((TLObject) obj3) instanceof TLRPC.TL_boolTrue) {
                    oh1Var.u0(new je1(7, oh1Var, str5));
                    return;
                } else if (tL_error6 != null && !tL_error6.text.startsWith("CODE_INVALID")) {
                    if (tL_error6.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error6.text).intValue();
                        if (intValue < 60) {
                            formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                        } else {
                            formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                        }
                        oh1Var.G0(LocaleController.getString(R.string.TwoStepVerificationTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                        return;
                    }
                    oh1Var.G0(LocaleController.getString(R.string.TwoStepVerificationTitle), tL_error6.text);
                    return;
                } else {
                    oh1Var.y0();
                    return;
                }
            case 20:
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) obj4;
                bi.n9 n9Var = (bi.n9) obj3;
                String str6 = (String) obj2;
                JSONObject jSONObject = (JSONObject) obj;
                if (y0Var.f41562c && ((b1Var = y0Var.Q) == null || !b1Var.o(n9Var))) {
                    FileLog.d("notifyEvent " + str6 + " dropped after document change");
                    return;
                }
                y0Var.d("window.Telegram.WebView.receiveEvent('" + str6 + "', " + jSONObject + ");");
                return;
            case 21:
                q5.a aVar = (q5.a) obj4;
                l5.i iVar = (l5.i) obj3;
                String str7 = iVar.f14580a;
                i5.g gVar = (i5.g) obj2;
                l5.h hVar = (l5.h) obj;
                aVar.getClass();
                Logger logger = q5.a.f43320f;
                try {
                    m5.e a2 = aVar.f43323c.a(str7);
                    if (a2 == null) {
                        String str8 = "Transport backend '" + str7 + "' is not registered";
                        logger.warning(str8);
                        gVar.b(new IllegalArgumentException(str8));
                    } else {
                        ((s5.g) aVar.e).f(new org.telegram.ui.Components.nz(aVar, iVar, ((j5.c) a2).a(hVar), 6));
                        gVar.b(null);
                    }
                    return;
                } catch (Exception e12) {
                    logger.warning("Error scheduling event " + e12.getMessage());
                    gVar.b(e12);
                    return;
                }
            case 22:
                qi.e eVar = (qi.e) obj4;
                ((ArrayDeque) eVar.f43662a).addLast(new qi.d((ji.m5) obj3, (qi.a) obj2, (RequestTimeDelegate) obj));
                eVar.B();
                return;
            case 23:
                rg.p2 p2Var = (rg.p2) obj4;
                p2Var.G = true;
                p2Var.H = (rg.m2[]) ((ArrayList) obj3).toArray(new rg.m2[0]);
                ((ur0) obj2).run((rg.m2) obj);
                return;
            case 24:
                rg.p2 p2Var2 = (rg.p2) obj4;
                TLObject tLObject8 = (TLObject) obj3;
                rg.n2 n2Var = (rg.n2) obj2;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj;
                if (tLObject8 instanceof TLRPC.TL_messageMediaDocument) {
                    p2Var2.getClass();
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) tLObject8;
                    n2Var.e = MediaDataController.getInputStickerSetItem(tL_messageMediaDocument.document, n2Var.f44382c);
                    n2Var.f44383f = tL_messageMediaDocument;
                    p2Var2.a();
                    return;
                }
                p2Var2.h();
                p2Var2.n(tL_error7);
                return;
            case 25:
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj4;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                TLObject tLObject9 = (TLObject) obj3;
                Utilities.Callback callback2 = (Utilities.Callback) obj;
                if (tL_error8 != null) {
                    callback.run(tL_error8);
                    return;
                } else if (tLObject9 instanceof TLRPC.payments_GiveawayInfo) {
                    callback2.run((TLRPC.payments_GiveawayInfo) tLObject9);
                    return;
                } else {
                    return;
                }
            case 26:
                final yh.m2 m2Var = (yh.m2) obj4;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj3;
                yh.h1 h1Var = (yh.h1) obj2;
                final View view = (View) obj;
                org.telegram.ui.Components.ns0 ns0Var = m2Var.f48994a;
                if (savedStarGift.unsaved) {
                    savedStarGift.unsaved = false;
                    h1Var.h(savedStarGift, true, false);
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = m2Var.e.g(savedStarGift);
                    savestargift.unsave = savedStarGift.unsaved;
                    ConnectionsManager.getInstance(m2Var.f48995b).sendRequest(savestargift, null, 64);
                }
                boolean z10 = savedStarGift.pinned_to_top;
                final boolean z11 = !z10;
                if (m2Var.e.m(savedStarGift, z11, false)) {
                    new yh.p2(m2Var.getContext(), ns0Var.f49091c, savedStarGift, m2Var.f48996c, new Utilities.Callback0Return() {
                        @Override
                        public final Object run() {
                            ((h1) view).c(z11, true);
                            m2 m2Var2 = m2.this;
                            m2Var2.f48997f.u0(0);
                            return zc.a0(m2Var2.f48994a.f49089a);
                        }
                    }).show();
                    return;
                }
                if (!z10) {
                    org.telegram.ui.Components.zc.a0(ns0Var.f49089a).M(LocaleController.getString(R.string.Gift2PinnedTitle), LocaleController.getString(R.string.Gift2PinnedSubtitle), R.raw.ic_pin).j();
                } else {
                    org.telegram.messenger.q.r(R.string.Gift2Unpinned, org.telegram.ui.Components.zc.a0(ns0Var.f49089a), R.raw.ic_unpin, 36);
                }
                ((yh.h1) view).c(z11, true);
                m2Var.f48997f.u0(0);
                return;
            case 27:
                org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) obj4;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj3;
                pf.c cVar = (pf.c) obj2;
                org.telegram.ui.ActionBar.a2 a2Var5 = (org.telegram.ui.ActionBar.a2) obj;
                if (m2Var2 != null && tL_error9 != null) {
                    org.telegram.ui.Components.zc.a0(m2Var2).f0(tL_error9, false);
                }
                if ((m2Var2 instanceof fo) && tL_error9 == null) {
                    ((fo) m2Var2).cc();
                }
                cVar.b();
                a2Var5.dismiss();
                return;
            case 28:
                zh.r3.a0((zh.r3) obj4, (boolean[]) obj3, (TL_stars.StarGiftAttribute) obj2, (org.telegram.ui.Components.bd[]) obj);
                return;
            default:
                zh.r3.S0((zh.r3) obj4, (TLObject) obj3, (org.webrtc.i) obj2, (TLRPC.TL_error) obj);
                return;
        }
    }

    public ss0(Object obj, Object obj2, TLObject tLObject, Object obj3, int i10) {
        this.f40207a = i10;
        this.f40209c = obj;
        this.d = obj2;
        this.f40208b = tLObject;
        this.e = obj3;
    }
}
