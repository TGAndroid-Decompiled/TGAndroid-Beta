package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AnimatedFileDrawableStream;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public class vq0 {
    public float A;
    public float B;
    public ValueAnimator C;
    public org.telegram.messenger.zi D;
    public tq0 E;
    public uq0 F;
    public float G;
    public float H;
    public float I;
    public float J;
    public float K;
    public boolean L;
    public int M;
    public int N;
    public float O;
    public float P;
    public final float[] Q;
    public boolean R;
    public ColorMatrixColorFilter S;
    public final ViewGroup f50580a;
    public final ViewGroup f50581b;
    public final boolean f50582c;
    public org.telegram.ui.Cells.t5 d;
    public View f50583e;
    public ImageReceiver f50584f;
    public ImageReceiver f50585g;
    public ImageReceiver h;
    public boolean f50586i;
    public final yh.f f50587j;
    public yh.e f50588k;
    public final Path f50589l;
    public final float[] f50590m;
    public boolean f50591n;
    public float f50592o;
    public float f50593p;
    public float f50594q;
    public float f50595r;
    public float f50596s;
    public float f50597t;
    public float f50598u;
    public float v;
    public float f50599w;
    public float f50600x;
    public float f50601y;
    public float f50602z;

    public vq0(ViewGroup viewGroup, ViewGroup viewGroup2) {
        this.f50585g = new ImageReceiver(null);
        this.h = new ImageReceiver(null);
        this.f50587j = new yh.f();
        this.f50589l = new Path();
        this.f50590m = new float[8];
        this.Q = new float[2];
        this.f50580a = viewGroup;
        this.f50581b = viewGroup2;
        this.f50582c = false;
    }

    public final boolean a(MotionEvent motionEvent, ViewGroup viewGroup, ImageReceiver imageReceiver, org.telegram.messenger.zi ziVar, int i3) {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        org.telegram.messenger.ac c2;
        org.telegram.messenger.ac acVar;
        if (!j(viewGroup, imageReceiver)) {
            return false;
        }
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 2 && this.L) {
                int i14 = -1;
                int i15 = -1;
                for (int i16 = 0; i16 < motionEvent.getPointerCount(); i16++) {
                    if (this.M == motionEvent.getPointerId(i16)) {
                        i14 = i16;
                    }
                    if (this.N == motionEvent.getPointerId(i16)) {
                        i15 = i16;
                    }
                }
                if (i14 != -1 && i15 != -1) {
                    float hypot = ((float) Math.hypot(motionEvent.getX(i15) - motionEvent.getX(i14), motionEvent.getY(i15) - motionEvent.getY(i14))) / this.I;
                    this.O = hypot;
                    if (hypot > 1.005f && !this.f50591n) {
                        this.I = (float) Math.hypot(motionEvent.getX(i15) - motionEvent.getX(i14), motionEvent.getY(i15) - motionEvent.getY(i14));
                        float x10 = (motionEvent.getX(i15) + motionEvent.getX(i14)) / 2.0f;
                        this.f50596s = x10;
                        this.G = x10;
                        float y9 = (motionEvent.getY(i15) + motionEvent.getY(i14)) / 2.0f;
                        this.f50597t = y9;
                        this.H = y9;
                        this.O = 1.0f;
                        this.J = 0.0f;
                        this.K = 0.0f;
                        viewGroup.getParent().requestDisallowInterceptTouchEvent(true);
                        this.f50583e = viewGroup;
                        this.D = ziVar;
                        org.telegram.ui.Cells.t5 t5Var = this.d;
                        ViewGroup viewGroup2 = this.f50580a;
                        boolean z11 = this.f50582c;
                        if (t5Var == null && !z11) {
                            i12 = -1;
                            org.telegram.ui.Cells.t5 t5Var2 = new org.telegram.ui.Cells.t5(this, viewGroup2.getContext());
                            this.d = t5Var2;
                            t5Var2.setFocusable(false);
                            this.d.setFocusableInTouchMode(false);
                            this.d.setEnabled(false);
                        } else {
                            i12 = -1;
                        }
                        if (this.f50585g == null) {
                            ImageReceiver imageReceiver2 = new ImageReceiver(null);
                            this.f50585g = imageReceiver2;
                            imageReceiver2.f21254l1 = (byte) 2;
                            imageReceiver2.B0 = false;
                            imageReceiver2.P();
                            ImageReceiver imageReceiver3 = new ImageReceiver(null);
                            this.h = imageReceiver3;
                            imageReceiver3.f21254l1 = (byte) 2;
                            imageReceiver3.B0 = false;
                            imageReceiver3.P();
                        }
                        this.f50591n = true;
                        this.A = 1.0f;
                        this.B = 0.0f;
                        if (!z11) {
                            viewGroup2.addView(this.d);
                            if (ziVar != null && ziVar.u2() && !ziVar.M0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            this.f50586i = z10;
                            if (z10 && this.f50588k == null) {
                                yh.e e10 = yh.e.e(this.d);
                                this.f50588k = e10;
                                if (e10 != null) {
                                    e10.f59504k.put(this.d, Integer.valueOf(i3));
                                }
                            }
                            if (this.h.n() != null) {
                                this.h.n().recycle();
                                this.h.w0(null);
                            }
                            if (imageReceiver.n() != null && !imageReceiver.n().isRecycled() && this.f50586i) {
                                this.h.v0(Utilities.D(imageReceiver.n(), false));
                                ImageReceiver imageReceiver4 = this.h;
                                if (this.S == null) {
                                    ColorMatrix colorMatrix = new ColorMatrix();
                                    org.telegram.messenger.g0.n2(colorMatrix, 0.9f);
                                    org.telegram.messenger.g0.i(colorMatrix, 0.6f);
                                    this.S = new ColorMatrixColorFilter(colorMatrix);
                                }
                                imageReceiver4.f21261p1 = this.S;
                            } else {
                                this.h.f21261p1 = null;
                            }
                            if (ziVar == null || !org.telegram.messenger.zi.T3(ziVar.f26868k)) {
                                i13 = i14;
                                i10 = i15;
                            } else {
                                int[] iArr = new int[1];
                                TLRPC.Message message = ziVar.f26868k;
                                if (message instanceof TLRPC.TL_messageService) {
                                    if (!(message.action instanceof TLRPC.TL_messageActionUserUpdatedPhoto)) {
                                        TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(ziVar.f26878n0, org.telegram.messenger.g0.Z0(false), false, null, false);
                                        if (w10 != null) {
                                            int i17 = w10.size;
                                            iArr[0] = i17;
                                            if (i17 == 0) {
                                                iArr[0] = i12;
                                            }
                                            c2 = org.telegram.messenger.ac.f(w10, ziVar.f26872l0);
                                            acVar = c2;
                                        } else {
                                            iArr[0] = i12;
                                        }
                                    }
                                    acVar = null;
                                } else {
                                    TLRPC.MessageMedia messageMedia = message.media;
                                    if (((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && messageMedia.photo != null) || ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && messageMedia.webpage != null)) {
                                        if (org.telegram.messenger.zi.u3(message)) {
                                            c2 = org.telegram.messenger.ac.b(ziVar.F0());
                                        } else {
                                            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(ziVar.f26878n0, org.telegram.messenger.g0.Z0(false), false, null, true);
                                            if (w11 != null) {
                                                int i18 = w11.size;
                                                iArr[0] = i18;
                                                if (i18 == 0) {
                                                    iArr[0] = i12;
                                                }
                                                c2 = org.telegram.messenger.ac.f(w11, ziVar.f26872l0);
                                            } else {
                                                iArr[0] = i12;
                                                acVar = null;
                                            }
                                        }
                                        acVar = c2;
                                    } else {
                                        if (messageMedia instanceof TLRPC.TL_messageMediaInvoice) {
                                            c2 = org.telegram.messenger.ac.p(org.telegram.messenger.e20.c(((TLRPC.TL_messageMediaInvoice) messageMedia).webPhoto));
                                        } else {
                                            if (ziVar.F0() != null) {
                                                TLRPC.Document F0 = ziVar.F0();
                                                if (org.telegram.messenger.zi.X2(ziVar.F0())) {
                                                    TLRPC.PhotoSize w12 = org.telegram.messenger.w7.w(F0.thumbs, 90, false, null, false);
                                                    int i19 = w12.size;
                                                    iArr[0] = i19;
                                                    if (i19 == 0) {
                                                        iArr[0] = i12;
                                                    }
                                                    c2 = org.telegram.messenger.ac.c(w12, F0);
                                                }
                                            }
                                            acVar = null;
                                        }
                                        acVar = c2;
                                    }
                                }
                                if (acVar != null) {
                                    i10 = i15;
                                    i13 = i14;
                                    this.f50585g.r0(acVar, null, null, null, null, iArr[0], null, ziVar, ziVar.a5() ? 1 : 0);
                                    this.f50585g.f21254l1 = (byte) 2;
                                } else {
                                    i13 = i14;
                                    i10 = i15;
                                }
                                i();
                            }
                            this.f50598u = imageReceiver.L0;
                            this.v = imageReceiver.M0 + viewGroup.getPaddingTop();
                            this.f50599w = imageReceiver.O0;
                            this.f50600x = imageReceiver.N0;
                            this.f50601y = imageReceiver.o();
                            float q10 = imageReceiver.q();
                            this.f50602z = q10;
                            float f10 = this.f50601y;
                            float f11 = f10 / q10;
                            float f12 = this.f50599w;
                            float f13 = this.f50600x;
                            float f14 = f12 / f13;
                            if (f11 != f14) {
                                if (f11 < f14) {
                                    this.f50602z = (q10 / f10) * f12;
                                    this.f50601y = f12;
                                } else {
                                    this.f50601y = f11 * f13;
                                    this.f50602z = f13;
                                }
                            } else {
                                this.f50601y = f12;
                                this.f50602z = f13;
                            }
                            if (ziVar != null && org.telegram.messenger.zi.M4(ziVar.f26868k) && MediaController.B().I(ziVar)) {
                                this.R = true;
                                MediaController B = MediaController.B();
                                org.telegram.ui.Cells.t5 t5Var3 = this.d;
                                B.p0((TextureView) t5Var3.d, (l4) t5Var3.f30601e, (FrameLayout) t5Var3.f30600c, true);
                                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ((FrameLayout) this.d.f30600c).getLayoutParams();
                                ((FrameLayout) this.d.f30600c).setTag(2131296591, imageReceiver);
                                if (layoutParams.width != imageReceiver.N0 || layoutParams.height != imageReceiver.O0) {
                                    ((l4) this.d.f30601e).setResizeMode(3);
                                    layoutParams.width = (int) imageReceiver.N0;
                                    layoutParams.height = (int) imageReceiver.O0;
                                    ((FrameLayout) this.d.f30600c).setLayoutParams(layoutParams);
                                }
                                ((TextureView) this.d.d).setScaleX(1.0f);
                                ((TextureView) this.d.d).setScaleY(1.0f);
                                tq0 tq0Var = this.E;
                                if (tq0Var != null) {
                                    this.d.f30599b.setImageBitmap(tq0Var.i0().getBitmap((int) this.f50602z, (int) this.f50601y));
                                    this.d.f30599b.u((int) this.f50602z, (int) this.f50601y);
                                    this.d.f30599b.getImageReceiver().L0(imageReceiver.E());
                                }
                                ((FrameLayout) this.d.f30600c).setVisibility(0);
                            } else {
                                this.R = false;
                                ImageReceiver imageReceiver5 = new ImageReceiver(null);
                                this.f50584f = imageReceiver5;
                                imageReceiver5.P();
                                Drawable t10 = imageReceiver.t();
                                this.f50584f.w0(t10);
                                if (t10 instanceof org.telegram.ui.Components.t5) {
                                    org.telegram.ui.Components.t5 t5Var4 = (org.telegram.ui.Components.t5) t10;
                                    t5Var4.f(this.d);
                                    t5Var4.S = true;
                                }
                                this.f50584f.y0(this.f50598u, this.v, this.f50600x, this.f50599w);
                                ImageReceiver imageReceiver6 = this.f50584f;
                                imageReceiver6.S0 = imageReceiver.S0;
                                imageReceiver6.L0(imageReceiver.E());
                                this.f50585g.L0(imageReceiver.E());
                                this.f50585g.S0 = imageReceiver.S0;
                                ((FrameLayout) this.d.f30600c).setVisibility(8);
                            }
                        } else {
                            i13 = i14;
                            i10 = i15;
                        }
                        tq0 tq0Var2 = this.E;
                        if (tq0Var2 != null) {
                            tq0Var2.I0(ziVar);
                        }
                        this.P = 0.0f;
                        i11 = i13;
                    } else {
                        i10 = i15;
                        i11 = i14;
                    }
                    float x11 = motionEvent.getX(i11);
                    int i20 = i10;
                    float y10 = motionEvent.getY(i11);
                    float x12 = this.G - ((motionEvent.getX(i20) + x11) / 2.0f);
                    float y11 = this.H - ((motionEvent.getY(i20) + y10) / 2.0f);
                    float f15 = -x12;
                    float f16 = this.O;
                    this.J = f15 / f16;
                    this.K = (-y11) / f16;
                    e();
                } else {
                    this.L = false;
                    viewGroup.getParent().requestDisallowInterceptTouchEvent(false);
                    d();
                    return false;
                }
            } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.M == motionEvent.getPointerId(0) && this.N == motionEvent.getPointerId(1)) || (this.M == motionEvent.getPointerId(1) && this.N == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.L) {
                this.L = false;
                if (viewGroup != null && viewGroup.getParent() != null) {
                    viewGroup.getParent().requestDisallowInterceptTouchEvent(false);
                }
                d();
            }
        } else if (!this.L && motionEvent.getPointerCount() == 2) {
            this.I = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
            float x13 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
            this.f50596s = x13;
            this.G = x13;
            float y12 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
            this.f50597t = y12;
            this.H = y12;
            this.O = 1.0f;
            this.M = motionEvent.getPointerId(0);
            this.N = motionEvent.getPointerId(1);
            this.L = true;
        }
        return f(viewGroup);
    }

    public final void b() {
        if (this.f50591n) {
            tq0 tq0Var = this.E;
            if (tq0Var != null) {
                tq0Var.G(this.D);
            }
            this.f50591n = false;
        }
        org.telegram.ui.Cells.t5 t5Var = this.d;
        if (t5Var != null && t5Var.getParent() != null) {
            this.f50580a.removeView(this.d);
            this.d.f30599b.getImageReceiver().f();
            yh.e eVar = this.f50588k;
            if (eVar != null) {
                eVar.b(this.d);
                this.f50588k = null;
            }
            ImageReceiver imageReceiver = this.f50584f;
            if (imageReceiver != null) {
                Drawable t10 = imageReceiver.t();
                if (t10 instanceof org.telegram.ui.Components.t5) {
                    ((org.telegram.ui.Components.t5) t10).w(this.d);
                }
            }
        }
        View view = this.f50583e;
        if (view != null) {
            view.invalidate();
            this.f50583e = null;
        }
        ImageReceiver imageReceiver2 = this.f50584f;
        if (imageReceiver2 != null) {
            imageReceiver2.R();
            this.f50584f.f();
            this.f50584f = null;
        }
        ImageReceiver imageReceiver3 = this.f50585g;
        if (imageReceiver3 != null) {
            imageReceiver3.R();
            this.f50585g.f();
            this.f50585g = null;
        }
        ImageReceiver imageReceiver4 = this.h;
        if (imageReceiver4 != null) {
            imageReceiver4.R();
            this.h.f();
            this.h = null;
        }
        this.D = null;
    }

    public final void d() {
        if (this.C == null && this.f50591n) {
            if (!this.f50582c && !i()) {
                b();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.C = ofFloat;
            ofFloat.addUpdateListener(new b3(this, 23));
            this.C.addListener(new y20(this, 19));
            this.C.setDuration(220L);
            this.C.setInterpolator(org.telegram.ui.Components.xq.f40452f);
            this.C.start();
        }
    }

    public void e() {
        View view;
        if (this.f50582c && (view = this.f50583e) != null) {
            view.invalidate();
        }
        org.telegram.ui.Cells.t5 t5Var = this.d;
        if (t5Var != null) {
            t5Var.invalidate();
        }
    }

    public final boolean f(View view) {
        if (this.f50591n && view == this.f50583e) {
            return true;
        }
        return false;
    }

    public final boolean g(MotionEvent motionEvent) {
        if (i() && this.f50583e != null) {
            motionEvent.offsetLocation(-this.f50594q, -this.f50595r);
            return this.f50583e.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void h(zg zgVar) {
        this.F = zgVar;
    }

    public final boolean i() {
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        for (View view = this.f50583e; view != this.f50580a; view = (View) view.getParent()) {
            if (view == null) {
                return false;
            }
            f11 += view.getLeft();
            f12 += view.getTop();
            if (!(view.getParent() instanceof View)) {
                break;
            }
        }
        float f13 = 0.0f;
        for (View view2 = this.f50583e; view2 != this.f50581b; view2 = (View) view2.getParent()) {
            if (view2 == null) {
                return false;
            }
            f10 += view2.getLeft();
            f13 += view2.getTop();
        }
        this.f50594q = f10;
        this.f50595r = f13;
        this.f50592o = f11;
        this.f50593p = f12;
        return true;
    }

    public boolean j(View view, ImageReceiver imageReceiver) {
        if (!this.f50582c) {
            if (imageReceiver.t() instanceof org.telegram.ui.Components.t5) {
                AnimatedFileDrawableStream animatedFileDrawableStream = ((org.telegram.ui.Components.t5) imageReceiver.t()).f38280v0;
                if (animatedFileDrawableStream != null && animatedFileDrawableStream.f21211s) {
                    return false;
                }
                return true;
            } else if (imageReceiver.T == null && imageReceiver.f21252k0 == null) {
                Drawable drawable = imageReceiver.f21256n0;
                if (!(drawable instanceof org.telegram.ui.Components.x41)) {
                    if (drawable == null || (drawable instanceof org.telegram.ui.Components.u8) || imageReceiver.R != null || imageReceiver.f21248i0 != null) {
                        return false;
                    }
                    return true;
                }
                return true;
            } else {
                return true;
            }
        }
        return true;
    }

    public vq0() {
        this.f50585g = new ImageReceiver(null);
        this.h = new ImageReceiver(null);
        this.f50587j = new yh.f();
        this.f50589l = new Path();
        this.f50590m = new float[8];
        this.Q = new float[2];
        this.f50580a = null;
        this.f50581b = null;
        this.f50582c = true;
    }

    public void c(Canvas canvas, float f10, float f11, float f12, float f13, float f14) {
    }
}
