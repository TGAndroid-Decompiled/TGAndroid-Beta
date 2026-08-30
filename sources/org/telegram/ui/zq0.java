package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
public final class zq0 implements Runnable {
    public final int f40852a;
    public final Object f40853b;
    public final Object f40854c;

    public zq0(int i10, Object obj, Object obj2) {
        this.f40852a = i10;
        this.f40853b = obj;
        this.f40854c = obj2;
    }

    @Override
    public final void run() {
        int i10;
        org.telegram.messenger.w8 w8Var;
        ArrayList arrayList;
        int i11;
        String str;
        int i12;
        String str2;
        String str3;
        int i13;
        String[] strArr;
        String str4;
        SpannableStringBuilder spannableStringBuilder;
        String str5;
        int i14 = this.f40852a;
        long j10 = 0;
        Object obj = this.f40854c;
        Object obj2 = this.f40853b;
        switch (i14) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.Q8;
                ((kh.y0) obj2).run((Bitmap) obj);
                return;
            case 1:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                dg.q1 q1Var = (dg.q1) obj;
                Drawable[] drawableArr2 = PhotoViewer.Q8;
                q1Var.e.h();
                q1Var.f4729c.postRunnable(new cg.n0(2));
                photoViewer.f31705b0.removeView(photoViewer.K1);
                return;
            case 2:
                org.telegram.ui.Components.y5 y5Var = (org.telegram.ui.Components.y5) obj2;
                Bitmap bitmap = (Bitmap) obj;
                Drawable[] drawableArr3 = PhotoViewer.Q8;
                if (y5Var != null) {
                    ArrayList arrayList2 = y5Var.h;
                    org.telegram.ui.Components.v5 v5Var = y5Var.f30865n;
                    if (v5Var != null) {
                        arrayList2.add(v5Var);
                    }
                    org.telegram.ui.Components.v5 v5Var2 = y5Var.f30870r;
                    if (v5Var2 != null) {
                        arrayList2.add(v5Var2);
                    }
                    org.telegram.ui.Components.v5 v5Var3 = y5Var.f30872s;
                    if (v5Var3 != null) {
                        arrayList2.add(v5Var3);
                    }
                    y5Var.f30865n = new org.telegram.ui.Components.v5(bitmap);
                    y5Var.f30870r = null;
                    y5Var.f30872s = null;
                    y5Var.t();
                    return;
                }
                return;
            case 3:
                lr0 lr0Var = (lr0) obj2;
                lr0Var.getClass();
                ((View) obj).setOutlineProvider(null);
                PhotoViewer photoViewer2 = lr0Var.f36130c;
                ImageView imageView = photoViewer2.f31878u3;
                if (imageView != null) {
                    imageView.setOutlineProvider(null);
                }
                au0 au0Var = photoViewer2.B2;
                if (au0Var != null) {
                    au0Var.setOutlineProvider(null);
                    return;
                }
                return;
            case 4:
                ws0 ws0Var = (ws0) obj2;
                org.telegram.ui.Components.i71 i71Var = (org.telegram.ui.Components.i71) obj;
                ws0Var.getClass();
                if (i71Var.p() > 0 && i71Var.n() >= i71Var.p() - 590) {
                    ws0Var.f39789a.f31705b0.invalidate();
                    return;
                }
                return;
            case 5:
                at0 at0Var = (at0) obj2;
                dg.q1 q1Var2 = (dg.q1) obj;
                q1Var2.e.h();
                q1Var2.f4729c.postRunnable(new cg.n0(2));
                try {
                    at0Var.f32700b.f31705b0.removeView(q1Var2);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 6:
                ah.d dVar = (ah.d) obj;
                PhotoViewer photoViewer3 = ((es0) obj2).f34082b;
                if (photoViewer3.f31926z3 != null) {
                    ImageView imageView2 = photoViewer3.f31878u3;
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                        photoViewer3.f31878u3.setImageBitmap(photoViewer3.f31926z3);
                    }
                    ((ImageReceiver) dVar.f197b).setImageBitmap(photoViewer3.f31926z3);
                    return;
                }
                return;
            case 7:
                ((kt0) obj2).f35813r.f31775i7.lock();
                ((AnimatorSet) obj).start();
                return;
            case 8:
                ju0 ju0Var = (ju0) obj;
                ((kt0) obj2).f35813r.f31834p4 = false;
                if (!ju0Var.f35510s) {
                    ju0Var.f35495a.setVisible(false, true);
                    return;
                }
                return;
            case 9:
                rv0 rv0Var = (rv0) obj2;
                rv0Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                rv0Var.c(true);
                return;
            case 10:
                rv0 rv0Var2 = (rv0) obj2;
                rv0Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.PollAnswer) obj).text, false));
                rv0Var2.c(true);
                return;
            case 11:
                rv0 rv0Var3 = (rv0) obj2;
                SendMessagesHelper.getInstance(rv0Var3.E.currentAccount).deletePollOption(rv0Var3.E, (byte[]) obj);
                rv0Var3.c(true);
                return;
            case 12:
                PrivacyControlActivity.W((PrivacyControlActivity) obj2, (TLObject) obj);
                return;
            case 13:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj2;
                boolean[] zArr = (boolean[]) obj;
                privacyControlActivity.getClass();
                zArr[0] = true;
                if (zArr[1]) {
                    privacyControlActivity.x0();
                    return;
                }
                return;
            case 14:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                privacySettingsActivity.d = (TL_account.Password) obj;
                privacySettingsActivity.y0();
                return;
            case 15:
                PrivacySettingsActivity privacySettingsActivity2 = (PrivacySettingsActivity) obj2;
                boolean z4 = !privacySettingsActivity2.S;
                privacySettingsActivity2.S = z4;
                ((org.telegram.ui.Cells.s8) obj).setChecked(z4);
                return;
            case 16:
                ((mx0) obj2).getMessagesController().unblockPeer(((Long) obj).longValue());
                return;
            case 17:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                int i15 = NotificationCenter.closeChats;
                notificationCenter.removeObserver(profileActivity, i15);
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i15, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", ((TLRPC.EncryptedChat) ((Object[]) obj)[0]).f19192id);
                profileActivity.presentFragment(new xn(bundle), true);
                return;
            case 18:
                ProfileActivity profileActivity2 = (ProfileActivity) obj2;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj;
                long j11 = profileActivity2.f32190x2;
                if (j11 != 0) {
                    TLRPC.User user = profileActivity2.getMessagesController().getUser(Long.valueOf(j11));
                    profileActivity2.getMessagesController().deleteParticipantFromChat(profileActivity2.f32045c1, user);
                    if (profileActivity2.B2 != null && user != null && org.telegram.ui.Components.qc.a(profileActivity2)) {
                        org.telegram.ui.Components.qc.D(profileActivity2, user, profileActivity2.B2.title).j();
                    }
                    if (profileActivity2.f32150r2.participants.participants.remove(chatParticipant)) {
                        profileActivity2.e5(true, false);
                        return;
                    }
                    return;
                }
                NotificationCenter notificationCenter2 = profileActivity2.getNotificationCenter();
                int i16 = NotificationCenter.closeChats;
                notificationCenter2.removeObserver(profileActivity2, i16);
                if (AndroidUtilities.isTablet()) {
                    i10 = 0;
                    profileActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i16, Long.valueOf(-profileActivity2.f32045c1));
                } else {
                    i10 = 0;
                    profileActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i16, new Object[0]);
                }
                profileActivity2.getMessagesController().deleteParticipantFromChat(profileActivity2.f32045c1, profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.getUserConfig().getClientUserId())));
                profileActivity2.G1 = i10;
                profileActivity2.finishFragment();
                return;
            case 19:
                AndroidUtilities.addToClipboard("https://" + ((ProfileActivity) obj2).getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername((TLRPC.Chat) obj));
                return;
            case 20:
                ProfileActivity profileActivity3 = (ProfileActivity) obj2;
                profileActivity3.getClass();
                org.telegram.ui.Components.ic.e();
                af.g.s(profileActivity3.getParentActivity(), ((TL_fragment.TL_collectibleInfo) obj).url);
                return;
            case 21:
                ProfileActivity profileActivity4 = (ProfileActivity) obj2;
                profileActivity4.B2 = profileActivity4.getMessagesStorage().getChat(profileActivity4.f32045c1);
                ((CountDownLatch) obj).countDown();
                return;
            case 22:
                ProfileActivity profileActivity5 = (ProfileActivity) obj2;
                profileActivity5.getClass();
                profileActivity5.D2 = ((TLRPC.TL_channels_channelParticipant) ((TLObject) obj)).participant;
                return;
            case 23:
                ProfileActivity profileActivity6 = (ProfileActivity) obj2;
                profileActivity6.getClass();
                ((org.telegram.ui.Cells.o8) ((View) obj)).setChecked(profileActivity6.f32135p2.g());
                return;
            case 24:
                ProfileActivity profileActivity7 = (ProfileActivity) obj2;
                if (!((boolean[]) obj)[0] && (w8Var = profileActivity7.f32173u5) != null) {
                    w8Var.run();
                }
                profileActivity7.f32173u5 = null;
                return;
            case 25:
                ry0 ry0Var = (ry0) obj2;
                a0.h hVar = (a0.h) obj;
                ProfileActivity profileActivity8 = ry0Var.Y0.f38459c;
                Activity parentActivity = profileActivity8.getParentActivity();
                qz0 qz0Var = profileActivity8.f32097j5;
                int m9 = hVar.m();
                if (hVar.m() == 1) {
                    j10 = ((TLRPC.Dialog) hVar.n(0)).f19188id;
                }
                org.telegram.ui.Components.qc.x(parentActivity, qz0Var, m9, j10, ry0Var.getThemedColor(org.telegram.ui.ActionBar.j6.Fi), ry0Var.getThemedColor(org.telegram.ui.ActionBar.j6.Hi)).j();
                return;
            case 26:
                gz0 gz0Var = (gz0) obj2;
                a0.h hVar2 = (a0.h) obj;
                ProfileActivity profileActivity9 = gz0Var.Y0;
                Activity parentActivity2 = profileActivity9.getParentActivity();
                qz0 qz0Var2 = profileActivity9.f32097j5;
                int m10 = hVar2.m();
                if (hVar2.m() == 1) {
                    j10 = ((TLRPC.Dialog) hVar2.n(0)).f19188id;
                }
                org.telegram.ui.Components.qc.x(parentActivity2, qz0Var2, m10, j10, gz0Var.getThemedColor(org.telegram.ui.ActionBar.j6.Fi), gz0Var.getThemedColor(org.telegram.ui.ActionBar.j6.Hi)).j();
                return;
            case 27:
                ((g01) obj2).e.presentFragment(ProfileActivity.m4(((Long) obj).longValue()));
                return;
            case 28:
                ?? p2Var = new org.telegram.ui.ActionBar.p2(null);
                p2Var.d = (org.telegram.ui.ActionBar.f6) obj;
                ((org.telegram.ui.ActionBar.p2) obj2).presentFragment((org.telegram.ui.ActionBar.p2) p2Var);
                return;
            default:
                r01 r01Var = (r01) obj2;
                String str6 = (String) obj;
                ArrayList arrayList3 = r01Var.d;
                org.telegram.ui.ActionBar.p2 p2Var2 = r01Var.e;
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                String str7 = " ";
                String[] split = str6.split(" ");
                String[] strArr2 = new String[split.length];
                for (int i17 = 0; i17 < split.length; i17++) {
                    String translitString = LocaleController.getInstance().getTranslitString(split[i17]);
                    strArr2[i17] = translitString;
                    if (translitString.equals(split[i17])) {
                        strArr2[i17] = null;
                    }
                }
                int i18 = 0;
                while (true) {
                    q01[] q01VarArr = r01Var.f37893c;
                    if (i18 < q01VarArr.length) {
                        q01 q01Var = q01VarArr[i18];
                        if (q01Var != null) {
                            String str8 = q01Var.f37565a;
                            String str9 = " " + str8.toLowerCase();
                            int i19 = 0;
                            SpannableStringBuilder spannableStringBuilder2 = null;
                            while (i19 < split.length) {
                                if (split[i19].length() != 0) {
                                    String str10 = split[i19];
                                    i13 = i18;
                                    int indexOf = str9.indexOf(" " + str10);
                                    if (indexOf < 0 && (str5 = strArr2[i19]) != null) {
                                        indexOf = str9.indexOf(" ".concat(str5));
                                    } else {
                                        str5 = str10;
                                    }
                                    if (indexOf >= 0) {
                                        String str11 = str5;
                                        if (spannableStringBuilder2 == null) {
                                            spannableStringBuilder = new SpannableStringBuilder(str8);
                                        } else {
                                            spannableStringBuilder = spannableStringBuilder2;
                                        }
                                        str3 = str9;
                                        strArr = strArr2;
                                        str4 = str8;
                                        spannableStringBuilder.setSpan(new ForegroundColorSpan(p2Var2.getThemedColor(org.telegram.ui.ActionBar.j6.f20140q6)), indexOf, str11.length() + indexOf, 33);
                                    } else {
                                        i18 = i13 + 1;
                                        strArr2 = strArr2;
                                    }
                                } else {
                                    str3 = str9;
                                    i13 = i18;
                                    strArr = strArr2;
                                    str4 = str8;
                                    spannableStringBuilder = spannableStringBuilder2;
                                }
                                if (spannableStringBuilder != null && i19 == split.length - 1) {
                                    if (q01Var.f37568f == 502) {
                                        int i20 = 0;
                                        while (true) {
                                            if (i20 < 4) {
                                                if (UserConfig.getInstance(i20).isClientActivated()) {
                                                    i20++;
                                                }
                                            } else {
                                                i20 = -1;
                                            }
                                        }
                                        if (i20 < 0) {
                                        }
                                    }
                                    arrayList4.add(q01Var);
                                    arrayList6.add(spannableStringBuilder);
                                }
                                i19++;
                                spannableStringBuilder2 = spannableStringBuilder;
                                i18 = i13;
                                str8 = str4;
                                str9 = str3;
                                strArr2 = strArr;
                            }
                        }
                        i13 = i18;
                        i18 = i13 + 1;
                        strArr2 = strArr2;
                    } else {
                        String[] strArr3 = strArr2;
                        if (r01Var.B != null) {
                            int size = arrayList3.size();
                            int i21 = 0;
                            while (i21 < size) {
                                MessagesController.FaqSearchResult faqSearchResult = (MessagesController.FaqSearchResult) arrayList3.get(i21);
                                String str12 = str7 + faqSearchResult.title.toLowerCase();
                                int i22 = 0;
                                SpannableStringBuilder spannableStringBuilder3 = null;
                                while (true) {
                                    if (i22 < split.length) {
                                        if (split[i22].length() != 0) {
                                            String str13 = split[i22];
                                            arrayList = arrayList3;
                                            int indexOf2 = str12.indexOf(str7 + str13);
                                            if (indexOf2 < 0 && (str2 = strArr3[i22]) != null) {
                                                str13 = str2;
                                                i12 = str12.indexOf(str7.concat(str2));
                                            } else {
                                                i12 = indexOf2;
                                            }
                                            if (i12 >= 0) {
                                                if (spannableStringBuilder3 == null) {
                                                    i11 = size;
                                                    spannableStringBuilder3 = new SpannableStringBuilder(faqSearchResult.title);
                                                } else {
                                                    i11 = size;
                                                }
                                                str = str7;
                                                spannableStringBuilder3.setSpan(new ForegroundColorSpan(p2Var2.getThemedColor(org.telegram.ui.ActionBar.j6.f20140q6)), i12, str13.length() + i12, 33);
                                            }
                                        } else {
                                            arrayList = arrayList3;
                                            i11 = size;
                                            str = str7;
                                        }
                                        if (spannableStringBuilder3 != null && i22 == split.length - 1) {
                                            arrayList5.add(faqSearchResult);
                                            arrayList6.add(spannableStringBuilder3);
                                        }
                                        i22++;
                                        arrayList3 = arrayList;
                                        size = i11;
                                        str7 = str;
                                    } else {
                                        arrayList = arrayList3;
                                    }
                                }
                                i21++;
                                arrayList3 = arrayList;
                                size = size;
                                str7 = str7;
                            }
                        }
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jy0(r01Var, str6, arrayList4, arrayList5, arrayList6, 28));
                        return;
                    }
                }
                break;
        }
    }

    public zq0(org.telegram.ui.Components.lq0 lq0Var, a0.h hVar, int i10, int i11) {
        this.f40852a = i11;
        this.f40853b = lq0Var;
        this.f40854c = hVar;
    }
}
