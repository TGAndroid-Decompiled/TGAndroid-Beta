package org.telegram.ui.web;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.webkit.WebView;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;
import lh.n6;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.mc;
import org.telegram.ui.LaunchActivity;

public final class z implements Runnable {

    public final int f44052a;

    public final Object f44053b;

    public final Object f44054c;
    public final Object d;

    public final Serializable f44055e;

    public final Object f44056f;

    public z(Object obj, String str, Serializable serializable, String str2, String str3, int i10) {
        this.f44052a = i10;
        this.f44053b = obj;
        this.f44055e = str;
        this.d = serializable;
        this.f44056f = str2;
        this.f44054c = str3;
    }

    @Override
    public final void run() {
        String strOptString;
        String strOptString2;
        String strOptString3;
        LaunchActivity launchActivity;
        int i10 = this.f44052a;
        File file = null;
        JSONObject jSONObject = null;
        int i11 = 0;
        Object obj = this.f44054c;
        Serializable serializable = this.f44055e;
        Object obj2 = this.f44056f;
        Object obj3 = this.d;
        Object obj4 = this.f44053b;
        switch (i10) {
            case 0:
                z0 z0Var = (z0) obj4;
                String str = (String) serializable;
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = (TLRPC.TL_inputInvoiceSlug) obj2;
                TLObject tLObject = (TLObject) obj;
                if (((TLRPC.TL_error) obj3) == null) {
                    z0Var.f44061c.n(tL_inputInvoiceSlug, str, tLObject);
                } else {
                    z0Var.C(str, "failed", false);
                }
                break;
            case 1:
                z0 z0Var2 = (z0) obj4;
                TLObject tLObject2 = (TLObject) obj;
                String[] strArr = (String[]) serializable;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj2;
                z0Var2.getClass();
                if (tLObject2 != null) {
                    strArr[0] = "allowed";
                    if (tLObject2 instanceof TLRPC.Updates) {
                        MessagesController.getInstance(z0Var2.I).processUpdates((TLRPC.Updates) tLObject2, false);
                    }
                }
                if (tL_error != null) {
                    z0Var2.S(tL_error.text);
                }
                b2Var.dismiss();
                break;
            case 2:
                String str2 = (String) serializable;
                String str3 = (String) obj3;
                String str4 = (String) obj2;
                String str5 = (String) obj;
                w0 w0Var = ((v0) obj4).f44016a;
                try {
                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str2));
                    request.setMimeType(str3);
                    request.addRequestHeader("User-Agent", str4);
                    request.setDescription(LocaleController.getString(R.string.WebDownloading));
                    request.setTitle(str5);
                    request.setNotificationVisibility(1);
                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str5);
                    DownloadManager downloadManager = (DownloadManager) w0Var.getContext().getSystemService("download");
                    if (downloadManager != null) {
                        downloadManager.enqueue(request);
                    }
                    z0 z0Var3 = w0Var.M;
                    if (z0Var3 != null) {
                        new mc(z0Var3, z0Var3.f44064e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, str5))).k(true);
                    }
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
                break;
            case 3:
                BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = (BotWebViewContainer$WebViewProxy) obj4;
                String str6 = (String) serializable;
                byte[] bArr = (byte[]) obj3;
                String str7 = (String) obj2;
                String str8 = (String) obj;
                w0 w0Var2 = botWebViewContainer$WebViewProxy.f43766b;
                long jCurrentTimeMillis = System.currentTimeMillis();
                z0 z0Var4 = botWebViewContainer$WebViewProxy.f43765a;
                if (jCurrentTimeMillis - z0Var4.L <= 10000) {
                    z0Var4.L = 0L;
                    Context context = w0Var2.getContext();
                    Activity activityFindActivity = AndroidUtilities.findActivity(context);
                    if (activityFindActivity == null && (launchActivity = LaunchActivity.C1) != null) {
                        activityFindActivity = launchActivity;
                    }
                    if (context == null || activityFindActivity == null || !(activityFindActivity instanceof LaunchActivity) || activityFindActivity.isFinishing() || !w0Var2.isAttachedToWindow()) {
                        w0Var2.d("window.navigator.__share__receive(\"security\")");
                    } else {
                        LaunchActivity launchActivity2 = (LaunchActivity) activityFindActivity;
                        try {
                            JSONObject jSONObject2 = new JSONObject(str6);
                            strOptString = jSONObject2.optString("url", null);
                            try {
                                strOptString2 = jSONObject2.optString("text", null);
                                try {
                                    strOptString3 = jSONObject2.optString("title", null);
                                } catch (Exception e10) {
                                    e = e10;
                                    FileLog.e(e);
                                    strOptString3 = null;
                                }
                            } catch (Exception e11) {
                                e = e11;
                                strOptString2 = null;
                            }
                        } catch (Exception e12) {
                            e = e12;
                            strOptString = null;
                            strOptString2 = null;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        if (strOptString3 != null) {
                            sb2.append(strOptString3);
                        }
                        if (strOptString2 != null) {
                            if (sb2.length() > 0) {
                                sb2.append("\n");
                            }
                            sb2.append(strOptString2);
                        }
                        if (strOptString != null) {
                            if (sb2.length() > 0) {
                                sb2.append("\n");
                            }
                            sb2.append(strOptString);
                        }
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.putExtra("android.intent.extra.TEXT", sb2.toString());
                        if (bArr != null) {
                            while (true) {
                                if (file == null || file.exists()) {
                                    File directory = FileLoader.getDirectory(4);
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append(FileLoader.fixFileName(str7 == null ? "file" : str7));
                                    sb3.append(i11 > 0 ? i0.a.l(i11, " (", ")") : "");
                                    file = new File(directory, sb3.toString());
                                    i11++;
                                } else {
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        fileOutputStream.write(bArr);
                                        fileOutputStream.close();
                                    } catch (Exception e13) {
                                        FileLog.e(e13);
                                    }
                                    try {
                                        if (str8 == null) {
                                            intent.setType("text/plain");
                                        } else {
                                            intent.setType(str8);
                                        }
                                        if (str7 != null) {
                                            intent.putExtra("android.intent.extra.TITLE", str7);
                                        }
                                        if (Build.VERSION.SDK_INT >= 24) {
                                            try {
                                                intent.putExtra("android.intent.extra.STREAM", FileProvider.d(launchActivity2, ApplicationLoader.getApplicationId() + ".provider", file));
                                                intent.setFlags(1);
                                            } catch (Exception unused) {
                                                intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                                            }
                                        } else {
                                            intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                                        }
                                    } catch (Exception e14) {
                                        FileLog.e(e14);
                                    }
                                }
                            }
                        } else {
                            intent.setType("text/plain");
                        }
                        launchActivity2.f35522m1 = new n6(botWebViewContainer$WebViewProxy, 7);
                        launchActivity2.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.ShareFile)), 521);
                    }
                } else {
                    w0Var2.d("window.navigator.__share__receive(\"security\")");
                }
                break;
            default:
                boolean[] zArr = (boolean[]) obj4;
                WebView webView = (WebView) obj3;
                y1 y1Var = (y1) obj2;
                String str9 = (String) serializable;
                w1 w1Var = (w1) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    if (!BuildVars.DEBUG_PRIVATE_VERSION) {
                        webView.onPause();
                        webView.destroy();
                        AndroidUtilities.removeFromParent(webView);
                        AndroidUtilities.removeFromParent(y1Var);
                    }
                    try {
                        jSONObject = new JSONObject(str9);
                    } catch (Exception e15) {
                        FileLog.e(e15);
                    }
                    w1Var.run(jSONObject);
                    break;
                }
                break;
        }
    }

    public z(z0 z0Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.b2 b2Var) {
        this.f44052a = 1;
        this.f44053b = z0Var;
        this.f44054c = tLObject;
        this.f44055e = strArr;
        this.d = tL_error;
        this.f44056f = b2Var;
    }

    public z(z0 z0Var, TLRPC.TL_error tL_error, String str, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, TLObject tLObject) {
        this.f44052a = 0;
        this.f44053b = z0Var;
        this.d = tL_error;
        this.f44055e = str;
        this.f44056f = tL_inputInvoiceSlug;
        this.f44054c = tLObject;
    }

    public z(boolean[] zArr, WebView webView, y1 y1Var, String str, w1 w1Var) {
        this.f44052a = 4;
        this.f44053b = zArr;
        this.d = webView;
        this.f44056f = y1Var;
        this.f44055e = str;
        this.f44054c = w1Var;
    }
}
