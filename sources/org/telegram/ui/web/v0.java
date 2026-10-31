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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.f8;
import org.telegram.messenger.tz;
import org.telegram.ui.ActionBar.z2;
import org.telegram.ui.l3;
import w7.m6;
public final class v0 extends WebView {
    public static final int V = 0;
    public String D;
    public boolean E;
    public z2 F;
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
    public z0 Q;
    public boolean R;
    public a4.l S;
    public y0 T;
    public Runnable U;
    public final int f43208a;
    public boolean f43209b;
    public final boolean f43210c;
    public String d;
    public a1 e;
    public v0 f43211f;
    public boolean h;
    public String f43212n;
    public String f43213r;
    public boolean f43214s;
    public boolean f43215w;
    public int f43216x;
    public int f43217y;

    public v0(Context context, boolean z10, long j10) {
        super(context);
        int i10 = z0.R0;
        z0.R0 = i10 + 1;
        this.f43208a = i10;
        this.D = "about:blank";
        this.P = new HashMap();
        this.f43210c = z10;
        c("created new webview " + this);
        setOnLongClickListener(new h0(this));
        setWebViewClient(new j0(this, z10, context));
        setWebChromeClient(new s0(this, context, z10, j10));
        setFindListener(new t0(this));
        if (!z10) {
            setDownloadListener(new u0(this));
        }
    }

    public static void a(v0 v0Var) {
        if (!v0Var.f43210c) {
            c2 a2 = c2.a(v0Var);
            d2 b10 = d2.b();
            if (a2 == null) {
                b10.getClass();
            } else {
                if (b10.f43017a == null) {
                    b10.f43017a = new HashMap();
                }
                if (!TextUtils.isEmpty(a2.f43008b)) {
                    b10.f43017a.put(a2.f43008b, a2);
                    b10.c();
                    b10.d();
                }
            }
            a1 a1Var = v0Var.e;
            if (a1Var != null && a2 != null) {
                a1Var.d = a2;
                m6.c(a1Var);
            }
        }
    }

    public final void b(c2 c2Var) {
        d0 d0Var;
        if (c2Var != null) {
            z0 z0Var = this.Q;
            boolean z10 = false;
            if (z0Var != null && (d0Var = z0Var.f43261c) != null) {
                int i10 = c2Var.e;
                if (i10 != 0) {
                    d0Var.o(i10, true);
                    this.f43214s = true;
                }
                int i11 = c2Var.f43010f;
                if (i11 != 0) {
                    this.Q.f43261c.o(i11, false);
                    this.f43215w = true;
                } else {
                    i11 = -1;
                }
                Bitmap bitmap = c2Var.f43011i;
                if (bitmap != null) {
                    z0 z0Var2 = this.Q;
                    this.O = bitmap;
                    z0Var2.getClass();
                    this.M = true;
                }
                if (!TextUtils.isEmpty(c2Var.d)) {
                    String str = c2Var.d;
                    this.f43213r = str;
                    z0 z0Var3 = this.Q;
                    this.K = str;
                    z0Var3.H();
                    z10 = true;
                }
                if (tz.f18189v0) {
                    setBackgroundColor(i11);
                }
            }
            if (!z10) {
                setTitle(null);
                z0 z0Var4 = this.Q;
                if (z0Var4 != null) {
                    z0Var4.H();
                }
            }
        }
    }

    public final void c(String str) {
        f8.b("[webview] #" + this.f43208a + " " + str);
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

    public final void e(String str, c2 c2Var) {
        z2 z2Var = this.F;
        if (z2Var != null) {
            z2Var.dismiss();
            this.F = null;
        }
        b(c2Var);
        this.d = str;
        String b10 = z0.b(str);
        c("loadUrl " + b10 + " with cached meta");
        super.loadUrl(b10);
        z0 z0Var = this.Q;
        if (z0Var != null) {
            z0Var.I(!super.canGoBack(), !canGoForward());
        }
    }

    public final void f(z0 z0Var, y0 y0Var) {
        boolean z10;
        c("setContainers(" + z0Var + ", " + y0Var + ")");
        if (this.Q == null && z0Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Q = z0Var;
        this.T = y0Var;
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
        return Utilities.l(getScrollY() / max);
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
            return this.D;
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
        StringBuilder v = a1.g.v("loadData ", str, " ", str2, " ");
        v.append(str3);
        c(v.toString());
        super.loadData(str, str2, str3);
    }

    @Override
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.d = null;
        StringBuilder v = a1.g.v("loadDataWithBaseURL ", str, " ", str2, " ");
        c3.i0.r(v, str3, " ", str4, " ");
        v.append(str5);
        c(v.toString());
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override
    public final void loadUrl(String str) {
        z2 z2Var = this.F;
        if (z2Var != null) {
            z2Var.dismiss();
            this.F = null;
        }
        if (!this.f43210c) {
            b(d2.b().a(org.telegram.messenger.i0.K0(str, true)));
        }
        this.d = str;
        String b10 = z0.b(str);
        c("loadUrl " + b10);
        super.loadUrl(b10);
        z0 z0Var = this.Q;
        if (z0Var != null) {
            z0Var.I(!super.canGoBack(), true ^ canGoForward());
        }
    }

    @Override
    public final void onAttachedToWindow() {
        c("attached");
        org.telegram.messenger.i0.u(getContext(), true);
        super.onAttachedToWindow();
    }

    @Override
    public final boolean onCheckIsTextEditor() {
        z0 z0Var = this.Q;
        if (z0Var == null) {
            c("onCheckIsTextEditor: no container");
            return false;
        }
        boolean isFocusable = z0Var.isFocusable();
        c("onCheckIsTextEditor: " + isFocusable);
        return isFocusable;
    }

    @Override
    public final void onDetachedFromWindow() {
        c("detached");
        org.telegram.messenger.i0.u(getContext(), false);
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
        y0 y0Var = this.T;
        if (y0Var != null) {
            getScrollX();
            getScrollY();
            ((l3) ((org.telegram.ui.e) y0Var).f36877b).L.d0();
        }
        getScrollX();
        getScrollY();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.Q != null && motionEvent.getAction() == 0) {
            this.Q.P = System.currentTimeMillis();
            if (!this.Q.r()) {
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
        z2 z2Var = this.F;
        if (z2Var != null) {
            z2Var.dismiss();
            this.F = null;
        }
        if (!this.f43210c) {
            b(d2.b().a(org.telegram.messenger.i0.K0(str, true)));
        }
        this.d = str;
        String b10 = z0.b(str);
        c("loadUrl " + b10 + " " + map);
        super.loadUrl(b10, map);
        z0 z0Var = this.Q;
        if (z0Var != null) {
            z0Var.I(!super.canGoBack(), !canGoForward());
        }
    }
}
