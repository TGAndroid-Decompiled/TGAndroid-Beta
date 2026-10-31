package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.RadialProgress2;
public final class v2 extends FrameLayout implements org.telegram.messenger.z5, org.telegram.ui.Cells.j9 {
    public static final int V = 0;
    public int D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public int I;
    public int J;
    public final int K;
    public TL_iv.pageBlockVideo L;
    public w2 M;
    public TL_iv.PageBlock N;
    public TLRPC.Document O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public org.telegram.messenger.bj T;
    public boolean U;
    public final m60 f42572a;
    public final f4 f42573b;
    public z2 f42574c;
    public z2 d;
    public final ImageReceiver e;
    public final FrameLayout f42575f;
    public final k4 h;
    public final TextureView f42576n;
    public final RadialProgress2 f42577r;
    public final c1 f42578s;
    public final int f42579w;
    public boolean f42580x;
    public int f42581y;

    public v2(Context context, m60 m60Var, f4 f4Var, int i10) {
        super(context);
        this.f42572a = m60Var;
        this.f42573b = f4Var;
        setWillNotDraw(false);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.e = imageReceiver;
        imageReceiver.F0 = true;
        imageReceiver.G0 = true;
        this.f42579w = i10;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.f42577r = radialProgress2;
        radialProgress2.d = -1;
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        this.K = org.telegram.messenger.b6.q(((h4) m60Var).X).k();
        c1 c1Var = new c1(context, m60Var, f4Var, 1);
        this.f42578s = c1Var;
        k4 k4Var = new k4(context);
        this.h = k4Var;
        k4Var.setResizeMode(0);
        TextureView textureView = new TextureView(context);
        this.f42576n = textureView;
        textureView.setOpaque(false);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f42575f = frameLayout;
        k4Var.addView(textureView, w7.b6.e(-1, -2, 1));
        frameLayout.addView(k4Var, w7.b6.e(-1, -1, 17));
        addView(frameLayout, w7.b6.c(-2.0f, -1));
        addView(c1Var, w7.b6.c(-2.0f, -1));
    }

    private int getIconForCurrentState() {
        int i10 = this.I;
        if (i10 == 0) {
            return 2;
        }
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 2) {
            return 8;
        }
        if (i10 == 3) {
            return 0;
        }
        return 4;
    }

    @Override
    public final void C(boolean z10) {
        e(false);
    }

    @Override
    public final void M(String str) {
        this.f42577r.p(true, 1.0f);
        if (this.P) {
            this.I = 2;
            a();
            return;
        }
        e(true);
    }

    public final void a() {
        int i10 = ((h4) this.f42572a).X;
        int i11 = this.I;
        ImageReceiver imageReceiver = this.e;
        RadialProgress2 radialProgress2 = this.f42577r;
        if (i11 == 0) {
            this.S = false;
            radialProgress2.p(false, 0.0f);
            boolean z10 = this.P;
            f4 f4Var = this.f42573b;
            if (z10) {
                imageReceiver.r0(org.telegram.messenger.ic.b(this.O), null, org.telegram.messenger.ic.c(org.telegram.messenger.b8.w(this.O.thumbs, 40, false, null, false), this.O), "80_80_b", null, this.O.size, null, f4Var.E, 1);
            } else {
                org.telegram.messenger.b8.G(i10).X(this.O, f4Var.E, 1, 1);
            }
            this.I = 1;
            radialProgress2.setIcon(getIconForCurrentState(), true, true);
            invalidate();
        } else if (i11 == 1) {
            this.S = true;
            if (this.P) {
                imageReceiver.c();
            } else {
                org.telegram.messenger.b8.G(i10).f(this.O);
            }
            this.I = 0;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        } else if (i11 == 2) {
            imageReceiver.f14408t0 = true;
            imageReceiver.P0(false);
            this.I = -1;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
        }
    }

    public final void b(TL_iv.pageBlockVideo pageblockvideo, w2 w2Var, boolean z10, boolean z11) {
        boolean z12;
        m60 m60Var;
        VideoPlayerHolderBase videoPlayerHolderBase;
        TL_iv.pageBlockVideo pageblockvideo2 = this.L;
        if (pageblockvideo2 != null && (videoPlayerHolderBase = (m60Var = this.f42572a).f39488x) != null && m60Var.f39489y == this) {
            a0.h hVar = m60Var.D;
            long j10 = pageblockvideo2.video_id;
            w2 a2 = w2.a(videoPlayerHolderBase, this);
            this.M = a2;
            hVar.k(a2, j10);
        }
        this.L = pageblockvideo;
        this.M = w2Var;
        this.N = null;
        this.Q = z10;
        f4 f4Var = this.f42573b;
        if (f4Var != null) {
            this.O = e4.a(f4Var.E, pageblockvideo.video_id);
        } else {
            this.O = null;
        }
        if (!org.telegram.messenger.jj.K4(this.O) && !org.telegram.messenger.jj.s3(this.O, false)) {
            z12 = false;
        } else {
            z12 = true;
        }
        this.P = z12;
        this.f42580x = z11;
        this.f42578s.setVisibility(4);
        e(false);
        requestLayout();
    }

    public final void c(w2 w2Var) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        w2 w2Var2 = this.M;
        if (w2Var2 != null && (bitmap2 = w2Var.f42862b) != null && (bitmap3 = w2Var2.f42862b) != null && bitmap2 != bitmap3) {
            bitmap3.recycle();
            this.M.f42862b = null;
        }
        w2 w2Var3 = this.M;
        if (w2Var3 != null && w2Var.f42862b == null && (bitmap = w2Var3.f42862b) != null) {
            w2Var.f42861a = w2Var3.f42861a;
            w2Var.f42862b = bitmap;
        }
        this.M = w2Var;
    }

    public final void d() {
        VideoPlayerHolderBase videoPlayerHolderBase;
        int visibility = getVisibility();
        ImageReceiver imageReceiver = this.e;
        if (visibility == 0 && isAttachedToWindow()) {
            if (!this.U) {
                this.U = true;
                imageReceiver.P();
                e(false);
            }
        } else if (!this.U) {
        } else {
            this.U = false;
            TL_iv.pageBlockVideo pageblockvideo = this.L;
            m60 m60Var = this.f42572a;
            if (pageblockvideo != null && (videoPlayerHolderBase = m60Var.f39488x) != null && m60Var.f39489y == this) {
                a0.h hVar = m60Var.D;
                long j10 = pageblockvideo.video_id;
                w2 a2 = w2.a(videoPlayerHolderBase, this);
                c(a2);
                hVar.k(a2, j10);
            }
            imageReceiver.R();
            org.telegram.messenger.b6.q(((h4) m60Var).X).v(this);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public final void e(boolean z10) {
        boolean z11;
        int i10 = ((h4) this.f42572a).X;
        String r10 = org.telegram.messenger.b8.r(null, this.O);
        org.telegram.messenger.b8.G(i10);
        File I = org.telegram.messenger.b8.I(this.O);
        org.telegram.messenger.b8.G(i10);
        boolean z12 = true;
        File K = org.telegram.messenger.b8.K(this.O, null, true, true);
        if (!I.exists() && !K.exists()) {
            z11 = false;
        } else {
            z11 = true;
        }
        boolean isEmpty = TextUtils.isEmpty(r10);
        RadialProgress2 radialProgress2 = this.f42577r;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z11) {
            org.telegram.messenger.b6.q(i10).v(this);
            if (!this.P) {
                this.I = 3;
            } else {
                this.I = -1;
            }
            radialProgress2.setIcon(getIconForCurrentState(), false, z10);
        } else {
            org.telegram.messenger.b6.q(i10).a(r10, null, this);
            w2 w2Var = this.M;
            float f7 = 0.0f;
            if (w2Var != null && w2Var.f42862b != null) {
                this.I = -1;
            } else {
                if (!org.telegram.messenger.b8.G(i10).T(r10)) {
                    if (!this.S && this.R && this.P) {
                        this.I = 1;
                    } else {
                        this.I = 0;
                    }
                } else {
                    this.I = 1;
                    Float w9 = org.telegram.messenger.hc.D().w(r10);
                    if (w9 != null) {
                        f7 = w9.floatValue();
                    }
                }
                radialProgress2.setIcon(getIconForCurrentState(), z12, z10);
                radialProgress2.p(false, f7);
            }
            z12 = false;
            radialProgress2.setIcon(getIconForCurrentState(), z12, z10);
            radialProgress2.p(false, f7);
        }
        invalidate();
    }

    public View getChannelCell() {
        return this.f42578s;
    }

    public TL_iv.pageBlockVideo getCurrentBlock() {
        return this.L;
    }

    public ImageReceiver getImageView() {
        return this.e;
    }

    @Override
    public int getObserverTag() {
        return this.K;
    }

    public TextureView getTextureView() {
        return this.f42576n;
    }

    @Override
    public final void h(ArrayList arrayList) {
        z2 z2Var = this.f42574c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            arrayList.add(z2Var2);
        }
    }

    @Override
    public final void i(long j10, long j11) {
        this.f42577r.p(true, Math.min(1.0f, ((float) j10) / ((float) j11)));
        if (this.I != 1) {
            e(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
        z2 z2Var = this.f42574c;
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
        d();
        z2 z2Var = this.f42574c;
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
        if (this.L != null) {
            ImageReceiver imageReceiver = this.e;
            if (!imageReceiver.I() || imageReceiver.f14384h1 != 1.0f) {
                canvas.drawRect(imageReceiver.P0, h4.f37714p1);
            }
            imageReceiver.h(canvas, null);
            z2 z2Var = this.f42574c;
            m60 m60Var = this.f42572a;
            int i10 = 0;
            if (z2Var != null) {
                canvas.save();
                canvas.translate(this.f42581y, this.D);
                h4.t(m60Var, canvas, this, 0);
                this.f42574c.d(canvas, this);
                canvas.restore();
                i10 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.f42581y, this.D + this.E);
                h4.t(m60Var, canvas, this, i10);
                this.d.d(canvas, this);
                canvas.restore();
            }
            h4.s(canvas, m60Var, this.L, getMeasuredHeight());
            super.onDraw(canvas);
            if (imageReceiver.Q0) {
                this.f42577r.draw(canvas);
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.cd.L0(2131753933, null));
        if (this.f42574c != null) {
            sb2.append(", ");
            sb2.append(this.f42574c.d.getText());
        }
        accessibilityNodeInfo.setText(sb2.toString());
    }

    @Override
    public final void onMeasure(int r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.v2.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.v2.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        d();
    }

    @Override
    public final void n(long j10, long j11) {
    }
}
