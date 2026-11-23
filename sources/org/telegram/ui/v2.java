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
public final class v2 extends FrameLayout implements org.telegram.messenger.y5, org.telegram.ui.Cells.i9 {
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
    public w2 N;
    public TL_iv.PageBlock O;
    public TLRPC.Document P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public org.telegram.messenger.yi U;
    public boolean V;
    public final p50 f52683a;
    public final e4 f52684b;
    public z2 f52685c;
    public z2 d;
    public final ImageReceiver f52686e;
    public final FrameLayout f52687f;
    public final j4 h;
    public final TextureView f52688n;
    public final RadialProgress2 f52689r;
    public final a1 f52690s;
    public final int f52691w;
    public boolean f52692x;
    public int f52693y;

    public v2(Context context, p50 p50Var, e4 e4Var, int i7) {
        super(context);
        this.f52683a = p50Var;
        this.f52684b = e4Var;
        setWillNotDraw(false);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f52686e = imageReceiver;
        imageReceiver.G0 = true;
        imageReceiver.H0 = true;
        this.f52691w = i7;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.f52689r = radialProgress2;
        radialProgress2.d = -1;
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        this.L = org.telegram.messenger.a6.q(((g4) p50Var).Y).k();
        a1 a1Var = new a1(context, p50Var, e4Var, 1);
        this.f52690s = a1Var;
        j4 j4Var = new j4(context);
        this.h = j4Var;
        j4Var.setResizeMode(0);
        TextureView textureView = new TextureView(context);
        this.f52688n = textureView;
        textureView.setOpaque(false);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f52687f = frameLayout;
        j4Var.addView(textureView, c8.na.e(-1, -2, 1));
        frameLayout.addView(j4Var, c8.na.e(-1, -1, 17));
        addView(frameLayout, c8.na.c(-2.0f, -1));
        addView(a1Var, c8.na.c(-2.0f, -1));
    }

    private int getIconForCurrentState() {
        int i7 = this.J;
        if (i7 == 0) {
            return 2;
        }
        if (i7 == 1) {
            return 3;
        }
        if (i7 == 2) {
            return 8;
        }
        if (i7 == 3) {
            return 0;
        }
        return 4;
    }

    @Override
    public final void C(boolean z10) {
        e(false);
    }

    @Override
    public final void N(String str) {
        this.f52689r.p(true, 1.0f);
        if (this.Q) {
            this.J = 2;
            a();
            return;
        }
        e(true);
    }

    public final void a() {
        int i7 = ((g4) this.f52683a).Y;
        int i10 = this.J;
        ImageReceiver imageReceiver = this.f52686e;
        RadialProgress2 radialProgress2 = this.f52689r;
        if (i10 == 0) {
            this.T = false;
            radialProgress2.p(false, 0.0f);
            boolean z10 = this.Q;
            e4 e4Var = this.f52684b;
            if (z10) {
                imageReceiver.r0(org.telegram.messenger.gc.b(this.P), null, org.telegram.messenger.gc.c(org.telegram.messenger.w7.w(this.P.thumbs, 40, false, null, false), this.P), "80_80_b", null, this.P.size, null, e4Var.F, 1);
            } else {
                org.telegram.messenger.w7.G(i7).W(this.P, e4Var.F, 1, 1);
            }
            this.J = 1;
            radialProgress2.setIcon(getIconForCurrentState(), true, true);
            invalidate();
        } else if (i10 == 1) {
            this.T = true;
            if (this.Q) {
                imageReceiver.c();
            } else {
                org.telegram.messenger.w7.G(i7).f(this.P);
            }
            this.J = 0;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        } else if (i10 == 2) {
            imageReceiver.f22659u0 = true;
            imageReceiver.P0(false);
            this.J = -1;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
        }
    }

    public final void b(TL_iv.pageBlockVideo pageblockvideo, w2 w2Var, boolean z10, boolean z11) {
        boolean z12;
        p50 p50Var;
        VideoPlayerHolderBase videoPlayerHolderBase;
        TL_iv.pageBlockVideo pageblockvideo2 = this.M;
        if (pageblockvideo2 != null && (videoPlayerHolderBase = (p50Var = this.f52683a).f50733x) != null && p50Var.f50734y == this) {
            a0.h hVar = p50Var.E;
            long j3 = pageblockvideo2.video_id;
            w2 a10 = w2.a(videoPlayerHolderBase, this);
            this.N = a10;
            hVar.k(a10, j3);
        }
        this.M = pageblockvideo;
        this.N = w2Var;
        this.O = null;
        this.R = z10;
        e4 e4Var = this.f52684b;
        if (e4Var != null) {
            this.P = d4.a(e4Var.F, pageblockvideo.video_id);
        } else {
            this.P = null;
        }
        if (!org.telegram.messenger.gj.K4(this.P) && !org.telegram.messenger.gj.s3(this.P, false)) {
            z12 = false;
        } else {
            z12 = true;
        }
        this.Q = z12;
        this.f52692x = z11;
        this.f52690s.setVisibility(4);
        e(false);
        requestLayout();
    }

    public final void c(w2 w2Var) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        w2 w2Var2 = this.N;
        if (w2Var2 != null && (bitmap2 = w2Var.f52914b) != null && (bitmap3 = w2Var2.f52914b) != null && bitmap2 != bitmap3) {
            bitmap3.recycle();
            this.N.f52914b = null;
        }
        w2 w2Var3 = this.N;
        if (w2Var3 != null && w2Var.f52914b == null && (bitmap = w2Var3.f52914b) != null) {
            w2Var.f52913a = w2Var3.f52913a;
            w2Var.f52914b = bitmap;
        }
        this.N = w2Var;
    }

    public final void d() {
        VideoPlayerHolderBase videoPlayerHolderBase;
        int visibility = getVisibility();
        ImageReceiver imageReceiver = this.f52686e;
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
            p50 p50Var = this.f52683a;
            if (pageblockvideo != null && (videoPlayerHolderBase = p50Var.f50733x) != null && p50Var.f50734y == this) {
                a0.h hVar = p50Var.E;
                long j3 = pageblockvideo.video_id;
                w2 a10 = w2.a(videoPlayerHolderBase, this);
                c(a10);
                hVar.k(a10, j3);
            }
            imageReceiver.R();
            org.telegram.messenger.a6.q(((g4) p50Var).Y).v(this);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return super.drawChild(canvas, view, j3);
    }

    public final void e(boolean z10) {
        boolean z11;
        int i7 = ((g4) this.f52683a).Y;
        String r10 = org.telegram.messenger.w7.r(null, this.P);
        org.telegram.messenger.w7.G(i7);
        File I = org.telegram.messenger.w7.I(this.P);
        org.telegram.messenger.w7.G(i7);
        boolean z12 = true;
        File J = org.telegram.messenger.w7.J(this.P, null, true, true);
        if (!I.exists() && !J.exists()) {
            z11 = false;
        } else {
            z11 = true;
        }
        boolean isEmpty = TextUtils.isEmpty(r10);
        RadialProgress2 radialProgress2 = this.f52689r;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z11) {
            org.telegram.messenger.a6.q(i7).v(this);
            if (!this.Q) {
                this.J = 3;
            } else {
                this.J = -1;
            }
            radialProgress2.setIcon(getIconForCurrentState(), false, z10);
        } else {
            org.telegram.messenger.a6.q(i7).a(r10, null, this);
            w2 w2Var = this.N;
            float f10 = 0.0f;
            if (w2Var != null && w2Var.f52914b != null) {
                this.J = -1;
            } else {
                if (!org.telegram.messenger.w7.G(i7).S(r10)) {
                    if (!this.T && this.S && this.Q) {
                        this.J = 1;
                    } else {
                        this.J = 0;
                    }
                } else {
                    this.J = 1;
                    Float w10 = org.telegram.messenger.fc.D().w(r10);
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
        return this.f52690s;
    }

    public TL_iv.pageBlockVideo getCurrentBlock() {
        return this.M;
    }

    public ImageReceiver getImageView() {
        return this.f52686e;
    }

    @Override
    public int getObserverTag() {
        return this.L;
    }

    public TextureView getTextureView() {
        return this.f52688n;
    }

    @Override
    public final void i(long j3, long j10) {
        this.f52689r.p(true, Math.min(1.0f, ((float) j3) / ((float) j10)));
        if (this.J != 1) {
            e(true);
        }
    }

    @Override
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.f52685c;
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
        d();
        z2 z2Var = this.f52685c;
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
        z2 z2Var = this.f52685c;
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
        if (this.M != null) {
            ImageReceiver imageReceiver = this.f52686e;
            if (!imageReceiver.I() || imageReceiver.f22636i1 != 1.0f) {
                canvas.drawRect(imageReceiver.Q0, g4.f47887q1);
            }
            imageReceiver.h(canvas, null);
            z2 z2Var = this.f52685c;
            p50 p50Var = this.f52683a;
            int i7 = 0;
            if (z2Var != null) {
                canvas.save();
                canvas.translate(this.f52693y, this.E);
                g4.t(p50Var, canvas, this, 0);
                this.f52685c.d(canvas, this);
                canvas.restore();
                i7 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.f52693y, this.E + this.F);
                g4.t(p50Var, canvas, this, i7);
                this.d.d(canvas, this);
                canvas.restore();
            }
            g4.s(canvas, p50Var, this.M, getMeasuredHeight());
            super.onDraw(canvas);
            if (imageReceiver.R0) {
                this.f52689r.draw(canvas);
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.hd.N0(2131753930, null));
        if (this.f52685c != null) {
            sb2.append(", ");
            sb2.append(this.f52685c.d.getText());
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
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        d();
    }

    @Override
    public final void o(long j3, long j10) {
    }
}
