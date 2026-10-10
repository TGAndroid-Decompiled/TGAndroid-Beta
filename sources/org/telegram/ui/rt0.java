package org.telegram.ui;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Vibrator;
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
public final class rt0 implements Runnable {
    public final int f41556a;
    public final Object f41557b;
    public final Object f41558c;

    public rt0(int i10, Object obj, Object obj2) {
        this.f41556a = i10;
        this.f41557b = obj;
        this.f41558c = obj2;
    }

    @Override
    public final void run() {
        int i10;
        org.telegram.messenger.o8 o8Var;
        ArrayList arrayList;
        int i11;
        String str;
        String str2;
        int i12;
        String[] strArr;
        String str3;
        SpannableStringBuilder spannableStringBuilder;
        String str4;
        int i13 = this.f41556a;
        long j3 = 0;
        boolean z10 = true;
        Object obj = this.f41558c;
        Object obj2 = this.f41557b;
        switch (i13) {
            case 0:
                st0 st0Var = (st0) obj2;
                org.telegram.ui.Components.l81 l81Var = (org.telegram.ui.Components.l81) obj;
                st0Var.getClass();
                if (l81Var.p() > 0 && l81Var.n() >= l81Var.p() - 590) {
                    st0Var.f41814a.f33942e0.invalidate();
                    return;
                }
                return;
            case 1:
                wt0 wt0Var = (wt0) obj2;
                qg.w0 w0Var = (qg.w0) obj;
                w0Var.f46634e.h();
                w0Var.f46633c.postRunnable(new t21(14));
                try {
                    wt0Var.f43800b.f33942e0.removeView(w0Var);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 2:
                ci.m6 m6Var = (ci.m6) obj;
                PhotoViewer photoViewer = ((at0) obj2).f36055b;
                if (photoViewer.C3 != null) {
                    ImageView imageView = photoViewer.f34114x3;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        photoViewer.f34114x3.setImageBitmap(photoViewer.C3);
                    }
                    ((ImageReceiver) m6Var.f5600b).setImageBitmap(photoViewer.C3);
                    return;
                }
                return;
            case 3:
                ((gu0) obj2).f38160r.f34008l7.lock();
                ((AnimatorSet) obj).start();
                return;
            case 4:
                ev0 ev0Var = (ev0) obj;
                ((gu0) obj2).f38160r.f34068s4 = false;
                if (!ev0Var.f37416s) {
                    ev0Var.f37400a.setVisible(false, true);
                    return;
                }
                return;
            case 5:
                mw0 mw0Var = (mw0) obj2;
                mw0Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                mw0Var.c(true);
                return;
            case 6:
                mw0 mw0Var2 = (mw0) obj2;
                mw0Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.PollAnswer) obj).text, false));
                mw0Var2.c(true);
                return;
            case 7:
                mw0 mw0Var3 = (mw0) obj2;
                SendMessagesHelper.getInstance(mw0Var3.H.currentAccount).deletePollOption(mw0Var3.H, (byte[]) obj);
                mw0Var3.c(true);
                return;
            case 8:
                PrivacyControlActivity.W((PrivacyControlActivity) obj2, (TLObject) obj);
                return;
            case 9:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj2;
                boolean[] zArr = (boolean[]) obj;
                privacyControlActivity.getClass();
                zArr[0] = true;
                if (zArr[1]) {
                    privacyControlActivity.x0();
                    return;
                }
                return;
            case 10:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                privacySettingsActivity.d = (TL_account.Password) obj;
                privacySettingsActivity.y0();
                return;
            case 11:
                PrivacySettingsActivity privacySettingsActivity2 = (PrivacySettingsActivity) obj2;
                boolean z11 = !privacySettingsActivity2.V;
                privacySettingsActivity2.V = z11;
                ((org.telegram.ui.Cells.w8) obj).setChecked(z11);
                return;
            case 12:
                ((gy0) obj2).getMessagesController().unblockPeer(((Long) obj).longValue());
                return;
            case 13:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                int i14 = NotificationCenter.closeChats;
                notificationCenter.removeObserver(profileActivity, i14);
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i14, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", ((TLRPC.EncryptedChat) ((Object[]) obj)[0]).f20050id);
                profileActivity.presentFragment(new zn(bundle), true);
                return;
            case 14:
                ProfileActivity profileActivity2 = (ProfileActivity) obj2;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj;
                long j10 = profileActivity2.A2;
                if (j10 != 0) {
                    TLRPC.User user = profileActivity2.getMessagesController().getUser(Long.valueOf(j10));
                    profileActivity2.getMessagesController().deleteParticipantFromChat(profileActivity2.f34289f1, user);
                    if (profileActivity2.E2 != null && user != null && org.telegram.ui.Components.ad.a(profileActivity2)) {
                        org.telegram.ui.Components.ad.D(profileActivity2, user, profileActivity2.E2.title).j();
                    }
                    if (profileActivity2.f34392u2.participants.participants.remove(chatParticipant)) {
                        profileActivity2.e5(true, false);
                        return;
                    }
                    return;
                }
                NotificationCenter notificationCenter2 = profileActivity2.getNotificationCenter();
                int i15 = NotificationCenter.closeChats;
                notificationCenter2.removeObserver(profileActivity2, i15);
                if (AndroidUtilities.isTablet()) {
                    i10 = 0;
                    profileActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i15, Long.valueOf(-profileActivity2.f34289f1));
                } else {
                    i10 = 0;
                    profileActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i15, new Object[0]);
                }
                profileActivity2.getMessagesController().deleteParticipantFromChat(profileActivity2.f34289f1, profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.getUserConfig().getClientUserId())));
                profileActivity2.J1 = i10;
                profileActivity2.finishFragment();
                return;
            case 15:
                AndroidUtilities.addToClipboard("https://" + ((ProfileActivity) obj2).getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername((TLRPC.Chat) obj));
                return;
            case 16:
                ProfileActivity profileActivity3 = (ProfileActivity) obj2;
                profileActivity3.getClass();
                org.telegram.ui.Components.tc.e();
                of.f.s(profileActivity3.getParentActivity(), ((TL_fragment.TL_collectibleInfo) obj).url);
                return;
            case 17:
                ProfileActivity profileActivity4 = (ProfileActivity) obj2;
                profileActivity4.E2 = profileActivity4.getMessagesStorage().getChat(profileActivity4.f34289f1);
                ((CountDownLatch) obj).countDown();
                return;
            case 18:
                ProfileActivity profileActivity5 = (ProfileActivity) obj2;
                profileActivity5.getClass();
                profileActivity5.G2 = ((TLRPC.TL_channels_channelParticipant) ((TLObject) obj)).participant;
                return;
            case 19:
                ProfileActivity profileActivity6 = (ProfileActivity) obj2;
                profileActivity6.getClass();
                ((org.telegram.ui.Cells.r8) ((View) obj)).setChecked(profileActivity6.f34378s2.g());
                return;
            case 20:
                ProfileActivity profileActivity7 = (ProfileActivity) obj2;
                if (!((boolean[]) obj)[0] && (o8Var = profileActivity7.f34417x5) != null) {
                    o8Var.run();
                }
                profileActivity7.f34417x5 = null;
                return;
            case 21:
                jz0 jz0Var = (jz0) obj2;
                a0.i iVar = (a0.i) obj;
                ProfileActivity profileActivity8 = jz0Var.f39090b1.f39425c;
                Activity parentActivity = profileActivity8.getParentActivity();
                i01 i01Var = profileActivity8.f34338m5;
                int m10 = iVar.m();
                if (iVar.m() == 1) {
                    j3 = ((TLRPC.Dialog) iVar.n(0)).f20046id;
                }
                org.telegram.ui.Components.ad.x(parentActivity, i01Var, m10, j3, jz0Var.getThemedColor(org.telegram.ui.ActionBar.i6.Fi), jz0Var.getThemedColor(org.telegram.ui.ActionBar.i6.Hi)).j();
                return;
            case 22:
                yz0 yz0Var = (yz0) obj2;
                a0.i iVar2 = (a0.i) obj;
                ProfileActivity profileActivity9 = yz0Var.f44478b1;
                Activity parentActivity2 = profileActivity9.getParentActivity();
                i01 i01Var2 = profileActivity9.f34338m5;
                int m11 = iVar2.m();
                if (iVar2.m() == 1) {
                    j3 = ((TLRPC.Dialog) iVar2.n(0)).f20046id;
                }
                org.telegram.ui.Components.ad.x(parentActivity2, i01Var2, m11, j3, yz0Var.getThemedColor(org.telegram.ui.ActionBar.i6.Fi), yz0Var.getThemedColor(org.telegram.ui.ActionBar.i6.Hi)).j();
                return;
            case 23:
                ((y01) obj2).f44235e.presentFragment(ProfileActivity.m4(((Long) obj).longValue()));
                return;
            case 24:
                ?? n2Var = new org.telegram.ui.ActionBar.n2(null);
                n2Var.d = (org.telegram.ui.ActionBar.e6) obj;
                ((org.telegram.ui.ActionBar.n2) obj2).presentFragment((org.telegram.ui.ActionBar.n2) n2Var);
                return;
            case 25:
                i11 i11Var = (i11) obj2;
                String str5 = (String) obj;
                ArrayList arrayList2 = i11Var.d;
                org.telegram.ui.ActionBar.n2 n2Var2 = i11Var.f38488e;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                String[] split = str5.split(" ");
                String[] strArr2 = new String[split.length];
                for (int i16 = 0; i16 < split.length; i16++) {
                    String translitString = LocaleController.getInstance().getTranslitString(split[i16]);
                    strArr2[i16] = translitString;
                    if (translitString.equals(split[i16])) {
                        strArr2[i16] = null;
                    }
                }
                int i17 = 0;
                while (true) {
                    h11[] h11VarArr = i11Var.f38487c;
                    boolean z12 = z10;
                    if (i17 < h11VarArr.length) {
                        h11 h11Var = h11VarArr[i17];
                        if (h11Var != null) {
                            String str6 = h11Var.f38234a;
                            String str7 = " " + str6.toLowerCase();
                            int i18 = 0;
                            SpannableStringBuilder spannableStringBuilder2 = null;
                            while (i18 < split.length) {
                                if (split[i18].length() != 0) {
                                    String str8 = split[i18];
                                    i12 = i17;
                                    int indexOf = str7.indexOf(" " + str8);
                                    if (indexOf < 0 && (str4 = strArr2[i18]) != null) {
                                        indexOf = str7.indexOf(" ".concat(str4));
                                    } else {
                                        str4 = str8;
                                    }
                                    if (indexOf >= 0) {
                                        String str9 = str4;
                                        if (spannableStringBuilder2 == null) {
                                            spannableStringBuilder = new SpannableStringBuilder(str6);
                                        } else {
                                            spannableStringBuilder = spannableStringBuilder2;
                                        }
                                        str2 = str7;
                                        strArr = strArr2;
                                        str3 = str5;
                                        spannableStringBuilder.setSpan(new ForegroundColorSpan(n2Var2.getThemedColor(org.telegram.ui.ActionBar.i6.q6)), indexOf, str9.length() + indexOf, 33);
                                    } else {
                                        i17 = i12 + 1;
                                        z10 = z12;
                                        str5 = str5;
                                        strArr2 = strArr2;
                                    }
                                } else {
                                    str2 = str7;
                                    i12 = i17;
                                    strArr = strArr2;
                                    str3 = str5;
                                    spannableStringBuilder = spannableStringBuilder2;
                                }
                                if (spannableStringBuilder != null && i18 == split.length - 1) {
                                    if (h11Var.f38238f == 502) {
                                        int i19 = 0;
                                        while (true) {
                                            if (i19 < 4) {
                                                if (UserConfig.getInstance(i19).isClientActivated()) {
                                                    i19++;
                                                }
                                            } else {
                                                i19 = -1;
                                            }
                                        }
                                        if (i19 < 0) {
                                        }
                                    }
                                    arrayList3.add(h11Var);
                                    arrayList5.add(spannableStringBuilder);
                                }
                                i18++;
                                spannableStringBuilder2 = spannableStringBuilder;
                                i17 = i12;
                                str5 = str3;
                                str7 = str2;
                                strArr2 = strArr;
                            }
                        }
                        i12 = i17;
                        i17 = i12 + 1;
                        z10 = z12;
                        str5 = str5;
                        strArr2 = strArr2;
                    } else {
                        String[] strArr3 = strArr2;
                        String str10 = str5;
                        if (i11Var.E != null) {
                            int size = arrayList2.size();
                            int i20 = 0;
                            while (i20 < size) {
                                MessagesController.FaqSearchResult faqSearchResult = (MessagesController.FaqSearchResult) arrayList2.get(i20);
                                String str11 = " " + faqSearchResult.title.toLowerCase();
                                int i21 = 0;
                                SpannableStringBuilder spannableStringBuilder3 = null;
                                while (true) {
                                    if (i21 < split.length) {
                                        if (split[i21].length() != 0) {
                                            String str12 = split[i21];
                                            int indexOf2 = str11.indexOf(" " + str12);
                                            arrayList = arrayList2;
                                            if (indexOf2 < 0 && (str = strArr3[i21]) != null) {
                                                indexOf2 = str11.indexOf(" ".concat(str));
                                                str12 = str;
                                            }
                                            if (indexOf2 >= 0) {
                                                if (spannableStringBuilder3 == null) {
                                                    spannableStringBuilder3 = new SpannableStringBuilder(faqSearchResult.title);
                                                }
                                                i11 = size;
                                                spannableStringBuilder3.setSpan(new ForegroundColorSpan(n2Var2.getThemedColor(org.telegram.ui.ActionBar.i6.q6)), indexOf2, str12.length() + indexOf2, 33);
                                            }
                                        } else {
                                            arrayList = arrayList2;
                                            i11 = size;
                                        }
                                        if (spannableStringBuilder3 != null && i21 == split.length - 1) {
                                            arrayList4.add(faqSearchResult);
                                            arrayList5.add(spannableStringBuilder3);
                                        }
                                        i21++;
                                        arrayList2 = arrayList;
                                        size = i11;
                                    } else {
                                        arrayList = arrayList2;
                                    }
                                }
                                i20++;
                                arrayList2 = arrayList;
                                size = size;
                            }
                        }
                        AndroidUtilities.runOnUIThread(new g90(i11Var, str10, arrayList3, arrayList4, arrayList5, 22));
                        return;
                    }
                }
                break;
            case 26:
                i11 i11Var2 = (i11) obj2;
                ArrayList<MessagesController.FaqSearchResult> arrayList6 = (ArrayList) obj;
                i11Var2.d.addAll(arrayList6);
                int i22 = i11Var2.f38489f;
                MessagesController.getInstance(i22).faqSearchArray = arrayList6;
                MessagesController.getInstance(i22).faqWebPage = i11Var2.E;
                if (!i11Var2.f38493w) {
                    i11Var2.l();
                    return;
                }
                return;
            case 27:
                m11 m11Var = (m11) obj2;
                m11Var.f39784f.add((o11) obj);
                m11Var.a();
                return;
            case 28:
                ((e31) obj2).d0(34, (Bitmap) obj, true);
                return;
            default:
                y21 y21Var = (y21) obj2;
                TLRPC.TL_exportedContactToken tL_exportedContactToken = (TLRPC.TL_exportedContactToken) obj;
                if (tL_exportedContactToken == null) {
                    y21Var.getClass();
                    return;
                }
                int i23 = y21Var.J;
                if (i23 != 0 && i23 < tL_exportedContactToken.expires) {
                    try {
                        Vibrator vibrator = (Vibrator) y21Var.getContext().getSystemService("vibrator");
                        if (vibrator != null) {
                            vibrator.vibrate(100L);
                        }
                    } catch (Exception unused) {
                        try {
                            y21Var.performHapticFeedback(0, 2);
                        } catch (Exception unused2) {
                        }
                    }
                }
                y21Var.J = tL_exportedContactToken.expires;
                y21Var.c(tL_exportedContactToken.url, null, false, true);
                return;
        }
    }

    public rt0(org.telegram.ui.Components.nr0 nr0Var, a0.i iVar, int i10, int i11) {
        this.f41556a = i11;
        this.f41557b = nr0Var;
        this.f41558c = iVar;
    }
}
