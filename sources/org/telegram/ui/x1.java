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
public final class x1 extends FrameLayout implements org.telegram.ui.Cells.j9 {
    public final m60 f43411a;
    public final f4 f43412b;
    public Drawable f43413c;
    public z2 d;
    public z2 e;
    public final ImageReceiver f43414f;
    public boolean h;
    public int f43415n;
    public int f43416r;
    public int f43417s;
    public boolean f43418w;
    public int f43419x;
    public TL_iv.pageBlockMap f43420y;

    public x1(Context context, m60 m60Var, f4 f4Var) {
        super(context);
        this.f43411a = m60Var;
        this.f43412b = f4Var;
        setWillNotDraw(false);
        this.f43414f = new ImageReceiver(this);
    }

    @Override
    public final void h(ArrayList arrayList) {
        z2 z2Var = this.d;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
        z2 z2Var2 = this.e;
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
        z2 z2Var2 = this.e;
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
        z2 z2Var2 = this.e;
        if (z2Var2 != null) {
            z2Var2.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f43420y == null) {
            return;
        }
        Paint paint = org.telegram.ui.ActionBar.t6.S1;
        int i10 = org.telegram.ui.ActionBar.t6.f20938df;
        m60 m60Var = this.f43411a;
        ((h4) m60Var).getClass();
        paint.setColor(org.telegram.ui.ActionBar.t6.v0(i10));
        ImageReceiver imageReceiver = this.f43414f;
        canvas.drawRect(imageReceiver.K0, imageReceiver.L0, imageReceiver.y(), imageReceiver.A(), org.telegram.ui.ActionBar.t6.S1);
        float r10 = imageReceiver.r();
        Drawable[] drawableArr = org.telegram.ui.ActionBar.t6.S4;
        int i11 = 0;
        int intrinsicWidth = (int) (r10 - (drawableArr[0].getIntrinsicWidth() / 2));
        int s10 = (int) (imageReceiver.s() - (drawableArr[0].getIntrinsicHeight() / 2));
        Drawable drawable = drawableArr[0];
        drawable.setBounds(intrinsicWidth, s10, drawable.getIntrinsicWidth() + intrinsicWidth, drawableArr[0].getIntrinsicHeight() + s10);
        drawableArr[0].draw(canvas);
        imageReceiver.h(canvas, null);
        if (this.f43419x == 2 && imageReceiver.L()) {
            if (this.f43413c == null) {
                this.f43413c = getContext().getDrawable(2131231645).mutate();
            }
            int intrinsicWidth2 = (int) (this.f43413c.getIntrinsicWidth() * 0.8f);
            int intrinsicHeight = (int) (this.f43413c.getIntrinsicHeight() * 0.8f);
            int B = (int) c3.i0.B(imageReceiver.M0, intrinsicWidth2, 2.0f, imageReceiver.K0);
            int i12 = (int) (((imageReceiver.N0 / 2.0f) - intrinsicHeight) + imageReceiver.L0);
            this.f43413c.setAlpha((int) (imageReceiver.f14384h1 * 255.0f));
            this.f43413c.setBounds(B, i12, intrinsicWidth2 + B, intrinsicHeight + i12);
            this.f43413c.draw(canvas);
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f43415n, this.f43416r);
            h4.t(m60Var, canvas, this, 0);
            this.d.d(canvas, this);
            canvas.restore();
            i11 = 1;
        }
        if (this.e != null) {
            canvas.save();
            canvas.translate(this.f43415n, this.f43416r + this.f43417s);
            h4.t(m60Var, canvas, this, i11);
            this.e.d(canvas, this);
            canvas.restore();
        }
        h4.s(canvas, m60Var, this.f43420y, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.cd.L0(2131748705, null));
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2.toString());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int L;
        int i15;
        int i16;
        float f7;
        Layout.Alignment alignment;
        TLRPC.WebPage webPage;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockMap pageblockmap = this.f43420y;
        if (pageblockmap != null) {
            if (pageblockmap.level > 0) {
                i14 = org.telegram.messenger.i0.L(18.0f) + org.telegram.messenger.i0.L(i13 * 14);
                this.f43415n = i14;
                i15 = org.telegram.messenger.z20.w(18.0f, i14, size);
                L = i15;
            } else {
                this.f43415n = org.telegram.messenger.i0.L(18.0f);
                i14 = 0;
                L = size - org.telegram.messenger.i0.L(36.0f);
                i15 = size;
            }
            TL_iv.pageBlockMap pageblockmap2 = this.f43420y;
            int i17 = (int) ((i15 / pageblockmap2.f20017w) * pageblockmap2.h);
            Point point = org.telegram.messenger.i0.f16026q;
            int max = (int) ((Math.max(point.x, point.y) - org.telegram.messenger.i0.L(56.0f)) * 0.9f);
            if (i17 > max) {
                TL_iv.pageBlockMap pageblockmap3 = this.f43420y;
                i15 = (int) ((max / pageblockmap3.h) * pageblockmap3.f20017w);
                i14 += ((size - i14) - i15) / 2;
                i16 = max;
            } else {
                i16 = i17;
            }
            float f10 = i14;
            if (!this.h && this.f43420y.level <= 0) {
                f7 = org.telegram.messenger.i0.L(8.0f);
            } else {
                f7 = 0.0f;
            }
            float f11 = i15;
            float f12 = i16;
            ImageReceiver imageReceiver = this.f43414f;
            imageReceiver.y0(f10, f7, f11, f12);
            int i18 = ((h4) this.f43411a).X;
            TLRPC.GeoPoint geoPoint = this.f43420y.geo;
            double d = geoPoint.lat;
            double d10 = geoPoint._long;
            float f13 = org.telegram.messenger.i0.f16025p;
            String e02 = org.telegram.messenger.i0.e0(i18, d, d10, (int) (f11 / f13), (int) (f12 / f13), true, 15, -1);
            TLRPC.GeoPoint geoPoint2 = this.f43420y.geo;
            float f14 = org.telegram.messenger.i0.f16025p;
            org.telegram.messenger.b30 b10 = org.telegram.messenger.b30.b(geoPoint2, (int) (f11 / f14), (int) (f12 / f14), 15, Math.min(2, (int) Math.ceil(f14)));
            int i19 = org.telegram.messenger.vp.r1(i18).f18842m3;
            this.f43419x = i19;
            f4 f4Var = this.f43412b;
            if (i19 == 2) {
                org.telegram.messenger.ic p5 = org.telegram.messenger.ic.p(b10);
                if (f4Var != null) {
                    webPage = f4Var.E;
                } else {
                    webPage = null;
                }
                imageReceiver.q0(p5, null, null, null, webPage, 0);
            } else {
                imageReceiver.o0(e02, null, null, null, 0L);
            }
            int L2 = (int) (imageReceiver.L0 + imageReceiver.N0 + org.telegram.messenger.i0.L(8.0f));
            this.f43416r = L2;
            TL_iv.pageBlockMap pageblockmap4 = this.f43420y;
            z2 o10 = h4.o(this.f43411a, this, null, pageblockmap4.caption.text, L, L2, pageblockmap4, this.f43412b);
            this.d = o10;
            if (o10 != null) {
                int height = this.d.d.getHeight() + org.telegram.messenger.i0.L(4.0f);
                this.f43417s = height;
                i16 = org.telegram.messenger.m5.C(4.0f, height, i16);
                z2 z2Var = this.d;
                z2Var.f43990s = this.f43415n;
                z2Var.f43991w = this.f43416r;
            }
            int i20 = i16;
            TL_iv.pageBlockMap pageblockmap5 = this.f43420y;
            TL_iv.RichText richText = pageblockmap5.caption.credit;
            if (f4Var != null && f4Var.G) {
                alignment = org.telegram.ui.Components.ov0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            z2 n10 = h4.n(this.f43411a, this, null, richText, L, 0, pageblockmap5, alignment, 0, this.f43412b);
            this.e = n10;
            if (n10 != null) {
                i20 += this.e.d.getHeight() + org.telegram.messenger.i0.L(4.0f);
                z2 z2Var2 = this.e;
                z2Var2.f43990s = this.f43415n;
                z2Var2.f43991w = this.f43416r + this.f43417s;
            }
            if (!this.h && this.f43420y.level <= 0) {
                i20 += org.telegram.messenger.i0.L(8.0f);
            }
            i12 = org.telegram.messenger.i0.L(8.0f) + i20;
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (motionEvent.getAction() == 0 && this.f43414f.O(x10, y3)) {
            this.f43418w = true;
        } else if (motionEvent.getAction() == 1 && this.f43418w) {
            this.f43418w = false;
            try {
                TLRPC.GeoPoint geoPoint = this.f43420y.geo;
                double d = geoPoint.lat;
                double d10 = geoPoint._long;
                Context context = getContext();
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        } else if (motionEvent.getAction() == 3) {
            this.f43418w = false;
        }
        if (!this.f43418w) {
            if (!h4.j(this.f43411a, this.f43412b, motionEvent, this, this.d, this.f43415n, this.f43416r)) {
                if (!h4.j(this.f43411a, this.f43412b, motionEvent, this, this.e, this.f43415n, this.f43416r + this.f43417s) && !super.onTouchEvent(motionEvent)) {
                    return false;
                }
            }
        }
        return true;
    }
}
