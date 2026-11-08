package org.telegram.ui;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ConfigurationInfo;
import android.graphics.RectF;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Set;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class wu0 implements org.telegram.ui.Components.dj0 {
    public int f51517a = 0;
    public final Context f51518b;
    public final ProfileActivity f51519c;

    public wu0(ProfileActivity profileActivity, Context context) {
        this.f51519c = profileActivity;
        this.f51518b = context;
    }

    public static void a(wu0 wu0Var, Context context, int i7) {
        int i10;
        int i11;
        int i12;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Long l10;
        Long l11;
        int i13;
        long j3;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20 = org.telegram.messenger.qs.f25072s1;
        if (i7 == 0) {
            wu0Var.f51519c.getUserConfig().U = true;
            wu0Var.f51519c.getUserConfig().v(false);
            ProfileActivity profileActivity = wu0Var.f51519c;
            RectF rectF = ProfileActivity.S6;
            profileActivity.getContactsController().l();
        } else if (i7 == 1) {
            ProfileActivity profileActivity2 = wu0Var.f51519c;
            RectF rectF2 = ProfileActivity.S6;
            profileActivity2.getContactsController().A(0L, false);
        } else if (i7 == 2) {
            ProfileActivity profileActivity3 = wu0Var.f51519c;
            RectF rectF3 = ProfileActivity.S6;
            profileActivity3.getContactsController().K();
        } else if (i7 == 3) {
            wu0Var.f51519c.getMessagesController().A0();
        } else if (i7 == 4) {
            org.telegram.messenger.r2.f25212a = !org.telegram.messenger.r2.f25212a;
            org.telegram.messenger.t0.f25566b.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", org.telegram.messenger.r2.f25212a).commit();
            ProfileActivity profileActivity4 = wu0Var.f51519c;
            RectF rectF4 = ProfileActivity.S6;
            profileActivity4.J5();
            wu0Var.f51519c.d.f();
            if (org.telegram.messenger.r2.f25212a) {
                jg.g.u(org.telegram.messenger.t0.f25572s, new StringBuilder("app start time = "));
                try {
                    org.telegram.messenger.a8.b("buildVersion = " + org.telegram.messenger.t0.f25566b.getPackageManager().getPackageInfo(org.telegram.messenger.t0.f25566b.getPackageName(), 0).versionCode);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        } else if (i7 == 5) {
            org.telegram.messenger.iz.f23452y0 = !org.telegram.messenger.iz.f23452y0;
            SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
            edit.putBoolean("inappCamera", org.telegram.messenger.iz.f23452y0);
            edit.apply();
        } else if (i7 == 6) {
            org.telegram.messenger.yr messagesStorage = wu0Var.f51519c.getMessagesStorage();
            messagesStorage.f26719a.c(new org.telegram.messenger.rq(messagesStorage, 11));
            org.telegram.messenger.iz.D(false);
            org.telegram.messenger.k5.d(org.telegram.messenger.k5.d(org.telegram.messenger.k5.d(org.telegram.messenger.k5.d(org.telegram.messenger.k5.d(org.telegram.messenger.k5.d(org.telegram.messenger.k5.d(org.telegram.messenger.k5.d(org.telegram.messenger.k5.d(org.telegram.messenger.qp.e1().edit().remove("archivehint").remove("proximityhint"), "archivehint_l", "searchpostsnew", "speedhint", "gifhint"), "reminderhint", "soundHint", "themehint", "bganimationhint"), "filterhint", "n_0", "storyprvhint", "storyhint"), "storyhint2", "storydualhint", "storysvddualhint", "stories_camera"), "dualcam", "dualmatrix", "dual_available", "archivehint"), "askNotificationsAfter", "askNotificationsDuration", "viewoncehint", "voicepausehint"), "taptostorysoundhint", "nothanos", "voiceoncehint", "savedhint"), "savedsearchhint", "savedsearchtaghint", "newppsms", "monetizationadshint"), "seekSpeedHintShowed", "unsupport_video/av01", "statusgiftpage", "multistorieshint").remove("trimvoicehint").remove("taptostoryhighlighthint").apply();
            c8.ga.a();
            i15 = ((org.telegram.ui.ActionBar.f2) wu0Var.f51519c).currentAccount;
            org.telegram.messenger.qp.s1(i15).f24784f7.edit().remove("featured_hidden").remove("emoji_featured_hidden").commit();
            org.telegram.messenger.iz.J = 0;
            org.telegram.messenger.iz.O = 0;
            org.telegram.messenger.iz.R = false;
            org.telegram.messenger.iz.P = false;
            org.telegram.messenger.iz.Q = false;
            org.telegram.messenger.iz.f23393c1 = 3;
            org.telegram.messenger.iz.f23395d1 = 3;
            org.telegram.messenger.iz.f23398e1 = 3;
            org.telegram.messenger.iz.f23444v1 = 3;
            org.telegram.messenger.iz.f23397e0 = 2;
            org.telegram.messenger.iz.T(2);
            org.telegram.messenger.iz.H(false);
            org.telegram.messenger.iz.G(false);
            org.telegram.messenger.iz.C(false);
            i16 = ((org.telegram.ui.ActionBar.f2) wu0Var.f51519c).currentAccount;
            org.telegram.messenger.d4 f10 = org.telegram.messenger.d4.f(i16);
            f10.f21981c = 0L;
            f10.d = 0L;
            f10.h().edit().clear().apply();
            wu0Var.f51519c.getNotificationCenter().k(i20, new Object[0]);
            qy0.b0();
            i17 = ((org.telegram.ui.ActionBar.f2) wu0Var.f51519c).currentAccount;
            sg.l0.e(i17).a();
            SharedPreferences sharedPreferences = wu0Var.f51519c.getMessagesController().f24774e7;
            SharedPreferences.Editor edit2 = sharedPreferences.edit();
            org.telegram.messenger.k5.d(edit2, "peerColors", "profilePeerColors", "boostingappearance", "bizbothint").remove("movecaptionhint");
            for (String str6 : sharedPreferences.getAll().keySet()) {
                if (str6.contains("show_gift_for_") || str6.contains("bdayhint_") || str6.contains("bdayanim_") || str6.startsWith("ask_paid_message_") || str6.startsWith("topicssidetabs")) {
                    edit2.remove(str6);
                }
            }
            edit2.apply();
            i18 = ((org.telegram.ui.ActionBar.f2) wu0Var.f51519c).currentAccount;
            SharedPreferences.Editor edit3 = org.telegram.messenger.qp.s1(i18).f24764d7.edit();
            i19 = ((org.telegram.ui.ActionBar.f2) wu0Var.f51519c).currentAccount;
            for (String str7 : org.telegram.messenger.qp.s1(i19).f24764d7.getAll().keySet()) {
                if (str7.startsWith("dialog_bar_botver")) {
                    edit3.remove(str7);
                }
            }
            edit3.apply();
        } else if (i7 == 7) {
            org.telegram.ui.Components.voip.y1.i(wu0Var.f51519c.getParentActivity());
        } else if (i7 == 8) {
            org.telegram.messenger.iz.f23455z0 = !org.telegram.messenger.iz.f23455z0;
            SharedPreferences.Editor edit4 = org.telegram.messenger.qp.e1().edit();
            edit4.putBoolean("roundCamera16to9", org.telegram.messenger.iz.f23455z0);
            edit4.apply();
        } else if (i7 == 9) {
            ((LaunchActivity) wu0Var.f51519c.getParentActivity()).z(true);
        } else if (i7 == 10) {
            org.telegram.messenger.yr messagesStorage2 = wu0Var.f51519c.getMessagesStorage();
            messagesStorage2.f26719a.c(new org.telegram.messenger.tp(messagesStorage2, -1, 3));
        } else if (i7 == 11) {
            org.telegram.messenger.iz.V = !org.telegram.messenger.iz.V;
            SharedPreferences.Editor edit5 = org.telegram.messenger.qp.e1().edit();
            edit5.putBoolean("disableVoiceAudioEffects", org.telegram.messenger.iz.V);
            edit5.apply();
        } else if (i7 == 12) {
            org.telegram.messenger.iz.f23412j1 = null;
            org.telegram.messenger.iz.y();
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.Q4, new Object[0]);
        } else if (i7 == 13) {
            Set set = wu0Var.f51519c.getMessagesController().S3;
            set.add("VALIDATE_PHONE_NUMBER");
            set.add("VALIDATE_PASSWORD");
            wu0Var.f51519c.getNotificationCenter().k(i20, new Object[0]);
        } else {
            try {
                if (i7 == 14) {
                    org.telegram.messenger.t0.f25566b.deleteDatabase("webview.db");
                    org.telegram.messenger.t0.f25566b.deleteDatabase("webviewCache.db");
                    WebStorage.getInstance().deleteAllData();
                    WebView webView = new WebView(org.telegram.messenger.t0.f25566b);
                    webView.clearHistory();
                    webView.destroy();
                } else if (i7 == 15) {
                    CookieManager cookieManager = CookieManager.getInstance();
                    cookieManager.removeAllCookies(null);
                    cookieManager.flush();
                } else if (i7 == 16) {
                    org.telegram.messenger.iz.K();
                    Activity parentActivity = wu0Var.f51519c.getParentActivity();
                    if (org.telegram.messenger.iz.J0) {
                        i14 = 2131751619;
                    } else {
                        i14 = 2131751620;
                    }
                    Toast.makeText(parentActivity, org.telegram.messenger.id.M0(i14, null), 0).show();
                } else if (i7 == 17) {
                    org.telegram.messenger.iz.W = !org.telegram.messenger.iz.W;
                    SharedPreferences.Editor edit6 = org.telegram.messenger.qp.e1().edit();
                    edit6.putBoolean("forceDisableTabletMode", org.telegram.messenger.iz.W);
                    edit6.apply();
                    Activity W = org.telegram.messenger.g0.W(context);
                    Intent launchIntentForPackage = W.getPackageManager().getLaunchIntentForPackage(W.getPackageName());
                    W.finishAffinity();
                    W.startActivity(launchIntentForPackage);
                    System.exit(0);
                } else if (i7 == 18) {
                    c8.nb.a((LaunchActivity) wu0Var.f51519c.getParentActivity(), !org.telegram.messenger.iz.f23450x1, true);
                } else if (i7 == 19) {
                    wu0Var.f51519c.getMessagesController().R2(true);
                    TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                    tL_help_dismissSuggestion.suggestion = "VALIDATE_PHONE_NUMBER";
                    tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                    wu0Var.f51519c.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new uu0(wu0Var, 0));
                } else if (i7 == 20) {
                    int i21 = ConnectionsManager.CPU_COUNT;
                    int memoryClass = ((ActivityManager) org.telegram.messenger.t0.f25566b.getSystemService("activity")).getMemoryClass();
                    StringBuilder sb2 = new StringBuilder();
                    int i22 = 0;
                    long j10 = 0;
                    long j11 = 0;
                    long j12 = 0;
                    long j13 = 0;
                    long j14 = 0;
                    long j15 = 0;
                    long j16 = 0;
                    long j17 = 0;
                    while (i22 < i21) {
                        Long i110 = org.telegram.messenger.g0.i1("/sys/devices/system/cpu/cpu" + i22 + "/cpufreq/cpuinfo_min_freq");
                        Long i111 = org.telegram.messenger.g0.i1("/sys/devices/system/cpu/cpu" + i22 + "/cpufreq/cpuinfo_cur_freq");
                        Long i112 = org.telegram.messenger.g0.i1("/sys/devices/system/cpu/cpu" + i22 + "/cpufreq/cpuinfo_max_freq");
                        Long i113 = org.telegram.messenger.g0.i1("/sys/devices/system/cpu/cpu" + i22 + "/cpu_capacity");
                        sb2.append("#");
                        sb2.append(i22);
                        sb2.append(" ");
                        if (i110 != null) {
                            sb2.append("min=");
                            long longValue = i110.longValue();
                            i13 = i22;
                            sb2.append(longValue / 1000);
                            sb2.append(" ");
                            j11++;
                            j10 = (i110.longValue() / 1000) + j10;
                        } else {
                            i13 = i22;
                        }
                        if (i111 != null) {
                            sb2.append("cur=");
                            j3 = j10;
                            sb2.append(i111.longValue() / 1000);
                            sb2.append(" ");
                            j12 += i111.longValue() / 1000;
                            j13++;
                        } else {
                            j3 = j10;
                        }
                        if (i112 != null) {
                            sb2.append("max=");
                            sb2.append(i112.longValue() / 1000);
                            sb2.append(" ");
                            j14 = (i112.longValue() / 1000) + j14;
                            j15++;
                        }
                        if (i113 != null) {
                            sb2.append("cpc=");
                            sb2.append(i113);
                            sb2.append(" ");
                            j16 = i113.longValue() + j16;
                            j17++;
                        }
                        sb2.append("\n");
                        i22 = i13 + 1;
                        j10 = j3;
                    }
                    long j18 = j10;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(Build.MANUFACTURER);
                    sb3.append(", ");
                    sb3.append(Build.MODEL);
                    sb3.append(" (");
                    sb3.append(Build.PRODUCT);
                    sb3.append(", ");
                    sb3.append(Build.DEVICE);
                    sb3.append(")  (android ");
                    int i23 = Build.VERSION.SDK_INT;
                    sb3.append(i23);
                    sb3.append(")\n");
                    if (i23 >= 31) {
                        sb3.append("SoC: ");
                        sb3.append(Build.SOC_MANUFACTURER);
                        sb3.append(", ");
                        sb3.append(Build.SOC_MODEL);
                        sb3.append("\n");
                    }
                    String j19 = org.telegram.messenger.g0.j1("/sys/kernel/gpu/gpu_model");
                    if (j19 != null) {
                        sb3.append("GPU: ");
                        sb3.append(j19);
                        Long i114 = org.telegram.messenger.g0.i1("/sys/kernel/gpu/gpu_min_clock");
                        Long i115 = org.telegram.messenger.g0.i1("/sys/kernel/gpu/gpu_mm_min_clock");
                        Long i116 = org.telegram.messenger.g0.i1("/sys/kernel/gpu/gpu_max_clock");
                        if (i114 != null) {
                            sb3.append(", min=");
                            long longValue2 = i114.longValue();
                            l10 = i115;
                            l11 = i116;
                            sb3.append(longValue2 / 1000);
                        } else {
                            l10 = i115;
                            l11 = i116;
                        }
                        if (l10 != null) {
                            sb3.append(", mmin=");
                            sb3.append(l10.longValue() / 1000);
                        }
                        if (l11 != null) {
                            sb3.append(", max=");
                            sb3.append(l11.longValue() / 1000);
                        }
                        sb3.append("\n");
                    }
                    ConfigurationInfo deviceConfigurationInfo = ((ActivityManager) org.telegram.messenger.t0.f25566b.getSystemService("activity")).getDeviceConfigurationInfo();
                    sb3.append("GLES Version: ");
                    sb3.append(deviceConfigurationInfo.getGlEsVersion());
                    sb3.append("\nMemory: class=");
                    sb3.append(org.telegram.messenger.g0.i0(memoryClass * 1048576, false, false));
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    ((ActivityManager) org.telegram.messenger.t0.f25566b.getSystemService("activity")).getMemoryInfo(memoryInfo);
                    sb3.append(", total=");
                    sb3.append(org.telegram.messenger.g0.i0(memoryInfo.totalMem, false, false));
                    sb3.append(", avail=");
                    sb3.append(org.telegram.messenger.g0.i0(memoryInfo.availMem, false, false));
                    sb3.append(", low?=");
                    sb3.append(memoryInfo.lowMemory);
                    sb3.append(" (threshold=");
                    sb3.append(org.telegram.messenger.g0.i0(memoryInfo.threshold, false, false));
                    sb3.append(")\nCurrent class: ");
                    sb3.append(org.telegram.messenger.iz.x(org.telegram.messenger.iz.o()));
                    sb3.append(", measured: ");
                    sb3.append(org.telegram.messenger.iz.x(org.telegram.messenger.iz.v()));
                    if (i23 >= 31) {
                        sb3.append(", suggest=");
                        sb3.append(Build.VERSION.MEDIA_PERFORMANCE_CLASS);
                    }
                    sb3.append("\n");
                    sb3.append(i21);
                    sb3.append(" CPUs");
                    if (j11 > 0) {
                        sb3.append(", avgMinFreq=");
                        sb3.append(j18 / j11);
                    }
                    if (j13 > 0) {
                        sb3.append(", avgCurFreq=");
                        sb3.append(j12 / j13);
                    }
                    if (j15 > 0) {
                        sb3.append(", avgMaxFreq=");
                        sb3.append(j14 / j15);
                    }
                    if (j17 > 0) {
                        sb3.append(", avgCapacity=");
                        sb3.append(j16 / j17);
                    }
                    sb3.append("\n");
                    sb3.append((CharSequence) sb2);
                    ProfileActivity.a1(wu0Var.f51519c, "video/avc", sb3);
                    ProfileActivity.a1(wu0Var.f51519c, "video/hevc", sb3);
                    ProfileActivity.a1(wu0Var.f51519c, "video/x-vnd.on2.vp8", sb3);
                    ProfileActivity.a1(wu0Var.f51519c, "video/x-vnd.on2.vp9", sb3);
                    wu0Var.f51519c.showDialog(new vu0(wu0Var, wu0Var.f51519c.getParentActivity(), sb3.toString()));
                } else if (i7 == 21) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wu0Var.f51519c.getParentActivity(), wu0Var.f51519c.f41869z0);
                    alertDialog$Builder.f27296a.R = "Force performance class";
                    int o4 = org.telegram.messenger.iz.o();
                    int v = org.telegram.messenger.iz.v();
                    if (o4 == 2) {
                        str = "**HIGH**";
                    } else {
                        str = "HIGH";
                    }
                    String str8 = "";
                    if (v != 2) {
                        str2 = "";
                    } else {
                        str2 = " (measured)";
                    }
                    SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(str.concat(str2));
                    if (o4 == 1) {
                        str3 = "**AVERAGE**";
                    } else {
                        str3 = "AVERAGE";
                    }
                    if (v != 1) {
                        str4 = "";
                    } else {
                        str4 = " (measured)";
                    }
                    SpannableStringBuilder X22 = org.telegram.messenger.g0.X2(str3.concat(str4));
                    if (o4 == 0) {
                        str5 = "**LOW**";
                    } else {
                        str5 = "LOW";
                    }
                    if (v == 0) {
                        str8 = " (measured)";
                    }
                    alertDialog$Builder.f(new CharSequence[]{X2, X22, org.telegram.messenger.g0.X2(str5.concat(str8))}, new ot(v, 1));
                    jg.g.w("Cancel", 2131752589, alertDialog$Builder, null);
                } else if (i7 == 22) {
                    org.telegram.messenger.iz.N();
                } else if (i7 == 23) {
                    boolean q10 = fi.b1.q(wu0Var.f51519c.getParentActivity());
                    org.telegram.messenger.qp.e1().edit().putBoolean("dual_available", !q10).apply();
                    Activity parentActivity2 = wu0Var.f51519c.getParentActivity();
                    if (!q10) {
                        i12 = 2131751634;
                    } else {
                        i12 = 2131751636;
                    }
                    Toast.makeText(parentActivity2, org.telegram.messenger.id.M0(i12, null), 0).show();
                } else if (i7 == 24) {
                    org.telegram.messenger.iz.O();
                    for (int i24 = 0; i24 < wu0Var.f51519c.getParentLayout().getFragmentStack().size(); i24++) {
                        ((org.telegram.ui.ActionBar.f2) wu0Var.f51519c.getParentLayout().getFragmentStack().get(i24)).clearSheets();
                    }
                } else if (i7 == 25) {
                    org.telegram.messenger.iz.M();
                } else if (i7 == 26) {
                    org.telegram.messenger.iz.L();
                } else if (i7 == 27) {
                    wu0Var.f51519c.getMediaDataController().E0(false, true, null);
                } else if (i7 == 28) {
                    i11 = ((org.telegram.ui.ActionBar.f2) wu0Var.f51519c).currentAccount;
                    org.telegram.messenger.iz.Q(i11);
                } else if (i7 == 29) {
                    hi.p.b();
                    hi.r0.c();
                    hi.g0.a();
                    hi.o4.c();
                } else if (i7 == 30) {
                    org.telegram.messenger.v0.a();
                } else if (i7 == 31) {
                    org.telegram.messenger.iz.R();
                } else if (i7 == 32) {
                    org.telegram.messenger.iz.J();
                } else if (i7 == 33) {
                    org.telegram.messenger.iz.R0 = !org.telegram.messenger.iz.R0;
                    SharedPreferences.Editor edit7 = org.telegram.messenger.qp.e1().edit();
                    edit7.putBoolean("debugVideoQualities", org.telegram.messenger.iz.R0);
                    edit7.apply();
                } else if (i7 == 34) {
                    org.telegram.messenger.iz.V0 = !org.telegram.messenger.iz.V0;
                    org.telegram.messenger.g0.f22535a = null;
                    SharedPreferences.Editor edit8 = org.telegram.messenger.qp.e1().edit();
                    edit8.putBoolean("useSystemBoldFont", org.telegram.messenger.iz.V0);
                    edit8.apply();
                } else if (i7 == 35) {
                    i10 = ((org.telegram.ui.ActionBar.f2) wu0Var.f51519c).currentAccount;
                    org.telegram.messenger.qp.s1(i10).R2(true);
                } else if (i7 == 36) {
                    org.telegram.messenger.iz.f23420n = !org.telegram.messenger.iz.f23420n;
                    SharedPreferences.Editor edit9 = org.telegram.messenger.qp.e1().edit();
                    edit9.putBoolean("forceForumTabs", org.telegram.messenger.iz.f23420n);
                    edit9.apply();
                } else if (i7 == 37) {
                    org.telegram.messenger.a8.j();
                    org.telegram.messenger.a8.c(true);
                } else if (i7 == 38) {
                    org.telegram.messenger.iz.f23422o = !org.telegram.messenger.iz.f23422o;
                    SharedPreferences.Editor edit10 = org.telegram.messenger.qp.e1().edit();
                    edit10.putBoolean("fastWallpaperDisabled", org.telegram.messenger.iz.f23422o);
                    edit10.apply();
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final boolean c(int i7, View view) {
        TLRPC.ChatParticipant chatParticipant;
        String str;
        int i10;
        int i11;
        String str2;
        String str3;
        String str4;
        int i12;
        String str5;
        String str6;
        String str7;
        String str8;
        char c10;
        String str9;
        String str10;
        int i13;
        ProfileActivity profileActivity = this.f51519c;
        ArrayList arrayList = profileActivity.Q4;
        if (i7 == profileActivity.f41865y3) {
            int i14 = this.f51517a + 1;
            this.f51517a = i14;
            if (i14 < 2) {
                boolean z9 = org.telegram.messenger.r2.f25212a;
                try {
                    Toast.makeText(profileActivity.getParentActivity(), org.telegram.messenger.id.M0(2131751626, "DebugMenuLongPress"), 0).show();
                    return true;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return true;
                }
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.f41869z0);
            String M0 = org.telegram.messenger.id.M0(2131751647, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
            u1Var.R = M0;
            String M02 = org.telegram.messenger.id.M0(2131751630, null);
            String M03 = org.telegram.messenger.id.M0(2131751624, null);
            String M04 = org.telegram.messenger.id.M0(2131751623, null);
            String M05 = org.telegram.messenger.id.M0(2131751622, null);
            boolean z10 = org.telegram.messenger.r2.f25212a;
            if (org.telegram.messenger.iz.f23452y0) {
                str = "DebugMenuDisableCamera";
                i10 = 2131751641;
            } else {
                str = "DebugMenuEnableCamera";
                i10 = 2131751633;
            }
            String M06 = org.telegram.messenger.id.M0(i10, str);
            String M07 = org.telegram.messenger.id.M0(2131751644, "DebugMenuClearMediaCache");
            String M08 = org.telegram.messenger.id.M0(2131751646, null);
            org.telegram.messenger.t0.u();
            org.telegram.messenger.t0.n();
            String M09 = org.telegram.messenger.id.M0(2131751645, "DebugMenuCheckAppUpdate");
            String M010 = org.telegram.messenger.id.M0(2131751625, "DebugMenuReadAllDialogs");
            String M011 = org.telegram.messenger.id.M0(2131751642, null);
            if (org.telegram.messenger.iz.J0) {
                i11 = 2131751639;
            } else {
                i11 = 2131751631;
            }
            String M012 = org.telegram.messenger.id.M0(i11, null);
            org.telegram.messenger.g0.R1();
            if (fi.b1.q(profileActivity.getParentActivity())) {
                str2 = "DebugMenuDualOff";
            } else {
                str2 = "DebugMenuDualOn";
            }
            String N0 = org.telegram.messenger.id.N0(str2);
            if (org.telegram.messenger.iz.f23389b0) {
                str3 = "back to TextureView in stories";
            } else {
                str3 = "use SurfaceView in stories";
            }
            if (!org.telegram.messenger.iz.f23394d0) {
                str4 = "Enable Invoice Payment";
            } else {
                str4 = "Disable Invoice Payment";
            }
            i12 = ((org.telegram.ui.ActionBar.f2) profileActivity).currentAccount;
            if (!org.telegram.messenger.iz.s(i12)) {
                str5 = "Use Camera 2 API";
            } else {
                str5 = "Use old Camera 1 API";
            }
            if (org.telegram.messenger.iz.e() && Build.VERSION.SDK_INT >= 31) {
                if (org.telegram.messenger.iz.f23386a0) {
                    str6 = "back to cpu blur";
                } else {
                    str6 = "use new gpu blur";
                }
            } else {
                str6 = null;
            }
            if (org.telegram.messenger.iz.f23443v0) {
                str7 = "Disabled adaptive browser colors";
            } else {
                str7 = "Enable adaptive browser colors";
            }
            if (org.telegram.messenger.iz.R0) {
                str8 = "Disable video qualities debug";
            } else {
                str8 = "Enable video qualities debug";
            }
            String str11 = str6;
            if (Build.VERSION.SDK_INT >= 28) {
                if (org.telegram.messenger.iz.V0) {
                    i13 = 2131751638;
                } else {
                    i13 = 2131751621;
                }
                c10 = 28;
                str9 = org.telegram.messenger.id.M0(i13, null);
            } else {
                c10 = 28;
                str9 = null;
            }
            if (!org.telegram.messenger.iz.f23420n) {
                str10 = "Force Forum Tabs";
            } else {
                str10 = "Do Not Force Forum Tabs";
            }
            String str12 = str10;
            CharSequence[] charSequenceArr = new CharSequence[39];
            charSequenceArr[0] = M02;
            charSequenceArr[1] = M03;
            charSequenceArr[2] = M04;
            charSequenceArr[3] = M05;
            charSequenceArr[4] = null;
            charSequenceArr[5] = M06;
            charSequenceArr[6] = M07;
            charSequenceArr[7] = M08;
            charSequenceArr[8] = null;
            charSequenceArr[9] = M09;
            charSequenceArr[10] = M010;
            charSequenceArr[11] = null;
            charSequenceArr[12] = null;
            charSequenceArr[13] = null;
            charSequenceArr[14] = null;
            charSequenceArr[15] = M011;
            charSequenceArr[16] = M012;
            charSequenceArr[17] = null;
            charSequenceArr[18] = null;
            charSequenceArr[19] = null;
            charSequenceArr[20] = null;
            charSequenceArr[21] = null;
            charSequenceArr[22] = null;
            charSequenceArr[23] = N0;
            charSequenceArr[24] = str3;
            charSequenceArr[25] = null;
            charSequenceArr[26] = str4;
            charSequenceArr[27] = null;
            charSequenceArr[c10] = str5;
            charSequenceArr[29] = "Clear Mini Apps Permissions and Files";
            charSequenceArr[30] = null;
            charSequenceArr[31] = str11;
            charSequenceArr[32] = str7;
            charSequenceArr[33] = str8;
            charSequenceArr[34] = str9;
            charSequenceArr[35] = "Reload app config";
            charSequenceArr[36] = str12;
            charSequenceArr[37] = "Make Memory Dump";
            charSequenceArr[38] = null;
            alertDialog$Builder.f(charSequenceArr, new og.j(10, this, this.f51518b));
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, "Cancel"), null);
            profileActivity.showDialog(u1Var);
            return true;
        } else if (i7 >= profileActivity.f41829t4 && i7 < profileActivity.f41835u4) {
            if (!profileActivity.B2.isEmpty()) {
                chatParticipant = (TLRPC.ChatParticipant) arrayList.get(((Integer) profileActivity.B2.get(i7 - profileActivity.f41829t4)).intValue());
            } else {
                chatParticipant = (TLRPC.ChatParticipant) arrayList.get(i7 - profileActivity.f41829t4);
            }
            return profileActivity.h(chatParticipant, true, false, view);
        } else if (i7 == profileActivity.T2) {
            if (profileActivity.Z3(i7, view)) {
                return true;
            }
            TLRPC.UserFull userFull = profileActivity.f41833u2;
            if (userFull == null) {
                return false;
            }
            try {
                org.telegram.messenger.g0.g(UserInfoActivity.e0(userFull.birthday));
                org.telegram.ui.Components.hc.a0(profileActivity).i(org.telegram.messenger.id.M0(2131753716, null)).j();
                return true;
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
                return true;
            }
        } else if (i7 == profileActivity.G3) {
            profileActivity.Y3(i7, view);
            return true;
        } else if (profileActivity.Z3(i7, view)) {
            return true;
        } else {
            return profileActivity.Q4(view.getWidth() / 2.0f, (int) (view.getHeight() * 0.75f), i7, view);
        }
    }
}
