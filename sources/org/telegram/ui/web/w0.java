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
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.p3;
import org.telegram.ui.yh;
public final class w0 extends WebView {
    public static final int Q = 0;
    public boolean B;
    public g3 C;
    public int D;
    public int E;
    public Runnable F;
    public boolean G;
    public String H;
    public String I;
    public boolean J;
    public boolean K;
    public Bitmap L;
    public final HashMap M;
    public a1 N;
    public z0 O;
    public Runnable P;
    public final int f39682a;
    public boolean f39683b;
    public final boolean f39684c;
    public String d;
    public b1 e;
    public w0 f39685f;
    public boolean h;
    public String f39686n;
    public String f39687r;
    public boolean f39688s;
    public boolean v;
    public int f39689w;
    public int f39690x;
    public String f39691y;

    public w0(Context context, boolean z4, long j10) {
        super(context);
        int i10 = a1.K0;
        a1.K0 = i10 + 1;
        this.f39682a = i10;
        this.f39691y = "about:blank";
        this.M = new HashMap();
        this.f39684c = z4;
        c("created new webview " + this);
        setOnLongClickListener(new i0(this));
        setWebViewClient(new k0(this, z4, context));
        setWebChromeClient(new t0(this, context, z4, j10));
        setFindListener(new u0(this));
        if (!z4) {
            setDownloadListener(new v0(this));
        }
    }

    public static void a(w0 w0Var) {
        if (!w0Var.f39684c) {
            k2 a2 = k2.a(w0Var);
            l2 b10 = l2.b();
            if (a2 == null) {
                b10.getClass();
            } else {
                if (b10.f39573a == null) {
                    b10.f39573a = new HashMap();
                }
                if (!TextUtils.isEmpty(a2.f39560b)) {
                    b10.f39573a.put(a2.f39560b, a2);
                    b10.c();
                    b10.d();
                }
            }
            b1 b1Var = w0Var.e;
            if (b1Var != null && a2 != null) {
                b1Var.d = a2;
                c1.c(b1Var);
            }
        }
    }

    public final void b(k2 k2Var) {
        e0 e0Var;
        if (k2Var != null) {
            a1 a1Var = this.N;
            boolean z4 = false;
            if (a1Var != null && (e0Var = a1Var.f39424c) != null) {
                int i10 = k2Var.e;
                if (i10 != 0) {
                    e0Var.o(i10, true);
                    this.f39688s = true;
                }
                int i11 = k2Var.f39562f;
                if (i11 != 0) {
                    this.N.f39424c.o(i11, false);
                    this.v = true;
                } else {
                    i11 = -1;
                }
                Bitmap bitmap = k2Var.f39563i;
                if (bitmap != null) {
                    a1 a1Var2 = this.N;
                    this.L = bitmap;
                    a1Var2.getClass();
                    this.J = true;
                }
                if (!TextUtils.isEmpty(k2Var.d)) {
                    String str = k2Var.d;
                    this.f39687r = str;
                    a1 a1Var3 = this.N;
                    this.H = str;
                    a1Var3.E();
                    z4 = true;
                }
                if (SharedConfig.adaptableColorInBrowser) {
                    setBackgroundColor(i11);
                }
            }
            if (!z4) {
                setTitle(null);
                a1 a1Var4 = this.N;
                if (a1Var4 != null) {
                    a1Var4.E();
                }
            }
        }
    }

    public final void c(String str) {
        FileLog.d("[webview] #" + this.f39682a + " " + str);
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

    public final void e(String str, k2 k2Var) {
        g3 g3Var = this.C;
        if (g3Var != null) {
            g3Var.dismiss();
            this.C = null;
        }
        b(k2Var);
        this.d = str;
        String b10 = a1.b(str);
        c("loadUrl " + b10 + " with cached meta");
        super.loadUrl(b10);
        a1 a1Var = this.N;
        if (a1Var != null) {
            a1Var.F(!super.canGoBack(), !canGoForward());
        }
    }

    public final void f(a1 a1Var, z0 z0Var) {
        boolean z4;
        c("setContainers(" + a1Var + ", " + z0Var + ")");
        if (this.N == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.N = a1Var;
        this.O = z0Var;
        if (z4) {
            d("window.__tg__postBackgroundChange()");
        }
    }

    @Override
    public Bitmap getFavicon() {
        if (this.h) {
            return null;
        }
        return this.L;
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
        return this.E;
    }

    public int getSearchIndex() {
        return this.D;
    }

    @Override
    public String getTitle() {
        return this.H;
    }

    @Override
    public String getUrl() {
        if (this.B) {
            return this.f39691y;
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
        StringBuilder m9 = yh.m("loadData ", str, " ", str2, " ");
        m9.append(str3);
        c(m9.toString());
        super.loadData(str, str2, str3);
    }

    @Override
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.d = null;
        StringBuilder m9 = yh.m("loadDataWithBaseURL ", str, " ", str2, " ");
        yh.x(m9, str3, " ", str4, " ");
        m9.append(str5);
        c(m9.toString());
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override
    public final void loadUrl(String str) {
        g3 g3Var = this.C;
        if (g3Var != null) {
            g3Var.dismiss();
            this.C = null;
        }
        if (!this.f39684c) {
            b(l2.b().a(AndroidUtilities.getHostAuthority(str, true)));
        }
        this.d = str;
        String b10 = a1.b(str);
        c("loadUrl " + b10);
        super.loadUrl(b10);
        a1 a1Var = this.N;
        if (a1Var != null) {
            a1Var.F(!super.canGoBack(), true ^ canGoForward());
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
        a1 a1Var = this.N;
        if (a1Var == null) {
            c("onCheckIsTextEditor: no container");
            return false;
        }
        boolean isFocusable = a1Var.isFocusable();
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
        z0 z0Var = this.O;
        if (z0Var != null) {
            getScrollX();
            getScrollY();
            ((p3) ((org.telegram.ui.h) z0Var).f34709b).H.f0();
        }
        getScrollX();
        getScrollY();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.N.M = System.currentTimeMillis();
            if (!this.N.p()) {
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
        this.P = runnable;
    }

    @Override
    public void setFocusable(int i10) {
        c("setFocusable " + i10);
        super.setFocusable(i10);
    }

    @Override
    public void setFocusableInTouchMode(boolean z4) {
        c("setFocusableInTouchMode " + z4);
        super.setFocusableInTouchMode(z4);
    }

    @Override
    public void setFocusedByDefault(boolean z4) {
        c("setFocusedByDefault " + z4);
        super.setFocusedByDefault(z4);
    }

    public void setScrollProgress(float f10) {
        setScrollY((int) (f10 * Math.max(1, computeVerticalScrollRange() - computeVerticalScrollExtent())));
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
        this.H = str;
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
    public void setFocusable(boolean z4) {
        c("setFocusable " + z4);
        super.setFocusable(z4);
    }

    @Override
    public final void loadUrl(String str, Map map) {
        g3 g3Var = this.C;
        if (g3Var != null) {
            g3Var.dismiss();
            this.C = null;
        }
        if (!this.f39684c) {
            b(l2.b().a(AndroidUtilities.getHostAuthority(str, true)));
        }
        this.d = str;
        String b10 = a1.b(str);
        c("loadUrl " + b10 + " " + map);
        super.loadUrl(b10, map);
        a1 a1Var = this.N;
        if (a1Var != null) {
            a1Var.F(!super.canGoBack(), !canGoForward());
        }
    }
}
