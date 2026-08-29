package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.CookieManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
public final class w1 extends FrameLayout implements org.telegram.ui.Cells.j9 {
    public final v1 f43810a;
    public final org.telegram.ui.Components.s81 f43811b;
    public f3 f43812c;
    public f3 d;
    public int f43813e;
    public int f43814f;
    public int h;
    public int f43815n;
    public int f43816r;
    public boolean f43817s;
    public TL_iv.pageBlockEmbed v;
    public final k4 f43818w;
    public final m4 f43819x;

    public w1(m4 m4Var, Context context, k4 k4Var) {
        super(context);
        this.f43819x = m4Var;
        this.f43818w = k4Var;
        setWillNotDraw(false);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            org.telegram.ui.Components.s81 s81Var = new org.telegram.ui.Components.s81(context, false, new r1(this));
            this.f43811b = s81Var;
            addView(s81Var);
            m4Var.J.add(this);
            v1 v1Var = new v1(this, context);
            this.f43810a = v1Var;
            v1Var.getSettings().setJavaScriptEnabled(true);
            v1Var.getSettings().setDomStorageEnabled(true);
            v1Var.getSettings().setAllowContentAccess(true);
            v1Var.getSettings().setMediaPlaybackRequiresUserGesture(false);
            v1Var.addJavascriptInterface(new ArticleViewer$BlockEmbedCell$TelegramWebviewProxy(this), "TelegramWebviewProxy");
            v1Var.getSettings().setMixedContentMode(0);
            CookieManager.getInstance().setAcceptThirdPartyCookies(v1Var, true);
            v1Var.setWebChromeClient(new s1(this, 0));
            v1Var.setWebViewClient(new t1(this));
            addView(v1Var);
            return;
        }
        this.f43811b = null;
        this.f43810a = null;
    }

    public final void a(boolean z10) {
        v1 v1Var = this.f43810a;
        if (v1Var != null) {
            try {
                v1Var.stopLoading();
                v1Var.loadUrl("about:blank");
                if (z10) {
                    v1Var.destroy();
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        this.v = null;
        org.telegram.ui.Components.s81 s81Var = this.f43811b;
        if (s81Var != null) {
            s81Var.b();
        }
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f43812c;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null) {
            arrayList.add(f3Var2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f3 f3Var = this.f43812c;
        if (f3Var != null) {
            f3Var.attach(this);
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null) {
            f3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.f43819x.R) {
            this.v = null;
        }
        f3 f3Var = this.f43812c;
        if (f3Var != null) {
            f3Var.detach(this);
        }
        f3 f3Var2 = this.d;
        if (f3Var2 != null) {
            f3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.v != null) {
            f3 f3Var = this.f43812c;
            m4 m4Var = this.f43819x;
            int i10 = 0;
            if (f3Var != null) {
                canvas.save();
                canvas.translate(this.f43813e, this.f43814f);
                m4.v(m4Var, canvas, this, 0);
                this.f43812c.draw(canvas, this);
                canvas.restore();
                i10 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.f43813e, this.f43814f + this.h);
                m4.v(m4Var, canvas, this, i10);
                this.d.draw(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(LocaleController.getString(R.string.AccDescrIVEmbed));
        if (this.f43812c != null) {
            sb2.append(", ");
            sb2.append(this.f43812c.d.getText());
        }
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        v1 v1Var = this.f43810a;
        if (v1Var != null) {
            int i14 = this.f43815n;
            v1Var.layout(i14, 0, v1Var.getMeasuredWidth() + i14, v1Var.getMeasuredHeight());
        }
        org.telegram.ui.Components.s81 s81Var = this.f43811b;
        if (s81Var != null && s81Var.getParent() == this) {
            int i15 = this.f43815n;
            s81Var.layout(i15, 0, s81Var.getMeasuredWidth() + i15, s81Var.getMeasuredHeight());
        }
    }

    @Override
    public final void onMeasure(int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.w1.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f3 f3Var = this.f43812c;
        int i10 = this.f43813e;
        int i11 = this.f43814f;
        m4 m4Var = this.f43819x;
        if (!m4.l(m4Var, this.f43818w, motionEvent, this, f3Var, i10, i11)) {
            if (!m4.l(m4Var, this.f43818w, motionEvent, this, this.d, this.f43813e, this.f43814f + this.h) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
