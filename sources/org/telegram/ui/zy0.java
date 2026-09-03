package org.telegram.ui;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ConfigurationInfo;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.webkit.CookieManager;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.Toast;
import java.util.Set;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.AuthTokensHelper;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class zy0 implements org.telegram.ui.Components.kl0 {
    public int f44045a = 0;
    public final Context f44046b;
    public final ProfileActivity f44047c;

    public zy0(ProfileActivity profileActivity, Context context) {
        this.f44047c = profileActivity;
        this.f44046b = context;
    }

    public static void a(zy0 zy0Var, Context context, int i10) {
        int i11;
        int i12;
        int i13;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        long j10;
        Long l10;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20 = 0;
        if (i10 == 0) {
            zy0Var.f44047c.getUserConfig().syncContacts = true;
            zy0Var.f44047c.getUserConfig().saveConfig(false);
            zy0Var.f44047c.getContactsController().forceImportContacts();
            return;
        }
        long j11 = 0;
        if (i10 == 1) {
            zy0Var.f44047c.getContactsController().loadContacts(false, 0L);
        } else if (i10 == 2) {
            zy0Var.f44047c.getContactsController().resetImportedContacts();
        } else if (i10 == 3) {
            zy0Var.f44047c.getMessagesController().forceResetDialogs();
        } else if (i10 == 4) {
            BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
            ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
            zy0Var.f44047c.j5();
            zy0Var.f44047c.d.l();
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
            zy0Var.f44047c.getMessagesStorage().clearSentMedia();
            SharedConfig.setNoSoundHintShowed(false);
            org.telegram.messenger.y3.d(org.telegram.messenger.y3.d(org.telegram.messenger.y3.d(org.telegram.messenger.y3.d(org.telegram.messenger.y3.d(org.telegram.messenger.y3.d(org.telegram.messenger.y3.d(org.telegram.messenger.y3.d(org.telegram.messenger.y3.d(MessagesController.getGlobalMainSettings().edit().remove("archivehint").remove("proximityhint").remove("archivehint_l"), "searchpostsnew", "speedhint", "gifhint", "reminderhint"), "soundHint", "themehint", "bganimationhint", "filterhint"), "n_0", "storyprvhint", "storyhint", "storyhint2"), "storydualhint", "storysvddualhint", "stories_camera", "dualcam"), "dualmatrix", "dual_available", "archivehint", "askNotificationsAfter"), "askNotificationsDuration", "viewoncehint", "voicepausehint", "taptostorysoundhint"), "nothanos", "voiceoncehint", "savedhint", "savedsearchhint"), "savedsearchtaghint", "newppsms", "monetizationadshint", "seekSpeedHintShowed"), "unsupport_video/av01", "statusgiftpage", "multistorieshint", "trimvoicehint").remove("taptostoryhighlighthint").apply();
            k7.b6.a();
            i15 = ((org.telegram.ui.ActionBar.p2) zy0Var.f44047c).currentAccount;
            MessagesController.getEmojiSettings(i15).edit().remove("featured_hidden").remove("emoji_featured_hidden").commit();
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
            i16 = ((org.telegram.ui.ActionBar.p2) zy0Var.f44047c).currentAccount;
            ChatThemeController.getInstance(i16).clearCache();
            zy0Var.f44047c.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
            t31.W();
            i17 = ((org.telegram.ui.ActionBar.p2) zy0Var.f44047c).currentAccount;
            dg.e1.e(i17).a();
            SharedPreferences mainSettings = zy0Var.f44047c.getMessagesController().getMainSettings();
            SharedPreferences.Editor edit = mainSettings.edit();
            org.telegram.messenger.y3.d(edit, "peerColors", "profilePeerColors", "boostingappearance", "bizbothint").remove("movecaptionhint");
            for (String str6 : mainSettings.getAll().keySet()) {
                if (str6.contains("show_gift_for_") || str6.contains("bdayhint_") || str6.contains("bdayanim_") || str6.startsWith("ask_paid_message_") || str6.startsWith("topicssidetabs")) {
                    edit.remove(str6);
                }
            }
            edit.apply();
            i18 = ((org.telegram.ui.ActionBar.p2) zy0Var.f44047c).currentAccount;
            SharedPreferences.Editor edit2 = MessagesController.getNotificationsSettings(i18).edit();
            i19 = ((org.telegram.ui.ActionBar.p2) zy0Var.f44047c).currentAccount;
            for (String str7 : MessagesController.getNotificationsSettings(i19).getAll().keySet()) {
                if (str7.startsWith("dialog_bar_botver")) {
                    edit2.remove(str7);
                }
            }
            edit2.apply();
        } else if (i10 == 7) {
            org.telegram.ui.Components.voip.g2.i(zy0Var.f44047c.getParentActivity());
        } else if (i10 == 8) {
            SharedConfig.toggleRoundCamera16to9();
        } else if (i10 == 9) {
            ((LaunchActivity) zy0Var.f44047c.getParentActivity()).z(true);
        } else if (i10 == 10) {
            zy0Var.f44047c.getMessagesStorage().readAllDialogs(-1);
        } else if (i10 == 11) {
            SharedConfig.toggleDisableVoiceAudioEffects();
        } else if (i10 == 12) {
            SharedConfig.pendingAppUpdate = null;
            SharedConfig.saveConfig();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
        } else if (i10 == 13) {
            Set<String> set = zy0Var.f44047c.getMessagesController().pendingSuggestions;
            set.add("VALIDATE_PHONE_NUMBER");
            set.add("VALIDATE_PASSWORD");
            zy0Var.f44047c.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
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
                    Activity parentActivity = zy0Var.f44047c.getParentActivity();
                    if (SharedConfig.debugWebView) {
                        i14 = R.string.DebugMenuWebViewDebugEnabled;
                    } else {
                        i14 = R.string.DebugMenuWebViewDebugDisabled;
                    }
                    Toast.makeText(parentActivity, LocaleController.getString(i14), 0).show();
                } else if (i10 == 17) {
                    SharedConfig.toggleForceDisableTabletMode();
                    Activity findActivity = AndroidUtilities.findActivity(context);
                    Intent launchIntentForPackage = findActivity.getPackageManager().getLaunchIntentForPackage(findActivity.getPackageName());
                    findActivity.finishAffinity();
                    findActivity.startActivity(launchIntentForPackage);
                    System.exit(0);
                } else if (i10 == 18) {
                    bb.a.a((LaunchActivity) zy0Var.f44047c.getParentActivity(), !SharedConfig.isFloatingDebugActive, true);
                } else if (i10 == 19) {
                    zy0Var.f44047c.getMessagesController().loadAppConfig();
                    TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                    tL_help_dismissSuggestion.suggestion = "VALIDATE_PHONE_NUMBER";
                    tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                    zy0Var.f44047c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new wy0(zy0Var, 0));
                } else if (i10 == 20) {
                    int i21 = ConnectionsManager.CPU_COUNT;
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
                    while (i20 < i21) {
                        long j20 = j11;
                        Long sysInfoLong = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i20 + "/cpufreq/cpuinfo_min_freq");
                        Long sysInfoLong2 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i20 + "/cpufreq/cpuinfo_cur_freq");
                        Long sysInfoLong3 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i20 + "/cpufreq/cpuinfo_max_freq");
                        Long sysInfoLong4 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i20 + "/cpu_capacity");
                        sb.append("#");
                        sb.append(i20);
                        sb.append(" ");
                        int i22 = i20;
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
                        i20 = i22 + 1;
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
                    int i23 = Build.VERSION.SDK_INT;
                    sb2.append(i23);
                    sb2.append(")\n");
                    if (i23 >= 31) {
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
                    if (i23 >= 31) {
                        sb2.append(", suggest=");
                        sb2.append(Build.VERSION.MEDIA_PERFORMANCE_CLASS);
                    }
                    sb2.append("\n");
                    sb2.append(i21);
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
                    ProfileActivity.S0(zy0Var.f44047c, "video/avc", sb2);
                    ProfileActivity.S0(zy0Var.f44047c, "video/hevc", sb2);
                    ProfileActivity.S0(zy0Var.f44047c, "video/x-vnd.on2.vp8", sb2);
                    ProfileActivity.S0(zy0Var.f44047c, "video/x-vnd.on2.vp9", sb2);
                    zy0Var.f44047c.showDialog(new yy0(zy0Var, zy0Var.f44047c.getParentActivity(), sb2.toString()));
                } else if (i10 == 21) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zy0Var.f44047c.getParentActivity(), 0, zy0Var.f44047c.f34714w0);
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
                    alertDialog$Builder.f(new CharSequence[]{replaceTags, replaceTags2, AndroidUtilities.replaceTags(str5.concat(str8))}, new xy0(measureDevicePerformanceClass, 0));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    alertDialog$Builder.o();
                } else if (i10 == 22) {
                    SharedConfig.toggleRoundCamera();
                } else if (i10 == 23) {
                    boolean q10 = qh.v0.q(zy0Var.f44047c.getParentActivity());
                    MessagesController.getGlobalMainSettings().edit().putBoolean("dual_available", !q10).apply();
                    Activity parentActivity2 = zy0Var.f44047c.getParentActivity();
                    if (!q10) {
                        i13 = R.string.DebugMenuDualOnToast;
                    } else {
                        i13 = R.string.DebugMenuDualOffToast;
                    }
                    Toast.makeText(parentActivity2, LocaleController.getString(i13), 0).show();
                } else if (i10 == 24) {
                    SharedConfig.toggleSurfaceInStories();
                    while (i20 < zy0Var.f44047c.getParentLayout().getFragmentStack().size()) {
                        ((org.telegram.ui.ActionBar.p2) zy0Var.f44047c.getParentLayout().getFragmentStack().get(i20)).clearSheets();
                        i20++;
                    }
                } else if (i10 == 25) {
                    SharedConfig.togglePhotoViewerBlur();
                } else if (i10 == 26) {
                    SharedConfig.togglePaymentByInvoice();
                } else if (i10 == 27) {
                    zy0Var.f44047c.getMediaDataController().loadAttachMenuBots(false, true);
                } else if (i10 == 28) {
                    i12 = ((org.telegram.ui.ActionBar.p2) zy0Var.f44047c).currentAccount;
                    SharedConfig.toggleUseCamera2(i12);
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
                    i11 = ((org.telegram.ui.ActionBar.p2) zy0Var.f44047c).currentAccount;
                    MessagesController.getInstance(i11).loadAppConfig(true);
                } else if (i10 == 36) {
                    SharedConfig.toggleForceForumTabs();
                } else if (i10 == 37) {
                    FileLog.getInstance().dumpMemory(true);
                } else if (i10 == 38) {
                    SharedConfig.toggleFastWallpaperDisabled();
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final boolean f(int r46, android.view.View r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zy0.f(int, android.view.View):boolean");
    }
}
