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
public final class x71 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.d50, mg0, ne.d {
    public org.telegram.ui.Components.h9 E;
    public org.telegram.ui.Components.w9 F;
    public FrameLayout G;
    public FrameLayout H;
    public ImageView I;
    public TextView J;
    public TextView K;
    public TextView L;
    public boolean M;
    public View N;
    public int O;
    public boolean P;
    public ValueAnimator Q;
    public final ArrayList R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public final bh.f W;
    public final gh.d X;
    public final gh.d Y;
    public bh.l Z;
    public final ne.b f43114a;
    public final ArrayList f43115a0;
    public y8 f43116b;
    public final RectF f43117b0;
    public org.telegram.ui.Components.b71 f43118c;
    public final RectF f43119c0;
    public ei.g6 d;
    public org.telegram.ui.ActionBar.u0 e;
    public org.telegram.ui.ActionBar.u0 f43120f;
    public p71 h;
    public org.telegram.ui.Components.e50 f43121n;
    public AnimatorSet f43122r;
    public org.telegram.ui.Cells.y3 f43123s;
    public TLRPC.FileLocation v;
    public TLRPC.FileLocation f43124w;
    public FrameLayout f43125x;
    public FrameLayout f43126y;

    public x71() {
        this(null);
    }

    public static boolean U(x71 x71Var, org.telegram.ui.Components.g61 g61Var, View view) {
        String str;
        Object obj = g61Var.G;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            gi.d3.j(x71Var.currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, new j71(x71Var, 0));
            return true;
        }
        if (g61Var.G(org.telegram.ui.Cells.u6.class)) {
            Object obj2 = g61Var.G;
            if (obj2 instanceof l01) {
                str = ((l01) obj2).h;
            } else if (obj2 instanceof MessagesController.FaqSearchResult) {
                str = ((MessagesController.FaqSearchResult) obj2).url;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                org.telegram.ui.Components.i80 H = org.telegram.ui.Components.i80.H(x71Var, view);
                H.c(R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new k71(0, x71Var, str), false);
                H.W(x71Var.f43118c.V0(view, false));
                H.Z();
                return true;
            }
        }
        return false;
    }

    public static void V(x71 x71Var) {
        boolean z10;
        TLRPC.User user = MessagesController.getInstance(x71Var.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(x71Var.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(x71Var.currentAccount).getCurrentUser();
        }
        if (user == null) {
            return;
        }
        org.telegram.ui.Components.e50 e50Var = x71Var.f43121n;
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null && userProfilePhoto.photo_big != null && !(userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) {
            z10 = true;
        } else {
            z10 = false;
        }
        e50Var.n(z10, new j71(x71Var, 4), new ei.e1(6), 0);
    }

    public static void W(x71 x71Var, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.G0(LaunchActivity.H1, x71Var.currentAccount, tL_attachMenuBot, null, true);
        MediaDataController.getInstance(x71Var.currentAccount).updateAttachMenuBotsInCache();
    }

    public static void X(x71 x71Var, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(x71Var.currentAccount).getInputUser(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(x71Var.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new m71(0, x71Var, tL_attachMenuBot), 66);
    }

    public static void Z(org.telegram.ui.x71 r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.x71.Z(org.telegram.ui.x71):void");
    }

    public static void a0(x71 x71Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        x71Var.actionBar.getTitlesContainer().setAlpha(floatValue);
        x71Var.d.setAlpha(floatValue);
    }

    public static void b0(x71 x71Var, ArrayList arrayList) {
        boolean z10;
        SpannableStringBuilder spannableStringBuilder;
        int i10;
        String str;
        int i11;
        String str2;
        org.telegram.ui.ActionBar.p0 p0Var = x71Var.e.F;
        int i12 = 0;
        if (p0Var != null && p0Var.getTag() != null) {
            arrayList.add(org.telegram.ui.Components.g61.C(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
            p71 p71Var = x71Var.h;
            ArrayList arrayList2 = p71Var.d;
            ArrayList arrayList3 = p71Var.v;
            if (p71Var.f39074w) {
                ArrayList arrayList4 = p71Var.f39072r;
                int size = arrayList4.size();
                int i13 = 0;
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList4.get(i14);
                    i14++;
                    int i15 = org.telegram.ui.Cells.u6.f23595a;
                    org.telegram.ui.Components.g61 J = org.telegram.ui.Components.g61.J(org.telegram.ui.Cells.u6.class);
                    J.f26497l = (CharSequence) p71Var.f39071n.get(i13);
                    J.G = (l01) obj;
                    arrayList.add(J);
                    i13++;
                }
                if (!p71Var.f39073s.isEmpty()) {
                    arrayList.add(org.telegram.ui.Components.g61.q(LocaleController.getString(R.string.SettingsFaqSearchTitle)));
                    ArrayList arrayList5 = p71Var.f39073s;
                    int size2 = arrayList5.size();
                    while (i12 < size2) {
                        Object obj2 = arrayList5.get(i12);
                        i12++;
                        int i16 = org.telegram.ui.Cells.u6.f23595a;
                        org.telegram.ui.Components.g61 J2 = org.telegram.ui.Components.g61.J(org.telegram.ui.Cells.u6.class);
                        J2.f26497l = (CharSequence) p71Var.f39071n.get(i13);
                        J2.G = (MessagesController.FaqSearchResult) obj2;
                        arrayList.add(J2);
                        i13++;
                    }
                    return;
                }
                return;
            }
            if (!arrayList3.isEmpty()) {
                arrayList.add(org.telegram.ui.Components.g61.q(LocaleController.getString(R.string.SettingsRecent)));
                int size3 = arrayList3.size();
                int i17 = 0;
                while (i17 < size3) {
                    Object obj3 = arrayList3.get(i17);
                    i17++;
                    if (obj3 instanceof l01) {
                        l01 l01Var = (l01) obj3;
                        String str3 = l01Var.f38706a;
                        int i18 = org.telegram.ui.Cells.u6.f23595a;
                        org.telegram.ui.Components.g61 J3 = org.telegram.ui.Components.g61.J(org.telegram.ui.Cells.u6.class);
                        J3.f26497l = str3;
                        J3.G = l01Var;
                        arrayList.add(J3);
                    } else if (obj3 instanceof MessagesController.FaqSearchResult) {
                        MessagesController.FaqSearchResult faqSearchResult = (MessagesController.FaqSearchResult) obj3;
                        String str4 = faqSearchResult.title;
                        int i19 = org.telegram.ui.Cells.u6.f23595a;
                        org.telegram.ui.Components.g61 J4 = org.telegram.ui.Components.g61.J(org.telegram.ui.Cells.u6.class);
                        J4.f26497l = str4;
                        J4.G = faqSearchResult;
                        arrayList.add(J4);
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(org.telegram.ui.Components.g61.q(LocaleController.getString(R.string.SettingsFaqSearchTitle)));
                int size4 = arrayList2.size();
                while (i12 < size4) {
                    Object obj4 = arrayList2.get(i12);
                    i12++;
                    MessagesController.FaqSearchResult faqSearchResult2 = (MessagesController.FaqSearchResult) obj4;
                    String str5 = faqSearchResult2.title;
                    int i20 = org.telegram.ui.Cells.u6.f23595a;
                    org.telegram.ui.Components.g61 J5 = org.telegram.ui.Components.g61.J(org.telegram.ui.Cells.u6.class);
                    J5.f26497l = str5;
                    J5.G = faqSearchResult2;
                    arrayList.add(J5);
                }
                return;
            }
            return;
        }
        FrameLayout frameLayout = x71Var.f43125x;
        org.telegram.ui.Components.g61 g61Var = new org.telegram.ui.Components.g61(-4);
        g61Var.f26491c = frameLayout;
        g61Var.f26510z = 188;
        arrayList.add(g61Var);
        x71Var.R.clear();
        for (int i21 = 0; i21 < 4; i21++) {
            if (UserConfig.getInstance(i21).isClientActivated() && x71Var.currentAccount != i21) {
                x71Var.R.add(Integer.valueOf(i21));
            }
        }
        Collections.sort(x71Var.R, new jg0(6));
        Set<String> set = x71Var.getMessagesController().pendingSuggestions;
        if (set.contains("PREMIUM_GRACE")) {
            arrayList.add(v71.a(LocaleController.getString(R.string.GraceSuggestionTitle), LocaleController.getString(R.string.GraceSuggestionMessage), null, null, LocaleController.getString(R.string.GraceSuggestionButton), new l71(x71Var, 0)));
            arrayList.add(org.telegram.ui.Components.g61.B(null));
        } else if (set.contains("VALIDATE_PHONE_NUMBER") && x71Var.getUserConfig().getCurrentUser() != null) {
            arrayList.add(v71.a(LocaleController.formatString(R.string.CheckPhoneNumber, org.telegram.messenger.kk.g(new StringBuilder("+"), x71Var.getUserConfig().getCurrentUser().phone, jf.b.c())), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CheckPhoneNumberInfo), new j71(x71Var, 1)), LocaleController.getString(R.string.CheckPhoneNumberNo), new l71(x71Var, 1), ai.l7.I2(LocaleController.getString(R.string.CheckPhoneNumberYes2)), new l71(x71Var, 2)));
            arrayList.add(org.telegram.ui.Components.g61.B(null));
        } else if (set.contains("VALIDATE_PASSWORD")) {
            arrayList.add(v71.a(LocaleController.getString(R.string.YourPasswordHeader), LocaleController.getString(R.string.YourPasswordRemember), LocaleController.getString(R.string.YourPasswordRememberNo), new l71(x71Var, 3), LocaleController.getString(R.string.YourPasswordRememberYes), new l71(x71Var, 4)));
            arrayList.add(org.telegram.ui.Components.g61.B(null));
        }
        if (x71Var.R.size() > 0) {
            i2.e.p(R.string.SettingsAccounts, arrayList);
            for (int i22 = 0; i22 < x71Var.R.size(); i22++) {
                int intValue = ((Integer) x71Var.R.get(i22)).intValue();
                int i23 = r71.f41078a;
                org.telegram.ui.Components.g61 J6 = org.telegram.ui.Components.g61.J(r71.class);
                J6.d = i22;
                J6.f26510z = intValue;
                arrayList.add(J6);
            }
            arrayList.add(org.telegram.ui.Components.g61.B(null));
        }
        if (x71Var.getConnectionsManager().getCurrentTime() - 1791538462 < 2419200) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && x71Var.getMessagesController().config.walletAvailable.get()) {
            org.telegram.ui.Wallet.m0 w9 = org.telegram.ui.Wallet.m0.w(x71Var.currentAccount);
            if (org.telegram.ui.ActionBar.h6.I.q()) {
                i11 = R.drawable.settings_wallet_dark;
            } else {
                i11 = R.drawable.settings_wallet;
            }
            int i24 = i11;
            CharSequence string = LocaleController.getString(R.string.WalletAttachMoney);
            int i25 = org.telegram.ui.Cells.q8.Q;
            if (ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime() - 1790679020 <= 2419200) {
                string = org.telegram.ui.Cells.q8.a(string);
            }
            CharSequence charSequence = string;
            if (w9.u() > 0) {
                str2 = org.telegram.ui.Wallet.m0.n(w9.u(), false);
            } else {
                str2 = null;
            }
            arrayList.add(t71.a(25, 0, 0, i24, charSequence, null, str2));
            arrayList.add(org.telegram.ui.Components.g61.B(null));
        }
        arrayList.add(t71.a(1, -14899731, -15431455, R.drawable.settings_account, LocaleController.getString(R.string.SettingsAccount), LocaleController.getString(R.string.SettingsAccountInfo), null));
        arrayList.add(t71.a(2, -1007845, -1996271, R.drawable.settings_chat, LocaleController.getString(R.string.SettingsChat), LocaleController.getString(R.string.SettingsChatInfo), null));
        arrayList.add(t71.a(3, -11154873, -14175180, R.drawable.settings_privacy, LocaleController.getString(R.string.SettingsPrivacySecurity), LocaleController.getString(R.string.SettingsPrivacySecurityInfo), null));
        arrayList.add(t71.a(5, -765355, -2148011, R.drawable.settings_sounds, LocaleController.getString(R.string.SettingsNotifications), LocaleController.getString(R.string.SettingsNotificationsInfo), null));
        arrayList.add(t71.a(6, -11565578, -13276952, R.drawable.settings_data, LocaleController.getString(R.string.SettingsData), LocaleController.getString(R.string.SettingsDataInfo), null));
        arrayList.add(t71.a(7, -14899731, -15497247, R.drawable.settings_folders, LocaleController.getString(R.string.SettingsFolders), LocaleController.getString(R.string.SettingsFoldersInfo), null));
        arrayList.add(t71.a(8, -13451058, -14836538, R.drawable.settings_devices, LocaleController.getString(R.string.SettingsDevices), LocaleController.getString(R.string.SettingsDevicesInfo), null));
        arrayList.add(t71.a(9, -881871, -1940716, R.drawable.settings_power, LocaleController.getString(R.string.SettingsPowerSaving), LocaleController.getString(R.string.SettingsPowerSavingInfo), null));
        arrayList.add(t71.a(10, -3903756, -6335009, R.drawable.settings_language, LocaleController.getString(R.string.SettingsLanguage), LocaleController.getCurrentLanguageName(), null));
        arrayList.add(org.telegram.ui.Components.g61.B(null));
        if (!z10 && x71Var.getMessagesController().config.walletAvailable.get()) {
            org.telegram.ui.Wallet.m0 w10 = org.telegram.ui.Wallet.m0.w(x71Var.currentAccount);
            if (org.telegram.ui.ActionBar.h6.I.q()) {
                i10 = R.drawable.settings_wallet_dark;
            } else {
                i10 = R.drawable.settings_wallet;
            }
            int i26 = i10;
            CharSequence string2 = LocaleController.getString(R.string.WalletAttachMoney);
            int i27 = org.telegram.ui.Cells.q8.Q;
            if (ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime() - 1790679020 <= 2419200) {
                string2 = org.telegram.ui.Cells.q8.a(string2);
            }
            CharSequence charSequence2 = string2;
            if (w10.u() > 0) {
                str = org.telegram.ui.Wallet.m0.n(w10.u(), false);
            } else {
                str = null;
            }
            arrayList.add(t71.a(25, 0, 0, i26, charSequence2, null, str));
            arrayList.add(org.telegram.ui.Components.g61.B(null));
        }
        if (!x71Var.getMessagesController().premiumFeaturesBlocked()) {
            arrayList.add(t71.a(11, -4826625, -10388225, R.drawable.settings_premium, LocaleController.getString(R.string.TelegramPremium), null, null));
        }
        CharSequence charSequence3 = "";
        if (x71Var.getMessagesController().starsPurchaseAvailable()) {
            ai.ga y3 = ai.ga.y(x71Var.currentAccount, false);
            long j10 = y3.p().amount;
            int i28 = R.drawable.settings_stars;
            String string3 = LocaleController.getString(R.string.TelegramStars);
            if (!y3.e || j10 <= 0) {
                spannableStringBuilder = "";
            } else {
                spannableStringBuilder = ai.md.K0(y3.p(), 0.85f, ' ');
            }
            arrayList.add(t71.a(12, -1071598, -1608430, i28, string3, null, spannableStringBuilder));
        }
        ai.ga.y(x71Var.currentAccount, true).p();
        if (ApplicationLoader.isBetaBuild() || ApplicationLoader.isStandaloneBuild() || ApplicationLoader.isHuaweiStoreBuild() || (ai.ga.y(x71Var.currentAccount, true).e && (ai.ga.y(x71Var.currentAccount, true).O(0) || ai.ga.y(x71Var.currentAccount, true).p().positive()))) {
            ai.ga y10 = ai.ga.y(x71Var.currentAccount, true);
            long j11 = y10.p().amount;
            int i29 = R.drawable.filled_gram_earnings;
            String string4 = LocaleController.getString(R.string.GramEarnings);
            if (y10.e && j11 > 0) {
                charSequence3 = ai.md.K0(y10.p(), 0.85f, ' ');
            }
            arrayList.add(t71.a(13, -14965523, -15431455, i29, string4, null, charSequence3));
        }
        if (!x71Var.getMessagesController().premiumFeaturesBlocked()) {
            arrayList.add(t71.a(15, -765355, -2148011, R.drawable.settings_business, LocaleController.getString(R.string.TelegramBusiness), null, null));
        }
        if (!x71Var.getMessagesController().premiumPurchaseBlocked()) {
            arrayList.add(t71.a(16, -816335, -1940716, R.drawable.settings_gift, LocaleController.getString(R.string.SendAGift), null, null));
        }
        if (((org.telegram.ui.Components.g61) i2.e.h(1, arrayList)).f44288a != 7) {
            arrayList.add(org.telegram.ui.Components.g61.B(null));
        }
        i2.e.p(R.string.SettingsHelp, arrayList);
        arrayList.add(t71.a(17, -1007845, -1996271, R.drawable.settings_ask, LocaleController.getString(R.string.AskAQuestion), null, null));
        arrayList.add(t71.a(18, -14965523, -15431455, R.drawable.settings_faq, LocaleController.getString(R.string.TelegramFAQ), null, null));
        arrayList.add(t71.a(23, -3903756, -6335009, R.drawable.settings_features, LocaleController.getString(R.string.TelegramFeatures), null, null));
        arrayList.add(t71.a(19, -11154873, -14175180, R.drawable.settings_policy, LocaleController.getString(R.string.PrivacyPolicy), null, null));
        ti.a aVar = ti.e.f47214a;
        aVar.a();
        if (aVar.d) {
            arrayList.add(org.telegram.ui.Components.g61.B(null));
            arrayList.add(org.telegram.ui.Components.g61.t("Experimental"));
            arrayList.add(t71.a(24, -765355, -2148011, 0, LocaleController.getString(R.string.RoundVideoSettings), null, null));
            arrayList.add(t71.a(26, -11154873, -14175180, 0, LocaleController.getString(R.string.AudioRecorderSettings), null, null));
        }
        if (BuildVars.LOGS_ENABLED || BuildVars.DEBUG_PRIVATE_VERSION) {
            arrayList.add(org.telegram.ui.Components.g61.B(null));
            i2.e.p(R.string.SettingsDebug, arrayList);
            arrayList.add(t71.a(20, -11154873, -14175180, 0, LocaleController.getString(R.string.DebugSendLogs), null, null));
            arrayList.add(t71.a(21, -11154873, -14175180, 0, LocaleController.getString(R.string.DebugSendLastLogs), null, null));
            arrayList.add(t71.a(22, -765355, -2148011, 0, LocaleController.getString(R.string.DebugClearLogs), null, null));
        }
        arrayList.add(org.telegram.ui.Components.g61.l(x71Var.L));
    }

    public static void c0(x71 x71Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        TLRPC.VideoSize closestVideoSizeWithSize;
        x71Var.U = -1;
        if (tL_error == null) {
            TLRPC.User user = x71Var.getMessagesController().getUser(Long.valueOf(x71Var.getUserConfig().getClientUserId()));
            if (user == null) {
                user = x71Var.getUserConfig().getCurrentUser();
                if (user == null) {
                    return;
                }
                x71Var.getMessagesController().putUser(user, false);
            } else {
                x71Var.getUserConfig().setCurrentUser(user);
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
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f20297id;
            if (closestPhotoSizeWithSize != null) {
                tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
            }
            if (closestPhotoSizeWithSize2 != null) {
                tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
            }
            if (closestPhotoSizeWithSize != null && x71Var.v != null) {
                FileLoader.getInstance(x71Var.currentAccount).getPathToAttach(x71Var.v, true).renameTo(FileLoader.getInstance(x71Var.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(x71Var.v.volume_id);
                sb2.append("_");
                String n10 = a1.g.n(x71Var.v.local_id, "@90_90", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(closestPhotoSizeWithSize.location.volume_id);
                sb3.append("_");
                ImageLoader.getInstance().replaceImageInCache(n10, a1.g.n(closestPhotoSizeWithSize.location.local_id, "@90_90", sb3), ImageLocation.getForUserOrChat(x71Var.currentAccount, user, 1), false);
            }
            if (closestVideoSizeWithSize != null && str != null) {
                new File(str).renameTo(FileLoader.getInstance(x71Var.currentAccount).getPathToAttach(closestVideoSizeWithSize, "mp4", true));
            } else if (closestPhotoSizeWithSize2 != null && x71Var.f43124w != null) {
                FileLoader.getInstance(x71Var.currentAccount).getPathToAttach(x71Var.f43124w, true).renameTo(FileLoader.getInstance(x71Var.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
            }
            x71Var.getMessagesController().getDialogPhotos(user.f20420id).addPhotoAtStart(tL_photos_photo.photo);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(user);
            x71Var.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
            TLRPC.UserFull userFull = x71Var.getMessagesController().getUserFull(x71Var.getUserConfig().getClientUserId());
            if (userFull != null) {
                userFull.profile_photo = tL_photos_photo.photo;
                x71Var.getMessagesStorage().updateUserInfo(userFull, false);
            }
            x71Var.m0(user);
        }
        x71Var.v = null;
        x71Var.f43124w = null;
        x71Var.n0(false, true);
        x71Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
        x71Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
        x71Var.getUserConfig().saveConfig(true);
    }

    public static void d0(x71 x71Var, int i10) {
        int i11;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Long l4;
        long j10;
        int i12;
        int i13 = 0;
        if (i10 == 0) {
            x71Var.getUserConfig().syncContacts = true;
            x71Var.getUserConfig().saveConfig(false);
            x71Var.getContactsController().forceImportContacts();
        } else if (i10 == 1) {
            x71Var.getContactsController().loadContacts(false, 0L);
        } else if (i10 == 2) {
            x71Var.getContactsController().resetImportedContacts();
        } else if (i10 == 3) {
            x71Var.getMessagesController().forceResetDialogs();
        } else if (i10 == 4) {
            BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
            ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
            x71Var.f43118c.W2.N(true);
            if (BuildVars.LOGS_ENABLED) {
                i2.e.x(new StringBuilder("app start time = "), ApplicationLoader.startTime);
                try {
                    FileLog.d("buildVersion = " + ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0).versionCode);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        } else if (i10 == 5) {
            SharedConfig.toggleInappCamera();
        } else if (i10 == 6) {
            x71Var.getMessagesStorage().clearSentMedia();
            SharedConfig.setNoSoundHintShowed(false);
            org.telegram.messenger.g0.d(org.telegram.messenger.g0.d(org.telegram.messenger.g0.d(org.telegram.messenger.g0.d(org.telegram.messenger.g0.d(org.telegram.messenger.g0.d(org.telegram.messenger.g0.d(org.telegram.messenger.g0.d(org.telegram.messenger.g0.d(org.telegram.messenger.g0.d(MessagesController.getGlobalMainSettings().edit().remove("archivehint").remove("proximityhint").remove("archivehint_l"), "searchpostsnew", "speedhint", "gifhint", "reminderhint"), "soundHint", "themehint", "bganimationhint", "filterhint"), "n_0", "storyprvhint", "storyhint", "storyhint2"), "storydualhint", "storysvddualhint", "stories_camera", "dualcam"), "dualmatrix", "dual_available", "archivehint", "askNotificationsAfter"), "askNotificationsDuration", "viewoncehint", "voicepausehint", "taptostorysoundhint"), "nothanos", "voiceoncehint", "savedhint", "savedsearchhint"), "savedsearchtaghint", "newppsms", "monetizationadshint", "seekSpeedHintShowed"), "unsupport_video/av01", "statusgiftpage", "multistorieshint", "trimvoicehint"), "taptostoryhighlighthint", "proxycheckstatusip", "callmiconstart", "showchattagsinfo").remove("language_showed2").remove("aihintshown").remove("savedmsgschatshint").remove("walletcardstickerhint").apply();
            w7.y5.a();
            SharedPrefsHelper.cleanupAccount(x71Var.currentAccount);
            MessagesController.getEmojiSettings(x71Var.currentAccount).edit().remove("featured_hidden").remove("emoji_featured_hidden").commit();
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
            ChatThemeController.getInstance(x71Var.currentAccount).clearCache();
            x71Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
            r21.W();
            qg.v0.e(x71Var.currentAccount).a();
            SharedPreferences mainSettings = x71Var.getMessagesController().getMainSettings();
            SharedPreferences.Editor edit = mainSettings.edit();
            org.telegram.messenger.g0.d(edit, "peerColors", "profilePeerColors", "boostingappearance", "bizbothint").remove("movecaptionhint");
            for (String str7 : mainSettings.getAll().keySet()) {
                if (str7.contains("show_gift_for_") || str7.contains("bdayhint_") || str7.contains("bdayanim_") || str7.startsWith("ask_paid_message_") || str7.startsWith("topicssidetabs")) {
                    edit.remove(str7);
                }
            }
            edit.apply();
            SharedPreferences.Editor edit2 = MessagesController.getNotificationsSettings(x71Var.currentAccount).edit();
            for (String str8 : MessagesController.getNotificationsSettings(x71Var.currentAccount).getAll().keySet()) {
                if (str8.startsWith("dialog_bar_botver")) {
                    edit2.remove(str8);
                }
            }
            edit2.apply();
        } else if (i10 == 7) {
            org.telegram.ui.Components.voip.d2.i(x71Var.getParentActivity());
        } else if (i10 == 8) {
            SharedConfig.toggleRoundCamera16to9();
        } else if (i10 == 9) {
            ((LaunchActivity) x71Var.getParentActivity()).z(true);
        } else if (i10 == 10) {
            x71Var.getMessagesStorage().readAllDialogs(-1);
        } else if (i10 == 11) {
            SharedConfig.toggleDisableVoiceAudioEffects();
        } else if (i10 == 12) {
            SharedConfig.pendingAppUpdate = null;
            SharedConfig.saveConfig();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
        } else if (i10 == 13) {
            Set<String> set = x71Var.getMessagesController().pendingSuggestions;
            set.add("VALIDATE_PHONE_NUMBER");
            set.add("VALIDATE_PASSWORD");
            x71Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
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
                    Activity parentActivity = x71Var.getParentActivity();
                    if (SharedConfig.debugWebView) {
                        i12 = R.string.DebugMenuWebViewDebugEnabled;
                    } else {
                        i12 = R.string.DebugMenuWebViewDebugDisabled;
                    }
                    Toast.makeText(parentActivity, LocaleController.getString(i12), 0).show();
                } else if (i10 == 17) {
                    SharedConfig.toggleForceDisableTabletMode();
                    Activity parentActivity2 = x71Var.getParentActivity();
                    if (parentActivity2 != null) {
                        Intent launchIntentForPackage = parentActivity2.getPackageManager().getLaunchIntentForPackage(parentActivity2.getPackageName());
                        parentActivity2.finishAffinity();
                        parentActivity2.startActivity(launchIntentForPackage);
                    }
                    System.exit(0);
                } else if (i10 == 18) {
                    w7.d0.a((LaunchActivity) x71Var.getParentActivity(), !SharedConfig.isFloatingDebugActive, true);
                } else if (i10 == 19) {
                    x71Var.getMessagesController().loadAppConfig();
                    TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                    tL_help_dismissSuggestion.suggestion = "VALIDATE_PHONE_NUMBER";
                    tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                    x71Var.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new n71(x71Var, 0));
                } else if (i10 == 20) {
                    int i14 = ConnectionsManager.CPU_COUNT;
                    int memoryClass = ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getMemoryClass();
                    StringBuilder sb2 = new StringBuilder();
                    long j11 = 0;
                    long j12 = 0;
                    long j13 = 0;
                    long j14 = 0;
                    long j15 = 0;
                    long j16 = 0;
                    long j17 = 0;
                    long j18 = 0;
                    while (i13 < i14) {
                        Long sysInfoLong = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i13 + "/cpufreq/cpuinfo_min_freq");
                        Long sysInfoLong2 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i13 + "/cpufreq/cpuinfo_cur_freq");
                        Long sysInfoLong3 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i13 + "/cpufreq/cpuinfo_max_freq");
                        Long sysInfoLong4 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i13 + "/cpu_capacity");
                        sb2.append("#");
                        sb2.append(i13);
                        sb2.append(" ");
                        if (sysInfoLong != null) {
                            sb2.append("min=");
                            sb2.append(sysInfoLong.longValue() / 1000);
                            sb2.append(" ");
                            j12++;
                            j11 = (sysInfoLong.longValue() / 1000) + j11;
                        }
                        if (sysInfoLong2 != null) {
                            sb2.append("cur=");
                            j10 = j11;
                            sb2.append(sysInfoLong2.longValue() / 1000);
                            sb2.append(" ");
                            j13 = (sysInfoLong2.longValue() / 1000) + j13;
                            j14++;
                        } else {
                            j10 = j11;
                        }
                        if (sysInfoLong3 != null) {
                            sb2.append("max=");
                            sb2.append(sysInfoLong3.longValue() / 1000);
                            sb2.append(" ");
                            j15 = (sysInfoLong3.longValue() / 1000) + j15;
                            j16++;
                        }
                        if (sysInfoLong4 != null) {
                            sb2.append("cpc=");
                            sb2.append(sysInfoLong4);
                            sb2.append(" ");
                            j17 = sysInfoLong4.longValue() + j17;
                            j18++;
                        }
                        sb2.append("\n");
                        i13++;
                        j11 = j10;
                    }
                    long j19 = j11;
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
                            l4 = sysInfoLong6;
                            sb3.append(sysInfoLong5.longValue() / 1000);
                        } else {
                            l4 = sysInfoLong6;
                        }
                        if (l4 != null) {
                            sb3.append(", mmin=");
                            sb3.append(l4.longValue() / 1000);
                        }
                        if (sysInfoLong7 != null) {
                            sb3.append(", max=");
                            sb3.append(sysInfoLong7.longValue() / 1000);
                        }
                        sb3.append("\n");
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
                    sb3.append(i14);
                    sb3.append(" CPUs");
                    if (j12 > 0) {
                        sb3.append(", avgMinFreq=");
                        sb3.append(j19 / j12);
                    }
                    if (j14 > 0) {
                        sb3.append(", avgCurFreq=");
                        sb3.append(j13 / j14);
                    }
                    if (j16 > 0) {
                        sb3.append(", avgMaxFreq=");
                        sb3.append(j15 / j16);
                    }
                    if (j18 > 0) {
                        sb3.append(", avgCapacity=");
                        sb3.append(j17 / j18);
                    }
                    sb3.append("\n");
                    sb3.append((CharSequence) sb2);
                    k0("video/avc", sb3);
                    k0("video/hevc", sb3);
                    k0("video/x-vnd.on2.vp8", sb3);
                    k0("video/x-vnd.on2.vp9", sb3);
                    x71Var.showDialog(new q71(x71Var, x71Var.getParentActivity(), sb3.toString()));
                } else if (i10 == 21) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(x71Var.getParentActivity(), 0, x71Var.resourceProvider);
                    alertDialog$Builder.f20602a.R = "Force performance class";
                    int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                    int measureDevicePerformanceClass = SharedConfig.measureDevicePerformanceClass();
                    if (devicePerformanceClass == 2) {
                        str = "**HIGH**";
                    } else {
                        str = "HIGH";
                    }
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
                    if (measureDevicePerformanceClass != 0) {
                        str6 = "";
                    } else {
                        str6 = " (measured)";
                    }
                    alertDialog$Builder.f(new CharSequence[]{replaceTags, replaceTags2, AndroidUtilities.replaceTags(str5.concat(str6))}, new ly0(measureDevicePerformanceClass, 1));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    alertDialog$Builder.o();
                } else if (i10 == 22) {
                    SharedConfig.toggleRoundCamera();
                } else if (i10 == 23) {
                    boolean q6 = ei.c1.q(x71Var.getParentActivity());
                    MessagesController.getGlobalMainSettings().edit().putBoolean("dual_available", !q6).apply();
                    Activity parentActivity3 = x71Var.getParentActivity();
                    if (!q6) {
                        i11 = R.string.DebugMenuDualOnToast;
                    } else {
                        i11 = R.string.DebugMenuDualOffToast;
                    }
                    Toast.makeText(parentActivity3, LocaleController.getString(i11), 0).show();
                } else if (i10 == 24) {
                    SharedConfig.toggleSurfaceInStories();
                    while (i13 < x71Var.getParentLayout().getFragmentStack().size()) {
                        ((org.telegram.ui.ActionBar.n2) x71Var.getParentLayout().getFragmentStack().get(i13)).clearSheets();
                        i13++;
                    }
                } else if (i10 == 25) {
                    SharedConfig.togglePhotoViewerBlur();
                } else if (i10 == 26) {
                    SharedConfig.togglePaymentByInvoice();
                } else if (i10 == 27) {
                    x71Var.getMediaDataController().loadAttachMenuBots(false, true);
                } else if (i10 == 28) {
                    SharedConfig.toggleUseCamera2(x71Var.currentAccount);
                } else if (i10 == 29) {
                    gi.r.b();
                    gi.u0.c();
                    gi.j0.a();
                    gi.r4.c();
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
                    MessagesController.getInstance(x71Var.currentAccount).loadAppConfig(true);
                } else if (i10 == 36) {
                    SharedConfig.toggleForceForumTabs();
                } else if (i10 == 37) {
                    FileLog.getInstance().dumpMemory(true);
                } else if (i10 == 38) {
                    SharedConfig.toggleFastWallpaperDisabled();
                } else if (i10 == 39) {
                    SharedConfig.toggleFrameMetricsEnabled();
                    LaunchActivity launchActivity = LaunchActivity.H1;
                    if (launchActivity != null) {
                        launchActivity.B();
                    }
                } else if (i10 == 40) {
                    SharedPreferences.Editor edit3 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit();
                    boolean z10 = !SharedConfig.shadowsInSections;
                    SharedConfig.shadowsInSections = z10;
                    edit3.putBoolean("shadowsInSections", z10).apply();
                } else if (i10 == 41) {
                    SharedPreferences.Editor edit4 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit();
                    boolean z11 = !SharedConfig.debugViewMetrics;
                    SharedConfig.debugViewMetrics = z11;
                    edit4.putBoolean("debugViewMetrics", z11).apply();
                } else if (i10 == 42) {
                    ti.a aVar = ti.e.f47214a;
                    synchronized (aVar) {
                        if (!aVar.f47206b) {
                            SharedPreferences sharedPreferences = ti.d.f47213a;
                            aVar.f47207c = sharedPreferences.contains("experimental_settings_allowed");
                            aVar.d = sharedPreferences.getBoolean("experimental_settings_allowed", true);
                            aVar.f47206b = true;
                        }
                        boolean z12 = !aVar.d;
                        aVar.d = z12;
                        aVar.f47207c = true;
                        aVar.f47206b = true;
                        ti.d.f47213a.edit().putBoolean("experimental_settings_allowed", z12).apply();
                    }
                    x71Var.f43118c.W2.N(true);
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void e0(x71 x71Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            x71Var.v = fileLocation;
            x71Var.f43124w = photoSize2.location;
            x71Var.F.h(ImageLocation.getForLocal(fileLocation), "90_90", x71Var.E, null);
            x71Var.n0(true, false);
        } else if (x71Var.v == null) {
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
            x71Var.U = x71Var.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new x40(29, x71Var, str));
        }
        x71Var.actionBar.n().requestLayout();
    }

    public static void f0(x71 x71Var, org.telegram.ui.Components.g61 g61Var) {
        Object obj = g61Var.G;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) obj;
            if (!tL_attachMenuBot.inactive && !tL_attachMenuBot.side_menu_disclaimer_needed) {
                LaunchActivity.G0(LaunchActivity.H1, x71Var.currentAccount, tL_attachMenuBot, null, true);
            } else {
                zh1.a(x71Var.getParentActivity(), new org.telegram.ui.Components.qy(23, x71Var, tL_attachMenuBot), null);
            }
        } else if (g61Var.G(r71.class)) {
            int i10 = g61Var.f26510z;
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity != null) {
                launchActivity.O0(i10);
            }
        } else if (g61Var.G(org.telegram.ui.Cells.u6.class)) {
            Object obj2 = g61Var.G;
            if (obj2 instanceof l01) {
                l01 l01Var = (l01) obj2;
                org.telegram.ui.ActionBar.d5 parentLayout = x71Var.getParentLayout();
                l01Var.f38707b.run();
                AndroidUtilities.scrollToFragmentRow(parentLayout, l01Var.f38708c);
            } else if (obj2 instanceof MessagesController.FaqSearchResult) {
                NotificationCenter.getInstance(x71Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.openArticle, x71Var.h.E, ((MessagesController.FaqSearchResult) obj2).url);
            }
            Object obj3 = g61Var.G;
            if (obj3 != null) {
                x71Var.h.E(obj3);
            }
        } else {
            switch (g61Var.d) {
                case 1:
                    x71Var.l0(new UserInfoActivity());
                    return;
                case 2:
                    x71Var.l0(new ThemeActivity(0));
                    return;
                case 3:
                    x71Var.l0(new PrivacySettingsActivity());
                    return;
                case 4:
                case 14:
                default:
                    return;
                case 5:
                    x71Var.l0(new NotificationsSettingsActivity());
                    return;
                case 6:
                    x71Var.l0(new DataSettingsActivity());
                    return;
                case 7:
                    x71Var.l0(new FiltersSetupActivity());
                    return;
                case 8:
                    x71Var.l0(new SessionsActivity(0));
                    return;
                case 9:
                    x71Var.l0(new qb0());
                    return;
                case 10:
                    x71Var.l0(new LanguageSelectActivity());
                    return;
                case 11:
                    x71Var.l0(new PremiumPreviewFragment(0, "settings"));
                    return;
                case 12:
                    x71Var.l0(new ai.md());
                    return;
                case 13:
                    x71Var.l0(new fi.g());
                    return;
                case 15:
                    x71Var.l0(new PremiumPreviewFragment(1, "settings"));
                    return;
                case 16:
                    ug.m1.f0(0, BirthdayController.getInstance(UserConfig.selectedAccount).getState());
                    return;
                case 17:
                    x71Var.showDialog(org.telegram.ui.Components.f5.T(x71Var, x71Var.resourceProvider));
                    return;
                case 18:
                    pf.d.r(x71Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                    return;
                case 19:
                    pf.d.r(x71Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                    return;
                case 20:
                    ProfileActivity.H4(x71Var.getParentActivity(), false);
                    return;
                case 21:
                    ProfileActivity.H4(x71Var.getParentActivity(), true);
                    return;
                case 22:
                    FileLog.cleanupLogs();
                    return;
                case 23:
                    if (MessagesController.getInstance(x71Var.currentAccount).isFrozen()) {
                        b.b(x71Var.currentAccount);
                        return;
                    } else {
                        pf.d.r(x71Var.getParentActivity(), LocaleController.getString(R.string.TelegramFeaturesUrl));
                        return;
                    }
                case 24:
                    x71Var.presentFragment(new org.telegram.ui.ActionBar.n2(null));
                    return;
                case 25:
                    x71Var.l0(new org.telegram.ui.Wallet.o5());
                    return;
                case 26:
                    x71Var.presentFragment(new org.telegram.ui.ActionBar.n2(null));
                    return;
            }
        }
    }

    public static void k0(String str, StringBuilder sb2) {
        String[] supportedTypes;
        ArrayList arrayList;
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
                sb2.append("\n");
                sb2.append(arrayList2.size());
                sb2.append("+");
                sb2.append(arrayList3.size());
                sb2.append(" ");
                sb2.append(str.substring(6));
                sb2.append(" codecs:\n");
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    if (i12 > 0) {
                        sb2.append("\n");
                    }
                    MediaCodecInfo codecInfoAt2 = MediaCodecList.getCodecInfoAt(((Integer) arrayList2.get(i12)).intValue());
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
                for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                    if (i13 > 0 || !arrayList2.isEmpty()) {
                        sb2.append("\n");
                    }
                    MediaCodecInfo codecInfoAt3 = MediaCodecList.getCodecInfoAt(((Integer) arrayList3.get(i13)).intValue());
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

    @Override
    public final void E(float f7) {
        org.telegram.ui.Cells.y3 y3Var = this.f43123s;
        if (y3Var == null) {
            return;
        }
        y3Var.setProgress(f7);
    }

    @Override
    public final void K(boolean z10, boolean z11) {
        org.telegram.ui.Cells.y3 y3Var = this.f43123s;
        if (y3Var == null) {
            return;
        }
        y3Var.setProgress(0.0f);
    }

    @Override
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new hi.k(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 6));
    }

    @Override
    public final View createView(Context context) {
        this.f43116b = new y8(this, context, 7);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.V = true;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.L();
        this.actionBar.setTitle(LocaleController.getString(R.string.Settings));
        this.actionBar.setAdditionalTextLeft(-AndroidUtilities.dp(4.0f));
        this.actionBar.setActionBarMenuOnItemClick(new y21(this, 4));
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(true);
        this.actionBar.setBackgroundColor(0);
        this.actionBar.setBackground(null);
        org.telegram.ui.ActionBar.y n10 = this.actionBar.n();
        org.telegram.ui.ActionBar.u0 c10 = n10.c(0, R.drawable.outline_header_search, this.resourceProvider);
        c10.F();
        c10.H = new ig.c2(this, 17);
        this.e = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        org.telegram.ui.ActionBar.u0 a2 = n10.a(1, R.drawable.ic_ab_other);
        this.f43120f = a2;
        a2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.f43120f.e(2, R.drawable.msg_leave, LocaleController.getString(R.string.LogOut));
        p71 p71Var = new p71(this, this, context);
        this.h = p71Var;
        p71Var.G();
        org.telegram.ui.Components.b71 b71Var = new org.telegram.ui.Components.b71(this, new g5(this, 26), new o71(this), new o71(this));
        this.f43118c = b71Var;
        b71Var.W2.f30436r = false;
        b71Var.p1();
        this.f43118c.setPadding(0, AndroidUtilities.dp(12.0f) + AndroidUtilities.statusBarHeight, 0, AndroidUtilities.navigationBarHeight + this.T);
        this.f43118c.setClipToPadding(false);
        this.f43118c.j(new k3(this, 28));
        org.telegram.ui.Components.b71 b71Var2 = this.f43118c;
        y8 y8Var = this.f43116b;
        Objects.requireNonNull(b71Var2);
        this.Z = new bh.l(b71Var2, y8Var, new x8(b71Var2, 0));
        this.f43118c.C0(new j71(this, 2));
        this.f43116b.addView(this.f43118c, w7.z5.e(-1, -1, 119));
        ei.g6 g6Var = new ei.g6(this, context);
        this.d = g6Var;
        this.f43116b.addView(g6Var, w7.z5.e(-1, 200, 48));
        this.f43116b.addView(this.actionBar, w7.z5.e(-1, -2, 55));
        org.telegram.ui.Components.e50 e50Var = new org.telegram.ui.Components.e50(0, true, true);
        this.f43121n = e50Var;
        e50Var.H = true;
        e50Var.f25775a = this;
        e50Var.f25776b = this;
        this.f43125x = new FrameLayout(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f43126y = frameLayout;
        this.f43125x.addView(frameLayout, w7.z5.d(120, 120.0f, 49, 0.0f, 11.0f, 0.0f, 0.0f));
        this.f43126y.setOnClickListener(new l71(this, 5));
        w7.b6.a(this.f43126y);
        this.E = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.F = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(90.0f));
        this.f43126y.addView(this.F, w7.z5.d(90, 90.0f, 49, 0.0f, 15.0f, 0.0f, 0.0f));
        org.telegram.ui.Cells.y3 y3Var = new org.telegram.ui.Cells.y3(this, context);
        this.f43123s = y3Var;
        y3Var.setSize(AndroidUtilities.dp(26.0f));
        this.f43123s.setProgressColor(-1);
        this.f43123s.setNoProgress(false);
        this.f43126y.addView(this.f43123s, w7.z5.d(90, 90.0f, 49, 0.0f, 15.0f, 0.0f, 0.0f));
        n0(false, false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.G = frameLayout2;
        frameLayout2.setBackground(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(32.0f), getThemedColor(org.telegram.ui.ActionBar.h6.f20929a7)));
        this.G.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.H = frameLayout3;
        frameLayout3.setBackground(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(30.0f), getThemedColor(org.telegram.ui.ActionBar.h6.Oh)));
        ImageView imageView = new ImageView(context);
        this.I = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.I.setImageResource(R.drawable.filled_premium_camera);
        this.H.addView(this.I, w7.z5.e(22, 22, 17));
        this.G.addView(this.H, w7.z5.c(30.0f, 30));
        this.f43126y.addView(this.G, w7.z5.d(34, 34.0f, 49, 32.0f, 75.0f, 0.0f, 0.0f));
        w7.b6.a(this.G);
        TextView textView = new TextView(context);
        this.J = textView;
        textView.setTextSize(1, 22.0f);
        this.J.setTypeface(AndroidUtilities.bold());
        this.J.setGravity(17);
        this.J.setSingleLine();
        TextView textView2 = this.J;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        TextView j10 = org.telegram.ui.Cells.c1.j(this.f43125x, this.J, w7.z5.d(-1, -2.0f, 49, 16.0f, 126.33299f, 16.0f, 0.0f), context);
        this.K = j10;
        j10.setTextSize(1, 13.0f);
        this.K.setGravity(17);
        this.K.setSingleLine();
        this.K.setEllipsize(truncateAt);
        TextView j11 = org.telegram.ui.Cells.c1.j(this.f43125x, this.K, w7.z5.d(-1, -2.0f, 49, 0.0f, 156.0f, 0.0f, 0.0f), context);
        this.L = j11;
        j11.setTextSize(1, 14.0f);
        this.L.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.B6));
        this.L.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f));
        this.L.setGravity(17);
        this.L.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(org.telegram.ui.ActionBar.h6.f21076i6), 2, -1));
        this.L.setOnClickListener(new l71(this, 6));
        this.N = new View(context);
        o0(true, false);
        this.f43118c.W2.N(false);
        m0(getUserConfig().getCurrentUser());
        p0();
        j0();
        y8 y8Var2 = this.f43116b;
        o71 o71Var = new o71(this);
        WeakHashMap weakHashMap = r0.i0.f44818a;
        r0.a0.i(y8Var2, o71Var);
        y8 y8Var3 = this.f43116b;
        this.fragmentView = y8Var3;
        return y8Var3;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.b71 b71Var;
        if (i10 == NotificationCenter.starBalanceUpdated) {
            m0(getUserConfig().getCurrentUser());
            org.telegram.ui.Components.b71 b71Var2 = this.f43118c;
            if (b71Var2 != null) {
                b71Var2.W2.N(true);
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            m0(getUserConfig().getCurrentUser());
        } else if (i10 == NotificationCenter.newSuggestionsAvailable && (b71Var = this.f43118c) != null) {
            b71Var.W2.N(true);
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
    public final ju0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    public final void i0() {
        bh.f fVar;
        float f7;
        int i10;
        if (Build.VERSION.SDK_INT >= 31 && (fVar = this.W) != null) {
            int dp = AndroidUtilities.dp(48.0f);
            int measuredHeight = (this.fragmentView.getMeasuredHeight() - this.S) - AndroidUtilities.dp(8.0f);
            this.f43117b0.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp);
            RectF rectF = this.f43119c0;
            rectF.set(0.0f, measuredHeight - AndroidUtilities.dp(56.0f), this.fragmentView.getMeasuredWidth(), measuredHeight);
            if (LiteMode.isEnabled(262144)) {
                f7 = 0.0f;
            } else {
                f7 = -AndroidUtilities.dp(48.0f);
            }
            rectF.inset(0.0f, f7);
            if (this.M) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            fVar.g(i10, this.f43115a0);
            fVar.e(this.Z, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !this.f43114a.f17384f;
    }

    public final void j0() {
        boolean z10;
        int i10;
        int i11;
        float f7 = this.f43114a.e;
        org.telegram.ui.Components.h20.d(this.f43120f, 1.0f - f7);
        if (!this.M) {
            org.telegram.ui.Components.h20.d(this.actionBar.getBackButton(), 1.0f);
            return;
        }
        ImageView backButton = this.actionBar.getBackButton();
        if (backButton == null) {
            return;
        }
        if (f7 > 0.5f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != this.V) {
            this.V = z10;
            if (z10) {
                i10 = R.drawable.ic_ab_back;
            } else {
                i10 = R.drawable.outline_header_qr_24;
            }
            backButton.setImageResource(i10);
            if (z10) {
                i11 = R.string.AccDescrGoBack;
            } else {
                i11 = R.string.QrCode;
            }
            backButton.setContentDescription(LocaleController.getString(i11));
        }
        float abs = Math.abs((f7 * 2.0f) - 1.0f);
        backButton.setVisibility(0);
        backButton.setAlpha(abs);
        backButton.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, abs));
        backButton.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, abs));
    }

    public final void l0(org.telegram.ui.ActionBar.n2 n2Var) {
        LaunchActivity launchActivity;
        ActionBarLayout actionBarLayout;
        if (AndroidUtilities.isTablet() && (launchActivity = LaunchActivity.H1) != null && (actionBarLayout = launchActivity.f33183s0) != null) {
            if (!actionBarLayout.getFragmentStack().isEmpty()) {
                while (actionBarLayout.getFragmentStack().size() - 1 > 0) {
                    actionBarLayout.a0((org.telegram.ui.ActionBar.n2) actionBarLayout.getFragmentStack().get(0), false);
                }
                actionBarLayout.l(false, false);
            }
            org.telegram.ui.ActionBar.b5 b5Var = new org.telegram.ui.ActionBar.b5(n2Var);
            b5Var.f20703c = true;
            b5Var.f20705g = true;
            actionBarLayout.R(b5Var);
            return;
        }
        presentFragment(n2Var);
    }

    public final void m0(TLRPC.User user) {
        String str;
        String str2;
        if (this.F == null || this.U != -1) {
            return;
        }
        this.E.r(user);
        this.F.e(user, this.E);
        this.J.setText(UserObject.getUserName(user));
        StringBuilder sb2 = new StringBuilder();
        if (user != null) {
            sb2.append(jf.b.c().b("+" + user.phone));
        }
        String publicUsername = UserObject.getPublicUsername(user);
        if (publicUsername != null) {
            sb2.append(" • @");
            sb2.append(publicUsername);
        }
        this.K.setText(sb2);
        TextView textView = this.L;
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
        } catch (Exception e) {
            FileLog.e(e);
            str = null;
        }
        textView.setText(str);
    }

    public final void n0(boolean z10, boolean z11) {
        if (this.f43123s == null) {
            return;
        }
        AnimatorSet animatorSet = this.f43122r;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f43122r = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f43122r = animatorSet2;
            if (z10) {
                this.f43123s.setVisibility(0);
                this.f43122r.playTogether(ObjectAnimator.ofFloat(this.f43123s, View.ALPHA, 1.0f));
            } else {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f43123s, View.ALPHA, 0.0f));
            }
            this.f43122r.setDuration(180L);
            this.f43122r.addListener(new l40(10, this, z10));
            this.f43122r.start();
        } else if (z10) {
            this.f43123s.setAlpha(1.0f);
            this.f43123s.setVisibility(0);
        } else {
            this.f43123s.setAlpha(0.0f);
            this.f43123s.setVisibility(4);
        }
    }

    public final void o0(boolean r5, boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.x71.o0(boolean, boolean):void");
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar.f21494n0) {
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
        int i10 = 0;
        if (bundle != null) {
            this.M = bundle.getBoolean("hasMainTabs", false);
        }
        if (this.M) {
            i10 = AndroidUtilities.dp(72.0f);
        }
        this.T = i10;
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
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.t61 t61Var = this.f43118c.W2;
        if (t61Var != null) {
            t61Var.l();
        }
    }

    public final void p0() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        kVar.setTitleColor(getThemedColor(i10));
        this.actionBar.C(getThemedColor(i10), false);
        this.f43116b.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20929a7));
        this.J.setTextColor(getThemedColor(i10));
        this.K.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21375y6));
        this.e.N();
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.f20987d6);
        this.N.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.h6.m1(0.0f, themedColor), themedColor}));
        this.d.invalidate();
        this.f43118c.invalidate();
    }

    @Override
    public final void r(int i10, float f7, float f10, ne.e eVar) {
        if (i10 == 0) {
            j0();
        }
    }

    @Override
    public final void t() {
        this.f43118c.x0(0);
    }

    @Override
    public final boolean v() {
        return false;
    }

    @Override
    public final gh.d z() {
        return this.Y;
    }

    public x71(Bundle bundle) {
        super(bundle);
        this.f43114a = new ne.b(0, this, org.telegram.ui.Components.bs.h, 350L, false);
        this.O = 0;
        this.R = new ArrayList();
        this.U = -1;
        this.V = true;
        ArrayList arrayList = new ArrayList();
        this.f43115a0 = arrayList;
        RectF rectF = new RectF();
        this.f43117b0 = rectF;
        RectF rectF2 = new RectF();
        this.f43119c0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        if (Build.VERSION.SDK_INT >= 31) {
            this.W = new bh.f(false);
            this.X = new gh.d(null);
            this.Y = new gh.d(null);
            return;
        }
        this.W = null;
        this.X = null;
        this.Y = null;
    }

    @Override
    public final void P() {
    }

    @Override
    public final void H(float f7, int i10) {
    }
}
