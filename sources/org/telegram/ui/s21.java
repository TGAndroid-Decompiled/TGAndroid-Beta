package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class s21 extends View {
    public boolean D;
    public Drawable E;
    public Rect F;
    public float G;
    public boolean H;
    public ValueAnimator I;
    public r21 J;
    public org.telegram.messenger.g6 K;
    public boolean L;
    public boolean M;
    public float N;
    public float O;
    public int P;
    public boolean Q;
    public float R;
    public float S;
    public float T;
    public final n40 U;
    public final i31 V;
    public boolean f41356a;
    public boolean f41357b;
    public int f41358c;
    public TLRPC.Document d;
    public org.telegram.ui.Components.o5 e;
    public final org.telegram.messenger.jc[] f41359f;
    public ImageReceiver h;
    public final ImageReceiver f41360n;
    public ImageReceiver f41361r;
    public boolean f41362s;
    public TL_stars.TL_starGiftUnique f41363w;
    public Integer f41364x;
    public sg.o0 f41365y;

    public s21(i31 i31Var, Context context) {
        super(context);
        this.V = i31Var;
        this.f41356a = false;
        this.f41357b = false;
        this.f41359f = new org.telegram.messenger.jc[2];
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f41360n = imageReceiver;
        this.T = 1.0f;
        this.U = new n40(this, 1);
        imageReceiver.f14420y = true;
        setFocusable(true);
    }

    public final void a(View view) {
        if (this.h == null) {
            ImageReceiver imageReceiver = new ImageReceiver(view);
            this.h = imageReceiver;
            imageReceiver.E0(7);
            if (this.H) {
                this.h.P();
            }
            this.h.R0 = true;
        }
    }

    public final void b() {
        Paint paint;
        r21 r21Var = this.J;
        if (r21Var == null) {
            Context context = getContext();
            int i10 = kg.l1.L;
            this.J = new r21(this, context);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(16.66f), 1073741824);
            this.J.measure(makeMeasureSpec, makeMeasureSpec);
            r21 r21Var2 = this.J;
            r21Var2.layout(0, 0, r21Var2.getMeasuredWidth(), this.J.getMeasuredHeight());
            return;
        }
        r21Var.h = false;
        r21Var.f11172n = -1;
        if (r21Var.f11168a == 2 && (paint = r21Var.f11177y) != null) {
            paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20872a7, false));
        }
    }

    public final void c(TLRPC.Document document, l21 l21Var) {
        String str;
        this.d = document;
        a(l21Var);
        org.telegram.messenger.c00 f7 = org.telegram.messenger.v5.f(document, org.telegram.ui.ActionBar.t6.f21095m6, 0.2f, null);
        if (this.V.W == 6) {
            ImageReceiver imageReceiver = this.h;
            org.telegram.messenger.ic b10 = org.telegram.messenger.ic.b(document);
            if (!org.telegram.messenger.sc.e(16388)) {
                str = "34_34_firstframe";
            } else {
                str = "34_34";
            }
            imageReceiver.r0(b10, str, null, null, f7, document.size, null, document, 0);
        } else {
            this.h.r0(org.telegram.messenger.ic.b(document), "100_100_firstframe", null, null, f7, 0L, "tgs", document, 0);
        }
        this.Q = true;
        this.e = null;
    }

    public final void d(boolean z10, boolean z11) {
        float f7;
        if (this.L != z10) {
            this.L = z10;
            if (!z11) {
                float f10 = 0.0f;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                this.R = f7;
                if (z10) {
                    f10 = 1.0f;
                }
                this.S = f10;
            }
        }
    }

    public final void e(boolean z10, boolean z11) {
        if (!this.L && z10 && z11 && this.V.W != 14) {
            this.M = true;
            this.S = 1.0f;
            this.R = 1.0f;
            ValueAnimator valueAnimator = this.I;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.I.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.N, 1.6f, 0.7f);
            this.I = ofFloat;
            ofFloat.addUpdateListener(new p21(this, 2));
            this.I.addListener(new q21(this, 2));
            this.I.setInterpolator(new LinearInterpolator());
            this.I.setDuration(200L);
            this.I.start();
            return;
        }
        this.M = false;
        d(z10, z11);
    }

    public final void f() {
        if (this.L && this.V.W != 14) {
            ValueAnimator valueAnimator = this.I;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.I.cancel();
            }
            this.N = 1.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.I = ofFloat;
            ofFloat.addUpdateListener(new p21(this, 1));
            this.I.addListener(new q21(this, 1));
            org.telegram.messenger.z20.j(5.0f, this.I);
            this.I.setDuration(350L);
            this.I.start();
            d(false, true);
        }
    }

    public float getAnimatedScale() {
        return this.T;
    }

    @Override
    public final void invalidate() {
        if (sg.e0.f48320b || getParent() == null) {
            return;
        }
        ((View) getParent()).invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.H) {
            return;
        }
        this.H = true;
        Drawable drawable = this.E;
        if (drawable instanceof org.telegram.ui.Components.f5) {
            ((org.telegram.ui.Components.f5) drawable).b(this.U);
        }
        ImageReceiver imageReceiver = this.h;
        if (imageReceiver != null) {
            imageReceiver.H0((View) getParent());
            this.h.P();
        }
        this.f41360n.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.H) {
            return;
        }
        this.H = false;
        Drawable drawable = this.E;
        if (drawable instanceof org.telegram.ui.Components.f5) {
            ((org.telegram.ui.Components.f5) drawable).o(this.U);
            ag.c2 c2Var = ((org.telegram.ui.Components.f5) this.E).f25975k;
            if (c2Var != null) {
                c2Var.g0(false);
            }
        }
        ImageReceiver imageReceiver = this.h;
        if (imageReceiver != null) {
            imageReceiver.R();
            this.h.g0(false);
        }
        this.f41360n.R();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        org.telegram.ui.Components.o5 o5Var;
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String str2 = null;
        if (this.f41356a) {
            str2 = org.telegram.messenger.cd.L0(2131746303, null);
        } else {
            sg.o0 o0Var = this.f41365y;
            if (o0Var != null && (str = o0Var.f48434f) != null) {
                str2 = str;
            } else {
                TLRPC.Document document = this.d;
                if (document == null && (o5Var = this.e) != null && (document = o5Var.document) == null) {
                    document = org.telegram.ui.Components.f5.e(this.V.V, o5Var.getDocumentId());
                }
                if (document != null) {
                    str2 = org.telegram.messenger.jj.V(document, null, null);
                }
            }
        }
        if (str2 != null) {
            accessibilityNodeInfo.setContentDescription(str2);
        }
        accessibilityNodeInfo.setSelected(this.L);
        accessibilityNodeInfo.setClickable(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
    }

    public void setAnimatedScale(float f7) {
        this.T = f7;
    }

    public void setDrawable(Drawable drawable) {
        Drawable drawable2 = this.E;
        if (drawable2 != drawable) {
            boolean z10 = this.H;
            n40 n40Var = this.U;
            if (z10 && drawable2 != null && (drawable2 instanceof org.telegram.ui.Components.f5)) {
                ((org.telegram.ui.Components.f5) drawable2).o(n40Var);
            }
            this.E = drawable;
            if (this.H && (drawable instanceof org.telegram.ui.Components.f5)) {
                ((org.telegram.ui.Components.f5) drawable).b(n40Var);
            }
        }
    }

    public void setEmojicon(String str) {
        if (TextUtils.isEmpty(str)) {
            this.K = null;
        } else {
            this.K = org.telegram.messenger.k6.g(str);
        }
    }

    @Override
    public void setPressed(boolean z10) {
        ValueAnimator valueAnimator;
        if (isPressed() != z10) {
            super.setPressed(z10);
            invalidate();
            if (z10 && (valueAnimator = this.I) != null) {
                valueAnimator.removeAllListeners();
                this.I.cancel();
            }
            if (!z10) {
                float f7 = this.N;
                if (f7 != 0.0f && this.V.W != 14) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, 0.0f);
                    this.I = ofFloat;
                    ofFloat.addUpdateListener(new p21(this, 0));
                    this.I.addListener(new q21(this, 0));
                    org.telegram.messenger.z20.j(5.0f, this.I);
                    this.I.setDuration(350L);
                    this.I.start();
                }
            }
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (sg.e0.f48320b) {
            return;
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
