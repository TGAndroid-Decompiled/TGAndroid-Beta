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
public class qs0 {
    public float A;
    public float B;
    public ValueAnimator C;
    public org.telegram.messenger.jj D;
    public os0 E;
    public ps0 F;
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
    public final ViewGroup f41043a;
    public final ViewGroup f41044b;
    public final boolean f41045c;
    public org.telegram.ui.Cells.y5 d;
    public View e;
    public ImageReceiver f41046f;
    public ImageReceiver f41047g;
    public ImageReceiver h;
    public boolean f41048i;
    public final nh.i f41049j;
    public nh.h f41050k;
    public final Path f41051l;
    public final float[] f41052m;
    public boolean f41053n;
    public float f41054o;
    public float f41055p;
    public float f41056q;
    public float f41057r;
    public float f41058s;
    public float f41059t;
    public float f41060u;
    public float v;
    public float f41061w;
    public float f41062x;
    public float f41063y;
    public float f41064z;

    public qs0(ViewGroup viewGroup, ViewGroup viewGroup2) {
        this.f41047g = new ImageReceiver(null);
        this.h = new ImageReceiver(null);
        this.f41049j = new nh.i();
        this.f41051l = new Path();
        this.f41052m = new float[8];
        this.Q = new float[2];
        this.f41043a = viewGroup;
        this.f41044b = viewGroup2;
        this.f41045c = false;
    }

    public final boolean a(MotionEvent motionEvent, ViewGroup viewGroup, ImageReceiver imageReceiver, org.telegram.messenger.jj jjVar, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        org.telegram.messenger.ic c10;
        org.telegram.messenger.ic icVar;
        if (!j(viewGroup, imageReceiver)) {
            return false;
        }
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 2 && this.L) {
                int i15 = -1;
                int i16 = -1;
                for (int i17 = 0; i17 < motionEvent.getPointerCount(); i17++) {
                    if (this.M == motionEvent.getPointerId(i17)) {
                        i15 = i17;
                    }
                    if (this.N == motionEvent.getPointerId(i17)) {
                        i16 = i17;
                    }
                }
                if (i15 != -1 && i16 != -1) {
                    float hypot = ((float) Math.hypot(motionEvent.getX(i16) - motionEvent.getX(i15), motionEvent.getY(i16) - motionEvent.getY(i15))) / this.I;
                    this.O = hypot;
                    if (hypot > 1.005f && !this.f41053n) {
                        this.I = (float) Math.hypot(motionEvent.getX(i16) - motionEvent.getX(i15), motionEvent.getY(i16) - motionEvent.getY(i15));
                        float x10 = (motionEvent.getX(i16) + motionEvent.getX(i15)) / 2.0f;
                        this.f41058s = x10;
                        this.G = x10;
                        float y3 = (motionEvent.getY(i16) + motionEvent.getY(i15)) / 2.0f;
                        this.f41059t = y3;
                        this.H = y3;
                        this.O = 1.0f;
                        this.J = 0.0f;
                        this.K = 0.0f;
                        viewGroup.getParent().requestDisallowInterceptTouchEvent(true);
                        this.e = viewGroup;
                        this.D = jjVar;
                        org.telegram.ui.Cells.y5 y5Var = this.d;
                        ViewGroup viewGroup2 = this.f41043a;
                        boolean z11 = this.f41045c;
                        if (y5Var == null && !z11) {
                            i13 = -1;
                            org.telegram.ui.Cells.y5 y5Var2 = new org.telegram.ui.Cells.y5(this, viewGroup2.getContext());
                            this.d = y5Var2;
                            y5Var2.setFocusable(false);
                            this.d.setFocusableInTouchMode(false);
                            this.d.setEnabled(false);
                        } else {
                            i13 = -1;
                        }
                        if (this.f41047g == null) {
                            ImageReceiver imageReceiver2 = new ImageReceiver(null);
                            this.f41047g = imageReceiver2;
                            imageReceiver2.f14390k1 = (byte) 2;
                            imageReceiver2.A0 = false;
                            imageReceiver2.P();
                            ImageReceiver imageReceiver3 = new ImageReceiver(null);
                            this.h = imageReceiver3;
                            imageReceiver3.f14390k1 = (byte) 2;
                            imageReceiver3.A0 = false;
                            imageReceiver3.P();
                        }
                        this.f41053n = true;
                        this.A = 1.0f;
                        this.B = 0.0f;
                        if (!z11) {
                            viewGroup2.addView(this.d);
                            if (jjVar != null && jjVar.t2() && !jjVar.M0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            this.f41048i = z10;
                            if (z10 && this.f41050k == null) {
                                nh.h e = nh.h.e(this.d);
                                this.f41050k = e;
                                if (e != null) {
                                    e.f13836k.put(this.d, Integer.valueOf(i10));
                                }
                            }
                            if (this.h.n() != null) {
                                this.h.n().recycle();
                                this.h.w0(null);
                            }
                            if (imageReceiver.n() != null && !imageReceiver.n().isRecycled() && this.f41048i) {
                                this.h.v0(Utilities.D(imageReceiver.n(), false));
                                ImageReceiver imageReceiver4 = this.h;
                                if (this.S == null) {
                                    ColorMatrix colorMatrix = new ColorMatrix();
                                    org.telegram.messenger.i0.n2(colorMatrix, 0.9f);
                                    org.telegram.messenger.i0.i(colorMatrix, 0.6f);
                                    this.S = new ColorMatrixColorFilter(colorMatrix);
                                }
                                imageReceiver4.f14397o1 = this.S;
                            } else {
                                this.h.f14397o1 = null;
                            }
                            if (jjVar == null || !org.telegram.messenger.jj.S3(jjVar.f16337k)) {
                                i14 = i15;
                                i11 = i16;
                            } else {
                                int[] iArr = new int[1];
                                TLRPC.Message message = jjVar.f16337k;
                                if (message instanceof TLRPC.TL_messageService) {
                                    if (!(message.action instanceof TLRPC.TL_messageActionUserUpdatedPhoto)) {
                                        TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(jjVar.f16348n0, org.telegram.messenger.i0.Z0(false), false, null, false);
                                        if (w9 != null) {
                                            int i18 = w9.size;
                                            iArr[0] = i18;
                                            if (i18 == 0) {
                                                iArr[0] = i13;
                                            }
                                            c10 = org.telegram.messenger.ic.f(w9, jjVar.f16342l0);
                                            icVar = c10;
                                        } else {
                                            iArr[0] = i13;
                                        }
                                    }
                                    icVar = null;
                                } else {
                                    TLRPC.MessageMedia messageMedia = message.media;
                                    if (((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && messageMedia.photo != null) || ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && messageMedia.webpage != null)) {
                                        if (org.telegram.messenger.jj.t3(message)) {
                                            c10 = org.telegram.messenger.ic.b(jjVar.F0());
                                        } else {
                                            TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(jjVar.f16348n0, org.telegram.messenger.i0.Z0(false), false, null, true);
                                            if (w10 != null) {
                                                int i19 = w10.size;
                                                iArr[0] = i19;
                                                if (i19 == 0) {
                                                    iArr[0] = i13;
                                                }
                                                c10 = org.telegram.messenger.ic.f(w10, jjVar.f16342l0);
                                            } else {
                                                iArr[0] = i13;
                                                icVar = null;
                                            }
                                        }
                                        icVar = c10;
                                    } else {
                                        if (messageMedia instanceof TLRPC.TL_messageMediaInvoice) {
                                            c10 = org.telegram.messenger.ic.p(org.telegram.messenger.b30.c(((TLRPC.TL_messageMediaInvoice) messageMedia).webPhoto));
                                        } else {
                                            if (jjVar.F0() != null) {
                                                TLRPC.Document F0 = jjVar.F0();
                                                if (org.telegram.messenger.jj.W2(jjVar.F0())) {
                                                    TLRPC.PhotoSize w11 = org.telegram.messenger.b8.w(F0.thumbs, 90, false, null, false);
                                                    int i20 = w11.size;
                                                    iArr[0] = i20;
                                                    if (i20 == 0) {
                                                        iArr[0] = i13;
                                                    }
                                                    c10 = org.telegram.messenger.ic.c(w11, F0);
                                                }
                                            }
                                            icVar = null;
                                        }
                                        icVar = c10;
                                    }
                                }
                                if (icVar != null) {
                                    i11 = i16;
                                    i14 = i15;
                                    this.f41047g.r0(icVar, null, null, null, null, iArr[0], null, jjVar, jjVar.Z4() ? 1 : 0);
                                    this.f41047g.f14390k1 = (byte) 2;
                                } else {
                                    i14 = i15;
                                    i11 = i16;
                                }
                                i();
                            }
                            this.f41060u = imageReceiver.K0;
                            this.v = imageReceiver.L0 + viewGroup.getPaddingTop();
                            this.f41061w = imageReceiver.N0;
                            this.f41062x = imageReceiver.M0;
                            this.f41063y = imageReceiver.o();
                            float q6 = imageReceiver.q();
                            this.f41064z = q6;
                            float f7 = this.f41063y;
                            float f10 = f7 / q6;
                            float f11 = this.f41061w;
                            float f12 = this.f41062x;
                            float f13 = f11 / f12;
                            if (f10 != f13) {
                                if (f10 < f13) {
                                    this.f41064z = (q6 / f7) * f11;
                                    this.f41063y = f11;
                                } else {
                                    this.f41063y = f10 * f12;
                                    this.f41064z = f12;
                                }
                            } else {
                                this.f41063y = f11;
                                this.f41064z = f12;
                            }
                            if (jjVar != null && org.telegram.messenger.jj.L4(jjVar.f16337k) && MediaController.B().I(jjVar)) {
                                this.R = true;
                                MediaController B = MediaController.B();
                                org.telegram.ui.Cells.y5 y5Var3 = this.d;
                                B.p0((TextureView) y5Var3.d, (k4) y5Var3.e, (FrameLayout) y5Var3.f23621c, true);
                                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ((FrameLayout) this.d.f23621c).getLayoutParams();
                                ((FrameLayout) this.d.f23621c).setTag(2131296591, imageReceiver);
                                if (layoutParams.width != imageReceiver.M0 || layoutParams.height != imageReceiver.N0) {
                                    ((k4) this.d.e).setResizeMode(3);
                                    layoutParams.width = (int) imageReceiver.M0;
                                    layoutParams.height = (int) imageReceiver.N0;
                                    ((FrameLayout) this.d.f23621c).setLayoutParams(layoutParams);
                                }
                                ((TextureView) this.d.d).setScaleX(1.0f);
                                ((TextureView) this.d.d).setScaleY(1.0f);
                                os0 os0Var = this.E;
                                if (os0Var != null) {
                                    this.d.f23620b.setImageBitmap(os0Var.k0().getBitmap((int) this.f41064z, (int) this.f41063y));
                                    this.d.f23620b.u((int) this.f41064z, (int) this.f41063y);
                                    this.d.f23620b.getImageReceiver().L0(imageReceiver.E());
                                }
                                ((FrameLayout) this.d.f23621c).setVisibility(0);
                            } else {
                                this.R = false;
                                ImageReceiver imageReceiver5 = new ImageReceiver(null);
                                this.f41046f = imageReceiver5;
                                imageReceiver5.P();
                                Drawable t10 = imageReceiver.t();
                                this.f41046f.w0(t10);
                                if (t10 instanceof org.telegram.ui.Components.s5) {
                                    org.telegram.ui.Components.s5 s5Var = (org.telegram.ui.Components.s5) t10;
                                    s5Var.f(this.d);
                                    s5Var.R = true;
                                }
                                this.f41046f.y0(this.f41060u, this.v, this.f41062x, this.f41061w);
                                ImageReceiver imageReceiver6 = this.f41046f;
                                imageReceiver6.R0 = imageReceiver.R0;
                                imageReceiver6.L0(imageReceiver.E());
                                this.f41047g.L0(imageReceiver.E());
                                this.f41047g.R0 = imageReceiver.R0;
                                ((FrameLayout) this.d.f23621c).setVisibility(8);
                            }
                        } else {
                            i14 = i15;
                            i11 = i16;
                        }
                        os0 os0Var2 = this.E;
                        if (os0Var2 != null) {
                            os0Var2.H0(jjVar);
                        }
                        this.P = 0.0f;
                        i12 = i14;
                    } else {
                        i11 = i16;
                        i12 = i15;
                    }
                    float x11 = motionEvent.getX(i12);
                    int i21 = i11;
                    float y10 = motionEvent.getY(i12);
                    float x12 = this.G - ((motionEvent.getX(i21) + x11) / 2.0f);
                    float y11 = this.H - ((motionEvent.getY(i21) + y10) / 2.0f);
                    float f14 = -x12;
                    float f15 = this.O;
                    this.J = f14 / f15;
                    this.K = (-y11) / f15;
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
            this.f41058s = x13;
            this.G = x13;
            float y12 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
            this.f41059t = y12;
            this.H = y12;
            this.O = 1.0f;
            this.M = motionEvent.getPointerId(0);
            this.N = motionEvent.getPointerId(1);
            this.L = true;
        }
        return f(viewGroup);
    }

    public final void b() {
        if (this.f41053n) {
            os0 os0Var = this.E;
            if (os0Var != null) {
                os0Var.I(this.D);
            }
            this.f41053n = false;
        }
        org.telegram.ui.Cells.y5 y5Var = this.d;
        if (y5Var != null && y5Var.getParent() != null) {
            this.f41043a.removeView(this.d);
            this.d.f23620b.getImageReceiver().f();
            nh.h hVar = this.f41050k;
            if (hVar != null) {
                hVar.b(this.d);
                this.f41050k = null;
            }
            ImageReceiver imageReceiver = this.f41046f;
            if (imageReceiver != null) {
                Drawable t10 = imageReceiver.t();
                if (t10 instanceof org.telegram.ui.Components.s5) {
                    ((org.telegram.ui.Components.s5) t10).w(this.d);
                }
            }
        }
        View view = this.e;
        if (view != null) {
            view.invalidate();
            this.e = null;
        }
        ImageReceiver imageReceiver2 = this.f41046f;
        if (imageReceiver2 != null) {
            imageReceiver2.R();
            this.f41046f.f();
            this.f41046f = null;
        }
        ImageReceiver imageReceiver3 = this.f41047g;
        if (imageReceiver3 != null) {
            imageReceiver3.R();
            this.f41047g.f();
            this.f41047g = null;
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
        if (this.C == null && this.f41053n) {
            if (!this.f41045c && !i()) {
                b();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.C = ofFloat;
            ofFloat.addUpdateListener(new a3(this, 23));
            this.C.addListener(new ns0(this, 0));
            this.C.setDuration(220L);
            this.C.setInterpolator(org.telegram.ui.Components.gr.f26495f);
            this.C.start();
        }
    }

    public void e() {
        View view;
        if (this.f41045c && (view = this.e) != null) {
            view.invalidate();
        }
        org.telegram.ui.Cells.y5 y5Var = this.d;
        if (y5Var != null) {
            y5Var.invalidate();
        }
    }

    public final boolean f(View view) {
        if (this.f41053n && view == this.e) {
            return true;
        }
        return false;
    }

    public final boolean g(MotionEvent motionEvent) {
        if (i() && this.e != null) {
            motionEvent.offsetLocation(-this.f41056q, -this.f41057r);
            return this.e.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void h(th thVar) {
        this.F = thVar;
    }

    public final boolean i() {
        float f7 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (View view = this.e; view != this.f41043a; view = (View) view.getParent()) {
            if (view == null) {
                return false;
            }
            f10 += view.getLeft();
            f11 += view.getTop();
            if (!(view.getParent() instanceof View)) {
                break;
            }
        }
        float f12 = 0.0f;
        for (View view2 = this.e; view2 != this.f41044b; view2 = (View) view2.getParent()) {
            if (view2 == null) {
                return false;
            }
            f7 += view2.getLeft();
            f12 += view2.getTop();
        }
        this.f41056q = f7;
        this.f41057r = f12;
        this.f41054o = f10;
        this.f41055p = f11;
        return true;
    }

    public boolean j(View view, ImageReceiver imageReceiver) {
        if (!this.f41045c) {
            if (imageReceiver.t() instanceof org.telegram.ui.Components.s5) {
                AnimatedFileDrawableStream animatedFileDrawableStream = ((org.telegram.ui.Components.s5) imageReceiver.t()).f30151u0;
                if (animatedFileDrawableStream != null && animatedFileDrawableStream.f14350s) {
                    return false;
                }
                return true;
            } else if (imageReceiver.S == null && imageReceiver.f14387j0 == null) {
                Drawable drawable = imageReceiver.m0;
                if (!(drawable instanceof org.telegram.ui.Components.g61)) {
                    if (drawable == null || (drawable instanceof org.telegram.ui.Components.r8) || imageReceiver.Q != null || imageReceiver.f14383h0 != null) {
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

    public qs0() {
        this.f41047g = new ImageReceiver(null);
        this.h = new ImageReceiver(null);
        this.f41049j = new nh.i();
        this.f41051l = new Path();
        this.f41052m = new float[8];
        this.Q = new float[2];
        this.f41043a = null;
        this.f41044b = null;
        this.f41045c = true;
    }

    public void c(Canvas canvas, float f7, float f10, float f11, float f12, float f13) {
    }
}
