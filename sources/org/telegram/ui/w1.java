package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Looper;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.CookieManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;

public final class w1 extends FrameLayout implements org.telegram.ui.Cells.i9 {

    public final v1 f43561a;

    public final org.telegram.ui.Components.i81 f43562b;

    public f3 f43563c;
    public f3 d;

    public int f43564e;

    public int f43565f;
    public int h;

    public int f43566n;

    public int f43567r;

    public boolean f43568s;
    public TL_iv.pageBlockEmbed v;

    public final k4 f43569w;

    public final m4 f43570x;

    public w1(m4 m4Var, Context context, k4 k4Var) {
        super(context);
        this.f43570x = m4Var;
        this.f43569w = k4Var;
        setWillNotDraw(false);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.f43562b = null;
            this.f43561a = null;
            return;
        }
        org.telegram.ui.Components.i81 i81Var = new org.telegram.ui.Components.i81(context, false, new r1(this));
        this.f43562b = i81Var;
        addView(i81Var);
        m4Var.J.add(this);
        v1 v1Var = new v1(this, context);
        this.f43561a = v1Var;
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
    }

    public final void a(boolean z10) {
        v1 v1Var = this.f43561a;
        if (v1Var != null) {
            try {
                v1Var.stopLoading();
                v1Var.loadUrl("about:blank");
                if (z10) {
                    v1Var.destroy();
                }
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
        this.v = null;
        org.telegram.ui.Components.i81 i81Var = this.f43562b;
        if (i81Var != null) {
            i81Var.b();
        }
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f43563c;
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
        f3 f3Var = this.f43563c;
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
        if (!this.f43570x.R) {
            this.v = null;
        }
        f3 f3Var = this.f43563c;
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
        if (this.v == null) {
            return;
        }
        f3 f3Var = this.f43563c;
        m4 m4Var = this.f43570x;
        int i10 = 0;
        if (f3Var != null) {
            canvas.save();
            canvas.translate(this.f43564e, this.f43565f);
            m4.v(m4Var, canvas, this, 0);
            this.f43563c.draw(canvas, this);
            canvas.restore();
            i10 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f43564e, this.f43565f + this.h);
            m4.v(m4Var, canvas, this, i10);
            this.d.draw(canvas, this);
            canvas.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(LocaleController.getString(R.string.AccDescrIVEmbed));
        if (this.f43563c != null) {
            sb2.append(", ");
            sb2.append(this.f43563c.d.getText());
        }
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        v1 v1Var = this.f43561a;
        if (v1Var != null) {
            int i14 = this.f43566n;
            v1Var.layout(i14, 0, v1Var.getMeasuredWidth() + i14, v1Var.getMeasuredHeight());
        }
        org.telegram.ui.Components.i81 i81Var = this.f43562b;
        if (i81Var == null || i81Var.getParent() != this) {
            return;
        }
        int i15 = this.f43566n;
        i81Var.layout(i15, 0, i81Var.getMeasuredWidth() + i15, i81Var.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int iDp;
        int iDp2;
        int i12;
        int iDp3;
        int iDp4;
        f3 f3Var;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockEmbed pageblockembed = this.v;
        if (pageblockembed != null) {
            int i13 = pageblockembed.level;
            if (i13 > 0) {
                int iDp5 = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(i13 * 14);
                this.f43566n = iDp5;
                this.f43564e = iDp5;
                iDp2 = org.telegram.messenger.rl.u(18.0f, iDp5, size);
                i12 = iDp2;
            } else {
                this.f43566n = 0;
                this.f43564e = AndroidUtilities.dp(18.0f);
                int iDp6 = size - AndroidUtilities.dp(36.0f);
                if (this.v.full_width) {
                    iDp2 = size;
                } else {
                    iDp2 = size - AndroidUtilities.dp(36.0f);
                    this.f43566n = AndroidUtilities.dp(18.0f) + this.f43566n;
                }
                i12 = iDp6;
            }
            TL_iv.pageBlockEmbed pageblockembed2 = this.v;
            int i14 = pageblockembed2.f22602w;
            float f10 = i14 == 0 ? 1.0f : size / i14;
            int i15 = this.f43567r;
            if (i15 != 0) {
                iDp3 = AndroidUtilities.dp(i15);
            } else {
                float fDp = pageblockembed2.h;
                if (i14 == 0) {
                    fDp = AndroidUtilities.dp(fDp);
                }
                iDp3 = (int) (fDp * f10);
            }
            if (iDp3 == 0) {
                iDp3 = AndroidUtilities.dp(10.0f);
            }
            int height = iDp3;
            v1 v1Var = this.f43561a;
            if (v1Var != null) {
                v1Var.measure(View.MeasureSpec.makeMeasureSpec(iDp2, 1073741824), View.MeasureSpec.makeMeasureSpec(height, 1073741824));
            }
            org.telegram.ui.Components.i81 i81Var = this.f43562b;
            if (i81Var != null && i81Var.getParent() == this) {
                i81Var.measure(View.MeasureSpec.makeMeasureSpec(iDp2, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10.0f) + height, 1073741824));
            }
            int iDp7 = AndroidUtilities.dp(8.0f) + height;
            this.f43565f = iDp7;
            TL_iv.pageBlockEmbed pageblockembed3 = this.v;
            TL_iv.RichText richText = pageblockembed3.caption.text;
            HashSet hashSet = m4.X0;
            Layout.Alignment alignmentA = Layout.Alignment.ALIGN_NORMAL;
            m4 m4Var = this.f43570x;
            f3 f3VarP = m4.p(m4Var, this, null, richText, i12, iDp7, pageblockembed3, alignmentA, 0, this.f43569w);
            this.f43563c = f3VarP;
            if (f3VarP != null) {
                int height2 = this.f43563c.d.getHeight() + AndroidUtilities.dp(4.0f);
                this.h = height2;
                height = org.telegram.messenger.y1.C(4.0f, height2, height);
            } else {
                this.h = 0;
            }
            TL_iv.pageBlockEmbed pageblockembed4 = this.v;
            TL_iv.RichText richText2 = pageblockembed4.caption.credit;
            if (this.f43569w.C) {
                alignmentA = org.telegram.ui.Components.tv0.a();
            }
            f3 f3VarP2 = m4.p(m4Var, this, null, richText2, i12, 0, pageblockembed4, alignmentA, 0, this.f43569w);
            this.d = f3VarP2;
            if (f3VarP2 != null) {
                height += this.d.d.getHeight() + AndroidUtilities.dp(4.0f);
                f3 f3Var2 = this.d;
                f3Var2.f37923s = this.f43564e;
                f3Var2.v = this.h;
            }
            iDp = AndroidUtilities.dp(5.0f) + height;
            TL_iv.pageBlockEmbed pageblockembed5 = this.v;
            int i16 = pageblockembed5.level;
            if (i16 > 0 && !pageblockembed5.bottom) {
                iDp4 = AndroidUtilities.dp(8.0f);
            } else if (i16 != 0 || this.f43563c == null) {
                f3Var = this.f43563c;
                if (f3Var != null) {
                    f3Var.f37923s = this.f43564e;
                    f3Var.v = this.f43565f;
                }
            } else {
                iDp4 = AndroidUtilities.dp(8.0f);
            }
            iDp += iDp4;
            f3Var = this.f43563c;
            if (f3Var != null) {
                f3Var.f37923s = this.f43564e;
                f3Var.v = this.f43565f;
            }
        } else {
            iDp = 1;
        }
        setMeasuredDimension(size, iDp);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f3 f3Var = this.f43563c;
        int i10 = this.f43564e;
        int i11 = this.f43565f;
        m4 m4Var = this.f43570x;
        if (m4.l(m4Var, this.f43569w, motionEvent, this, f3Var, i10, i11)) {
            return true;
        }
        return m4.l(m4Var, this.f43569w, motionEvent, this, this.d, this.f43564e, this.f43565f + this.h) || super.onTouchEvent(motionEvent);
    }
}
