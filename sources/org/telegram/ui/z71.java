package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ConfigurationInfo;
import android.content.pm.PackageInfo;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.AuthTokensHelper;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SharedPrefsHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class z71 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.d40, mg0, td.b {
    public org.telegram.ui.Components.z8 A;
    public org.telegram.ui.Components.o9 B;
    public FrameLayout C;
    public FrameLayout D;
    public ImageView E;
    public TextView F;
    public TextView G;
    public TextView H;
    public boolean I;
    public View J;
    public int K;
    public boolean L;
    public ValueAnimator M;
    public final ArrayList N;
    public int O;
    public int P;
    public int Q;
    public final ig.e R;
    public final ng.d S;
    public final ng.d T;
    public ig.k U;
    public final ArrayList V;
    public final RectF W;
    public final RectF X;
    public final td.a f45060a;
    public fh.x4 f45061b;
    public org.telegram.ui.Components.i51 f45062c;
    public kh.h6 d;
    public org.telegram.ui.ActionBar.w0 f45063e;
    public org.telegram.ui.ActionBar.w0 f45064f;
    public r71 h;
    public org.telegram.ui.Components.e40 f45065n;
    public AnimatorSet f45066r;
    public org.telegram.ui.Cells.z3 f45067s;
    public TLRPC.FileLocation v;
    public TLRPC.FileLocation f45068w;
    public FrameLayout f45069x;
    public FrameLayout f45070y;

    public z71() {
        this(null);
    }

    public static boolean T(z71 z71Var, org.telegram.ui.Components.l41 l41Var, View view) {
        String str;
        Object obj = l41Var.G;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            mh.c3.j(z71Var.currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, new m71(z71Var, 0));
            return true;
        }
        if (l41Var.G(org.telegram.ui.Cells.u6.class)) {
            Object obj2 = l41Var.G;
            if (obj2 instanceof e01) {
                str = ((e01) obj2).h;
            } else if (obj2 instanceof MessagesController.FaqSearchResult) {
                str = ((MessagesController.FaqSearchResult) obj2).url;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                org.telegram.ui.Components.x60 H = org.telegram.ui.Components.x60.H(z71Var, view);
                H.c(R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new n21(6, z71Var, str), false);
                H.W(z71Var.f45062c.V0(view, false));
                H.Z();
                return true;
            }
        }
        return false;
    }

    public static void U(z71 z71Var) {
        boolean z10;
        TLRPC.User user = MessagesController.getInstance(z71Var.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(z71Var.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(z71Var.currentAccount).getCurrentUser();
        }
        if (user == null) {
            return;
        }
        org.telegram.ui.Components.e40 e40Var = z71Var.f45065n;
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null && userProfilePhoto.photo_big != null && !(userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
            z10 = true;
        } else {
            z10 = false;
        }
        e40Var.o(z10, new m71(z71Var, 4), new kh.g1(6), 0);
    }

    public static void V(z71 z71Var, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.C0(LaunchActivity.C1, z71Var.currentAccount, tL_attachMenuBot, null, true);
        MediaDataController.getInstance(z71Var.currentAccount).updateAttachMenuBotsInCache();
    }

    public static void X(org.telegram.ui.z71 r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z71.X(org.telegram.ui.z71):void");
    }

    public static void Y(z71 z71Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        z71Var.actionBar.getTitlesContainer().setAlpha(floatValue);
        z71Var.d.setAlpha(floatValue);
    }

    public static void Z(z71 z71Var, ArrayList arrayList) {
        ArrayList<TLRPC.TL_attachMenuBot> arrayList2;
        SpannableStringBuilder spannableStringBuilder;
        ArrayList arrayList3 = z71Var.N;
        org.telegram.ui.ActionBar.r0 r0Var = z71Var.f45063e.B;
        int i9 = 0;
        if (r0Var != null && r0Var.getTag() != null) {
            arrayList.add(org.telegram.ui.Components.l41.C(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
            r71 r71Var = z71Var.h;
            ArrayList arrayList4 = r71Var.d;
            ArrayList arrayList5 = r71Var.v;
            if (r71Var.f38070w) {
                ArrayList arrayList6 = r71Var.f38068r;
                int size = arrayList6.size();
                int i10 = 0;
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList6.get(i11);
                    i11++;
                    int i12 = org.telegram.ui.Cells.u6.f25748a;
                    org.telegram.ui.Components.l41 J = org.telegram.ui.Components.l41.J(org.telegram.ui.Cells.u6.class);
                    J.f30339l = (CharSequence) r71Var.f38067n.get(i10);
                    J.G = (e01) obj;
                    arrayList.add(J);
                    i10++;
                }
                if (!r71Var.f38069s.isEmpty()) {
                    arrayList.add(org.telegram.ui.Components.l41.q(LocaleController.getString(R.string.SettingsFaqSearchTitle)));
                    ArrayList arrayList7 = r71Var.f38069s;
                    int size2 = arrayList7.size();
                    while (i9 < size2) {
                        Object obj2 = arrayList7.get(i9);
                        i9++;
                        int i13 = org.telegram.ui.Cells.u6.f25748a;
                        org.telegram.ui.Components.l41 J2 = org.telegram.ui.Components.l41.J(org.telegram.ui.Cells.u6.class);
                        J2.f30339l = (CharSequence) r71Var.f38067n.get(i10);
                        J2.G = (MessagesController.FaqSearchResult) obj2;
                        arrayList.add(J2);
                        i10++;
                    }
                    return;
                }
                return;
            }
            if (!arrayList5.isEmpty()) {
                arrayList.add(org.telegram.ui.Components.l41.q(LocaleController.getString(R.string.SettingsRecent)));
                int size3 = arrayList5.size();
                int i14 = 0;
                while (i14 < size3) {
                    Object obj3 = arrayList5.get(i14);
                    i14++;
                    if (obj3 instanceof e01) {
                        e01 e01Var = (e01) obj3;
                        String str = e01Var.f37776a;
                        int i15 = org.telegram.ui.Cells.u6.f25748a;
                        org.telegram.ui.Components.l41 J3 = org.telegram.ui.Components.l41.J(org.telegram.ui.Cells.u6.class);
                        J3.f30339l = str;
                        J3.G = e01Var;
                        arrayList.add(J3);
                    } else if (obj3 instanceof MessagesController.FaqSearchResult) {
                        MessagesController.FaqSearchResult faqSearchResult = (MessagesController.FaqSearchResult) obj3;
                        String str2 = faqSearchResult.title;
                        int i16 = org.telegram.ui.Cells.u6.f25748a;
                        org.telegram.ui.Components.l41 J4 = org.telegram.ui.Components.l41.J(org.telegram.ui.Cells.u6.class);
                        J4.f30339l = str2;
                        J4.G = faqSearchResult;
                        arrayList.add(J4);
                    }
                }
            }
            if (!arrayList4.isEmpty()) {
                arrayList.add(org.telegram.ui.Components.l41.q(LocaleController.getString(R.string.SettingsFaqSearchTitle)));
                int size4 = arrayList4.size();
                while (i9 < size4) {
                    Object obj4 = arrayList4.get(i9);
                    i9++;
                    MessagesController.FaqSearchResult faqSearchResult2 = (MessagesController.FaqSearchResult) obj4;
                    String str3 = faqSearchResult2.title;
                    int i17 = org.telegram.ui.Cells.u6.f25748a;
                    org.telegram.ui.Components.l41 J5 = org.telegram.ui.Components.l41.J(org.telegram.ui.Cells.u6.class);
                    J5.f30339l = str3;
                    J5.G = faqSearchResult2;
                    arrayList.add(J5);
                }
                return;
            }
            return;
        }
        FrameLayout frameLayout = z71Var.f45069x;
        org.telegram.ui.Components.l41 l41Var = new org.telegram.ui.Components.l41(-4);
        l41Var.f30332c = frameLayout;
        l41Var.f30352z = 188;
        arrayList.add(l41Var);
        arrayList3.clear();
        for (int i18 = 0; i18 < 4; i18++) {
            if (UserConfig.getInstance(i18).isClientActivated() && z71Var.currentAccount != i18) {
                arrayList3.add(Integer.valueOf(i18));
            }
        }
        Collections.sort(arrayList3, new org.telegram.ui.Components.jn0(15));
        Set<String> set = z71Var.getMessagesController().pendingSuggestions;
        if (set.contains("PREMIUM_GRACE")) {
            arrayList.add(x71.a(LocaleController.getString(R.string.GraceSuggestionTitle), LocaleController.getString(R.string.GraceSuggestionMessage), null, null, LocaleController.getString(R.string.GraceSuggestionButton), new n71(z71Var, 0)));
            arrayList.add(org.telegram.ui.Components.l41.B(null));
        } else if (set.contains("VALIDATE_PHONE_NUMBER") && z71Var.getUserConfig().getCurrentUser() != null) {
            arrayList.add(x71.a(LocaleController.formatString(R.string.CheckPhoneNumber, org.telegram.messenger.ll.g(new StringBuilder("+"), z71Var.getUserConfig().getCurrentUser().phone, ne.b.c())), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CheckPhoneNumberInfo), new m71(z71Var, 1)), LocaleController.getString(R.string.CheckPhoneNumberNo), new n71(z71Var, 1), gh.k5.g2(LocaleController.getString(R.string.CheckPhoneNumberYes2)), new n71(z71Var, 2)));
            arrayList.add(org.telegram.ui.Components.l41.B(null));
        } else if (set.contains("VALIDATE_PASSWORD")) {
            arrayList.add(x71.a(LocaleController.getString(R.string.YourPasswordHeader), LocaleController.getString(R.string.YourPasswordRemember), LocaleController.getString(R.string.YourPasswordRememberNo), new n71(z71Var, 3), LocaleController.getString(R.string.YourPasswordRememberYes), new n71(z71Var, 4)));
            arrayList.add(org.telegram.ui.Components.l41.B(null));
        }
        if (arrayList3.size() > 0) {
            org.telegram.ui.Cells.j2.l(R.string.SettingsAccounts, arrayList);
            for (int i19 = 0; i19 < arrayList3.size(); i19++) {
                int intValue = ((Integer) arrayList3.get(i19)).intValue();
                int i20 = t71.f42885a;
                org.telegram.ui.Components.l41 J6 = org.telegram.ui.Components.l41.J(t71.class);
                J6.d = i19;
                J6.f30352z = intValue;
                arrayList.add(J6);
            }
            arrayList.add(org.telegram.ui.Components.l41.B(null));
        }
        arrayList.add(v71.a(1, -14899731, -15431455, R.drawable.settings_account, LocaleController.getString(R.string.SettingsAccount), LocaleController.getString(R.string.SettingsAccountInfo), null));
        arrayList.add(v71.a(2, -1007845, -1996271, R.drawable.settings_chat, LocaleController.getString(R.string.SettingsChat), LocaleController.getString(R.string.SettingsChatInfo), null));
        arrayList.add(v71.a(3, -11154873, -14175180, R.drawable.settings_privacy, LocaleController.getString(R.string.SettingsPrivacySecurity), LocaleController.getString(R.string.SettingsPrivacySecurityInfo), null));
        arrayList.add(v71.a(5, -765355, -2148011, R.drawable.settings_sounds, LocaleController.getString(R.string.SettingsNotifications), LocaleController.getString(R.string.SettingsNotificationsInfo), null));
        arrayList.add(v71.a(6, -11565578, -13276952, R.drawable.settings_data, LocaleController.getString(R.string.SettingsData), LocaleController.getString(R.string.SettingsDataInfo), null));
        arrayList.add(v71.a(7, -14899731, -15497247, R.drawable.settings_folders, LocaleController.getString(R.string.SettingsFolders), LocaleController.getString(R.string.SettingsFoldersInfo), null));
        arrayList.add(v71.a(8, -13451058, -14836538, R.drawable.settings_devices, LocaleController.getString(R.string.SettingsDevices), LocaleController.getString(R.string.SettingsDevicesInfo), null));
        arrayList.add(v71.a(9, -881871, -1940716, R.drawable.settings_power, LocaleController.getString(R.string.SettingsPowerSaving), LocaleController.getString(R.string.SettingsPowerSavingInfo), null));
        arrayList.add(v71.a(10, -3903756, -6335009, R.drawable.settings_language, LocaleController.getString(R.string.SettingsLanguage), LocaleController.getCurrentLanguageName(), null));
        arrayList.add(org.telegram.ui.Components.l41.B(null));
        if (!z71Var.getMessagesController().premiumFeaturesBlocked()) {
            arrayList.add(v71.a(11, -4826625, -10388225, R.drawable.settings_premium, LocaleController.getString(R.string.TelegramPremium), null, null));
        }
        CharSequence charSequence = "";
        if (z71Var.getMessagesController().starsPurchaseAvailable()) {
            gh.v7 y10 = gh.v7.y(z71Var.currentAccount, false);
            long j10 = y10.p().amount;
            int i21 = R.drawable.settings_stars;
            String string = LocaleController.getString(R.string.TelegramStars);
            if (!y10.f9048e || j10 <= 0) {
                spannableStringBuilder = "";
            } else {
                spannableStringBuilder = gh.oa.I0(y10.p(), 0.85f, ' ');
            }
            arrayList.add(v71.a(12, -1071598, -1608430, i21, string, null, spannableStringBuilder));
        }
        gh.v7.y(z71Var.currentAccount, true).p();
        if (ApplicationLoader.isBetaBuild() || ApplicationLoader.isStandaloneBuild() || ApplicationLoader.isHuaweiStoreBuild() || (gh.v7.y(z71Var.currentAccount, true).f9048e && (gh.v7.y(z71Var.currentAccount, true).O(0) || gh.v7.y(z71Var.currentAccount, true).p().positive()))) {
            gh.v7 y11 = gh.v7.y(z71Var.currentAccount, true);
            long j11 = y11.p().amount;
            int i22 = R.drawable.settings_gram_24;
            String string2 = LocaleController.getString(R.string.MyTON);
            if (y11.f9048e && j11 > 0) {
                charSequence = gh.oa.I0(y11.p(), 0.85f, ' ');
            }
            arrayList.add(v71.a(13, -14965523, -15431455, i22, string2, null, charSequence));
        }
        TLRPC.TL_attachMenuBots attachMenuBots = MediaDataController.getInstance(UserConfig.selectedAccount).getAttachMenuBots();
        if (attachMenuBots != null && (arrayList2 = attachMenuBots.bots) != null && !arrayList2.isEmpty()) {
            ArrayList<TLRPC.TL_attachMenuBot> arrayList8 = attachMenuBots.bots;
            int size5 = arrayList8.size();
            while (i9 < size5) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList8.get(i9);
                i9++;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                if (tL_attachMenuBot2.show_in_side_menu && tL_attachMenuBot2.bot_id == 1985737506) {
                    int i23 = R.drawable.settings_wallet;
                    org.telegram.ui.Components.l41 J7 = org.telegram.ui.Components.l41.J(v71.class);
                    long j12 = tL_attachMenuBot2.bot_id;
                    J7.d = (int) (j12 ^ (j12 >>> 32));
                    J7.f30338k = i23;
                    J7.f30339l = tL_attachMenuBot2.short_name;
                    J7.B = ((-15431455) << 32) | ((-14965523) & 4294967295L);
                    J7.G = tL_attachMenuBot2;
                    arrayList.add(J7);
                }
            }
        }
        if (!z71Var.getMessagesController().premiumFeaturesBlocked()) {
            arrayList.add(v71.a(15, -765355, -2148011, R.drawable.settings_business, LocaleController.getString(R.string.TelegramBusiness), null, null));
        }
        if (!z71Var.getMessagesController().premiumPurchaseBlocked()) {
            arrayList.add(v71.a(16, -816335, -1940716, R.drawable.settings_gift, LocaleController.getString(R.string.SendAGift), null, null));
        }
        if (((org.telegram.ui.Components.l41) j3.r0.j(1, arrayList)).f48814a != 7) {
            arrayList.add(org.telegram.ui.Components.l41.B(null));
        }
        org.telegram.ui.Cells.j2.l(R.string.SettingsHelp, arrayList);
        arrayList.add(v71.a(17, -1007845, -1996271, R.drawable.settings_ask, LocaleController.getString(R.string.AskAQuestion), null, null));
        arrayList.add(v71.a(18, -14965523, -15431455, R.drawable.settings_faq, LocaleController.getString(R.string.TelegramFAQ), null, null));
        arrayList.add(v71.a(23, -3903756, -6335009, R.drawable.settings_features, LocaleController.getString(R.string.TelegramFeatures), null, null));
        arrayList.add(v71.a(19, -11154873, -14175180, R.drawable.settings_policy, LocaleController.getString(R.string.PrivacyPolicy), null, null));
        if (BuildVars.LOGS_ENABLED || BuildVars.DEBUG_PRIVATE_VERSION) {
            arrayList.add(org.telegram.ui.Components.l41.B(null));
            org.telegram.ui.Cells.j2.l(R.string.SettingsDebug, arrayList);
            arrayList.add(v71.a(20, -11154873, -14175180, 0, LocaleController.getString(R.string.DebugSendLogs), null, null));
            arrayList.add(v71.a(21, -11154873, -14175180, 0, LocaleController.getString(R.string.DebugSendLastLogs), null, null));
            arrayList.add(v71.a(22, -765355, -2148011, 0, LocaleController.getString(R.string.DebugClearLogs), null, null));
        }
        arrayList.add(org.telegram.ui.Components.l41.l(z71Var.H));
    }

    public static void a0(z71 z71Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        TLRPC.VideoSize closestVideoSizeWithSize;
        z71Var.Q = -1;
        if (tL_error == null) {
            TLRPC.User user = z71Var.getMessagesController().getUser(Long.valueOf(z71Var.getUserConfig().getClientUserId()));
            if (user == null) {
                user = z71Var.getUserConfig().getCurrentUser();
                if (user == null) {
                    return;
                }
                z71Var.getMessagesController().putUser(user, false);
            } else {
                z71Var.getUserConfig().setCurrentUser(user);
            }
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 150);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, 800);
            if (tL_photos_photo.photo.video_sizes.isEmpty()) {
                closestVideoSizeWithSize = null;
            } else {
                closestVideoSizeWithSize = FileLoader.getClosestVideoSizeWithSize(tL_photos_photo.photo.video_sizes, 1000);
            }
            TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
            user.photo = tL_userProfilePhoto;
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f22404id;
            if (closestPhotoSizeWithSize != null) {
                tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
            }
            if (closestPhotoSizeWithSize2 != null) {
                tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
            }
            if (closestPhotoSizeWithSize != null && z71Var.v != null) {
                FileLoader.getInstance(z71Var.currentAccount).getPathToAttach(z71Var.v, true).renameTo(FileLoader.getInstance(z71Var.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(z71Var.v.volume_id);
                sb2.append("_");
                String l10 = aa.d.l(z71Var.v.local_id, "@90_90", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(closestPhotoSizeWithSize.location.volume_id);
                sb3.append("_");
                ImageLoader.getInstance().replaceImageInCache(l10, aa.d.l(closestPhotoSizeWithSize.location.local_id, "@90_90", sb3), ImageLocation.getForUserOrChat(z71Var.currentAccount, user, 1), false);
            }
            if (closestVideoSizeWithSize != null && str != null) {
                new File(str).renameTo(FileLoader.getInstance(z71Var.currentAccount).getPathToAttach(closestVideoSizeWithSize, "mp4", true));
            } else if (closestPhotoSizeWithSize2 != null && z71Var.f45068w != null) {
                FileLoader.getInstance(z71Var.currentAccount).getPathToAttach(z71Var.f45068w, true).renameTo(FileLoader.getInstance(z71Var.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
            }
            z71Var.getMessagesController().getDialogPhotos(user.f22527id).addPhotoAtStart(tL_photos_photo.photo);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(user);
            z71Var.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
            TLRPC.UserFull userFull = z71Var.getMessagesController().getUserFull(z71Var.getUserConfig().getClientUserId());
            if (userFull != null) {
                userFull.profile_photo = tL_photos_photo.photo;
                z71Var.getMessagesStorage().updateUserInfo(userFull, false);
            }
            z71Var.l0(user);
        }
        z71Var.v = null;
        z71Var.f45068w = null;
        z71Var.m0(false, true);
        z71Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
        z71Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
        z71Var.getUserConfig().saveConfig(true);
    }

    public static void b0(z71 z71Var, int i9) {
        int i10;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        long j10;
        Long l10;
        int i11;
        int i12 = 0;
        if (i9 == 0) {
            z71Var.getUserConfig().syncContacts = true;
            z71Var.getUserConfig().saveConfig(false);
            z71Var.getContactsController().forceImportContacts();
            return;
        }
        long j11 = 0;
        if (i9 == 1) {
            z71Var.getContactsController().loadContacts(false, 0L);
        } else if (i9 == 2) {
            z71Var.getContactsController().resetImportedContacts();
        } else if (i9 == 3) {
            z71Var.getMessagesController().forceResetDialogs();
        } else if (i9 == 4) {
            BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
            ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
            z71Var.f45062c.U2.N(true);
            if (BuildVars.LOGS_ENABLED) {
                j3.r0.z(new StringBuilder("app start time = "), ApplicationLoader.startTime);
                try {
                    FileLog.d("buildVersion = " + ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0).versionCode);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        } else if (i9 == 5) {
            SharedConfig.toggleInappCamera();
        } else if (i9 == 6) {
            z71Var.getMessagesStorage().clearSentMedia();
            SharedConfig.setNoSoundHintShowed(false);
            org.telegram.messenger.l0.d(org.telegram.messenger.l0.d(org.telegram.messenger.l0.d(org.telegram.messenger.l0.d(org.telegram.messenger.l0.d(org.telegram.messenger.l0.d(org.telegram.messenger.l0.d(org.telegram.messenger.l0.d(org.telegram.messenger.l0.d(org.telegram.messenger.l0.d(MessagesController.getGlobalMainSettings().edit().remove("archivehint").remove("proximityhint").remove("archivehint_l"), "searchpostsnew", "speedhint", "gifhint", "reminderhint"), "soundHint", "themehint", "bganimationhint", "filterhint"), "n_0", "storyprvhint", "storyhint", "storyhint2"), "storydualhint", "storysvddualhint", "stories_camera", "dualcam"), "dualmatrix", "dual_available", "archivehint", "askNotificationsAfter"), "askNotificationsDuration", "viewoncehint", "voicepausehint", "taptostorysoundhint"), "nothanos", "voiceoncehint", "savedhint", "savedsearchhint"), "savedsearchtaghint", "newppsms", "monetizationadshint", "seekSpeedHintShowed"), "unsupport_video/av01", "statusgiftpage", "multistorieshint", "trimvoicehint"), "taptostoryhighlighthint", "proxycheckstatusip", "callmiconstart", "showchattagsinfo").remove("language_showed2").remove("aihintshown").remove("savedmsgschatshint").apply();
            g7.d6.a();
            SharedPrefsHelper.cleanupAccount(z71Var.currentAccount);
            MessagesController.getEmojiSettings(z71Var.currentAccount).edit().remove("featured_hidden").remove("emoji_featured_hidden").commit();
            MessagesController.getGlobalNotificationsSettings().edit().remove("disable_sharing_learn").remove("askedAboutFSILockscreen").apply();
            SharedConfig.textSelectionHintShows = 0;
            SharedConfig.lockRecordAudioVideoHint = 0;
            SharedConfig.stickersReorderingHintUsed = false;
            SharedConfig.forwardingOptionsHintShown = false;
            SharedConfig.replyingOptionsHintShown = false;
            SharedConfig.messageSeenHintCount = 3;
            SharedConfig.emojiInteractionsHintCount = 3;
            SharedConfig.dayNightThemeSwitchHintCount = 3;
            SharedConfig.fastScrollHintCount = 3;
            SharedConfig.stealthModeSendMessageConfirm = 2;
            SharedConfig.updateStealthModeSendMessageConfirm(2);
            SharedConfig.setStoriesReactionsLongPressHintUsed(false);
            SharedConfig.setStoriesIntroShown(false);
            SharedConfig.setMultipleReactionsPromoShowed(false);
            ChatThemeController.getInstance(z71Var.currentAccount).clearCache();
            z71Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
            b31.V();
            xf.s0.e(z71Var.currentAccount).a();
            SharedPreferences mainSettings = z71Var.getMessagesController().getMainSettings();
            SharedPreferences.Editor edit = mainSettings.edit();
            org.telegram.messenger.l0.d(edit, "peerColors", "profilePeerColors", "boostingappearance", "bizbothint").remove("movecaptionhint");
            for (String str6 : mainSettings.getAll().keySet()) {
                if (str6.contains("show_gift_for_") || str6.contains("bdayhint_") || str6.contains("bdayanim_") || str6.startsWith("ask_paid_message_") || str6.startsWith("topicssidetabs")) {
                    edit.remove(str6);
                }
            }
            edit.apply();
            SharedPreferences.Editor edit2 = MessagesController.getNotificationsSettings(z71Var.currentAccount).edit();
            for (String str7 : MessagesController.getNotificationsSettings(z71Var.currentAccount).getAll().keySet()) {
                if (str7.startsWith("dialog_bar_botver")) {
                    edit2.remove(str7);
                }
            }
            edit2.apply();
        } else if (i9 == 7) {
            org.telegram.ui.Components.voip.e2.j(z71Var.getParentActivity());
        } else if (i9 == 8) {
            SharedConfig.toggleRoundCamera16to9();
        } else if (i9 == 9) {
            ((LaunchActivity) z71Var.getParentActivity()).z(true);
        } else if (i9 == 10) {
            z71Var.getMessagesStorage().readAllDialogs(-1);
        } else if (i9 == 11) {
            SharedConfig.toggleDisableVoiceAudioEffects();
        } else if (i9 == 12) {
            SharedConfig.pendingAppUpdate = null;
            SharedConfig.saveConfig();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
        } else if (i9 == 13) {
            Set<String> set = z71Var.getMessagesController().pendingSuggestions;
            set.add("VALIDATE_PHONE_NUMBER");
            set.add("VALIDATE_PASSWORD");
            z71Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
        } else {
            try {
                if (i9 == 14) {
                    ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                    ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                    WebStorage.getInstance().deleteAllData();
                    WebView webView = new WebView(ApplicationLoader.applicationContext);
                    webView.clearHistory();
                    webView.destroy();
                } else if (i9 == 15) {
                    CookieManager cookieManager = CookieManager.getInstance();
                    cookieManager.removeAllCookies(null);
                    cookieManager.flush();
                } else if (i9 == 16) {
                    SharedConfig.toggleDebugWebView();
                    Activity parentActivity = z71Var.getParentActivity();
                    if (SharedConfig.debugWebView) {
                        i11 = R.string.DebugMenuWebViewDebugEnabled;
                    } else {
                        i11 = R.string.DebugMenuWebViewDebugDisabled;
                    }
                    Toast.makeText(parentActivity, LocaleController.getString(i11), 0).show();
                } else if (i9 == 17) {
                    SharedConfig.toggleForceDisableTabletMode();
                    Activity parentActivity2 = z71Var.getParentActivity();
                    if (parentActivity2 != null) {
                        Intent launchIntentForPackage = parentActivity2.getPackageManager().getLaunchIntentForPackage(parentActivity2.getPackageName());
                        parentActivity2.finishAffinity();
                        parentActivity2.startActivity(launchIntentForPackage);
                    }
                    System.exit(0);
                } else if (i9 == 18) {
                    g7.v7.a((LaunchActivity) z71Var.getParentActivity(), !SharedConfig.isFloatingDebugActive, true);
                } else if (i9 == 19) {
                    z71Var.getMessagesController().loadAppConfig();
                    TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                    tL_help_dismissSuggestion.suggestion = "VALIDATE_PHONE_NUMBER";
                    tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                    z71Var.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new p71(z71Var, 0));
                } else if (i9 == 20) {
                    int i13 = ConnectionsManager.CPU_COUNT;
                    int memoryClass = ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getMemoryClass();
                    StringBuilder sb2 = new StringBuilder();
                    long j12 = 0;
                    long j13 = 0;
                    long j14 = 0;
                    long j15 = 0;
                    long j16 = 0;
                    long j17 = 0;
                    long j18 = 0;
                    long j19 = 0;
                    while (i12 < i13) {
                        long j20 = j11;
                        Long sysInfoLong = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i12 + "/cpufreq/cpuinfo_min_freq");
                        Long sysInfoLong2 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i12 + "/cpufreq/cpuinfo_cur_freq");
                        Long sysInfoLong3 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i12 + "/cpufreq/cpuinfo_max_freq");
                        Long sysInfoLong4 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i12 + "/cpu_capacity");
                        sb2.append("#");
                        sb2.append(i12);
                        sb2.append(" ");
                        int i14 = i12;
                        if (sysInfoLong != null) {
                            sb2.append("min=");
                            l10 = sysInfoLong3;
                            sb2.append(sysInfoLong.longValue() / 1000);
                            sb2.append(" ");
                            j12 += sysInfoLong.longValue() / 1000;
                            j13++;
                        } else {
                            l10 = sysInfoLong3;
                        }
                        if (sysInfoLong2 != null) {
                            sb2.append("cur=");
                            sb2.append(sysInfoLong2.longValue() / 1000);
                            sb2.append(" ");
                            j14 += sysInfoLong2.longValue() / 1000;
                            j15++;
                        }
                        if (l10 != null) {
                            sb2.append("max=");
                            sb2.append(l10.longValue() / 1000);
                            sb2.append(" ");
                            j16 = (l10.longValue() / 1000) + j16;
                            j17++;
                        }
                        if (sysInfoLong4 != null) {
                            sb2.append("cpc=");
                            sb2.append(sysInfoLong4);
                            sb2.append(" ");
                            j18 = sysInfoLong4.longValue() + j18;
                            j19++;
                        }
                        sb2.append("\n");
                        i12 = i14 + 1;
                        j11 = j20;
                    }
                    long j21 = j11;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(Build.MANUFACTURER);
                    sb3.append(", ");
                    sb3.append(Build.MODEL);
                    sb3.append(" (");
                    sb3.append(Build.PRODUCT);
                    sb3.append(", ");
                    sb3.append(Build.DEVICE);
                    sb3.append(")  (android ");
                    int i15 = Build.VERSION.SDK_INT;
                    sb3.append(i15);
                    sb3.append(")\n");
                    if (i15 >= 31) {
                        sb3.append("SoC: ");
                        sb3.append(Build.SOC_MANUFACTURER);
                        sb3.append(", ");
                        sb3.append(Build.SOC_MODEL);
                        sb3.append("\n");
                    }
                    String sysInfoString = AndroidUtilities.getSysInfoString("/sys/kernel/gpu/gpu_model");
                    if (sysInfoString != null) {
                        sb3.append("GPU: ");
                        sb3.append(sysInfoString);
                        Long sysInfoLong5 = AndroidUtilities.getSysInfoLong("/sys/kernel/gpu/gpu_min_clock");
                        Long sysInfoLong6 = AndroidUtilities.getSysInfoLong("/sys/kernel/gpu/gpu_mm_min_clock");
                        Long sysInfoLong7 = AndroidUtilities.getSysInfoLong("/sys/kernel/gpu/gpu_max_clock");
                        if (sysInfoLong5 != null) {
                            sb3.append(", min=");
                            j10 = j12;
                            sb3.append(sysInfoLong5.longValue() / 1000);
                        } else {
                            j10 = j12;
                        }
                        if (sysInfoLong6 != null) {
                            sb3.append(", mmin=");
                            sb3.append(sysInfoLong6.longValue() / 1000);
                        }
                        if (sysInfoLong7 != null) {
                            sb3.append(", max=");
                            sb3.append(sysInfoLong7.longValue() / 1000);
                        }
                        sb3.append("\n");
                    } else {
                        j10 = j12;
                    }
                    ConfigurationInfo deviceConfigurationInfo = ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getDeviceConfigurationInfo();
                    sb3.append("GLES Version: ");
                    sb3.append(deviceConfigurationInfo.getGlEsVersion());
                    sb3.append("\nMemory: class=");
                    sb3.append(AndroidUtilities.formatFileSize(memoryClass * 1048576));
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getMemoryInfo(memoryInfo);
                    sb3.append(", total=");
                    sb3.append(AndroidUtilities.formatFileSize(memoryInfo.totalMem));
                    sb3.append(", avail=");
                    sb3.append(AndroidUtilities.formatFileSize(memoryInfo.availMem));
                    sb3.append(", low?=");
                    sb3.append(memoryInfo.lowMemory);
                    sb3.append(" (threshold=");
                    sb3.append(AndroidUtilities.formatFileSize(memoryInfo.threshold));
                    sb3.append(")\nCurrent class: ");
                    sb3.append(SharedConfig.performanceClassName(SharedConfig.getDevicePerformanceClass()));
                    sb3.append(", measured: ");
                    sb3.append(SharedConfig.performanceClassName(SharedConfig.measureDevicePerformanceClass()));
                    if (i15 >= 31) {
                        sb3.append(", suggest=");
                        sb3.append(Build.VERSION.MEDIA_PERFORMANCE_CLASS);
                    }
                    sb3.append("\n");
                    sb3.append(i13);
                    sb3.append(" CPUs");
                    if (j13 > j21) {
                        sb3.append(", avgMinFreq=");
                        sb3.append(j10 / j13);
                    }
                    if (j15 > j21) {
                        sb3.append(", avgCurFreq=");
                        sb3.append(j14 / j15);
                    }
                    if (j17 > j21) {
                        sb3.append(", avgMaxFreq=");
                        sb3.append(j16 / j17);
                    }
                    if (j19 > j21) {
                        sb3.append(", avgCapacity=");
                        sb3.append(j18 / j19);
                    }
                    sb3.append("\n");
                    sb3.append((CharSequence) sb2);
                    j0("video/avc", sb3);
                    j0("video/hevc", sb3);
                    j0("video/x-vnd.on2.vp8", sb3);
                    j0("video/x-vnd.on2.vp9", sb3);
                    z71Var.showDialog(new s71(z71Var, z71Var.getParentActivity(), sb3.toString()));
                } else if (i9 == 21) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(z71Var.getParentActivity(), 0, z71Var.resourceProvider);
                    alertDialog$Builder.f22702a.N = "Force performance class";
                    int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                    int measureDevicePerformanceClass = SharedConfig.measureDevicePerformanceClass();
                    if (devicePerformanceClass == 2) {
                        str = "**HIGH**";
                    } else {
                        str = "HIGH";
                    }
                    String str8 = "";
                    if (measureDevicePerformanceClass != 2) {
                        str2 = "";
                    } else {
                        str2 = " (measured)";
                    }
                    SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(str.concat(str2));
                    if (devicePerformanceClass == 1) {
                        str3 = "**AVERAGE**";
                    } else {
                        str3 = "AVERAGE";
                    }
                    if (measureDevicePerformanceClass != 1) {
                        str4 = "";
                    } else {
                        str4 = " (measured)";
                    }
                    SpannableStringBuilder replaceTags2 = AndroidUtilities.replaceTags(str3.concat(str4));
                    if (devicePerformanceClass == 0) {
                        str5 = "**LOW**";
                    } else {
                        str5 = "LOW";
                    }
                    if (measureDevicePerformanceClass == 0) {
                        str8 = " (measured)";
                    }
                    alertDialog$Builder.f(new CharSequence[]{replaceTags, replaceTags2, AndroidUtilities.replaceTags(str5.concat(str8))}, new fy0(measureDevicePerformanceClass, 1));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    alertDialog$Builder.o();
                } else if (i9 == 22) {
                    SharedConfig.toggleRoundCamera();
                } else if (i9 == 23) {
                    boolean q10 = kh.d1.q(z71Var.getParentActivity());
                    MessagesController.getGlobalMainSettings().edit().putBoolean("dual_available", !q10).apply();
                    Activity parentActivity3 = z71Var.getParentActivity();
                    if (!q10) {
                        i10 = R.string.DebugMenuDualOnToast;
                    } else {
                        i10 = R.string.DebugMenuDualOffToast;
                    }
                    Toast.makeText(parentActivity3, LocaleController.getString(i10), 0).show();
                } else if (i9 == 24) {
                    SharedConfig.toggleSurfaceInStories();
                    while (i12 < z71Var.getParentLayout().getFragmentStack().size()) {
                        ((org.telegram.ui.ActionBar.o2) z71Var.getParentLayout().getFragmentStack().get(i12)).clearSheets();
                        i12++;
                    }
                } else if (i9 == 25) {
                    SharedConfig.togglePhotoViewerBlur();
                } else if (i9 == 26) {
                    SharedConfig.togglePaymentByInvoice();
                } else if (i9 == 27) {
                    z71Var.getMediaDataController().loadAttachMenuBots(false, true);
                } else if (i9 == 28) {
                    SharedConfig.toggleUseCamera2(z71Var.currentAccount);
                } else if (i9 == 29) {
                    mh.r.b();
                    mh.u0.c();
                    mh.k0.a();
                    mh.q4.c();
                } else if (i9 == 30) {
                    AuthTokensHelper.clearLogInTokens();
                } else if (i9 == 31) {
                    SharedConfig.toggleUseNewBlur();
                } else if (i9 == 32) {
                    SharedConfig.toggleBrowserAdaptableColors();
                } else if (i9 == 33) {
                    SharedConfig.toggleDebugVideoQualities();
                } else if (i9 == 34) {
                    SharedConfig.toggleUseSystemBoldFont();
                } else if (i9 == 35) {
                    MessagesController.getInstance(z71Var.currentAccount).loadAppConfig(true);
                } else if (i9 == 36) {
                    SharedConfig.toggleForceForumTabs();
                } else if (i9 == 37) {
                    FileLog.getInstance().dumpMemory(true);
                } else if (i9 == 38) {
                    SharedConfig.toggleFastWallpaperDisabled();
                } else if (i9 == 39) {
                    SharedConfig.toggleFrameMetricsEnabled();
                    LaunchActivity launchActivity = LaunchActivity.C1;
                    if (launchActivity != null) {
                        launchActivity.B();
                    }
                } else if (i9 == 40) {
                    SharedPreferences.Editor edit3 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit();
                    boolean z10 = !SharedConfig.shadowsInSections;
                    SharedConfig.shadowsInSections = z10;
                    edit3.putBoolean("shadowsInSections", z10).apply();
                } else if (i9 == 41) {
                    SharedPreferences.Editor edit4 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit();
                    boolean z11 = !SharedConfig.debugViewMetrics;
                    SharedConfig.debugViewMetrics = z11;
                    edit4.putBoolean("debugViewMetrics", z11).apply();
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void c0(z71 z71Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            z71Var.v = fileLocation;
            z71Var.f45068w = photoSize2.location;
            z71Var.B.h(ImageLocation.getForLocal(fileLocation), "90_90", z71Var.A, null);
            z71Var.m0(true, false);
        } else if (z71Var.v == null) {
            return;
        } else {
            TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
            if (inputFile != null) {
                tL_photos_uploadProfilePhoto.file = inputFile;
                tL_photos_uploadProfilePhoto.flags |= 1;
            }
            if (inputFile2 != null) {
                tL_photos_uploadProfilePhoto.video = inputFile2;
                int i9 = tL_photos_uploadProfilePhoto.flags;
                tL_photos_uploadProfilePhoto.video_start_ts = d;
                tL_photos_uploadProfilePhoto.flags = i9 | 6;
            }
            if (videoSize != null) {
                tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
                tL_photos_uploadProfilePhoto.flags |= 16;
            }
            z71Var.Q = z71Var.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new v40(29, z71Var, str));
        }
        z71Var.actionBar.n().requestLayout();
    }

    public static void d0(z71 z71Var, org.telegram.ui.Components.l41 l41Var) {
        Object obj = l41Var.G;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) obj;
            if (!tL_attachMenuBot.inactive && !tL_attachMenuBot.side_menu_disclaimer_needed) {
                LaunchActivity.C0(LaunchActivity.C1, z71Var.currentAccount, tL_attachMenuBot, null, true);
            } else {
                fi1.a(z71Var.getParentActivity(), new ih.a2(8, z71Var, tL_attachMenuBot), null);
            }
        } else if (l41Var.G(t71.class)) {
            int i9 = l41Var.f30352z;
            LaunchActivity launchActivity = LaunchActivity.C1;
            if (launchActivity != null) {
                launchActivity.K0(i9);
            }
        } else if (l41Var.G(org.telegram.ui.Cells.u6.class)) {
            Object obj2 = l41Var.G;
            if (obj2 instanceof e01) {
                e01 e01Var = (e01) obj2;
                org.telegram.ui.ActionBar.b5 parentLayout = z71Var.getParentLayout();
                e01Var.f37777b.run();
                AndroidUtilities.scrollToFragmentRow(parentLayout, e01Var.f37778c);
            } else if (obj2 instanceof MessagesController.FaqSearchResult) {
                NotificationCenter.getInstance(z71Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.openArticle, z71Var.h.A, ((MessagesController.FaqSearchResult) obj2).url);
            }
            Object obj3 = l41Var.G;
            if (obj3 != null) {
                z71Var.h.E(obj3);
            }
        } else {
            switch (l41Var.d) {
                case 1:
                    z71Var.k0(new UserInfoActivity());
                    return;
                case 2:
                    z71Var.k0(new ThemeActivity(0));
                    return;
                case 3:
                    z71Var.k0(new PrivacySettingsActivity());
                    return;
                case 4:
                case 14:
                default:
                    return;
                case 5:
                    z71Var.k0(new NotificationsSettingsActivity());
                    return;
                case 6:
                    z71Var.k0(new DataSettingsActivity());
                    return;
                case 7:
                    z71Var.k0(new FiltersSetupActivity());
                    return;
                case 8:
                    z71Var.k0(new SessionsActivity(0));
                    return;
                case 9:
                    z71Var.k0(new sb0());
                    return;
                case 10:
                    z71Var.k0(new LanguageSelectActivity());
                    return;
                case 11:
                    z71Var.k0(new PremiumPreviewFragment(0, "settings"));
                    return;
                case 12:
                    z71Var.k0(new gh.oa());
                    return;
                case 13:
                    z71Var.k0(new lh.g());
                    return;
                case 15:
                    z71Var.k0(new PremiumPreviewFragment(1, "settings"));
                    return;
                case 16:
                    bg.g3.d0(0, BirthdayController.getInstance(UserConfig.selectedAccount).getState());
                    return;
                case 17:
                    z71Var.showDialog(org.telegram.ui.Components.y4.U(z71Var, z71Var.resourceProvider));
                    return;
                case 18:
                    ve.e.s(z71Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                    return;
                case 19:
                    ve.e.s(z71Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                    return;
                case 20:
                    ProfileActivity.H4(z71Var.getParentActivity(), false);
                    return;
                case 21:
                    ProfileActivity.H4(z71Var.getParentActivity(), true);
                    return;
                case 22:
                    FileLog.cleanupLogs();
                    return;
                case 23:
                    if (MessagesController.getInstance(z71Var.currentAccount).isFrozen()) {
                        b.b(z71Var.currentAccount);
                        return;
                    } else {
                        ve.e.s(z71Var.getParentActivity(), LocaleController.getString(R.string.TelegramFeaturesUrl));
                        return;
                    }
            }
        }
    }

    public static void e0(z71 z71Var, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(z71Var.currentAccount).getInputUser(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(z71Var.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new o71(0, z71Var, tL_attachMenuBot), 66);
    }

    public static void j0(String str, StringBuilder sb2) {
        String[] supportedTypes;
        ArrayList arrayList;
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                int codecCount = MediaCodecList.getCodecCount();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (int i9 = 0; i9 < codecCount; i9++) {
                    MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i9);
                    if (codecInfoAt != null && (supportedTypes = codecInfoAt.getSupportedTypes()) != null) {
                        int i10 = 0;
                        while (true) {
                            if (i10 >= supportedTypes.length) {
                                break;
                            } else if (supportedTypes[i10].equals(str)) {
                                if (codecInfoAt.isEncoder()) {
                                    arrayList = arrayList3;
                                } else {
                                    arrayList = arrayList2;
                                }
                                arrayList.add(Integer.valueOf(i9));
                            } else {
                                i10++;
                            }
                        }
                    }
                }
                if (!arrayList2.isEmpty() || !arrayList3.isEmpty()) {
                    sb2.append("\n");
                    sb2.append(arrayList2.size());
                    sb2.append("+");
                    sb2.append(arrayList3.size());
                    sb2.append(" ");
                    sb2.append(str.substring(6));
                    sb2.append(" codecs:\n");
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        if (i11 > 0) {
                            sb2.append("\n");
                        }
                        MediaCodecInfo codecInfoAt2 = MediaCodecList.getCodecInfoAt(((Integer) arrayList2.get(i11)).intValue());
                        sb2.append("{d} ");
                        sb2.append(codecInfoAt2.getName());
                        sb2.append(" (");
                        if (Build.VERSION.SDK_INT >= 29) {
                            if (codecInfoAt2.isHardwareAccelerated()) {
                                sb2.append("gpu");
                            }
                            if (codecInfoAt2.isSoftwareOnly()) {
                                sb2.append("cpu");
                            }
                            if (codecInfoAt2.isVendor()) {
                                sb2.append(", v");
                            }
                        }
                        MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfoAt2.getCapabilitiesForType(str);
                        sb2.append("; mi=");
                        sb2.append(capabilitiesForType.getMaxSupportedInstances());
                        sb2.append(")");
                    }
                    for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                        if (i12 > 0 || !arrayList2.isEmpty()) {
                            sb2.append("\n");
                        }
                        MediaCodecInfo codecInfoAt3 = MediaCodecList.getCodecInfoAt(((Integer) arrayList3.get(i12)).intValue());
                        sb2.append("{e} ");
                        sb2.append(codecInfoAt3.getName());
                        sb2.append(" (");
                        if (Build.VERSION.SDK_INT >= 29) {
                            if (codecInfoAt3.isHardwareAccelerated()) {
                                sb2.append("gpu");
                            }
                            if (codecInfoAt3.isSoftwareOnly()) {
                                sb2.append("cpu");
                            }
                            if (codecInfoAt3.isVendor()) {
                                sb2.append(", v");
                            }
                        }
                        MediaCodecInfo.CodecCapabilities capabilitiesForType2 = codecInfoAt3.getCapabilitiesForType(str);
                        sb2.append("; mi=");
                        sb2.append(capabilitiesForType2.getMaxSupportedInstances());
                        sb2.append(")");
                    }
                    sb2.append("\n");
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void D(float f10) {
        org.telegram.ui.Cells.z3 z3Var = this.f45067s;
        if (z3Var == null) {
            return;
        }
        z3Var.setProgress(f10);
    }

    @Override
    public final void J(boolean z10, boolean z11) {
        org.telegram.ui.Cells.z3 z3Var = this.f45067s;
        if (z3Var == null) {
            return;
        }
        z3Var.setProgress(0.0f);
    }

    @Override
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        if (i9 == 0) {
            i0();
        }
    }

    @Override
    public final void P(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new nh.k(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 6));
    }

    @Override
    public final View createView(Context context) {
        this.f45061b = new fh.x4(this, context, 8);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.K();
        this.actionBar.setTitle(LocaleController.getString(R.string.Settings));
        this.actionBar.setActionBarMenuOnItemClick(new cd0(this, 25));
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(true);
        this.actionBar.setBackgroundColor(0);
        this.actionBar.setBackground(null);
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        org.telegram.ui.ActionBar.w0 c10 = n10.c(0, R.drawable.outline_header_search, this.resourceProvider);
        c10.F();
        c10.D = new cb(this, 16);
        this.f45063e = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        org.telegram.ui.ActionBar.w0 a2 = n10.a(1, R.drawable.ic_ab_other);
        this.f45064f = a2;
        a2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.f45064f.e(2, R.drawable.msg_leave, LocaleController.getString(R.string.LogOut));
        r71 r71Var = new r71(this, this, context);
        this.h = r71Var;
        r71Var.G();
        org.telegram.ui.Components.i51 i51Var = new org.telegram.ui.Components.i51(this, new a5(this, 26), new q71(this), new q71(this));
        this.f45062c = i51Var;
        i51Var.U2.f35188r = false;
        i51Var.p1();
        this.f45062c.setPadding(0, AndroidUtilities.dp(12.0f) + AndroidUtilities.statusBarHeight, 0, AndroidUtilities.navigationBarHeight + this.P);
        this.f45062c.setClipToPadding(false);
        this.f45062c.j(new l3(this, 29));
        org.telegram.ui.Components.i51 i51Var2 = this.f45062c;
        fh.x4 x4Var = this.f45061b;
        Objects.requireNonNull(i51Var2);
        this.U = new ig.k(i51Var2, x4Var, new u8(i51Var2, 0));
        this.f45062c.C0(new m71(this, 2));
        this.f45061b.addView(this.f45062c, g7.e6.e(-1, -1, 119));
        kh.h6 h6Var = new kh.h6(this, context);
        this.d = h6Var;
        this.f45061b.addView(h6Var, g7.e6.e(-1, 200, 48));
        this.f45061b.addView(this.actionBar, g7.e6.e(-1, -2, 55));
        org.telegram.ui.Components.e40 e40Var = new org.telegram.ui.Components.e40(0, true, true);
        this.f45065n = e40Var;
        e40Var.D = true;
        e40Var.f27909a = this;
        e40Var.f27910b = this;
        this.f45069x = new FrameLayout(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f45070y = frameLayout;
        this.f45069x.addView(frameLayout, g7.e6.d(120, 120.0f, 49, 0.0f, 11.0f, 0.0f, 0.0f));
        this.f45070y.setOnClickListener(new n71(this, 5));
        g7.g6.a(this.f45070y);
        this.A = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.B = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(90.0f));
        this.f45070y.addView(this.B, g7.e6.d(90, 90.0f, 49, 0.0f, 15.0f, 0.0f, 0.0f));
        org.telegram.ui.Cells.z3 z3Var = new org.telegram.ui.Cells.z3(this, context);
        this.f45067s = z3Var;
        z3Var.setSize(AndroidUtilities.dp(26.0f));
        this.f45067s.setProgressColor(-1);
        this.f45067s.setNoProgress(false);
        this.f45070y.addView(this.f45067s, g7.e6.d(90, 90.0f, 49, 0.0f, 15.0f, 0.0f, 0.0f));
        m0(false, false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.C = frameLayout2;
        frameLayout2.setBackground(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(32.0f), getThemedColor(org.telegram.ui.ActionBar.f6.f22947a7)));
        this.C.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.D = frameLayout3;
        frameLayout3.setBackground(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(30.0f), getThemedColor(org.telegram.ui.ActionBar.f6.Oh)));
        ImageView imageView = new ImageView(context);
        this.E = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.E.setImageResource(R.drawable.filled_premium_camera);
        this.D.addView(this.E, g7.e6.e(22, 22, 17));
        this.C.addView(this.D, g7.e6.c(30.0f, 30));
        this.f45070y.addView(this.C, g7.e6.d(34, 34.0f, 49, 32.0f, 75.0f, 0.0f, 0.0f));
        g7.g6.a(this.C);
        TextView textView = new TextView(context);
        this.F = textView;
        textView.setTextSize(1, 22.0f);
        this.F.setTypeface(AndroidUtilities.bold());
        this.F.setGravity(17);
        this.F.setSingleLine();
        TextView textView2 = this.F;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        TextView g10 = org.telegram.ui.Cells.j2.g(this.f45069x, this.F, g7.e6.d(-1, -2.0f, 49, 16.0f, 126.33299f, 16.0f, 0.0f), context);
        this.G = g10;
        g10.setTextSize(1, 13.0f);
        this.G.setGravity(17);
        this.G.setSingleLine();
        this.G.setEllipsize(truncateAt);
        TextView g11 = org.telegram.ui.Cells.j2.g(this.f45069x, this.G, g7.e6.d(-1, -2.0f, 49, 0.0f, 156.0f, 0.0f, 0.0f), context);
        this.H = g11;
        g11.setTextSize(1, 14.0f);
        this.H.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.B6));
        this.H.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f));
        this.H.setGravity(17);
        this.H.setBackground(org.telegram.ui.ActionBar.f6.f0(getThemedColor(org.telegram.ui.ActionBar.f6.f23092i6), 2, -1));
        this.H.setOnClickListener(new n71(this, 6));
        this.J = new View(context);
        n0(true, false);
        this.f45062c.U2.N(false);
        l0(getUserConfig().getCurrentUser());
        o0();
        i0();
        fh.x4 x4Var2 = this.f45061b;
        q71 q71Var = new q71(this);
        WeakHashMap weakHashMap = r0.j0.f46915a;
        r0.b0.j(x4Var2, q71Var);
        fh.x4 x4Var3 = this.f45061b;
        this.fragmentView = x4Var3;
        return x4Var3;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        org.telegram.ui.Components.i51 i51Var;
        if (i9 == NotificationCenter.starBalanceUpdated) {
            l0(getUserConfig().getCurrentUser());
            org.telegram.ui.Components.i51 i51Var2 = this.f45062c;
            if (i51Var2 != null) {
                i51Var2.U2.N(true);
            }
        } else if (i9 == NotificationCenter.updateInterfaces) {
            l0(getUserConfig().getCurrentUser());
        } else if (i9 == NotificationCenter.newSuggestionsAvailable && (i51Var = this.f45062c) != null) {
            i51Var.U2.N(true);
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final bu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    public final void h0() {
        ig.e eVar;
        float f10;
        int i9;
        if (Build.VERSION.SDK_INT >= 31 && (eVar = this.R) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            int measuredHeight = (this.fragmentView.getMeasuredHeight() - this.O) - AndroidUtilities.dp(8.0f);
            this.W.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp);
            RectF rectF = this.X;
            rectF.set(0.0f, measuredHeight - AndroidUtilities.dp(56.0f), this.fragmentView.getMeasuredWidth(), measuredHeight);
            if (LiteMode.isEnabled(262144)) {
                f10 = 0.0f;
            } else {
                f10 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(0.0f, f10);
            if (this.I) {
                i9 = 2;
            } else {
                i9 = 1;
            }
            eVar.g(i9, this.V);
            eVar.e(this.U, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    public final void i0() {
        float f10;
        org.telegram.ui.ActionBar.w0 w0Var = this.f45064f;
        td.a aVar = this.f45060a;
        org.telegram.ui.Components.j10.d(w0Var, 1.0f - aVar.f47775e);
        ImageView backButton = this.actionBar.getBackButton();
        if (this.I) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        org.telegram.ui.Components.j10.d(backButton, AndroidUtilities.lerp(f10, 1.0f, aVar.f47775e));
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !this.f45060a.f47776f;
    }

    public final void k0(org.telegram.ui.ActionBar.o2 o2Var) {
        LaunchActivity launchActivity;
        ActionBarLayout actionBarLayout;
        if (AndroidUtilities.isTablet() && (launchActivity = LaunchActivity.C1) != null && (actionBarLayout = launchActivity.f35522o0) != null) {
            if (!actionBarLayout.getFragmentStack().isEmpty()) {
                while (actionBarLayout.getFragmentStack().size() - 1 > 0) {
                    actionBarLayout.a0((org.telegram.ui.ActionBar.o2) actionBarLayout.getFragmentStack().get(0), false);
                }
                actionBarLayout.l(false, false);
            }
            org.telegram.ui.ActionBar.z4 z4Var = new org.telegram.ui.ActionBar.z4(o2Var);
            z4Var.f24010c = true;
            z4Var.f24013g = true;
            actionBarLayout.R(z4Var);
            return;
        }
        presentFragment(o2Var);
    }

    public final void l0(TLRPC.User user) {
        String str;
        String str2;
        if (this.B == null || this.Q != -1) {
            return;
        }
        this.A.r(user);
        this.B.e(user, this.A);
        this.F.setText(UserObject.getUserName(user));
        StringBuilder sb2 = new StringBuilder();
        if (user != null) {
            sb2.append(ne.b.c().b("+" + user.phone));
        }
        String publicUsername = UserObject.getPublicUsername(user);
        if (publicUsername != null) {
            sb2.append(" • @");
            sb2.append(publicUsername);
        }
        this.G.setText(sb2);
        TextView textView = this.H;
        try {
            PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
            int i9 = packageInfo.versionCode;
            int i10 = i9 / 10;
            int i11 = i9 % 10;
            if (i11 != 1 && i11 != 2) {
                if (ApplicationLoader.isStandaloneBuild()) {
                    str2 = "direct " + Build.CPU_ABI + " " + Build.CPU_ABI2;
                } else {
                    str2 = "universal " + Build.CPU_ABI + " " + Build.CPU_ABI2;
                }
            } else {
                str2 = "store bundled " + Build.CPU_ABI + " " + Build.CPU_ABI2;
            }
            int i12 = R.string.TelegramVersion;
            Locale locale = Locale.US;
            str = LocaleController.formatString(i12, "v" + packageInfo.versionName + " (" + i10 + ")\n" + str2);
        } catch (Exception e10) {
            FileLog.e(e10);
            str = null;
        }
        textView.setText(str);
    }

    public final void m0(boolean z10, boolean z11) {
        if (this.f45067s == null) {
            return;
        }
        AnimatorSet animatorSet = this.f45066r;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f45066r = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f45066r = animatorSet2;
            if (z10) {
                this.f45067s.setVisibility(0);
                this.f45066r.playTogether(ObjectAnimator.ofFloat(this.f45067s, View.ALPHA, 1.0f));
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f45067s, View.ALPHA, 0.0f));
            }
            this.f45066r.setDuration(180L);
            this.f45066r.addListener(new n60(9, this, z10));
            this.f45066r.start();
        } else if (z10) {
            this.f45067s.setAlpha(1.0f);
            this.f45067s.setVisibility(0);
        } else {
            this.f45067s.setAlpha(0.0f);
            this.f45067s.setVisibility(4);
        }
    }

    public final void n0(boolean r5, boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.z71.n0(boolean, boolean):void");
    }

    public final void o0() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        kVar.setTitleColor(getThemedColor(i9));
        this.actionBar.C(getThemedColor(i9), false);
        this.f45061b.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.f22947a7));
        this.F.setTextColor(getThemedColor(i9));
        this.G.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23369y6));
        this.f45063e.N();
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6);
        this.J.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.f6.l1(0.0f, themedColor), themedColor}));
        this.d.invalidate();
        this.f45062c.invalidate();
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar.f23577j0) {
            if (z10) {
                kVar.h(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.starBalanceUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.newSuggestionsAvailable);
        Bundle bundle = this.arguments;
        int i9 = 0;
        if (bundle != null) {
            this.I = bundle.getBoolean("hasMainTabs", false);
        }
        if (this.I) {
            i9 = AndroidUtilities.dp(72.0f);
        }
        this.P = i9;
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.starBalanceUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.newSuggestionsAvailable);
    }

    @Override
    public final void s() {
        this.f45062c.x0(0);
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final ng.d y() {
        return this.T;
    }

    public z71(Bundle bundle) {
        super(bundle);
        this.f45060a = new td.a(0, this, org.telegram.ui.Components.gr.h, 350L, false);
        this.K = 0;
        this.N = new ArrayList();
        this.Q = -1;
        ArrayList arrayList = new ArrayList();
        this.V = arrayList;
        RectF rectF = new RectF();
        this.W = rectF;
        RectF rectF2 = new RectF();
        this.X = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        if (Build.VERSION.SDK_INT >= 31) {
            this.R = new ig.e(false);
            this.S = new ng.d(null);
            this.T = new ng.d(null);
            return;
        }
        this.R = null;
        this.S = null;
        this.T = null;
    }

    @Override
    public final void O() {
    }

    @Override
    public final void B(float f10, int i9) {
    }
}
