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
public final class v1 extends FrameLayout implements org.telegram.ui.Cells.m9 {
    public final u1 f42092a;
    public final org.telegram.ui.Components.u91 f42093b;
    public d3 f42094c;
    public d3 d;
    public int e;
    public int f42095f;
    public int h;
    public int f42096n;
    public int f42097r;
    public boolean f42098s;
    public TL_iv.pageBlockEmbed v;
    public final j4 f42099w;
    public final l4 f42100x;

    public v1(l4 l4Var, Context context, j4 j4Var) {
        super(context);
        this.f42100x = l4Var;
        this.f42099w = j4Var;
        setWillNotDraw(false);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            org.telegram.ui.Components.u91 u91Var = new org.telegram.ui.Components.u91(context, false, new q1(this));
            this.f42093b = u91Var;
            addView(u91Var);
            l4Var.N.add(this);
            u1 u1Var = new u1(this, context);
            this.f42092a = u1Var;
            u1Var.getSettings().setJavaScriptEnabled(true);
            u1Var.getSettings().setDomStorageEnabled(true);
            u1Var.getSettings().setAllowContentAccess(true);
            u1Var.getSettings().setMediaPlaybackRequiresUserGesture(false);
            u1Var.addJavascriptInterface(new ArticleViewer$BlockEmbedCell$TelegramWebviewProxy(this), "TelegramWebviewProxy");
            u1Var.getSettings().setMixedContentMode(0);
            CookieManager.getInstance().setAcceptThirdPartyCookies(u1Var, true);
            u1Var.setWebChromeClient(new r1(this, 0));
            u1Var.setWebViewClient(new s1(this));
            addView(u1Var);
            return;
        }
        this.f42093b = null;
        this.f42092a = null;
    }

    public final void a(boolean z10) {
        u1 u1Var = this.f42092a;
        if (u1Var != null) {
            try {
                u1Var.stopLoading();
                u1Var.loadUrl("about:blank");
                if (z10) {
                    u1Var.destroy();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        this.v = null;
        org.telegram.ui.Components.u91 u91Var = this.f42093b;
        if (u91Var != null) {
            u91Var.b();
        }
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.f42094c;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            arrayList.add(d3Var2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d3 d3Var = this.f42094c;
        if (d3Var != null) {
            d3Var.attach(this);
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            d3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.f42100x.V) {
            this.v = null;
        }
        d3 d3Var = this.f42094c;
        if (d3Var != null) {
            d3Var.detach(this);
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            d3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.v != null) {
            d3 d3Var = this.f42094c;
            l4 l4Var = this.f42100x;
            int i10 = 0;
            if (d3Var != null) {
                canvas.save();
                canvas.translate(this.e, this.f42095f);
                l4.v(l4Var, canvas, this, 0);
                this.f42094c.draw(canvas, this);
                canvas.restore();
                i10 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.e, this.f42095f + this.h);
                l4.v(l4Var, canvas, this, i10);
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
        if (this.f42094c != null) {
            sb2.append(", ");
            sb2.append(this.f42094c.d.getText());
        }
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        u1 u1Var = this.f42092a;
        if (u1Var != null) {
            int i14 = this.f42096n;
            u1Var.layout(i14, 0, u1Var.getMeasuredWidth() + i14, u1Var.getMeasuredHeight());
        }
        org.telegram.ui.Components.u91 u91Var = this.f42093b;
        if (u91Var != null && u91Var.getParent() == this) {
            int i15 = this.f42096n;
            u91Var.layout(i15, 0, u91Var.getMeasuredWidth() + i15, u91Var.getMeasuredHeight());
        }
    }

    @Override
    public final void onMeasure(int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.v1.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d3 d3Var = this.f42094c;
        int i10 = this.e;
        int i11 = this.f42095f;
        l4 l4Var = this.f42100x;
        if (!l4.l(l4Var, this.f42099w, motionEvent, this, d3Var, i10, i11)) {
            if (!l4.l(l4Var, this.f42099w, motionEvent, this, this.d, this.e, this.f42095f + this.h) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
