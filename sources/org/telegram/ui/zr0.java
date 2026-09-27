package org.telegram.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.Serializable;
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
import org.telegram.ui.Components.xc;
public final class zr0 implements Runnable {
    public final int f40582a;
    public final Object f40583b;
    public final Object f40584c;
    public final Object d;
    public final Object e;

    public zr0(Dialog dialog, boolean[] zArr, Object obj, Serializable serializable, int i10) {
        this.f40582a = i10;
        this.f40583b = dialog;
        this.d = zArr;
        this.f40584c = obj;
        this.e = serializable;
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
        int i11 = this.f40582a;
        Object obj = this.e;
        Object obj2 = this.f40584c;
        Object obj3 = this.d;
        Object obj4 = this.f40583b;
        switch (i11) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                Bitmap bitmap = (Bitmap) obj2;
                boolean[] zArr = (boolean[]) obj3;
                yr0 yr0Var = (yr0) obj;
                ImageView imageView = photoViewer.f31397x3;
                if (imageView != null) {
                    imageView.setImageBitmap(bitmap);
                    photoViewer.f31397x3.setVisibility(0);
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
                TLObject tLObject = (TLObject) obj2;
                UserConfig userConfig = (UserConfig) obj3;
                TLRPC.Photo photo = (TLRPC.Photo) obj;
                PhotoViewer photoViewer2 = ((ns0) obj4).f36082b;
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
                            user.photo.photo_id = tL_photos_photo.photo.f18353id;
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
                nw0.U((nw0) obj4, (TLRPC.TL_error) obj2, (TLObject) obj3, (TL_stars.updatePaidMessagesPrice) obj);
                return;
            case 3:
                PrivacyControlActivity.V((PrivacyControlActivity) obj4, (TLRPC.TL_error) obj2, (TLObject) obj, (boolean[]) obj3);
                return;
            case 4:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj4;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj2;
                TLObject tLObject2 = (TLObject) obj3;
                TL_account.setAccountTTL setaccountttl = (TL_account.setAccountTTL) obj;
                privacySettingsActivity.getClass();
                try {
                    c2Var.dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                    privacySettingsActivity.Q = true;
                    privacySettingsActivity.getContactsController().setDeleteAccountTTL(setaccountttl.ttl.days);
                    privacySettingsActivity.f31513a.l();
                    return;
                }
                return;
            case 5:
                boolean[] zArr2 = (boolean[]) obj3;
                Activity activity = (Activity) obj2;
                File file = (File) obj;
                try {
                    ((org.telegram.ui.ActionBar.c2) obj4).dismiss();
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
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                int[] iArr = (int[]) obj;
                if (!(((TLObject) obj2) instanceof TLRPC.TL_boolTrue)) {
                    profileActivity.getClass();
                    org.telegram.ui.Components.xc.a0(profileActivity).d0(tL_error, false);
                }
                if (profileActivity.f31628o4 == iArr[0]) {
                    profileActivity.f31628o4 = 0;
                    return;
                }
                return;
            case 7:
                ProfileActivity profileActivity2 = (ProfileActivity) obj4;
                TLObject tLObject3 = (TLObject) obj2;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                if (tLObject3 instanceof TL_fragment.TL_collectibleInfo) {
                    if (profileActivity2.f31557e1 != 0) {
                        chat = profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.f31557e1));
                    } else {
                        chat = profileActivity2.getMessagesController().getChat(Long.valueOf(profileActivity2.f31565f1));
                    }
                    g20.a(profileActivity2.getParentActivity(), 0, tL_username.username, chat, (TL_fragment.TL_collectibleInfo) tLObject3, profileActivity2.f31700z0);
                    return;
                }
                org.telegram.ui.Components.xc.b0(tL_error2);
                return;
            case 8:
                ProfileActivity profileActivity3 = (ProfileActivity) obj4;
                String[] strArr = (String[]) obj2;
                String str = (String) obj3;
                String str2 = (String) obj;
                if (AndroidUtilities.isContextSafe(profileActivity3.getParentActivity())) {
                    org.telegram.ui.Components.k41.K(profileActivity3.getParentActivity(), profileActivity3, strArr[0], str, str2, new k20(profileActivity3, 2), null);
                    return;
                }
                return;
            case 9:
                ProfileActivity.n0((ProfileActivity) obj4, (TLRPC.TL_error) obj2, (TLObject) obj3, (String) obj);
                return;
            case 10:
                TLObject tLObject4 = (TLObject) obj2;
                UserConfig userConfig2 = (UserConfig) obj3;
                TLRPC.Photo photo2 = (TLRPC.Photo) obj;
                ProfileActivity profileActivity4 = ((a01) obj4).f31935b;
                profileActivity4.f31617n0.f23032c1--;
                if (tLObject4 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo2 = (TLRPC.TL_photos_photo) tLObject4;
                    profileActivity4.getMessagesController().putUsers(tL_photos_photo2.users, false);
                    TLRPC.User user2 = profileActivity4.getMessagesController().getUser(Long.valueOf(userConfig2.clientUserId));
                    TLRPC.Photo photo3 = tL_photos_photo2.photo;
                    if (photo3 instanceof TLRPC.TL_photo) {
                        ArrayList arrayList2 = profileActivity4.f31617n0.V0;
                        if (!arrayList2.isEmpty() && (indexOf = arrayList2.indexOf(photo2)) >= 0) {
                            arrayList2.set(indexOf, photo3);
                        }
                        if (user2 != null) {
                            user2.photo.photo_id = tL_photos_photo2.photo.f18353id;
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
                TLObject tLObject5 = (TLObject) obj2;
                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) obj3;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj;
                ProfileActivity profileActivity5 = ((l01) obj4).f35216c.e;
                profileActivity5.M4(null);
                if (tLObject5 instanceof TL_fragment.TL_collectibleInfo) {
                    if (profileActivity5.f31557e1 != 0) {
                        chat2 = profileActivity5.getMessagesController().getUser(Long.valueOf(profileActivity5.f31557e1));
                    } else {
                        chat2 = profileActivity5.getMessagesController().getChat(Long.valueOf(profileActivity5.f31565f1));
                    }
                    TLObject tLObject6 = chat2;
                    if (profileActivity5.getParentActivity() != null) {
                        g20.a(profileActivity5.getParentActivity(), 0, tL_username2.username, tLObject6, (TL_fragment.TL_collectibleInfo) tLObject5, profileActivity5.f31700z0);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Components.xc.b0(tL_error3);
                return;
            case 12:
                SessionsActivity sessionsActivity = (SessionsActivity) obj4;
                org.telegram.ui.ActionBar.c2 c2Var2 = (org.telegram.ui.ActionBar.c2) obj2;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj3;
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) obj;
                sessionsActivity.getClass();
                try {
                    c2Var2.dismiss();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (tL_error4 == null) {
                    sessionsActivity.e.remove(tL_webAuthorization);
                    sessionsActivity.m0();
                    m81 m81Var = sessionsActivity.f31784a;
                    if (m81Var != null) {
                        m81Var.l();
                        return;
                    }
                    return;
                }
                return;
            case 13:
                SessionsActivity sessionsActivity2 = (SessionsActivity) obj4;
                org.telegram.ui.ActionBar.c2 c2Var3 = (org.telegram.ui.ActionBar.c2) obj2;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj3;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                sessionsActivity2.getClass();
                try {
                    c2Var3.dismiss();
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                if (tL_error5 == null) {
                    sessionsActivity2.e.remove(tL_authorization);
                    sessionsActivity2.f31787f.remove(tL_authorization);
                    sessionsActivity2.m0();
                    m81 m81Var2 = sessionsActivity2.f31784a;
                    if (m81Var2 != null) {
                        m81Var2.l();
                        return;
                    }
                    return;
                }
                return;
            case 14:
                l81 l81Var = (l81) obj4;
                l81Var.f35283a = (TLObject) obj2;
                l81Var.f35284b = (TLRPC.TL_error) obj3;
                ((o9) obj).run();
                return;
            case 15:
                a91.U((a91) obj4, (TLRPC.TL_error) obj2, (TLObject) obj3, (String) obj);
                return;
            case 16:
                ca1 ca1Var = (ca1) obj4;
                jg.b bVar = (jg.b) obj2;
                String str3 = (String) obj3;
                qa1 qa1Var = (qa1) obj;
                ra1 ra1Var = ca1Var.f32647w;
                if (bVar != null) {
                    ra1Var.U.put(str3, bVar);
                }
                if (bVar != null && !qa1Var.f36700b && (i10 = qa1Var.f36699a) >= 0) {
                    View m10 = ra1Var.T.m(i10);
                    if (m10 instanceof ca1) {
                        ca1Var.f32306r.e = bVar;
                        ca1 ca1Var2 = (ca1) m10;
                        ca1Var2.f32302b.f11155t0.d(false, false);
                        ca1Var2.g(false);
                    }
                }
                ra1.X(ra1Var);
                return;
            case 17:
                da1 da1Var = (da1) obj4;
                da1Var.f32913k = false;
                da1Var.d = (jg.b) obj2;
                da1Var.f32910g = (String) obj3;
                ba1 ba1Var = (ba1) ((Utilities.Callback0Return) obj).run();
                if (ba1Var != null) {
                    ba1Var.e(da1Var, true);
                    return;
                }
                return;
            case 18:
                TLObject tLObject7 = (TLObject) obj2;
                String str4 = (String) obj3;
                org.telegram.ui.ActionBar.c2 c2Var4 = (org.telegram.ui.ActionBar.c2) obj;
                se1 se1Var = ((oe1) obj4).f36194a;
                if (tLObject7 != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject7;
                    for (int i14 = 0; i14 < updates.updates.size(); i14++) {
                        if (updates.updates.get(i14) instanceof TL_update.TL_updateMessageID) {
                            TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) updates.updates.get(i14);
                            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = new TLRPC.TL_messageActionTopicCreate();
                            tL_messageActionTopicCreate.title = str4;
                            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                            tL_messageService.action = tL_messageActionTopicCreate;
                            tL_messageService.peer_id = se1Var.getMessagesController().getPeer(se1Var.f37410a);
                            tL_messageService.dialog_id = se1Var.f37410a;
                            tL_messageService.f18350id = tL_updateMessageID.f18582id;
                            tL_messageService.date = (int) (System.currentTimeMillis() / 1000);
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(new MessageObject(se1.X(se1Var), tL_messageService, false, false));
                            TLRPC.Chat chat3 = se1Var.getMessagesController().getChat(Long.valueOf(-se1Var.f37410a));
                            TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                            tL_forumTopic.f18381id = tL_updateMessageID.f18582id;
                            long j3 = se1Var.f37411b;
                            if (j3 != 0) {
                                tL_forumTopic.icon_emoji_id = j3;
                                tL_forumTopic.flags |= 1;
                            }
                            tL_forumTopic.my = true;
                            tL_forumTopic.flags |= 2;
                            tL_forumTopic.topicStartMessage = tL_messageService;
                            tL_forumTopic.title = str4;
                            tL_forumTopic.top_message = tL_messageService.f18350id;
                            tL_forumTopic.topMessage = tL_messageService;
                            tL_forumTopic.from_id = se1Var.getMessagesController().getPeer(se1Var.getUserConfig().clientUserId);
                            tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
                            tL_forumTopic.icon_color = se1Var.E;
                            xn xnVar = se1Var.f37419y;
                            if (xnVar != null) {
                                xnVar.La();
                                xnVar.Pa();
                                xnVar.pb(arrayList3, chat3, tL_messageService.f18350id, 1, 1, tL_forumTopic);
                                xnVar.f39715c = true;
                                xnVar.r8();
                                xnVar.Nc(true);
                                xnVar.f39690a1.n(true);
                                xnVar.Tc();
                                xnVar.R1.setCurrentTopic(xnVar.d());
                                xnVar.Qc(true);
                                xnVar.hc(true);
                                xnVar.e9(true);
                                xnVar.A6(true, true);
                                xnVar.Ea();
                                se1Var.getMessagesController().getTopicsController().onTopicCreated(se1Var.f37410a, tL_forumTopic, true);
                                se1Var.finishFragment();
                            } else {
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", -se1Var.f37410a);
                                bundle.putInt("message_id", 1);
                                bundle.putInt("unread_count", 0);
                                bundle.putBoolean("historyPreloaded", false);
                                xn xnVar2 = new xn(bundle);
                                xnVar2.pb(arrayList3, chat3, tL_messageService.f18350id, 1, 1, tL_forumTopic);
                                xnVar2.f39715c = true;
                                se1Var.getMessagesController().getTopicsController().onTopicCreated(se1Var.f37410a, tL_forumTopic, true);
                                se1Var.presentFragment(xnVar2);
                            }
                        }
                    }
                }
                c2Var4.dismiss();
                return;
            case 19:
                TwoStepVerificationActivity.e0((TwoStepVerificationActivity) obj4, (byte[]) obj2, (TLObject) obj3, (byte[]) obj);
                return;
            case 20:
                zg1 zg1Var = (zg1) obj4;
                String str5 = (String) obj3;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj;
                if (((TLObject) obj2) instanceof TLRPC.TL_boolTrue) {
                    zg1Var.u0(new fb1(13, zg1Var, str5));
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
                ai.da daVar = (ai.da) obj2;
                String str6 = (String) obj3;
                JSONObject jSONObject = (JSONObject) obj;
                if (z0Var.f39243c && ((c1Var = z0Var.Q) == null || !c1Var.p(daVar))) {
                    FileLog.d("notifyEvent " + str6 + " dropped after document change");
                    return;
                }
                z0Var.d("window.Telegram.WebView.receiveEvent('" + str6 + "', " + jSONObject + ");");
                return;
            case 22:
                pi.f fVar = (pi.f) obj4;
                ((ArrayDeque) fVar.f41365a).addLast(new pi.e((le.b) obj2, (pi.b) obj3, (RequestTimeDelegate) obj));
                fVar.K();
                return;
            case 23:
                q5.a aVar = (q5.a) obj4;
                l5.i iVar = (l5.i) obj2;
                String str7 = iVar.f14121a;
                i5.g gVar = (i5.g) obj3;
                l5.h hVar = (l5.h) obj;
                aVar.getClass();
                Logger logger = q5.a.f41482f;
                try {
                    m5.e a2 = aVar.f41485c.a(str7);
                    if (a2 == null) {
                        String str8 = "Transport backend '" + str7 + "' is not registered";
                        logger.warning(str8);
                        gVar.a(new IllegalArgumentException(str8));
                    } else {
                        ((s5.h) aVar.e).f(new org.telegram.ui.Components.u50(aVar, iVar, ((j5.b) a2).a(hVar), 5));
                        gVar.a(null);
                    }
                    return;
                } catch (Exception e12) {
                    logger.warning("Error scheduling event " + e12.getMessage());
                    gVar.a(e12);
                    return;
                }
            case 24:
                qg.n2 n2Var = (qg.n2) obj4;
                n2Var.G = true;
                n2Var.H = (qg.k2[]) ((ArrayList) obj2).toArray(new qg.k2[0]);
                ((jr0) obj3).run((qg.k2) obj);
                return;
            case 25:
                qg.n2 n2Var2 = (qg.n2) obj4;
                TLObject tLObject8 = (TLObject) obj2;
                qg.l2 l2Var = (qg.l2) obj3;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) obj;
                if (tLObject8 instanceof TLRPC.TL_messageMediaDocument) {
                    n2Var2.getClass();
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) tLObject8;
                    l2Var.e = MediaDataController.getInputStickerSetItem(tL_messageMediaDocument.document, l2Var.f41777c);
                    l2Var.f41778f = tL_messageMediaDocument;
                    n2Var2.a();
                    return;
                }
                n2Var2.h();
                n2Var2.n(tL_error7);
                return;
            case 26:
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
            case 27:
                final xh.p2 p2Var = (xh.p2) obj4;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj2;
                xh.j1 j1Var = (xh.j1) obj3;
                final View view = (View) obj;
                org.telegram.ui.Components.bs0 bs0Var = p2Var.f46405a;
                if (savedStarGift.unsaved) {
                    savedStarGift.unsaved = false;
                    j1Var.h(savedStarGift, true, false);
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = p2Var.e.g(savedStarGift);
                    savestargift.unsave = savedStarGift.unsaved;
                    ConnectionsManager.getInstance(p2Var.f46406b).sendRequest(savestargift, null, 64);
                }
                boolean z10 = savedStarGift.pinned_to_top;
                final boolean z11 = !z10;
                if (p2Var.e.m(savedStarGift, z11, false)) {
                    new xh.s2(p2Var.getContext(), bs0Var.f46471c, savedStarGift, p2Var.f46407c, new Utilities.Callback0Return() {
                        @Override
                        public final Object run() {
                            ((j1) view).c(z11, true);
                            p2 p2Var2 = p2.this;
                            p2Var2.f46408f.v0(0);
                            return xc.a0(p2Var2.f46405a.f46469a);
                        }
                    }).show();
                    return;
                }
                if (!z10) {
                    org.telegram.ui.Components.xc.a0(bs0Var.f46469a).M(LocaleController.getString(R.string.Gift2PinnedTitle), LocaleController.getString(R.string.Gift2PinnedSubtitle), R.raw.ic_pin).j();
                } else {
                    org.telegram.messenger.l0.o(R.string.Gift2Unpinned, org.telegram.ui.Components.xc.a0(bs0Var.f46469a), R.raw.ic_unpin, 36);
                }
                ((xh.j1) view).c(z11, true);
                p2Var.f46408f.v0(0);
                return;
            case 28:
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj4;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) obj2;
                nf.e eVar = (nf.e) obj3;
                org.telegram.ui.ActionBar.c2 c2Var5 = (org.telegram.ui.ActionBar.c2) obj;
                if (o2Var != null && tL_error9 != null) {
                    org.telegram.ui.Components.xc.a0(o2Var).d0(tL_error9, false);
                }
                if ((o2Var instanceof xn) && tL_error9 == null) {
                    ((xn) o2Var).Yb();
                }
                eVar.b();
                c2Var5.dismiss();
                return;
            default:
                yh.x3.Z((yh.x3) obj4, (boolean[]) obj3, (TL_stars.StarGiftAttribute) obj2, (org.telegram.ui.Components.zc[]) obj);
                return;
        }
    }

    public zr0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f40582a = i10;
        this.f40583b = obj;
        this.f40584c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public zr0(PrivacyControlActivity privacyControlActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean[] zArr) {
        this.f40582a = 3;
        this.f40583b = privacyControlActivity;
        this.f40584c = tL_error;
        this.e = tLObject;
        this.d = zArr;
    }
}
