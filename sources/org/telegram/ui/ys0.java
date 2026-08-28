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
public final class ys0 implements Runnable {
    public final int f44939a;
    public final Object f44940b;
    public final Object f44941c;

    public ys0(int i9, Object obj, Object obj2) {
        this.f44939a = i9;
        this.f44940b = obj;
        this.f44941c = obj2;
    }

    @Override
    public final void run() {
        int i9;
        org.telegram.messenger.q8 q8Var;
        int i10;
        ArrayList arrayList;
        String str;
        String str2;
        int i11;
        String[] strArr;
        String str3;
        SpannableStringBuilder spannableStringBuilder;
        String str4;
        int i12 = this.f44939a;
        long j10 = 0;
        Object obj = this.f44941c;
        Object obj2 = this.f44940b;
        switch (i12) {
            case 0:
                fh.v vVar = (fh.v) obj;
                PhotoViewer photoViewer = ((xr0) obj2).f44582b;
                if (photoViewer.f35801y3 != null) {
                    ImageView imageView = photoViewer.f35755t3;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        photoViewer.f35755t3.setImageBitmap(photoViewer.f35801y3);
                    }
                    ((ImageReceiver) vVar.f6810c).setImageBitmap(photoViewer.f35801y3);
                    return;
                }
                return;
            case 1:
                ((dt0) obj2).f37600r.f35652h7.lock();
                ((AnimatorSet) obj).start();
                return;
            case 2:
                bu0 bu0Var = (bu0) obj;
                ((dt0) obj2).f37600r.f35711o4 = false;
                if (!bu0Var.f36994s) {
                    bu0Var.f36978a.setVisible(false, true);
                    return;
                }
                return;
            case 3:
                iv0 iv0Var = (iv0) obj2;
                iv0Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                iv0Var.c(true);
                return;
            case 4:
                iv0 iv0Var2 = (iv0) obj2;
                iv0Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.PollAnswer) obj).text, false));
                iv0Var2.c(true);
                return;
            case 5:
                iv0 iv0Var3 = (iv0) obj2;
                SendMessagesHelper.getInstance(iv0Var3.D.currentAccount).deletePollOption(iv0Var3.D, (byte[]) obj);
                iv0Var3.c(true);
                return;
            case 6:
                PrivacyControlActivity.V((PrivacyControlActivity) obj2, (TLObject) obj);
                return;
            case 7:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj2;
                boolean[] zArr = (boolean[]) obj;
                privacyControlActivity.getClass();
                zArr[0] = true;
                if (zArr[1]) {
                    privacyControlActivity.w0();
                    return;
                }
                return;
            case 8:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                privacySettingsActivity.d = (TL_account.Password) obj;
                privacySettingsActivity.x0();
                return;
            case 9:
                PrivacySettingsActivity privacySettingsActivity2 = (PrivacySettingsActivity) obj2;
                boolean z10 = !privacySettingsActivity2.R;
                privacySettingsActivity2.R = z10;
                ((org.telegram.ui.Cells.t8) obj).setChecked(z10);
                return;
            case 10:
                ((cx0) obj2).getMessagesController().unblockPeer(((Long) obj).longValue());
                return;
            case 11:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                int i13 = NotificationCenter.closeChats;
                notificationCenter.removeObserver(profileActivity, i13);
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i13, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", ((TLRPC.EncryptedChat) ((Object[]) obj)[0]).f22388id);
                profileActivity.presentFragment(new qn(bundle), true);
                return;
            case 12:
                ProfileActivity profileActivity2 = (ProfileActivity) obj2;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj;
                long j11 = profileActivity2.f36072w2;
                if (j11 != 0) {
                    TLRPC.User user = profileActivity2.getMessagesController().getUser(Long.valueOf(j11));
                    profileActivity2.getMessagesController().deleteParticipantFromChat(profileActivity2.f35926b1, user);
                    if (profileActivity2.A2 != null && user != null && org.telegram.ui.Components.oc.a(profileActivity2)) {
                        org.telegram.ui.Components.oc.D(profileActivity2, user, profileActivity2.A2.title).j();
                    }
                    if (profileActivity2.f36032q2.participants.participants.remove(chatParticipant)) {
                        profileActivity2.e5(true, false);
                        return;
                    }
                    return;
                }
                NotificationCenter notificationCenter2 = profileActivity2.getNotificationCenter();
                int i14 = NotificationCenter.closeChats;
                notificationCenter2.removeObserver(profileActivity2, i14);
                if (AndroidUtilities.isTablet()) {
                    i9 = 0;
                    profileActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i14, Long.valueOf(-profileActivity2.f35926b1));
                } else {
                    i9 = 0;
                    profileActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i14, new Object[0]);
                }
                profileActivity2.getMessagesController().deleteParticipantFromChat(profileActivity2.f35926b1, profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.getUserConfig().getClientUserId())));
                profileActivity2.F1 = i9;
                profileActivity2.finishFragment();
                return;
            case 13:
                AndroidUtilities.addToClipboard("https://" + ((ProfileActivity) obj2).getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername((TLRPC.Chat) obj));
                return;
            case 14:
                ProfileActivity profileActivity3 = (ProfileActivity) obj2;
                profileActivity3.getClass();
                org.telegram.ui.Components.gc.e();
                ve.e.s(profileActivity3.getParentActivity(), ((TL_fragment.TL_collectibleInfo) obj).url);
                return;
            case 15:
                ProfileActivity profileActivity4 = (ProfileActivity) obj2;
                profileActivity4.A2 = profileActivity4.getMessagesStorage().getChat(profileActivity4.f35926b1);
                ((CountDownLatch) obj).countDown();
                return;
            case 16:
                ProfileActivity profileActivity5 = (ProfileActivity) obj2;
                profileActivity5.getClass();
                profileActivity5.C2 = ((TLRPC.TL_channels_channelParticipant) ((TLObject) obj)).participant;
                return;
            case 17:
                ProfileActivity profileActivity6 = (ProfileActivity) obj2;
                profileActivity6.getClass();
                ((org.telegram.ui.Cells.p8) ((View) obj)).setChecked(profileActivity6.f36020o2.g());
                return;
            case 18:
                ProfileActivity profileActivity7 = (ProfileActivity) obj2;
                if (!((boolean[]) obj)[0] && (q8Var = profileActivity7.f36057t5) != null) {
                    q8Var.run();
                }
                profileActivity7.f36057t5 = null;
                return;
            case 19:
                gy0 gy0Var = (gy0) obj2;
                a0.h hVar = (a0.h) obj;
                ProfileActivity profileActivity8 = gy0Var.X0.f38959c;
                Activity parentActivity = profileActivity8.getParentActivity();
                fz0 fz0Var = profileActivity8.f35982i5;
                int m10 = hVar.m();
                if (hVar.m() == 1) {
                    j10 = ((TLRPC.Dialog) hVar.n(0)).f22384id;
                }
                org.telegram.ui.Components.oc.x(parentActivity, fz0Var, m10, j10, gy0Var.getThemedColor(org.telegram.ui.ActionBar.f6.Fi), gy0Var.getThemedColor(org.telegram.ui.ActionBar.f6.Hi)).j();
                return;
            case 20:
                vy0 vy0Var = (vy0) obj2;
                a0.h hVar2 = (a0.h) obj;
                ProfileActivity profileActivity9 = vy0Var.X0;
                Activity parentActivity2 = profileActivity9.getParentActivity();
                fz0 fz0Var2 = profileActivity9.f35982i5;
                int m11 = hVar2.m();
                if (hVar2.m() == 1) {
                    j10 = ((TLRPC.Dialog) hVar2.n(0)).f22384id;
                }
                org.telegram.ui.Components.oc.x(parentActivity2, fz0Var2, m11, j10, vy0Var.getThemedColor(org.telegram.ui.ActionBar.f6.Fi), vy0Var.getThemedColor(org.telegram.ui.ActionBar.f6.Hi)).j();
                return;
            case 21:
                ((vz0) obj2).f43616e.presentFragment(ProfileActivity.m4(((Long) obj).longValue()));
                return;
            case 22:
                ?? o2Var = new org.telegram.ui.ActionBar.o2(null);
                o2Var.d = (org.telegram.ui.ActionBar.b6) obj;
                ((org.telegram.ui.ActionBar.o2) obj2).presentFragment((org.telegram.ui.ActionBar.o2) o2Var);
                return;
            case 23:
                f01 f01Var = (f01) obj2;
                String str5 = (String) obj;
                ArrayList arrayList2 = f01Var.d;
                org.telegram.ui.ActionBar.o2 o2Var2 = f01Var.f38065e;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                String[] split = str5.split(" ");
                String[] strArr2 = new String[split.length];
                for (int i15 = 0; i15 < split.length; i15++) {
                    String translitString = LocaleController.getInstance().getTranslitString(split[i15]);
                    strArr2[i15] = translitString;
                    if (translitString.equals(split[i15])) {
                        strArr2[i15] = null;
                    }
                }
                int i16 = 0;
                while (true) {
                    e01[] e01VarArr = f01Var.f38064c;
                    if (i16 < e01VarArr.length) {
                        e01 e01Var = e01VarArr[i16];
                        if (e01Var != null) {
                            String str6 = e01Var.f37776a;
                            String str7 = " " + str6.toLowerCase();
                            int i17 = 0;
                            SpannableStringBuilder spannableStringBuilder2 = null;
                            while (i17 < split.length) {
                                if (split[i17].length() != 0) {
                                    String str8 = split[i17];
                                    i11 = i16;
                                    int indexOf = str7.indexOf(" " + str8);
                                    if (indexOf < 0 && (str4 = strArr2[i17]) != null) {
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
                                        spannableStringBuilder.setSpan(new ForegroundColorSpan(o2Var2.getThemedColor(org.telegram.ui.ActionBar.f6.f23229q6)), indexOf, str9.length() + indexOf, 33);
                                    } else {
                                        i16 = i11 + 1;
                                        str5 = str5;
                                        strArr2 = strArr2;
                                    }
                                } else {
                                    str2 = str7;
                                    i11 = i16;
                                    strArr = strArr2;
                                    str3 = str5;
                                    spannableStringBuilder = spannableStringBuilder2;
                                }
                                if (spannableStringBuilder != null && i17 == split.length - 1) {
                                    if (e01Var.f37780f == 502) {
                                        int i18 = 0;
                                        while (true) {
                                            if (i18 < 4) {
                                                if (UserConfig.getInstance(i18).isClientActivated()) {
                                                    i18++;
                                                }
                                            } else {
                                                i18 = -1;
                                            }
                                        }
                                        if (i18 < 0) {
                                        }
                                    }
                                    arrayList3.add(e01Var);
                                    arrayList5.add(spannableStringBuilder);
                                }
                                i17++;
                                spannableStringBuilder2 = spannableStringBuilder;
                                i16 = i11;
                                str5 = str3;
                                str7 = str2;
                                strArr2 = strArr;
                            }
                        }
                        i11 = i16;
                        i16 = i11 + 1;
                        str5 = str5;
                        strArr2 = strArr2;
                    } else {
                        String[] strArr3 = strArr2;
                        String str10 = str5;
                        if (f01Var.A != null) {
                            int size = arrayList2.size();
                            int i19 = 0;
                            while (i19 < size) {
                                MessagesController.FaqSearchResult faqSearchResult = (MessagesController.FaqSearchResult) arrayList2.get(i19);
                                String str11 = " " + faqSearchResult.title.toLowerCase();
                                int i20 = 0;
                                SpannableStringBuilder spannableStringBuilder3 = null;
                                while (true) {
                                    if (i20 < split.length) {
                                        if (split[i20].length() != 0) {
                                            String str12 = split[i20];
                                            int indexOf2 = str11.indexOf(" " + str12);
                                            i10 = size;
                                            if (indexOf2 < 0 && (str = strArr3[i20]) != null) {
                                                indexOf2 = str11.indexOf(" ".concat(str));
                                                str12 = str;
                                            }
                                            if (indexOf2 >= 0) {
                                                if (spannableStringBuilder3 == null) {
                                                    spannableStringBuilder3 = new SpannableStringBuilder(faqSearchResult.title);
                                                }
                                                arrayList = arrayList2;
                                                spannableStringBuilder3.setSpan(new ForegroundColorSpan(o2Var2.getThemedColor(org.telegram.ui.ActionBar.f6.f23229q6)), indexOf2, str12.length() + indexOf2, 33);
                                            }
                                        } else {
                                            i10 = size;
                                            arrayList = arrayList2;
                                        }
                                        if (spannableStringBuilder3 != null && i20 == split.length - 1) {
                                            arrayList4.add(faqSearchResult);
                                            arrayList5.add(spannableStringBuilder3);
                                        }
                                        i20++;
                                        size = i10;
                                        arrayList2 = arrayList;
                                    } else {
                                        i10 = size;
                                    }
                                }
                                i19++;
                                size = i10;
                                arrayList2 = arrayList2;
                            }
                        }
                        AndroidUtilities.runOnUIThread(new rx0(f01Var, str10, arrayList3, arrayList4, arrayList5, 1));
                        return;
                    }
                }
                break;
            case 24:
                f01 f01Var2 = (f01) obj2;
                ArrayList<MessagesController.FaqSearchResult> arrayList6 = (ArrayList) obj;
                f01Var2.d.addAll(arrayList6);
                int i21 = f01Var2.f38066f;
                MessagesController.getInstance(i21).faqSearchArray = arrayList6;
                MessagesController.getInstance(i21).faqWebPage = f01Var2.A;
                if (!f01Var2.f38070w) {
                    f01Var2.l();
                    return;
                }
                return;
            case 25:
                j01 j01Var = (j01) obj2;
                j01Var.f39333f.add((l01) obj);
                j01Var.a();
                return;
            case 26:
                ((z11) obj2).d0(34, (Bitmap) obj, true);
                return;
            case 27:
                u11 u11Var = (u11) obj2;
                TLRPC.TL_exportedContactToken tL_exportedContactToken = (TLRPC.TL_exportedContactToken) obj;
                if (tL_exportedContactToken == null) {
                    u11Var.getClass();
                    return;
                }
                int i22 = u11Var.F;
                if (i22 != 0 && i22 < tL_exportedContactToken.expires) {
                    try {
                        Vibrator vibrator = (Vibrator) u11Var.getContext().getSystemService("vibrator");
                        if (vibrator != null) {
                            vibrator.vibrate(100L);
                        }
                    } catch (Exception unused) {
                        try {
                            u11Var.performHapticFeedback(0, 2);
                        } catch (Exception unused2) {
                        }
                    }
                }
                u11Var.F = tL_exportedContactToken.expires;
                u11Var.c(tL_exportedContactToken.url, null, false, true);
                return;
            case 28:
                x21 x21Var = (x21) ((View[]) obj2)[0];
                x21Var.f44337b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) obj;
                x21Var.f44338c = null;
                x21Var.d = null;
                x21Var.f44340f.U2.N(false);
                return;
            default:
                ((x21) ((View[]) obj2)[0]).b((TLRPC.TL_reportResultAddComment) obj);
                return;
        }
    }

    public ys0(org.telegram.ui.Components.rp0 rp0Var, a0.h hVar, int i9, int i10) {
        this.f44939a = i10;
        this.f44940b = rp0Var;
        this.f44941c = hVar;
    }
}
