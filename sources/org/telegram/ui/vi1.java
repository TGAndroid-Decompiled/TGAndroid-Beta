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
public final class vi1 extends org.telegram.ui.ActionBar.p2 {
    public WebView f39188a;
    public org.telegram.ui.ActionBar.w0 f39189b;
    public org.telegram.ui.Components.rq f39190c;
    public final String d;
    public final String e;
    public final String f39191f;
    public final String h;
    public final MessageObject f39192n;
    public final String f39193r;
    public z5 f39194s;

    public vi1(String str, String str2, String str3, String str4, MessageObject messageObject) {
        super(null);
        String e;
        this.f39194s = new z5(this, 15);
        this.d = str;
        this.e = str2;
        this.f39191f = str3;
        this.f39192n = messageObject;
        this.f39193r = str4;
        StringBuilder sb = new StringBuilder("https://");
        sb.append(MessagesController.getInstance(this.currentAccount).linkPrefix);
        sb.append("/");
        sb.append(str2);
        if (TextUtils.isEmpty(str4)) {
            e = "";
        } else {
            e = vh.v2.e("?game=", str4);
        }
        sb.append(e);
        this.h = sb.toString();
    }

    public static int U(vi1 vi1Var) {
        return vi1Var.currentAccount;
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
            StringBuilder sb = new StringBuilder(str4);
            StringBuilder sb2 = new StringBuilder("tgShareScoreUrl=" + URLEncoder.encode("tgb://share_game_score?hash=", "UTF-8"));
            if (string == null) {
                char[] charArray = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
                for (int i10 = 0; i10 < 20; i10++) {
                    sb.append(charArray[Utilities.random.nextInt(charArray.length)]);
                }
            }
            sb2.append((CharSequence) sb);
            int indexOf = str.indexOf(35);
            if (indexOf < 0) {
                str5 = str + "#" + ((Object) sb2);
            } else {
                String substring = str.substring(indexOf + 1);
                if (substring.indexOf(61) < 0 && substring.indexOf(63) < 0) {
                    if (substring.length() > 0) {
                        str5 = str + "?" + ((Object) sb2);
                    } else {
                        str5 = str + ((Object) sb2);
                    }
                }
                str5 = str + "&" + ((Object) sb2);
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt(((Object) sb) + "_date", (int) (System.currentTimeMillis() / 1000));
            SerializedData serializedData = new SerializedData(messageObject.messageOwner.getObjectSize());
            messageObject.messageOwner.serializeToStream(serializedData);
            edit.putString(((Object) sb) + "_m", Utilities.bytesToHex(serializedData.toByteArray()));
            String str7 = ((Object) sb) + "_link";
            StringBuilder sb3 = new StringBuilder();
            sb3.append("https://");
            sb3.append(MessagesController.getInstance(messageObject.currentAccount).linkPrefix);
            sb3.append("/");
            sb3.append(str3);
            if (!TextUtils.isEmpty(str2)) {
                str6 = "?game=" + str2;
            }
            sb3.append(str6);
            edit.putString(str7, sb3.toString());
            edit.commit();
            af.g.o(activity, str5, false);
            serializedData.cleanup();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ti1(this));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        this.f39189b = n10.g(1, R.drawable.share, AndroidUtilities.dp(54.0f));
        n10.a(0, R.drawable.ic_ab_other).e(2, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
        this.actionBar.setTitle(this.f39191f);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        kVar.setSubtitle("@" + this.e);
        org.telegram.ui.Components.rq rqVar = new org.telegram.ui.Components.rq(context, 1);
        this.f39190c = rqVar;
        this.f39189b.addView(rqVar, k7.b6.c(-1.0f, -1));
        this.f39190c.setAlpha(0.0f);
        this.f39190c.setScaleX(0.1f);
        this.f39190c.setScaleY(0.1f);
        this.f39190c.setVisibility(4);
        AndroidUtilities.checkAndroidTheme(context, true);
        WebView webView = new WebView(context);
        this.f39188a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f39188a.getSettings().setDomStorageEnabled(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.f39188a.setLayerType(2, null);
        this.f39188a.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING);
        this.f39188a.getSettings().setMediaPlaybackRequiresUserGesture(false);
        this.f39188a.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(this.f39188a, true);
        this.f39188a.addJavascriptInterface(new ui1(this), "TelegramWebviewProxy");
        this.f39188a.setWebViewClient(new org.telegram.ui.Components.rf0(this, 1));
        frameLayout.addView(this.f39188a, k7.b6.c(-1.0f, -1));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19906d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f20176s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20227v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20192t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, Integer.MIN_VALUE, null, null, null, null, org.telegram.ui.ActionBar.j6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1073741824, null, null, null, null, org.telegram.ui.ActionBar.j6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.j6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39190c, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.D7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39190c, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.E7));
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
        AndroidUtilities.cancelRunOnUIThread(this.f39194s);
        this.f39188a.setLayerType(0, null);
        this.f39194s = null;
        try {
            ViewParent parent = this.f39188a.getParent();
            if (parent != null) {
                ((FrameLayout) parent).removeView(this.f39188a);
            }
            this.f39188a.stopLoading();
            this.f39188a.loadUrl("about:blank");
            this.f39188a.destroy();
            this.f39188a = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        AndroidUtilities.cancelRunOnUIThread(this.f39194s);
        this.f39194s.run();
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        WebView webView;
        if (z4 && !z10 && (webView = this.f39188a) != null) {
            webView.loadUrl(this.d);
        }
    }
}
