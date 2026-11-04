package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
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
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
public final class uc1 extends org.telegram.ui.ActionBar.d2 {
    public WebView f50043a;
    public org.telegram.ui.ActionBar.q0 f50044b;
    public org.telegram.ui.Components.aq f50045c;
    public final String d;
    public final String f50046e;
    public final String f50047f;
    public final String h;
    public final org.telegram.messenger.zi f50048n;
    public final String f50049r;
    public o4 f50050s;

    public uc1(String str, String str2, String str3, String str4, org.telegram.messenger.zi ziVar) {
        super(null);
        String f10;
        this.f50050s = new o4(this, 17);
        this.d = str;
        this.f50046e = str2;
        this.f50047f = str3;
        this.f50048n = ziVar;
        this.f50049r = str4;
        StringBuilder sb2 = new StringBuilder("https://");
        sb2.append(org.telegram.messenger.hp.s1(this.currentAccount).V2);
        sb2.append("/");
        sb2.append(str2);
        if (TextUtils.isEmpty(str4)) {
            f10 = "";
        } else {
            f10 = t4.c.f("?game=", str4);
        }
        sb2.append(f10);
        this.h = sb2.toString();
    }

    public static int Z(uc1 uc1Var) {
        return uc1Var.currentAccount;
    }

    public static void a0(String str, org.telegram.messenger.zi ziVar, Activity activity, String str2, String str3) {
        String str4;
        String str5;
        String str6 = "";
        try {
            SharedPreferences sharedPreferences = org.telegram.messenger.t0.f25457b.getSharedPreferences("botshare", 0);
            String string = sharedPreferences.getString("" + ziVar.f1(), null);
            if (string == null) {
                str4 = "";
            } else {
                str4 = string;
            }
            StringBuilder sb2 = new StringBuilder(str4);
            StringBuilder sb3 = new StringBuilder("tgShareScoreUrl=" + URLEncoder.encode("tgb://share_game_score?hash=", "UTF-8"));
            if (string == null) {
                char[] charArray = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
                for (int i3 = 0; i3 < 20; i3++) {
                    sb2.append(charArray[Utilities.f21385b.nextInt(charArray.length)]);
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
            SerializedData serializedData = new SerializedData(ziVar.f26868k.getObjectSize());
            ziVar.f26868k.serializeToStream(serializedData);
            edit.putString(((Object) sb2) + "_m", Utilities.f(serializedData.toByteArray()));
            String str7 = ((Object) sb2) + "_link";
            StringBuilder sb4 = new StringBuilder();
            sb4.append("https://");
            sb4.append(org.telegram.messenger.hp.s1(ziVar.I1).V2);
            sb4.append("/");
            sb4.append(str3);
            if (!TextUtils.isEmpty(str2)) {
                str6 = "?game=" + str2;
            }
            sb4.append(str6);
            edit.putString(str7, sb4.toString());
            edit.commit();
            sf.c.p(activity, str5, false);
            serializedData.cleanup();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.H7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27878d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.E7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.D7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28179t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28216v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28160s8));
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new sc1(this));
        org.telegram.ui.ActionBar.x q10 = this.actionBar.q();
        this.f50044b = q10.g(1, 2131232724, org.telegram.messenger.g0.L(54.0f));
        q10.a(0, 2131231244).e(2, 2131232265, org.telegram.messenger.bd.M0(2131747804, null));
        this.actionBar.setTitle(this.f50047f);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        kVar.setSubtitle("@" + this.f50046e);
        org.telegram.ui.Components.aq aqVar = new org.telegram.ui.Components.aq(context, 1);
        this.f50045c = aqVar;
        this.f50044b.addView(aqVar, b8.mf.c(-1.0f, -1));
        this.f50045c.setAlpha(0.0f);
        this.f50045c.setScaleX(0.1f);
        this.f50045c.setScaleY(0.1f);
        this.f50045c.setVisibility(4);
        org.telegram.messenger.g0.u(context, true);
        WebView webView = new WebView(context);
        this.f50043a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f50043a.getSettings().setDomStorageEnabled(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.f50043a.setLayerType(2, null);
        this.f50043a.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING);
        this.f50043a.getSettings().setMediaPlaybackRequiresUserGesture(false);
        this.f50043a.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(this.f50043a, true);
        this.f50043a.addJavascriptInterface(new tc1(this), "TelegramWebviewProxy");
        this.f50043a.setWebViewClient(new o1(this, 3));
        frameLayout.addView(this.f50043a, b8.mf.c(-1.0f, -1));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.F8));
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.g0.u(getParentActivity(), false);
        org.telegram.messenger.g0.r(this.f50050s);
        this.f50043a.setLayerType(0, null);
        this.f50050s = null;
        try {
            ViewParent parent = this.f50043a.getParent();
            if (parent != null) {
                ((FrameLayout) parent).removeView(this.f50043a);
            }
            this.f50043a.stopLoading();
            this.f50043a.loadUrl("about:blank");
            this.f50043a.destroy();
            this.f50043a = null;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.g0.r(this.f50050s);
        this.f50050s.run();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.E(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G8, false), false);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        WebView webView;
        if (z10 && !z11 && (webView = this.f50043a) != null) {
            webView.loadUrl(this.d);
        }
    }
}
