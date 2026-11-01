package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.CookieManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class r1 extends FrameLayout implements org.telegram.ui.Cells.j9 {
    public final q1 f40937a;
    public final org.telegram.ui.Components.n81 f40938b;
    public z2 f40939c;
    public z2 d;
    public int e;
    public int f40940f;
    public int h;
    public int f40941n;
    public int f40942r;
    public boolean f40943s;
    public TL_iv.pageBlockEmbed f40944w;
    public final f4 f40945x;
    public final h4 f40946y;

    public r1(h4 h4Var, Context context, f4 f4Var) {
        super(context);
        this.f40946y = h4Var;
        this.f40945x = f4Var;
        setWillNotDraw(false);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            org.telegram.ui.Components.n81 n81Var = new org.telegram.ui.Components.n81(context, false, new n1(this));
            this.f40938b = n81Var;
            addView(n81Var);
            h4Var.N.add(this);
            q1 q1Var = new q1(this, context);
            this.f40937a = q1Var;
            q1Var.getSettings().setJavaScriptEnabled(true);
            q1Var.getSettings().setDomStorageEnabled(true);
            q1Var.getSettings().setAllowContentAccess(true);
            q1Var.getSettings().setMediaPlaybackRequiresUserGesture(false);
            q1Var.addJavascriptInterface(new ArticleViewer$BlockEmbedCell$TelegramWebviewProxy(this), "TelegramWebviewProxy");
            q1Var.getSettings().setMixedContentMode(0);
            CookieManager.getInstance().setAcceptThirdPartyCookies(q1Var, true);
            q1Var.setWebChromeClient(new o1(this, 0));
            q1Var.setWebViewClient(new ji.i(this, 1));
            addView(q1Var);
            return;
        }
        this.f40938b = null;
        this.f40937a = null;
    }

    public final void a(boolean z10) {
        q1 q1Var = this.f40937a;
        if (q1Var != null) {
            try {
                q1Var.stopLoading();
                q1Var.loadUrl("about:blank");
                if (z10) {
                    q1Var.destroy();
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
        this.f40944w = null;
        org.telegram.ui.Components.n81 n81Var = this.f40938b;
        if (n81Var != null) {
            n81Var.b();
        }
    }

    @Override
    public final void h(ArrayList arrayList) {
        z2 z2Var = this.f40939c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            arrayList.add(z2Var2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.f40939c;
        if (z2Var != null) {
            z2Var.i(this);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            z2Var2.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.f40946y.V) {
            this.f40944w = null;
        }
        z2 z2Var = this.f40939c;
        if (z2Var != null) {
            z2Var.f(this);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            z2Var2.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f40944w != null) {
            z2 z2Var = this.f40939c;
            h4 h4Var = this.f40946y;
            int i10 = 0;
            if (z2Var != null) {
                canvas.save();
                canvas.translate(this.e, this.f40940f);
                h4.t(h4Var, canvas, this, 0);
                this.f40939c.d(canvas, this);
                canvas.restore();
                i10 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.e, this.f40940f + this.h);
                h4.t(h4Var, canvas, this, i10);
                this.d.d(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.dd.L0(2131754868, null));
        if (this.f40939c != null) {
            sb2.append(", ");
            sb2.append(this.f40939c.d.getText());
        }
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        q1 q1Var = this.f40937a;
        if (q1Var != null) {
            int i14 = this.f40941n;
            q1Var.layout(i14, 0, q1Var.getMeasuredWidth() + i14, q1Var.getMeasuredHeight());
        }
        org.telegram.ui.Components.n81 n81Var = this.f40938b;
        if (n81Var != null && n81Var.getParent() == this) {
            int i15 = this.f40941n;
            n81Var.layout(i15, 0, n81Var.getMeasuredWidth() + i15, n81Var.getMeasuredHeight());
        }
    }

    @Override
    public final void onMeasure(int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.r1.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        z2 z2Var = this.f40939c;
        int i10 = this.e;
        int i11 = this.f40940f;
        h4 h4Var = this.f40946y;
        if (!h4.j(h4Var, this.f40945x, motionEvent, this, z2Var, i10, i11)) {
            if (!h4.j(h4Var, this.f40945x, motionEvent, this, this.d, this.e, this.f40940f + this.h) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
