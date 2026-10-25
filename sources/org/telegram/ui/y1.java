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
public final class y1 extends FrameLayout implements org.telegram.ui.Cells.r9 {
    public final h70 f45923a;
    public final h4 f45924b;
    public Drawable f45925c;
    public a3 d;
    public a3 e;
    public final ImageReceiver f45926f;
    public boolean h;
    public int f45927n;
    public int f45928r;
    public int f45929s;
    public boolean v;
    public int f45930w;
    public TL_iv.pageBlockMap f45931x;

    public y1(Context context, h70 h70Var, h4 h4Var) {
        super(context);
        this.f45923a = h70Var;
        this.f45924b = h4Var;
        setWillNotDraw(false);
        this.f45926f = new ImageReceiver(this);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        a3 a3Var = this.d;
        if (a3Var != null) {
            arrayList.add(a3Var);
        }
        a3 a3Var2 = this.e;
        if (a3Var2 != null) {
            arrayList.add(a3Var2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a3 a3Var = this.d;
        if (a3Var != null) {
            a3Var.attach(this);
        }
        a3 a3Var2 = this.e;
        if (a3Var2 != null) {
            a3Var2.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a3 a3Var = this.d;
        if (a3Var != null) {
            a3Var.detach(this);
        }
        a3 a3Var2 = this.e;
        if (a3Var2 != null) {
            a3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f45931x == null) {
            return;
        }
        Paint paint = org.telegram.ui.ActionBar.y6.S1;
        int i10 = org.telegram.ui.ActionBar.y6.f23584pe;
        h70 h70Var = this.f45923a;
        ((j4) h70Var).getClass();
        int i11 = 0;
        paint.setColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
        ImageReceiver imageReceiver = this.f45926f;
        canvas.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2(), org.telegram.ui.ActionBar.y6.S1);
        float centerX = imageReceiver.getCenterX();
        Drawable[] drawableArr = org.telegram.ui.ActionBar.y6.S4;
        int intrinsicWidth = (int) (centerX - (drawableArr[0].getIntrinsicWidth() / 2));
        int centerY = (int) (imageReceiver.getCenterY() - (drawableArr[0].getIntrinsicHeight() / 2));
        Drawable drawable = drawableArr[0];
        drawable.setBounds(intrinsicWidth, centerY, drawable.getIntrinsicWidth() + intrinsicWidth, drawableArr[0].getIntrinsicHeight() + centerY);
        drawableArr[0].draw(canvas);
        imageReceiver.draw(canvas);
        if (this.f45930w == 2 && imageReceiver.hasNotThumb()) {
            if (this.f45925c == null) {
                this.f45925c = getContext().getDrawable(R.drawable.map_pin).mutate();
            }
            int intrinsicWidth2 = (int) (this.f45925c.getIntrinsicWidth() * 0.8f);
            int intrinsicHeight = (int) (this.f45925c.getIntrinsicHeight() * 0.8f);
            int B = (int) c3.h0.B(imageReceiver.getImageWidth(), intrinsicWidth2, 2.0f, imageReceiver.getImageX());
            int imageHeight = (int) (((imageReceiver.getImageHeight() / 2.0f) - intrinsicHeight) + imageReceiver.getImageY());
            this.f45925c.setAlpha((int) (imageReceiver.getCurrentAlpha() * 255.0f));
            this.f45925c.setBounds(B, imageHeight, intrinsicWidth2 + B, intrinsicHeight + imageHeight);
            this.f45925c.draw(canvas);
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f45927n, this.f45928r);
            j4.v(h70Var, canvas, this, 0);
            this.d.draw(canvas, this);
            canvas.restore();
            i11 = 1;
        }
        if (this.e != null) {
            canvas.save();
            canvas.translate(this.f45927n, this.f45928r + this.f45929s);
            j4.v(h70Var, canvas, this, i11);
            this.e.draw(canvas, this);
            canvas.restore();
        }
        j4.u(canvas, h70Var, this.f45931x, getMeasuredHeight());
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
        TL_iv.pageBlockMap pageblockmap = this.f45931x;
        if (pageblockmap != null) {
            if (pageblockmap.level > 0) {
                i14 = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(i13 * 14);
                this.f45927n = i14;
                i15 = org.telegram.messenger.vh.z(18.0f, i14, size);
                dp = i15;
            } else {
                this.f45927n = AndroidUtilities.dp(18.0f);
                i14 = 0;
                dp = size - AndroidUtilities.dp(36.0f);
                i15 = size;
            }
            TL_iv.pageBlockMap pageblockmap2 = this.f45931x;
            int i17 = (int) ((i15 / pageblockmap2.f22250w) * pageblockmap2.h);
            Point point = AndroidUtilities.displaySize;
            int max = (int) ((Math.max(point.x, point.y) - AndroidUtilities.dp(56.0f)) * 0.9f);
            if (i17 > max) {
                TL_iv.pageBlockMap pageblockmap3 = this.f45931x;
                i15 = (int) ((max / pageblockmap3.h) * pageblockmap3.f22250w);
                i14 += ((size - i14) - i15) / 2;
                i16 = max;
            } else {
                i16 = i17;
            }
            float f10 = i14;
            if (!this.h && this.f45931x.level <= 0) {
                f7 = AndroidUtilities.dp(8.0f);
            } else {
                f7 = 0.0f;
            }
            float f11 = i15;
            float f12 = i16;
            ImageReceiver imageReceiver = this.f45926f;
            imageReceiver.setImageCoords(f10, f7, f11, f12);
            int i18 = ((j4) this.f45923a).X;
            TLRPC.GeoPoint geoPoint = this.f45931x.geo;
            double d = geoPoint.lat;
            double d10 = geoPoint._long;
            float f13 = AndroidUtilities.density;
            String formapMapUrl = AndroidUtilities.formapMapUrl(i18, d, d10, (int) (f11 / f13), (int) (f12 / f13), true, 15, -1);
            TLRPC.GeoPoint geoPoint2 = this.f45931x.geo;
            float f14 = AndroidUtilities.density;
            WebFile createWithGeoPoint = WebFile.createWithGeoPoint(geoPoint2, (int) (f11 / f14), (int) (f12 / f14), 15, Math.min(2, (int) Math.ceil(f14)));
            int i19 = MessagesController.getInstance(i18).mapProvider;
            this.f45930w = i19;
            h4 h4Var = this.f45924b;
            if (i19 == 2) {
                if (createWithGeoPoint != null) {
                    ImageLocation forWebFile = ImageLocation.getForWebFile(createWithGeoPoint);
                    if (h4Var != null) {
                        webPage = h4Var.E;
                    } else {
                        webPage = null;
                    }
                    imageReceiver.setImage(forWebFile, null, null, null, webPage, 0);
                }
            } else if (formapMapUrl != null) {
                imageReceiver.setImage(formapMapUrl, null, null, null, 0L);
            }
            int imageHeight = (int) (imageReceiver.getImageHeight() + imageReceiver.getImageY() + AndroidUtilities.dp(8.0f));
            this.f45928r = imageHeight;
            TL_iv.pageBlockMap pageblockmap4 = this.f45931x;
            a3 q5 = j4.q(this.f45923a, this, null, pageblockmap4.caption.text, dp, imageHeight, pageblockmap4, this.f45924b);
            this.d = q5;
            if (q5 != null) {
                int height = this.d.d.getHeight() + AndroidUtilities.dp(4.0f);
                this.f45929s = height;
                i16 = org.telegram.messenger.t.D(4.0f, height, i16);
                a3 a3Var = this.d;
                a3Var.f37631s = this.f45927n;
                a3Var.v = this.f45928r;
            }
            int i20 = i16;
            TL_iv.pageBlockMap pageblockmap5 = this.f45931x;
            TL_iv.RichText richText = pageblockmap5.caption.credit;
            if (h4Var != null && h4Var.G) {
                alignment = org.telegram.ui.Components.px0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            a3 p10 = j4.p(this.f45923a, this, null, richText, dp, 0, pageblockmap5, alignment, 0, this.f45924b);
            this.e = p10;
            if (p10 != null) {
                i20 += this.e.d.getHeight() + AndroidUtilities.dp(4.0f);
                a3 a3Var2 = this.e;
                a3Var2.f37631s = this.f45927n;
                a3Var2.v = this.f45928r + this.f45929s;
            }
            if (!this.h && this.f45931x.level <= 0) {
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
        float x9 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (motionEvent.getAction() == 0 && this.f45926f.isInsideImage(x9, y3)) {
            this.v = true;
        } else if (motionEvent.getAction() == 1 && this.v) {
            this.v = false;
            try {
                TLRPC.GeoPoint geoPoint = this.f45931x.geo;
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
            if (!j4.l(this.f45923a, this.f45924b, motionEvent, this, this.d, this.f45927n, this.f45928r)) {
                if (!j4.l(this.f45923a, this.f45924b, motionEvent, this, this.e, this.f45927n, this.f45928r + this.f45929s) && !super.onTouchEvent(motionEvent)) {
                    return false;
                }
            }
        }
        return true;
    }
}
