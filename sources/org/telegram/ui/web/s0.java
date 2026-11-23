package org.telegram.ui.web;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebView;
import c8.hb;
import com.google.android.gms.internal.vision.e2;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.bz;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.k3;
public final class s0 extends WebView {
    public static final int W = 0;
    public String E;
    public boolean F;
    public w2 G;
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
    public v0 R;
    public boolean S;
    public cb.c T;
    public u0 U;
    public Runnable V;
    public final int f53531a;
    public boolean f53532b;
    public final boolean f53533c;
    public String d;
    public w0 f53534e;
    public s0 f53535f;
    public boolean h;
    public String f53536n;
    public String f53537r;
    public boolean f53538s;
    public boolean f53539w;
    public int f53540x;
    public int f53541y;

    public s0(Context context, boolean z10, long j3) {
        super(context);
        int i7 = v0.S0;
        v0.S0 = i7 + 1;
        this.f53531a = i7;
        this.E = "about:blank";
        this.Q = new HashMap();
        this.f53533c = z10;
        c("created new webview " + this);
        setOnLongClickListener(new g0(this));
        setWebViewClient(new i0(this, z10, context));
        setWebChromeClient(new p0(this, context, z10, j3));
        setFindListener(new q0(this));
        if (!z10) {
            setDownloadListener(new r0(this));
        }
    }

    public static void a(s0 s0Var) {
        if (!s0Var.f53533c) {
            a2 a10 = a2.a(s0Var);
            b2 b10 = b2.b();
            if (a10 == null) {
                b10.getClass();
            } else {
                if (b10.f53343a == null) {
                    b10.f53343a = new HashMap();
                }
                if (!TextUtils.isEmpty(a10.f53331b)) {
                    b10.f53343a.put(a10.f53331b, a10);
                    b10.c();
                    b10.d();
                }
            }
            w0 w0Var = s0Var.f53534e;
            if (w0Var != null && a10 != null) {
                w0Var.d = a10;
                hb.c(w0Var);
            }
        }
    }

    public final void b(a2 a2Var) {
        c0 c0Var;
        if (a2Var != null) {
            v0 v0Var = this.R;
            boolean z10 = false;
            if (v0Var != null && (c0Var = v0Var.f53579c) != null) {
                int i7 = a2Var.f53333e;
                if (i7 != 0) {
                    c0Var.o(i7, true);
                    this.f53538s = true;
                }
                int i10 = a2Var.f53334f;
                if (i10 != 0) {
                    this.R.f53579c.o(i10, false);
                    this.f53539w = true;
                } else {
                    i10 = -1;
                }
                Bitmap bitmap = a2Var.f53335i;
                if (bitmap != null) {
                    v0 v0Var2 = this.R;
                    this.P = bitmap;
                    v0Var2.getClass();
                    this.N = true;
                }
                if (!TextUtils.isEmpty(a2Var.d)) {
                    String str = a2Var.d;
                    this.f53537r = str;
                    v0 v0Var3 = this.R;
                    this.L = str;
                    v0Var3.I();
                    z10 = true;
                }
                if (bz.f23328v0) {
                    setBackgroundColor(i10);
                }
            }
            if (!z10) {
                setTitle(null);
                v0 v0Var4 = this.R;
                if (v0Var4 != null) {
                    v0Var4.I();
                }
            }
        }
    }

    public final void c(String str) {
        a8.b("[webview] #" + this.f53531a + " " + str);
    }

    @Override
    public final void clearHistory() {
        c("clearHistory");
        super.clearHistory();
    }

    public final void d(String str) {
        evaluateJavascript(str, new d0(0));
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

    public final void e(String str, a2 a2Var) {
        w2 w2Var = this.G;
        if (w2Var != null) {
            w2Var.dismiss();
            this.G = null;
        }
        b(a2Var);
        this.d = str;
        String b10 = v0.b(str);
        c("loadUrl " + b10 + " with cached meta");
        super.loadUrl(b10);
        v0 v0Var = this.R;
        if (v0Var != null) {
            v0Var.J(!super.canGoBack(), !canGoForward());
        }
    }

    public final void f(v0 v0Var, u0 u0Var) {
        boolean z10;
        c("setContainers(" + v0Var + ", " + u0Var + ")");
        if (this.R == null && v0Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.R = v0Var;
        this.U = u0Var;
        if (z10 && !this.f53533c) {
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
        StringBuilder n10 = e2.n("loadData ", str, " ", str2, " ");
        n10.append(str3);
        c(n10.toString());
        super.loadData(str, str2, str3);
    }

    @Override
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.d = null;
        StringBuilder n10 = e2.n("loadDataWithBaseURL ", str, " ", str2, " ");
        e2.r(n10, str3, " ", str4, " ");
        n10.append(str5);
        c(n10.toString());
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override
    public final void loadUrl(String str) {
        w2 w2Var = this.G;
        if (w2Var != null) {
            w2Var.dismiss();
            this.G = null;
        }
        if (!this.f53533c) {
            b(b2.b().a(org.telegram.messenger.g0.K0(str, true)));
        }
        this.d = str;
        String b10 = v0.b(str);
        c("loadUrl " + b10);
        super.loadUrl(b10);
        v0 v0Var = this.R;
        if (v0Var != null) {
            v0Var.J(!super.canGoBack(), true ^ canGoForward());
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
        v0 v0Var = this.R;
        if (v0Var == null) {
            c("onCheckIsTextEditor: no container");
            return false;
        }
        boolean isFocusable = v0Var.isFocusable();
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
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
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
    public final void onScrollChanged(int i7, int i10, int i11, int i12) {
        super.onScrollChanged(i7, i10, i11, i12);
        u0 u0Var = this.U;
        if (u0Var != null) {
            getScrollX();
            getScrollY();
            ((k3) ((org.telegram.ui.f) u0Var).f47651b).M.d0();
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
    public void setFocusable(int i7) {
        c("setFocusable " + i7);
        super.setFocusable(i7);
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
    public void setScrollX(int i7) {
        super.setScrollX(i7);
    }

    @Override
    public void setScrollY(int i7) {
        super.setScrollY(i7);
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
        w2 w2Var = this.G;
        if (w2Var != null) {
            w2Var.dismiss();
            this.G = null;
        }
        if (!this.f53533c) {
            b(b2.b().a(org.telegram.messenger.g0.K0(str, true)));
        }
        this.d = str;
        String b10 = v0.b(str);
        c("loadUrl " + b10 + " " + map);
        super.loadUrl(b10, map);
        v0 v0Var = this.R;
        if (v0Var != null) {
            v0Var.J(!super.canGoBack(), !canGoForward());
        }
    }
}
