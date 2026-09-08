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
import org.telegram.ui.m3;
public final class z0 extends WebView {
    public static final int V = 0;
    public boolean E;
    public f3 F;
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
    public d1 Q;
    public boolean R;
    public a6.i S;
    public c1 T;
    public Runnable U;
    public final int f42354a;
    public boolean f42355b;
    public final boolean f42356c;
    public String d;
    public e1 f42357e;
    public z0 f42358f;
    public boolean h;
    public String f42359n;
    public String f42360r;
    public boolean f42361s;
    public boolean v;
    public int f42362w;
    public int f42363x;
    public String f42364y;

    public z0(Context context, boolean z10, long j3) {
        super(context);
        int i10 = d1.Q0;
        d1.Q0 = i10 + 1;
        this.f42354a = i10;
        this.f42364y = "about:blank";
        this.P = new HashMap();
        this.f42356c = z10;
        c("created new webview " + this);
        setOnLongClickListener(new m0(this));
        setWebViewClient(new o0(this, z10, context));
        setWebChromeClient(new w0(this, context, z10, j3));
        setFindListener(new x0(this));
        if (!z10) {
            setDownloadListener(new y0(this));
        }
    }

    public static void a(z0 z0Var) {
        if (!z0Var.f42356c) {
            n2 a2 = n2.a(z0Var);
            o2 b10 = o2.b();
            if (a2 == null) {
                b10.getClass();
            } else {
                if (b10.f42228a == null) {
                    b10.f42228a = new HashMap();
                }
                if (!TextUtils.isEmpty(a2.f42216b)) {
                    b10.f42228a.put(a2.f42216b, a2);
                    b10.c();
                    b10.d();
                }
            }
            e1 e1Var = z0Var.f42357e;
            if (e1Var != null && a2 != null) {
                e1Var.d = a2;
                f1.c(e1Var);
            }
        }
    }

    public final void b(n2 n2Var) {
        i0 i0Var;
        if (n2Var != null) {
            d1 d1Var = this.Q;
            boolean z10 = false;
            if (d1Var != null && (i0Var = d1Var.f42066c) != null) {
                int i10 = n2Var.f42218e;
                if (i10 != 0) {
                    i0Var.o(i10, true);
                    this.f42361s = true;
                }
                int i11 = n2Var.f42219f;
                if (i11 != 0) {
                    this.Q.f42066c.o(i11, false);
                    this.v = true;
                } else {
                    i11 = -1;
                }
                Bitmap bitmap = n2Var.f42220i;
                if (bitmap != null) {
                    d1 d1Var2 = this.Q;
                    this.O = bitmap;
                    d1Var2.getClass();
                    this.M = true;
                }
                if (!TextUtils.isEmpty(n2Var.d)) {
                    String str = n2Var.d;
                    this.f42360r = str;
                    d1 d1Var3 = this.Q;
                    this.K = str;
                    d1Var3.I();
                    z10 = true;
                }
                if (SharedConfig.adaptableColorInBrowser) {
                    setBackgroundColor(i11);
                }
            }
            if (!z10) {
                setTitle(null);
                d1 d1Var4 = this.Q;
                if (d1Var4 != null) {
                    d1Var4.I();
                }
            }
        }
    }

    public final void c(String str) {
        FileLog.d("[webview] #" + this.f42354a + " " + str);
    }

    @Override
    public final void clearHistory() {
        c("clearHistory");
        super.clearHistory();
    }

    public final void d(String str) {
        evaluateJavascript(str, new j0(0));
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

    public final void e(String str, n2 n2Var) {
        f3 f3Var = this.F;
        if (f3Var != null) {
            f3Var.dismiss();
            this.F = null;
        }
        b(n2Var);
        this.d = str;
        String b10 = d1.b(str);
        c("loadUrl " + b10 + " with cached meta");
        super.loadUrl(b10);
        d1 d1Var = this.Q;
        if (d1Var != null) {
            d1Var.J(!super.canGoBack(), !canGoForward());
        }
    }

    public final void f(d1 d1Var, c1 c1Var) {
        boolean z10;
        c("setContainers(" + d1Var + ", " + c1Var + ")");
        if (this.Q == null && d1Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Q = d1Var;
        this.T = c1Var;
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
            return this.f42364y;
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
        StringBuilder w10 = a4.a.w("loadData ", str, " ", str2, " ");
        w10.append(str3);
        c(w10.toString());
        super.loadData(str, str2, str3);
    }

    @Override
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.d = null;
        StringBuilder w10 = a4.a.w("loadDataWithBaseURL ", str, " ", str2, " ");
        a4.a.z(w10, str3, " ", str4, " ");
        w10.append(str5);
        c(w10.toString());
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override
    public final void loadUrl(String str) {
        f3 f3Var = this.F;
        if (f3Var != null) {
            f3Var.dismiss();
            this.F = null;
        }
        if (!this.f42356c) {
            b(o2.b().a(AndroidUtilities.getHostAuthority(str, true)));
        }
        this.d = str;
        String b10 = d1.b(str);
        c("loadUrl " + b10);
        super.loadUrl(b10);
        d1 d1Var = this.Q;
        if (d1Var != null) {
            d1Var.J(!super.canGoBack(), true ^ canGoForward());
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
        d1 d1Var = this.Q;
        if (d1Var == null) {
            c("onCheckIsTextEditor: no container");
            return false;
        }
        boolean isFocusable = d1Var.isFocusable();
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
        c1 c1Var = this.T;
        if (c1Var != null) {
            getScrollX();
            getScrollY();
            ((m3) ((org.telegram.ui.g) c1Var).f36542b).K.f0();
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
        f3 f3Var = this.F;
        if (f3Var != null) {
            f3Var.dismiss();
            this.F = null;
        }
        if (!this.f42356c) {
            b(o2.b().a(AndroidUtilities.getHostAuthority(str, true)));
        }
        this.d = str;
        String b10 = d1.b(str);
        c("loadUrl " + b10 + " " + map);
        super.loadUrl(b10, map);
        d1 d1Var = this.Q;
        if (d1Var != null) {
            d1Var.J(!super.canGoBack(), !canGoForward());
        }
    }
}
