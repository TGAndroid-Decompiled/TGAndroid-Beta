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
public final class zc1 extends org.telegram.ui.ActionBar.e2 {
    public WebView f53936a;
    public org.telegram.ui.ActionBar.q0 f53937b;
    public org.telegram.ui.Components.hq f53938c;
    public final String d;
    public final String f53939e;
    public final String f53940f;
    public final String h;
    public final org.telegram.messenger.gj f53941n;
    public final String f53942r;
    public m4 f53943s;

    public zc1(String str, String str2, String str3, String str4, org.telegram.messenger.gj gjVar) {
        super(null);
        String k10;
        this.f53943s = new m4(this, 17);
        this.d = str;
        this.f53939e = str2;
        this.f53940f = str3;
        this.f53941n = gjVar;
        this.f53942r = str4;
        StringBuilder sb2 = new StringBuilder("https://");
        sb2.append(org.telegram.messenger.np.s1(this.currentAccount).V2);
        sb2.append("/");
        sb2.append(str2);
        if (TextUtils.isEmpty(str4)) {
            k10 = "";
        } else {
            k10 = r.b.k("?game=", str4);
        }
        sb2.append(k10);
        this.h = sb2.toString();
    }

    public static void a0(String str, org.telegram.messenger.gj gjVar, Activity activity, String str2, String str3) {
        String str4;
        String str5;
        String str6 = "";
        try {
            SharedPreferences sharedPreferences = org.telegram.messenger.t0.f26600b.getSharedPreferences("botshare", 0);
            String string = sharedPreferences.getString("" + gjVar.e1(), null);
            if (string == null) {
                str4 = "";
            } else {
                str4 = string;
            }
            StringBuilder sb2 = new StringBuilder(str4);
            StringBuilder sb3 = new StringBuilder("tgShareScoreUrl=" + URLEncoder.encode("tgb://share_game_score?hash=", "UTF-8"));
            if (string == null) {
                char[] charArray = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
                for (int i7 = 0; i7 < 20; i7++) {
                    sb2.append(charArray[Utilities.f22414b.nextInt(charArray.length)]);
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
            SerializedData serializedData = new SerializedData(gjVar.f23817k.getObjectSize());
            gjVar.f23817k.serializeToStream(serializedData);
            edit.putString(((Object) sb2) + "_m", Utilities.f(serializedData.toByteArray()));
            String str7 = ((Object) sb2) + "_link";
            StringBuilder sb4 = new StringBuilder();
            sb4.append("https://");
            sb4.append(org.telegram.messenger.np.s1(gjVar.K1).V2);
            sb4.append("/");
            sb4.append(str3);
            if (!TextUtils.isEmpty(str2)) {
                str6 = "?game=" + str2;
            }
            sb4.append(str6);
            edit.putString(str7, sb4.toString());
            edit.commit();
            vf.c.p(activity, str5, false);
            serializedData.cleanup();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.I7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.H7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28849d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.E7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.D7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29186v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29129s8));
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new xc1(this));
        org.telegram.ui.ActionBar.y s5 = this.actionBar.s();
        this.f53937b = s5.g(1, 2131232727, org.telegram.messenger.g0.L(54.0f));
        s5.a(0, 2131231244).e(2, 2131232266, org.telegram.messenger.hd.M0(2131747796, null));
        this.actionBar.setTitle(this.f53940f);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        kVar.setSubtitle("@" + this.f53939e);
        org.telegram.ui.Components.hq hqVar = new org.telegram.ui.Components.hq(context, 1);
        this.f53938c = hqVar;
        this.f53937b.addView(hqVar, c8.ja.c(-1.0f, -1));
        this.f53938c.setAlpha(0.0f);
        this.f53938c.setScaleX(0.1f);
        this.f53938c.setScaleY(0.1f);
        this.f53938c.setVisibility(4);
        org.telegram.messenger.g0.u(context, true);
        WebView webView = new WebView(context);
        this.f53936a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f53936a.getSettings().setDomStorageEnabled(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.f53936a.setLayerType(2, null);
        this.f53936a.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING);
        this.f53936a.getSettings().setMediaPlaybackRequiresUserGesture(false);
        this.f53936a.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(this.f53936a, true);
        this.f53936a.addJavascriptInterface(new yc1(this), "TelegramWebviewProxy");
        this.f53936a.setWebViewClient(new n1(this, 3));
        frameLayout.addView(this.f53936a, c8.ja.c(-1.0f, -1));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.F8));
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
        org.telegram.messenger.g0.r(this.f53943s);
        this.f53936a.setLayerType(0, null);
        this.f53943s = null;
        try {
            ViewParent parent = this.f53936a.getParent();
            if (parent != null) {
                ((FrameLayout) parent).removeView(this.f53936a);
            }
            this.f53936a.stopLoading();
            this.f53936a.loadUrl("about:blank");
            this.f53936a.destroy();
            this.f53936a = null;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.g0.r(this.f53943s);
        this.f53943s.run();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.I(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.G8, false), false);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        WebView webView;
        if (z10 && !z11 && (webView = this.f53936a) != null) {
            webView.loadUrl(this.d);
        }
    }
}
