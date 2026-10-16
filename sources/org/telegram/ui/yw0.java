package org.telegram.ui;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
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
public final class yw0 implements Runnable {
    public final int f41969a;
    public final Object f41970b;
    public final Object f41971c;
    public final Object d;
    public final Object e;

    public yw0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f41969a = i10;
        this.d = obj;
        this.f41970b = obj2;
        this.f41971c = obj3;
        this.e = obj4;
    }

    @Override
    public final void run() {
        Uri fromFile;
        TLObject chat;
        int indexOf;
        TLObject chat2;
        int i10;
        TLRPC.Updates updates;
        String formatPluralString;
        org.telegram.ui.web.c1 c1Var;
        int a2;
        int max;
        int max2;
        int i11 = 2;
        int i12 = 1;
        switch (this.f41969a) {
            case 0:
                zw0.U((zw0) this.d, (TLRPC.TL_error) this.f41970b, (TLObject) this.f41971c, (TL_stars.updatePaidMessagesPrice) this.e);
                return;
            case 1:
                PrivacyControlActivity.V((PrivacyControlActivity) this.d, (TLRPC.TL_error) this.f41970b, (TLObject) this.f41971c, (boolean[]) this.e);
                return;
            case 2:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.d;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) this.f41970b;
                TLObject tLObject = (TLObject) this.f41971c;
                TL_account.setAccountTTL setaccountttl = (TL_account.setAccountTTL) this.e;
                privacySettingsActivity.getClass();
                try {
                    a2Var.dismiss();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    privacySettingsActivity.Q = true;
                    privacySettingsActivity.getContactsController().setDeleteAccountTTL(setaccountttl.ttl.days);
                    privacySettingsActivity.f32217a.l();
                    return;
                }
                return;
            case 3:
                org.telegram.ui.ActionBar.a2 a2Var2 = (org.telegram.ui.ActionBar.a2) this.d;
                boolean[] zArr = (boolean[]) this.f41970b;
                Activity activity = (Activity) this.f41971c;
                File file = (File) this.e;
                try {
                    a2Var2.dismiss();
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
            case 4:
                ProfileActivity profileActivity = (ProfileActivity) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f41970b;
                int[] iArr = (int[]) this.e;
                if (!(((TLObject) this.f41971c) instanceof TLRPC.TL_boolTrue)) {
                    profileActivity.getClass();
                    org.telegram.ui.Components.zc.a0(profileActivity).f0(tL_error, false);
                }
                if (profileActivity.f32333o4 == iArr[0]) {
                    profileActivity.f32333o4 = 0;
                    return;
                }
                return;
            case 5:
                ProfileActivity profileActivity2 = (ProfileActivity) this.d;
                TLObject tLObject2 = (TLObject) this.f41971c;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.e;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.f41970b;
                if (tLObject2 instanceof TL_fragment.TL_collectibleInfo) {
                    if (profileActivity2.f32261e1 != 0) {
                        chat = profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.f32261e1));
                    } else {
                        chat = profileActivity2.getMessagesController().getChat(Long.valueOf(profileActivity2.f32269f1));
                    }
                    m20.a(profileActivity2.getParentActivity(), 0, tL_username.username, chat, (TL_fragment.TL_collectibleInfo) tLObject2, profileActivity2.f32405z0);
                    return;
                }
                org.telegram.ui.Components.zc.d0(tL_error2);
                return;
            case 6:
                ProfileActivity profileActivity3 = (ProfileActivity) this.d;
                String[] strArr = (String[]) this.f41970b;
                String str = (String) this.f41971c;
                String str2 = (String) this.e;
                if (AndroidUtilities.isContextSafe(profileActivity3.getParentActivity())) {
                    org.telegram.ui.Components.x41.L(profileActivity3.getParentActivity(), profileActivity3, strArr[0], str, str2, new q20(profileActivity3, 2), null);
                    return;
                }
                return;
            case 7:
                ProfileActivity.n0((ProfileActivity) this.d, (TLRPC.TL_error) this.f41970b, (TLObject) this.f41971c, (String) this.e);
                return;
            case 8:
                TLObject tLObject3 = (TLObject) this.f41971c;
                UserConfig userConfig = (UserConfig) this.f41970b;
                TLRPC.Photo photo = (TLRPC.Photo) this.e;
                ProfileActivity profileActivity4 = ((m01) this.d).f37880b;
                profileActivity4.f32322n0.f28009c1--;
                if (tLObject3 instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject3;
                    profileActivity4.getMessagesController().putUsers(tL_photos_photo.users, false);
                    TLRPC.User user = profileActivity4.getMessagesController().getUser(Long.valueOf(userConfig.clientUserId));
                    TLRPC.Photo photo2 = tL_photos_photo.photo;
                    if (photo2 instanceof TLRPC.TL_photo) {
                        ArrayList arrayList = profileActivity4.f32322n0.V0;
                        if (!arrayList.isEmpty() && (indexOf = arrayList.indexOf(photo)) >= 0) {
                            arrayList.set(indexOf, photo2);
                        }
                        if (user != null) {
                            user.photo.photo_id = tL_photos_photo.photo.f18940id;
                            userConfig.setCurrentUser(user);
                            userConfig.saveConfig(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                TLObject tLObject4 = (TLObject) this.f41971c;
                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) this.e;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.f41970b;
                ProfileActivity profileActivity5 = ((x01) this.d).f41396c.e;
                profileActivity5.M4(null);
                if (tLObject4 instanceof TL_fragment.TL_collectibleInfo) {
                    if (profileActivity5.f32261e1 != 0) {
                        chat2 = profileActivity5.getMessagesController().getUser(Long.valueOf(profileActivity5.f32261e1));
                    } else {
                        chat2 = profileActivity5.getMessagesController().getChat(Long.valueOf(profileActivity5.f32269f1));
                    }
                    TLObject tLObject5 = chat2;
                    if (profileActivity5.getParentActivity() != null) {
                        m20.a(profileActivity5.getParentActivity(), 0, tL_username2.username, tLObject5, (TL_fragment.TL_collectibleInfo) tLObject4, profileActivity5.f32405z0);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Components.zc.d0(tL_error3);
                return;
            case 10:
                SessionsActivity sessionsActivity = (SessionsActivity) this.d;
                org.telegram.ui.ActionBar.a2 a2Var3 = (org.telegram.ui.ActionBar.a2) this.f41971c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.f41970b;
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) this.e;
                sessionsActivity.getClass();
                try {
                    a2Var3.dismiss();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (tL_error4 == null) {
                    sessionsActivity.e.remove(tL_webAuthorization);
                    sessionsActivity.m0();
                    a91 a91Var = sessionsActivity.f32489a;
                    if (a91Var != null) {
                        a91Var.l();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                SessionsActivity sessionsActivity2 = (SessionsActivity) this.d;
                org.telegram.ui.ActionBar.a2 a2Var4 = (org.telegram.ui.ActionBar.a2) this.f41971c;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.f41970b;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) this.e;
                sessionsActivity2.getClass();
                try {
                    a2Var4.dismiss();
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                if (tL_error5 == null) {
                    sessionsActivity2.e.remove(tL_authorization);
                    sessionsActivity2.f32492f.remove(tL_authorization);
                    sessionsActivity2.m0();
                    a91 a91Var2 = sessionsActivity2.f32489a;
                    if (a91Var2 != null) {
                        a91Var2.l();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                z81 z81Var = (z81) this.d;
                z81Var.f42218a = (TLObject) this.f41971c;
                z81Var.f42219b = (TLRPC.TL_error) this.f41970b;
                ((o9) this.e).run();
                return;
            case 13:
                o91.c0((o91) this.d, (TLRPC.TL_error) this.f41970b, (TLObject) this.f41971c, (String) this.e);
                return;
            case 14:
                sa1 sa1Var = (sa1) this.d;
                kg.b bVar = (kg.b) this.f41970b;
                String str3 = (String) this.f41971c;
                gb1 gb1Var = (gb1) this.e;
                hb1 hb1Var = sa1Var.f39749w;
                if (bVar != null) {
                    hb1Var.V.put(str3, bVar);
                }
                if (bVar != null && !gb1Var.f36130b && (i10 = gb1Var.f36129a) >= 0) {
                    View m10 = hb1Var.U.m(i10);
                    if (m10 instanceof sa1) {
                        sa1Var.f39442r.e = bVar;
                        sa1 sa1Var2 = (sa1) m10;
                        sa1Var2.f39438b.f13068t0.d(false, false);
                        sa1Var2.g(false);
                    }
                }
                hb1.Z(hb1Var);
                return;
            case 15:
                ta1 ta1Var = (ta1) this.d;
                ta1Var.f40056k = false;
                ta1Var.d = (kg.b) this.f41970b;
                ta1Var.f40053g = (String) this.f41971c;
                ra1 ra1Var = (ra1) ((Utilities.Callback0Return) this.e).run();
                if (ra1Var != null) {
                    ra1Var.e(ta1Var, true);
                    return;
                }
                return;
            case 16:
                TLObject tLObject6 = (TLObject) this.f41971c;
                String str4 = (String) this.f41970b;
                org.telegram.ui.ActionBar.a2 a2Var5 = (org.telegram.ui.ActionBar.a2) this.e;
                gf1 gf1Var = ((cf1) this.d).f34651a;
                if (tLObject6 != null) {
                    TLRPC.Updates updates2 = (TLRPC.Updates) tLObject6;
                    int i14 = 0;
                    while (i14 < updates2.updates.size()) {
                        if (updates2.updates.get(i14) instanceof TL_update.TL_updateMessageID) {
                            TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) updates2.updates.get(i14);
                            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = new TLRPC.TL_messageActionTopicCreate();
                            tL_messageActionTopicCreate.title = str4;
                            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                            tL_messageService.action = tL_messageActionTopicCreate;
                            tL_messageService.peer_id = gf1Var.getMessagesController().getPeer(gf1Var.f36180a);
                            tL_messageService.dialog_id = gf1Var.f36180a;
                            tL_messageService.f18937id = tL_updateMessageID.f19170id;
                            tL_messageService.date = (int) (System.currentTimeMillis() / 1000);
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(new MessageObject(gf1.X(gf1Var), tL_messageService, false, false));
                            TLRPC.Chat chat3 = gf1Var.getMessagesController().getChat(Long.valueOf(-gf1Var.f36180a));
                            TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                            tL_forumTopic.f18968id = tL_updateMessageID.f19170id;
                            long j10 = gf1Var.f36181b;
                            if (j10 != 0) {
                                tL_forumTopic.icon_emoji_id = j10;
                                tL_forumTopic.flags |= 1;
                            }
                            tL_forumTopic.my = true;
                            tL_forumTopic.flags |= i11;
                            tL_forumTopic.topicStartMessage = tL_messageService;
                            tL_forumTopic.title = str4;
                            tL_forumTopic.top_message = tL_messageService.f18937id;
                            tL_forumTopic.topMessage = tL_messageService;
                            tL_forumTopic.from_id = gf1Var.getMessagesController().getPeer(gf1Var.getUserConfig().clientUserId);
                            tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
                            tL_forumTopic.icon_color = gf1Var.E;
                            fo foVar = gf1Var.f36189y;
                            if (foVar != null) {
                                foVar.Pa();
                                foVar.Ta();
                                foVar.tb(arrayList2, chat3, tL_messageService.f18937id, 1, 1, tL_forumTopic);
                                foVar.f35598c = true;
                                foVar.v8();
                                foVar.Rc(true);
                                foVar.f35573a1.n(true);
                                foVar.Xc();
                                foVar.R1.setCurrentTopic(foVar.d());
                                foVar.Uc(true);
                                foVar.lc(true);
                                foVar.j9(true);
                                foVar.D6(true, true);
                                foVar.Ia();
                                gf1Var.getMessagesController().getTopicsController().onTopicCreated(gf1Var.f36180a, tL_forumTopic, true);
                                gf1Var.finishFragment();
                                updates = updates2;
                            } else {
                                Bundle bundle = new Bundle();
                                updates = updates2;
                                bundle.putLong("chat_id", -gf1Var.f36180a);
                                bundle.putInt("message_id", 1);
                                bundle.putInt("unread_count", 0);
                                bundle.putBoolean("historyPreloaded", false);
                                fo foVar2 = new fo(bundle);
                                foVar2.tb(arrayList2, chat3, tL_messageService.f18937id, 1, 1, tL_forumTopic);
                                foVar2.f35598c = true;
                                gf1Var.getMessagesController().getTopicsController().onTopicCreated(gf1Var.f36180a, tL_forumTopic, true);
                                gf1Var.presentFragment(foVar2);
                            }
                        } else {
                            updates = updates2;
                        }
                        i14++;
                        updates2 = updates;
                        i11 = 2;
                    }
                }
                a2Var5.dismiss();
                return;
            case 17:
                TwoStepVerificationActivity.e0((TwoStepVerificationActivity) this.d, (byte[]) this.f41970b, (TLObject) this.f41971c, (byte[]) this.e);
                return;
            case 18:
                oh1 oh1Var = (oh1) this.d;
                String str5 = (String) this.e;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.f41970b;
                if (((TLObject) this.f41971c) instanceof TLRPC.TL_boolTrue) {
                    oh1Var.u0(new wg1(2, oh1Var, str5));
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
            case 19:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.d;
                bi.n9 n9Var = (bi.n9) this.f41970b;
                String str6 = (String) this.f41971c;
                JSONObject jSONObject = (JSONObject) this.e;
                if (z0Var.f41263c && ((c1Var = z0Var.Q) == null || !c1Var.o(n9Var))) {
                    FileLog.d("notifyEvent " + str6 + " dropped after document change");
                    return;
                }
                z0Var.d("window.Telegram.WebView.receiveEvent('" + str6 + "', " + jSONObject + ");");
                return;
            case 20:
                pi.e eVar = (pi.e) this.d;
                ((ArrayDeque) eVar.f42944a).addLast(new pi.d((ji.m5) this.f41970b, (pi.a) this.f41971c, (RequestTimeDelegate) this.e));
                eVar.B();
                return;
            case 21:
                q5.a aVar = (q5.a) this.d;
                l5.i iVar = (l5.i) this.f41970b;
                String str7 = iVar.f14580a;
                i5.g gVar = (i5.g) this.f41971c;
                l5.h hVar = (l5.h) this.e;
                aVar.getClass();
                Logger logger = q5.a.f43063f;
                try {
                    m5.e a10 = aVar.f43066c.a(str7);
                    if (a10 == null) {
                        String str8 = "Transport backend '" + str7 + "' is not registered";
                        logger.warning(str8);
                        gVar.b(new IllegalArgumentException(str8));
                    } else {
                        ((s5.g) aVar.e).f(new org.telegram.ui.Components.nz(aVar, iVar, ((j5.c) a10).a(hVar), 6));
                        gVar.b(null);
                    }
                    return;
                } catch (Exception e12) {
                    logger.warning("Error scheduling event " + e12.getMessage());
                    gVar.b(e12);
                    return;
                }
            case 22:
                rg.p2 p2Var = (rg.p2) this.d;
                p2Var.G = true;
                p2Var.H = (rg.m2[]) ((ArrayList) this.f41970b).toArray(new rg.m2[0]);
                ((tr0) this.f41971c).run((rg.m2) this.e);
                return;
            case 23:
                rg.p2 p2Var2 = (rg.p2) this.d;
                TLObject tLObject7 = (TLObject) this.f41971c;
                rg.n2 n2Var = (rg.n2) this.e;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.f41970b;
                if (tLObject7 instanceof TLRPC.TL_messageMediaDocument) {
                    p2Var2.getClass();
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) tLObject7;
                    n2Var.e = MediaDataController.getInputStickerSetItem(tL_messageMediaDocument.document, n2Var.f44141c);
                    n2Var.f44142f = tL_messageMediaDocument;
                    p2Var2.a();
                    return;
                }
                p2Var2.h();
                p2Var2.n(tL_error7);
                return;
            case 24:
                ri.s sVar = (ri.s) this.d;
                ri.k0 k0Var = (ri.k0) this.f41970b;
                ri.k0 k0Var2 = (ri.k0) this.f41971c;
                Handler handler = (Handler) this.e;
                if (sVar.f44728r0 && sVar.W == 0 && sVar.T) {
                    sVar.N.g(sVar.L, sVar.D, false);
                    sVar.U = false;
                    sVar.V = false;
                    sVar.f44702c0 = 0.0f;
                    sVar.W = 1;
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    sVar.X = elapsedRealtimeNanos;
                    sVar.Y = elapsedRealtimeNanos;
                    sVar.f44703d0 = k0Var;
                    sVar.f44704e0 = k0Var2;
                    String[] strArr2 = ri.s0.f44742a;
                    synchronized (ri.s0.class) {
                        ri.s0.b();
                        if (k0Var != k0Var2) {
                            if (k0Var == ri.k0.f44622b) {
                                i12 = 0;
                            }
                            a2 = ri.s0.a(i12);
                        } else {
                            throw new IllegalArgumentException("Camera switch direction must change");
                        }
                    }
                    sVar.f44700b0 = a2;
                    sVar.Z = ((Math.max(210, Math.min(300, 300 - ((Math.max(0, a2 - 400) * 3) / 20))) * 45) / 100) * 1000000;
                    sVar.f44698a0 = (max - max2) * 1000000;
                    sVar.f44710i.b("synthetic camera switch started: from=" + k0Var + ", to=" + k0Var2 + ", expectedWaitMs=" + sVar.f44700b0 + ", targetBlurRadiusPx=" + (((sVar.N.f44480a * 4.0f) / 48.0f) * 1.15f) + ", overdueBlurGrowth=0.35, revealMs=" + ((sVar.Z + sVar.f44698a0) / 1000000));
                    sVar.Q = -1L;
                    handler.removeCallbacks(sVar.f44739x0);
                    handler.post(sVar.f44739x0);
                    return;
                }
                return;
            case 25:
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) this.f41970b;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                TLObject tLObject8 = (TLObject) this.f41971c;
                Utilities.Callback callback2 = (Utilities.Callback) this.e;
                if (tL_error8 != null) {
                    callback.run(tL_error8);
                    return;
                } else if (tLObject8 instanceof TLRPC.payments_GiveawayInfo) {
                    callback2.run((TLRPC.payments_GiveawayInfo) tLObject8);
                    return;
                } else {
                    return;
                }
            case 26:
                final yh.m2 m2Var = (yh.m2) this.d;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.f41970b;
                yh.h1 h1Var = (yh.h1) this.f41971c;
                final View view = (View) this.e;
                org.telegram.ui.Components.ns0 ns0Var = m2Var.f48993a;
                if (savedStarGift.unsaved) {
                    savedStarGift.unsaved = false;
                    h1Var.h(savedStarGift, true, false);
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = m2Var.e.g(savedStarGift);
                    savestargift.unsave = savedStarGift.unsaved;
                    ConnectionsManager.getInstance(m2Var.f48994b).sendRequest(savestargift, null, 64);
                }
                boolean z10 = savedStarGift.pinned_to_top;
                final boolean z11 = !z10;
                if (m2Var.e.m(savedStarGift, z11, false)) {
                    new yh.p2(m2Var.getContext(), ns0Var.f49090c, savedStarGift, m2Var.f48995c, new Utilities.Callback0Return() {
                        @Override
                        public final Object run() {
                            ((h1) view).c(z11, true);
                            m2 m2Var2 = m2.this;
                            m2Var2.f48996f.u0(0);
                            return zc.a0(m2Var2.f48993a.f49088a);
                        }
                    }).show();
                    return;
                }
                if (!z10) {
                    org.telegram.ui.Components.zc.a0(ns0Var.f49088a).M(LocaleController.getString(R.string.Gift2PinnedTitle), LocaleController.getString(R.string.Gift2PinnedSubtitle), R.raw.ic_pin).j();
                } else {
                    org.telegram.messenger.g0.q(R.string.Gift2Unpinned, org.telegram.ui.Components.zc.a0(ns0Var.f49088a), R.raw.ic_unpin, 36);
                }
                ((yh.h1) view).c(z11, true);
                m2Var.f48996f.u0(0);
                return;
            case 27:
                org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) this.d;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) this.f41970b;
                pf.c cVar = (pf.c) this.f41971c;
                org.telegram.ui.ActionBar.a2 a2Var6 = (org.telegram.ui.ActionBar.a2) this.e;
                if (m2Var2 != null && tL_error9 != null) {
                    org.telegram.ui.Components.zc.a0(m2Var2).f0(tL_error9, false);
                }
                if ((m2Var2 instanceof fo) && tL_error9 == null) {
                    ((fo) m2Var2).cc();
                }
                cVar.b();
                a2Var6.dismiss();
                return;
            case 28:
                zh.r3.a0((zh.r3) this.d, (boolean[]) this.f41970b, (TL_stars.StarGiftAttribute) this.f41971c, (org.telegram.ui.Components.bd[]) this.e);
                return;
            default:
                zh.r3.S0((zh.r3) this.d, (TLObject) this.f41971c, (pi.g) this.e, (TLRPC.TL_error) this.f41970b);
                return;
        }
    }

    public yw0(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
        this.f41969a = i10;
        this.d = obj;
        this.f41971c = obj2;
        this.f41970b = obj3;
        this.e = obj4;
    }

    public yw0(Object obj, TLObject tLObject, Object obj2, TLRPC.TL_error tL_error, int i10) {
        this.f41969a = i10;
        this.d = obj;
        this.f41971c = tLObject;
        this.e = obj2;
        this.f41970b = tL_error;
    }

    public yw0(TLRPC.TL_error tL_error, Utilities.Callback callback, TLObject tLObject, Utilities.Callback callback2) {
        this.f41969a = 25;
        this.f41970b = tL_error;
        this.d = callback;
        this.f41971c = tLObject;
        this.e = callback2;
    }
}
