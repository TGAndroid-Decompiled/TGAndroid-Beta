package org.telegram.ui.web;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebView;
import b8.xf;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.az;
import org.telegram.ui.ActionBar.t2;
import org.telegram.ui.l3;
public final class t0 extends WebView {
    public static final int W = 0;
    public String E;
    public boolean F;
    public t2 G;
    public int H;
    public int I;
    public Runnable J;
    public boolean K;
    public String L;
    public String M;
    public boolean N;
    public boolean O;
    public Bitmap P;
    public final HashMap Q;
    public w0 R;
    public boolean S;
    public c6.i T;
    public v0 U;
    public Runnable V;
    public final int f51021a;
    public boolean f51022b;
    public final boolean f51023c;
    public String d;
    public x0 f51024e;
    public t0 f51025f;
    public boolean h;
    public String f51026n;
    public String f51027r;
    public boolean f51028s;
    public boolean f51029w;
    public int f51030x;
    public int f51031y;

    public t0(Context context, boolean z10, long j10) {
        super(context);
        int i3 = w0.S0;
        w0.S0 = i3 + 1;
        this.f51021a = i3;
        this.E = "about:blank";
        this.Q = new HashMap();
        this.f51023c = z10;
        c("created new webview " + this);
        setOnLongClickListener(new h0(this));
        setWebViewClient(new j0(this, z10, context));
        setWebChromeClient(new q0(this, context, z10, j10));
        setFindListener(new r0(this));
        if (!z10) {
            setDownloadListener(new s0(this));
        }
    }

    public static void a(t0 t0Var) {
        if (!t0Var.f51023c) {
            y1 a10 = y1.a(t0Var);
            z1 b10 = z1.b();
            if (a10 == null) {
                b10.getClass();
            } else {
                if (b10.f51134a == null) {
                    b10.f51134a = new HashMap();
                }
                if (!TextUtils.isEmpty(a10.f51120b)) {
                    b10.f51134a.put(a10.f51120b, a10);
                    b10.c();
                    b10.d();
                }
            }
            x0 x0Var = t0Var.f51024e;
            if (x0Var != null && a10 != null) {
                x0Var.d = a10;
                xf.c(x0Var);
            }
        }
    }

    public final void b(y1 y1Var) {
        d0 d0Var;
        if (y1Var != null) {
            w0 w0Var = this.R;
            boolean z10 = false;
            if (w0Var != null && (d0Var = w0Var.f51064c) != null) {
                int i3 = y1Var.f51122e;
                if (i3 != 0) {
                    d0Var.o(i3, true);
                    this.f51028s = true;
                }
                int i10 = y1Var.f51123f;
                if (i10 != 0) {
                    this.R.f51064c.o(i10, false);
                    this.f51029w = true;
                } else {
                    i10 = -1;
                }
                Bitmap bitmap = y1Var.f51124i;
                if (bitmap != null) {
                    w0 w0Var2 = this.R;
                    this.P = bitmap;
                    w0Var2.getClass();
                    this.N = true;
                }
                if (!TextUtils.isEmpty(y1Var.d)) {
                    String str = y1Var.d;
                    this.f51027r = str;
                    w0 w0Var3 = this.R;
                    this.L = str;
                    w0Var3.H();
                    z10 = true;
                }
                if (az.f21670v0) {
                    setBackgroundColor(i10);
                }
            }
            if (!z10) {
                setTitle(null);
                w0 w0Var4 = this.R;
                if (w0Var4 != null) {
                    w0Var4.H();
                }
            }
        }
    }

    public final void c(String str) {
        a8.b("[webview] #" + this.f51021a + " " + str);
    }

    @Override
    public final void clearHistory() {
        c("clearHistory");
        super.clearHistory();
    }

    public final void d(String str) {
        evaluateJavascript(str, new e0(0));
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

    public final void e(String str, y1 y1Var) {
        t2 t2Var = this.G;
        if (t2Var != null) {
            t2Var.dismiss();
            this.G = null;
        }
        b(y1Var);
        this.d = str;
        String b10 = w0.b(str);
        c("loadUrl " + b10 + " with cached meta");
        super.loadUrl(b10);
        w0 w0Var = this.R;
        if (w0Var != null) {
            w0Var.I(!super.canGoBack(), !canGoForward());
        }
    }

    public final void f(w0 w0Var, v0 v0Var) {
        boolean z10;
        c("setContainers(" + w0Var + ", " + v0Var + ")");
        if (this.R == null && w0Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.R = w0Var;
        this.U = v0Var;
        if (z10 && !this.f51023c) {
            d("window.__tg__postBackgroundChange && window.__tg__postBackgroundChange()");
        }
    }

    @Override
    public Bitmap getFavicon() {
        if (this.h) {
            return null;
        }
        return this.P;
    }

    public String getOpenURL() {
        return this.d;
    }

    public float getScrollProgress() {
        float max = Math.max(1, computeVerticalScrollRange() - computeVerticalScrollExtent());
        if (max <= getHeight()) {
            return 0.0f;
        }
        return Utilities.l(getScrollY() / max);
    }

    public int getSearchCount() {
        return this.I;
    }

    public int getSearchIndex() {
        return this.H;
    }

    @Override
    public String getTitle() {
        return this.L;
    }

    @Override
    public String getUrl() {
        if (this.F) {
            return this.E;
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
        StringBuilder n4 = com.google.android.recaptcha.internal.a.n("loadData ", str, " ", str2, " ");
        n4.append(str3);
        c(n4.toString());
        super.loadData(str, str2, str3);
    }

    @Override
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.d = null;
        StringBuilder n4 = com.google.android.recaptcha.internal.a.n("loadDataWithBaseURL ", str, " ", str2, " ");
        com.google.android.recaptcha.internal.a.s(n4, str3, " ", str4, " ");
        n4.append(str5);
        c(n4.toString());
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override
    public final void loadUrl(String str) {
        t2 t2Var = this.G;
        if (t2Var != null) {
            t2Var.dismiss();
            this.G = null;
        }
        if (!this.f51023c) {
            b(z1.b().a(org.telegram.messenger.g0.K0(str, true)));
        }
        this.d = str;
        String b10 = w0.b(str);
        c("loadUrl " + b10);
        super.loadUrl(b10);
        w0 w0Var = this.R;
        if (w0Var != null) {
            w0Var.I(!super.canGoBack(), true ^ canGoForward());
        }
    }

    @Override
    public final void onAttachedToWindow() {
        c("attached");
        org.telegram.messenger.g0.u(getContext(), true);
        super.onAttachedToWindow();
    }

    @Override
    public final boolean onCheckIsTextEditor() {
        w0 w0Var = this.R;
        if (w0Var == null) {
            c("onCheckIsTextEditor: no container");
            return false;
        }
        boolean isFocusable = w0Var.isFocusable();
        c("onCheckIsTextEditor: " + isFocusable);
        return isFocusable;
    }

    @Override
    public final void onDetachedFromWindow() {
        c("detached");
        org.telegram.messenger.g0.u(getContext(), false);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
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
    public final void onScrollChanged(int i3, int i10, int i11, int i12) {
        super.onScrollChanged(i3, i10, i11, i12);
        v0 v0Var = this.U;
        if (v0Var != null) {
            getScrollX();
            getScrollY();
            ((l3) ((org.telegram.ui.f) v0Var).f45115b).M.d0();
        }
        getScrollX();
        getScrollY();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.R != null && motionEvent.getAction() == 0) {
            this.R.Q = System.currentTimeMillis();
            if (!this.R.r()) {
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
        this.V = runnable;
    }

    @Override
    public void setFocusable(int i3) {
        c("setFocusable " + i3);
        super.setFocusable(i3);
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
    public void setScrollX(int i3) {
        super.setScrollX(i3);
    }

    @Override
    public void setScrollY(int i3) {
        super.setScrollY(i3);
    }

    public void setTitle(String str) {
        this.L = str;
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
        t2 t2Var = this.G;
        if (t2Var != null) {
            t2Var.dismiss();
            this.G = null;
        }
        if (!this.f51023c) {
            b(z1.b().a(org.telegram.messenger.g0.K0(str, true)));
        }
        this.d = str;
        String b10 = w0.b(str);
        c("loadUrl " + b10 + " " + map);
        super.loadUrl(b10, map);
        w0 w0Var = this.R;
        if (w0Var != null) {
            w0Var.I(!super.canGoBack(), !canGoForward());
        }
    }
}
