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
public final class v1 extends FrameLayout implements org.telegram.ui.Cells.n9 {
    public final u1 f40534a;
    public final org.telegram.ui.Components.da1 f40535b;
    public d3 f40536c;
    public d3 d;
    public int e;
    public int f40537f;
    public int h;
    public int f40538n;
    public int f40539r;
    public boolean f40540s;
    public TL_iv.pageBlockEmbed v;
    public final i4 f40541w;
    public final k4 f40542x;

    public v1(k4 k4Var, Context context, i4 i4Var) {
        super(context);
        this.f40542x = k4Var;
        this.f40541w = i4Var;
        setWillNotDraw(false);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            org.telegram.ui.Components.da1 da1Var = new org.telegram.ui.Components.da1(context, false, new q1(this));
            this.f40535b = da1Var;
            addView(da1Var);
            k4Var.N.add(this);
            u1 u1Var = new u1(this, context);
            this.f40534a = u1Var;
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
        this.f40535b = null;
        this.f40534a = null;
    }

    public final void a(boolean z10) {
        u1 u1Var = this.f40534a;
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
        org.telegram.ui.Components.da1 da1Var = this.f40535b;
        if (da1Var != null) {
            da1Var.b();
        }
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.f40536c;
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
        d3 d3Var = this.f40536c;
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
        if (!this.f40542x.V) {
            this.v = null;
        }
        d3 d3Var = this.f40536c;
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
            d3 d3Var = this.f40536c;
            k4 k4Var = this.f40542x;
            int i10 = 0;
            if (d3Var != null) {
                canvas.save();
                canvas.translate(this.e, this.f40537f);
                k4.v(k4Var, canvas, this, 0);
                this.f40536c.draw(canvas, this);
                canvas.restore();
                i10 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.e, this.f40537f + this.h);
                k4.v(k4Var, canvas, this, i10);
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
        if (this.f40536c != null) {
            sb2.append(", ");
            sb2.append(this.f40536c.d.getText());
        }
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        u1 u1Var = this.f40534a;
        if (u1Var != null) {
            int i14 = this.f40538n;
            u1Var.layout(i14, 0, u1Var.getMeasuredWidth() + i14, u1Var.getMeasuredHeight());
        }
        org.telegram.ui.Components.da1 da1Var = this.f40535b;
        if (da1Var != null && da1Var.getParent() == this) {
            int i15 = this.f40538n;
            da1Var.layout(i15, 0, da1Var.getMeasuredWidth() + i15, da1Var.getMeasuredHeight());
        }
    }

    @Override
    public final void onMeasure(int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.v1.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d3 d3Var = this.f40536c;
        int i10 = this.e;
        int i11 = this.f40537f;
        k4 k4Var = this.f40542x;
        if (!k4.l(k4Var, this.f40541w, motionEvent, this, d3Var, i10, i11)) {
            if (!k4.l(k4Var, this.f40541w, motionEvent, this, this.d, this.e, this.f40537f + this.h) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
