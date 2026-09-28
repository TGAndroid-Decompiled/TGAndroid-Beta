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
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.m3;
public final class y0 extends WebView {
    public static final int V = 0;
    public boolean E;
    public e3 F;
    public int G;
    public int H;
    public Runnable I;
    public boolean J;
    public String K;
    public String L;
    public boolean M;
    public boolean N;
    public Bitmap O;
    public final HashMap P;
    public b1 Q;
    public boolean R;
    public a4.m S;
    public a1 T;
    public Runnable U;
    public final int f39275a;
    public boolean f39276b;
    public final boolean f39277c;
    public String d;
    public c1 e;
    public y0 f39278f;
    public boolean h;
    public String f39279n;
    public String f39280r;
    public boolean f39281s;
    public boolean v;
    public int f39282w;
    public int f39283x;
    public String f39284y;

    public y0(Context context, boolean z10, long j3) {
        super(context);
        int i10 = b1.Q0;
        b1.Q0 = i10 + 1;
        this.f39275a = i10;
        this.f39284y = "about:blank";
        this.P = new HashMap();
        this.f39277c = z10;
        c("created new webview " + this);
        setOnLongClickListener(new k0(this));
        setWebViewClient(new m0(this, z10, context));
        setWebChromeClient(new v0(this, context, z10, j3));
        setFindListener(new w0(this));
        if (!z10) {
            setDownloadListener(new x0(this));
        }
    }

    public static void a(y0 y0Var) {
        if (!y0Var.f39277c) {
            m2 a2 = m2.a(y0Var);
            n2 b10 = n2.b();
            if (a2 == null) {
                b10.getClass();
            } else {
                if (b10.f39157a == null) {
                    b10.f39157a = new HashMap();
                }
                if (!TextUtils.isEmpty(a2.f39145b)) {
                    b10.f39157a.put(a2.f39145b, a2);
                    b10.c();
                    b10.d();
                }
            }
            c1 c1Var = y0Var.e;
            if (c1Var != null && a2 != null) {
                c1Var.d = a2;
                d1.c(c1Var);
            }
        }
    }

    public final void b(m2 m2Var) {
        g0 g0Var;
        if (m2Var != null) {
            b1 b1Var = this.Q;
            boolean z10 = false;
            if (b1Var != null && (g0Var = b1Var.f39001c) != null) {
                int i10 = m2Var.e;
                if (i10 != 0) {
                    g0Var.o(i10, true);
                    this.f39281s = true;
                }
                int i11 = m2Var.f39147f;
                if (i11 != 0) {
                    this.Q.f39001c.o(i11, false);
                    this.v = true;
                } else {
                    i11 = -1;
                }
                Bitmap bitmap = m2Var.f39148i;
                if (bitmap != null) {
                    b1 b1Var2 = this.Q;
                    this.O = bitmap;
                    b1Var2.getClass();
                    this.M = true;
                }
                if (!TextUtils.isEmpty(m2Var.d)) {
                    String str = m2Var.d;
                    this.f39280r = str;
                    b1 b1Var3 = this.Q;
                    this.K = str;
                    b1Var3.I();
                    z10 = true;
                }
                if (SharedConfig.adaptableColorInBrowser) {
                    setBackgroundColor(i11);
                }
            }
            if (!z10) {
                setTitle(null);
                b1 b1Var4 = this.Q;
                if (b1Var4 != null) {
                    b1Var4.I();
                }
            }
        }
    }

    public final void c(String str) {
        FileLog.d("[webview] #" + this.f39275a + " " + str);
    }

    @Override
    public final void clearHistory() {
        c("clearHistory");
        super.clearHistory();
    }

    public final void d(String str) {
        evaluateJavascript(str, new h0(0));
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return super.drawChild(canvas, view, j3);
    }

    public final void e(String str, m2 m2Var) {
        e3 e3Var = this.F;
        if (e3Var != null) {
            e3Var.dismiss();
            this.F = null;
        }
        b(m2Var);
        this.d = str;
        String b10 = b1.b(str);
        c("loadUrl " + b10 + " with cached meta");
        super.loadUrl(b10);
        b1 b1Var = this.Q;
        if (b1Var != null) {
            b1Var.J(!super.canGoBack(), !canGoForward());
        }
    }

    public final void f(b1 b1Var, a1 a1Var) {
        boolean z10;
        c("setContainers(" + b1Var + ", " + a1Var + ")");
        if (this.Q == null && b1Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Q = b1Var;
        this.T = a1Var;
        if (z10) {
            d("window.__tg__postBackgroundChange()");
        }
    }

    @Override
    public Bitmap getFavicon() {
        if (this.h) {
            return null;
        }
        return this.O;
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
        return this.H;
    }

    public int getSearchIndex() {
        return this.G;
    }

    @Override
    public String getTitle() {
        return this.K;
    }

    @Override
    public String getUrl() {
        if (this.E) {
            return this.f39284y;
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
        StringBuilder x10 = a4.a.x("loadData ", str, " ", str2, " ");
        x10.append(str3);
        c(x10.toString());
        super.loadData(str, str2, str3);
    }

    @Override
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.d = null;
        StringBuilder x10 = a4.a.x("loadDataWithBaseURL ", str, " ", str2, " ");
        a4.a.A(x10, str3, " ", str4, " ");
        x10.append(str5);
        c(x10.toString());
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override
    public final void loadUrl(String str) {
        e3 e3Var = this.F;
        if (e3Var != null) {
            e3Var.dismiss();
            this.F = null;
        }
        if (!this.f39277c) {
            b(n2.b().a(AndroidUtilities.getHostAuthority(str, true)));
        }
        this.d = str;
        String b10 = b1.b(str);
        c("loadUrl " + b10);
        super.loadUrl(b10);
        b1 b1Var = this.Q;
        if (b1Var != null) {
            b1Var.J(!super.canGoBack(), true ^ canGoForward());
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
        b1 b1Var = this.Q;
        if (b1Var == null) {
            c("onCheckIsTextEditor: no container");
            return false;
        }
        boolean isFocusable = b1Var.isFocusable();
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
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
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
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        a1 a1Var = this.T;
        if (a1Var != null) {
            getScrollX();
            getScrollY();
            ((m3) ((org.telegram.ui.g) a1Var).f33786b).K.f0();
        }
        getScrollX();
        getScrollY();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.Q != null && motionEvent.getAction() == 0) {
            this.Q.P = System.currentTimeMillis();
            if (!this.Q.s()) {
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
        this.U = runnable;
    }

    @Override
    public void setFocusable(int i10) {
        c("setFocusable " + i10);
        super.setFocusable(i10);
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

    public void setScrollProgress(float f7) {
        setScrollY((int) (f7 * Math.max(1, computeVerticalScrollRange() - computeVerticalScrollExtent())));
    }

    @Override
    public void setScrollX(int i10) {
        super.setScrollX(i10);
    }

    @Override
    public void setScrollY(int i10) {
        super.setScrollY(i10);
    }

    public void setTitle(String str) {
        this.K = str;
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
        e3 e3Var = this.F;
        if (e3Var != null) {
            e3Var.dismiss();
            this.F = null;
        }
        if (!this.f39277c) {
            b(n2.b().a(AndroidUtilities.getHostAuthority(str, true)));
        }
        this.d = str;
        String b10 = b1.b(str);
        c("loadUrl " + b10 + " " + map);
        super.loadUrl(b10, map);
        b1 b1Var = this.Q;
        if (b1Var != null) {
            b1Var.J(!super.canGoBack(), !canGoForward());
        }
    }
}
