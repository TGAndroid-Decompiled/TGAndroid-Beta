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
import org.telegram.ui.l3;
public final class z0 extends WebView {
    public static final int V = 0;
    public boolean E;
    public g3 F;
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
    public a4.m S;
    public c1 T;
    public Runnable U;
    public final int f39009a;
    public boolean f39010b;
    public final boolean f39011c;
    public String d;
    public e1 e;
    public z0 f39012f;
    public boolean h;
    public String f39013n;
    public String f39014r;
    public boolean f39015s;
    public boolean v;
    public int f39016w;
    public int f39017x;
    public String f39018y;

    public z0(Context context, boolean z10, long j3) {
        super(context);
        int i10 = d1.Q0;
        d1.Q0 = i10 + 1;
        this.f39009a = i10;
        this.f39018y = "about:blank";
        this.P = new HashMap();
        this.f39011c = z10;
        c("created new webview " + this);
        setOnLongClickListener(new l0(this));
        setWebViewClient(new n0(this, z10, context));
        setWebChromeClient(new w0(this, context, z10, j3));
        setFindListener(new x0(this));
        if (!z10) {
            setDownloadListener(new y0(this));
        }
    }

    public static void a(z0 z0Var) {
        if (!z0Var.f39011c) {
            m2 a2 = m2.a(z0Var);
            n2 b10 = n2.b();
            if (a2 == null) {
                b10.getClass();
            } else {
                if (b10.f38882a == null) {
                    b10.f38882a = new HashMap();
                }
                if (!TextUtils.isEmpty(a2.f38873b)) {
                    b10.f38882a.put(a2.f38873b, a2);
                    b10.c();
                    b10.d();
                }
            }
            e1 e1Var = z0Var.e;
            if (e1Var != null && a2 != null) {
                e1Var.d = a2;
                f1.c(e1Var);
            }
        }
    }

    public final void b(m2 m2Var) {
        h0 h0Var;
        if (m2Var != null) {
            d1 d1Var = this.Q;
            boolean z10 = false;
            if (d1Var != null && (h0Var = d1Var.f38740c) != null) {
                int i10 = m2Var.e;
                if (i10 != 0) {
                    h0Var.o(i10, true);
                    this.f39015s = true;
                }
                int i11 = m2Var.f38875f;
                if (i11 != 0) {
                    this.Q.f38740c.o(i11, false);
                    this.v = true;
                } else {
                    i11 = -1;
                }
                Bitmap bitmap = m2Var.f38876i;
                if (bitmap != null) {
                    d1 d1Var2 = this.Q;
                    this.O = bitmap;
                    d1Var2.getClass();
                    this.M = true;
                }
                if (!TextUtils.isEmpty(m2Var.d)) {
                    String str = m2Var.d;
                    this.f39014r = str;
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
        FileLog.d("[webview] #" + this.f39009a + " " + str);
    }

    @Override
    public final void clearHistory() {
        c("clearHistory");
        super.clearHistory();
    }

    public final void d(String str) {
        evaluateJavascript(str, new i0(0));
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
        g3 g3Var = this.F;
        if (g3Var != null) {
            g3Var.dismiss();
            this.F = null;
        }
        b(m2Var);
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
            return this.f39018y;
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
        g3 g3Var = this.F;
        if (g3Var != null) {
            g3Var.dismiss();
            this.F = null;
        }
        if (!this.f39011c) {
            b(n2.b().a(AndroidUtilities.getHostAuthority(str, true)));
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
            ((l3) ((org.telegram.ui.g) c1Var).f33806b).K.f0();
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
        g3 g3Var = this.F;
        if (g3Var != null) {
            g3Var.dismiss();
            this.F = null;
        }
        if (!this.f39011c) {
            b(n2.b().a(AndroidUtilities.getHostAuthority(str, true)));
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
