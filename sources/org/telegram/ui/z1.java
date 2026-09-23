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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class z1 extends FrameLayout implements org.telegram.ui.Cells.q9 {
    public final r70 f39925a;
    public final g4 f39926b;
    public Drawable f39927c;
    public b3 d;
    public b3 e;
    public final ImageReceiver f39928f;
    public boolean h;
    public int f39929n;
    public int f39930r;
    public int f39931s;
    public boolean v;
    public int f39932w;
    public TL_iv.pageBlockMap f39933x;

    public z1(Context context, r70 r70Var, g4 g4Var) {
        super(context);
        this.f39925a = r70Var;
        this.f39926b = g4Var;
        setWillNotDraw(false);
        this.f39928f = new ImageReceiver(this);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        b3 b3Var = this.d;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
        b3 b3Var2 = this.e;
        if (b3Var2 != null) {
            arrayList.add(b3Var2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b3 b3Var = this.d;
        if (b3Var != null) {
            b3Var.attach(this);
        }
        b3 b3Var2 = this.e;
        if (b3Var2 != null) {
            b3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b3 b3Var = this.d;
        if (b3Var != null) {
            b3Var.detach(this);
        }
        b3 b3Var2 = this.e;
        if (b3Var2 != null) {
            b3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f39933x == null) {
            return;
        }
        Paint paint = org.telegram.ui.ActionBar.h6.S1;
        int i10 = org.telegram.ui.ActionBar.h6.f19015pe;
        r70 r70Var = this.f39925a;
        ((i4) r70Var).getClass();
        int i11 = 0;
        paint.setColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        ImageReceiver imageReceiver = this.f39928f;
        canvas.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2(), org.telegram.ui.ActionBar.h6.S1);
        float centerX = imageReceiver.getCenterX();
        Drawable[] drawableArr = org.telegram.ui.ActionBar.h6.S4;
        int intrinsicWidth = (int) (centerX - (drawableArr[0].getIntrinsicWidth() / 2));
        int centerY = (int) (imageReceiver.getCenterY() - (drawableArr[0].getIntrinsicHeight() / 2));
        Drawable drawable = drawableArr[0];
        drawable.setBounds(intrinsicWidth, centerY, drawable.getIntrinsicWidth() + intrinsicWidth, drawableArr[0].getIntrinsicHeight() + centerY);
        drawableArr[0].draw(canvas);
        imageReceiver.draw(canvas);
        if (this.f39932w == 2 && imageReceiver.hasNotThumb()) {
            if (this.f39927c == null) {
                this.f39927c = getContext().getDrawable(R.drawable.map_pin).mutate();
            }
            int intrinsicWidth2 = (int) (this.f39927c.getIntrinsicWidth() * 0.8f);
            int intrinsicHeight = (int) (this.f39927c.getIntrinsicHeight() * 0.8f);
            int A = (int) com.google.android.gms.internal.vision.e2.A(imageReceiver.getImageWidth(), intrinsicWidth2, 2.0f, imageReceiver.getImageX());
            int imageHeight = (int) (((imageReceiver.getImageHeight() / 2.0f) - intrinsicHeight) + imageReceiver.getImageY());
            this.f39927c.setAlpha((int) (imageReceiver.getCurrentAlpha() * 255.0f));
            this.f39927c.setBounds(A, imageHeight, intrinsicWidth2 + A, intrinsicHeight + imageHeight);
            this.f39927c.draw(canvas);
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f39929n, this.f39930r);
            i4.v(r70Var, canvas, this, 0);
            this.d.draw(canvas, this);
            canvas.restore();
            i11 = 1;
        }
        if (this.e != null) {
            canvas.save();
            canvas.translate(this.f39929n, this.f39930r + this.f39931s);
            i4.v(r70Var, canvas, this, i11);
            this.e.draw(canvas, this);
            canvas.restore();
        }
        i4.u(canvas, r70Var, this.f39933x, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(LocaleController.getString(R.string.Map));
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
        int dp;
        int i15;
        int i16;
        float f7;
        Layout.Alignment alignment;
        TLRPC.WebPage webPage;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockMap pageblockmap = this.f39933x;
        if (pageblockmap != null) {
            if (pageblockmap.level > 0) {
                i14 = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(i13 * 14);
                this.f39929n = i14;
                i15 = org.telegram.messenger.ul.w(18.0f, i14, size);
                dp = i15;
            } else {
                this.f39929n = AndroidUtilities.dp(18.0f);
                i14 = 0;
                dp = size - AndroidUtilities.dp(36.0f);
                i15 = size;
            }
            TL_iv.pageBlockMap pageblockmap2 = this.f39933x;
            int i17 = (int) ((i15 / pageblockmap2.f18304w) * pageblockmap2.h);
            Point point = AndroidUtilities.displaySize;
            int max = (int) ((Math.max(point.x, point.y) - AndroidUtilities.dp(56.0f)) * 0.9f);
            if (i17 > max) {
                TL_iv.pageBlockMap pageblockmap3 = this.f39933x;
                i15 = (int) ((max / pageblockmap3.h) * pageblockmap3.f18304w);
                i14 += ((size - i14) - i15) / 2;
                i16 = max;
            } else {
                i16 = i17;
            }
            float f10 = i14;
            if (!this.h && this.f39933x.level <= 0) {
                f7 = AndroidUtilities.dp(8.0f);
            } else {
                f7 = 0.0f;
            }
            float f11 = i15;
            float f12 = i16;
            ImageReceiver imageReceiver = this.f39928f;
            imageReceiver.setImageCoords(f10, f7, f11, f12);
            int i18 = ((i4) this.f39925a).X;
            TLRPC.GeoPoint geoPoint = this.f39933x.geo;
            double d = geoPoint.lat;
            double d10 = geoPoint._long;
            float f13 = AndroidUtilities.density;
            String formapMapUrl = AndroidUtilities.formapMapUrl(i18, d, d10, (int) (f11 / f13), (int) (f12 / f13), true, 15, -1);
            TLRPC.GeoPoint geoPoint2 = this.f39933x.geo;
            float f14 = AndroidUtilities.density;
            WebFile createWithGeoPoint = WebFile.createWithGeoPoint(geoPoint2, (int) (f11 / f14), (int) (f12 / f14), 15, Math.min(2, (int) Math.ceil(f14)));
            int i19 = MessagesController.getInstance(i18).mapProvider;
            this.f39932w = i19;
            g4 g4Var = this.f39926b;
            if (i19 == 2) {
                if (createWithGeoPoint != null) {
                    ImageLocation forWebFile = ImageLocation.getForWebFile(createWithGeoPoint);
                    if (g4Var != null) {
                        webPage = g4Var.E;
                    } else {
                        webPage = null;
                    }
                    imageReceiver.setImage(forWebFile, null, null, null, webPage, 0);
                }
            } else if (formapMapUrl != null) {
                imageReceiver.setImage(formapMapUrl, null, null, null, 0L);
            }
            int imageHeight = (int) (imageReceiver.getImageHeight() + imageReceiver.getImageY() + AndroidUtilities.dp(8.0f));
            this.f39930r = imageHeight;
            TL_iv.pageBlockMap pageblockmap4 = this.f39933x;
            b3 q6 = i4.q(this.f39925a, this, null, pageblockmap4.caption.text, dp, imageHeight, pageblockmap4, this.f39926b);
            this.d = q6;
            if (q6 != null) {
                int height = this.d.d.getHeight() + AndroidUtilities.dp(4.0f);
                this.f39931s = height;
                i16 = org.telegram.messenger.z0.C(4.0f, height, i16);
                b3 b3Var = this.d;
                b3Var.f31947s = this.f39929n;
                b3Var.v = this.f39930r;
            }
            int i20 = i16;
            TL_iv.pageBlockMap pageblockmap5 = this.f39933x;
            TL_iv.RichText richText = pageblockmap5.caption.credit;
            if (g4Var != null && g4Var.G) {
                alignment = org.telegram.ui.Components.jw0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            b3 p5 = i4.p(this.f39925a, this, null, richText, dp, 0, pageblockmap5, alignment, 0, this.f39926b);
            this.e = p5;
            if (p5 != null) {
                i20 += this.e.d.getHeight() + AndroidUtilities.dp(4.0f);
                b3 b3Var2 = this.e;
                b3Var2.f31947s = this.f39929n;
                b3Var2.v = this.f39930r + this.f39931s;
            }
            if (!this.h && this.f39933x.level <= 0) {
                i20 += AndroidUtilities.dp(8.0f);
            }
            i12 = AndroidUtilities.dp(8.0f) + i20;
        } else {
            i12 = 1;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (motionEvent.getAction() == 0 && this.f39928f.isInsideImage(x10, y3)) {
            this.v = true;
        } else if (motionEvent.getAction() == 1 && this.v) {
            this.v = false;
            try {
                TLRPC.GeoPoint geoPoint = this.f39933x.geo;
                double d = geoPoint.lat;
                double d10 = geoPoint._long;
                Context context = getContext();
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else if (motionEvent.getAction() == 3) {
            this.v = false;
        }
        if (!this.v) {
            if (!i4.l(this.f39925a, this.f39926b, motionEvent, this, this.d, this.f39929n, this.f39930r)) {
                if (!i4.l(this.f39925a, this.f39926b, motionEvent, this, this.e, this.f39929n, this.f39930r + this.f39931s) && !super.onTouchEvent(motionEvent)) {
                    return false;
                }
            }
        }
        return true;
    }
}
