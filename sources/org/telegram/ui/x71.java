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
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
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

public final class x71 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.i40, pg0, ud.b {
    public org.telegram.ui.Components.y8 A;
    public org.telegram.ui.Components.n9 B;
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
    public final jg.e R;
    public final og.d S;
    public final og.d T;
    public jg.k U;
    public final ArrayList V;
    public final RectF W;
    public final RectF X;

    public final ud.a f44304a;

    public gh.q4 f44305b;

    public org.telegram.ui.Components.k51 f44306c;
    public ag.t0 d;

    public org.telegram.ui.ActionBar.v0 f44307e;

    public org.telegram.ui.ActionBar.v0 f44308f;
    public p71 h;

    public org.telegram.ui.Components.j40 f44309n;

    public AnimatorSet f44310r;

    public org.telegram.ui.Cells.w3 f44311s;
    public TLRPC.FileLocation v;

    public TLRPC.FileLocation f44312w;

    public FrameLayout f44313x;

    public FrameLayout f44314y;

    public x71() {
        this(null);
    }

    public static boolean U(x71 x71Var, org.telegram.ui.Components.n41 n41Var, View view) {
        String str;
        Object obj = n41Var.G;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            nh.b3.j(x71Var.currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, new l71(x71Var, 0));
            return true;
        }
        if (n41Var.G(org.telegram.ui.Cells.r6.class)) {
            Object obj2 = n41Var.G;
            if (obj2 instanceof f01) {
                str = ((f01) obj2).h;
            } else {
                str = obj2 instanceof MessagesController.FaqSearchResult ? ((MessagesController.FaqSearchResult) obj2).url : null;
            }
            if (!TextUtils.isEmpty(str)) {
                org.telegram.ui.Components.b70 b70VarH = org.telegram.ui.Components.b70.H(x71Var, view);
                b70VarH.c(R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new m21(6, x71Var, str), false);
                b70VarH.W(x71Var.f44306c.V0(view, false));
                b70VarH.Z();
                return true;
            }
        }
        return false;
    }

    public static void V(x71 x71Var) {
        TLRPC.User user = MessagesController.getInstance(x71Var.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(x71Var.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(x71Var.currentAccount).getCurrentUser();
        }
        if (user == null) {
            return;
        }
        org.telegram.ui.Components.j40 j40Var = x71Var.f44309n;
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        j40Var.o((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new l71(x71Var, 4), new lh.e1(6), 0);
    }

    public static void W(x71 x71Var, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.C0(LaunchActivity.C1, x71Var.currentAccount, tL_attachMenuBot, null, true);
        MediaDataController.getInstance(x71Var.currentAccount).updateAttachMenuBotsInCache();
    }

    public static void Y(x71 x71Var) {
        String str;
        int i10;
        String string;
        String str2;
        int i11;
        char c10;
        String string2;
        String str3;
        String str4;
        String string3;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String string4;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        int i12;
        int i13 = x71Var.K + 1;
        x71Var.K = i13;
        if (i13 < 2 && !BuildVars.DEBUG_PRIVATE_VERSION) {
            try {
                Toast.makeText(x71Var.getParentActivity(), LocaleController.getString(R.string.DebugMenuLongPress), 0).show();
                return;
            } catch (Exception e9) {
                FileLog.e(e9);
                return;
            }
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(x71Var.getParentActivity(), 0, x71Var.resourceProvider);
        String string5 = LocaleController.getString(R.string.DebugMenu);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.N = string5;
        String string6 = LocaleController.getString(R.string.DebugMenuImportContacts);
        String string7 = LocaleController.getString(R.string.DebugMenuReloadContacts);
        String string8 = LocaleController.getString(R.string.DebugMenuResetContacts);
        String string9 = LocaleController.getString(R.string.DebugMenuResetDialogs);
        if (BuildVars.DEBUG_VERSION) {
            string = null;
        } else {
            if (BuildVars.LOGS_ENABLED) {
                str = "DebugMenuDisableLogs";
                i10 = R.string.DebugMenuDisableLogs;
            } else {
                str = "DebugMenuEnableLogs";
                i10 = R.string.DebugMenuEnableLogs;
            }
            string = LocaleController.getString(str, i10);
        }
        if (SharedConfig.inappCamera) {
            str2 = "DebugMenuDisableCamera";
            i11 = R.string.DebugMenuDisableCamera;
        } else {
            str2 = "DebugMenuEnableCamera";
            i11 = R.string.DebugMenuEnableCamera;
        }
        String string10 = LocaleController.getString(str2, i11);
        String string11 = LocaleController.getString("DebugMenuClearMediaCache", R.string.DebugMenuClearMediaCache);
        String string12 = LocaleController.getString(R.string.DebugMenuCallSettings);
        if (BuildVars.DEBUG_PRIVATE_VERSION || ApplicationLoader.isStandaloneBuild() || ApplicationLoader.isBetaBuild()) {
            c10 = 1;
            string2 = LocaleController.getString("DebugMenuCheckAppUpdate", R.string.DebugMenuCheckAppUpdate);
        } else {
            string2 = null;
            c10 = 1;
        }
        String string13 = LocaleController.getString("DebugMenuReadAllDialogs", R.string.DebugMenuReadAllDialogs);
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            str3 = SharedConfig.disableVoiceAudioEffects ? "Enable voip audio effects" : "Disable voip audio effects";
        } else {
            str3 = null;
        }
        boolean z10 = BuildVars.DEBUG_PRIVATE_VERSION;
        String str17 = z10 ? "Clean app update" : null;
        String str18 = z10 ? "Reset suggestions" : null;
        String string14 = z10 ? LocaleController.getString(R.string.DebugMenuClearWebViewCache) : null;
        String string15 = LocaleController.getString(R.string.DebugMenuClearWebViewCookies);
        String string16 = LocaleController.getString(SharedConfig.debugWebView ? R.string.DebugMenuDisableWebViewDebug : R.string.DebugMenuEnableWebViewDebug);
        if (AndroidUtilities.isTabletInternal() && BuildVars.DEBUG_PRIVATE_VERSION) {
            str4 = SharedConfig.forceDisableTabletMode ? "Enable tablet mode" : "Disable tablet mode";
        } else {
            str4 = null;
        }
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            string3 = LocaleController.getString(SharedConfig.isFloatingDebugActive ? R.string.FloatingDebugDisable : R.string.FloatingDebugEnable);
        } else {
            string3 = null;
        }
        boolean z11 = BuildVars.DEBUG_PRIVATE_VERSION;
        String str19 = z11 ? "Force remove premium suggestions" : null;
        String str20 = z11 ? "Share device info" : null;
        String str21 = z11 ? "Force performance class" : null;
        if (!z11 || org.telegram.ui.Components.k50.c()) {
            str5 = null;
        } else {
            str5 = !SharedConfig.bigCameraForRound ? "Force big camera for round" : "Disable big camera for round";
        }
        String string17 = LocaleController.getString(lh.c1.q(x71Var.getParentActivity()) ? "DebugMenuDualOff" : "DebugMenuDualOn");
        if (BuildVars.DEBUG_VERSION) {
            str6 = SharedConfig.useSurfaceInStories ? "back to TextureView in stories" : "use SurfaceView in stories";
        } else {
            str6 = null;
        }
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            str7 = SharedConfig.photoViewerBlur ? "do not blur in photoviewer" : "blur in photoviewer";
        } else {
            str7 = null;
        }
        String str22 = !SharedConfig.payByInvoice ? "Enable Invoice Payment" : "Disable Invoice Payment";
        String str23 = BuildVars.DEBUG_PRIVATE_VERSION ? "Update Attach Bots" : null;
        String str24 = !SharedConfig.isUsingCamera2(x71Var.currentAccount) ? "Use Camera 2 API" : "Use old Camera 1 API";
        String str25 = BuildVars.DEBUG_VERSION ? "Clear Mini Apps Permissions and Files" : null;
        String str26 = BuildVars.DEBUG_PRIVATE_VERSION ? "Clear all login tokens" : null;
        if (SharedConfig.canBlurChat()) {
            str8 = string2;
            if (Build.VERSION.SDK_INT >= 31) {
                str9 = SharedConfig.useNewBlur ? "back to cpu blur" : "use new gpu blur";
            }
            if (SharedConfig.adaptableColorInBrowser) {
                str10 = "Disabled adaptive browser colors";
            } else {
                str10 = "Enable adaptive browser colors";
            }
            if (SharedConfig.debugVideoQualities) {
                str11 = "Disable video qualities debug";
            } else {
                str11 = "Enable video qualities debug";
            }
            String str27 = str9;
            if (Build.VERSION.SDK_INT >= 28) {
                if (SharedConfig.useSystemBoldFont) {
                    i12 = R.string.DebugMenuDontUseSystemBoldFont;
                } else {
                    i12 = R.string.DebugMenuUseSystemBoldFont;
                }
                string4 = LocaleController.getString(i12);
            } else {
                string4 = null;
            }
            if (SharedConfig.forceForumTabs) {
                str12 = "Do Not Force Forum Tabs";
            } else {
                str12 = "Force Forum Tabs";
            }
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                str13 = null;
            } else if (SharedConfig.fastWallpaperDisabled) {
                str13 = "enable wallpaper shader";
            } else {
                str13 = "disable wallpaper shader";
            }
            if (SharedConfig.frameMetricsEnabled) {
                str14 = "hide frame metrics";
            } else {
                str14 = "show frame metrics";
            }
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                str15 = null;
            } else if (SharedConfig.shadowsInSections) {
                str15 = "disable shadows in settings";
            } else {
                str15 = "enable shadows in settings";
            }
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                str16 = null;
            } else if (SharedConfig.debugViewMetrics) {
                str16 = "disable debug view metrics";
            } else {
                str16 = "enable debug view metrics";
            }
            CharSequence[] charSequenceArr = new CharSequence[42];
            charSequenceArr[0] = string6;
            charSequenceArr[c10] = string7;
            charSequenceArr[2] = string8;
            charSequenceArr[3] = string9;
            charSequenceArr[4] = string;
            charSequenceArr[5] = string10;
            charSequenceArr[6] = string11;
            charSequenceArr[7] = string12;
            charSequenceArr[8] = null;
            charSequenceArr[9] = str8;
            charSequenceArr[10] = string13;
            charSequenceArr[11] = str3;
            charSequenceArr[12] = str17;
            charSequenceArr[13] = str18;
            charSequenceArr[14] = string14;
            charSequenceArr[15] = string15;
            charSequenceArr[16] = string16;
            charSequenceArr[17] = str4;
            charSequenceArr[18] = string3;
            charSequenceArr[19] = str19;
            charSequenceArr[20] = str20;
            charSequenceArr[21] = str21;
            charSequenceArr[22] = str5;
            charSequenceArr[23] = string17;
            charSequenceArr[24] = str6;
            charSequenceArr[25] = str7;
            charSequenceArr[26] = str22;
            charSequenceArr[27] = str23;
            charSequenceArr[28] = str24;
            charSequenceArr[29] = str25;
            charSequenceArr[30] = str26;
            charSequenceArr[31] = str27;
            charSequenceArr[32] = str10;
            charSequenceArr[33] = str11;
            charSequenceArr[34] = string4;
            charSequenceArr[35] = "Reload app config";
            charSequenceArr[36] = str12;
            charSequenceArr[37] = "Make Memory Dump";
            charSequenceArr[38] = str13;
            charSequenceArr[39] = str14;
            charSequenceArr[40] = str15;
            charSequenceArr[41] = str16;
            alertDialog$Builder.f(charSequenceArr, new kv(x71Var, 3));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            x71Var.showDialog(b2Var);
        }
        str8 = string2;
        str9 = null;
        if (SharedConfig.adaptableColorInBrowser) {
            str10 = "Disabled adaptive browser colors";
        } else {
            str10 = "Enable adaptive browser colors";
        }
        if (SharedConfig.debugVideoQualities) {
            str11 = "Disable video qualities debug";
        } else {
            str11 = "Enable video qualities debug";
        }
        String str28 = str9;
        if (Build.VERSION.SDK_INT >= 28) {
            if (SharedConfig.useSystemBoldFont) {
                i12 = R.string.DebugMenuDontUseSystemBoldFont;
            } else {
                i12 = R.string.DebugMenuUseSystemBoldFont;
            }
            string4 = LocaleController.getString(i12);
        } else {
            string4 = null;
        }
        if (SharedConfig.forceForumTabs) {
            str12 = "Force Forum Tabs";
        } else {
            str12 = "Do Not Force Forum Tabs";
        }
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            str13 = null;
        } else if (SharedConfig.fastWallpaperDisabled) {
            str13 = "enable wallpaper shader";
        } else {
            str13 = "disable wallpaper shader";
        }
        if (SharedConfig.frameMetricsEnabled) {
            str14 = "hide frame metrics";
        } else {
            str14 = "show frame metrics";
        }
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            str15 = null;
        } else if (SharedConfig.shadowsInSections) {
            str15 = "disable shadows in settings";
        } else {
            str15 = "enable shadows in settings";
        }
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            str16 = null;
        } else if (SharedConfig.debugViewMetrics) {
            str16 = "disable debug view metrics";
        } else {
            str16 = "enable debug view metrics";
        }
        CharSequence[] charSequenceArr2 = new CharSequence[42];
        charSequenceArr2[0] = string6;
        charSequenceArr2[c10] = string7;
        charSequenceArr2[2] = string8;
        charSequenceArr2[3] = string9;
        charSequenceArr2[4] = string;
        charSequenceArr2[5] = string10;
        charSequenceArr2[6] = string11;
        charSequenceArr2[7] = string12;
        charSequenceArr2[8] = null;
        charSequenceArr2[9] = str8;
        charSequenceArr2[10] = string13;
        charSequenceArr2[11] = str3;
        charSequenceArr2[12] = str17;
        charSequenceArr2[13] = str18;
        charSequenceArr2[14] = string14;
        charSequenceArr2[15] = string15;
        charSequenceArr2[16] = string16;
        charSequenceArr2[17] = str4;
        charSequenceArr2[18] = string3;
        charSequenceArr2[19] = str19;
        charSequenceArr2[20] = str20;
        charSequenceArr2[21] = str21;
        charSequenceArr2[22] = str5;
        charSequenceArr2[23] = string17;
        charSequenceArr2[24] = str6;
        charSequenceArr2[25] = str7;
        charSequenceArr2[26] = str22;
        charSequenceArr2[27] = str23;
        charSequenceArr2[28] = str24;
        charSequenceArr2[29] = str25;
        charSequenceArr2[30] = str26;
        charSequenceArr2[31] = str28;
        charSequenceArr2[32] = str10;
        charSequenceArr2[33] = str11;
        charSequenceArr2[34] = string4;
        charSequenceArr2[35] = "Reload app config";
        charSequenceArr2[36] = str12;
        charSequenceArr2[37] = "Make Memory Dump";
        charSequenceArr2[38] = str13;
        charSequenceArr2[39] = str14;
        charSequenceArr2[40] = str15;
        charSequenceArr2[41] = str16;
        alertDialog$Builder.f(charSequenceArr2, new kv(x71Var, 3));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        x71Var.showDialog(b2Var);
    }

    public static void Z(x71 x71Var, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        x71Var.actionBar.getTitlesContainer().setAlpha(fFloatValue);
        x71Var.d.setAlpha(fFloatValue);
    }

    public static void a0(x71 x71Var, ArrayList arrayList) {
        int i10;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList2;
        ArrayList arrayList3 = x71Var.N;
        org.telegram.ui.ActionBar.q0 q0Var = x71Var.f44307e.B;
        int i11 = 0;
        if (q0Var != null && q0Var.getTag() != null) {
            arrayList.add(org.telegram.ui.Components.n41.C(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
            p71 p71Var = x71Var.h;
            ArrayList arrayList4 = p71Var.d;
            ArrayList arrayList5 = p71Var.v;
            if (p71Var.f38258w) {
                ArrayList arrayList6 = p71Var.f38256r;
                int size = arrayList6.size();
                int i12 = 0;
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList6.get(i13);
                    i13++;
                    int i14 = i12 + 1;
                    CharSequence charSequence = (CharSequence) p71Var.f38255n.get(i12);
                    int i15 = org.telegram.ui.Cells.r6.f25220a;
                    org.telegram.ui.Components.n41 n41VarJ = org.telegram.ui.Components.n41.J(org.telegram.ui.Cells.r6.class);
                    n41VarJ.f30844l = charSequence;
                    n41VarJ.G = (f01) obj;
                    arrayList.add(n41VarJ);
                    i12 = i14;
                }
                if (p71Var.f38257s.isEmpty()) {
                    return;
                }
                arrayList.add(org.telegram.ui.Components.n41.q(LocaleController.getString(R.string.SettingsFaqSearchTitle)));
                ArrayList arrayList7 = p71Var.f38257s;
                int size2 = arrayList7.size();
                while (i11 < size2) {
                    Object obj2 = arrayList7.get(i11);
                    i11++;
                    int i16 = i12 + 1;
                    CharSequence charSequence2 = (CharSequence) p71Var.f38255n.get(i12);
                    int i17 = org.telegram.ui.Cells.r6.f25220a;
                    org.telegram.ui.Components.n41 n41VarJ2 = org.telegram.ui.Components.n41.J(org.telegram.ui.Cells.r6.class);
                    n41VarJ2.f30844l = charSequence2;
                    n41VarJ2.G = (MessagesController.FaqSearchResult) obj2;
                    arrayList.add(n41VarJ2);
                    i12 = i16;
                }
                return;
            }
            if (!arrayList5.isEmpty()) {
                arrayList.add(org.telegram.ui.Components.n41.q(LocaleController.getString(R.string.SettingsRecent)));
                int size3 = arrayList5.size();
                int i18 = 0;
                while (i18 < size3) {
                    Object obj3 = arrayList5.get(i18);
                    i18++;
                    if (obj3 instanceof f01) {
                        f01 f01Var = (f01) obj3;
                        String str = f01Var.f37891a;
                        int i19 = org.telegram.ui.Cells.r6.f25220a;
                        org.telegram.ui.Components.n41 n41VarJ3 = org.telegram.ui.Components.n41.J(org.telegram.ui.Cells.r6.class);
                        n41VarJ3.f30844l = str;
                        n41VarJ3.G = f01Var;
                        arrayList.add(n41VarJ3);
                    } else if (obj3 instanceof MessagesController.FaqSearchResult) {
                        MessagesController.FaqSearchResult faqSearchResult = (MessagesController.FaqSearchResult) obj3;
                        String str2 = faqSearchResult.title;
                        int i20 = org.telegram.ui.Cells.r6.f25220a;
                        org.telegram.ui.Components.n41 n41VarJ4 = org.telegram.ui.Components.n41.J(org.telegram.ui.Cells.r6.class);
                        n41VarJ4.f30844l = str2;
                        n41VarJ4.G = faqSearchResult;
                        arrayList.add(n41VarJ4);
                    }
                }
            }
            if (arrayList4.isEmpty()) {
                return;
            }
            arrayList.add(org.telegram.ui.Components.n41.q(LocaleController.getString(R.string.SettingsFaqSearchTitle)));
            int size4 = arrayList4.size();
            while (i11 < size4) {
                Object obj4 = arrayList4.get(i11);
                i11++;
                MessagesController.FaqSearchResult faqSearchResult2 = (MessagesController.FaqSearchResult) obj4;
                String str3 = faqSearchResult2.title;
                int i21 = org.telegram.ui.Cells.r6.f25220a;
                org.telegram.ui.Components.n41 n41VarJ5 = org.telegram.ui.Components.n41.J(org.telegram.ui.Cells.r6.class);
                n41VarJ5.f30844l = str3;
                n41VarJ5.G = faqSearchResult2;
                arrayList.add(n41VarJ5);
            }
            return;
        }
        FrameLayout frameLayout = x71Var.f44313x;
        org.telegram.ui.Components.n41 n41Var = new org.telegram.ui.Components.n41(-4);
        n41Var.f30837c = frameLayout;
        n41Var.f30857z = 188;
        arrayList.add(n41Var);
        arrayList3.clear();
        int i22 = 0;
        while (true) {
            i10 = 4;
            if (i22 >= 4) {
                break;
            }
            if (UserConfig.getInstance(i22).isClientActivated() && x71Var.currentAccount != i22) {
                arrayList3.add(Integer.valueOf(i22));
            }
            i22++;
        }
        Collections.sort(arrayList3, new org.telegram.ui.Components.lp0(13));
        Set<String> set = x71Var.getMessagesController().pendingSuggestions;
        int i23 = 1;
        if (set.contains("PREMIUM_GRACE")) {
            arrayList.add(v71.a(LocaleController.getString(R.string.GraceSuggestionTitle), LocaleController.getString(R.string.GraceSuggestionMessage), null, null, LocaleController.getString(R.string.GraceSuggestionButton), new m71(x71Var, i11)));
            arrayList.add(org.telegram.ui.Components.n41.B(null));
        } else if (set.contains("VALIDATE_PHONE_NUMBER") && x71Var.getUserConfig().getCurrentUser() != null) {
            arrayList.add(v71.a(LocaleController.formatString(R.string.CheckPhoneNumber, org.telegram.messenger.y1.k(new StringBuilder("+"), x71Var.getUserConfig().getCurrentUser().phone, oe.b.c())), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CheckPhoneNumberInfo), new l71(x71Var, i23)), LocaleController.getString(R.string.CheckPhoneNumberNo), new m71(x71Var, i23), hh.i5.g2(LocaleController.getString(R.string.CheckPhoneNumberYes2)), new m71(x71Var, 2)));
            arrayList.add(org.telegram.ui.Components.n41.B(null));
        } else if (set.contains("VALIDATE_PASSWORD")) {
            arrayList.add(v71.a(LocaleController.getString(R.string.YourPasswordHeader), LocaleController.getString(R.string.YourPasswordRemember), LocaleController.getString(R.string.YourPasswordRememberNo), new m71(x71Var, 3), LocaleController.getString(R.string.YourPasswordRememberYes), new m71(x71Var, i10)));
            arrayList.add(org.telegram.ui.Components.n41.B(null));
        }
        if (arrayList3.size() > 0) {
            org.telegram.ui.Cells.pa.o(R.string.SettingsAccounts, arrayList);
            for (int i24 = 0; i24 < arrayList3.size(); i24++) {
                int iIntValue = ((Integer) arrayList3.get(i24)).intValue();
                int i25 = r71.f41832a;
                org.telegram.ui.Components.n41 n41VarJ6 = org.telegram.ui.Components.n41.J(r71.class);
                n41VarJ6.d = i24;
                n41VarJ6.f30857z = iIntValue;
                arrayList.add(n41VarJ6);
            }
            arrayList.add(org.telegram.ui.Components.n41.B(null));
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
        arrayList.add(org.telegram.ui.Components.n41.B(null));
        if (!x71Var.getMessagesController().premiumFeaturesBlocked()) {
            arrayList.add(t71.a(11, -4826625, -10388225, R.drawable.settings_premium, LocaleController.getString(R.string.TelegramPremium), null, null));
        }
        CharSequence charSequenceJ0 = "";
        if (x71Var.getMessagesController().starsPurchaseAvailable()) {
            hh.u7 u7VarY = hh.u7.y(x71Var.currentAccount, false);
            arrayList.add(t71.a(12, -1071598, -1608430, R.drawable.settings_stars, LocaleController.getString(R.string.TelegramStars), null, (!u7VarY.f10154e || u7VarY.p().amount <= 0) ? "" : hh.oa.J0(u7VarY.p(), 0.85f, ' ')));
        }
        hh.u7.y(x71Var.currentAccount, true).p();
        if (ApplicationLoader.isBetaBuild() || ApplicationLoader.isStandaloneBuild() || ApplicationLoader.isHuaweiStoreBuild() || (hh.u7.y(x71Var.currentAccount, true).f10154e && (hh.u7.y(x71Var.currentAccount, true).O(0) || hh.u7.y(x71Var.currentAccount, true).p().positive()))) {
            hh.u7 u7VarY2 = hh.u7.y(x71Var.currentAccount, true);
            long j10 = u7VarY2.p().amount;
            int i26 = R.drawable.settings_gram_24;
            String string = LocaleController.getString(R.string.MyTON);
            if (u7VarY2.f10154e && j10 > 0) {
                charSequenceJ0 = hh.oa.J0(u7VarY2.p(), 0.85f, ' ');
            }
            arrayList.add(t71.a(13, -14965523, -15431455, i26, string, null, charSequenceJ0));
        }
        TLRPC.TL_attachMenuBots attachMenuBots = MediaDataController.getInstance(UserConfig.selectedAccount).getAttachMenuBots();
        if (attachMenuBots != null && (arrayList2 = attachMenuBots.bots) != null && !arrayList2.isEmpty()) {
            ArrayList<TLRPC.TL_attachMenuBot> arrayList8 = attachMenuBots.bots;
            int size5 = arrayList8.size();
            while (i11 < size5) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList8.get(i11);
                i11++;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                if (tL_attachMenuBot2.show_in_side_menu && tL_attachMenuBot2.bot_id == 1985737506) {
                    int i27 = R.drawable.settings_wallet;
                    org.telegram.ui.Components.n41 n41VarJ7 = org.telegram.ui.Components.n41.J(t71.class);
                    long j11 = tL_attachMenuBot2.bot_id;
                    n41VarJ7.d = (int) (j11 ^ (j11 >>> 32));
                    n41VarJ7.f30843k = i27;
                    n41VarJ7.f30844l = tL_attachMenuBot2.short_name;
                    n41VarJ7.B = (((long) (-15431455)) << 32) | (((long) (-14965523)) & 4294967295L);
                    n41VarJ7.G = tL_attachMenuBot2;
                    arrayList.add(n41VarJ7);
                }
            }
        }
        if (!x71Var.getMessagesController().premiumFeaturesBlocked()) {
            arrayList.add(t71.a(15, -765355, -2148011, R.drawable.settings_business, LocaleController.getString(R.string.TelegramBusiness), null, null));
        }
        if (!x71Var.getMessagesController().premiumPurchaseBlocked()) {
            arrayList.add(t71.a(16, -816335, -1940716, R.drawable.settings_gift, LocaleController.getString(R.string.SendAGift), null, null));
        }
        if (((org.telegram.ui.Components.n41) i0.a.i(1, arrayList)).f49413a != 7) {
            arrayList.add(org.telegram.ui.Components.n41.B(null));
        }
        org.telegram.ui.Cells.pa.o(R.string.SettingsHelp, arrayList);
        arrayList.add(t71.a(17, -1007845, -1996271, R.drawable.settings_ask, LocaleController.getString(R.string.AskAQuestion), null, null));
        arrayList.add(t71.a(18, -14965523, -15431455, R.drawable.settings_faq, LocaleController.getString(R.string.TelegramFAQ), null, null));
        arrayList.add(t71.a(23, -3903756, -6335009, R.drawable.settings_features, LocaleController.getString(R.string.TelegramFeatures), null, null));
        arrayList.add(t71.a(19, -11154873, -14175180, R.drawable.settings_policy, LocaleController.getString(R.string.PrivacyPolicy), null, null));
        if (BuildVars.LOGS_ENABLED || BuildVars.DEBUG_PRIVATE_VERSION) {
            arrayList.add(org.telegram.ui.Components.n41.B(null));
            org.telegram.ui.Cells.pa.o(R.string.SettingsDebug, arrayList);
            arrayList.add(t71.a(20, -11154873, -14175180, 0, LocaleController.getString(R.string.DebugSendLogs), null, null));
            arrayList.add(t71.a(21, -11154873, -14175180, 0, LocaleController.getString(R.string.DebugSendLastLogs), null, null));
            arrayList.add(t71.a(22, -765355, -2148011, 0, LocaleController.getString(R.string.DebugClearLogs), null, null));
        }
        arrayList.add(org.telegram.ui.Components.n41.l(x71Var.H));
    }

    public static void b0(x71 x71Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        x71Var.Q = -1;
        if (tL_error == null) {
            TLRPC.User user = x71Var.getMessagesController().getUser(Long.valueOf(x71Var.getUserConfig().getClientUserId()));
            if (user == null) {
                user = x71Var.getUserConfig().getCurrentUser();
                if (user == null) {
                    return;
                } else {
                    x71Var.getMessagesController().putUser(user, false);
                }
            } else {
                x71Var.getUserConfig().setCurrentUser(user);
            }
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 150);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, 800);
            TLRPC.VideoSize closestVideoSizeWithSize = tL_photos_photo.photo.video_sizes.isEmpty() ? null : FileLoader.getClosestVideoSizeWithSize(tL_photos_photo.photo.video_sizes, 1000);
            TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
            user.photo = tL_userProfilePhoto;
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.f22404id;
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
                String strK = a9.p.k(x71Var.v.local_id, "@90_90", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(closestPhotoSizeWithSize.location.volume_id);
                sb3.append("_");
                ImageLoader.getInstance().replaceImageInCache(strK, a9.p.k(closestPhotoSizeWithSize.location.local_id, "@90_90", sb3), ImageLocation.getForUserOrChat(x71Var.currentAccount, user, 1), false);
            }
            if (closestVideoSizeWithSize != null && str != null) {
                new File(str).renameTo(FileLoader.getInstance(x71Var.currentAccount).getPathToAttach(closestVideoSizeWithSize, "mp4", true));
            } else if (closestPhotoSizeWithSize2 != null && x71Var.f44312w != null) {
                FileLoader.getInstance(x71Var.currentAccount).getPathToAttach(x71Var.f44312w, true).renameTo(FileLoader.getInstance(x71Var.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
            }
            x71Var.getMessagesController().getDialogPhotos(user.f22527id).addPhotoAtStart(tL_photos_photo.photo);
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
        x71Var.f44312w = null;
        x71Var.n0(false, true);
        x71Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
        x71Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
        x71Var.getUserConfig().saveConfig(true);
    }

    public static void c0(x71 x71Var, int i10) throws Throwable {
        int i11 = 1;
        int i12 = 0;
        if (i10 == 0) {
            x71Var.getUserConfig().syncContacts = true;
            x71Var.getUserConfig().saveConfig(false);
            x71Var.getContactsController().forceImportContacts();
            return;
        }
        long j10 = 0;
        if (i10 == 1) {
            x71Var.getContactsController().loadContacts(false, 0L);
            return;
        }
        if (i10 == 2) {
            x71Var.getContactsController().resetImportedContacts();
            return;
        }
        if (i10 == 3) {
            x71Var.getMessagesController().forceResetDialogs();
            return;
        }
        if (i10 == 4) {
            BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
            ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
            x71Var.f44306c.U2.N(true);
            if (BuildVars.LOGS_ENABLED) {
                i0.a.y(new StringBuilder("app start time = "), ApplicationLoader.startTime);
                try {
                    FileLog.d("buildVersion = " + ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0).versionCode);
                    return;
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
            }
            return;
        }
        if (i10 == 5) {
            SharedConfig.toggleInappCamera();
            return;
        }
        if (i10 == 6) {
            x71Var.getMessagesStorage().clearSentMedia();
            SharedConfig.setNoSoundHintShowed(false);
            org.telegram.messenger.y1.d(org.telegram.messenger.y1.d(org.telegram.messenger.y1.d(org.telegram.messenger.y1.d(org.telegram.messenger.y1.d(org.telegram.messenger.y1.d(org.telegram.messenger.y1.d(org.telegram.messenger.y1.d(org.telegram.messenger.y1.d(org.telegram.messenger.y1.d(MessagesController.getGlobalMainSettings().edit().remove("archivehint").remove("proximityhint").remove("archivehint_l"), "searchpostsnew", "speedhint", "gifhint", "reminderhint"), "soundHint", "themehint", "bganimationhint", "filterhint"), "n_0", "storyprvhint", "storyhint", "storyhint2"), "storydualhint", "storysvddualhint", "stories_camera", "dualcam"), "dualmatrix", "dual_available", "archivehint", "askNotificationsAfter"), "askNotificationsDuration", "viewoncehint", "voicepausehint", "taptostorysoundhint"), "nothanos", "voiceoncehint", "savedhint", "savedsearchhint"), "savedsearchtaghint", "newppsms", "monetizationadshint", "seekSpeedHintShowed"), "unsupport_video/av01", "statusgiftpage", "multistorieshint", "trimvoicehint"), "taptostoryhighlighthint", "proxycheckstatusip", "callmiconstart", "showchattagsinfo").remove("language_showed2").remove("aihintshown").remove("savedmsgschatshint").apply();
            h7.y5.a();
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
            a31.W();
            yf.r0.e(x71Var.currentAccount).a();
            SharedPreferences mainSettings = x71Var.getMessagesController().getMainSettings();
            SharedPreferences.Editor editorEdit = mainSettings.edit();
            org.telegram.messenger.y1.d(editorEdit, "peerColors", "profilePeerColors", "boostingappearance", "bizbothint").remove("movecaptionhint");
            for (String str : mainSettings.getAll().keySet()) {
                if (str.contains("show_gift_for_") || str.contains("bdayhint_") || str.contains("bdayanim_") || str.startsWith("ask_paid_message_") || str.startsWith("topicssidetabs")) {
                    editorEdit.remove(str);
                }
            }
            editorEdit.apply();
            SharedPreferences.Editor editorEdit2 = MessagesController.getNotificationsSettings(x71Var.currentAccount).edit();
            for (String str2 : MessagesController.getNotificationsSettings(x71Var.currentAccount).getAll().keySet()) {
                if (str2.startsWith("dialog_bar_botver")) {
                    editorEdit2.remove(str2);
                }
            }
            editorEdit2.apply();
            return;
        }
        if (i10 == 7) {
            org.telegram.ui.Components.voip.e2.j(x71Var.getParentActivity());
            return;
        }
        if (i10 == 8) {
            SharedConfig.toggleRoundCamera16to9();
            return;
        }
        if (i10 == 9) {
            ((LaunchActivity) x71Var.getParentActivity()).z(true);
            return;
        }
        if (i10 == 10) {
            x71Var.getMessagesStorage().readAllDialogs(-1);
            return;
        }
        if (i10 == 11) {
            SharedConfig.toggleDisableVoiceAudioEffects();
            return;
        }
        if (i10 == 12) {
            SharedConfig.pendingAppUpdate = null;
            SharedConfig.saveConfig();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
            return;
        }
        if (i10 == 13) {
            Set<String> set = x71Var.getMessagesController().pendingSuggestions;
            set.add("VALIDATE_PHONE_NUMBER");
            set.add("VALIDATE_PASSWORD");
            x71Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
            return;
        }
        try {
            if (i10 == 14) {
                ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                WebStorage.getInstance().deleteAllData();
                WebView webView = new WebView(ApplicationLoader.applicationContext);
                webView.clearHistory();
                webView.destroy();
                return;
            }
            if (i10 == 15) {
                CookieManager cookieManager = CookieManager.getInstance();
                cookieManager.removeAllCookies(null);
                cookieManager.flush();
                return;
            }
            if (i10 == 16) {
                SharedConfig.toggleDebugWebView();
                Toast.makeText(x71Var.getParentActivity(), LocaleController.getString(SharedConfig.debugWebView ? R.string.DebugMenuWebViewDebugEnabled : R.string.DebugMenuWebViewDebugDisabled), 0).show();
                return;
            }
            if (i10 == 17) {
                SharedConfig.toggleForceDisableTabletMode();
                Activity parentActivity = x71Var.getParentActivity();
                if (parentActivity != null) {
                    Intent launchIntentForPackage = parentActivity.getPackageManager().getLaunchIntentForPackage(parentActivity.getPackageName());
                    parentActivity.finishAffinity();
                    parentActivity.startActivity(launchIntentForPackage);
                }
                System.exit(0);
                return;
            }
            if (i10 == 18) {
                h7.y7.a((LaunchActivity) x71Var.getParentActivity(), !SharedConfig.isFloatingDebugActive, true);
                return;
            }
            if (i10 == 19) {
                x71Var.getMessagesController().loadAppConfig();
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PHONE_NUMBER";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                x71Var.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new n71(x71Var, i12));
                return;
            }
            if (i10 != 20) {
                if (i10 == 21) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(x71Var.getParentActivity(), 0, x71Var.resourceProvider);
                    alertDialog$Builder.f22702a.N = "Force performance class";
                    int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                    int iMeasureDevicePerformanceClass = SharedConfig.measureDevicePerformanceClass();
                    alertDialog$Builder.f(new CharSequence[]{AndroidUtilities.replaceTags((devicePerformanceClass == 2 ? "**HIGH**" : "HIGH").concat(iMeasureDevicePerformanceClass == 2 ? " (measured)" : "")), AndroidUtilities.replaceTags((devicePerformanceClass == 1 ? "**AVERAGE**" : "AVERAGE").concat(iMeasureDevicePerformanceClass == 1 ? " (measured)" : "")), AndroidUtilities.replaceTags((devicePerformanceClass == 0 ? "**LOW**" : "LOW").concat(iMeasureDevicePerformanceClass == 0 ? " (measured)" : ""))}, new fy0(iMeasureDevicePerformanceClass, i11));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    alertDialog$Builder.o();
                    return;
                }
                if (i10 == 22) {
                    SharedConfig.toggleRoundCamera();
                    return;
                }
                if (i10 == 23) {
                    boolean zQ = lh.c1.q(x71Var.getParentActivity());
                    MessagesController.getGlobalMainSettings().edit().putBoolean("dual_available", !zQ).apply();
                    Toast.makeText(x71Var.getParentActivity(), LocaleController.getString(!zQ ? R.string.DebugMenuDualOnToast : R.string.DebugMenuDualOffToast), 0).show();
                    return;
                }
                if (i10 == 24) {
                    SharedConfig.toggleSurfaceInStories();
                    while (i12 < x71Var.getParentLayout().getFragmentStack().size()) {
                        ((org.telegram.ui.ActionBar.n2) x71Var.getParentLayout().getFragmentStack().get(i12)).clearSheets();
                        i12++;
                    }
                    return;
                }
                if (i10 == 25) {
                    SharedConfig.togglePhotoViewerBlur();
                    return;
                }
                if (i10 == 26) {
                    SharedConfig.togglePaymentByInvoice();
                    return;
                }
                if (i10 == 27) {
                    x71Var.getMediaDataController().loadAttachMenuBots(false, true);
                    return;
                }
                if (i10 == 28) {
                    SharedConfig.toggleUseCamera2(x71Var.currentAccount);
                    return;
                }
                if (i10 == 29) {
                    nh.q.b();
                    nh.t0.c();
                    nh.j0.a();
                    nh.o4.c();
                    return;
                }
                if (i10 == 30) {
                    AuthTokensHelper.clearLogInTokens();
                    return;
                }
                if (i10 == 31) {
                    SharedConfig.toggleUseNewBlur();
                    return;
                }
                if (i10 == 32) {
                    SharedConfig.toggleBrowserAdaptableColors();
                    return;
                }
                if (i10 == 33) {
                    SharedConfig.toggleDebugVideoQualities();
                    return;
                }
                if (i10 == 34) {
                    SharedConfig.toggleUseSystemBoldFont();
                    return;
                }
                if (i10 == 35) {
                    MessagesController.getInstance(x71Var.currentAccount).loadAppConfig(true);
                    return;
                }
                if (i10 == 36) {
                    SharedConfig.toggleForceForumTabs();
                    return;
                }
                if (i10 == 37) {
                    FileLog.getInstance().dumpMemory(true);
                    return;
                }
                if (i10 == 38) {
                    SharedConfig.toggleFastWallpaperDisabled();
                    return;
                }
                if (i10 == 39) {
                    SharedConfig.toggleFrameMetricsEnabled();
                    LaunchActivity launchActivity = LaunchActivity.C1;
                    if (launchActivity != null) {
                        launchActivity.B();
                        return;
                    }
                    return;
                }
                if (i10 == 40) {
                    SharedPreferences.Editor editorEdit3 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit();
                    boolean z10 = !SharedConfig.shadowsInSections;
                    SharedConfig.shadowsInSections = z10;
                    editorEdit3.putBoolean("shadowsInSections", z10).apply();
                    return;
                }
                if (i10 == 41) {
                    SharedPreferences.Editor editorEdit4 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit();
                    boolean z11 = !SharedConfig.debugViewMetrics;
                    SharedConfig.debugViewMetrics = z11;
                    editorEdit4.putBoolean("debugViewMetrics", z11).apply();
                    return;
                }
                return;
            }
            int i13 = ConnectionsManager.CPU_COUNT;
            int memoryClass = ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getMemoryClass();
            StringBuilder sb2 = new StringBuilder();
            long jLongValue = 0;
            long j11 = 0;
            long jLongValue2 = 0;
            long j12 = 0;
            long jLongValue3 = 0;
            long j13 = 0;
            long jLongValue4 = 0;
            long j14 = 0;
            while (i12 < i13) {
                long j15 = j10;
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
                    sb2.append(sysInfoLong.longValue() / 1000);
                    sb2.append(" ");
                    jLongValue += sysInfoLong.longValue() / 1000;
                    j11++;
                }
                if (sysInfoLong2 != null) {
                    sb2.append("cur=");
                    sb2.append(sysInfoLong2.longValue() / 1000);
                    sb2.append(" ");
                    jLongValue2 += sysInfoLong2.longValue() / 1000;
                    j12++;
                }
                if (sysInfoLong3 != 0) {
                    sb2.append("max=");
                    sb2.append(sysInfoLong3.longValue() / 1000);
                    sb2.append(" ");
                    jLongValue3 = (sysInfoLong3.longValue() / 1000) + jLongValue3;
                    j13++;
                }
                if (sysInfoLong4 != null) {
                    sb2.append("cpc=");
                    sb2.append(sysInfoLong4);
                    sb2.append(" ");
                    jLongValue4 = sysInfoLong4.longValue() + jLongValue4;
                    j14++;
                }
                sb2.append("\n");
                i12 = i14 + 1;
                j10 = j15;
            }
            long j16 = j10;
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
                    sb3.append(sysInfoLong5.longValue() / 1000);
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
                jLongValue = jLongValue;
            }
            ConfigurationInfo deviceConfigurationInfo = ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getDeviceConfigurationInfo();
            sb3.append("GLES Version: ");
            sb3.append(deviceConfigurationInfo.getGlEsVersion());
            sb3.append("\nMemory: class=");
            sb3.append(AndroidUtilities.formatFileSize(((long) memoryClass) * 1048576));
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
            if (j11 > j16) {
                sb3.append(", avgMinFreq=");
                sb3.append(jLongValue / j11);
            }
            if (j12 > j16) {
                sb3.append(", avgCurFreq=");
                sb3.append(jLongValue2 / j12);
            }
            if (j13 > j16) {
                sb3.append(", avgMaxFreq=");
                sb3.append(jLongValue3 / j13);
            }
            if (j14 > j16) {
                sb3.append(", avgCapacity=");
                sb3.append(jLongValue4 / j14);
            }
            sb3.append("\n");
            sb3.append((CharSequence) sb2);
            k0("video/avc", sb3);
            k0("video/hevc", sb3);
            k0("video/x-vnd.on2.vp8", sb3);
            k0("video/x-vnd.on2.vp9", sb3);
            x71Var.showDialog(new q71(x71Var, x71Var.getParentActivity(), sb3.toString()));
        } catch (Exception unused) {
        }
    }

    public static void d0(x71 x71Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            x71Var.v = fileLocation;
            x71Var.f44312w = photoSize2.location;
            x71Var.B.h(ImageLocation.getForLocal(fileLocation), "90_90", x71Var.A, null);
            x71Var.n0(true, false);
        } else {
            if (x71Var.v == null) {
                return;
            }
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
            x71Var.Q = x71Var.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new v80(26, x71Var, str));
        }
        x71Var.actionBar.n().requestLayout();
    }

    public static void e0(x71 x71Var, org.telegram.ui.Components.n41 n41Var) {
        Object obj = n41Var.G;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) obj;
            if (tL_attachMenuBot.inactive || tL_attachMenuBot.side_menu_disclaimer_needed) {
                ei1.a(x71Var.getParentActivity(), new jh.y1(8, x71Var, tL_attachMenuBot), null);
                return;
            }
            LaunchActivity.C0(LaunchActivity.C1, x71Var.currentAccount, tL_attachMenuBot, null, true);
        }
        if (n41Var.G(r71.class)) {
            int i10 = n41Var.f30857z;
            LaunchActivity launchActivity = LaunchActivity.C1;
            if (launchActivity != null) {
                launchActivity.K0(i10);
                return;
            }
            return;
        }
        if (n41Var.G(org.telegram.ui.Cells.r6.class)) {
            Object obj2 = n41Var.G;
            if (obj2 instanceof f01) {
                f01 f01Var = (f01) obj2;
                org.telegram.ui.ActionBar.b5 parentLayout = x71Var.getParentLayout();
                f01Var.f37892b.run();
                AndroidUtilities.scrollToFragmentRow(parentLayout, f01Var.f37893c);
            } else if (obj2 instanceof MessagesController.FaqSearchResult) {
                NotificationCenter.getInstance(x71Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.openArticle, x71Var.h.A, ((MessagesController.FaqSearchResult) obj2).url);
            }
            Object obj3 = n41Var.G;
            if (obj3 != null) {
                x71Var.h.E(obj3);
                return;
            }
            return;
        }
        switch (n41Var.d) {
            case 1:
                x71Var.l0(new UserInfoActivity());
                break;
            case 2:
                x71Var.l0(new ThemeActivity(0));
                break;
            case 3:
                x71Var.l0(new PrivacySettingsActivity());
                break;
            case 5:
                x71Var.l0(new NotificationsSettingsActivity());
                break;
            case 6:
                x71Var.l0(new DataSettingsActivity());
                break;
            case 7:
                x71Var.l0(new FiltersSetupActivity());
                break;
            case 8:
                x71Var.l0(new SessionsActivity(0));
                break;
            case 9:
                x71Var.l0(new xb0());
                break;
            case 10:
                x71Var.l0(new LanguageSelectActivity());
                break;
            case 11:
                x71Var.l0(new PremiumPreviewFragment(0, "settings"));
                break;
            case 12:
                x71Var.l0(new hh.oa());
                break;
            case 13:
                x71Var.l0(new mh.g());
                break;
            case 15:
                x71Var.l0(new PremiumPreviewFragment(1, "settings"));
                break;
            case 16:
                cg.y2.e0(0, BirthdayController.getInstance(UserConfig.selectedAccount).getState());
                break;
            case 17:
                x71Var.showDialog(org.telegram.ui.Components.y4.U(x71Var, x71Var.resourceProvider));
                break;
            case 18:
                we.e.s(x71Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                break;
            case 19:
                we.e.s(x71Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                break;
            case 20:
                ProfileActivity.H4(x71Var.getParentActivity(), false);
                break;
            case 21:
                ProfileActivity.H4(x71Var.getParentActivity(), true);
                break;
            case 22:
                FileLog.cleanupLogs();
                break;
            case 23:
                if (!MessagesController.getInstance(x71Var.currentAccount).isFrozen()) {
                    we.e.s(x71Var.getParentActivity(), LocaleController.getString(R.string.TelegramFeaturesUrl));
                } else {
                    b.b(x71Var.currentAccount);
                }
                break;
        }
    }

    public static void f0(x71 x71Var, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(x71Var.currentAccount).getInputUser(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(x71Var.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new v80(27, x71Var, tL_attachMenuBot), 66);
    }

    public static void k0(String str, StringBuilder sb2) {
        String[] supportedTypes;
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        try {
            int codecCount = MediaCodecList.getCodecCount();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < codecCount; i10++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i10);
                if (codecInfoAt != null && (supportedTypes = codecInfoAt.getSupportedTypes()) != null) {
                    for (String str2 : supportedTypes) {
                        if (str2.equals(str)) {
                            (codecInfoAt.isEncoder() ? arrayList2 : arrayList).add(Integer.valueOf(i10));
                            break;
                        }
                    }
                }
            }
            if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                return;
            }
            sb2.append("\n");
            sb2.append(arrayList.size());
            sb2.append("+");
            sb2.append(arrayList2.size());
            sb2.append(" ");
            sb2.append(str.substring(6));
            sb2.append(" codecs:\n");
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (i11 > 0) {
                    sb2.append("\n");
                }
                MediaCodecInfo codecInfoAt2 = MediaCodecList.getCodecInfoAt(((Integer) arrayList.get(i11)).intValue());
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
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                if (i12 > 0 || !arrayList.isEmpty()) {
                    sb2.append("\n");
                }
                MediaCodecInfo codecInfoAt3 = MediaCodecList.getCodecInfoAt(((Integer) arrayList2.get(i12)).intValue());
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
        } catch (Exception unused) {
        }
    }

    @Override
    public final void E(float f10) {
        org.telegram.ui.Cells.w3 w3Var = this.f44311s;
        if (w3Var == null) {
            return;
        }
        w3Var.setProgress(f10);
    }

    @Override
    public final void J(boolean z10, boolean z11) {
        org.telegram.ui.Cells.w3 w3Var = this.f44311s;
        if (w3Var == null) {
            return;
        }
        w3Var.setProgress(0.0f);
    }

    @Override
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new oh.k(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 6));
    }

    @Override
    public final View createView(Context context) {
        this.f44305b = new gh.q4(this, context, 8);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.L();
        this.actionBar.setTitle(LocaleController.getString(R.string.Settings));
        int i10 = 26;
        this.actionBar.setActionBarMenuOnItemClick(new pb0(this, i10));
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(true);
        this.actionBar.setBackgroundColor(0);
        this.actionBar.setBackground(null);
        org.telegram.ui.ActionBar.z zVarN = this.actionBar.n();
        org.telegram.ui.ActionBar.v0 v0VarC = zVarN.c(0, R.drawable.outline_header_search, this.resourceProvider);
        v0VarC.F();
        v0VarC.D = new db(this, 16);
        this.f44307e = v0VarC;
        v0VarC.setSearchFieldHint(LocaleController.getString(R.string.Search));
        org.telegram.ui.ActionBar.v0 v0VarA = zVarN.a(1, R.drawable.ic_ab_other);
        this.f44308f = v0VarA;
        v0VarA.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.f44308f.e(2, R.drawable.msg_leave, LocaleController.getString(R.string.LogOut));
        p71 p71Var = new p71(this, this, context);
        this.h = p71Var;
        p71Var.G();
        org.telegram.ui.Components.k51 k51Var = new org.telegram.ui.Components.k51(this, new b5(this, i10), new o71(this), new o71(this));
        this.f44306c = k51Var;
        k51Var.U2.f26942r = false;
        k51Var.p1();
        this.f44306c.setPadding(0, AndroidUtilities.dp(12.0f) + AndroidUtilities.statusBarHeight, 0, AndroidUtilities.navigationBarHeight + this.P);
        this.f44306c.setClipToPadding(false);
        this.f44306c.j(new m3(this, 29));
        org.telegram.ui.Components.k51 k51Var2 = this.f44306c;
        gh.q4 q4Var = this.f44305b;
        Objects.requireNonNull(k51Var2);
        this.U = new jg.k(k51Var2, q4Var, new v8(k51Var2, 0));
        this.f44306c.C0(new l71(this, 2));
        this.f44305b.addView(this.f44306c, h7.z5.e(-1, -1, 119));
        ag.t0 t0Var = new ag.t0(this, context);
        this.d = t0Var;
        this.f44305b.addView(t0Var, h7.z5.e(-1, 200, 48));
        this.f44305b.addView(this.actionBar, h7.z5.e(-1, -2, 55));
        org.telegram.ui.Components.j40 j40Var = new org.telegram.ui.Components.j40(0, true, true);
        this.f44309n = j40Var;
        j40Var.D = true;
        j40Var.f29569a = this;
        j40Var.f29570b = this;
        this.f44313x = new FrameLayout(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f44314y = frameLayout;
        this.f44313x.addView(frameLayout, h7.z5.d(120, 120.0f, 49, 0.0f, 11.0f, 0.0f, 0.0f));
        this.f44314y.setOnClickListener(new m71(this, 5));
        h7.b6.a(this.f44314y);
        this.A = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        this.B = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(90.0f));
        this.f44314y.addView(this.B, h7.z5.d(90, 90.0f, 49, 0.0f, 15.0f, 0.0f, 0.0f));
        org.telegram.ui.Cells.w3 w3Var = new org.telegram.ui.Cells.w3(this, context);
        this.f44311s = w3Var;
        w3Var.setSize(AndroidUtilities.dp(26.0f));
        this.f44311s.setProgressColor(-1);
        this.f44311s.setNoProgress(false);
        this.f44314y.addView(this.f44311s, h7.z5.d(90, 90.0f, 49, 0.0f, 15.0f, 0.0f, 0.0f));
        n0(false, false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.C = frameLayout2;
        frameLayout2.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(32.0f), getThemedColor(org.telegram.ui.ActionBar.g6.f22999a7)));
        this.C.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.D = frameLayout3;
        frameLayout3.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(30.0f), getThemedColor(org.telegram.ui.ActionBar.g6.Oh)));
        ImageView imageView = new ImageView(context);
        this.E = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.E.setImageResource(R.drawable.filled_premium_camera);
        this.D.addView(this.E, h7.z5.e(22, 22, 17));
        this.C.addView(this.D, h7.z5.c(30.0f, 30));
        this.f44314y.addView(this.C, h7.z5.d(34, 34.0f, 49, 32.0f, 75.0f, 0.0f, 0.0f));
        h7.b6.a(this.C);
        TextView textView = new TextView(context);
        this.F = textView;
        textView.setTextSize(1, 22.0f);
        this.F.setTypeface(AndroidUtilities.bold());
        this.F.setGravity(17);
        this.F.setSingleLine();
        TextView textView2 = this.F;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        TextView textViewH = org.telegram.ui.Cells.pa.h(this.f44313x, this.F, h7.z5.d(-1, -2.0f, 49, 16.0f, 126.33299f, 16.0f, 0.0f), context);
        this.G = textViewH;
        textViewH.setTextSize(1, 13.0f);
        this.G.setGravity(17);
        this.G.setSingleLine();
        this.G.setEllipsize(truncateAt);
        TextView textViewH2 = org.telegram.ui.Cells.pa.h(this.f44313x, this.G, h7.z5.d(-1, -2.0f, 49, 0.0f, 156.0f, 0.0f, 0.0f), context);
        this.H = textViewH2;
        textViewH2.setTextSize(1, 14.0f);
        this.H.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.B6));
        this.H.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f));
        this.H.setGravity(17);
        this.H.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(org.telegram.ui.ActionBar.g6.f23144i6), 2, -1));
        this.H.setOnClickListener(new m71(this, 6));
        this.J = new View(context);
        o0(true, false);
        this.f44306c.U2.N(false);
        m0(getUserConfig().getCurrentUser());
        p0();
        j0();
        gh.q4 q4Var2 = this.f44305b;
        o71 o71Var = new o71(this);
        WeakHashMap weakHashMap = r0.j0.f46605a;
        r0.b0.j(q4Var2, o71Var);
        gh.q4 q4Var3 = this.f44305b;
        this.fragmentView = q4Var3;
        return q4Var3;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.k51 k51Var;
        if (i10 == NotificationCenter.starBalanceUpdated) {
            m0(getUserConfig().getCurrentUser());
            org.telegram.ui.Components.k51 k51Var2 = this.f44306c;
            if (k51Var2 != null) {
                k51Var2.U2.N(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.updateInterfaces) {
            m0(getUserConfig().getCurrentUser());
        } else {
            if (i10 != NotificationCenter.newSuggestionsAvailable || (k51Var = this.f44306c) == null) {
                return;
            }
            k51Var.U2.N(true);
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
    public final cu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    public final void i0() {
        jg.e eVar;
        if (Build.VERSION.SDK_INT < 31 || (eVar = this.R) == null) {
            return;
        }
        int iDp = AndroidUtilities.dp(48.0f);
        int measuredHeight = (this.fragmentView.getMeasuredHeight() - this.O) - AndroidUtilities.dp(8.0f);
        int iDp2 = measuredHeight - AndroidUtilities.dp(56.0f);
        this.W.set(0.0f, -iDp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + iDp);
        RectF rectF = this.X;
        rectF.set(0.0f, iDp2, this.fragmentView.getMeasuredWidth(), measuredHeight);
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        eVar.g(this.I ? 2 : 1, this.V);
        eVar.e(this.U, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !this.f44304a.f48498f;
    }

    public final void j0() {
        org.telegram.ui.ActionBar.v0 v0Var = this.f44308f;
        ud.a aVar = this.f44304a;
        org.telegram.ui.Components.m10.d(v0Var, 1.0f - aVar.f48497e);
        org.telegram.ui.Components.m10.d(this.actionBar.getBackButton(), AndroidUtilities.lerp(this.I ? 0.0f : 1.0f, 1.0f, aVar.f48497e));
    }

    public final void l0(org.telegram.ui.ActionBar.n2 n2Var) {
        LaunchActivity launchActivity;
        ActionBarLayout actionBarLayout;
        if (!AndroidUtilities.isTablet() || (launchActivity = LaunchActivity.C1) == null || (actionBarLayout = launchActivity.f35525o0) == null) {
            presentFragment(n2Var);
            return;
        }
        if (!actionBarLayout.getFragmentStack().isEmpty()) {
            while (actionBarLayout.getFragmentStack().size() - 1 > 0) {
                actionBarLayout.a0((org.telegram.ui.ActionBar.n2) actionBarLayout.getFragmentStack().get(0), false);
            }
            actionBarLayout.l(false, false);
        }
        org.telegram.ui.ActionBar.z4 z4Var = new org.telegram.ui.ActionBar.z4(n2Var);
        z4Var.f24001c = true;
        z4Var.f24004g = true;
        actionBarLayout.R(z4Var);
    }

    public final void m0(TLRPC.User user) {
        String string;
        String str;
        if (this.B != null && this.Q == -1) {
            this.A.r(user);
            this.B.e(user, this.A);
            this.F.setText(UserObject.getUserName(user));
            StringBuilder sb2 = new StringBuilder();
            if (user != null) {
                sb2.append(oe.b.c().b("+" + user.phone));
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
                int i10 = packageInfo.versionCode;
                int i11 = i10 / 10;
                int i12 = i10 % 10;
                if (i12 == 1 || i12 == 2) {
                    str = "store bundled " + Build.CPU_ABI + " " + Build.CPU_ABI2;
                } else if (ApplicationLoader.isStandaloneBuild()) {
                    str = "direct " + Build.CPU_ABI + " " + Build.CPU_ABI2;
                } else {
                    str = "universal " + Build.CPU_ABI + " " + Build.CPU_ABI2;
                }
                int i13 = R.string.TelegramVersion;
                Locale locale = Locale.US;
                string = LocaleController.formatString(i13, "v" + packageInfo.versionName + " (" + i11 + ")\n" + str);
            } catch (Exception e9) {
                FileLog.e(e9);
                string = null;
            }
            textView.setText(string);
        }
    }

    public final void n0(boolean z10, boolean z11) {
        if (this.f44311s == null) {
            return;
        }
        AnimatorSet animatorSet = this.f44310r;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f44310r = null;
        }
        if (!z11) {
            if (z10) {
                this.f44311s.setAlpha(1.0f);
                this.f44311s.setVisibility(0);
                return;
            } else {
                this.f44311s.setAlpha(0.0f);
                this.f44311s.setVisibility(4);
                return;
            }
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f44310r = animatorSet2;
        if (z10) {
            this.f44311s.setVisibility(0);
            this.f44310r.playTogether(ObjectAnimator.ofFloat(this.f44311s, (Property<org.telegram.ui.Cells.w3, Float>) View.ALPHA, 1.0f));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.f44311s, (Property<org.telegram.ui.Cells.w3, Float>) View.ALPHA, 0.0f));
        }
        this.f44310r.setDuration(180L);
        this.f44310r.addListener(new n40(10, this, z10));
        this.f44310r.start();
    }

    @Override
    public final void o(int i10, float f10, float f11, ud.c cVar) {
        if (i10 == 0) {
            j0();
        }
    }

    public final void o0(boolean z10, boolean z11) {
        boolean z12;
        org.telegram.ui.ActionBar.q0 q0Var = this.f44307e.B;
        if (q0Var == null || q0Var.getTag() == null) {
            if (this.f44306c.getChildCount() > 0) {
                View childAt = this.f44306c.getChildAt(0);
                this.f44306c.getClass();
                z12 = RecyclerView.R(childAt) > 0 || childAt.getY() + ((float) childAt.getHeight()) < ((float) this.actionBar.getHeight());
            }
        }
        if (this.L != z12 || z10) {
            this.L = z12;
            ValueAnimator valueAnimator = this.M;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.M = null;
            }
            if (!z11) {
                this.actionBar.getTitlesContainer().setAlpha(z12 ? 1.0f : 0.0f);
                this.d.setAlpha(z12 ? 1.0f : 0.0f);
                return;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.actionBar.getTitlesContainer().getAlpha(), z12 ? 1.0f : 0.0f);
            this.M = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new w01(this, 11));
            this.M.setInterpolator(org.telegram.ui.Components.er.h);
            this.M.setDuration(420L);
            this.M.start();
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (!kVar.f23578j0) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        kVar.h(true);
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.starBalanceUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.newSuggestionsAvailable);
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.I = bundle.getBoolean("hasMainTabs", false);
        }
        this.P = this.I ? AndroidUtilities.dp(72.0f) : 0;
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
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        kVar.setTitleColor(getThemedColor(i10));
        this.actionBar.D(getThemedColor(i10), false);
        this.f44305b.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.g6.f22999a7));
        this.F.setTextColor(getThemedColor(i10));
        this.G.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23423y6));
        this.f44307e.N();
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6);
        this.J.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.g6.l1(0.0f, themedColor), themedColor}));
        this.d.invalidate();
        this.f44306c.invalidate();
    }

    @Override
    public final void t() {
        this.f44306c.x0(0);
    }

    @Override
    public final boolean v() {
        return false;
    }

    @Override
    public final og.d z() {
        return this.T;
    }

    public x71(Bundle bundle) {
        super(bundle);
        this.f44304a = new ud.a(0, this, org.telegram.ui.Components.er.h, 350L, false);
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
            this.R = new jg.e(false);
            this.S = new og.d(null);
            this.T = new og.d(null);
        } else {
            this.R = null;
            this.S = null;
            this.T = null;
        }
    }

    @Override
    public final void P() {
    }

    @Override
    public final void A(float f10, int i10) {
    }
}
