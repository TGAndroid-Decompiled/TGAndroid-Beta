package org.telegram.ui.web;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebView;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.p3;
public final class v0 extends WebView {
    public static final int P = 0;
    public boolean A;
    public f3 B;
    public int C;
    public int D;
    public Runnable E;
    public boolean F;
    public String G;
    public String H;
    public boolean I;
    public boolean J;
    public Bitmap K;
    public final HashMap L;
    public y0 M;
    public x0 N;
    public Runnable O;
    public final int f44036a;
    public boolean f44037b;
    public final boolean f44038c;
    public String d;
    public z0 f44039e;
    public v0 f44040f;
    public boolean h;
    public String f44041n;
    public String f44042r;
    public boolean f44043s;
    public boolean v;
    public int f44044w;
    public int f44045x;
    public String f44046y;

    public v0(Context context, boolean z10, long j10) {
        super(context);
        int i9 = y0.J0;
        y0.J0 = i9 + 1;
        this.f44036a = i9;
        this.f44046y = "about:blank";
        this.L = new HashMap();
        this.f44038c = z10;
        c("created new webview " + this);
        setOnLongClickListener(new i0(this));
        setWebViewClient(new k0(this, z10, context));
        setWebChromeClient(new s0(this, context, z10, j10));
        setFindListener(new t0(this));
        if (!z10) {
            setDownloadListener(new u0(this));
        }
    }

    public static void a(v0 v0Var) {
        if (!v0Var.f44038c) {
            h2 a2 = h2.a(v0Var);
            i2 b10 = i2.b();
            if (a2 == null) {
                b10.getClass();
            } else {
                if (b10.f43894a == null) {
                    b10.f43894a = new HashMap();
                }
                if (!TextUtils.isEmpty(a2.f43880b)) {
                    b10.f43894a.put(a2.f43880b, a2);
                    b10.c();
                    b10.d();
                }
            }
            z0 z0Var = v0Var.f44039e;
            if (z0Var != null && a2 != null) {
                z0Var.d = a2;
                a1.c(z0Var);
            }
        }
    }

    public final void b(h2 h2Var) {
        e0 e0Var;
        if (h2Var != null) {
            y0 y0Var = this.M;
            boolean z10 = false;
            if (y0Var != null && (e0Var = y0Var.f44074c) != null) {
                int i9 = h2Var.f43882e;
                if (i9 != 0) {
                    e0Var.o(i9, true);
                    this.f44043s = true;
                }
                int i10 = h2Var.f43883f;
                if (i10 != 0) {
                    this.M.f44074c.o(i10, false);
                    this.v = true;
                } else {
                    i10 = -1;
                }
                Bitmap bitmap = h2Var.f43884i;
                if (bitmap != null) {
                    y0 y0Var2 = this.M;
                    this.K = bitmap;
                    y0Var2.getClass();
                    this.I = true;
                }
                if (!TextUtils.isEmpty(h2Var.d)) {
                    String str = h2Var.d;
                    this.f44042r = str;
                    y0 y0Var3 = this.M;
                    this.G = str;
                    y0Var3.E();
                    z10 = true;
                }
                if (SharedConfig.adaptableColorInBrowser) {
                    setBackgroundColor(i10);
                }
            }
            if (!z10) {
                setTitle(null);
                y0 y0Var4 = this.M;
                if (y0Var4 != null) {
                    y0Var4.E();
                }
            }
        }
    }

    public final void c(String str) {
        FileLog.d("[webview] #" + this.f44036a + " " + str);
    }

    @Override
    public final void clearHistory() {
        c("clearHistory");
        super.clearHistory();
    }

    public final void d(String str) {
        evaluateJavascript(str, new f0(0));
    }

    @Override
    public final void destroy() {
        c("destroy");
        super.destroy();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public final void e(String str, h2 h2Var) {
        f3 f3Var = this.B;
        if (f3Var != null) {
            f3Var.dismiss();
            this.B = null;
        }
        b(h2Var);
        this.d = str;
        String b10 = y0.b(str);
        c("loadUrl " + b10 + " with cached meta");
        super.loadUrl(b10);
        y0 y0Var = this.M;
        if (y0Var != null) {
            y0Var.F(!super.canGoBack(), !canGoForward());
        }
    }

    public final void f(y0 y0Var, x0 x0Var) {
        boolean z10;
        c("setContainers(" + y0Var + ", " + x0Var + ")");
        if (this.M == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.M = y0Var;
        this.N = x0Var;
        if (z10) {
            d("window.__tg__postBackgroundChange()");
        }
    }

    @Override
    public Bitmap getFavicon() {
        if (this.h) {
            return null;
        }
        return this.K;
    }

    public String getOpenURL() {
        return this.d;
    }

    public float getScrollProgress() {
        float max = Math.max(1, computeVerticalScrollRange() - computeVerticalScrollExtent());
        if (max <= getHeight()) {
            return 0.0f;
        }
        return Utilities.clamp01(getScrollY() / max);
    }

    public int getSearchCount() {
        return this.D;
    }

    public int getSearchIndex() {
        return this.C;
    }

    @Override
    public String getTitle() {
        return this.G;
    }

    @Override
    public String getUrl() {
        if (this.A) {
            return this.f44046y;
        }
        return super.getUrl();
    }

    @Override
    public final void goBack() {
        c("goBack");
        super.goBack();
    }

    @Override
    public final void goForward() {
        c("goForward");
        super.goForward();
    }

    @Override
    public final void loadData(String str, String str2, String str3) {
        this.d = null;
        StringBuilder q10 = j3.r0.q("loadData ", str, " ", str2, " ");
        q10.append(str3);
        c(q10.toString());
        super.loadData(str, str2, str3);
    }

    @Override
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.d = null;
        StringBuilder q10 = j3.r0.q("loadDataWithBaseURL ", str, " ", str2, " ");
        j3.r0.A(q10, str3, " ", str4, " ");
        q10.append(str5);
        c(q10.toString());
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override
    public final void loadUrl(String str) {
        f3 f3Var = this.B;
        if (f3Var != null) {
            f3Var.dismiss();
            this.B = null;
        }
        if (!this.f44038c) {
            b(i2.b().a(AndroidUtilities.getHostAuthority(str, true)));
        }
        this.d = str;
        String b10 = y0.b(str);
        c("loadUrl " + b10);
        super.loadUrl(b10);
        y0 y0Var = this.M;
        if (y0Var != null) {
            y0Var.F(!super.canGoBack(), true ^ canGoForward());
        }
    }

    @Override
    public final void onAttachedToWindow() {
        c("attached");
        AndroidUtilities.checkAndroidTheme(getContext(), true);
        super.onAttachedToWindow();
    }

    @Override
    public final boolean onCheckIsTextEditor() {
        y0 y0Var = this.M;
        if (y0Var == null) {
            c("onCheckIsTextEditor: no container");
            return false;
        }
        boolean isFocusable = y0Var.isFocusable();
        c("onCheckIsTextEditor: " + isFocusable);
        return isFocusable;
    }

    @Override
    public final void onDetachedFromWindow() {
        c("detached");
        AndroidUtilities.checkAndroidTheme(getContext(), false);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
    }

    @Override
    public final void onPause() {
        c("onPause");
        super.onPause();
    }

    @Override
    public final void onResume() {
        c("onResume");
        super.onResume();
    }

    @Override
    public final void onScrollChanged(int i9, int i10, int i11, int i12) {
        super.onScrollChanged(i9, i10, i11, i12);
        x0 x0Var = this.N;
        if (x0Var != null) {
            getScrollX();
            getScrollY();
            ((p3) ((org.telegram.ui.g) x0Var).f38388b).G.f0();
        }
        getScrollX();
        getScrollY();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.M.L = System.currentTimeMillis();
            if (!this.M.p()) {
                getSettings().setMediaPlaybackRequiresUserGesture(false);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void pauseTimers() {
        c("pauseTimers");
        super.pauseTimers();
    }

    @Override
    public final void postUrl(String str, byte[] bArr) {
        c("postUrl " + str + " " + bArr);
        super.postUrl(str, bArr);
    }

    @Override
    public final void reload() {
        CookieManager.getInstance().flush();
        c("reload");
        super.reload();
    }

    @Override
    public final void resumeTimers() {
        c("resumeTimers");
        super.resumeTimers();
    }

    public void setCloseListener(Runnable runnable) {
        this.O = runnable;
    }

    @Override
    public void setFocusable(int i9) {
        c("setFocusable " + i9);
        super.setFocusable(i9);
    }

    @Override
    public void setFocusableInTouchMode(boolean z10) {
        c("setFocusableInTouchMode " + z10);
        super.setFocusableInTouchMode(z10);
    }

    @Override
    public void setFocusedByDefault(boolean z10) {
        c("setFocusedByDefault " + z10);
        super.setFocusedByDefault(z10);
    }

    public void setScrollProgress(float f10) {
        setScrollY((int) (f10 * Math.max(1, computeVerticalScrollRange() - computeVerticalScrollExtent())));
    }

    @Override
    public void setScrollX(int i9) {
        super.setScrollX(i9);
    }

    @Override
    public void setScrollY(int i9) {
        super.setScrollY(i9);
    }

    public void setTitle(String str) {
        this.G = str;
    }

    @Override
    public final void stopLoading() {
        c("stopLoading");
        super.stopLoading();
    }

    @Override
    public final void stopNestedScroll() {
        c("stopNestedScroll");
        super.stopNestedScroll();
    }

    @Override
    public void setFocusable(boolean z10) {
        c("setFocusable " + z10);
        super.setFocusable(z10);
    }

    @Override
    public final void loadUrl(String str, Map map) {
        f3 f3Var = this.B;
        if (f3Var != null) {
            f3Var.dismiss();
            this.B = null;
        }
        if (!this.f44038c) {
            b(i2.b().a(AndroidUtilities.getHostAuthority(str, true)));
        }
        this.d = str;
        String b10 = y0.b(str);
        c("loadUrl " + b10 + " " + map);
        super.loadUrl(b10, map);
        y0 y0Var = this.M;
        if (y0Var != null) {
            y0Var.F(!super.canGoBack(), !canGoForward());
        }
    }
}
