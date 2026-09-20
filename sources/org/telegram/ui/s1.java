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
public final class s1 extends FrameLayout implements org.telegram.ui.Cells.q9 {
    public final r1 f37265a;
    public final org.telegram.ui.Components.p91 f37266b;
    public a3 f37267c;
    public a3 d;
    public int e;
    public int f37268f;
    public int h;
    public int f37269n;
    public int f37270r;
    public boolean f37271s;
    public TL_iv.pageBlockEmbed v;
    public final f4 f37272w;
    public final h4 f37273x;

    public s1(h4 h4Var, Context context, f4 f4Var) {
        super(context);
        this.f37273x = h4Var;
        this.f37272w = f4Var;
        setWillNotDraw(false);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            org.telegram.ui.Components.p91 p91Var = new org.telegram.ui.Components.p91(context, false, new n1(this));
            this.f37266b = p91Var;
            addView(p91Var);
            h4Var.N.add(this);
            r1 r1Var = new r1(this, context);
            this.f37265a = r1Var;
            r1Var.getSettings().setJavaScriptEnabled(true);
            r1Var.getSettings().setDomStorageEnabled(true);
            r1Var.getSettings().setAllowContentAccess(true);
            r1Var.getSettings().setMediaPlaybackRequiresUserGesture(false);
            r1Var.addJavascriptInterface(new ArticleViewer$BlockEmbedCell$TelegramWebviewProxy(this), "TelegramWebviewProxy");
            r1Var.getSettings().setMixedContentMode(0);
            CookieManager.getInstance().setAcceptThirdPartyCookies(r1Var, true);
            r1Var.setWebChromeClient(new o1(this, 0));
            r1Var.setWebViewClient(new p1(this));
            addView(r1Var);
            return;
        }
        this.f37266b = null;
        this.f37265a = null;
    }

    public final void a(boolean z10) {
        r1 r1Var = this.f37265a;
        if (r1Var != null) {
            try {
                r1Var.stopLoading();
                r1Var.loadUrl("about:blank");
                if (z10) {
                    r1Var.destroy();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        this.v = null;
        org.telegram.ui.Components.p91 p91Var = this.f37266b;
        if (p91Var != null) {
            p91Var.b();
        }
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.f37267c;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            arrayList.add(a3Var2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.f37267c;
        if (a3Var != null) {
            a3Var.attach(this);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            a3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.f37273x.V) {
            this.v = null;
        }
        a3 a3Var = this.f37267c;
        if (a3Var != null) {
            a3Var.detach(this);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            a3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.v != null) {
            a3 a3Var = this.f37267c;
            h4 h4Var = this.f37273x;
            int i10 = 0;
            if (a3Var != null) {
                canvas.save();
                canvas.translate(this.e, this.f37268f);
                h4.v(h4Var, canvas, this, 0);
                this.f37267c.draw(canvas, this);
                canvas.restore();
                i10 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.e, this.f37268f + this.h);
                h4.v(h4Var, canvas, this, i10);
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
        if (this.f37267c != null) {
            sb2.append(", ");
            sb2.append(this.f37267c.d.getText());
        }
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        r1 r1Var = this.f37265a;
        if (r1Var != null) {
            int i14 = this.f37269n;
            r1Var.layout(i14, 0, r1Var.getMeasuredWidth() + i14, r1Var.getMeasuredHeight());
        }
        org.telegram.ui.Components.p91 p91Var = this.f37266b;
        if (p91Var != null && p91Var.getParent() == this) {
            int i15 = this.f37269n;
            p91Var.layout(i15, 0, p91Var.getMeasuredWidth() + i15, p91Var.getMeasuredHeight());
        }
    }

    @Override
    public final void onMeasure(int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s1.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a3 a3Var = this.f37267c;
        int i10 = this.e;
        int i11 = this.f37268f;
        h4 h4Var = this.f37273x;
        if (!h4.l(h4Var, this.f37272w, motionEvent, this, a3Var, i10, i11)) {
            if (!h4.l(h4Var, this.f37272w, motionEvent, this, this.d, this.e, this.f37268f + this.h) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
