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
public final class w1 extends FrameLayout implements org.telegram.ui.Cells.i9 {
    public final p50 f52901a;
    public final e4 f52902b;
    public Drawable f52903c;
    public z2 d;
    public z2 f52904e;
    public final ImageReceiver f52905f;
    public boolean h;
    public int f52906n;
    public int f52907r;
    public int f52908s;
    public boolean f52909w;
    public int f52910x;
    public TL_iv.pageBlockMap f52911y;

    public w1(Context context, p50 p50Var, e4 e4Var) {
        super(context);
        this.f52901a = p50Var;
        this.f52902b = e4Var;
        setWillNotDraw(false);
        this.f52905f = new ImageReceiver(this);
    }

    @Override
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.d;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
        z2 z2Var2 = this.f52904e;
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
        z2 z2Var2 = this.f52904e;
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
        z2 z2Var2 = this.f52904e;
        if (z2Var2 != null) {
            z2Var2.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f52911y == null) {
            return;
        }
        Paint paint = org.telegram.ui.ActionBar.m6.S1;
        int i7 = org.telegram.ui.ActionBar.m6.f29411gf;
        p50 p50Var = this.f52901a;
        ((g4) p50Var).getClass();
        paint.setColor(org.telegram.ui.ActionBar.m6.v0(i7));
        ImageReceiver imageReceiver = this.f52905f;
        canvas.drawRect(imageReceiver.L0, imageReceiver.M0, imageReceiver.y(), imageReceiver.A(), org.telegram.ui.ActionBar.m6.S1);
        float r10 = imageReceiver.r();
        Drawable[] drawableArr = org.telegram.ui.ActionBar.m6.S4;
        int i10 = 0;
        int intrinsicWidth = (int) (r10 - (drawableArr[0].getIntrinsicWidth() / 2));
        int s5 = (int) (imageReceiver.s() - (drawableArr[0].getIntrinsicHeight() / 2));
        Drawable drawable = drawableArr[0];
        drawable.setBounds(intrinsicWidth, s5, drawable.getIntrinsicWidth() + intrinsicWidth, drawableArr[0].getIntrinsicHeight() + s5);
        drawableArr[0].draw(canvas);
        imageReceiver.h(canvas, null);
        if (this.f52910x == 2 && imageReceiver.L()) {
            if (this.f52903c == null) {
                this.f52903c = getContext().getDrawable(2131231647).mutate();
            }
            int intrinsicWidth2 = (int) (this.f52903c.getIntrinsicWidth() * 0.8f);
            int intrinsicHeight = (int) (this.f52903c.getIntrinsicHeight() * 0.8f);
            int A = (int) com.google.android.gms.internal.vision.e2.A(imageReceiver.N0, intrinsicWidth2, 2.0f, imageReceiver.L0);
            int i11 = (int) (((imageReceiver.O0 / 2.0f) - intrinsicHeight) + imageReceiver.M0);
            this.f52903c.setAlpha((int) (imageReceiver.f22636i1 * 255.0f));
            this.f52903c.setBounds(A, i11, intrinsicWidth2 + A, intrinsicHeight + i11);
            this.f52903c.draw(canvas);
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f52906n, this.f52907r);
            g4.t(p50Var, canvas, this, 0);
            this.d.d(canvas, this);
            canvas.restore();
            i10 = 1;
        }
        if (this.f52904e != null) {
            canvas.save();
            canvas.translate(this.f52906n, this.f52907r + this.f52908s);
            g4.t(p50Var, canvas, this, i10);
            this.f52904e.d(canvas, this);
            canvas.restore();
        }
        g4.s(canvas, p50Var, this.f52911y, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.hd.N0(2131748497, null));
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
        TL_iv.pageBlockMap pageblockmap = this.f52911y;
        if (pageblockmap != null) {
            if (pageblockmap.level > 0) {
                i13 = org.telegram.messenger.g0.L(18.0f) + org.telegram.messenger.g0.L(i12 * 14);
                this.f52906n = i13;
                i14 = org.telegram.messenger.o10.x(18.0f, i13, size);
                L = i14;
            } else {
                this.f52906n = org.telegram.messenger.g0.L(18.0f);
                i13 = 0;
                L = size - org.telegram.messenger.g0.L(36.0f);
                i14 = size;
            }
            TL_iv.pageBlockMap pageblockmap2 = this.f52911y;
            int i16 = (int) ((i14 / pageblockmap2.f28623w) * pageblockmap2.h);
            Point point = org.telegram.messenger.g0.f24010q;
            int max = (int) ((Math.max(point.x, point.y) - org.telegram.messenger.g0.L(56.0f)) * 0.9f);
            if (i16 > max) {
                TL_iv.pageBlockMap pageblockmap3 = this.f52911y;
                i14 = (int) ((max / pageblockmap3.h) * pageblockmap3.f28623w);
                i13 += ((size - i13) - i14) / 2;
                i15 = max;
            } else {
                i15 = i16;
            }
            float f11 = i13;
            if (!this.h && this.f52911y.level <= 0) {
                f10 = org.telegram.messenger.g0.L(8.0f);
            } else {
                f10 = 0.0f;
            }
            float f12 = i14;
            float f13 = i15;
            ImageReceiver imageReceiver = this.f52905f;
            imageReceiver.y0(f11, f10, f12, f13);
            int i17 = ((g4) this.f52901a).Y;
            TLRPC.GeoPoint geoPoint = this.f52911y.geo;
            double d = geoPoint.lat;
            double d2 = geoPoint._long;
            float f14 = org.telegram.messenger.g0.f24009p;
            String e02 = org.telegram.messenger.g0.e0(i17, d, d2, (int) (f12 / f14), (int) (f13 / f14), true, 15, -1);
            TLRPC.GeoPoint geoPoint2 = this.f52911y.geo;
            float f15 = org.telegram.messenger.g0.f24009p;
            org.telegram.messenger.i20 b10 = org.telegram.messenger.i20.b(geoPoint2, (int) (f12 / f15), (int) (f13 / f15), 15, Math.min(2, (int) Math.ceil(f15)));
            int i18 = org.telegram.messenger.np.u1(i17).f25892p3;
            this.f52910x = i18;
            e4 e4Var = this.f52902b;
            if (i18 == 2) {
                org.telegram.messenger.gc p10 = org.telegram.messenger.gc.p(b10);
                if (e4Var != null) {
                    webPage = e4Var.F;
                } else {
                    webPage = null;
                }
                imageReceiver.q0(p10, null, null, null, webPage, 0);
            } else {
                imageReceiver.o0(e02, null, null, null, 0L);
            }
            int L2 = (int) (imageReceiver.M0 + imageReceiver.O0 + org.telegram.messenger.g0.L(8.0f));
            this.f52907r = L2;
            TL_iv.pageBlockMap pageblockmap4 = this.f52911y;
            z2 o4 = g4.o(this.f52901a, this, null, pageblockmap4.caption.text, L, L2, pageblockmap4, this.f52902b);
            this.d = o4;
            if (o4 != null) {
                int height = this.d.d.getHeight() + org.telegram.messenger.g0.L(4.0f);
                this.f52908s = height;
                i15 = org.telegram.messenger.f3.C(4.0f, height, i15);
                z2 z2Var = this.d;
                z2Var.f54343s = this.f52906n;
                z2Var.f54344w = this.f52907r;
            }
            int i19 = i15;
            TL_iv.pageBlockMap pageblockmap5 = this.f52911y;
            TL_iv.RichText richText = pageblockmap5.caption.credit;
            if (e4Var != null && e4Var.H) {
                alignment = org.telegram.ui.Components.zu0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            z2 n10 = g4.n(this.f52901a, this, null, richText, L, 0, pageblockmap5, alignment, 0, this.f52902b);
            this.f52904e = n10;
            if (n10 != null) {
                i19 += this.f52904e.d.getHeight() + org.telegram.messenger.g0.L(4.0f);
                z2 z2Var2 = this.f52904e;
                z2Var2.f54343s = this.f52906n;
                z2Var2.f54344w = this.f52907r + this.f52908s;
            }
            if (!this.h && this.f52911y.level <= 0) {
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
        if (motionEvent.getAction() == 0 && this.f52905f.O(x10, y10)) {
            this.f52909w = true;
        } else if (motionEvent.getAction() == 1 && this.f52909w) {
            this.f52909w = false;
            try {
                TLRPC.GeoPoint geoPoint = this.f52911y.geo;
                double d = geoPoint.lat;
                double d2 = geoPoint._long;
                Context context = getContext();
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        } else if (motionEvent.getAction() == 3) {
            this.f52909w = false;
        }
        if (!this.f52909w) {
            if (!g4.j(this.f52901a, this.f52902b, motionEvent, this, this.d, this.f52906n, this.f52907r)) {
                if (!g4.j(this.f52901a, this.f52902b, motionEvent, this, this.f52904e, this.f52906n, this.f52907r + this.f52908s) && !super.onTouchEvent(motionEvent)) {
                    return false;
                }
            }
        }
        return true;
    }
}
