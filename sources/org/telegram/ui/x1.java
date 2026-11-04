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
public final class x1 extends FrameLayout implements org.telegram.ui.Cells.g9 {
    public final i50 f51678a;
    public final g4 f51679b;
    public Drawable f51680c;
    public a3 d;
    public a3 f51681e;
    public final ImageReceiver f51682f;
    public boolean h;
    public int f51683n;
    public int f51684r;
    public int f51685s;
    public boolean f51686w;
    public int f51687x;
    public TL_iv.pageBlockMap f51688y;

    public x1(Context context, i50 i50Var, g4 g4Var) {
        super(context);
        this.f51678a = i50Var;
        this.f51679b = g4Var;
        setWillNotDraw(false);
        this.f51682f = new ImageReceiver(this);
    }

    @Override
    public final void k(ArrayList arrayList) {
        a3 a3Var = this.d;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
        a3 a3Var2 = this.f51681e;
        if (a3Var2 != null) {
            arrayList.add(a3Var2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.d;
        if (a3Var != null) {
            a3Var.i(this);
        }
        a3 a3Var2 = this.f51681e;
        if (a3Var2 != null) {
            a3Var2.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.d;
        if (a3Var != null) {
            a3Var.f(this);
        }
        a3 a3Var2 = this.f51681e;
        if (a3Var2 != null) {
            a3Var2.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f51688y == null) {
            return;
        }
        Paint paint = org.telegram.ui.ActionBar.k6.S1;
        int i3 = org.telegram.ui.ActionBar.k6.f27887df;
        i50 i50Var = this.f51678a;
        ((i4) i50Var).getClass();
        paint.setColor(org.telegram.ui.ActionBar.k6.v0(i3));
        ImageReceiver imageReceiver = this.f51682f;
        canvas.drawRect(imageReceiver.L0, imageReceiver.M0, imageReceiver.y(), imageReceiver.A(), org.telegram.ui.ActionBar.k6.S1);
        float r5 = imageReceiver.r();
        Drawable[] drawableArr = org.telegram.ui.ActionBar.k6.S4;
        int i10 = 0;
        int intrinsicWidth = (int) (r5 - (drawableArr[0].getIntrinsicWidth() / 2));
        int s6 = (int) (imageReceiver.s() - (drawableArr[0].getIntrinsicHeight() / 2));
        Drawable drawable = drawableArr[0];
        drawable.setBounds(intrinsicWidth, s6, drawable.getIntrinsicWidth() + intrinsicWidth, drawableArr[0].getIntrinsicHeight() + s6);
        drawableArr[0].draw(canvas);
        imageReceiver.h(canvas, null);
        if (this.f51687x == 2 && imageReceiver.L()) {
            if (this.f51680c == null) {
                this.f51680c = getContext().getDrawable(2131231646).mutate();
            }
            int intrinsicWidth2 = (int) (this.f51680c.getIntrinsicWidth() * 0.8f);
            int intrinsicHeight = (int) (this.f51680c.getIntrinsicHeight() * 0.8f);
            int z10 = (int) com.google.android.recaptcha.internal.a.z(imageReceiver.N0, intrinsicWidth2, 2.0f, imageReceiver.L0);
            int i11 = (int) (((imageReceiver.O0 / 2.0f) - intrinsicHeight) + imageReceiver.M0);
            this.f51680c.setAlpha((int) (imageReceiver.f21249i1 * 255.0f));
            this.f51680c.setBounds(z10, i11, intrinsicWidth2 + z10, intrinsicHeight + i11);
            this.f51680c.draw(canvas);
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f51683n, this.f51684r);
            i4.t(i50Var, canvas, this, 0);
            this.d.d(canvas, this);
            canvas.restore();
            i10 = 1;
        }
        if (this.f51681e != null) {
            canvas.save();
            canvas.translate(this.f51683n, this.f51684r + this.f51685s);
            i4.t(i50Var, canvas, this, i10);
            this.f51681e.d(canvas, this);
            canvas.restore();
        }
        i4.s(canvas, i50Var, this.f51688y, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.bd.M0(2131748698, null));
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2.toString());
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        int i12;
        int i13;
        int L;
        int i14;
        int i15;
        float f10;
        Layout.Alignment alignment;
        TLRPC.WebPage webPage;
        int size = View.MeasureSpec.getSize(i3);
        TL_iv.pageBlockMap pageblockmap = this.f51688y;
        if (pageblockmap != null) {
            if (pageblockmap.level > 0) {
                i13 = org.telegram.messenger.g0.L(18.0f) + org.telegram.messenger.g0.L(i12 * 14);
                this.f51683n = i13;
                i14 = org.telegram.messenger.camera.q.w(18.0f, i13, size);
                L = i14;
            } else {
                this.f51683n = org.telegram.messenger.g0.L(18.0f);
                i13 = 0;
                L = size - org.telegram.messenger.g0.L(36.0f);
                i14 = size;
            }
            TL_iv.pageBlockMap pageblockmap2 = this.f51688y;
            int i16 = (int) ((i14 / pageblockmap2.f27226w) * pageblockmap2.h);
            Point point = org.telegram.messenger.g0.f22608q;
            int max = (int) ((Math.max(point.x, point.y) - org.telegram.messenger.g0.L(56.0f)) * 0.9f);
            if (i16 > max) {
                TL_iv.pageBlockMap pageblockmap3 = this.f51688y;
                i14 = (int) ((max / pageblockmap3.h) * pageblockmap3.f27226w);
                i13 += ((size - i13) - i14) / 2;
                i15 = max;
            } else {
                i15 = i16;
            }
            float f11 = i13;
            if (!this.h && this.f51688y.level <= 0) {
                f10 = org.telegram.messenger.g0.L(8.0f);
            } else {
                f10 = 0.0f;
            }
            float f12 = i14;
            float f13 = i15;
            ImageReceiver imageReceiver = this.f51682f;
            imageReceiver.y0(f11, f10, f12, f13);
            int i17 = ((i4) this.f51678a).Y;
            TLRPC.GeoPoint geoPoint = this.f51688y.geo;
            double d = geoPoint.lat;
            double d10 = geoPoint._long;
            float f14 = org.telegram.messenger.g0.f22607p;
            String e02 = org.telegram.messenger.g0.e0(i17, d, d10, (int) (f12 / f14), (int) (f13 / f14), true, 15, -1);
            TLRPC.GeoPoint geoPoint2 = this.f51688y.geo;
            float f15 = org.telegram.messenger.g0.f22607p;
            org.telegram.messenger.e20 b10 = org.telegram.messenger.e20.b(geoPoint2, (int) (f12 / f15), (int) (f13 / f15), 15, Math.min(2, (int) Math.ceil(f15)));
            int i18 = org.telegram.messenger.hp.s1(i17).f23072n3;
            this.f51687x = i18;
            g4 g4Var = this.f51679b;
            if (i18 == 2) {
                org.telegram.messenger.ac p10 = org.telegram.messenger.ac.p(b10);
                if (g4Var != null) {
                    webPage = g4Var.F;
                } else {
                    webPage = null;
                }
                imageReceiver.q0(p10, null, null, null, webPage, 0);
            } else {
                imageReceiver.o0(e02, null, null, null, 0L);
            }
            int L2 = (int) (imageReceiver.M0 + imageReceiver.O0 + org.telegram.messenger.g0.L(8.0f));
            this.f51684r = L2;
            TL_iv.pageBlockMap pageblockmap4 = this.f51688y;
            a3 o10 = i4.o(this.f51678a, this, null, pageblockmap4.caption.text, L, L2, pageblockmap4, this.f51679b);
            this.d = o10;
            if (o10 != null) {
                int height = this.d.d.getHeight() + org.telegram.messenger.g0.L(4.0f);
                this.f51685s = height;
                i15 = org.telegram.messenger.k5.C(4.0f, height, i15);
                a3 a3Var = this.d;
                a3Var.f43579s = this.f51683n;
                a3Var.f43580w = this.f51684r;
            }
            int i19 = i15;
            TL_iv.pageBlockMap pageblockmap5 = this.f51688y;
            TL_iv.RichText richText = pageblockmap5.caption.credit;
            if (g4Var != null && g4Var.H) {
                alignment = org.telegram.ui.Components.lu0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            a3 n4 = i4.n(this.f51678a, this, null, richText, L, 0, pageblockmap5, alignment, 0, this.f51679b);
            this.f51681e = n4;
            if (n4 != null) {
                i19 += this.f51681e.d.getHeight() + org.telegram.messenger.g0.L(4.0f);
                a3 a3Var2 = this.f51681e;
                a3Var2.f43579s = this.f51683n;
                a3Var2.f43580w = this.f51684r + this.f51685s;
            }
            if (!this.h && this.f51688y.level <= 0) {
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
        float y9 = motionEvent.getY();
        if (motionEvent.getAction() == 0 && this.f51682f.O(x10, y9)) {
            this.f51686w = true;
        } else if (motionEvent.getAction() == 1 && this.f51686w) {
            this.f51686w = false;
            try {
                TLRPC.GeoPoint geoPoint = this.f51688y.geo;
                double d = geoPoint.lat;
                double d10 = geoPoint._long;
                Context context = getContext();
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        } else if (motionEvent.getAction() == 3) {
            this.f51686w = false;
        }
        if (!this.f51686w) {
            if (!i4.j(this.f51678a, this.f51679b, motionEvent, this, this.d, this.f51683n, this.f51684r)) {
                if (!i4.j(this.f51678a, this.f51679b, motionEvent, this, this.f51681e, this.f51683n, this.f51684r + this.f51685s) && !super.onTouchEvent(motionEvent)) {
                    return false;
                }
            }
        }
        return true;
    }
}
