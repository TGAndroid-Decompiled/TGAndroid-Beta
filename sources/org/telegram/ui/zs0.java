package org.telegram.ui;

import android.animation.AnimatorSet;
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

public final class zs0 implements Runnable {

    public final int f45247a;

    public final Object f45248b;

    public final Object f45249c;

    public zs0(int i10, Object obj, Object obj2) {
        this.f45247a = i10;
        this.f45248b = obj;
        this.f45249c = obj2;
    }

    @Override
    public final void run() {
        int i10;
        org.telegram.messenger.t8 t8Var;
        int i11;
        String str;
        int i12;
        SpannableStringBuilder spannableStringBuilder;
        String str2;
        int i13 = this.f45247a;
        Object obj = this.f45249c;
        Object obj2 = this.f45248b;
        switch (i13) {
            case 0:
                ag.y1 y1Var = (ag.y1) obj;
                PhotoViewer photoViewer = ((yr0) obj2).f44890b;
                if (photoViewer.f35804y3 != null) {
                    ImageView imageView = photoViewer.f35758t3;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        photoViewer.f35758t3.setImageBitmap(photoViewer.f35804y3);
                    }
                    ((ImageReceiver) y1Var.f706b).setImageBitmap(photoViewer.f35804y3);
                }
                break;
            case 1:
                ((et0) obj2).f37840r.f35655h7.lock();
                ((AnimatorSet) obj).start();
                break;
            case 2:
                cu0 cu0Var = (cu0) obj;
                ((et0) obj2).f37840r.f35714o4 = false;
                if (!cu0Var.f37169s) {
                    cu0Var.f37153a.setVisible(false, true);
                }
                break;
            case 3:
                jv0 jv0Var = (jv0) obj2;
                jv0Var.getClass();
                AndroidUtilities.addToClipboard((String) obj);
                jv0Var.c(true);
                break;
            case 4:
                jv0 jv0Var2 = (jv0) obj2;
                jv0Var2.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.PollAnswer) obj).text, false));
                jv0Var2.c(true);
                break;
            case 5:
                jv0 jv0Var3 = (jv0) obj2;
                SendMessagesHelper.getInstance(jv0Var3.D.currentAccount).deletePollOption(jv0Var3.D, (byte[]) obj);
                jv0Var3.c(true);
                break;
            case 6:
                PrivacyControlActivity.W((PrivacyControlActivity) obj2, (TLObject) obj);
                break;
            case 7:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj2;
                boolean[] zArr = (boolean[]) obj;
                privacyControlActivity.getClass();
                zArr[0] = true;
                if (zArr[1]) {
                    privacyControlActivity.x0();
                }
                break;
            case 8:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) obj2;
                privacySettingsActivity.d = (TL_account.Password) obj;
                privacySettingsActivity.y0();
                break;
            case 9:
                PrivacySettingsActivity privacySettingsActivity2 = (PrivacySettingsActivity) obj2;
                boolean z10 = !privacySettingsActivity2.R;
                privacySettingsActivity2.R = z10;
                ((org.telegram.ui.Cells.p8) obj).setChecked(z10);
                break;
            case 10:
                ((cx0) obj2).getMessagesController().unblockPeer(((Long) obj).longValue());
                break;
            case 11:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                NotificationCenter notificationCenter = profileActivity.getNotificationCenter();
                int i14 = NotificationCenter.closeChats;
                notificationCenter.removeObserver(profileActivity, i14);
                profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i14, new Object[0]);
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) ((Object[]) obj)[0];
                Bundle bundle = new Bundle();
                bundle.putInt("enc_id", encryptedChat.f22388id);
                profileActivity.presentFragment(new rn(bundle), true);
                break;
            case 12:
                ProfileActivity profileActivity2 = (ProfileActivity) obj2;
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) obj;
                long j10 = profileActivity2.f36075w2;
                if (j10 != 0) {
                    TLRPC.User user = profileActivity2.getMessagesController().getUser(Long.valueOf(j10));
                    profileActivity2.getMessagesController().deleteParticipantFromChat(profileActivity2.f35929b1, user);
                    if (profileActivity2.A2 != null && user != null && org.telegram.ui.Components.mc.a(profileActivity2)) {
                        org.telegram.ui.Components.mc.D(profileActivity2, user, profileActivity2.A2.title).j();
                    }
                    if (profileActivity2.f36036q2.participants.participants.remove(chatParticipant)) {
                        profileActivity2.e5(true, false);
                    }
                } else {
                    NotificationCenter notificationCenter2 = profileActivity2.getNotificationCenter();
                    int i15 = NotificationCenter.closeChats;
                    notificationCenter2.removeObserver(profileActivity2, i15);
                    if (AndroidUtilities.isTablet()) {
                        i10 = 0;
                        profileActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i15, Long.valueOf(-profileActivity2.f35929b1));
                    } else {
                        i10 = 0;
                        profileActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i15, new Object[0]);
                    }
                    profileActivity2.getMessagesController().deleteParticipantFromChat(profileActivity2.f35929b1, profileActivity2.getMessagesController().getUser(Long.valueOf(profileActivity2.getUserConfig().getClientUserId())));
                    profileActivity2.F1 = i10;
                    profileActivity2.finishFragment();
                }
                break;
            case 13:
                AndroidUtilities.addToClipboard("https://" + ((ProfileActivity) obj2).getMessagesController().linkPrefix + "/" + ChatObject.getPublicUsername((TLRPC.Chat) obj));
                break;
            case 14:
                ProfileActivity profileActivity3 = (ProfileActivity) obj2;
                profileActivity3.getClass();
                org.telegram.ui.Components.ec.e();
                we.e.s(profileActivity3.getParentActivity(), ((TL_fragment.TL_collectibleInfo) obj).url);
                break;
            case 15:
                ProfileActivity profileActivity4 = (ProfileActivity) obj2;
                profileActivity4.A2 = profileActivity4.getMessagesStorage().getChat(profileActivity4.f35929b1);
                ((CountDownLatch) obj).countDown();
                break;
            case 16:
                ProfileActivity profileActivity5 = (ProfileActivity) obj2;
                profileActivity5.getClass();
                profileActivity5.C2 = ((TLRPC.TL_channels_channelParticipant) ((TLObject) obj)).participant;
                break;
            case 17:
                ProfileActivity profileActivity6 = (ProfileActivity) obj2;
                profileActivity6.getClass();
                ((org.telegram.ui.Cells.l8) ((View) obj)).setChecked(profileActivity6.f36023o2.g());
                break;
            case 18:
                ProfileActivity profileActivity7 = (ProfileActivity) obj2;
                if (!((boolean[]) obj)[0] && (t8Var = profileActivity7.f36060t5) != null) {
                    t8Var.run();
                }
                profileActivity7.f36060t5 = null;
                break;
            case 19:
                gy0 gy0Var = (gy0) obj2;
                a0.h hVar = (a0.h) obj;
                ProfileActivity profileActivity8 = gy0Var.X0.f38911c;
                org.telegram.ui.Components.mc.x(profileActivity8.getParentActivity(), profileActivity8.f35985i5, hVar.m(), hVar.m() == 1 ? ((TLRPC.Dialog) hVar.n(0)).f22384id : 0L, gy0Var.getThemedColor(org.telegram.ui.ActionBar.g6.Fi), gy0Var.getThemedColor(org.telegram.ui.ActionBar.g6.Hi)).j();
                break;
            case 20:
                vy0 vy0Var = (vy0) obj2;
                a0.h hVar2 = (a0.h) obj;
                ProfileActivity profileActivity9 = vy0Var.X0;
                org.telegram.ui.Components.mc.x(profileActivity9.getParentActivity(), profileActivity9.f35985i5, hVar2.m(), hVar2.m() == 1 ? ((TLRPC.Dialog) hVar2.n(0)).f22384id : 0L, vy0Var.getThemedColor(org.telegram.ui.ActionBar.g6.Fi), vy0Var.getThemedColor(org.telegram.ui.ActionBar.g6.Hi)).j();
                break;
            case 21:
                ((vz0) obj2).f43554e.presentFragment(ProfileActivity.m4(((Long) obj).longValue()));
                break;
            case 22:
                y9 y9Var = new y9(null);
                y9Var.d = (org.telegram.ui.ActionBar.c6) obj;
                ((org.telegram.ui.ActionBar.n2) obj2).presentFragment(y9Var);
                break;
            case 23:
                g01 g01Var = (g01) obj2;
                String str3 = (String) obj;
                ArrayList arrayList = g01Var.d;
                org.telegram.ui.ActionBar.n2 n2Var = g01Var.f38253e;
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                String[] strArrSplit = str3.split(" ");
                String[] strArr = new String[strArrSplit.length];
                for (int i16 = 0; i16 < strArrSplit.length; i16++) {
                    String translitString = LocaleController.getInstance().getTranslitString(strArrSplit[i16]);
                    strArr[i16] = translitString;
                    if (translitString.equals(strArrSplit[i16])) {
                        strArr[i16] = null;
                    }
                }
                int i17 = 0;
                while (true) {
                    f01[] f01VarArr = g01Var.f38252c;
                    if (i17 >= f01VarArr.length) {
                        String[] strArr2 = strArr;
                        String str4 = str3;
                        if (g01Var.A != null) {
                            int size = arrayList.size();
                            int i18 = 0;
                            while (i18 < size) {
                                MessagesController.FaqSearchResult faqSearchResult = (MessagesController.FaqSearchResult) arrayList.get(i18);
                                String str5 = " " + faqSearchResult.title.toLowerCase();
                                int i19 = 0;
                                SpannableStringBuilder spannableStringBuilder2 = null;
                                while (true) {
                                    if (i19 < strArrSplit.length) {
                                        if (strArrSplit[i19].length() != 0) {
                                            String str6 = strArrSplit[i19];
                                            int iIndexOf = str5.indexOf(" " + str6);
                                            i11 = size;
                                            if (iIndexOf < 0 && (str = strArr2[i19]) != null) {
                                                iIndexOf = str5.indexOf(" ".concat(str));
                                                str6 = str;
                                            }
                                            if (iIndexOf >= 0) {
                                                if (spannableStringBuilder2 == null) {
                                                    spannableStringBuilder2 = new SpannableStringBuilder(faqSearchResult.title);
                                                }
                                                spannableStringBuilder2.setSpan(new ForegroundColorSpan(n2Var.getThemedColor(org.telegram.ui.ActionBar.g6.q6)), iIndexOf, str6.length() + iIndexOf, 33);
                                            }
                                        } else {
                                            i11 = size;
                                        }
                                        if (spannableStringBuilder2 != null && i19 == strArrSplit.length - 1) {
                                            arrayList3.add(faqSearchResult);
                                            arrayList4.add(spannableStringBuilder2);
                                        }
                                        i19++;
                                        size = i11;
                                        arrayList = arrayList;
                                    } else {
                                        i11 = size;
                                    }
                                }
                                i18++;
                                size = i11;
                                arrayList = arrayList;
                            }
                        }
                        AndroidUtilities.runOnUIThread(new a01(g01Var, str4, arrayList2, arrayList3, arrayList4, 0));
                    } else {
                        f01 f01Var = f01VarArr[i17];
                        if (f01Var == null) {
                            i12 = i17;
                        } else {
                            String str7 = f01Var.f37891a;
                            String str8 = " " + str7.toLowerCase();
                            int i20 = 0;
                            SpannableStringBuilder spannableStringBuilder3 = null;
                            while (true) {
                                if (i20 < strArrSplit.length) {
                                    if (strArrSplit[i20].length() != 0) {
                                        String str9 = strArrSplit[i20];
                                        i12 = i17;
                                        int iIndexOf2 = str8.indexOf(" " + str9);
                                        if (iIndexOf2 >= 0 || (str2 = strArr[i20]) == null) {
                                            str2 = str9;
                                        } else {
                                            iIndexOf2 = str8.indexOf(" ".concat(str2));
                                        }
                                        if (iIndexOf2 >= 0) {
                                            String str10 = str2;
                                            spannableStringBuilder = spannableStringBuilder3 == null ? new SpannableStringBuilder(str7) : spannableStringBuilder3;
                                            spannableStringBuilder.setSpan(new ForegroundColorSpan(n2Var.getThemedColor(org.telegram.ui.ActionBar.g6.q6)), iIndexOf2, str10.length() + iIndexOf2, 33);
                                        }
                                    } else {
                                        i12 = i17;
                                        spannableStringBuilder = spannableStringBuilder3;
                                    }
                                    if (spannableStringBuilder != null && i20 == strArrSplit.length - 1) {
                                        if (f01Var.f37895f == 502) {
                                            int i21 = 0;
                                            while (true) {
                                                if (i21 >= 4) {
                                                    i21 = -1;
                                                } else if (UserConfig.getInstance(i21).isClientActivated()) {
                                                    i21++;
                                                }
                                            }
                                            if (i21 >= 0) {
                                                arrayList2.add(f01Var);
                                                arrayList4.add(spannableStringBuilder);
                                            }
                                        } else {
                                            arrayList2.add(f01Var);
                                            arrayList4.add(spannableStringBuilder);
                                        }
                                    }
                                    i20++;
                                    spannableStringBuilder3 = spannableStringBuilder;
                                    i17 = i12;
                                    str3 = str3;
                                    str8 = str8;
                                    strArr = strArr;
                                } else {
                                    i12 = i17;
                                }
                            }
                        }
                        i17 = i12 + 1;
                        str3 = str3;
                        strArr = strArr;
                    }
                    break;
                }
                break;
            case 24:
                g01 g01Var2 = (g01) obj2;
                ArrayList<MessagesController.FaqSearchResult> arrayList5 = (ArrayList) obj;
                g01Var2.d.addAll(arrayList5);
                int i22 = g01Var2.f38254f;
                MessagesController.getInstance(i22).faqSearchArray = arrayList5;
                MessagesController.getInstance(i22).faqWebPage = g01Var2.A;
                if (!g01Var2.f38258w) {
                    g01Var2.l();
                }
                break;
            case 25:
                k01 k01Var = (k01) obj2;
                k01Var.f39556f.add((m01) obj);
                k01Var.a();
                break;
            case 26:
                ((y11) obj2).e0(34, (Bitmap) obj, true);
                break;
            case 27:
                t11 t11Var = (t11) obj2;
                TLRPC.TL_exportedContactToken tL_exportedContactToken = (TLRPC.TL_exportedContactToken) obj;
                if (tL_exportedContactToken == null) {
                    t11Var.getClass();
                } else {
                    int i23 = t11Var.F;
                    if (i23 != 0 && i23 < tL_exportedContactToken.expires) {
                        try {
                            Vibrator vibrator = (Vibrator) t11Var.getContext().getSystemService("vibrator");
                            if (vibrator != null) {
                                vibrator.vibrate(100L);
                            }
                            break;
                        } catch (Exception unused) {
                            try {
                                t11Var.performHapticFeedback(0, 2);
                                break;
                            } catch (Exception unused2) {
                            }
                        }
                    }
                    t11Var.F = tL_exportedContactToken.expires;
                    t11Var.c(tL_exportedContactToken.url, null, false, true);
                }
                break;
            case 28:
                w21 w21Var = (w21) ((View[]) obj2)[0];
                w21Var.f43582b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) obj;
                w21Var.f43583c = null;
                w21Var.d = null;
                w21Var.f43585f.U2.N(false);
                break;
            default:
                ((w21) ((View[]) obj2)[0]).b((TLRPC.TL_reportResultAddComment) obj);
                break;
        }
    }

    public zs0(org.telegram.ui.Components.sp0 sp0Var, a0.h hVar, int i10, int i11) {
        this.f45247a = i11;
        this.f45248b = sp0Var;
        this.f45249c = hVar;
    }
}
