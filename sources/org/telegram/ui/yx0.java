package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.location.Location;
import android.os.Bundle;
import android.text.SpannableString;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class yx0 implements Runnable {
    public final int f43726a;
    public final Object f43727b;
    public final Object f43728c;
    public final Object d;
    public final Object f43729e;

    public yx0(int i10, Object obj, Object obj2, Object obj3, String str) {
        this.f43726a = i10;
        this.f43728c = obj;
        this.d = obj2;
        this.f43729e = str;
        this.f43727b = obj3;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yx0.a():void");
    }

    @Override
    public final void run() {
        int indexOf;
        TLObject chat;
        int i10;
        boolean z4;
        char c3;
        String formatPluralString;
        String path;
        String path2;
        String path3;
        String path4;
        float f10;
        long j10;
        float f11;
        float f12;
        VideoEditedInfo.Part part;
        long j11;
        long j12;
        ArrayList<VideoEditedInfo.Part> arrayList;
        int[] iArr;
        int i11;
        ArrayList arrayList2;
        int i12 = this.f43726a;
        String str = null;
        int i13 = 0;
        Object obj = this.f43729e;
        Object obj2 = this.f43727b;
        Object obj3 = this.d;
        Object obj4 = this.f43728c;
        switch (i12) {
            case 0:
                ProfileActivity.n0((ProfileActivity) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (String) obj);
                return;
            case 1:
                TLObject tLObject = (TLObject) obj2;
                UserConfig userConfig = (UserConfig) obj3;
                TLRPC.Photo photo = (TLRPC.Photo) obj;
                ProfileActivity profileActivity = ((qz0) obj4).f40724b;
                profileActivity.f34632k0.Z0--;
                if (tLObject instanceof TLRPC.TL_photos_photo) {
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                    profileActivity.getMessagesController().putUsers(tL_photos_photo.users, false);
                    TLRPC.User user = profileActivity.getMessagesController().getUser(Long.valueOf(userConfig.clientUserId));
                    TLRPC.Photo photo2 = tL_photos_photo.photo;
                    if (photo2 instanceof TLRPC.TL_photo) {
                        ArrayList arrayList3 = profileActivity.f34632k0.S0;
                        if (!arrayList3.isEmpty() && (indexOf = arrayList3.indexOf(photo)) >= 0) {
                            arrayList3.set(indexOf, photo2);
                        }
                        if (user != null) {
                            user.photo.photo_id = tL_photos_photo.photo.f20867id;
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
                TLObject tLObject2 = (TLObject) obj2;
                TLRPC.TL_username tL_username = (TLRPC.TL_username) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                ProfileActivity profileActivity2 = ((b01) obj4).f35277c.f37715e;
                profileActivity2.M4(null);
                if (tLObject2 instanceof TL_fragment.TL_collectibleInfo) {
                    if (profileActivity2.f34569b1 != 0) {
                        chat = profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.f34569b1));
                    } else {
                        chat = profileActivity2.getMessagesController().getChat(Long.valueOf(profileActivity2.f34577c1));
                    }
                    TLObject tLObject3 = chat;
                    if (profileActivity2.getParentActivity() != null) {
                        e20.a(profileActivity2.getParentActivity(), 0, tL_username.username, tLObject3, (TL_fragment.TL_collectibleInfo) tLObject2, profileActivity2.f34714w0);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Components.qc.b0(tL_error);
                return;
            case 3:
                SessionsActivity sessionsActivity = (SessionsActivity) obj4;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) obj;
                sessionsActivity.getClass();
                try {
                    d2Var.dismiss();
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                if (tL_error2 == null) {
                    sessionsActivity.f34820e.remove(tL_webAuthorization);
                    sessionsActivity.m0();
                    b81 b81Var = sessionsActivity.f34817a;
                    if (b81Var != null) {
                        b81Var.l();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                SessionsActivity sessionsActivity2 = (SessionsActivity) obj4;
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) obj2;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj3;
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) obj;
                sessionsActivity2.getClass();
                try {
                    d2Var2.dismiss();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (tL_error3 == null) {
                    sessionsActivity2.f34820e.remove(tL_authorization);
                    sessionsActivity2.f34821f.remove(tL_authorization);
                    sessionsActivity2.m0();
                    b81 b81Var2 = sessionsActivity2.f34817a;
                    if (b81Var2 != null) {
                        b81Var2.l();
                        return;
                    }
                    return;
                }
                return;
            case 5:
                a81 a81Var = (a81) obj4;
                a81Var.f35061a = (TLObject) obj2;
                a81Var.f35062b = (TLRPC.TL_error) obj3;
                ((m9) obj).run();
                return;
            case 6:
                p81.b0((p81) obj4, (TLRPC.TL_error) obj3, (TLObject) obj2, (String) obj);
                return;
            case 7:
                s91 s91Var = (s91) obj4;
                xf.b bVar = (xf.b) obj3;
                String str2 = (String) obj;
                ga1 ga1Var = (ga1) obj2;
                ha1 ha1Var = s91Var.f41173w;
                if (bVar != null) {
                    ha1Var.S.put(str2, bVar);
                }
                if (bVar != null && !ga1Var.f37145b && (i10 = ga1Var.f37144a) >= 0) {
                    View m9 = ha1Var.R.m(i10);
                    if (m9 instanceof s91) {
                        s91Var.f40873r.f41545e = bVar;
                        s91 s91Var2 = (s91) m9;
                        s91Var2.f40868b.f49569q0.d(false, false);
                        s91Var2.g(false);
                    }
                }
                ha1.Z(ha1Var);
                return;
            case 8:
                t91 t91Var = (t91) obj4;
                t91Var.f41550k = false;
                t91Var.d = (xf.b) obj3;
                t91Var.f41547g = (String) obj;
                r91 r91Var = (r91) ((Utilities.Callback0Return) obj2).run();
                if (r91Var != null) {
                    r91Var.e(t91Var, true);
                    return;
                }
                return;
            case 9:
                TLObject tLObject4 = (TLObject) obj2;
                String str3 = (String) obj;
                org.telegram.ui.ActionBar.d2 d2Var3 = (org.telegram.ui.ActionBar.d2) obj3;
                ie1 ie1Var = ((ee1) obj4).f36569a;
                if (tLObject4 != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject4;
                    for (int i14 = 0; i14 < updates.updates.size(); i14++) {
                        if (updates.updates.get(i14) instanceof TL_update.TL_updateMessageID) {
                            TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) updates.updates.get(i14);
                            TLRPC.TL_messageActionTopicCreate tL_messageActionTopicCreate = new TLRPC.TL_messageActionTopicCreate();
                            tL_messageActionTopicCreate.title = str3;
                            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                            tL_messageService.action = tL_messageActionTopicCreate;
                            tL_messageService.peer_id = ie1Var.getMessagesController().getPeer(ie1Var.f37820a);
                            tL_messageService.dialog_id = ie1Var.f37820a;
                            tL_messageService.f20864id = tL_updateMessageID.f21098id;
                            tL_messageService.date = (int) (System.currentTimeMillis() / 1000);
                            ArrayList arrayList4 = new ArrayList();
                            arrayList4.add(new MessageObject(ie1.X(ie1Var), tL_messageService, false, false));
                            TLRPC.Chat chat2 = ie1Var.getMessagesController().getChat(Long.valueOf(-ie1Var.f37820a));
                            TLRPC.TL_forumTopic tL_forumTopic = new TLRPC.TL_forumTopic();
                            tL_forumTopic.f20895id = tL_updateMessageID.f21098id;
                            long j13 = ie1Var.f37821b;
                            if (j13 != 0) {
                                tL_forumTopic.icon_emoji_id = j13;
                                z4 = true;
                                tL_forumTopic.flags |= 1;
                            } else {
                                z4 = true;
                            }
                            tL_forumTopic.my = z4;
                            tL_forumTopic.flags |= 2;
                            tL_forumTopic.topicStartMessage = tL_messageService;
                            tL_forumTopic.title = str3;
                            tL_forumTopic.top_message = tL_messageService.f20864id;
                            tL_forumTopic.topMessage = tL_messageService;
                            tL_forumTopic.from_id = ie1Var.getMessagesController().getPeer(ie1Var.getUserConfig().clientUserId);
                            tL_forumTopic.notify_settings = new TLRPC.TL_peerNotifySettings();
                            tL_forumTopic.icon_color = ie1Var.B;
                            xn xnVar = ie1Var.f37830y;
                            if (xnVar != null) {
                                xnVar.La();
                                xnVar.Pa();
                                xnVar.pb(arrayList4, chat2, tL_messageService.f20864id, 1, 1, tL_forumTopic);
                                xnVar.f43139c = true;
                                xnVar.r8();
                                xnVar.Nc(true);
                                xnVar.X0.n(true);
                                xnVar.Tc();
                                xnVar.O1.setCurrentTopic(xnVar.b());
                                xnVar.Qc(true);
                                xnVar.hc(true);
                                xnVar.e9(true);
                                xnVar.A6(true, true);
                                xnVar.Ea();
                                ie1Var.getMessagesController().getTopicsController().onTopicCreated(ie1Var.f37820a, tL_forumTopic, true);
                                ie1Var.finishFragment();
                            } else {
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", -ie1Var.f37820a);
                                bundle.putInt("message_id", 1);
                                bundle.putInt("unread_count", 0);
                                bundle.putBoolean("historyPreloaded", false);
                                xn xnVar2 = new xn(bundle);
                                xnVar2.pb(arrayList4, chat2, tL_messageService.f20864id, 1, 1, tL_forumTopic);
                                xnVar2.f43139c = true;
                                ie1Var.getMessagesController().getTopicsController().onTopicCreated(ie1Var.f37820a, tL_forumTopic, true);
                                ie1Var.presentFragment(xnVar2);
                            }
                        }
                    }
                }
                d2Var3.dismiss();
                return;
            case 10:
                TwoStepVerificationActivity.e0((TwoStepVerificationActivity) obj4, (byte[]) obj3, (TLObject) obj2, (byte[]) obj);
                return;
            case 11:
                qg1 qg1Var = (qg1) obj4;
                String str4 = (String) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj3;
                if (((TLObject) obj2) instanceof TLRPC.TL_boolTrue) {
                    qg1Var.u0(new w01(29, qg1Var, str4));
                    return;
                } else if (tL_error4 != null && !tL_error4.text.startsWith("CODE_INVALID")) {
                    if (tL_error4.text.startsWith("FLOOD_WAIT")) {
                        int intValue = Utilities.parseInt((CharSequence) tL_error4.text).intValue();
                        if (intValue < 60) {
                            c3 = 0;
                            formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                        } else {
                            c3 = 0;
                            formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                        }
                        String string = LocaleController.getString(R.string.TwoStepVerificationTitle);
                        int i15 = R.string.FloodWaitTime;
                        Object[] objArr = new Object[1];
                        objArr[c3] = formatPluralString;
                        qg1Var.G0(string, LocaleController.formatString("FloodWaitTime", i15, objArr));
                        return;
                    }
                    qg1Var.G0(LocaleController.getString(R.string.TwoStepVerificationTitle), tL_error4.text);
                    return;
                } else {
                    qg1Var.y0();
                    return;
                }
            case 12:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) obj4;
                String str5 = (String) obj;
                String str6 = (String) obj3;
                if (!(((TLObject) obj2) instanceof TLRPC.TL_boolTrue)) {
                    a1Var.v("file_download_requested", org.telegram.ui.web.a1.x("cancelled", "status"));
                    return;
                }
                Context context = a1Var.getContext();
                String userName = UserObject.getUserName(a1Var.R);
                final lh.h hVar = new lh.h(a1Var, str5, str6, 12);
                HashMap hashMap = sh.h0.f47445g;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                String string2 = LocaleController.getString(R.string.BotDownloadFileTitle);
                org.telegram.ui.ActionBar.d2 d2Var4 = alertDialog$Builder.f21166a;
                d2Var4.O = string2;
                d2Var4.Q = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotDownloadFileText, userName));
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                linearLayout.setOrientation(0);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setBackground(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(44.0f), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Oh, false)));
                imageView.setImageResource(R.drawable.msg_round_file_s);
                linearLayout.addView(imageView, k7.c6.t(44, 44, 19, 0, 0, 10, 0));
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(1);
                TextView g10 = org.telegram.messenger.y3.g(context, 1, 15.0f);
                g10.setTypeface(AndroidUtilities.bold());
                g10.setText(str6);
                g10.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21838n5, false));
                linearLayout2.addView(g10, k7.c6.k(0.0f, 0.0f, 0.0f, 3.0f, -1, -2));
                org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, true, true, true);
                k6Var.setTextSize(AndroidUtilities.dp(12.0f));
                SpannableString spannableString = new SpannableString("l");
                org.telegram.ui.Components.l90 l90Var = new org.telegram.ui.Components.l90(AndroidUtilities.dp(55.0f), k6Var);
                int i16 = org.telegram.ui.ActionBar.k6.Ed;
                l90Var.a(org.telegram.ui.ActionBar.k6.l1(0.35f, org.telegram.ui.ActionBar.k6.w0(null, i16, false)), org.telegram.ui.ActionBar.k6.l1(0.075f, org.telegram.ui.ActionBar.k6.w0(null, i16, false)));
                spannableString.setSpan(l90Var, 0, 1, 33);
                k6Var.setText(spannableString);
                qh.d4 d4Var = new qh.d4(k6Var, 9);
                HashMap hashMap2 = sh.h0.h;
                if (hashMap2.containsKey(str5)) {
                    Pair pair = (Pair) hashMap2.get(str5);
                    d4Var.run((String) pair.first, (Long) pair.second);
                } else {
                    new sh.b0(str5, d4Var).execute(str5);
                }
                k6Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i16, false));
                linearLayout2.addView(k6Var, k7.c6.n(-1, 15));
                linearLayout.addView(linearLayout2, k7.c6.t(-1, -2, 23, 0, 0, 0, 2));
                alertDialog$Builder.n(linearLayout);
                final boolean[] zArr = new boolean[1];
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.c2() {
                    @Override
                    public final void j(org.telegram.ui.ActionBar.d2 d2Var5, int i17) {
                        switch (r3) {
                            case 0:
                                boolean[] zArr2 = zArr;
                                if (!zArr2[0]) {
                                    hVar.run(Boolean.FALSE);
                                    zArr2[0] = true;
                                    return;
                                }
                                return;
                            default:
                                boolean[] zArr3 = zArr;
                                if (!zArr3[0]) {
                                    hVar.run(Boolean.TRUE);
                                    zArr3[0] = true;
                                    return;
                                }
                                return;
                        }
                    }
                });
                alertDialog$Builder.k(LocaleController.getString(R.string.BotDownloadFileDownload), new org.telegram.ui.ActionBar.c2() {
                    @Override
                    public final void j(org.telegram.ui.ActionBar.d2 d2Var5, int i17) {
                        switch (r3) {
                            case 0:
                                boolean[] zArr2 = zArr;
                                if (!zArr2[0]) {
                                    hVar.run(Boolean.FALSE);
                                    zArr2[0] = true;
                                    return;
                                }
                                return;
                            default:
                                boolean[] zArr3 = zArr;
                                if (!zArr3[0]) {
                                    hVar.run(Boolean.TRUE);
                                    zArr3[0] = true;
                                    return;
                                }
                                return;
                        }
                    }
                });
                d2Var4.setOnDismissListener(new hg.g(15, zArr, hVar));
                d2Var4.show();
                return;
            case 13:
                qh.j5 j5Var = (qh.j5) obj4;
                Bitmap[] bitmapArr = (Bitmap[]) obj3;
                qh.s6 s6Var = (qh.s6) obj2;
                boolean[] zArr2 = (boolean[]) obj;
                org.telegram.ui.Components.ba baVar = j5Var.D;
                Bitmap bitmap = j5Var.f45462a;
                if (bitmap != null && !bitmap.isRecycled()) {
                    j5Var.f45462a.recycle();
                }
                Bitmap bitmap2 = bitmapArr[0];
                j5Var.f45462a = bitmap2;
                if (s6Var != null && !s6Var.f46047c && s6Var.K && bitmap2 != null) {
                    s6Var.f46065k0 = bitmap2.getWidth();
                    s6Var.f46067l0 = j5Var.f45462a.getHeight();
                    s6Var.A();
                }
                if (zArr2[0] && s6Var != null && baVar != null && j5Var.f45462a != null) {
                    baVar.e();
                    baVar.f(s6Var.b(j5Var.f45462a, 0.2f), false);
                    qh.g8 g8Var = j5Var.v;
                    if (g8Var != null) {
                        g8Var.run();
                    }
                }
                j5Var.r();
                j5Var.invalidate();
                return;
            case 14:
                qh.s6 s6Var2 = (qh.s6) obj4;
                String str7 = (String) obj;
                int[][] iArr2 = (int[][]) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                s6Var2.getClass();
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                videoEditedInfo.isStory = true;
                videoEditedInfo.fromCamera = s6Var2.f46049c1;
                videoEditedInfo.originalWidth = s6Var2.f46065k0;
                videoEditedInfo.originalHeight = s6Var2.f46067l0;
                videoEditedInfo.resultWidth = s6Var2.f46061i0;
                videoEditedInfo.resultHeight = s6Var2.f46063j0;
                File file = s6Var2.P0;
                if (file == null) {
                    path = null;
                } else {
                    path = file.getPath();
                }
                videoEditedInfo.paintPath = path;
                File file2 = s6Var2.W0;
                if (file2 == null) {
                    path2 = null;
                } else {
                    path2 = file2.getPath();
                }
                videoEditedInfo.messagePath = path2;
                File file3 = s6Var2.X0;
                if (file3 == null) {
                    path3 = null;
                } else {
                    path3 = file3.getPath();
                }
                videoEditedInfo.messageVideoMaskPath = path3;
                File file4 = s6Var2.Y0;
                if (file4 == null) {
                    path4 = null;
                } else {
                    path4 = file4.getPath();
                }
                videoEditedInfo.backgroundPath = path4;
                int extractRealEncoderBitrate = MediaController.extractRealEncoderBitrate(videoEditedInfo.resultWidth, videoEditedInfo.resultHeight, videoEditedInfo.bitrate, true);
                if (s6Var2.K && str7 != null && !s6Var2.v()) {
                    videoEditedInfo.originalPath = str7;
                    videoEditedInfo.isPhoto = false;
                    videoEditedInfo.framerate = Math.min(59, iArr2[0][7]);
                    int videoBitrate = MediaController.getVideoBitrate(str7);
                    if (videoBitrate == -1) {
                        videoBitrate = iArr2[0][3];
                    }
                    videoEditedInfo.originalBitrate = videoBitrate;
                    if (videoBitrate < 1000000 && (arrayList2 = s6Var2.T0) != null && !arrayList2.isEmpty()) {
                        videoEditedInfo.bitrate = 2000000;
                        videoEditedInfo.originalBitrate = -1;
                    } else {
                        int i17 = videoEditedInfo.originalBitrate;
                        if (i17 < 500000) {
                            videoEditedInfo.bitrate = 2500000;
                            videoEditedInfo.originalBitrate = -1;
                        } else {
                            videoEditedInfo.bitrate = Utilities.clamp(i17, 3000000, 500000);
                        }
                    }
                    StringBuilder sb = new StringBuilder("story bitrate, original = ");
                    sb.append(videoEditedInfo.originalBitrate);
                    sb.append(" => ");
                    l.d.t(videoEditedInfo.bitrate, sb);
                    long j14 = iArr2[0][4];
                    s6Var2.f46059h0 = j14;
                    videoEditedInfo.originalDuration = j14 * 1000;
                    float f13 = (float) j14;
                    long j15 = s6Var2.Z * f13 * 1000;
                    videoEditedInfo.startTime = j15;
                    long j16 = s6Var2.f46042a0 * f13 * 1000;
                    videoEditedInfo.endTime = j16;
                    videoEditedInfo.estimatedDuration = j16 - j15;
                    videoEditedInfo.volume = s6Var2.P;
                    videoEditedInfo.muted = s6Var2.Y;
                    videoEditedInfo.estimatedSize = android.support.v4.media.a.d(i11 / 1000.0f, extractRealEncoderBitrate, 8.0f, iArr[5]);
                    videoEditedInfo.estimatedSize = Math.max(s6Var2.L.length(), videoEditedInfo.estimatedSize);
                    videoEditedInfo.filterState = s6Var2.f46043a1;
                    File file5 = s6Var2.Q0;
                    if (file5 != null) {
                        str = file5.getPath();
                    }
                    videoEditedInfo.blurPath = str;
                    j10 = 0;
                } else {
                    File file6 = s6Var2.Z0;
                    if (file6 != null) {
                        videoEditedInfo.originalPath = file6.getAbsolutePath();
                    } else {
                        videoEditedInfo.originalPath = str7;
                    }
                    videoEditedInfo.isPhoto = true;
                    videoEditedInfo.collage = s6Var2.S;
                    if (s6Var2.v()) {
                        boolean z10 = false;
                        for (int i18 = 0; i18 < s6Var2.T.size(); i18++) {
                            qh.s6 s6Var3 = (qh.s6) s6Var2.T.get(i18);
                            if (s6Var3.K) {
                                s6Var3.f46065k0 = Math.max(s6Var3.f46065k0, iArr2[i18][1]);
                                s6Var3.f46067l0 = Math.max(s6Var3.f46067l0, iArr2[i18][2]);
                                s6Var3.f46059h0 = Math.max(s6Var3.f46059h0, iArr2[i18][4]);
                                z10 = true;
                            }
                        }
                        f10 = 8.0f;
                        ArrayList<VideoEditedInfo.Part> parts = VideoEditedInfo.Part.toParts(s6Var2);
                        videoEditedInfo.collageParts = parts;
                        if (!z10) {
                            long j17 = s6Var2.S0;
                            s6Var2.f46059h0 = j17;
                            videoEditedInfo.originalDuration = j17;
                            videoEditedInfo.estimatedDuration = j17;
                        } else {
                            int size = parts.size();
                            VideoEditedInfo.Part part2 = null;
                            long j18 = 0;
                            int i19 = 0;
                            while (i19 < size) {
                                VideoEditedInfo.Part part3 = parts.get(i19);
                                i19++;
                                VideoEditedInfo.Part part4 = part3;
                                if (part4.isVideo) {
                                    long j19 = part4.duration;
                                    if (j19 > j18) {
                                        j18 = j19;
                                        part2 = part4;
                                    }
                                }
                            }
                            if (part2 != null) {
                                long j20 = (part2.right - part2.left) * ((float) part2.duration);
                                s6Var2.f46059h0 = j20;
                                videoEditedInfo.originalDuration = j20;
                                videoEditedInfo.estimatedDuration = j20;
                                j10 = -(part2.offset + (f12 * f11));
                                part2.offset = j10;
                                ArrayList<VideoEditedInfo.Part> arrayList5 = videoEditedInfo.collageParts;
                                int size2 = arrayList5.size();
                                int i20 = 0;
                                while (i20 < size2) {
                                    VideoEditedInfo.Part part5 = arrayList5.get(i20);
                                    i20++;
                                    VideoEditedInfo.Part part6 = part5;
                                    if (part6.isVideo && part6 != part2) {
                                        part = part2;
                                        part6.offset += j10;
                                    } else {
                                        part = part2;
                                    }
                                    part2 = part;
                                }
                                videoEditedInfo.startTime = -1L;
                                videoEditedInfo.endTime = -1L;
                                videoEditedInfo.muted = true;
                                videoEditedInfo.originalBitrate = -1;
                                videoEditedInfo.volume = 1.0f;
                                videoEditedInfo.bitrate = -1;
                                videoEditedInfo.framerate = 30;
                                videoEditedInfo.estimatedSize = ((((float) s6Var2.f46059h0) / 1000.0f) * extractRealEncoderBitrate) / f10;
                                videoEditedInfo.filterState = null;
                            }
                        }
                    } else {
                        f10 = 8.0f;
                        if (s6Var2.f46072o0 != null) {
                            long j21 = (s6Var2.f46082t0 - s6Var2.f46080s0) * ((float) s6Var2.f46076q0);
                            s6Var2.f46059h0 = j21;
                            videoEditedInfo.originalDuration = j21;
                            videoEditedInfo.estimatedDuration = j21;
                        } else if (s6Var2.f46090y != null) {
                            long j22 = (s6Var2.F - s6Var2.E) * ((float) s6Var2.C);
                            s6Var2.f46059h0 = j22;
                            videoEditedInfo.originalDuration = j22;
                            videoEditedInfo.estimatedDuration = j22;
                        } else {
                            long j23 = s6Var2.S0;
                            s6Var2.f46059h0 = j23;
                            videoEditedInfo.originalDuration = j23;
                            videoEditedInfo.estimatedDuration = j23;
                        }
                    }
                    j10 = 0;
                    videoEditedInfo.startTime = -1L;
                    videoEditedInfo.endTime = -1L;
                    videoEditedInfo.muted = true;
                    videoEditedInfo.originalBitrate = -1;
                    videoEditedInfo.volume = 1.0f;
                    videoEditedInfo.bitrate = -1;
                    videoEditedInfo.framerate = 30;
                    videoEditedInfo.estimatedSize = ((((float) s6Var2.f46059h0) / 1000.0f) * extractRealEncoderBitrate) / f10;
                    videoEditedInfo.filterState = null;
                }
                videoEditedInfo.account = s6Var2.f46041a;
                videoEditedInfo.wallpaperPeerId = s6Var2.f46093z0;
                videoEditedInfo.isDark = s6Var2.f46091y0;
                videoEditedInfo.avatarStartTime = -1L;
                MediaController.CropState cropState = s6Var2.m0;
                if (cropState != null) {
                    videoEditedInfo.cropState = cropState.clone();
                } else {
                    videoEditedInfo.cropState = new MediaController.CropState();
                }
                videoEditedInfo.cropState.useMatrix = new Matrix();
                videoEditedInfo.cropState.useMatrix.set(s6Var2.f46070n0);
                videoEditedInfo.mediaEntities = s6Var2.T0;
                videoEditedInfo.gradientTopColor = Integer.valueOf(s6Var2.A0);
                videoEditedInfo.gradientBottomColor = Integer.valueOf(s6Var2.B0);
                videoEditedInfo.forceFragmenting = true;
                videoEditedInfo.hdrInfo = s6Var2.f46051d1;
                videoEditedInfo.mixedSoundInfos.clear();
                if (s6Var2.v() && !s6Var2.Y) {
                    ArrayList<VideoEditedInfo.Part> arrayList6 = videoEditedInfo.collageParts;
                    int size3 = arrayList6.size();
                    int i21 = 0;
                    while (i21 < size3) {
                        VideoEditedInfo.Part part7 = arrayList6.get(i21);
                        i21++;
                        VideoEditedInfo.Part part8 = part7;
                        if (part8.isVideo && part8.volume > 0.0f && !part8.muted) {
                            MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo = new MediaCodecVideoConvertor.MixedSoundInfo(part8.path);
                            mixedSoundInfo.volume = part8.volume;
                            float f14 = part8.left;
                            float f15 = (float) part8.duration;
                            arrayList = arrayList6;
                            mixedSoundInfo.audioOffset = f14 * f15 * 1000;
                            mixedSoundInfo.startTime = part8.offset * 1000;
                            mixedSoundInfo.duration = (part8.right - f14) * f15 * 1000;
                            videoEditedInfo.mixedSoundInfos.add(mixedSoundInfo);
                        } else {
                            arrayList = arrayList6;
                        }
                        arrayList6 = arrayList;
                    }
                }
                File file7 = s6Var2.f46072o0;
                if (file7 != null) {
                    MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo2 = new MediaCodecVideoConvertor.MixedSoundInfo(file7.getAbsolutePath());
                    mixedSoundInfo2.volume = s6Var2.f46084u0;
                    float f16 = s6Var2.f46080s0;
                    float f17 = (float) s6Var2.f46076q0;
                    long j24 = f16 * f17 * 1000;
                    mixedSoundInfo2.audioOffset = j24;
                    if (s6Var2.K) {
                        mixedSoundInfo2.startTime = (((float) s6Var2.f46078r0) - (s6Var2.Z * ((float) s6Var2.f46059h0))) * 1000;
                        j12 = 0;
                    } else {
                        j12 = 0;
                        mixedSoundInfo2.startTime = 0L;
                    }
                    long j25 = mixedSoundInfo2.startTime + j10;
                    mixedSoundInfo2.startTime = j25;
                    if (j25 < j12) {
                        mixedSoundInfo2.audioOffset = j24 - j25;
                        mixedSoundInfo2.startTime = j12;
                    }
                    mixedSoundInfo2.duration = (s6Var2.f46082t0 - f16) * f17 * 1000;
                    videoEditedInfo.mixedSoundInfos.add(mixedSoundInfo2);
                }
                String str8 = s6Var2.f46090y;
                if (str8 != null) {
                    MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo3 = new MediaCodecVideoConvertor.MixedSoundInfo(str8);
                    mixedSoundInfo3.volume = s6Var2.G;
                    float f18 = s6Var2.E;
                    float f19 = (float) s6Var2.C;
                    long j26 = f18 * f19 * 1000;
                    mixedSoundInfo3.audioOffset = j26;
                    if (s6Var2.K) {
                        mixedSoundInfo3.startTime = (((float) s6Var2.D) - (s6Var2.Z * ((float) s6Var2.f46059h0))) * 1000;
                        j11 = 0;
                    } else {
                        j11 = 0;
                        mixedSoundInfo3.startTime = 0L;
                    }
                    long j27 = mixedSoundInfo3.startTime + j10;
                    mixedSoundInfo3.startTime = j27;
                    if (j27 < j11) {
                        mixedSoundInfo3.audioOffset = j26 - j27;
                        mixedSoundInfo3.startTime = j11;
                    }
                    mixedSoundInfo3.duration = (s6Var2.F - f18) * f19 * 1000;
                    videoEditedInfo.mixedSoundInfos.add(mixedSoundInfo3);
                }
                callback.run(videoEditedInfo);
                return;
            case 15:
                sf.e eVar = (sf.e) obj4;
                ((ArrayDeque) eVar.f47315b).addLast(new sf.d((mh.m5) obj3, (sf.a) obj2, (RequestTimeDelegate) obj));
                eVar.D();
                return;
            case 16:
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) obj3;
                sh.j1 j1Var = (sh.j1) obj;
                ((qh.d) obj4).setLoading(false);
                if (((TLObject) obj2) instanceof TLRPC.TL_boolTrue) {
                    h3Var.dismiss();
                    j1Var.run(Boolean.FALSE);
                    return;
                }
                return;
            case 17:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj4;
                AndroidUtilities.addToClipboard(connectedbotstarref.url);
                new org.telegram.ui.Components.qc(((org.telegram.ui.ActionBar.h3) obj3).topBulletinContainer, (org.telegram.ui.ActionBar.g6) obj2).M(LocaleController.getString(R.string.AffiliateProgramLinkCopiedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AffiliateProgramLinkCopiedText, sh.j.G0(connectedbotstarref.commission_permille), UserObject.getUserName((TLRPC.User) obj))), R.raw.copy).j();
                return;
            case 18:
                sh.d3.x0((sh.d3) obj4, (Context) obj3, (TLRPC.User) obj2, (TL_payments.connectedBotStarRef) obj);
                return;
            case 19:
                boolean[] zArr3 = (boolean[]) obj4;
                org.telegram.ui.web.s sVar = (org.telegram.ui.web.s) obj3;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj;
                if (!(((TLObject) obj2) instanceof TLRPC.TL_boolTrue)) {
                    if (!zArr3[0]) {
                        zArr3[0] = true;
                        sVar.run(Boolean.TRUE, "cancelled");
                        return;
                    }
                    return;
                }
                userFull.bot_can_manage_emoji_status = true;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    sVar.run(Boolean.TRUE, "allowed");
                    return;
                }
                return;
            case 20:
                uf.c cVar = (uf.c) obj4;
                Location location = (Location) obj3;
                String str9 = (String) obj;
                ArrayList arrayList7 = (ArrayList) obj2;
                ArrayList arrayList8 = cVar.f48511r;
                cVar.f48510n = false;
                if (location == null) {
                    cVar.C = 0;
                    cVar.h = false;
                    cVar.f48512s.clear();
                    cVar.G = false;
                    cVar.f48514x = str9;
                }
                arrayList8.clear();
                arrayList8.addAll(arrayList7);
                cVar.l();
                return;
            case 21:
                uf.c cVar2 = (uf.c) obj4;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj3;
                String str10 = (String) obj;
                TLObject tLObject5 = (TLObject) obj2;
                ArrayList arrayList9 = cVar2.f48512s;
                if (tL_error5 == null) {
                    cVar2.C = 0;
                    cVar2.h = false;
                    arrayList9.clear();
                    cVar2.G = false;
                    cVar2.f48514x = str10;
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject5;
                    int size4 = messages_botresults.results.size();
                    while (i13 < size4) {
                        TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i13);
                        if ("venue".equals(botInlineResult.type)) {
                            TLRPC.BotInlineMessage botInlineMessage = botInlineResult.send_message;
                            if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue) {
                                TLRPC.TL_botInlineMessageMediaVenue tL_botInlineMessageMediaVenue = (TLRPC.TL_botInlineMessageMediaVenue) botInlineMessage;
                                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                tL_messageMediaVenue.geo = tL_botInlineMessageMediaVenue.geo;
                                tL_messageMediaVenue.address = tL_botInlineMessageMediaVenue.address;
                                tL_messageMediaVenue.title = tL_botInlineMessageMediaVenue.title;
                                tL_messageMediaVenue.icon = android.support.v4.media.a.r(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), tL_botInlineMessageMediaVenue.venue_type, "_64.png");
                                tL_messageMediaVenue.venue_type = tL_botInlineMessageMediaVenue.venue_type;
                                tL_messageMediaVenue.venue_id = tL_botInlineMessageMediaVenue.venue_id;
                                tL_messageMediaVenue.provider = tL_botInlineMessageMediaVenue.provider;
                                tL_messageMediaVenue.query_id = messages_botresults.query_id;
                                tL_messageMediaVenue.result_id = botInlineResult.f20841id;
                                arrayList9.add(tL_messageMediaVenue);
                            }
                        }
                        i13++;
                    }
                }
                uf.b bVar2 = cVar2.f48515y;
                if (bVar2 != null) {
                    bVar2.a(arrayList9);
                }
                cVar2.l();
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new yx0((uf.k) obj4, (Runnable) obj2, (ArrayList) obj, f2.q.c((cg.a) obj3, true), 23));
                return;
            case 23:
                uf.k kVar = (uf.k) obj4;
                Runnable runnable = (Runnable) obj3;
                ArrayList arrayList10 = (ArrayList) obj2;
                f2.m mVar = (f2.m) obj;
                if (kVar.W) {
                    kVar.W = false;
                    if (runnable != null) {
                        runnable.run();
                    }
                    kVar.J = arrayList10;
                    mVar.b(kVar);
                    if (kVar.X) {
                        kVar.X = false;
                        kVar.W(runnable);
                        return;
                    }
                    return;
                }
                return;
            case 24:
                vf.t tVar = (vf.t) obj4;
                TLObject tLObject6 = (TLObject) obj2;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) obj3;
                Runnable runnable2 = (Runnable) obj;
                ArrayList arrayList11 = tVar.f49202b;
                if (tLObject6 instanceof TL_account.TL_businessChatLink) {
                    TL_account.TL_businessChatLink tL_businessChatLink2 = (TL_account.TL_businessChatLink) tLObject6;
                    int indexOf2 = arrayList11.indexOf(tL_businessChatLink);
                    if (indexOf2 != -1) {
                        arrayList11.set(indexOf2, tL_businessChatLink2);
                        NotificationCenter.getInstance(tVar.f49201a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                        tVar.f();
                        return;
                    }
                    return;
                }
                return;
            case 25:
                a();
                return;
            case 26:
                vf.p1 p1Var = (vf.p1) obj4;
                ArrayList<Integer> arrayList12 = (ArrayList) obj3;
                vf.o1 o1Var = (vf.o1) obj2;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) obj;
                int i22 = p1Var.f49170a;
                if (!arrayList12.isEmpty() && arrayList12.size() >= o1Var.a()) {
                    tL_messages_sendQuickReplyMessages.f20958id = arrayList12;
                    while (i13 < arrayList12.size()) {
                        tL_messages_sendQuickReplyMessages.random_id.add(Long.valueOf(Utilities.random.nextLong()));
                        i13++;
                    }
                    ConnectionsManager.getInstance(i22).sendRequest(tL_messages_sendQuickReplyMessages, null);
                    return;
                }
                TLRPC.TL_messages_getQuickReplyMessages tL_messages_getQuickReplyMessages = new TLRPC.TL_messages_getQuickReplyMessages();
                tL_messages_getQuickReplyMessages.shortcut_id = o1Var.f49159a;
                ConnectionsManager.getInstance(i22).sendRequest(tL_messages_getQuickReplyMessages, new hg.y(p1Var, arrayList12, tL_messages_sendQuickReplyMessages, 27));
                return;
            default:
                ((wh.q) obj4).f49929r.V4((wh.a) obj3, (TL_iv.PageBlock) obj2);
                ((org.telegram.ui.Components.q70) obj).u();
                return;
        }
    }

    public yx0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f43726a = i10;
        this.f43728c = obj;
        this.d = obj2;
        this.f43727b = obj3;
        this.f43729e = obj4;
    }

    public yx0(Object obj, Object obj2, Object obj3, Object obj4, boolean z4, int i10) {
        this.f43726a = i10;
        this.f43728c = obj;
        this.f43727b = obj2;
        this.d = obj3;
        this.f43729e = obj4;
    }

    public yx0(Object obj, TLObject tLObject, Object obj2, Object obj3, int i10) {
        this.f43726a = i10;
        this.f43728c = obj;
        this.f43727b = tLObject;
        this.f43729e = obj2;
        this.d = obj3;
    }

    public yx0(TLObject tLObject, boolean[] zArr, org.telegram.ui.web.s sVar, TLRPC.UserFull userFull) {
        this.f43726a = 19;
        this.f43727b = tLObject;
        this.f43728c = zArr;
        this.d = sVar;
        this.f43729e = userFull;
    }

    public yx0(qh.s6 s6Var, String str, int[][] iArr, Utilities.Callback callback) {
        this.f43726a = 14;
        this.f43728c = s6Var;
        this.f43729e = str;
        this.d = iArr;
        this.f43727b = callback;
    }
}
