package org.telegram.ui;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ConfigurationInfo;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
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
public final class vt extends org.telegram.ui.Components.e51 {
    public static void d0(String str, StringBuilder sb2) {
        String[] supportedTypes;
        ArrayList arrayList;
        try {
            int codecCount = MediaCodecList.getCodecCount();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (int i7 = 0; i7 < codecCount; i7++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i7);
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
                            arrayList.add(Integer.valueOf(i7));
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

    @Override
    public final void Z(ArrayList arrayList, org.telegram.ui.Components.c51 c51Var) {
        arrayList.add(org.telegram.ui.Components.o41.u("Contacts and chats"));
        arrayList.add(org.telegram.ui.Components.o41.e(1, org.telegram.messenger.gd.N0(2131751617, null)));
        arrayList.add(org.telegram.ui.Components.o41.e(2, org.telegram.messenger.gd.N0(2131751611, null)));
        arrayList.add(org.telegram.ui.Components.o41.e(3, org.telegram.messenger.gd.N0(2131751610, null)));
        arrayList.add(org.telegram.ui.Components.o41.e(4, org.telegram.messenger.gd.N0(2131751609, null)));
        arrayList.add(org.telegram.ui.Components.o41.e(5, org.telegram.messenger.gd.N0(2131751612, null)));
        arrayList.add(org.telegram.ui.Components.o41.C(null));
        arrayList.add(org.telegram.ui.Components.o41.u("Data"));
        arrayList.add(org.telegram.ui.Components.o41.e(8, org.telegram.messenger.gd.N0(2131751631, null)));
        arrayList.add(org.telegram.ui.Components.o41.e(45, "Forget all hints"));
        arrayList.add(org.telegram.ui.Components.o41.e(35, "Reload app config"));
        boolean z10 = org.telegram.messenger.s2.f26749a;
        arrayList.add(org.telegram.ui.Components.o41.e(29, "Clear Mini Apps Permissions and Files"));
        arrayList.add(org.telegram.ui.Components.o41.C(null));
        arrayList.add(org.telegram.ui.Components.o41.u("App"));
        org.telegram.messenger.t0.u();
        org.telegram.messenger.t0.n();
        arrayList.add(org.telegram.ui.Components.o41.e(10, org.telegram.messenger.gd.N0(2131751632, null)));
        arrayList.add(org.telegram.ui.Components.o41.e(37, "Make Memory Dump"));
        org.telegram.ui.Components.o41 i7 = org.telegram.ui.Components.o41.i(42, "Experimental settings");
        aj.a aVar = aj.e.f1661a;
        aVar.a();
        i7.L(aVar.d);
        arrayList.add(i7);
        arrayList.add(org.telegram.ui.Components.o41.C(null));
        arrayList.add(org.telegram.ui.Components.o41.u("Interface"));
        org.telegram.messenger.g0.R1();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            org.telegram.ui.Components.o41 i11 = org.telegram.ui.Components.o41.i(34, org.telegram.messenger.gd.N0(2131751608, null));
            i11.L(org.telegram.messenger.bz.V0);
            arrayList.add(i11);
        }
        if (org.telegram.messenger.bz.e() && i10 >= 31) {
            org.telegram.ui.Components.o41 i12 = org.telegram.ui.Components.o41.i(31, "New GPU blur");
            i12.L(org.telegram.messenger.bz.f23174a0);
            arrayList.add(i12);
        }
        org.telegram.ui.Components.o41 i13 = org.telegram.ui.Components.o41.i(36, "Force Forum Tabs");
        i13.L(org.telegram.messenger.bz.f23208n);
        arrayList.add(i13);
        org.telegram.ui.Components.o41 i14 = org.telegram.ui.Components.o41.i(39, "Frame metrics");
        i14.L(org.telegram.messenger.bz.f23213p);
        arrayList.add(i14);
        org.telegram.ui.Components.o41 i15 = org.telegram.ui.Components.o41.i(46, org.telegram.messenger.gd.N0(2131751820, null));
        i15.L(org.telegram.messenger.bz.H0);
        arrayList.add(i15);
        arrayList.add(org.telegram.ui.Components.o41.C(null));
        arrayList.add(org.telegram.ui.Components.o41.u("Camera and media"));
        org.telegram.ui.Components.o41 i16 = org.telegram.ui.Components.o41.i(7, org.telegram.messenger.gd.N0(2131751620, null));
        i16.L(org.telegram.messenger.bz.f23240y0);
        arrayList.add(i16);
        org.telegram.ui.Components.o41 i17 = org.telegram.ui.Components.o41.i(28, "Use Camera 2 API");
        i17.L(org.telegram.messenger.bz.s(this.currentAccount));
        arrayList.add(i17);
        org.telegram.ui.Components.o41 i18 = org.telegram.ui.Components.o41.i(23, org.telegram.messenger.gd.N0(2131751622, null));
        i18.L(hi.d1.q(getParentActivity()));
        arrayList.add(i18);
        org.telegram.ui.Components.o41 i19 = org.telegram.ui.Components.o41.i(24, "SurfaceView in stories");
        i19.L(org.telegram.messenger.bz.f23177b0);
        arrayList.add(i19);
        org.telegram.ui.Components.o41 i20 = org.telegram.ui.Components.o41.i(33, "Video qualities debug");
        i20.L(org.telegram.messenger.bz.R0);
        arrayList.add(i20);
        arrayList.add(org.telegram.ui.Components.o41.C(null));
        arrayList.add(org.telegram.ui.Components.o41.u("Calls"));
        arrayList.add(org.telegram.ui.Components.o41.e(9, org.telegram.messenger.gd.N0(2131751633, null)));
        arrayList.add(org.telegram.ui.Components.o41.C(null));
        arrayList.add(org.telegram.ui.Components.o41.u("WebView"));
        arrayList.add(org.telegram.ui.Components.o41.e(15, org.telegram.messenger.gd.N0(2131751629, null)));
        org.telegram.ui.Components.o41 i21 = org.telegram.ui.Components.o41.i(16, org.telegram.messenger.gd.N0(2131751618, null));
        i21.L(org.telegram.messenger.bz.J0);
        arrayList.add(i21);
        org.telegram.ui.Components.o41 i22 = org.telegram.ui.Components.o41.i(32, "Adaptive browser colors");
        i22.L(org.telegram.messenger.bz.f23231v0);
        arrayList.add(i22);
        org.telegram.ui.Components.o41 i23 = org.telegram.ui.Components.o41.i(26, "Invoice Payment");
        i23.L(org.telegram.messenger.bz.f23182d0);
        arrayList.add(i23);
        arrayList.add(org.telegram.ui.Components.o41.C(null));
    }

    @Override
    public final CharSequence a0() {
        return org.telegram.messenger.gd.N0(2131751634, null);
    }

    @Override
    public final void b0(org.telegram.ui.Components.o41 o41Var, View view) {
        boolean z10;
        int i7;
        Long l10;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i10;
        int i11 = 0;
        switch (o41Var.d) {
            case 1:
                z10 = true;
                getUserConfig().V = true;
                getUserConfig().v(false);
                getContactsController().l();
                break;
            case 2:
                getContactsController().A(0L, false);
                z10 = true;
                break;
            case 3:
                getContactsController().K();
                z10 = true;
                break;
            case 4:
                getMessagesController().C0();
                z10 = true;
                break;
            case 5:
                org.telegram.messenger.tr messagesStorage = getMessagesStorage();
                messagesStorage.f27080a.c(new org.telegram.messenger.rp(messagesStorage, -1, 2));
                z10 = true;
                break;
            case 6:
                org.telegram.messenger.s2.f26749a = !org.telegram.messenger.s2.f26749a;
                org.telegram.messenger.t0.f26941b.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", org.telegram.messenger.s2.f26749a).commit();
                if (org.telegram.messenger.s2.f26749a) {
                    i5.c.v(org.telegram.messenger.t0.f26947s, new StringBuilder("app start time = "));
                    try {
                        org.telegram.messenger.a8.b("buildVersion = " + org.telegram.messenger.t0.f26941b.getPackageManager().getPackageInfo(org.telegram.messenger.t0.f26941b.getPackageName(), 0).versionCode);
                    } catch (Exception e10) {
                        z10 = true;
                        org.telegram.messenger.a8.g(e10, true);
                        break;
                    }
                }
                z10 = true;
                break;
            case 7:
                org.telegram.messenger.bz.f23240y0 = !org.telegram.messenger.bz.f23240y0;
                SharedPreferences.Editor edit = org.telegram.messenger.mp.g1().edit();
                edit.putBoolean("inappCamera", org.telegram.messenger.bz.f23240y0);
                edit.apply();
                z10 = true;
                break;
            case 8:
                org.telegram.messenger.tr messagesStorage2 = getMessagesStorage();
                messagesStorage2.f27080a.c(new org.telegram.messenger.pq(messagesStorage2, 11));
                org.telegram.messenger.f4 f10 = org.telegram.messenger.f4.f(this.currentAccount);
                f10.f23860c = 0L;
                f10.d = 0L;
                f10.h().edit().clear().apply();
                getMessagesController().h7.edit().remove("peerColors").remove("profilePeerColors").apply();
                z10 = true;
                break;
            case 9:
                org.telegram.ui.Components.voip.b2.i(getParentActivity());
                z10 = true;
                break;
            case 10:
                z10 = true;
                ((LaunchActivity) getParentActivity()).z(true);
                break;
            case 11:
                z10 = true;
                org.telegram.messenger.bz.V = !org.telegram.messenger.bz.V;
                SharedPreferences.Editor edit2 = org.telegram.messenger.mp.g1().edit();
                edit2.putBoolean("disableVoiceAudioEffects", org.telegram.messenger.bz.V);
                edit2.apply();
                break;
            case 12:
                org.telegram.messenger.bz.f23200j1 = null;
                org.telegram.messenger.bz.y();
                org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.T4, new Object[0]);
                z10 = true;
                break;
            case 13:
                Set set = getMessagesController().V3;
                set.add("VALIDATE_PHONE_NUMBER");
                set.add("VALIDATE_PASSWORD");
                getNotificationCenter().k(org.telegram.messenger.ks.f25214s1, new Object[0]);
                z10 = true;
                break;
            case 14:
                org.telegram.messenger.t0.f26941b.deleteDatabase("webview.db");
                org.telegram.messenger.t0.f26941b.deleteDatabase("webviewCache.db");
                WebStorage.getInstance().deleteAllData();
                try {
                    WebView webView = new WebView(org.telegram.messenger.t0.f26941b);
                    webView.clearHistory();
                    webView.destroy();
                } catch (Exception unused) {
                }
                z10 = true;
                break;
            case 15:
                CookieManager cookieManager = CookieManager.getInstance();
                cookieManager.removeAllCookies(null);
                cookieManager.flush();
                z10 = true;
                break;
            case 16:
                org.telegram.messenger.bz.K();
                Activity parentActivity = getParentActivity();
                if (org.telegram.messenger.bz.J0) {
                    i7 = 2131751606;
                } else {
                    i7 = 2131751607;
                }
                Toast.makeText(parentActivity, org.telegram.messenger.gd.N0(i7, null), 0).show();
                z10 = true;
                break;
            case 17:
                org.telegram.messenger.bz.W = !org.telegram.messenger.bz.W;
                SharedPreferences.Editor edit3 = org.telegram.messenger.mp.g1().edit();
                edit3.putBoolean("forceDisableTabletMode", org.telegram.messenger.bz.W);
                edit3.apply();
                Activity parentActivity2 = getParentActivity();
                if (parentActivity2 != null) {
                    Intent launchIntentForPackage = parentActivity2.getPackageManager().getLaunchIntentForPackage(parentActivity2.getPackageName());
                    parentActivity2.finishAffinity();
                    parentActivity2.startActivity(launchIntentForPackage);
                }
                System.exit(0);
                z10 = true;
                break;
            case 18:
                c8.sb.a((LaunchActivity) getParentActivity(), !org.telegram.messenger.bz.f23238x1, true);
                z10 = true;
                break;
            case 19:
                getMessagesController().X2(true);
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PHONE_NUMBER";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new st(this, 0));
                z10 = true;
                break;
            case 20:
                int i12 = ConnectionsManager.CPU_COUNT;
                int memoryClass = ((ActivityManager) org.telegram.messenger.t0.f26941b.getSystemService("activity")).getMemoryClass();
                StringBuilder sb2 = new StringBuilder();
                long j3 = 0;
                long j10 = 0;
                long j11 = 0;
                long j12 = 0;
                long j13 = 0;
                long j14 = 0;
                long j15 = 0;
                long j16 = 0;
                for (int i13 = 0; i13 < i12; i13++) {
                    Long i14 = org.telegram.messenger.g0.i1("/sys/devices/system/cpu/cpu" + i13 + "/cpufreq/cpuinfo_min_freq");
                    Long i15 = org.telegram.messenger.g0.i1("/sys/devices/system/cpu/cpu" + i13 + "/cpufreq/cpuinfo_cur_freq");
                    Long i16 = org.telegram.messenger.g0.i1("/sys/devices/system/cpu/cpu" + i13 + "/cpufreq/cpuinfo_max_freq");
                    Long i17 = org.telegram.messenger.g0.i1("/sys/devices/system/cpu/cpu" + i13 + "/cpu_capacity");
                    sb2.append("#");
                    sb2.append(i13);
                    sb2.append(" ");
                    if (i14 != null) {
                        sb2.append("min=");
                        l10 = i15;
                        sb2.append(i14.longValue() / 1000);
                        sb2.append(" ");
                        j3 = (i14.longValue() / 1000) + j3;
                        j10++;
                    } else {
                        l10 = i15;
                    }
                    if (l10 != null) {
                        sb2.append("cur=");
                        sb2.append(l10.longValue() / 1000);
                        sb2.append(" ");
                        j11 = (l10.longValue() / 1000) + j11;
                        j12++;
                    }
                    if (i16 != null) {
                        sb2.append("max=");
                        sb2.append(i16.longValue() / 1000);
                        sb2.append(" ");
                        j13 = (i16.longValue() / 1000) + j13;
                        j14++;
                    }
                    if (i17 != null) {
                        sb2.append("cpc=");
                        sb2.append(i17);
                        sb2.append(" ");
                        j15 = i17.longValue() + j15;
                        j16++;
                    }
                    sb2.append("\n");
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(Build.MANUFACTURER);
                sb3.append(", ");
                sb3.append(Build.MODEL);
                sb3.append(" (");
                sb3.append(Build.PRODUCT);
                sb3.append(", ");
                sb3.append(Build.DEVICE);
                sb3.append(")  (android ");
                int i18 = Build.VERSION.SDK_INT;
                sb3.append(i18);
                sb3.append(")\n");
                if (i18 >= 31) {
                    sb3.append("SoC: ");
                    sb3.append(Build.SOC_MANUFACTURER);
                    sb3.append(", ");
                    sb3.append(Build.SOC_MODEL);
                    sb3.append("\n");
                }
                String j17 = org.telegram.messenger.g0.j1("/sys/kernel/gpu/gpu_model");
                if (j17 != null) {
                    sb3.append("GPU: ");
                    sb3.append(j17);
                    Long i19 = org.telegram.messenger.g0.i1("/sys/kernel/gpu/gpu_min_clock");
                    Long i110 = org.telegram.messenger.g0.i1("/sys/kernel/gpu/gpu_mm_min_clock");
                    Long i111 = org.telegram.messenger.g0.i1("/sys/kernel/gpu/gpu_max_clock");
                    if (i19 != null) {
                        sb3.append(", min=");
                        sb3.append(i19.longValue() / 1000);
                    }
                    if (i110 != null) {
                        sb3.append(", mmin=");
                        sb3.append(i110.longValue() / 1000);
                    }
                    if (i111 != null) {
                        sb3.append(", max=");
                        sb3.append(i111.longValue() / 1000);
                    }
                    sb3.append("\n");
                }
                ConfigurationInfo deviceConfigurationInfo = ((ActivityManager) org.telegram.messenger.t0.f26941b.getSystemService("activity")).getDeviceConfigurationInfo();
                sb3.append("GLES Version: ");
                sb3.append(deviceConfigurationInfo.getGlEsVersion());
                sb3.append("\nMemory: class=");
                sb3.append(org.telegram.messenger.g0.i0(memoryClass * 1048576, false, false));
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) org.telegram.messenger.t0.f26941b.getSystemService("activity")).getMemoryInfo(memoryInfo);
                sb3.append(", total=");
                sb3.append(org.telegram.messenger.g0.i0(memoryInfo.totalMem, false, false));
                sb3.append(", avail=");
                sb3.append(org.telegram.messenger.g0.i0(memoryInfo.availMem, false, false));
                sb3.append(", low?=");
                sb3.append(memoryInfo.lowMemory);
                sb3.append(" (threshold=");
                sb3.append(org.telegram.messenger.g0.i0(memoryInfo.threshold, false, false));
                sb3.append(")\nCurrent class: ");
                sb3.append(org.telegram.messenger.bz.x(org.telegram.messenger.bz.o()));
                sb3.append(", measured: ");
                sb3.append(org.telegram.messenger.bz.x(org.telegram.messenger.bz.v()));
                if (i18 >= 31) {
                    sb3.append(", suggest=");
                    sb3.append(Build.VERSION.MEDIA_PERFORMANCE_CLASS);
                }
                sb3.append("\n");
                sb3.append(i12);
                sb3.append(" CPUs");
                if (j10 > 0) {
                    sb3.append(", avgMinFreq=");
                    sb3.append(j3 / j10);
                }
                if (j12 > 0) {
                    sb3.append(", avgCurFreq=");
                    sb3.append(j11 / j12);
                }
                if (j14 > 0) {
                    sb3.append(", avgMaxFreq=");
                    sb3.append(j13 / j14);
                }
                if (j16 > 0) {
                    sb3.append(", avgCapacity=");
                    sb3.append(j15 / j16);
                }
                sb3.append("\n");
                sb3.append((CharSequence) sb2);
                d0("video/avc", sb3);
                d0("video/hevc", sb3);
                d0("video/x-vnd.on2.vp8", sb3);
                d0("video/x-vnd.on2.vp9", sb3);
                showDialog(new ut(this, getParentActivity(), sb3.toString()));
                z10 = true;
                break;
            case 21:
                String str6 = "";
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
                alertDialog$Builder.f28774a.S = "Force performance class";
                int o4 = org.telegram.messenger.bz.o();
                int v = org.telegram.messenger.bz.v();
                if (o4 == 2) {
                    str = "**HIGH**";
                } else {
                    str = "HIGH";
                }
                if (v != 2) {
                    str2 = "";
                } else {
                    str2 = " (measured)";
                }
                SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(str.concat(str2));
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
                SpannableStringBuilder W22 = org.telegram.messenger.g0.W2(str3.concat(str4));
                if (o4 == 0) {
                    str5 = "**LOW**";
                } else {
                    str5 = "LOW";
                }
                if (v == 0) {
                    str6 = " (measured)";
                }
                alertDialog$Builder.f(new CharSequence[]{W2, W22, org.telegram.messenger.g0.W2(str5.concat(str6))}, new tt(v, 0));
                i5.c.y(null, 2131752577, alertDialog$Builder, null);
                z10 = true;
                break;
            case 22:
                org.telegram.messenger.bz.N();
                z10 = true;
                break;
            case 23:
                boolean q10 = hi.d1.q(getParentActivity());
                org.telegram.messenger.mp.g1().edit().putBoolean("dual_available", !q10).apply();
                try {
                    Activity parentActivity3 = getParentActivity();
                    if (!q10) {
                        i10 = 2131751621;
                    } else {
                        i10 = 2131751623;
                    }
                    Toast.makeText(parentActivity3, org.telegram.messenger.gd.N0(i10, null), 0).show();
                } catch (Exception unused2) {
                }
                z10 = true;
                break;
            case 24:
                org.telegram.messenger.bz.O();
                while (i11 < getParentLayout().getFragmentStack().size()) {
                    ((org.telegram.ui.ActionBar.g2) getParentLayout().getFragmentStack().get(i11)).clearSheets();
                    i11++;
                }
                z10 = true;
                break;
            case 25:
                org.telegram.messenger.bz.M();
                z10 = true;
                break;
            case 26:
                org.telegram.messenger.bz.L();
                z10 = true;
                break;
            case 27:
                getMediaDataController().H0(false, true, null);
                z10 = true;
                break;
            case 28:
                org.telegram.messenger.bz.Q(this.currentAccount);
                z10 = true;
                break;
            case 29:
                ki.p.b();
                ki.r0.c();
                ki.g0.a();
                ki.c4.c();
                z10 = true;
                break;
            case 30:
                org.telegram.messenger.v0.a();
                z10 = true;
                break;
            case 31:
                org.telegram.messenger.bz.R();
                z10 = true;
                break;
            case 32:
                org.telegram.messenger.bz.J();
                z10 = true;
                break;
            case 33:
                org.telegram.messenger.bz.R0 = !org.telegram.messenger.bz.R0;
                SharedPreferences.Editor edit4 = org.telegram.messenger.mp.g1().edit();
                edit4.putBoolean("debugVideoQualities", org.telegram.messenger.bz.R0);
                edit4.apply();
                z10 = true;
                break;
            case 34:
                org.telegram.messenger.bz.V0 = !org.telegram.messenger.bz.V0;
                org.telegram.messenger.g0.f24118a = null;
                SharedPreferences.Editor edit5 = org.telegram.messenger.mp.g1().edit();
                edit5.putBoolean("useSystemBoldFont", org.telegram.messenger.bz.V0);
                edit5.apply();
                z10 = true;
                break;
            case 35:
                org.telegram.messenger.mp.u1(this.currentAccount).X2(true);
                z10 = true;
                break;
            case 36:
                org.telegram.messenger.bz.f23208n = !org.telegram.messenger.bz.f23208n;
                SharedPreferences.Editor edit6 = org.telegram.messenger.mp.g1().edit();
                edit6.putBoolean("forceForumTabs", org.telegram.messenger.bz.f23208n);
                edit6.apply();
                z10 = true;
                break;
            case 37:
                org.telegram.messenger.a8.j();
                org.telegram.messenger.a8.c(true);
                z10 = true;
                break;
            case 38:
                org.telegram.messenger.bz.f23210o = !org.telegram.messenger.bz.f23210o;
                SharedPreferences.Editor edit7 = org.telegram.messenger.mp.g1().edit();
                edit7.putBoolean("fastWallpaperDisabled", org.telegram.messenger.bz.f23210o);
                edit7.apply();
                z10 = true;
                break;
            case 39:
                org.telegram.messenger.bz.f23213p = !org.telegram.messenger.bz.f23213p;
                SharedPreferences.Editor edit8 = org.telegram.messenger.mp.g1().edit();
                edit8.putBoolean("frameMetricsEnabled", org.telegram.messenger.bz.f23213p);
                edit8.apply();
                LaunchActivity launchActivity = LaunchActivity.H1;
                if (launchActivity != null) {
                    launchActivity.B();
                }
                z10 = true;
                break;
            case 40:
            default:
                return;
            case 41:
                SharedPreferences.Editor edit9 = org.telegram.messenger.t0.f26941b.getSharedPreferences("mainconfig", 0).edit();
                boolean z11 = !org.telegram.messenger.bz.f23192g1;
                org.telegram.messenger.bz.f23192g1 = z11;
                edit9.putBoolean("debugViewMetrics", z11).apply();
                z10 = true;
                break;
            case 42:
                aj.a aVar = aj.e.f1661a;
                synchronized (aVar) {
                    if (!aVar.f1653b) {
                        SharedPreferences sharedPreferences = aj.d.f1660a;
                        aVar.f1654c = sharedPreferences.contains("experimental_settings_allowed");
                        aVar.d = sharedPreferences.getBoolean("experimental_settings_allowed", true);
                        aVar.f1653b = true;
                    }
                    boolean z12 = !aVar.d;
                    aVar.d = z12;
                    aVar.f1654c = true;
                    aVar.f1653b = true;
                    aj.d.f1660a.edit().putBoolean("experimental_settings_allowed", z12).apply();
                }
                z10 = true;
                break;
            case 43:
                while (i11 < 4) {
                    if (org.telegram.messenger.j10.i(i11).p()) {
                        org.telegram.messenger.tr a02 = org.telegram.messenger.tr.a0(i11);
                        a02.f27080a.c(new org.telegram.messenger.pq(a02, 1));
                    }
                    i11++;
                }
                org.telegram.ui.Components.lc.b0(this).Q(2131624000, 36, "Widget heights cleared").j();
                z10 = true;
                break;
            case 44:
                org.telegram.messenger.bz.K0 = !org.telegram.messenger.bz.K0;
                org.telegram.messenger.mp.g1().edit().putBoolean("widgetStaticLayers", org.telegram.messenger.bz.K0).apply();
                z10 = true;
                break;
            case 45:
                org.telegram.messenger.bz.D(false);
                org.telegram.messenger.f3.d(org.telegram.messenger.f3.d(org.telegram.messenger.f3.d(org.telegram.messenger.f3.d(org.telegram.messenger.f3.d(org.telegram.messenger.f3.d(org.telegram.messenger.f3.d(org.telegram.messenger.f3.d(org.telegram.messenger.f3.d(org.telegram.messenger.f3.d(org.telegram.messenger.mp.g1().edit().remove("archivehint").remove("proximityhint").remove("archivehint_l").remove("searchpostsnew"), "speedhint", "gifhint", "reminderhint", "soundHint"), "themehint", "bganimationhint", "filterhint", "n_0"), "storyprvhint", "storyhint", "storyhint2", "storydualhint"), "storysvddualhint", "stories_camera", "dualcam", "dualmatrix"), "dual_available", "archivehint", "askNotificationsAfter", "askNotificationsDuration"), "viewoncehint", "voicepausehint", "taptostorysoundhint", "nothanos"), "voiceoncehint", "savedhint", "savedsearchhint", "savedsearchtaghint"), "newppsms", "monetizationadshint", "seekSpeedHintShowed", "unsupport_video/av01"), "statusgiftpage", "multistorieshint", "trimvoicehint", "taptostoryhighlighthint"), "proxycheckstatusip", "callmiconstart", "showchattagsinfo", "language_showed2").remove("aihintshown").remove("savedmsgschatshint").remove("walletcardstickerhint").apply();
                c8.ka.a();
                org.telegram.messenger.c6.a(this.currentAccount);
                org.telegram.messenger.mp.u1(this.currentAccount).i7.edit().remove("featured_hidden").remove("emoji_featured_hidden").commit();
                org.telegram.messenger.mp.h1().edit().remove("disable_sharing_learn").remove("askedAboutFSILockscreen").apply();
                org.telegram.messenger.bz.J = 0;
                org.telegram.messenger.bz.O = 0;
                org.telegram.messenger.bz.R = false;
                org.telegram.messenger.bz.P = false;
                org.telegram.messenger.bz.Q = false;
                org.telegram.messenger.bz.f23181c1 = 3;
                org.telegram.messenger.bz.f23183d1 = 3;
                org.telegram.messenger.bz.f23186e1 = 3;
                org.telegram.messenger.bz.f23232v1 = 3;
                org.telegram.messenger.bz.f23185e0 = 2;
                org.telegram.messenger.bz.T(2);
                org.telegram.messenger.bz.H(false);
                org.telegram.messenger.bz.G(false);
                org.telegram.messenger.bz.C(false);
                getNotificationCenter().k(org.telegram.messenger.ks.f25214s1, new Object[0]);
                sy0.b0();
                sg.k0.e(this.currentAccount).a();
                SharedPreferences sharedPreferences2 = getMessagesController().h7;
                SharedPreferences.Editor edit10 = sharedPreferences2.edit();
                edit10.remove("boostingappearance").remove("bizbothint").remove("movecaptionhint");
                for (String str7 : sharedPreferences2.getAll().keySet()) {
                    if (str7.contains("show_gift_for_") || str7.contains("bdayhint_") || str7.contains("bdayanim_") || str7.startsWith("ask_paid_message_") || str7.startsWith("topicssidetabs")) {
                        edit10.remove(str7);
                    }
                }
                edit10.apply();
                SharedPreferences.Editor edit11 = org.telegram.messenger.mp.u1(this.currentAccount).f25686g7.edit();
                for (String str8 : org.telegram.messenger.mp.u1(this.currentAccount).f25686g7.getAll().keySet()) {
                    if (str8.startsWith("dialog_bar_botver")) {
                        edit11.remove(str8);
                    }
                }
                edit11.apply();
                z10 = true;
                break;
            case 46:
                org.telegram.messenger.bz.H0 = !org.telegram.messenger.bz.H0;
                SharedPreferences.Editor edit12 = org.telegram.messenger.mp.g1().edit();
                edit12.putBoolean("compactMode", org.telegram.messenger.bz.H0);
                edit12.apply();
                org.telegram.ui.ActionBar.m6.k(false, false);
                z10 = true;
                break;
        }
        if (o41Var.f56630a == 4) {
            this.f34683a.f35796g3.O(z10);
        }
    }

    @Override
    public final boolean c0(org.telegram.ui.Components.o41 o41Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.fragmentView = super.createView(context);
        this.f34683a.r1();
        this.f34683a.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f34683a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
