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
public final class v81 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.x40, vg0, xd.b {
    public org.telegram.ui.Components.z8 B;
    public org.telegram.ui.Components.p9 C;
    public FrameLayout D;
    public FrameLayout E;
    public ImageView F;
    public TextView G;
    public TextView H;
    public TextView I;
    public boolean J;
    public View K;
    public int L;
    public boolean M;
    public ValueAnimator N;
    public final ArrayList O;
    public int P;
    public int Q;
    public int R;
    public final og.e S;
    public final tg.d T;
    public final tg.d U;
    public og.k V;
    public final ArrayList W;
    public final RectF X;
    public final RectF Y;
    public final xd.a f42044a;
    public lh.j4 f42045b;
    public org.telegram.ui.Components.h61 f42046c;
    public fg.i0 d;
    public org.telegram.ui.ActionBar.w0 f42047e;
    public org.telegram.ui.ActionBar.w0 f42048f;
    public n81 h;
    public org.telegram.ui.Components.y40 f42049n;
    public AnimatorSet f42050r;
    public org.telegram.ui.Cells.y3 f42051s;
    public TLRPC.FileLocation v;
    public TLRPC.FileLocation f42052w;
    public FrameLayout f42053x;
    public FrameLayout f42054y;

    public v81() {
        this(null);
    }

    public static boolean U(v81 v81Var, org.telegram.ui.Components.h51 h51Var, View view) {
        String str;
        Object obj = h51Var.G;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            sh.p2.j(v81Var.currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, new j81(v81Var, 0));
            return true;
        }
        if (h51Var.G(org.telegram.ui.Cells.u6.class)) {
            Object obj2 = h51Var.G;
            if (obj2 instanceof w01) {
                str = ((w01) obj2).h;
            } else if (obj2 instanceof MessagesController.FaqSearchResult) {
                str = ((MessagesController.FaqSearchResult) obj2).url;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                org.telegram.ui.Components.q70 H = org.telegram.ui.Components.q70.H(v81Var, view);
                H.c(R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new h21(10, v81Var, str), false);
                H.W(v81Var.f42046c.U0(view, false));
                H.Z();
                return true;
            }
        }
        return false;
    }

    public static void V(v81 v81Var) {
        boolean z4;
        TLRPC.User user = MessagesController.getInstance(v81Var.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(v81Var.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(v81Var.currentAccount).getCurrentUser();
        }
        if (user == null) {
            return;
        }
        org.telegram.ui.Components.y40 y40Var = v81Var.f42049n;
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null && userProfilePhoto.photo_big != null && !(userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
            z4 = true;
        } else {
            z4 = false;
        }
        y40Var.o(z4, new j81(v81Var, 4), new eg.c0(6), 0);
    }

    public static void W(v81 v81Var, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.C0(LaunchActivity.D1, v81Var.currentAccount, tL_attachMenuBot, null, true);
        MediaDataController.getInstance(v81Var.currentAccount).updateAttachMenuBotsInCache();
    }

    public static void Y(org.telegram.ui.v81 r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.v81.Y(org.telegram.ui.v81):void");
    }

    public static void Z(v81 v81Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        v81Var.actionBar.getTitlesContainer().setAlpha(floatValue);
        v81Var.d.setAlpha(floatValue);
    }

    public static void a0(v81 v81Var, ArrayList arrayList) {
        ArrayList<TLRPC.TL_attachMenuBot> arrayList2;
        SpannableStringBuilder spannableStringBuilder;
        ArrayList arrayList3 = v81Var.O;
        org.telegram.ui.ActionBar.r0 r0Var = v81Var.f42047e.C;
        int i10 = 0;
        if (r0Var != null && r0Var.getTag() != null) {
            arrayList.add(org.telegram.ui.Components.h51.C(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
            n81 n81Var = v81Var.h;
            ArrayList arrayList4 = n81Var.d;
            ArrayList arrayList5 = n81Var.v;
            if (n81Var.f42891w) {
                ArrayList arrayList6 = n81Var.f42889r;
                int size = arrayList6.size();
                int i11 = 0;
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList6.get(i12);
                    i12++;
                    int i13 = org.telegram.ui.Cells.u6.f24213a;
                    org.telegram.ui.Components.h51 J = org.telegram.ui.Components.h51.J(org.telegram.ui.Cells.u6.class);
                    J.f27375l = (CharSequence) n81Var.f42888n.get(i11);
                    J.G = (w01) obj;
                    arrayList.add(J);
                    i11++;
                }
                if (!n81Var.f42890s.isEmpty()) {
                    arrayList.add(org.telegram.ui.Components.h51.q(LocaleController.getString(R.string.SettingsFaqSearchTitle)));
                    ArrayList arrayList7 = n81Var.f42890s;
                    int size2 = arrayList7.size();
                    while (i10 < size2) {
                        Object obj2 = arrayList7.get(i10);
                        i10++;
                        int i14 = org.telegram.ui.Cells.u6.f24213a;
                        org.telegram.ui.Components.h51 J2 = org.telegram.ui.Components.h51.J(org.telegram.ui.Cells.u6.class);
                        J2.f27375l = (CharSequence) n81Var.f42888n.get(i11);
                        J2.G = (MessagesController.FaqSearchResult) obj2;
                        arrayList.add(J2);
                        i11++;
                    }
                    return;
                }
                return;
            }
            if (!arrayList5.isEmpty()) {
                arrayList.add(org.telegram.ui.Components.h51.q(LocaleController.getString(R.string.SettingsRecent)));
                int size3 = arrayList5.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj3 = arrayList5.get(i15);
                    i15++;
                    if (obj3 instanceof w01) {
                        w01 w01Var = (w01) obj3;
                        String str = w01Var.f42240a;
                        int i16 = org.telegram.ui.Cells.u6.f24213a;
                        org.telegram.ui.Components.h51 J3 = org.telegram.ui.Components.h51.J(org.telegram.ui.Cells.u6.class);
                        J3.f27375l = str;
                        J3.G = w01Var;
                        arrayList.add(J3);
                    } else if (obj3 instanceof MessagesController.FaqSearchResult) {
                        MessagesController.FaqSearchResult faqSearchResult = (MessagesController.FaqSearchResult) obj3;
                        String str2 = faqSearchResult.title;
                        int i17 = org.telegram.ui.Cells.u6.f24213a;
                        org.telegram.ui.Components.h51 J4 = org.telegram.ui.Components.h51.J(org.telegram.ui.Cells.u6.class);
                        J4.f27375l = str2;
                        J4.G = faqSearchResult;
                        arrayList.add(J4);
                    }
                }
            }
            if (!arrayList4.isEmpty()) {
                arrayList.add(org.telegram.ui.Components.h51.q(LocaleController.getString(R.string.SettingsFaqSearchTitle)));
                int size4 = arrayList4.size();
                while (i10 < size4) {
                    Object obj4 = arrayList4.get(i10);
                    i10++;
                    MessagesController.FaqSearchResult faqSearchResult2 = (MessagesController.FaqSearchResult) obj4;
                    String str3 = faqSearchResult2.title;
                    int i18 = org.telegram.ui.Cells.u6.f24213a;
                    org.telegram.ui.Components.h51 J5 = org.telegram.ui.Components.h51.J(org.telegram.ui.Cells.u6.class);
                    J5.f27375l = str3;
                    J5.G = faqSearchResult2;
                    arrayList.add(J5);
                }
                return;
            }
            return;
        }
        FrameLayout frameLayout = v81Var.f42053x;
        org.telegram.ui.Components.h51 h51Var = new org.telegram.ui.Components.h51(-4);
        h51Var.f27368c = frameLayout;
        h51Var.f27388z = 188;
        arrayList.add(h51Var);
        arrayList3.clear();
        for (int i19 = 0; i19 < 4; i19++) {
            if (UserConfig.getInstance(i19).isClientActivated() && v81Var.currentAccount != i19) {
                arrayList3.add(Integer.valueOf(i19));
            }
        }
        Collections.sort(arrayList3, new du(10));
        Set<String> set = v81Var.getMessagesController().pendingSuggestions;
        if (set.contains("PREMIUM_GRACE")) {
            arrayList.add(t81.a(LocaleController.getString(R.string.GraceSuggestionTitle), LocaleController.getString(R.string.GraceSuggestionMessage), null, null, LocaleController.getString(R.string.GraceSuggestionButton), new k81(v81Var, 0)));
            arrayList.add(org.telegram.ui.Components.h51.B(null));
        } else if (set.contains("VALIDATE_PHONE_NUMBER") && v81Var.getUserConfig().getCurrentUser() != null) {
            arrayList.add(t81.a(LocaleController.formatString(R.string.CheckPhoneNumber, org.telegram.messenger.y3.j(new StringBuilder("+"), v81Var.getUserConfig().getCurrentUser().phone, se.b.c())), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CheckPhoneNumberInfo), new j81(v81Var, 1)), LocaleController.getString(R.string.CheckPhoneNumberNo), new k81(v81Var, 1), mh.g5.g2(LocaleController.getString(R.string.CheckPhoneNumberYes2)), new k81(v81Var, 2)));
            arrayList.add(org.telegram.ui.Components.h51.B(null));
        } else if (set.contains("VALIDATE_PASSWORD")) {
            arrayList.add(t81.a(LocaleController.getString(R.string.YourPasswordHeader), LocaleController.getString(R.string.YourPasswordRemember), LocaleController.getString(R.string.YourPasswordRememberNo), new k81(v81Var, 3), LocaleController.getString(R.string.YourPasswordRememberYes), new k81(v81Var, 4)));
            arrayList.add(org.telegram.ui.Components.h51.B(null));
        }
        if (arrayList3.size() > 0) {
            yh.r(R.string.SettingsAccounts, arrayList);
            for (int i20 = 0; i20 < arrayList3.size(); i20++) {
                int intValue = ((Integer) arrayList3.get(i20)).intValue();
                int i21 = p81.f39919a;
                org.telegram.ui.Components.h51 J6 = org.telegram.ui.Components.h51.J(p81.class);
                J6.d = i20;
                J6.f27388z = intValue;
                arrayList.add(J6);
            }
            arrayList.add(org.telegram.ui.Components.h51.B(null));
        }
        arrayList.add(r81.a(1, -14899731, -15431455, R.drawable.settings_account, LocaleController.getString(R.string.SettingsAccount), LocaleController.getString(R.string.SettingsAccountInfo), null));
        arrayList.add(r81.a(2, -1007845, -1996271, R.drawable.settings_chat, LocaleController.getString(R.string.SettingsChat), LocaleController.getString(R.string.SettingsChatInfo), null));
        arrayList.add(r81.a(3, -11154873, -14175180, R.drawable.settings_privacy, LocaleController.getString(R.string.SettingsPrivacySecurity), LocaleController.getString(R.string.SettingsPrivacySecurityInfo), null));
        arrayList.add(r81.a(5, -765355, -2148011, R.drawable.settings_sounds, LocaleController.getString(R.string.SettingsNotifications), LocaleController.getString(R.string.SettingsNotificationsInfo), null));
        arrayList.add(r81.a(6, -11565578, -13276952, R.drawable.settings_data, LocaleController.getString(R.string.SettingsData), LocaleController.getString(R.string.SettingsDataInfo), null));
        arrayList.add(r81.a(7, -14899731, -15497247, R.drawable.settings_folders, LocaleController.getString(R.string.SettingsFolders), LocaleController.getString(R.string.SettingsFoldersInfo), null));
        arrayList.add(r81.a(8, -13451058, -14836538, R.drawable.settings_devices, LocaleController.getString(R.string.SettingsDevices), LocaleController.getString(R.string.SettingsDevicesInfo), null));
        arrayList.add(r81.a(9, -881871, -1940716, R.drawable.settings_power, LocaleController.getString(R.string.SettingsPowerSaving), LocaleController.getString(R.string.SettingsPowerSavingInfo), null));
        arrayList.add(r81.a(10, -3903756, -6335009, R.drawable.settings_language, LocaleController.getString(R.string.SettingsLanguage), LocaleController.getCurrentLanguageName(), null));
        arrayList.add(org.telegram.ui.Components.h51.B(null));
        if (!v81Var.getMessagesController().premiumFeaturesBlocked()) {
            arrayList.add(r81.a(11, -4826625, -10388225, R.drawable.settings_premium, LocaleController.getString(R.string.TelegramPremium), null, null));
        }
        CharSequence charSequence = "";
        if (v81Var.getMessagesController().starsPurchaseAvailable()) {
            mh.t7 y10 = mh.t7.y(v81Var.currentAccount, false);
            long j10 = y10.p().amount;
            int i22 = R.drawable.settings_stars;
            String string = LocaleController.getString(R.string.TelegramStars);
            if (!y10.f14833e || j10 <= 0) {
                spannableStringBuilder = "";
            } else {
                spannableStringBuilder = mh.ja.J0(y10.p(), 0.85f, ' ');
            }
            arrayList.add(r81.a(12, -1071598, -1608430, i22, string, null, spannableStringBuilder));
        }
        mh.t7.y(v81Var.currentAccount, true).p();
        if (ApplicationLoader.isBetaBuild() || ApplicationLoader.isStandaloneBuild() || ApplicationLoader.isHuaweiStoreBuild() || (mh.t7.y(v81Var.currentAccount, true).f14833e && (mh.t7.y(v81Var.currentAccount, true).O(0) || mh.t7.y(v81Var.currentAccount, true).p().positive()))) {
            mh.t7 y11 = mh.t7.y(v81Var.currentAccount, true);
            long j11 = y11.p().amount;
            int i23 = R.drawable.settings_gram_24;
            String string2 = LocaleController.getString(R.string.MyTON);
            if (y11.f14833e && j11 > 0) {
                charSequence = mh.ja.J0(y11.p(), 0.85f, ' ');
            }
            arrayList.add(r81.a(13, -14965523, -15431455, i23, string2, null, charSequence));
        }
        TLRPC.TL_attachMenuBots attachMenuBots = MediaDataController.getInstance(UserConfig.selectedAccount).getAttachMenuBots();
        if (attachMenuBots != null && (arrayList2 = attachMenuBots.bots) != null && !arrayList2.isEmpty()) {
            ArrayList<TLRPC.TL_attachMenuBot> arrayList8 = attachMenuBots.bots;
            int size5 = arrayList8.size();
            while (i10 < size5) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList8.get(i10);
                i10++;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                if (tL_attachMenuBot2.show_in_side_menu && tL_attachMenuBot2.bot_id == 1985737506) {
                    int i24 = R.drawable.settings_wallet;
                    org.telegram.ui.Components.h51 J7 = org.telegram.ui.Components.h51.J(r81.class);
                    long j12 = tL_attachMenuBot2.bot_id;
                    J7.d = (int) (j12 ^ (j12 >>> 32));
                    J7.f27374k = i24;
                    J7.f27375l = tL_attachMenuBot2.short_name;
                    J7.B = ((-15431455) << 32) | ((-14965523) & 4294967295L);
                    J7.G = tL_attachMenuBot2;
                    arrayList.add(J7);
                }
            }
        }
        if (!v81Var.getMessagesController().premiumFeaturesBlocked()) {
            arrayList.add(r81.a(15, -765355, -2148011, R.drawable.settings_business, LocaleController.getString(R.string.TelegramBusiness), null, null));
        }
        if (!v81Var.getMessagesController().premiumPurchaseBlocked()) {
            arrayList.add(r81.a(16, -816335, -1940716, R.drawable.settings_gift, LocaleController.getString(R.string.SendAGift), null, null));
        }
        if (((org.telegram.ui.Components.h51) l.d.i(1, arrayList)).f2505a != 7) {
            arrayList.add(org.telegram.ui.Components.h51.B(null));
        }
        yh.r(R.string.SettingsHelp, arrayList);
        arrayList.add(r81.a(17, -1007845, -1996271, R.drawable.settings_ask, LocaleController.getString(R.string.AskAQuestion), null, null));
        arrayList.add(r81.a(18, -14965523, -15431455, R.drawable.settings_faq, LocaleController.getString(R.string.TelegramFAQ), null, null));
        arrayList.add(r81.a(23, -3903756, -6335009, R.drawable.settings_features, LocaleController.getString(R.string.TelegramFeatures), null, null));
        arrayList.add(r81.a(19, -11154873, -14175180, R.drawable.settings_policy, LocaleController.getString(R.string.PrivacyPolicy), null, null));
        if (BuildVars.LOGS_ENABLED || BuildVars.DEBUG_PRIVATE_VERSION) {
            arrayList.add(org.telegram.ui.Components.h51.B(null));
            yh.r(R.string.SettingsDebug, arrayList);
            arrayList.add(r81.a(20, -11154873, -14175180, 0, LocaleController.getString(R.string.DebugSendLogs), null, null));
            arrayList.add(r81.a(21, -11154873, -14175180, 0, LocaleController.getString(R.string.DebugSendLastLogs), null, null));
            arrayList.add(r81.a(22, -765355, -2148011, 0, LocaleController.getString(R.string.DebugClearLogs), null, null));
        }
        arrayList.add(org.telegram.ui.Components.h51.l(v81Var.I));
    }

    public static void b0(v81 v81Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        TLRPC.VideoSize closestVideoSizeWithSize;
        v81Var.R = -1;
        if (tL_error == null) {
            TLRPC.User user = v81Var.getMessagesController().getUser(Long.valueOf(v81Var.getUserConfig().getClientUserId()));
            if (user == null) {
                user = v81Var.getUserConfig().getCurrentUser();
                if (user == null) {
                    return;
                }
                v81Var.getMessagesController().putUser(user, false);
            } else {
                v81Var.getUserConfig().setCurrentUser(user);
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
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f20869id;
            if (closestPhotoSizeWithSize != null) {
                tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
            }
            if (closestPhotoSizeWithSize2 != null) {
                tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
            }
            if (closestPhotoSizeWithSize != null && v81Var.v != null) {
                FileLoader.getInstance(v81Var.currentAccount).getPathToAttach(v81Var.v, true).renameTo(FileLoader.getInstance(v81Var.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                StringBuilder sb = new StringBuilder();
                sb.append(v81Var.v.volume_id);
                sb.append("_");
                String m9 = android.support.v4.media.a.m(v81Var.v.local_id, "@90_90", sb);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(closestPhotoSizeWithSize.location.volume_id);
                sb2.append("_");
                ImageLoader.getInstance().replaceImageInCache(m9, android.support.v4.media.a.m(closestPhotoSizeWithSize.location.local_id, "@90_90", sb2), ImageLocation.getForUserOrChat(v81Var.currentAccount, user, 1), false);
            }
            if (closestVideoSizeWithSize != null && str != null) {
                new File(str).renameTo(FileLoader.getInstance(v81Var.currentAccount).getPathToAttach(closestVideoSizeWithSize, "mp4", true));
            } else if (closestPhotoSizeWithSize2 != null && v81Var.f42052w != null) {
                FileLoader.getInstance(v81Var.currentAccount).getPathToAttach(v81Var.f42052w, true).renameTo(FileLoader.getInstance(v81Var.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
            }
            v81Var.getMessagesController().getDialogPhotos(user.f20992id).addPhotoAtStart(tL_photos_photo.photo);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(user);
            v81Var.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
            TLRPC.UserFull userFull = v81Var.getMessagesController().getUserFull(v81Var.getUserConfig().getClientUserId());
            if (userFull != null) {
                userFull.profile_photo = tL_photos_photo.photo;
                v81Var.getMessagesStorage().updateUserInfo(userFull, false);
            }
            v81Var.m0(user);
        }
        v81Var.v = null;
        v81Var.f42052w = null;
        v81Var.n0(false, true);
        v81Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
        v81Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
        v81Var.getUserConfig().saveConfig(true);
    }

    public static void c0(v81 v81Var, int i10) {
        int i11;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        long j10;
        Long l10;
        int i12;
        int i13 = 0;
        if (i10 == 0) {
            v81Var.getUserConfig().syncContacts = true;
            v81Var.getUserConfig().saveConfig(false);
            v81Var.getContactsController().forceImportContacts();
            return;
        }
        long j11 = 0;
        if (i10 == 1) {
            v81Var.getContactsController().loadContacts(false, 0L);
        } else if (i10 == 2) {
            v81Var.getContactsController().resetImportedContacts();
        } else if (i10 == 3) {
            v81Var.getMessagesController().forceResetDialogs();
        } else if (i10 == 4) {
            BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
            ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
            v81Var.f42046c.V2.N(true);
            if (BuildVars.LOGS_ENABLED) {
                l.d.x(new StringBuilder("app start time = "), ApplicationLoader.startTime);
                try {
                    FileLog.d("buildVersion = " + ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0).versionCode);
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
            }
        } else if (i10 == 5) {
            SharedConfig.toggleInappCamera();
        } else if (i10 == 6) {
            v81Var.getMessagesStorage().clearSentMedia();
            SharedConfig.setNoSoundHintShowed(false);
            org.telegram.messenger.y3.d(org.telegram.messenger.y3.d(org.telegram.messenger.y3.d(org.telegram.messenger.y3.d(org.telegram.messenger.y3.d(org.telegram.messenger.y3.d(org.telegram.messenger.y3.d(org.telegram.messenger.y3.d(org.telegram.messenger.y3.d(org.telegram.messenger.y3.d(MessagesController.getGlobalMainSettings().edit().remove("archivehint").remove("proximityhint").remove("archivehint_l"), "searchpostsnew", "speedhint", "gifhint", "reminderhint"), "soundHint", "themehint", "bganimationhint", "filterhint"), "n_0", "storyprvhint", "storyhint", "storyhint2"), "storydualhint", "storysvddualhint", "stories_camera", "dualcam"), "dualmatrix", "dual_available", "archivehint", "askNotificationsAfter"), "askNotificationsDuration", "viewoncehint", "voicepausehint", "taptostorysoundhint"), "nothanos", "voiceoncehint", "savedhint", "savedsearchhint"), "savedsearchtaghint", "newppsms", "monetizationadshint", "seekSpeedHintShowed"), "unsupport_video/av01", "statusgiftpage", "multistorieshint", "trimvoicehint"), "taptostoryhighlighthint", "proxycheckstatusip", "callmiconstart", "showchattagsinfo").remove("language_showed2").remove("aihintshown").remove("savedmsgschatshint").apply();
            k7.b6.a();
            SharedPrefsHelper.cleanupAccount(v81Var.currentAccount);
            MessagesController.getEmojiSettings(v81Var.currentAccount).edit().remove("featured_hidden").remove("emoji_featured_hidden").commit();
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
            ChatThemeController.getInstance(v81Var.currentAccount).clearCache();
            v81Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
            t31.W();
            dg.e1.e(v81Var.currentAccount).a();
            SharedPreferences mainSettings = v81Var.getMessagesController().getMainSettings();
            SharedPreferences.Editor edit = mainSettings.edit();
            org.telegram.messenger.y3.d(edit, "peerColors", "profilePeerColors", "boostingappearance", "bizbothint").remove("movecaptionhint");
            for (String str6 : mainSettings.getAll().keySet()) {
                if (str6.contains("show_gift_for_") || str6.contains("bdayhint_") || str6.contains("bdayanim_") || str6.startsWith("ask_paid_message_") || str6.startsWith("topicssidetabs")) {
                    edit.remove(str6);
                }
            }
            edit.apply();
            SharedPreferences.Editor edit2 = MessagesController.getNotificationsSettings(v81Var.currentAccount).edit();
            for (String str7 : MessagesController.getNotificationsSettings(v81Var.currentAccount).getAll().keySet()) {
                if (str7.startsWith("dialog_bar_botver")) {
                    edit2.remove(str7);
                }
            }
            edit2.apply();
        } else if (i10 == 7) {
            org.telegram.ui.Components.voip.g2.i(v81Var.getParentActivity());
        } else if (i10 == 8) {
            SharedConfig.toggleRoundCamera16to9();
        } else if (i10 == 9) {
            ((LaunchActivity) v81Var.getParentActivity()).z(true);
        } else if (i10 == 10) {
            v81Var.getMessagesStorage().readAllDialogs(-1);
        } else if (i10 == 11) {
            SharedConfig.toggleDisableVoiceAudioEffects();
        } else if (i10 == 12) {
            SharedConfig.pendingAppUpdate = null;
            SharedConfig.saveConfig();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
        } else if (i10 == 13) {
            Set<String> set = v81Var.getMessagesController().pendingSuggestions;
            set.add("VALIDATE_PHONE_NUMBER");
            set.add("VALIDATE_PASSWORD");
            v81Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
        } else {
            try {
                if (i10 == 14) {
                    ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                    ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                    WebStorage.getInstance().deleteAllData();
                    WebView webView = new WebView(ApplicationLoader.applicationContext);
                    webView.clearHistory();
                    webView.destroy();
                } else if (i10 == 15) {
                    CookieManager cookieManager = CookieManager.getInstance();
                    cookieManager.removeAllCookies(null);
                    cookieManager.flush();
                } else if (i10 == 16) {
                    SharedConfig.toggleDebugWebView();
                    Activity parentActivity = v81Var.getParentActivity();
                    if (SharedConfig.debugWebView) {
                        i12 = R.string.DebugMenuWebViewDebugEnabled;
                    } else {
                        i12 = R.string.DebugMenuWebViewDebugDisabled;
                    }
                    Toast.makeText(parentActivity, LocaleController.getString(i12), 0).show();
                } else if (i10 == 17) {
                    SharedConfig.toggleForceDisableTabletMode();
                    Activity parentActivity2 = v81Var.getParentActivity();
                    if (parentActivity2 != null) {
                        Intent launchIntentForPackage = parentActivity2.getPackageManager().getLaunchIntentForPackage(parentActivity2.getPackageName());
                        parentActivity2.finishAffinity();
                        parentActivity2.startActivity(launchIntentForPackage);
                    }
                    System.exit(0);
                } else if (i10 == 18) {
                    bb.a.a((LaunchActivity) v81Var.getParentActivity(), !SharedConfig.isFloatingDebugActive, true);
                } else if (i10 == 19) {
                    v81Var.getMessagesController().loadAppConfig();
                    TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                    tL_help_dismissSuggestion.suggestion = "VALIDATE_PHONE_NUMBER";
                    tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                    v81Var.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new l81(v81Var, 0));
                } else if (i10 == 20) {
                    int i14 = ConnectionsManager.CPU_COUNT;
                    int memoryClass = ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getMemoryClass();
                    StringBuilder sb = new StringBuilder();
                    long j12 = 0;
                    long j13 = 0;
                    long j14 = 0;
                    long j15 = 0;
                    long j16 = 0;
                    long j17 = 0;
                    long j18 = 0;
                    long j19 = 0;
                    while (i13 < i14) {
                        long j20 = j11;
                        Long sysInfoLong = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i13 + "/cpufreq/cpuinfo_min_freq");
                        Long sysInfoLong2 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i13 + "/cpufreq/cpuinfo_cur_freq");
                        Long sysInfoLong3 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i13 + "/cpufreq/cpuinfo_max_freq");
                        Long sysInfoLong4 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i13 + "/cpu_capacity");
                        sb.append("#");
                        sb.append(i13);
                        sb.append(" ");
                        int i15 = i13;
                        if (sysInfoLong != null) {
                            sb.append("min=");
                            l10 = sysInfoLong3;
                            sb.append(sysInfoLong.longValue() / 1000);
                            sb.append(" ");
                            j12 += sysInfoLong.longValue() / 1000;
                            j13++;
                        } else {
                            l10 = sysInfoLong3;
                        }
                        if (sysInfoLong2 != null) {
                            sb.append("cur=");
                            sb.append(sysInfoLong2.longValue() / 1000);
                            sb.append(" ");
                            j14 += sysInfoLong2.longValue() / 1000;
                            j15++;
                        }
                        if (l10 != null) {
                            sb.append("max=");
                            sb.append(l10.longValue() / 1000);
                            sb.append(" ");
                            j16 = (l10.longValue() / 1000) + j16;
                            j17++;
                        }
                        if (sysInfoLong4 != null) {
                            sb.append("cpc=");
                            sb.append(sysInfoLong4);
                            sb.append(" ");
                            j18 = sysInfoLong4.longValue() + j18;
                            j19++;
                        }
                        sb.append("\n");
                        i13 = i15 + 1;
                        j11 = j20;
                    }
                    long j21 = j11;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(Build.MANUFACTURER);
                    sb2.append(", ");
                    sb2.append(Build.MODEL);
                    sb2.append(" (");
                    sb2.append(Build.PRODUCT);
                    sb2.append(", ");
                    sb2.append(Build.DEVICE);
                    sb2.append(")  (android ");
                    int i16 = Build.VERSION.SDK_INT;
                    sb2.append(i16);
                    sb2.append(")\n");
                    if (i16 >= 31) {
                        sb2.append("SoC: ");
                        sb2.append(Build.SOC_MANUFACTURER);
                        sb2.append(", ");
                        sb2.append(Build.SOC_MODEL);
                        sb2.append("\n");
                    }
                    String sysInfoString = AndroidUtilities.getSysInfoString("/sys/kernel/gpu/gpu_model");
                    if (sysInfoString != null) {
                        sb2.append("GPU: ");
                        sb2.append(sysInfoString);
                        Long sysInfoLong5 = AndroidUtilities.getSysInfoLong("/sys/kernel/gpu/gpu_min_clock");
                        Long sysInfoLong6 = AndroidUtilities.getSysInfoLong("/sys/kernel/gpu/gpu_mm_min_clock");
                        Long sysInfoLong7 = AndroidUtilities.getSysInfoLong("/sys/kernel/gpu/gpu_max_clock");
                        if (sysInfoLong5 != null) {
                            sb2.append(", min=");
                            j10 = j12;
                            sb2.append(sysInfoLong5.longValue() / 1000);
                        } else {
                            j10 = j12;
                        }
                        if (sysInfoLong6 != null) {
                            sb2.append(", mmin=");
                            sb2.append(sysInfoLong6.longValue() / 1000);
                        }
                        if (sysInfoLong7 != null) {
                            sb2.append(", max=");
                            sb2.append(sysInfoLong7.longValue() / 1000);
                        }
                        sb2.append("\n");
                    } else {
                        j10 = j12;
                    }
                    ConfigurationInfo deviceConfigurationInfo = ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getDeviceConfigurationInfo();
                    sb2.append("GLES Version: ");
                    sb2.append(deviceConfigurationInfo.getGlEsVersion());
                    sb2.append("\nMemory: class=");
                    sb2.append(AndroidUtilities.formatFileSize(memoryClass * 1048576));
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getMemoryInfo(memoryInfo);
                    sb2.append(", total=");
                    sb2.append(AndroidUtilities.formatFileSize(memoryInfo.totalMem));
                    sb2.append(", avail=");
                    sb2.append(AndroidUtilities.formatFileSize(memoryInfo.availMem));
                    sb2.append(", low?=");
                    sb2.append(memoryInfo.lowMemory);
                    sb2.append(" (threshold=");
                    sb2.append(AndroidUtilities.formatFileSize(memoryInfo.threshold));
                    sb2.append(")\nCurrent class: ");
                    sb2.append(SharedConfig.performanceClassName(SharedConfig.getDevicePerformanceClass()));
                    sb2.append(", measured: ");
                    sb2.append(SharedConfig.performanceClassName(SharedConfig.measureDevicePerformanceClass()));
                    if (i16 >= 31) {
                        sb2.append(", suggest=");
                        sb2.append(Build.VERSION.MEDIA_PERFORMANCE_CLASS);
                    }
                    sb2.append("\n");
                    sb2.append(i14);
                    sb2.append(" CPUs");
                    if (j13 > j21) {
                        sb2.append(", avgMinFreq=");
                        sb2.append(j10 / j13);
                    }
                    if (j15 > j21) {
                        sb2.append(", avgCurFreq=");
                        sb2.append(j14 / j15);
                    }
                    if (j17 > j21) {
                        sb2.append(", avgMaxFreq=");
                        sb2.append(j16 / j17);
                    }
                    if (j19 > j21) {
                        sb2.append(", avgCapacity=");
                        sb2.append(j18 / j19);
                    }
                    sb2.append("\n");
                    sb2.append((CharSequence) sb);
                    k0("video/avc", sb2);
                    k0("video/hevc", sb2);
                    k0("video/x-vnd.on2.vp8", sb2);
                    k0("video/x-vnd.on2.vp9", sb2);
                    v81Var.showDialog(new o81(v81Var, v81Var.getParentActivity(), sb2.toString()));
                } else if (i10 == 21) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(v81Var.getParentActivity(), 0, v81Var.resourceProvider);
                    alertDialog$Builder.f21168a.O = "Force performance class";
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
                    alertDialog$Builder.f(new CharSequence[]{replaceTags, replaceTags2, AndroidUtilities.replaceTags(str5.concat(str8))}, new xy0(measureDevicePerformanceClass, 1));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    alertDialog$Builder.o();
                } else if (i10 == 22) {
                    SharedConfig.toggleRoundCamera();
                } else if (i10 == 23) {
                    boolean q10 = qh.v0.q(v81Var.getParentActivity());
                    MessagesController.getGlobalMainSettings().edit().putBoolean("dual_available", !q10).apply();
                    Activity parentActivity3 = v81Var.getParentActivity();
                    if (!q10) {
                        i11 = R.string.DebugMenuDualOnToast;
                    } else {
                        i11 = R.string.DebugMenuDualOffToast;
                    }
                    Toast.makeText(parentActivity3, LocaleController.getString(i11), 0).show();
                } else if (i10 == 24) {
                    SharedConfig.toggleSurfaceInStories();
                    while (i13 < v81Var.getParentLayout().getFragmentStack().size()) {
                        ((org.telegram.ui.ActionBar.p2) v81Var.getParentLayout().getFragmentStack().get(i13)).clearSheets();
                        i13++;
                    }
                } else if (i10 == 25) {
                    SharedConfig.togglePhotoViewerBlur();
                } else if (i10 == 26) {
                    SharedConfig.togglePaymentByInvoice();
                } else if (i10 == 27) {
                    v81Var.getMediaDataController().loadAttachMenuBots(false, true);
                } else if (i10 == 28) {
                    SharedConfig.toggleUseCamera2(v81Var.currentAccount);
                } else if (i10 == 29) {
                    sh.p.b();
                    sh.q0.c();
                    sh.h0.a();
                    sh.w3.c();
                } else if (i10 == 30) {
                    AuthTokensHelper.clearLogInTokens();
                } else if (i10 == 31) {
                    SharedConfig.toggleUseNewBlur();
                } else if (i10 == 32) {
                    SharedConfig.toggleBrowserAdaptableColors();
                } else if (i10 == 33) {
                    SharedConfig.toggleDebugVideoQualities();
                } else if (i10 == 34) {
                    SharedConfig.toggleUseSystemBoldFont();
                } else if (i10 == 35) {
                    MessagesController.getInstance(v81Var.currentAccount).loadAppConfig(true);
                } else if (i10 == 36) {
                    SharedConfig.toggleForceForumTabs();
                } else if (i10 == 37) {
                    FileLog.getInstance().dumpMemory(true);
                } else if (i10 == 38) {
                    SharedConfig.toggleFastWallpaperDisabled();
                } else if (i10 == 39) {
                    SharedConfig.toggleFrameMetricsEnabled();
                    LaunchActivity launchActivity = LaunchActivity.D1;
                    if (launchActivity != null) {
                        launchActivity.B();
                    }
                } else if (i10 == 40) {
                    SharedPreferences.Editor edit3 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit();
                    boolean z4 = !SharedConfig.shadowsInSections;
                    SharedConfig.shadowsInSections = z4;
                    edit3.putBoolean("shadowsInSections", z4).apply();
                } else if (i10 == 41) {
                    SharedPreferences.Editor edit4 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit();
                    boolean z10 = !SharedConfig.debugViewMetrics;
                    SharedConfig.debugViewMetrics = z10;
                    edit4.putBoolean("debugViewMetrics", z10).apply();
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void d0(v81 v81Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            v81Var.v = fileLocation;
            v81Var.f42052w = photoSize2.location;
            v81Var.C.h(ImageLocation.getForLocal(fileLocation), "90_90", v81Var.B, null);
            v81Var.n0(true, false);
        } else if (v81Var.v == null) {
            return;
        } else {
            TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
            if (inputFile != null) {
                tL_photos_uploadProfilePhoto.file = inputFile;
                tL_photos_uploadProfilePhoto.flags |= 1;
            }
            if (inputFile2 != null) {
                tL_photos_uploadProfilePhoto.video = inputFile2;
                int i10 = tL_photos_uploadProfilePhoto.flags;
                tL_photos_uploadProfilePhoto.video_start_ts = d;
                tL_photos_uploadProfilePhoto.flags = i10 | 6;
            }
            if (videoSize != null) {
                tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
                tL_photos_uploadProfilePhoto.flags |= 16;
            }
            v81Var.R = v81Var.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new tb0(22, v81Var, str));
        }
        v81Var.actionBar.n().requestLayout();
    }

    public static void e0(v81 v81Var, org.telegram.ui.Components.h51 h51Var) {
        Object obj = h51Var.G;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) obj;
            if (!tL_attachMenuBot.inactive && !tL_attachMenuBot.side_menu_disclaimer_needed) {
                LaunchActivity.C0(LaunchActivity.D1, v81Var.currentAccount, tL_attachMenuBot, null, true);
            } else {
                bj1.a(v81Var.getParentActivity(), new oh.a2(8, v81Var, tL_attachMenuBot), null);
            }
        } else if (h51Var.G(p81.class)) {
            int i10 = h51Var.f27388z;
            LaunchActivity launchActivity = LaunchActivity.D1;
            if (launchActivity != null) {
                launchActivity.K0(i10);
            }
        } else if (h51Var.G(org.telegram.ui.Cells.u6.class)) {
            Object obj2 = h51Var.G;
            if (obj2 instanceof w01) {
                w01 w01Var = (w01) obj2;
                org.telegram.ui.ActionBar.f5 parentLayout = v81Var.getParentLayout();
                w01Var.f42241b.run();
                AndroidUtilities.scrollToFragmentRow(parentLayout, w01Var.f42242c);
            } else if (obj2 instanceof MessagesController.FaqSearchResult) {
                NotificationCenter.getInstance(v81Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.openArticle, v81Var.h.B, ((MessagesController.FaqSearchResult) obj2).url);
            }
            Object obj3 = h51Var.G;
            if (obj3 != null) {
                v81Var.h.E(obj3);
            }
        } else {
            switch (h51Var.d) {
                case 1:
                    v81Var.l0(new UserInfoActivity());
                    return;
                case 2:
                    v81Var.l0(new ThemeActivity(0));
                    return;
                case 3:
                    v81Var.l0(new PrivacySettingsActivity());
                    return;
                case 4:
                case 14:
                default:
                    return;
                case 5:
                    v81Var.l0(new NotificationsSettingsActivity());
                    return;
                case 6:
                    v81Var.l0(new DataSettingsActivity());
                    return;
                case 7:
                    v81Var.l0(new FiltersSetupActivity());
                    return;
                case 8:
                    v81Var.l0(new SessionsActivity(0));
                    return;
                case 9:
                    v81Var.l0(new fc0());
                    return;
                case 10:
                    v81Var.l0(new LanguageSelectActivity());
                    return;
                case 11:
                    v81Var.l0(new PremiumPreviewFragment(0, "settings"));
                    return;
                case 12:
                    v81Var.l0(new mh.ja());
                    return;
                case 13:
                    v81Var.l0(new rh.g());
                    return;
                case 15:
                    v81Var.l0(new PremiumPreviewFragment(1, "settings"));
                    return;
                case 16:
                    hg.v2.e0(0, BirthdayController.getInstance(UserConfig.selectedAccount).getState());
                    return;
                case 17:
                    v81Var.showDialog(org.telegram.ui.Components.z4.U(v81Var, v81Var.resourceProvider));
                    return;
                case 18:
                    af.g.s(v81Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                    return;
                case 19:
                    af.g.s(v81Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                    return;
                case 20:
                    ProfileActivity.H4(v81Var.getParentActivity(), false);
                    return;
                case 21:
                    ProfileActivity.H4(v81Var.getParentActivity(), true);
                    return;
                case 22:
                    FileLog.cleanupLogs();
                    return;
                case 23:
                    if (MessagesController.getInstance(v81Var.currentAccount).isFrozen()) {
                        c.b(v81Var.currentAccount);
                        return;
                    } else {
                        af.g.s(v81Var.getParentActivity(), LocaleController.getString(R.string.TelegramFeaturesUrl));
                        return;
                    }
            }
        }
    }

    public static void f0(v81 v81Var, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(v81Var.currentAccount).getInputUser(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(v81Var.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new tb0(23, v81Var, tL_attachMenuBot), 66);
    }

    public static void k0(String str, StringBuilder sb) {
        String[] supportedTypes;
        ArrayList arrayList;
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                int codecCount = MediaCodecList.getCodecCount();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (int i10 = 0; i10 < codecCount; i10++) {
                    MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i10);
                    if (codecInfoAt != null && (supportedTypes = codecInfoAt.getSupportedTypes()) != null) {
                        int i11 = 0;
                        while (true) {
                            if (i11 >= supportedTypes.length) {
                                break;
                            } else if (supportedTypes[i11].equals(str)) {
                                if (codecInfoAt.isEncoder()) {
                                    arrayList = arrayList3;
                                } else {
                                    arrayList = arrayList2;
                                }
                                arrayList.add(Integer.valueOf(i10));
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                if (!arrayList2.isEmpty() || !arrayList3.isEmpty()) {
                    sb.append("\n");
                    sb.append(arrayList2.size());
                    sb.append("+");
                    sb.append(arrayList3.size());
                    sb.append(" ");
                    sb.append(str.substring(6));
                    sb.append(" codecs:\n");
                    for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                        if (i12 > 0) {
                            sb.append("\n");
                        }
                        MediaCodecInfo codecInfoAt2 = MediaCodecList.getCodecInfoAt(((Integer) arrayList2.get(i12)).intValue());
                        sb.append("{d} ");
                        sb.append(codecInfoAt2.getName());
                        sb.append(" (");
                        if (Build.VERSION.SDK_INT >= 29) {
                            if (codecInfoAt2.isHardwareAccelerated()) {
                                sb.append("gpu");
                            }
                            if (codecInfoAt2.isSoftwareOnly()) {
                                sb.append("cpu");
                            }
                            if (codecInfoAt2.isVendor()) {
                                sb.append(", v");
                            }
                        }
                        MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfoAt2.getCapabilitiesForType(str);
                        sb.append("; mi=");
                        sb.append(capabilitiesForType.getMaxSupportedInstances());
                        sb.append(")");
                    }
                    for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                        if (i13 > 0 || !arrayList2.isEmpty()) {
                            sb.append("\n");
                        }
                        MediaCodecInfo codecInfoAt3 = MediaCodecList.getCodecInfoAt(((Integer) arrayList3.get(i13)).intValue());
                        sb.append("{e} ");
                        sb.append(codecInfoAt3.getName());
                        sb.append(" (");
                        if (Build.VERSION.SDK_INT >= 29) {
                            if (codecInfoAt3.isHardwareAccelerated()) {
                                sb.append("gpu");
                            }
                            if (codecInfoAt3.isSoftwareOnly()) {
                                sb.append("cpu");
                            }
                            if (codecInfoAt3.isVendor()) {
                                sb.append(", v");
                            }
                        }
                        MediaCodecInfo.CodecCapabilities capabilitiesForType2 = codecInfoAt3.getCapabilitiesForType(str);
                        sb.append("; mi=");
                        sb.append(capabilitiesForType2.getMaxSupportedInstances());
                        sb.append(")");
                    }
                    sb.append("\n");
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void D(float f10) {
        org.telegram.ui.Cells.y3 y3Var = this.f42051s;
        if (y3Var == null) {
            return;
        }
        y3Var.setProgress(f10);
    }

    @Override
    public final void K(boolean z4, boolean z10) {
        org.telegram.ui.Cells.y3 y3Var = this.f42051s;
        if (y3Var == null) {
            return;
        }
        y3Var.setProgress(0.0f);
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        if (i10 == 0) {
            j0();
        }
    }

    @Override
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z4, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new cd(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 5));
    }

    @Override
    public final View createView(Context context) {
        this.f42045b = new lh.j4(this, context, 8);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.K();
        this.actionBar.setTitle(LocaleController.getString(R.string.Settings));
        this.actionBar.setActionBarMenuOnItemClick(new ll0(this, 17));
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(true);
        this.actionBar.setBackgroundColor(0);
        this.actionBar.setBackground(null);
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        org.telegram.ui.ActionBar.w0 c3 = n10.c(0, R.drawable.outline_header_search, this.resourceProvider);
        c3.F();
        c3.E = new fb(this, 16);
        this.f42047e = c3;
        c3.setSearchFieldHint(LocaleController.getString(R.string.Search));
        org.telegram.ui.ActionBar.w0 a2 = n10.a(1, R.drawable.ic_ab_other);
        this.f42048f = a2;
        a2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.f42048f.e(2, R.drawable.msg_leave, LocaleController.getString(R.string.LogOut));
        n81 n81Var = new n81(this, this, context);
        this.h = n81Var;
        n81Var.G();
        org.telegram.ui.Components.h61 h61Var = new org.telegram.ui.Components.h61(this, new d5(this, 26), new m81(this), new m81(this));
        this.f42046c = h61Var;
        h61Var.V2.f32651r = false;
        h61Var.o1();
        this.f42046c.setPadding(0, AndroidUtilities.dp(12.0f) + AndroidUtilities.statusBarHeight, 0, AndroidUtilities.navigationBarHeight + this.Q);
        this.f42046c.setClipToPadding(false);
        this.f42046c.j(new l3(this, 28));
        org.telegram.ui.Components.h61 h61Var2 = this.f42046c;
        lh.j4 j4Var = this.f42045b;
        Objects.requireNonNull(h61Var2);
        this.V = new og.k(h61Var2, j4Var, new x8(h61Var2, 0));
        this.f42046c.C0(new j81(this, 2));
        this.f42045b.addView(this.f42046c, k7.c6.e(-1, -1, 119));
        fg.i0 i0Var = new fg.i0(this, context);
        this.d = i0Var;
        this.f42045b.addView(i0Var, k7.c6.e(-1, 200, 48));
        this.f42045b.addView(this.actionBar, k7.c6.e(-1, -2, 55));
        org.telegram.ui.Components.y40 y40Var = new org.telegram.ui.Components.y40(0, true, true);
        this.f42049n = y40Var;
        y40Var.E = true;
        y40Var.f33309a = this;
        y40Var.f33310b = this;
        this.f42053x = new FrameLayout(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f42054y = frameLayout;
        this.f42053x.addView(frameLayout, k7.c6.d(120, 120.0f, 49, 0.0f, 11.0f, 0.0f, 0.0f));
        this.f42054y.setOnClickListener(new k81(this, 5));
        k7.e6.a(this.f42054y);
        this.B = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.C = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(90.0f));
        this.f42054y.addView(this.C, k7.c6.d(90, 90.0f, 49, 0.0f, 15.0f, 0.0f, 0.0f));
        org.telegram.ui.Cells.y3 y3Var = new org.telegram.ui.Cells.y3(this, context);
        this.f42051s = y3Var;
        y3Var.setSize(AndroidUtilities.dp(26.0f));
        this.f42051s.setProgressColor(-1);
        this.f42051s.setNoProgress(false);
        this.f42054y.addView(this.f42051s, k7.c6.d(90, 90.0f, 49, 0.0f, 15.0f, 0.0f, 0.0f));
        n0(false, false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.D = frameLayout2;
        frameLayout2.setBackground(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(32.0f), getThemedColor(org.telegram.ui.ActionBar.k6.f21607a7)));
        this.D.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.E = frameLayout3;
        frameLayout3.setBackground(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(30.0f), getThemedColor(org.telegram.ui.ActionBar.k6.Oh)));
        ImageView imageView = new ImageView(context);
        this.F = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.F.setImageResource(R.drawable.filled_premium_camera);
        this.E.addView(this.F, k7.c6.e(22, 22, 17));
        this.D.addView(this.E, k7.c6.c(30.0f, 30));
        this.f42054y.addView(this.D, k7.c6.d(34, 34.0f, 49, 32.0f, 75.0f, 0.0f, 0.0f));
        k7.e6.a(this.D);
        TextView textView = new TextView(context);
        this.G = textView;
        textView.setTextSize(1, 22.0f);
        this.G.setTypeface(AndroidUtilities.bold());
        this.G.setGravity(17);
        this.G.setSingleLine();
        TextView textView2 = this.G;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        TextView h = yh.h(this.f42053x, this.G, k7.c6.d(-1, -2.0f, 49, 16.0f, 126.33299f, 16.0f, 0.0f), context);
        this.H = h;
        h.setTextSize(1, 13.0f);
        this.H.setGravity(17);
        this.H.setSingleLine();
        this.H.setEllipsize(truncateAt);
        TextView h9 = yh.h(this.f42053x, this.H, k7.c6.d(-1, -2.0f, 49, 0.0f, 156.0f, 0.0f, 0.0f), context);
        this.I = h9;
        h9.setTextSize(1, 14.0f);
        this.I.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.B6));
        this.I.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f));
        this.I.setGravity(17);
        this.I.setBackground(org.telegram.ui.ActionBar.k6.f0(getThemedColor(org.telegram.ui.ActionBar.k6.f21752i6), 2, -1));
        this.I.setOnClickListener(new k81(this, 6));
        this.K = new View(context);
        o0(true, false);
        this.f42046c.V2.N(false);
        m0(getUserConfig().getCurrentUser());
        p0();
        j0();
        lh.j4 j4Var2 = this.f42045b;
        m81 m81Var = new m81(this);
        WeakHashMap weakHashMap = r0.j0.f46469a;
        r0.b0.j(j4Var2, m81Var);
        lh.j4 j4Var3 = this.f42045b;
        this.fragmentView = j4Var3;
        return j4Var3;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.h61 h61Var;
        if (i10 == NotificationCenter.starBalanceUpdated) {
            m0(getUserConfig().getCurrentUser());
            org.telegram.ui.Components.h61 h61Var2 = this.f42046c;
            if (h61Var2 != null) {
                h61Var2.V2.N(true);
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            m0(getUserConfig().getCurrentUser());
        } else if (i10 == NotificationCenter.newSuggestionsAvailable && (h61Var = this.f42046c) != null) {
            h61Var.V2.N(true);
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
    public final qu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    public final void i0() {
        og.e eVar;
        float f10;
        int i10;
        if (Build.VERSION.SDK_INT >= 31 && (eVar = this.S) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            int measuredHeight = (this.fragmentView.getMeasuredHeight() - this.P) - AndroidUtilities.dp(8.0f);
            this.X.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp);
            RectF rectF = this.Y;
            rectF.set(0.0f, measuredHeight - AndroidUtilities.dp(56.0f), this.fragmentView.getMeasuredWidth(), measuredHeight);
            if (LiteMode.isEnabled(262144)) {
                f10 = 0.0f;
            } else {
                f10 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(0.0f, f10);
            if (this.J) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            eVar.g(i10, this.W);
            eVar.e(this.V, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !this.f42044a.f50542f;
    }

    public final void j0() {
        float f10;
        org.telegram.ui.ActionBar.w0 w0Var = this.f42048f;
        xd.a aVar = this.f42044a;
        org.telegram.ui.Components.a20.d(w0Var, 1.0f - aVar.f50541e);
        ImageView backButton = this.actionBar.getBackButton();
        if (this.J) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        org.telegram.ui.Components.a20.d(backButton, AndroidUtilities.lerp(f10, 1.0f, aVar.f50541e));
    }

    public final void l0(org.telegram.ui.ActionBar.p2 p2Var) {
        LaunchActivity launchActivity;
        ActionBarLayout actionBarLayout;
        if (AndroidUtilities.isTablet() && (launchActivity = LaunchActivity.D1) != null && (actionBarLayout = launchActivity.f34164p0) != null) {
            if (!actionBarLayout.getFragmentStack().isEmpty()) {
                while (actionBarLayout.getFragmentStack().size() - 1 > 0) {
                    actionBarLayout.a0((org.telegram.ui.ActionBar.p2) actionBarLayout.getFragmentStack().get(0), false);
                }
                actionBarLayout.l(false, false);
            }
            org.telegram.ui.ActionBar.d5 d5Var = new org.telegram.ui.ActionBar.d5(p2Var);
            d5Var.f21280c = true;
            d5Var.f21283g = true;
            actionBarLayout.R(d5Var);
            return;
        }
        presentFragment(p2Var);
    }

    public final void m0(TLRPC.User user) {
        String str;
        String str2;
        if (this.C == null || this.R != -1) {
            return;
        }
        this.B.r(user);
        this.C.e(user, this.B);
        this.G.setText(UserObject.getUserName(user));
        StringBuilder sb = new StringBuilder();
        if (user != null) {
            sb.append(se.b.c().b("+" + user.phone));
        }
        String publicUsername = UserObject.getPublicUsername(user);
        if (publicUsername != null) {
            sb.append(" • @");
            sb.append(publicUsername);
        }
        this.H.setText(sb);
        TextView textView = this.I;
        try {
            PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
            int i10 = packageInfo.versionCode;
            int i11 = i10 / 10;
            int i12 = i10 % 10;
            if (i12 != 1 && i12 != 2) {
                if (ApplicationLoader.isStandaloneBuild()) {
                    str2 = "direct " + Build.CPU_ABI + " " + Build.CPU_ABI2;
                } else {
                    str2 = "universal " + Build.CPU_ABI + " " + Build.CPU_ABI2;
                }
            } else {
                str2 = "store bundled " + Build.CPU_ABI + " " + Build.CPU_ABI2;
            }
            int i13 = R.string.TelegramVersion;
            Locale locale = Locale.US;
            str = LocaleController.formatString(i13, "v" + packageInfo.versionName + " (" + i11 + ")\n" + str2);
        } catch (Exception e6) {
            FileLog.e(e6);
            str = null;
        }
        textView.setText(str);
    }

    public final void n0(boolean z4, boolean z10) {
        if (this.f42051s == null) {
            return;
        }
        AnimatorSet animatorSet = this.f42050r;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f42050r = null;
        }
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f42050r = animatorSet2;
            if (z4) {
                this.f42051s.setVisibility(0);
                this.f42050r.playTogether(ObjectAnimator.ofFloat(this.f42051s, View.ALPHA, 1.0f));
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f42051s, View.ALPHA, 0.0f));
            }
            this.f42050r.setDuration(180L);
            this.f42050r.addListener(new org.telegram.ui.Components.x20(29, this, z4));
            this.f42050r.start();
        } else if (z4) {
            this.f42051s.setAlpha(1.0f);
            this.f42051s.setVisibility(0);
        } else {
            this.f42051s.setAlpha(0.0f);
            this.f42051s.setVisibility(4);
        }
    }

    public final void o0(boolean r5, boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.v81.o0(boolean, boolean):void");
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar.f21548k0) {
            if (z4) {
                kVar.h(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z4);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.starBalanceUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.newSuggestionsAvailable);
        Bundle bundle = this.arguments;
        int i10 = 0;
        if (bundle != null) {
            this.J = bundle.getBoolean("hasMainTabs", false);
        }
        if (this.J) {
            i10 = AndroidUtilities.dp(72.0f);
        }
        this.Q = i10;
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.starBalanceUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.newSuggestionsAvailable);
    }

    public final void p0() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        kVar.setTitleColor(getThemedColor(i10));
        this.actionBar.C(getThemedColor(i10), false);
        this.f42045b.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21607a7));
        this.G.setTextColor(getThemedColor(i10));
        this.H.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.f22038y6));
        this.f42047e.N();
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f21661d6);
        this.K.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.k6.l1(0.0f, themedColor), themedColor}));
        this.d.invalidate();
        this.f42046c.invalidate();
    }

    @Override
    public final void s() {
        this.f42046c.x0(0);
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final tg.d y() {
        return this.U;
    }

    public v81(Bundle bundle) {
        super(bundle);
        this.f42044a = new xd.a(0, this, org.telegram.ui.Components.pr.h, 350L, false);
        this.L = 0;
        this.O = new ArrayList();
        this.R = -1;
        ArrayList arrayList = new ArrayList();
        this.W = arrayList;
        RectF rectF = new RectF();
        this.X = rectF;
        RectF rectF2 = new RectF();
        this.Y = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        if (Build.VERSION.SDK_INT >= 31) {
            this.S = new og.e(false);
            this.T = new tg.d(null);
            this.U = new tg.d(null);
            return;
        }
        this.S = null;
        this.T = null;
        this.U = null;
    }

    @Override
    public final void P() {
    }

    @Override
    public final void z(float f10, int i10) {
    }
}
