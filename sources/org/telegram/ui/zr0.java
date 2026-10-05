package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
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
import org.telegram.ui.Components.yc;
public final class zr0 implements Runnable {
    public final int f43885a;
    public final Object f43886b;
    public final Object f43887c;
    public final Object d;
    public final Object f43888e;

    public zr0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f43885a = i10;
        this.f43886b = obj;
        this.f43887c = obj2;
        this.d = obj3;
        this.f43888e = obj4;
    }

    @Override
    public final void run() {
        Uri fromFile;
        TLObject chat;
        int indexOf;
        TLObject chat2;
        int i10;
        String formatPluralString;
        org.telegram.ui.web.c1 c1Var;
        boolean z10;
        int i11 = this.f43885a;
        Object obj = this.f43888e;
        Object obj2 = this.d;
        Object obj3 = this.f43887c;
        Object obj4 = this.f43886b;
        switch (i11) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                Bitmap bitmap = (Bitmap) obj3;
                boolean[] zArr = (boolean[]) obj2;
                yr0 yr0Var = (yr0) obj;
                ImageView imageView = photoViewer.f34086x3;
                if (imageView != null) {
                    imageView.setImageBitmap(bitmap);
                    photoViewer.f34086x3.setVisibility(0);
                    SurfaceView surfaceView = photoViewer.C2;
                    if (surfaceView != null) {
                        surfaceView.setVisibility(4);
                    }
                    if (!zArr[0]) {
                        zArr[0] = true;
                        yr0Var.run();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                TLObject tLObject = (TLObject) obj3;
                UserConfig userConfig = (UserConfig) obj2;
                TLRPC.Photo photo = (TLRPC.Photo) obj;
                PhotoViewer photoViewer2 = ((ns0) obj4).f39030b;
                if (tLObject instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                    int i12 = photoViewer2.T;
                    ArrayList arrayList = photoViewer2.f7;
                    MessagesController.getInstance(i12).putUsers(tL_photos_photo.users, false);
                    TLRPC.User user = MessagesController.getInstance(photoViewer2.T).getUser(Long.valueOf(userConfig.clientUserId));
                    if (tL_photos_photo.photo instanceof TLRPC.TL_photo) {
                        int indexOf2 = arrayList.indexOf(photo);
                        if (indexOf2 >= 0) {
                            arrayList.set(indexOf2, tL_photos_photo.photo);
                        }
                        if (user != null) {
                            user.photo.photo_id = tL_photos_photo.photo.f20071id;
                            userConfig.setCurrentUser(user);
                            userConfig.saveConfig(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 2:
                nw0.S((nw0) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (TL_stars.updatePaidMessagesPrice) obj);
                return;
            case 3:
                PrivacyControlActivity.T((PrivacyControlActivity) obj4, (TLRPC.TL_error) obj3, (TLObject) obj, (boolean[]) obj2);
                return;
            case 4:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj4;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                TL_account.setAccountTTL setaccountttl = (TL_account.setAccountTTL) obj;
                privacySettingsActivity.getClass();
                try {
                    b2Var.dismiss();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                    privacySettingsActivity.Q = true;
                    privacySettingsActivity.getContactsController().setDeleteAccountTTL(setaccountttl.ttl.days);
                    privacySettingsActivity.f34207a.l();
                    return;
                }
                return;
            case 5:
                boolean[] zArr2 = (boolean[]) obj2;
                Activity activity = (Activity) obj3;
                File file = (File) obj;
                try {
                    ((org.telegram.ui.ActionBar.b2) obj4).dismiss();
                } catch (Exception unused) {
                }
                if (zArr2[0]) {
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
                        } catch (Exception e10) {
                            FileLog.e(e10);
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
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                int[] iArr = (int[]) obj;
                if (!(((TLObject) obj3) instanceof TLRPC.TL_boolTrue)) {
                    profileActivity.getClass();
                    org.telegram.ui.Components.yc.a0(profileActivity).d0(tL_error, false);
                }
                if (profileActivity.f34324o4 == iArr[0]) {
                    profileActivity.f34324o4 = 0;
                    return;
                }
                return;
            case 7:
                ProfileActivity profileActivity2 = (ProfileActivity) obj4;
                TLObject tLObject3 = (TLObject) obj3;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                if (tLObject3 instanceof TL_fragment.TL_collectibleInfo) {
                    if (profileActivity2.f34253e1 != 0) {
                        chat = profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.f34253e1));
                    } else {
                        chat = profileActivity2.getMessagesController().getChat(Long.valueOf(profileActivity2.f34261f1));
                    }
                    h20.a(profileActivity2.getParentActivity(), 0, tL_username.username, chat, (TL_fragment.TL_collectibleInfo) tLObject3, profileActivity2.f34396z0);
                    return;
                }
                org.telegram.ui.Components.yc.b0(tL_error2);
                return;
            case 8:
                ProfileActivity profileActivity3 = (ProfileActivity) obj4;
                String[] strArr = (String[]) obj3;
                String str = (String) obj2;
                String str2 = (String) obj;
                if (AndroidUtilities.isContextSafe(profileActivity3.getParentActivity())) {
                    org.telegram.ui.Components.u41.I(profileActivity3.getParentActivity(), profileActivity3, strArr[0], str, str2, new l20(profileActivity3, 2), null);
                    return;
                }
                return;
            case 9:
                ProfileActivity.n0((ProfileActivity) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (String) obj);
                return;
            case 10:
                TLObject tLObject4 = (TLObject) obj3;
                UserConfig userConfig2 = (UserConfig) obj2;
                TLRPC.Photo photo2 = (TLRPC.Photo) obj;
                ProfileActivity profileActivity4 = ((a01) obj4).f34642b;
                profileActivity4.f34313n0.f24982c1--;
                if (tLObject4 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo2 = (TLRPC.TL_photos_photo) tLObject4;
                    profileActivity4.getMessagesController().putUsers(tL_photos_photo2.users, false);
                    TLRPC.User user2 = profileActivity4.getMessagesController().getUser(Long.valueOf(userConfig2.clientUserId));
                    TLRPC.Photo photo3 = tL_photos_photo2.photo;
                    if (photo3 instanceof TLRPC.TL_photo) {
                        ArrayList arrayList2 = profileActivity4.f34313n0.V0;
                        if (!arrayList2.isEmpty() && (indexOf = arrayList2.indexOf(photo2)) >= 0) {
                            arrayList2.set(indexOf, photo3);
                        }
                        if (user2 != null) {
                            user2.photo.photo_id = tL_photos_photo2.photo.f20071id;
                            userConfig2.setCurrentUser(user2);
                            userConfig2.saveConfig(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 11:
                TLObject tLObject5 = (TLObject) obj3;
                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                ProfileActivity profileActivity5 = ((l01) obj4).f38210c.f40298e;
                profileActivity5.M4(null);
                if (tLObject5 instanceof TL_fragment.TL_collectibleInfo) {
                    if (profileActivity5.f34253e1 != 0) {
                        chat2 = profileActivity5.getMessagesController().getUser(Long.valueOf(profileActivity5.f34253e1));
                    } else {
                        chat2 = profileActivity5.getMessagesController().getChat(Long.valueOf(profileActivity5.f34261f1));
                    }
                    TLObject tLObject6 = chat2;
                    if (profileActivity5.getParentActivity() != null) {
                        h20.a(profileActivity5.getParentActivity(), 0, tL_username2.username, tLObject6, (TL_fragment.TL_collectibleInfo) tLObject5, profileActivity5.f34396z0);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Components.yc.b0(tL_error3);
                return;
            case 12:
                SessionsActivity sessionsActivity = (SessionsActivity) obj4;
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) obj3;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) obj;
                sessionsActivity.getClass();
                try {
                    b2Var2.dismiss();
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                if (tL_error4 == null) {
                    sessionsActivity.f34486e.remove(tL_webAuthorization);
                    sessionsActivity.m0();
                    j81 j81Var = sessionsActivity.f34483a;
                    if (j81Var != null) {
                        j81Var.l();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                SessionsActivity sessionsActivity2 = (SessionsActivity) obj4;
                org.telegram.ui.ActionBar.b2 b2Var3 = (org.telegram.ui.ActionBar.b2) obj3;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                sessionsActivity2.getClass();
                try {
                    b2Var3.dismiss();
                } catch (Exception e12) {
                    FileLog.e(e12);
                }
                if (tL_error5 == null) {
                    sessionsActivity2.f34486e.remove(tL_authorization);
                    sessionsActivity2.f34487f.remove(tL_authorization);
                    sessionsActivity2.m0();
                    j81 j81Var2 = sessionsActivity2.f34483a;
                    if (j81Var2 != null) {
                        j81Var2.l();
                        return;
                    }
                    return;
                }
                return;
            case 14:
                i81 i81Var = (i81) obj4;
                i81Var.f37318a = (TLObject) obj3;
                i81Var.f37319b = (TLRPC.TL_error) obj2;
                ((n9) obj).run();
                return;
            case 15:
                y81.b0((y81) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (String) obj);
                return;
            case 16:
                ea1 ea1Var = (ea1) obj4;
                jg.b bVar = (jg.b) obj3;
                String str3 = (String) obj2;
                sa1 sa1Var = (sa1) obj;
                ta1 ta1Var = ea1Var.f35995w;
                if (bVar != null) {
                    ta1Var.U.put(str3, bVar);
                }
                if (bVar != null && !sa1Var.f40426b && (i10 = sa1Var.f40425a) >= 0) {
                    View m10 = ta1Var.T.m(i10);
                    if (m10 instanceof ea1) {
                        ea1Var.f35738r.f36247e = bVar;
                        ea1 ea1Var2 = (ea1) m10;
                        ea1Var2.f35733b.f12145t0.d(false, false);
                        ea1Var2.g(false);
                    }
                }
                ta1.W(ta1Var);
                return;
            case 17:
                fa1 fa1Var = (fa1) obj4;
                fa1Var.f36252k = false;
                fa1Var.d = (jg.b) obj3;
                fa1Var.f36249g = (String) obj2;
                da1 da1Var = (da1) ((Utilities.Callback0Return) obj).run();
                if (da1Var != null) {
                    da1Var.e(fa1Var, true);
                    return;
                }
                return;
            case 18:
                TLObject tLObject7 = (TLObject) obj3;
                String str4 = (String) obj2;
                org.telegram.ui.ActionBar.b2 b2Var4 = (org.telegram.ui.ActionBar.b2) obj;
                se1 se1Var = ((oe1) obj4).f39185a;
                if (tLObject7 != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject7;
                    for (int i14 = 0; i14 < updates.updates.size(); i14++) {
                        if (updates.updates.get(i14) instanceof TL_update.TL_updateMessageID) {
                            TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) updates.updates.get(i14);
                            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = new TLRPC.TL_messageActionTopicCreate();
                            tL_messageActionTopicCreate.title = str4;
                            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                            tL_messageService.action = tL_messageActionTopicCreate;
                            tL_messageService.peer_id = se1Var.getMessagesController().getPeer(se1Var.f40454a);
                            tL_messageService.dialog_id = se1Var.f40454a;
                            tL_messageService.f20068id = tL_updateMessageID.f20302id;
                            tL_messageService.date = (int) (System.currentTimeMillis() / 1000);
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(new MessageObject(se1.W(se1Var), tL_messageService, false, false));
                            TLRPC.Chat chat3 = se1Var.getMessagesController().getChat(Long.valueOf(-se1Var.f40454a));
                            TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                            tL_forumTopic.f20099id = tL_updateMessageID.f20302id;
                            long j3 = se1Var.f40455b;
                            if (j3 != 0) {
                                tL_forumTopic.icon_emoji_id = j3;
                                tL_forumTopic.flags |= 1;
                            }
                            tL_forumTopic.my = true;
                            tL_forumTopic.flags |= 2;
                            tL_forumTopic.topicStartMessage = tL_messageService;
                            tL_forumTopic.title = str4;
                            tL_forumTopic.top_message = tL_messageService.f20068id;
                            tL_forumTopic.topMessage = tL_messageService;
                            tL_forumTopic.from_id = se1Var.getMessagesController().getPeer(se1Var.getUserConfig().clientUserId);
                            tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
                            tL_forumTopic.icon_color = se1Var.E;
                            yn ynVar = se1Var.f40464y;
                            if (ynVar != null) {
                                ynVar.Ka();
                                ynVar.Oa();
                                ynVar.ob(arrayList3, chat3, tL_messageService.f20068id, 1, 1, tL_forumTopic);
                                ynVar.f43289c = true;
                                ynVar.r8();
                                ynVar.Mc(true);
                                ynVar.Y0.m(true);
                                ynVar.Sc();
                                ynVar.P1.setCurrentTopic(ynVar.d());
                                ynVar.Pc(true);
                                ynVar.gc(true);
                                ynVar.f9(true);
                                ynVar.A6(true, true);
                                ynVar.Da();
                                se1Var.getMessagesController().getTopicsController().onTopicCreated(se1Var.f40454a, tL_forumTopic, true);
                                se1Var.finishFragment();
                            } else {
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", -se1Var.f40454a);
                                bundle.putInt("message_id", 1);
                                bundle.putInt("unread_count", 0);
                                bundle.putBoolean("historyPreloaded", false);
                                yn ynVar2 = new yn(bundle);
                                ynVar2.ob(arrayList3, chat3, tL_messageService.f20068id, 1, 1, tL_forumTopic);
                                ynVar2.f43289c = true;
                                se1Var.getMessagesController().getTopicsController().onTopicCreated(se1Var.f40454a, tL_forumTopic, true);
                                se1Var.presentFragment(ynVar2);
                            }
                        }
                    }
                }
                b2Var4.dismiss();
                return;
            case 19:
                TwoStepVerificationActivity.e0((TwoStepVerificationActivity) obj4, (byte[]) obj3, (TLObject) obj2, (byte[]) obj);
                return;
            case 20:
                zg1 zg1Var = (zg1) obj4;
                String str5 = (String) obj2;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj;
                if (((TLObject) obj3) instanceof TLRPC.TL_boolTrue) {
                    zg1Var.u0(new e91(15, zg1Var, str5));
                    return;
                } else if (tL_error6 != null && !tL_error6.text.startsWith("CODE_INVALID")) {
                    if (tL_error6.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error6.text).intValue();
                        if (intValue < 60) {
                            formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                        } else {
                            formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                        }
                        zg1Var.G0(LocaleController.getString(R.string.TwoStepVerificationTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, formatPluralString));
                        return;
                    }
                    zg1Var.G0(LocaleController.getString(R.string.TwoStepVerificationTitle), tL_error6.text);
                    return;
                } else {
                    zg1Var.y0();
                    return;
                }
            case 21:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) obj4;
                ai.da daVar = (ai.da) obj3;
                String str6 = (String) obj2;
                JSONObject jSONObject = (JSONObject) obj;
                if (z0Var.f42445c && ((c1Var = z0Var.Q) == null || !c1Var.p(daVar))) {
                    FileLog.d("notifyEvent " + str6 + " dropped after document change");
                    return;
                }
                z0Var.d("window.Telegram.WebView.receiveEvent('" + str6 + "', " + jSONObject + ");");
                return;
            case 22:
                q5.a aVar = (q5.a) obj4;
                l5.i iVar = (l5.i) obj3;
                String str7 = iVar.f15347a;
                i5.g gVar = (i5.g) obj2;
                l5.h hVar = (l5.h) obj;
                aVar.getClass();
                Logger logger = q5.a.f44839f;
                try {
                    m5.e a2 = aVar.f44842c.a(str7);
                    if (a2 == null) {
                        String str8 = "Transport backend '" + str7 + "' is not registered";
                        logger.warning(str8);
                        gVar.a(new IllegalArgumentException(str8));
                    } else {
                        ((s5.g) aVar.f44843e).f(new org.telegram.ui.Components.v50(aVar, iVar, ((j5.b) a2).a(hVar), 5));
                        gVar.a(null);
                    }
                    return;
                } catch (Exception e13) {
                    logger.warning("Error scheduling event " + e13.getMessage());
                    gVar.a(e13);
                    return;
                }
            case 23:
                qg.n2 n2Var = (qg.n2) obj4;
                n2Var.G = true;
                n2Var.H = (qg.k2[]) ((ArrayList) obj3).toArray(new qg.k2[0]);
                ((jr0) obj2).run((qg.k2) obj);
                return;
            case 24:
                qg.n2 n2Var2 = (qg.n2) obj4;
                TLObject tLObject8 = (TLObject) obj3;
                qg.l2 l2Var = (qg.l2) obj2;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj;
                if (tLObject8 instanceof TLRPC.TL_messageMediaDocument) {
                    n2Var2.getClass();
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) tLObject8;
                    l2Var.f45152e = MediaDataController.getInputStickerSetItem(tL_messageMediaDocument.document, l2Var.f45151c);
                    l2Var.f45153f = tL_messageMediaDocument;
                    n2Var2.a();
                    return;
                }
                n2Var2.h();
                n2Var2.n(tL_error7);
                return;
            case 25:
                qi.f fVar = (qi.f) obj4;
                ((ArrayDeque) fVar.f45541a).addLast(new qi.e((k2.v) obj3, (qi.b) obj2, (RequestTimeDelegate) obj));
                fVar.K();
                return;
            case 26:
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) obj4;
                Utilities.Callback callback = (Utilities.Callback) obj3;
                TLObject tLObject9 = (TLObject) obj2;
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
            case 27:
                final xh.o2 o2Var = (xh.o2) obj4;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj3;
                xh.i1 i1Var = (xh.i1) obj2;
                final View view = (View) obj;
                org.telegram.ui.Components.gs0 gs0Var = o2Var.f50159a;
                if (savedStarGift.unsaved) {
                    savedStarGift.unsaved = false;
                    i1Var.h(savedStarGift, true, false);
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = o2Var.f50162e.g(savedStarGift);
                    savestargift.unsave = savedStarGift.unsaved;
                    ConnectionsManager.getInstance(o2Var.f50160b).sendRequest(savestargift, null, 64);
                }
                boolean z11 = savedStarGift.pinned_to_top;
                final boolean z12 = !z11;
                if (o2Var.f50162e.m(savedStarGift, z12, false)) {
                    new xh.r2(o2Var.getContext(), gs0Var.f50234c, savedStarGift, o2Var.f50161c, new Utilities.Callback0Return() {
                        @Override
                        public final Object run() {
                            ((i1) view).c(z12, true);
                            o2 o2Var2 = o2.this;
                            o2Var2.f50163f.v0(0);
                            return yc.a0(o2Var2.f50159a.f50232a);
                        }
                    }).show();
                    return;
                }
                if (!z11) {
                    org.telegram.ui.Components.yc.a0(gs0Var.f50232a).M(LocaleController.getString(R.string.Gift2PinnedTitle), LocaleController.getString(R.string.Gift2PinnedSubtitle), R.raw.ic_pin).j();
                } else {
                    org.telegram.messenger.q.p(R.string.Gift2Unpinned, org.telegram.ui.Components.yc.a0(gs0Var.f50232a), R.raw.ic_unpin, 36);
                }
                ((xh.i1) view).c(z12, true);
                o2Var.f50163f.v0(0);
                return;
            case 28:
                yh.g gVar2 = (yh.g) obj4;
                TLObject tLObject10 = (TLObject) obj3;
                String str9 = (String) obj2;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj;
                rg.s1 s1Var = gVar2.f51315n;
                yh.h hVar2 = gVar2.f51316r;
                if (!hVar2.O) {
                    gVar2.f51313e = false;
                    if (tLObject10 instanceof TL_stars.StarsStatus) {
                        TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject10;
                        MessagesController.getInstance(yh.h.i0(hVar2)).putUsers(starsStatus.users, false);
                        MessagesController.getInstance(yh.h.j0(hVar2)).putChats(starsStatus.chats, false);
                        if ((starsStatus.flags & 1) != 0 && starsStatus.next_offset != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10 && TextUtils.equals(str9, starsStatus.next_offset)) {
                            gVar2.h = true;
                        } else {
                            gVar2.f51311b.addAll(starsStatus.history);
                            gVar2.d = starsStatus.next_offset;
                            gVar2.f51314f = !z10;
                        }
                    } else {
                        gVar2.h = true;
                        if (tL_error9 != null) {
                            org.telegram.ui.Components.yc.b0(tL_error9);
                        }
                    }
                    gVar2.f51312c.f26034f3.N(false);
                    gVar2.removeCallbacks(s1Var);
                    gVar2.post(s1Var);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) obj4;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) obj3;
                nf.e eVar = (nf.e) obj2;
                org.telegram.ui.ActionBar.b2 b2Var5 = (org.telegram.ui.ActionBar.b2) obj;
                if (n2Var3 != null && tL_error10 != null) {
                    org.telegram.ui.Components.yc.a0(n2Var3).d0(tL_error10, false);
                }
                if ((n2Var3 instanceof yn) && tL_error10 == null) {
                    ((yn) n2Var3).Xb();
                }
                eVar.b();
                b2Var5.dismiss();
                return;
        }
    }

    public zr0(org.telegram.ui.ActionBar.b2 b2Var, boolean[] zArr, Activity activity, File file) {
        this.f43885a = 5;
        this.f43886b = b2Var;
        this.d = zArr;
        this.f43887c = activity;
        this.f43888e = file;
    }

    public zr0(PrivacyControlActivity privacyControlActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean[] zArr) {
        this.f43885a = 3;
        this.f43886b = privacyControlActivity;
        this.f43887c = tL_error;
        this.f43888e = tLObject;
        this.d = zArr;
    }
}
