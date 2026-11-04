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
public final class w2 extends FrameLayout implements org.telegram.messenger.x5, org.telegram.ui.Cells.g9 {
    public static final int W = 0;
    public int E;
    public int F;
    public int G;
    public int H;
    public boolean I;
    public int J;
    public int K;
    public final int L;
    public TL_iv.pageBlockVideo M;
    public x2 N;
    public TL_iv.PageBlock O;
    public TLRPC.Document P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public org.telegram.messenger.ri U;
    public boolean V;
    public final i50 f50668a;
    public final g4 f50669b;
    public a3 f50670c;
    public a3 d;
    public final ImageReceiver f50671e;
    public final FrameLayout f50672f;
    public final l4 h;
    public final TextureView f50673n;
    public final RadialProgress2 f50674r;
    public final b1 f50675s;
    public final int f50676w;
    public boolean f50677x;
    public int f50678y;

    public w2(Context context, i50 i50Var, g4 g4Var, int i3) {
        super(context);
        this.f50668a = i50Var;
        this.f50669b = g4Var;
        setWillNotDraw(false);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f50671e = imageReceiver;
        imageReceiver.G0 = true;
        imageReceiver.H0 = true;
        this.f50676w = i3;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.f50674r = radialProgress2;
        radialProgress2.d = -1;
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        this.L = org.telegram.messenger.z5.q(((i4) i50Var).Y).k();
        b1 b1Var = new b1(context, i50Var, g4Var, 1);
        this.f50675s = b1Var;
        l4 l4Var = new l4(context);
        this.h = l4Var;
        l4Var.setResizeMode(0);
        TextureView textureView = new TextureView(context);
        this.f50673n = textureView;
        textureView.setOpaque(false);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f50672f = frameLayout;
        l4Var.addView(textureView, b8.mf.e(-1, -2, 1));
        frameLayout.addView(l4Var, b8.mf.e(-1, -1, 17));
        addView(frameLayout, b8.mf.c(-2.0f, -1));
        addView(b1Var, b8.mf.c(-2.0f, -1));
    }

    private int getIconForCurrentState() {
        int i3 = this.J;
        if (i3 == 0) {
            return 2;
        }
        if (i3 == 1) {
            return 3;
        }
        if (i3 == 2) {
            return 8;
        }
        if (i3 == 3) {
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
        this.f50674r.p(true, 1.0f);
        if (this.Q) {
            this.J = 2;
            a();
            return;
        }
        e(true);
    }

    public final void a() {
        int i3 = ((i4) this.f50668a).Y;
        int i10 = this.J;
        ImageReceiver imageReceiver = this.f50671e;
        RadialProgress2 radialProgress2 = this.f50674r;
        if (i10 == 0) {
            this.T = false;
            radialProgress2.p(false, 0.0f);
            boolean z10 = this.Q;
            g4 g4Var = this.f50669b;
            if (z10) {
                imageReceiver.r0(org.telegram.messenger.ac.b(this.P), null, org.telegram.messenger.ac.c(org.telegram.messenger.w7.w(this.P.thumbs, 40, false, null, false), this.P), "80_80_b", null, this.P.size, null, g4Var.F, 1);
            } else {
                org.telegram.messenger.w7.G(i3).X(this.P, g4Var.F, 1, 1);
            }
            this.J = 1;
            radialProgress2.setIcon(getIconForCurrentState(), true, true);
            invalidate();
        } else if (i10 == 1) {
            this.T = true;
            if (this.Q) {
                imageReceiver.c();
            } else {
                org.telegram.messenger.w7.G(i3).f(this.P);
            }
            this.J = 0;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        } else if (i10 == 2) {
            imageReceiver.f21272u0 = true;
            imageReceiver.P0(false);
            this.J = -1;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
        }
    }

    public final void b(TL_iv.pageBlockVideo pageblockvideo, x2 x2Var, boolean z10, boolean z11) {
        boolean z12;
        i50 i50Var;
        VideoPlayerHolderBase videoPlayerHolderBase;
        TL_iv.pageBlockVideo pageblockvideo2 = this.M;
        if (pageblockvideo2 != null && (videoPlayerHolderBase = (i50Var = this.f50668a).f46119x) != null && i50Var.f46120y == this) {
            a0.h hVar = i50Var.E;
            long j10 = pageblockvideo2.video_id;
            x2 a10 = x2.a(videoPlayerHolderBase, this);
            this.N = a10;
            hVar.k(a10, j10);
        }
        this.M = pageblockvideo;
        this.N = x2Var;
        this.O = null;
        this.R = z10;
        g4 g4Var = this.f50669b;
        if (g4Var != null) {
            this.P = e4.a(g4Var.F, pageblockvideo.video_id);
        } else {
            this.P = null;
        }
        if (!org.telegram.messenger.zi.L4(this.P) && !org.telegram.messenger.zi.t3(this.P, false)) {
            z12 = false;
        } else {
            z12 = true;
        }
        this.Q = z12;
        this.f50677x = z11;
        this.f50675s.setVisibility(4);
        e(false);
        requestLayout();
    }

    public final void c(x2 x2Var) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        x2 x2Var2 = this.N;
        if (x2Var2 != null && (bitmap2 = x2Var.f51695b) != null && (bitmap3 = x2Var2.f51695b) != null && bitmap2 != bitmap3) {
            bitmap3.recycle();
            this.N.f51695b = null;
        }
        x2 x2Var3 = this.N;
        if (x2Var3 != null && x2Var.f51695b == null && (bitmap = x2Var3.f51695b) != null) {
            x2Var.f51694a = x2Var3.f51694a;
            x2Var.f51695b = bitmap;
        }
        this.N = x2Var;
    }

    public final void d() {
        VideoPlayerHolderBase videoPlayerHolderBase;
        int visibility = getVisibility();
        ImageReceiver imageReceiver = this.f50671e;
        if (visibility == 0 && isAttachedToWindow()) {
            if (!this.V) {
                this.V = true;
                imageReceiver.P();
                e(false);
            }
        } else if (!this.V) {
        } else {
            this.V = false;
            TL_iv.pageBlockVideo pageblockvideo = this.M;
            i50 i50Var = this.f50668a;
            if (pageblockvideo != null && (videoPlayerHolderBase = i50Var.f46119x) != null && i50Var.f46120y == this) {
                a0.h hVar = i50Var.E;
                long j10 = pageblockvideo.video_id;
                x2 a10 = x2.a(videoPlayerHolderBase, this);
                c(a10);
                hVar.k(a10, j10);
            }
            imageReceiver.R();
            org.telegram.messenger.z5.q(((i4) i50Var).Y).v(this);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public final void e(boolean z10) {
        boolean z11;
        int i3 = ((i4) this.f50668a).Y;
        String r5 = org.telegram.messenger.w7.r(null, this.P);
        org.telegram.messenger.w7.G(i3);
        File I = org.telegram.messenger.w7.I(this.P);
        org.telegram.messenger.w7.G(i3);
        boolean z12 = true;
        File K = org.telegram.messenger.w7.K(this.P, null, true, true);
        if (!I.exists() && !K.exists()) {
            z11 = false;
        } else {
            z11 = true;
        }
        boolean isEmpty = TextUtils.isEmpty(r5);
        RadialProgress2 radialProgress2 = this.f50674r;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z11) {
            org.telegram.messenger.z5.q(i3).v(this);
            if (!this.Q) {
                this.J = 3;
            } else {
                this.J = -1;
            }
            radialProgress2.setIcon(getIconForCurrentState(), false, z10);
        } else {
            org.telegram.messenger.z5.q(i3).a(r5, null, this);
            x2 x2Var = this.N;
            float f10 = 0.0f;
            if (x2Var != null && x2Var.f51695b != null) {
                this.J = -1;
            } else {
                if (!org.telegram.messenger.w7.G(i3).T(r5)) {
                    if (!this.T && this.S && this.Q) {
                        this.J = 1;
                    } else {
                        this.J = 0;
                    }
                } else {
                    this.J = 1;
                    Float w10 = org.telegram.messenger.zb.D().w(r5);
                    if (w10 != null) {
                        f10 = w10.floatValue();
                    }
                }
                radialProgress2.setIcon(getIconForCurrentState(), z12, z10);
                radialProgress2.p(false, f10);
            }
            z12 = false;
            radialProgress2.setIcon(getIconForCurrentState(), z12, z10);
            radialProgress2.p(false, f10);
        }
        invalidate();
    }

    public View getChannelCell() {
        return this.f50675s;
    }

    public TL_iv.pageBlockVideo getCurrentBlock() {
        return this.M;
    }

    public ImageReceiver getImageView() {
        return this.f50671e;
    }

    @Override
    public int getObserverTag() {
        return this.L;
    }

    public TextureView getTextureView() {
        return this.f50673n;
    }

    @Override
    public final void i(long j10, long j11) {
        this.f50674r.p(true, Math.min(1.0f, ((float) j10) / ((float) j11)));
        if (this.J != 1) {
            e(true);
        }
    }

    @Override
    public final void k(ArrayList arrayList) {
        a3 a3Var = this.f50670c;
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
        d();
        a3 a3Var = this.f50670c;
        if (a3Var != null) {
            a3Var.i(this);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            a3Var2.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
        a3 a3Var = this.f50670c;
        if (a3Var != null) {
            a3Var.f(this);
        }
        a3 a3Var2 = this.d;
        if (a3Var2 != null) {
            a3Var2.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.M != null) {
            ImageReceiver imageReceiver = this.f50671e;
            if (!imageReceiver.I() || imageReceiver.f21249i1 != 1.0f) {
                canvas.drawRect(imageReceiver.Q0, i4.f46067q1);
            }
            imageReceiver.h(canvas, null);
            a3 a3Var = this.f50670c;
            i50 i50Var = this.f50668a;
            int i3 = 0;
            if (a3Var != null) {
                canvas.save();
                canvas.translate(this.f50678y, this.E);
                i4.t(i50Var, canvas, this, 0);
                this.f50670c.d(canvas, this);
                canvas.restore();
                i3 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.f50678y, this.E + this.F);
                i4.t(i50Var, canvas, this, i3);
                this.d.d(canvas, this);
                canvas.restore();
            }
            i4.s(canvas, i50Var, this.M, getMeasuredHeight());
            super.onDraw(canvas);
            if (imageReceiver.R0) {
                this.f50674r.draw(canvas);
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.bd.M0(2131753933, null));
        if (this.f50670c != null) {
            sb2.append(", ");
            sb2.append(this.f50670c.d.getText());
        }
        accessibilityNodeInfo.setText(sb2.toString());
    }

    @Override
    public final void onMeasure(int r33, int r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.w2.onMeasure(int, int):void");
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.w2.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        d();
    }

    @Override
    public final void o(long j10, long j11) {
    }
}
