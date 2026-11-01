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
public final class ue1 extends org.telegram.ui.ActionBar.k2 {
    public WebView f41925a;
    public org.telegram.ui.ActionBar.t0 f41926b;
    public org.telegram.ui.Components.iq f41927c;
    public final String d;
    public final String e;
    public final String f41928f;
    public final String h;
    public final org.telegram.messenger.kj f41929n;
    public final String f41930r;
    public m4 f41931s;

    public ue1(String str, String str2, String str3, String str4, org.telegram.messenger.kj kjVar) {
        super(null);
        String h;
        this.f41931s = new m4(this, 17);
        this.d = str;
        this.e = str2;
        this.f41928f = str3;
        this.f41929n = kjVar;
        this.f41930r = str4;
        StringBuilder sb2 = new StringBuilder("https://");
        sb2.append(org.telegram.messenger.wp.r1(this.currentAccount).U2);
        sb2.append("/");
        sb2.append(str2);
        if (TextUtils.isEmpty(str4)) {
            h = "";
        } else {
            h = sc.e.h("?game=", str4);
        }
        sb2.append(h);
        this.h = sb2.toString();
    }

    public static int Z(ue1 ue1Var) {
        return ue1Var.currentAccount;
    }

    public static void a0(String str, org.telegram.messenger.kj kjVar, Activity activity, String str2, String str3) {
        String str4;
        String str5;
        String str6 = "";
        try {
            SharedPreferences sharedPreferences = org.telegram.messenger.w0.f18945b.getSharedPreferences("botshare", 0);
            String string = sharedPreferences.getString("" + kjVar.f1(), null);
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
                    sb2.append(charArray[Utilities.f14520b.nextInt(charArray.length)]);
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
            SerializedData serializedData = new SerializedData(kjVar.f16690k.getObjectSize());
            kjVar.f16690k.serializeToStream(serializedData);
            edit.putString(((Object) sb2) + "_m", Utilities.f(serializedData.toByteArray()));
            String str7 = ((Object) sb2) + "_link";
            StringBuilder sb4 = new StringBuilder();
            sb4.append("https://");
            sb4.append(org.telegram.messenger.wp.r1(kjVar.I1).U2);
            sb4.append("/");
            sb4.append(str3);
            if (!TextUtils.isEmpty(str2)) {
                str6 = "?game=" + str2;
            }
            sb4.append(str6);
            edit.putString(str7, sb4.toString());
            edit.commit();
            gf.f.n(activity, str5, false);
            serializedData.cleanup();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.I7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.H7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.E7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.D7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21226t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21262v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21207s8));
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(2131231241);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new se1(this));
        org.telegram.ui.ActionBar.y p5 = this.actionBar.p();
        this.f41926b = p5.g(1, 2131232723, org.telegram.messenger.i0.L(54.0f));
        p5.a(0, 2131231245).e(2, 2131232264, org.telegram.messenger.dd.L0(2131747812, null));
        this.actionBar.setTitle(this.f41928f);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        lVar.setSubtitle("@" + this.e);
        org.telegram.ui.Components.iq iqVar = new org.telegram.ui.Components.iq(context, 1);
        this.f41927c = iqVar;
        this.f41926b.addView(iqVar, w7.b6.c(-1.0f, -1));
        this.f41927c.setAlpha(0.0f);
        this.f41927c.setScaleX(0.1f);
        this.f41927c.setScaleY(0.1f);
        this.f41927c.setVisibility(4);
        org.telegram.messenger.i0.u(context, true);
        WebView webView = new WebView(context);
        this.f41925a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f41925a.getSettings().setDomStorageEnabled(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.f41925a.setLayerType(2, null);
        this.f41925a.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING);
        this.f41925a.getSettings().setMediaPlaybackRequiresUserGesture(false);
        this.f41925a.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(this.f41925a, true);
        this.f41925a.addJavascriptInterface(new te1(this), "TelegramWebviewProxy");
        this.f41925a.setWebViewClient(new ji.i(this, 4));
        frameLayout.addView(this.f41925a, w7.b6.c(-1.0f, -1));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.F8));
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.i0.u(getParentActivity(), false);
        org.telegram.messenger.i0.r(this.f41931s);
        this.f41925a.setLayerType(0, null);
        this.f41931s = null;
        try {
            ViewParent parent = this.f41925a.getParent();
            if (parent != null) {
                ((FrameLayout) parent).removeView(this.f41925a);
            }
            this.f41925a.stopLoading();
            this.f41925a.loadUrl("about:blank");
            this.f41925a.destroy();
            this.f41925a = null;
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.i0.r(this.f41931s);
        this.f41931s.run();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            if (lVar != null) {
                lVar.F(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.G8, false), false);
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        WebView webView;
        if (z10 && !z11 && (webView = this.f41925a) != null) {
            webView.loadUrl(this.d);
        }
    }
}
