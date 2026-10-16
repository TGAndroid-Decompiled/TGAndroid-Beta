package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import java.net.URLEncoder;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
public final class xj1 extends org.telegram.ui.ActionBar.m2 {
    public WebView f41583a;
    public org.telegram.ui.ActionBar.u0 f41584b;
    public org.telegram.ui.Components.gr f41585c;
    public final String d;
    public final String e;
    public final String f41586f;
    public final String h;
    public final MessageObject f41587n;
    public final String f41588r;
    public a6 f41589s;

    public xj1(String str, String str2, String str3, String str4, MessageObject messageObject) {
        super(null);
        String h;
        this.f41589s = new a6(this, 15);
        this.d = str;
        this.e = str2;
        this.f41586f = str3;
        this.f41587n = messageObject;
        this.f41588r = str4;
        StringBuilder sb2 = new StringBuilder("https://");
        sb2.append(MessagesController.getInstance(this.currentAccount).linkPrefix);
        sb2.append("/");
        sb2.append(str2);
        if (TextUtils.isEmpty(str4)) {
            h = "";
        } else {
            h = t8.b.h("?game=", str4);
        }
        sb2.append(h);
        this.h = sb2.toString();
    }

    public static int U(xj1 xj1Var) {
        return xj1Var.currentAccount;
    }

    public static void V(String str, MessageObject messageObject, Activity activity, String str2, String str3) {
        String str4;
        String str5;
        String str6 = "";
        try {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("botshare", 0);
            String string = sharedPreferences.getString("" + messageObject.getId(), null);
            if (string == null) {
                str4 = "";
            } else {
                str4 = string;
            }
            StringBuilder sb2 = new StringBuilder(str4);
            StringBuilder sb3 = new StringBuilder("tgShareScoreUrl=" + URLEncoder.encode("tgb://share_game_score?hash=", "UTF-8"));
            if (string == null) {
                char[] charArray = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
                for (int i10 = 0; i10 < 20; i10++) {
                    sb2.append(charArray[Utilities.random.nextInt(charArray.length)]);
                }
            }
            sb3.append((CharSequence) sb2);
            int indexOf = str.indexOf(35);
            if (indexOf < 0) {
                str5 = str + "#" + ((Object) sb3);
            } else {
                String substring = str.substring(indexOf + 1);
                if (substring.indexOf(61) < 0 && substring.indexOf(63) < 0) {
                    if (substring.length() > 0) {
                        str5 = str + "?" + ((Object) sb3);
                    } else {
                        str5 = str + ((Object) sb3);
                    }
                }
                str5 = str + "&" + ((Object) sb3);
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt(((Object) sb2) + "_date", (int) (System.currentTimeMillis() / 1000));
            SerializedData serializedData = new SerializedData(messageObject.messageOwner.getObjectSize());
            messageObject.messageOwner.serializeToStream(serializedData);
            edit.putString(((Object) sb2) + "_m", Utilities.bytesToHex(serializedData.toByteArray()));
            String str7 = ((Object) sb2) + "_link";
            StringBuilder sb4 = new StringBuilder();
            sb4.append("https://");
            sb4.append(MessagesController.getInstance(messageObject.currentAccount).linkPrefix);
            sb4.append("/");
            sb4.append(str3);
            if (!TextUtils.isEmpty(str2)) {
                str6 = "?game=" + str2;
            }
            sb4.append(str6);
            edit.putString(str7, sb4.toString());
            edit.commit();
            pf.d.n(activity, str5, false);
            serializedData.cleanup();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new vj1(this));
        org.telegram.ui.ActionBar.y n10 = this.actionBar.n();
        this.f41584b = n10.g(1, R.drawable.share, AndroidUtilities.dp(54.0f));
        n10.a(0, R.drawable.ic_ab_other).e(2, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
        this.actionBar.setTitle(this.f41586f);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        kVar.setSubtitle("@" + this.e);
        org.telegram.ui.Components.gr grVar = new org.telegram.ui.Components.gr(context, 1);
        this.f41585c = grVar;
        this.f41584b.addView(grVar, w7.z5.d(-1.0f, -1));
        this.f41585c.setAlpha(0.0f);
        this.f41585c.setScaleX(0.1f);
        this.f41585c.setScaleY(0.1f);
        this.f41585c.setVisibility(4);
        AndroidUtilities.checkAndroidTheme(context, true);
        WebView webView = new WebView(context);
        this.f41583a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f41583a.getSettings().setDomStorageEnabled(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.f41583a.setLayerType(2, null);
        this.f41583a.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING);
        this.f41583a.getSettings().setMediaPlaybackRequiresUserGesture(false);
        this.f41583a.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(this.f41583a, true);
        this.f41583a.addJavascriptInterface(new wj1(this), "TelegramWebviewProxy");
        this.f41583a.setWebViewClient(new org.telegram.ui.Components.ng0(this, 1));
        frameLayout.addView(this.f41583a, w7.z5.d(-1.0f, -1));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f19601d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f19880s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f19935v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f19899t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, Integer.MIN_VALUE, null, null, null, null, org.telegram.ui.ActionBar.g6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1073741824, null, null, null, null, org.telegram.ui.ActionBar.g6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.g6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41585c, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.D7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f41585c, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.E7));
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        AndroidUtilities.checkAndroidTheme(getParentActivity(), false);
        AndroidUtilities.cancelRunOnUIThread(this.f41589s);
        this.f41583a.setLayerType(0, null);
        this.f41589s = null;
        try {
            ViewParent parent = this.f41583a.getParent();
            if (parent != null) {
                ((FrameLayout) parent).removeView(this.f41583a);
            }
            this.f41583a.stopLoading();
            this.f41583a.loadUrl("about:blank");
            this.f41583a.destroy();
            this.f41583a = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        AndroidUtilities.cancelRunOnUIThread(this.f41589s);
        this.f41589s.run();
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        WebView webView;
        if (z10 && !z11 && (webView = this.f41583a) != null) {
            webView.loadUrl(this.d);
        }
    }
}
