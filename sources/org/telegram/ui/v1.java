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
    public final u1 f43354a;
    public final org.telegram.ui.Components.g81 f43355b;
    public e3 f43356c;
    public e3 d;
    public int f43357e;
    public int f43358f;
    public int h;
    public int f43359n;
    public int f43360r;
    public boolean f43361s;
    public TL_iv.pageBlockEmbed v;
    public final j4 f43362w;
    public final l4 f43363x;

    public v1(l4 l4Var, Context context, j4 j4Var) {
        super(context);
        this.f43363x = l4Var;
        this.f43362w = j4Var;
        setWillNotDraw(false);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            org.telegram.ui.Components.g81 g81Var = new org.telegram.ui.Components.g81(context, false, new q1(this));
            this.f43355b = g81Var;
            addView(g81Var);
            l4Var.J.add(this);
            u1 u1Var = new u1(this, context);
            this.f43354a = u1Var;
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
        this.f43355b = null;
        this.f43354a = null;
    }

    public final void a(boolean z10) {
        u1 u1Var = this.f43354a;
        if (u1Var != null) {
            try {
                u1Var.stopLoading();
                u1Var.loadUrl("about:blank");
                if (z10) {
                    u1Var.destroy();
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        this.v = null;
        org.telegram.ui.Components.g81 g81Var = this.f43355b;
        if (g81Var != null) {
            g81Var.b();
        }
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        e3 e3Var = this.f43356c;
        if (e3Var != null) {
            arrayList.add(e3Var);
        }
        e3 e3Var2 = this.d;
        if (e3Var2 != null) {
            arrayList.add(e3Var2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e3 e3Var = this.f43356c;
        if (e3Var != null) {
            e3Var.attach(this);
        }
        e3 e3Var2 = this.d;
        if (e3Var2 != null) {
            e3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.f43363x.R) {
            this.v = null;
        }
        e3 e3Var = this.f43356c;
        if (e3Var != null) {
            e3Var.detach(this);
        }
        e3 e3Var2 = this.d;
        if (e3Var2 != null) {
            e3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.v != null) {
            e3 e3Var = this.f43356c;
            l4 l4Var = this.f43363x;
            int i9 = 0;
            if (e3Var != null) {
                canvas.save();
                canvas.translate(this.f43357e, this.f43358f);
                l4.v(l4Var, canvas, this, 0);
                this.f43356c.draw(canvas, this);
                canvas.restore();
                i9 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.f43357e, this.f43358f + this.h);
                l4.v(l4Var, canvas, this, i9);
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
        if (this.f43356c != null) {
            sb2.append(", ");
            sb2.append(this.f43356c.d.getText());
        }
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        u1 u1Var = this.f43354a;
        if (u1Var != null) {
            int i13 = this.f43359n;
            u1Var.layout(i13, 0, u1Var.getMeasuredWidth() + i13, u1Var.getMeasuredHeight());
        }
        org.telegram.ui.Components.g81 g81Var = this.f43355b;
        if (g81Var != null && g81Var.getParent() == this) {
            int i14 = this.f43359n;
            g81Var.layout(i14, 0, g81Var.getMeasuredWidth() + i14, g81Var.getMeasuredHeight());
        }
    }

    @Override
    public final void onMeasure(int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.v1.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        e3 e3Var = this.f43356c;
        int i9 = this.f43357e;
        int i10 = this.f43358f;
        l4 l4Var = this.f43363x;
        if (!l4.l(l4Var, this.f43362w, motionEvent, this, e3Var, i9, i10)) {
            if (!l4.l(l4Var, this.f43362w, motionEvent, this, this.d, this.f43357e, this.f43358f + this.h) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
