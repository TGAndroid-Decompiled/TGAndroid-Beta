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
public final class v2 extends FrameLayout implements org.telegram.messenger.x5, org.telegram.ui.Cells.h9 {
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
    public org.telegram.messenger.aj T;
    public boolean U;
    public final o50 f50478a;
    public final e4 f50479b;
    public z2 f50480c;
    public z2 d;
    public final ImageReceiver f50481e;
    public final FrameLayout f50482f;
    public final j4 h;
    public final TextureView f50483n;
    public final RadialProgress2 f50484r;
    public final a1 f50485s;
    public final int f50486w;
    public boolean f50487x;
    public int f50488y;

    public v2(Context context, o50 o50Var, e4 e4Var, int i7) {
        super(context);
        this.f50478a = o50Var;
        this.f50479b = e4Var;
        setWillNotDraw(false);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f50481e = imageReceiver;
        imageReceiver.F0 = true;
        imageReceiver.G0 = true;
        this.f50486w = i7;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.f50484r = radialProgress2;
        radialProgress2.d = -1;
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        this.K = org.telegram.messenger.z5.q(((g4) o50Var).X).k();
        a1 a1Var = new a1(context, o50Var, e4Var, 1);
        this.f50485s = a1Var;
        j4 j4Var = new j4(context);
        this.h = j4Var;
        j4Var.setResizeMode(0);
        TextureView textureView = new TextureView(context);
        this.f50483n = textureView;
        textureView.setOpaque(false);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f50482f = frameLayout;
        j4Var.addView(textureView, c8.ha.e(-1, -2, 1));
        frameLayout.addView(j4Var, c8.ha.e(-1, -1, 17));
        addView(frameLayout, c8.ha.c(-2.0f, -1));
        addView(a1Var, c8.ha.c(-2.0f, -1));
    }

    private int getIconForCurrentState() {
        int i7 = this.I;
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
    public final void C(boolean z9) {
        e(false);
    }

    @Override
    public final void M(String str) {
        this.f50484r.p(true, 1.0f);
        if (this.P) {
            this.I = 2;
            a();
            return;
        }
        e(true);
    }

    public final void a() {
        int i7 = ((g4) this.f50478a).X;
        int i10 = this.I;
        ImageReceiver imageReceiver = this.f50481e;
        RadialProgress2 radialProgress2 = this.f50484r;
        if (i10 == 0) {
            this.S = false;
            radialProgress2.p(false, 0.0f);
            boolean z9 = this.P;
            e4 e4Var = this.f50479b;
            if (z9) {
                imageReceiver.r0(org.telegram.messenger.hc.b(this.O), null, org.telegram.messenger.hc.c(org.telegram.messenger.w7.w(this.O.thumbs, 40, false, null, false), this.O), "80_80_b", null, this.O.size, null, e4Var.E, 1);
            } else {
                org.telegram.messenger.w7.G(i7).W(this.O, e4Var.E, 1, 1);
            }
            this.I = 1;
            radialProgress2.setIcon(getIconForCurrentState(), true, true);
            invalidate();
        } else if (i10 == 1) {
            this.S = true;
            if (this.P) {
                imageReceiver.c();
            } else {
                org.telegram.messenger.w7.G(i7).f(this.O);
            }
            this.I = 0;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        } else if (i10 == 2) {
            imageReceiver.f21220t0 = true;
            imageReceiver.P0(false);
            this.I = -1;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
        }
    }

    public final void b(TL_iv.pageBlockVideo pageblockvideo, w2 w2Var, boolean z9, boolean z10) {
        boolean z11;
        o50 o50Var;
        VideoPlayerHolderBase videoPlayerHolderBase;
        TL_iv.pageBlockVideo pageblockvideo2 = this.L;
        if (pageblockvideo2 != null && (videoPlayerHolderBase = (o50Var = this.f50478a).f48275x) != null && o50Var.f48276y == this) {
            a0.h hVar = o50Var.D;
            long j3 = pageblockvideo2.video_id;
            w2 a10 = w2.a(videoPlayerHolderBase, this);
            this.M = a10;
            hVar.k(a10, j3);
        }
        this.L = pageblockvideo;
        this.M = w2Var;
        this.N = null;
        this.Q = z9;
        e4 e4Var = this.f50479b;
        if (e4Var != null) {
            this.O = d4.a(e4Var.E, pageblockvideo.video_id);
        } else {
            this.O = null;
        }
        if (!org.telegram.messenger.ij.L4(this.O) && !org.telegram.messenger.ij.t3(this.O, false)) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.P = z11;
        this.f50487x = z10;
        this.f50485s.setVisibility(4);
        e(false);
        requestLayout();
    }

    public final void c(w2 w2Var) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        w2 w2Var2 = this.M;
        if (w2Var2 != null && (bitmap2 = w2Var.f50835b) != null && (bitmap3 = w2Var2.f50835b) != null && bitmap2 != bitmap3) {
            bitmap3.recycle();
            this.M.f50835b = null;
        }
        w2 w2Var3 = this.M;
        if (w2Var3 != null && w2Var.f50835b == null && (bitmap = w2Var3.f50835b) != null) {
            w2Var.f50834a = w2Var3.f50834a;
            w2Var.f50835b = bitmap;
        }
        this.M = w2Var;
    }

    public final void d() {
        VideoPlayerHolderBase videoPlayerHolderBase;
        int visibility = getVisibility();
        ImageReceiver imageReceiver = this.f50481e;
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
            o50 o50Var = this.f50478a;
            if (pageblockvideo != null && (videoPlayerHolderBase = o50Var.f48275x) != null && o50Var.f48276y == this) {
                a0.h hVar = o50Var.D;
                long j3 = pageblockvideo.video_id;
                w2 a10 = w2.a(videoPlayerHolderBase, this);
                c(a10);
                hVar.k(a10, j3);
            }
            imageReceiver.R();
            org.telegram.messenger.z5.q(((g4) o50Var).X).v(this);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return super.drawChild(canvas, view, j3);
    }

    public final void e(boolean z9) {
        boolean z10;
        int i7 = ((g4) this.f50478a).X;
        String r10 = org.telegram.messenger.w7.r(null, this.O);
        org.telegram.messenger.w7.G(i7);
        File I = org.telegram.messenger.w7.I(this.O);
        org.telegram.messenger.w7.G(i7);
        boolean z11 = true;
        File J = org.telegram.messenger.w7.J(this.O, null, true, true);
        if (!I.exists() && !J.exists()) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean isEmpty = TextUtils.isEmpty(r10);
        RadialProgress2 radialProgress2 = this.f50484r;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z10) {
            org.telegram.messenger.z5.q(i7).v(this);
            if (!this.P) {
                this.I = 3;
            } else {
                this.I = -1;
            }
            radialProgress2.setIcon(getIconForCurrentState(), false, z9);
        } else {
            org.telegram.messenger.z5.q(i7).a(r10, null, this);
            w2 w2Var = this.M;
            float f10 = 0.0f;
            if (w2Var != null && w2Var.f50835b != null) {
                this.I = -1;
            } else {
                if (!org.telegram.messenger.w7.G(i7).S(r10)) {
                    if (!this.S && this.R && this.P) {
                        this.I = 1;
                    } else {
                        this.I = 0;
                    }
                } else {
                    this.I = 1;
                    Float w10 = org.telegram.messenger.gc.D().w(r10);
                    if (w10 != null) {
                        f10 = w10.floatValue();
                    }
                }
                radialProgress2.setIcon(getIconForCurrentState(), z11, z9);
                radialProgress2.p(false, f10);
            }
            z11 = false;
            radialProgress2.setIcon(getIconForCurrentState(), z11, z9);
            radialProgress2.p(false, f10);
        }
        invalidate();
    }

    public View getChannelCell() {
        return this.f50485s;
    }

    public TL_iv.pageBlockVideo getCurrentBlock() {
        return this.L;
    }

    public ImageReceiver getImageView() {
        return this.f50481e;
    }

    @Override
    public int getObserverTag() {
        return this.K;
    }

    public TextureView getTextureView() {
        return this.f50483n;
    }

    @Override
    public final void i(long j3, long j10) {
        this.f50484r.p(true, Math.min(1.0f, ((float) j3) / ((float) j10)));
        if (this.I != 1) {
            e(true);
        }
    }

    @Override
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.f50480c;
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
        z2 z2Var = this.f50480c;
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
        z2 z2Var = this.f50480c;
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
            ImageReceiver imageReceiver = this.f50481e;
            if (!imageReceiver.I() || imageReceiver.f21197h1 != 1.0f) {
                canvas.drawRect(imageReceiver.P0, g4.f45787p1);
            }
            imageReceiver.h(canvas, null);
            z2 z2Var = this.f50480c;
            o50 o50Var = this.f50478a;
            int i7 = 0;
            if (z2Var != null) {
                canvas.save();
                canvas.translate(this.f50488y, this.D);
                g4.t(o50Var, canvas, this, 0);
                this.f50480c.d(canvas, this);
                canvas.restore();
                i7 = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.f50488y, this.D + this.E);
                g4.t(o50Var, canvas, this, i7);
                this.d.d(canvas, this);
                canvas.restore();
            }
            g4.s(canvas, o50Var, this.L, getMeasuredHeight());
            super.onDraw(canvas);
            if (imageReceiver.Q0) {
                this.f50484r.draw(canvas);
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.id.M0(2131753933, null));
        if (this.f50480c != null) {
            sb2.append(", ");
            sb2.append(this.f50480c.d.getText());
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
