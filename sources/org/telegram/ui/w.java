package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URLDecoder;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ThemeEditorView;

public final class w implements DialogInterface.OnClickListener {

    public final int f43555a;

    public final Object f43556b;

    public final Object f43557c;

    public w(int i10, Object obj, Object obj2) {
        this.f43555a = i10;
        this.f43557c = obj;
        this.f43556b = obj2;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) throws Throwable {
        int i11;
        TLRPC.TL_secureRequiredType tL_secureRequiredType;
        TLRPC.TL_secureRequiredType tL_secureRequiredType2;
        File fileP0;
        Throwable th;
        String strConcat;
        File file;
        Intent intent;
        String string;
        String strDecode = "";
        TLRPC.TL_secureRequiredType tL_secureRequiredType3 = null;
        fileOutputStream = null;
        fileOutputStream = null;
        fileOutputStream = null;
        fileOutputStream = null;
        fileOutputStream = null;
        FileOutputStream fileOutputStream = null;
        switch (this.f43555a) {
            case 0:
                m4 m4Var = (m4) this.f43557c;
                String strSubstring = (String) this.f43556b;
                z3 z3Var = m4Var.G;
                if (m4Var.H == null || m4Var.f40347q0[0].f41497c.A == null) {
                    return;
                }
                if (i10 != 0) {
                    if (i10 != 1 || strSubstring == null) {
                        return;
                    }
                    if (strSubstring.startsWith("mailto:")) {
                        strSubstring = strSubstring.substring(7);
                    } else if (strSubstring.startsWith("tel:")) {
                        strSubstring = strSubstring.substring(4);
                    }
                    AndroidUtilities.addToClipboard(strSubstring);
                    return;
                }
                int iLastIndexOf = strSubstring.lastIndexOf(35);
                if (iLastIndexOf != -1) {
                    String lowerCase = !TextUtils.isEmpty(m4Var.f40347q0[0].f41497c.A.cached_page.url) ? m4Var.f40347q0[0].f41497c.A.cached_page.url.toLowerCase() : m4Var.f40347q0[0].f41497c.A.url.toLowerCase();
                    try {
                        strDecode = URLDecoder.decode(strSubstring.substring(iLastIndexOf + 1), "UTF-8");
                        break;
                    } catch (Exception unused) {
                    }
                    if (strSubstring.toLowerCase().contains(lowerCase)) {
                        if (!TextUtils.isEmpty(strDecode)) {
                            m4Var.V(strDecode, true);
                            return;
                        } else {
                            m4Var.f40347q0[0].d.h1(z3Var == null ? 0 : 1, z3Var != null ? AndroidUtilities.dp(32.0f) : 0);
                            m4Var.m(null);
                            return;
                        }
                    }
                }
                we.e.s(m4Var.H, strSubstring);
                return;
            case 1:
                hb hbVar = (hb) this.f43557c;
                String strSubstring2 = (String) this.f43556b;
                if (i10 == 0) {
                    we.e.o(hbVar.f38769a.f40428n.getParentActivity(), strSubstring2, true);
                    return;
                }
                if (i10 == 1) {
                    if (strSubstring2.startsWith("mailto:")) {
                        strSubstring2 = strSubstring2.substring(7);
                    } else if (strSubstring2.startsWith("tel:")) {
                        strSubstring2 = strSubstring2.substring(4);
                    }
                    AndroidUtilities.addToClipboard(strSubstring2);
                    return;
                }
                return;
            case 2:
                rn rnVar = (rn) this.f43557c;
                String str = (String) this.f43556b;
                AndroidUtilities.addToClipboard(str);
                org.telegram.ui.Components.mc.a0(rnVar).i(LocaleController.formatString(R.string.ExactTextCopied, str)).j();
                return;
            case 3:
                ArrayList arrayList = (ArrayList) this.f43557c;
                gy gyVar = (gy) this.f43556b;
                if (i10 == 0) {
                    i11 = 0;
                } else if (i10 == 1) {
                    i11 = 1;
                } else {
                    i11 = i10 == 2 ? 2 : 3;
                }
                if (arrayList != null) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(((Long) arrayList.get(i12)).longValue(), 0, i11);
                    }
                }
                int i13 = i11;
                if (org.telegram.ui.Components.mc.a(gyVar)) {
                    org.telegram.ui.Components.mc.z(gyVar, i13, 0, null).j();
                    return;
                }
                return;
            case 4:
                org.telegram.ui.Components.be0 be0Var = (org.telegram.ui.Components.be0) this.f43557c;
                AndroidUtilities.VcardItem vcardItem = (AndroidUtilities.VcardItem) this.f43556b;
                be0Var.getClass();
                if (i10 == 0) {
                    try {
                        ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vcardItem.getValue(false)));
                        if (AndroidUtilities.shouldShowClipboardToast()) {
                            Toast.makeText(be0Var.f27079r.getParentActivity(), LocaleController.getString(R.string.TextCopied), 0).show();
                            return;
                        }
                        return;
                    } catch (Exception e9) {
                        FileLog.e(e9);
                        return;
                    }
                }
                return;
            case 5:
                org.telegram.ui.Components.cs0 cs0Var = (org.telegram.ui.Components.cs0) this.f43557c;
                String strSubstring3 = (String) this.f43556b;
                if (i10 == 0) {
                    cs0Var.f27537a.R0(strSubstring3);
                    return;
                }
                cs0Var.getClass();
                if (i10 == 1) {
                    if (strSubstring3.startsWith("mailto:")) {
                        strSubstring3 = strSubstring3.substring(7);
                    } else if (strSubstring3.startsWith("tel:")) {
                        strSubstring3 = strSubstring3.substring(4);
                    }
                    AndroidUtilities.addToClipboard(strSubstring3);
                    return;
                }
                return;
            case 6:
                e10 e10Var = (e10) this.f43557c;
                String strSubstring4 = (String) this.f43556b;
                if (i10 == 0) {
                    i10 i10Var = e10Var.f37592a.v;
                    SpannableStringBuilder[] spannableStringBuilderArr = i10.f38933o0;
                    i10Var.g(strSubstring4);
                    return;
                }
                e10Var.getClass();
                if (i10 == 1) {
                    if (strSubstring4.startsWith("mailto:")) {
                        strSubstring4 = strSubstring4.substring(7);
                    } else if (strSubstring4.startsWith("tel:")) {
                        strSubstring4 = strSubstring4.substring(4);
                    }
                    AndroidUtilities.addToClipboard(strSubstring4);
                    return;
                }
                return;
            case 7:
                v40 v40Var = (v40) this.f43557c;
                ArrayList arrayList2 = (ArrayList) this.f43556b;
                s50 s50Var = v40Var.f43351b;
                if (VoIPService.getSharedInstance() == null) {
                    return;
                }
                Integer num = (Integer) arrayList2.get(i10);
                int iIntValue = num.intValue();
                s50Var.f42496u3 = num;
                s50Var.N1(true, true);
                s50Var.f42496u3 = null;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.xl(v40Var, iIntValue, 13));
                return;
            case 8:
                xm0 xm0Var = (xm0) this.f43557c;
                ArrayList arrayList3 = (ArrayList) this.f43556b;
                try {
                    tL_secureRequiredType = new TLRPC.TL_secureRequiredType();
                    try {
                        tL_secureRequiredType.type = (TLRPC.SecureValueType) ((Class) arrayList3.get(i10)).newInstance();
                        break;
                    } catch (Exception unused2) {
                    }
                } catch (Exception unused3) {
                    tL_secureRequiredType = null;
                }
                if (!xm0.v1(tL_secureRequiredType.type)) {
                    if (xm0.t1(tL_secureRequiredType.type)) {
                        tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                        tL_secureRequiredType2.type = new TLRPC.TL_secureValueTypeAddress();
                    }
                    xm0Var.E1(tL_secureRequiredType, tL_secureRequiredType3, new ArrayList(), tL_secureRequiredType3 != null);
                    return;
                }
                tL_secureRequiredType.selfie_required = true;
                tL_secureRequiredType.translation_required = true;
                tL_secureRequiredType2 = new TLRPC.TL_secureRequiredType();
                tL_secureRequiredType2.type = new TLRPC.TL_secureValueTypePersonalDetails();
                tL_secureRequiredType3 = tL_secureRequiredType;
                tL_secureRequiredType = tL_secureRequiredType2;
                xm0Var.E1(tL_secureRequiredType, tL_secureRequiredType3, new ArrayList(), tL_secureRequiredType3 != null);
                return;
            case 9:
                hy0.b((hy0) this.f43557c, (Context) this.f43556b, i10);
                return;
            case 10:
                x61 x61Var = (x61) this.f43557c;
                ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", (String) this.f43556b));
                org.telegram.messenger.rl.m(R.string.TextCopied, new org.telegram.ui.Components.mc(x61Var.getContainer(), null));
                return;
            case 11:
                va1 va1Var = (va1) this.f43557c;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f43556b;
                ThemeActivity themeActivity = va1Var.f43398e;
                if (themeActivity.getParentActivity() == null) {
                    return;
                }
                if (i10 == 0) {
                    if (f6Var.B == null) {
                        themeActivity.getMessagesController().saveThemeToServer(f6Var, null);
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needShareTheme, f6Var, null);
                        return;
                    }
                    String str2 = "https://" + themeActivity.getMessagesController().linkPrefix + "/addtheme/" + f6Var.B.slug;
                    themeActivity.showDialog(new org.telegram.ui.Components.sp0(themeActivity.getParentActivity(), null, str2, false, str2, false, null));
                    return;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        if (((org.telegram.ui.ActionBar.n2) themeActivity).parentLayout != null) {
                            org.telegram.ui.ActionBar.g6.t(f6Var, true, false);
                            ((ActionBarLayout) ((org.telegram.ui.ActionBar.n2) themeActivity).parentLayout).U(true, true);
                            new ThemeEditorView().c(themeActivity.getParentActivity(), f6Var);
                            return;
                        }
                        return;
                    }
                    if (i10 == 3) {
                        themeActivity.presentFragment(new tc1(f6Var, null, false));
                        return;
                    }
                    if (themeActivity.getParentActivity() == null) {
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(themeActivity.getParentActivity());
                    alertDialog$Builder.f22702a.N = LocaleController.getString("DeleteThemeTitle", R.string.DeleteThemeTitle);
                    alertDialog$Builder.f22702a.P = LocaleController.getString("DeleteThemeAlert", R.string.DeleteThemeAlert);
                    alertDialog$Builder.k(LocaleController.getString("Delete", R.string.Delete), new nl0(23, va1Var, f6Var));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                    themeActivity.showDialog(b2Var);
                    TextView textView = (TextView) b2Var.d(-1);
                    if (textView != null) {
                        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
                        return;
                    }
                    return;
                }
                if (f6Var.f22943b == null && f6Var.d == null) {
                    StringBuilder sb2 = new StringBuilder();
                    int[] iArr = org.telegram.ui.ActionBar.g6.nl;
                    for (int i14 = 0; i14 < iArr.length; i14++) {
                        sb2.append(org.telegram.ui.ActionBar.e5.i(i14));
                        sb2.append("=");
                        sb2.append(iArr[i14]);
                        sb2.append("\n");
                    }
                    fileP0 = new File(ApplicationLoader.getFilesDirFixed(), "default_theme.attheme");
                    try {
                        try {
                            try {
                                FileOutputStream fileOutputStream2 = new FileOutputStream(fileP0);
                                try {
                                    fileOutputStream2.write(AndroidUtilities.getStringBytes(sb2.toString()));
                                    fileOutputStream2.close();
                                } catch (Exception e10) {
                                    e = e10;
                                    fileOutputStream = fileOutputStream2;
                                    FileLog.e(e);
                                    if (fileOutputStream != null) {
                                        fileOutputStream.close();
                                    }
                                    strConcat = f6Var.f22941a;
                                    if (!strConcat.endsWith(".attheme")) {
                                        strConcat = strConcat.concat(".attheme");
                                    }
                                    file = new File(FileLoader.getDirectory(4), FileLoader.fixFileName(strConcat));
                                    if (!AndroidUtilities.copyFile(fileP0, file)) {
                                        intent = new Intent("android.intent.action.SEND");
                                        intent.setType("text/xml");
                                        if (Build.VERSION.SDK_INT >= 24) {
                                            try {
                                                intent.putExtra("android.intent.extra.STREAM", FileProvider.d(themeActivity.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", file));
                                                intent.setFlags(1);
                                            } catch (Exception unused4) {
                                                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                                            }
                                        } else {
                                            intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                                        }
                                        themeActivity.startActivityForResult(Intent.createChooser(intent, LocaleController.getString("ShareFile", R.string.ShareFile)), 500);
                                        break;
                                    }
                                    return;
                                } catch (Throwable th2) {
                                    th = th2;
                                    fileOutputStream = fileOutputStream2;
                                    if (fileOutputStream == null) {
                                        throw th;
                                    }
                                    try {
                                        fileOutputStream.close();
                                        throw th;
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                        throw th;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (Exception e12) {
                            e = e12;
                        }
                    } catch (Exception e13) {
                        FileLog.e(e13);
                    }
                    break;
                } else {
                    String str3 = f6Var.d;
                    fileP0 = str3 != null ? org.telegram.ui.ActionBar.g6.p0(str3) : new File(f6Var.f22943b);
                }
                strConcat = f6Var.f22941a;
                if (!strConcat.endsWith(".attheme")) {
                    strConcat = strConcat.concat(".attheme");
                }
                file = new File(FileLoader.getDirectory(4), FileLoader.fixFileName(strConcat));
                try {
                    if (!AndroidUtilities.copyFile(fileP0, file)) {
                        intent = new Intent("android.intent.action.SEND");
                        intent.setType("text/xml");
                        if (Build.VERSION.SDK_INT >= 24) {
                            intent.putExtra("android.intent.extra.STREAM", FileProvider.d(themeActivity.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", file));
                            intent.setFlags(1);
                        } else {
                            intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                        }
                        themeActivity.startActivityForResult(Intent.createChooser(intent, LocaleController.getString("ShareFile", R.string.ShareFile)), 500);
                        break;
                    }
                } catch (Exception e14) {
                    FileLog.e(e14);
                }
                return;
            case 12:
                uf.n.a((uf.n) this.f43557c, (Integer[][]) this.f43556b, i10);
                return;
            default:
                yf.j1 j1Var = (yf.j1) this.f43557c;
                ArrayList arrayList4 = (ArrayList) this.f43556b;
                SharedPreferences sharedPreferences = j1Var.f49964g;
                ArrayList arrayList5 = j1Var.f49961c;
                if (i10 != 0) {
                    yf.i1 i1Var = new yf.i1();
                    i1Var.f49951a = i10 - 1;
                    i1Var.f49952b = arrayList4;
                    arrayList5.add(i1Var);
                    String string2 = sharedPreferences.getString("moretemplates", null);
                    if (string2 == null) {
                        string = "" + i1Var.f49951a;
                    } else {
                        StringBuilder sbF = s3.c.f(string2, "|");
                        sbF.append(i1Var.f49951a);
                        string = sbF.toString();
                    }
                    for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                        StringBuilder sbF2 = s3.c.f(string, ",");
                        sbF2.append(Math.round(((yf.g1) arrayList4.get(i15)).f49936a));
                        sbF2.append(",");
                        sbF2.append(Math.round(((yf.g1) arrayList4.get(i15)).f49937b));
                        string = sbF2.toString();
                    }
                    sharedPreferences.edit().putString("moretemplates", string).apply();
                    return;
                }
                StringBuilder sb3 = new StringBuilder("[");
                for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                    yf.i1 i1Var2 = (yf.i1) arrayList5.get(i16);
                    if (i16 > 0) {
                        sb3.append(",\n");
                    }
                    sb3.append("\t{\n\t\t\"shape\": ");
                    sb3.append(i1Var2.f49951a);
                    sb3.append(",\n\t\t\"points\": [");
                    for (int i17 = 0; i17 < i1Var2.f49952b.size(); i17++) {
                        if (i17 > 0) {
                            sb3.append(",");
                        }
                        yf.g1 g1Var = (yf.g1) i1Var2.f49952b.get(i17);
                        sb3.append("[");
                        sb3.append(Math.round(g1Var.f49936a));
                        sb3.append(",");
                        sb3.append(Math.round(g1Var.f49937b));
                        sb3.append("]");
                    }
                    sb3.append("],\n\t\t\"freq\": ");
                    sb3.append(Math.round(((i1Var2.f49953c / j1Var.f49959a) * 100.0f) * 100.0f) / 100.0f);
                    sb3.append("\n\t}");
                }
                sb3.append("\n]");
                Log.i("shapedetector", sb3.toString());
                return;
        }
    }
}
