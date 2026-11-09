package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class w1 extends FrameLayout implements org.telegram.ui.Cells.h9 {
    public final q50 f50821a;
    public final e4 f50822b;
    public Drawable f50823c;
    public z2 d;
    public z2 f50824e;
    public final ImageReceiver f50825f;
    public boolean h;
    public int f50826n;
    public int f50827r;
    public int f50828s;
    public boolean f50829w;
    public int f50830x;
    public TL_iv.pageBlockMap f50831y;

    public w1(Context context, q50 q50Var, e4 e4Var) {
        super(context);
        this.f50821a = q50Var;
        this.f50822b = e4Var;
        setWillNotDraw(false);
        this.f50825f = new ImageReceiver(this);
    }

    @Override
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.d;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
        z2 z2Var2 = this.f50824e;
        if (z2Var2 != null) {
            arrayList.add(z2Var2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.d;
        if (z2Var != null) {
            z2Var.i(this);
        }
        z2 z2Var2 = this.f50824e;
        if (z2Var2 != null) {
            z2Var2.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z2 z2Var = this.d;
        if (z2Var != null) {
            z2Var.f(this);
        }
        z2 z2Var2 = this.f50824e;
        if (z2Var2 != null) {
            z2Var2.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f50831y == null) {
            return;
        }
        Paint paint = org.telegram.ui.ActionBar.l6.S1;
        int i7 = org.telegram.ui.ActionBar.l6.f27873df;
        q50 q50Var = this.f50821a;
        ((g4) q50Var).getClass();
        paint.setColor(org.telegram.ui.ActionBar.l6.v0(i7));
        ImageReceiver imageReceiver = this.f50825f;
        canvas.drawRect(imageReceiver.K0, imageReceiver.L0, imageReceiver.y(), imageReceiver.A(), org.telegram.ui.ActionBar.l6.S1);
        float r10 = imageReceiver.r();
        Drawable[] drawableArr = org.telegram.ui.ActionBar.l6.S4;
        int i10 = 0;
        int intrinsicWidth = (int) (r10 - (drawableArr[0].getIntrinsicWidth() / 2));
        int s5 = (int) (imageReceiver.s() - (drawableArr[0].getIntrinsicHeight() / 2));
        Drawable drawable = drawableArr[0];
        drawable.setBounds(intrinsicWidth, s5, drawable.getIntrinsicWidth() + intrinsicWidth, drawableArr[0].getIntrinsicHeight() + s5);
        drawableArr[0].draw(canvas);
        imageReceiver.h(canvas, null);
        if (this.f50830x == 2 && imageReceiver.L()) {
            if (this.f50823c == null) {
                this.f50823c = getContext().getDrawable(2131231646).mutate();
            }
            int intrinsicWidth2 = (int) (this.f50823c.getIntrinsicWidth() * 0.8f);
            int intrinsicHeight = (int) (this.f50823c.getIntrinsicHeight() * 0.8f);
            int A = (int) com.google.android.recaptcha.internal.a.A(imageReceiver.M0, intrinsicWidth2, 2.0f, imageReceiver.K0);
            int i11 = (int) (((imageReceiver.N0 / 2.0f) - intrinsicHeight) + imageReceiver.L0);
            this.f50823c.setAlpha((int) (imageReceiver.f21197h1 * 255.0f));
            this.f50823c.setBounds(A, i11, intrinsicWidth2 + A, intrinsicHeight + i11);
            this.f50823c.draw(canvas);
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f50826n, this.f50827r);
            g4.t(q50Var, canvas, this, 0);
            this.d.d(canvas, this);
            canvas.restore();
            i10 = 1;
        }
        if (this.f50824e != null) {
            canvas.save();
            canvas.translate(this.f50826n, this.f50827r + this.f50828s);
            g4.t(q50Var, canvas, this, i10);
            this.f50824e.d(canvas, this);
            canvas.restore();
        }
        g4.s(canvas, q50Var, this.f50831y, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.id.M0(2131748690, null));
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2.toString());
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        int i13;
        int L;
        int i14;
        int i15;
        float f10;
        Layout.Alignment alignment;
        TLRPC.WebPage webPage;
        int size = View.MeasureSpec.getSize(i7);
        TL_iv.pageBlockMap pageblockmap = this.f50831y;
        if (pageblockmap != null) {
            if (pageblockmap.level > 0) {
                i13 = org.telegram.messenger.g0.L(18.0f) + org.telegram.messenger.g0.L(i12 * 14);
                this.f50826n = i13;
                i14 = org.telegram.messenger.camera.q.w(18.0f, i13, size);
                L = i14;
            } else {
                this.f50826n = org.telegram.messenger.g0.L(18.0f);
                i13 = 0;
                L = size - org.telegram.messenger.g0.L(36.0f);
                i14 = size;
            }
            TL_iv.pageBlockMap pageblockmap2 = this.f50831y;
            int i16 = (int) ((i14 / pageblockmap2.f27181w) * pageblockmap2.h);
            Point point = org.telegram.messenger.g0.f22563q;
            int max = (int) ((Math.max(point.x, point.y) - org.telegram.messenger.g0.L(56.0f)) * 0.9f);
            if (i16 > max) {
                TL_iv.pageBlockMap pageblockmap3 = this.f50831y;
                i14 = (int) ((max / pageblockmap3.h) * pageblockmap3.f27181w);
                i13 += ((size - i13) - i14) / 2;
                i15 = max;
            } else {
                i15 = i16;
            }
            float f11 = i13;
            if (!this.h && this.f50831y.level <= 0) {
                f10 = org.telegram.messenger.g0.L(8.0f);
            } else {
                f10 = 0.0f;
            }
            float f12 = i14;
            float f13 = i15;
            ImageReceiver imageReceiver = this.f50825f;
            imageReceiver.y0(f11, f10, f12, f13);
            int i17 = ((g4) this.f50821a).X;
            TLRPC.GeoPoint geoPoint = this.f50831y.geo;
            double d = geoPoint.lat;
            double d2 = geoPoint._long;
            float f14 = org.telegram.messenger.g0.f22562p;
            String e02 = org.telegram.messenger.g0.e0(i17, d, d2, (int) (f12 / f14), (int) (f13 / f14), true, 15, -1);
            TLRPC.GeoPoint geoPoint2 = this.f50831y.geo;
            float f15 = org.telegram.messenger.g0.f22562p;
            org.telegram.messenger.m20 b10 = org.telegram.messenger.m20.b(geoPoint2, (int) (f12 / f15), (int) (f13 / f15), 15, Math.min(2, (int) Math.ceil(f15)));
            int i18 = org.telegram.messenger.qp.s1(i17).f24838m3;
            this.f50830x = i18;
            e4 e4Var = this.f50822b;
            if (i18 == 2) {
                org.telegram.messenger.hc p10 = org.telegram.messenger.hc.p(b10);
                if (e4Var != null) {
                    webPage = e4Var.E;
                } else {
                    webPage = null;
                }
                imageReceiver.q0(p10, null, null, null, webPage, 0);
            } else {
                imageReceiver.o0(e02, null, null, null, 0L);
            }
            int L2 = (int) (imageReceiver.L0 + imageReceiver.N0 + org.telegram.messenger.g0.L(8.0f));
            this.f50827r = L2;
            TL_iv.pageBlockMap pageblockmap4 = this.f50831y;
            z2 o4 = g4.o(this.f50821a, this, null, pageblockmap4.caption.text, L, L2, pageblockmap4, this.f50822b);
            this.d = o4;
            if (o4 != null) {
                int height = this.d.d.getHeight() + org.telegram.messenger.g0.L(4.0f);
                this.f50828s = height;
                i15 = org.telegram.messenger.k5.C(4.0f, height, i15);
                z2 z2Var = this.d;
                z2Var.f52397s = this.f50826n;
                z2Var.f52398w = this.f50827r;
            }
            int i19 = i15;
            TL_iv.pageBlockMap pageblockmap5 = this.f50831y;
            TL_iv.RichText richText = pageblockmap5.caption.credit;
            if (e4Var != null && e4Var.G) {
                alignment = org.telegram.ui.Components.ou0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            z2 n10 = g4.n(this.f50821a, this, null, richText, L, 0, pageblockmap5, alignment, 0, this.f50822b);
            this.f50824e = n10;
            if (n10 != null) {
                i19 += this.f50824e.d.getHeight() + org.telegram.messenger.g0.L(4.0f);
                z2 z2Var2 = this.f50824e;
                z2Var2.f52397s = this.f50826n;
                z2Var2.f52398w = this.f50827r + this.f50828s;
            }
            if (!this.h && this.f50831y.level <= 0) {
                i19 += org.telegram.messenger.g0.L(8.0f);
            }
            i11 = org.telegram.messenger.g0.L(8.0f) + i19;
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (motionEvent.getAction() == 0 && this.f50825f.O(x10, y10)) {
            this.f50829w = true;
        } else if (motionEvent.getAction() == 1 && this.f50829w) {
            this.f50829w = false;
            try {
                TLRPC.GeoPoint geoPoint = this.f50831y.geo;
                double d = geoPoint.lat;
                double d2 = geoPoint._long;
                Context context = getContext();
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        } else if (motionEvent.getAction() == 3) {
            this.f50829w = false;
        }
        if (!this.f50829w) {
            if (!g4.j(this.f50821a, this.f50822b, motionEvent, this, this.d, this.f50826n, this.f50827r)) {
                if (!g4.j(this.f50821a, this.f50822b, motionEvent, this, this.f50824e, this.f50826n, this.f50827r + this.f50828s) && !super.onTouchEvent(motionEvent)) {
                    return false;
                }
            }
        }
        return true;
    }
}
