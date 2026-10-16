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
import org.telegram.ui.o3;
public final class z0 extends WebView {
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
    public c1 Q;
    public boolean R;
    public a6.i S;
    public b1 T;
    public Runnable U;
    public final int f41261a;
    public boolean f41262b;
    public final boolean f41263c;
    public String d;
    public d1 e;
    public z0 f41264f;
    public boolean h;
    public String f41265n;
    public String f41266r;
    public boolean f41267s;
    public boolean v;
    public int f41268w;
    public int f41269x;
    public String f41270y;

    public z0(Context context, boolean z10, long j10) {
        super(context);
        int i10 = c1.Q0;
        c1.Q0 = i10 + 1;
        this.f41261a = i10;
        this.f41270y = "about:blank";
        this.P = new HashMap();
        this.f41263c = z10;
        c("created new webview " + this);
        setOnLongClickListener(new l0(this));
        setWebViewClient(new n0(this, z10, context));
        setWebChromeClient(new w0(this, context, z10, j10));
        setFindListener(new x0(this));
        if (!z10) {
            setDownloadListener(new y0(this));
        }
    }

    public static void a(z0 z0Var) {
        if (!z0Var.f41263c) {
            m2 a2 = m2.a(z0Var);
            n2 b10 = n2.b();
            if (a2 == null) {
                b10.getClass();
            } else {
                if (b10.f41132a == null) {
                    b10.f41132a = new HashMap();
                }
                if (!TextUtils.isEmpty(a2.f41122b)) {
                    b10.f41132a.put(a2.f41122b, a2);
                    b10.c();
                    b10.d();
                }
            }
            d1 d1Var = z0Var.e;
            if (d1Var != null && a2 != null) {
                d1Var.d = a2;
                e1.c(d1Var);
            }
        }
    }

    public final void b(m2 m2Var) {
        h0 h0Var;
        if (m2Var != null) {
            c1 c1Var = this.Q;
            boolean z10 = false;
            if (c1Var != null && (h0Var = c1Var.f40985c) != null) {
                int i10 = m2Var.e;
                if (i10 != 0) {
                    h0Var.o(i10, true);
                    this.f41267s = true;
                }
                int i11 = m2Var.f41124f;
                if (i11 != 0) {
                    this.Q.f40985c.o(i11, false);
                    this.v = true;
                } else {
                    i11 = -1;
                }
                Bitmap bitmap = m2Var.f41125i;
                if (bitmap != null) {
                    c1 c1Var2 = this.Q;
                    this.O = bitmap;
                    c1Var2.getClass();
                    this.M = true;
                }
                if (!TextUtils.isEmpty(m2Var.d)) {
                    String str = m2Var.d;
                    this.f41266r = str;
                    c1 c1Var3 = this.Q;
                    this.K = str;
                    c1Var3.H();
                    z10 = true;
                }
                if (SharedConfig.adaptableColorInBrowser) {
                    setBackgroundColor(i11);
                }
            }
            if (!z10) {
                setTitle(null);
                c1 c1Var4 = this.Q;
                if (c1Var4 != null) {
                    c1Var4.H();
                }
            }
        }
    }

    public final void c(String str) {
        FileLog.d("[webview] #" + this.f41261a + " " + str);
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
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public final void e(String str, m2 m2Var) {
        e3 e3Var = this.F;
        if (e3Var != null) {
            e3Var.dismiss();
            this.F = null;
        }
        b(m2Var);
        this.d = str;
        String b10 = c1.b(str);
        c("loadUrl " + b10 + " with cached meta");
        super.loadUrl(b10);
        c1 c1Var = this.Q;
        if (c1Var != null) {
            c1Var.I(!super.canGoBack(), !canGoForward());
        }
    }

    public final void f(c1 c1Var, b1 b1Var) {
        boolean z10;
        c("setContainers(" + c1Var + ", " + b1Var + ")");
        if (this.Q == null && c1Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Q = c1Var;
        this.T = b1Var;
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
            return this.f41270y;
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
        StringBuilder w9 = a1.g.w("loadData ", str, " ", str2, " ");
        w9.append(str3);
        c(w9.toString());
        super.loadData(str, str2, str3);
    }

    @Override
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.d = null;
        StringBuilder w9 = a1.g.w("loadDataWithBaseURL ", str, " ", str2, " ");
        a1.g.A(w9, str3, " ", str4, " ");
        w9.append(str5);
        c(w9.toString());
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override
    public final void loadUrl(String str) {
        e3 e3Var = this.F;
        if (e3Var != null) {
            e3Var.dismiss();
            this.F = null;
        }
        if (!this.f41263c) {
            b(n2.b().a(AndroidUtilities.getHostAuthority(str, true)));
        }
        this.d = str;
        String b10 = c1.b(str);
        c("loadUrl " + b10);
        super.loadUrl(b10);
        c1 c1Var = this.Q;
        if (c1Var != null) {
            c1Var.I(!super.canGoBack(), true ^ canGoForward());
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
        c1 c1Var = this.Q;
        if (c1Var == null) {
            c("onCheckIsTextEditor: no container");
            return false;
        }
        boolean isFocusable = c1Var.isFocusable();
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
        b1 b1Var = this.T;
        if (b1Var != null) {
            getScrollX();
            getScrollY();
            ((o3) ((org.telegram.ui.g) b1Var).f36029b).K.f0();
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
        e3 e3Var = this.F;
        if (e3Var != null) {
            e3Var.dismiss();
            this.F = null;
        }
        if (!this.f41263c) {
            b(n2.b().a(AndroidUtilities.getHostAuthority(str, true)));
        }
        this.d = str;
        String b10 = c1.b(str);
        c("loadUrl " + b10 + " " + map);
        super.loadUrl(b10, map);
        c1 c1Var = this.Q;
        if (c1Var != null) {
            c1Var.I(!super.canGoBack(), !canGoForward());
        }
    }
}
