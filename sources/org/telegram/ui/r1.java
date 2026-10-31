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
    public final q1 f41105a;
    public final org.telegram.ui.Components.m81 f41106b;
    public z2 f41107c;
    public z2 d;
    public int e;
    public int f41108f;
    public int h;
    public int f41109n;
    public int f41110r;
    public boolean f41111s;
    public TL_iv.pageBlockEmbed f41112w;
    public final f4 f41113x;
    public final h4 f41114y;

    public r1(h4 h4Var, Context context, f4 f4Var) {
        super(context);
        this.f41114y = h4Var;
        this.f41113x = f4Var;
        setWillNotDraw(false);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            org.telegram.ui.Components.m81 m81Var = new org.telegram.ui.Components.m81(context, false, new n1(this));
            this.f41106b = m81Var;
            addView(m81Var);
            h4Var.N.add(this);
            q1 q1Var = new q1(this, context);
            this.f41105a = q1Var;
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
        this.f41106b = null;
        this.f41105a = null;
    }

    public final void a(boolean z10) {
        q1 q1Var = this.f41105a;
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
        this.f41112w = null;
        org.telegram.ui.Components.m81 m81Var = this.f41106b;
        if (m81Var != null) {
            m81Var.b();
        }
    }

    @Override
    public final void h(ArrayList arrayList) {
        z2 z2Var = this.f41107c;
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
        z2 z2Var = this.f41107c;
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
        if (!this.f41114y.V) {
            this.f41112w = null;
        }
        z2 z2Var = this.f41107c;
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
        if (this.f41112w != null) {
            z2 z2Var = this.f41107c;
            h4 h4Var = this.f41114y;
            int i10 = 0;
            if (z2Var != null) {
                canvas.save();
                canvas.translate(this.e, this.f41108f);
                h4.t(h4Var, canvas, this, 0);
                this.f41107c.d(canvas, this);
                canvas.restore();
                i10 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.e, this.f41108f + this.h);
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
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.cd.L0(2131754868, null));
        if (this.f41107c != null) {
            sb2.append(", ");
            sb2.append(this.f41107c.d.getText());
        }
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        q1 q1Var = this.f41105a;
        if (q1Var != null) {
            int i14 = this.f41109n;
            q1Var.layout(i14, 0, q1Var.getMeasuredWidth() + i14, q1Var.getMeasuredHeight());
        }
        org.telegram.ui.Components.m81 m81Var = this.f41106b;
        if (m81Var != null && m81Var.getParent() == this) {
            int i15 = this.f41109n;
            m81Var.layout(i15, 0, m81Var.getMeasuredWidth() + i15, m81Var.getMeasuredHeight());
        }
    }

    @Override
    public final void onMeasure(int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.r1.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        z2 z2Var = this.f41107c;
        int i10 = this.e;
        int i11 = this.f41108f;
        h4 h4Var = this.f41114y;
        if (!h4.j(h4Var, this.f41113x, motionEvent, this, z2Var, i10, i11)) {
            if (!h4.j(h4Var, this.f41113x, motionEvent, this, this.d, this.e, this.f41108f + this.h) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
