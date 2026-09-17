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
public final class z1 extends FrameLayout implements org.telegram.ui.Cells.p9 {
    public final v70 f43280a;
    public final g4 f43281b;
    public Drawable f43282c;
    public b3 d;
    public b3 f43283e;
    public final ImageReceiver f43284f;
    public boolean h;
    public int f43285n;
    public int f43286r;
    public int f43287s;
    public boolean v;
    public int f43288w;
    public TL_iv.pageBlockMap f43289x;

    public z1(Context context, v70 v70Var, g4 g4Var) {
        super(context);
        this.f43280a = v70Var;
        this.f43281b = g4Var;
        setWillNotDraw(false);
        this.f43284f = new ImageReceiver(this);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        b3 b3Var = this.d;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
        b3 b3Var2 = this.f43283e;
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
        b3 b3Var2 = this.f43283e;
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
        b3 b3Var2 = this.f43283e;
        if (b3Var2 != null) {
            b3Var2.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.f43289x == null) {
            return;
        }
        Paint paint = org.telegram.ui.ActionBar.j6.S1;
        int i10 = org.telegram.ui.ActionBar.j6.f20915pe;
        v70 v70Var = this.f43280a;
        ((i4) v70Var).getClass();
        int i11 = 0;
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        ImageReceiver imageReceiver = this.f43284f;
        canvas.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2(), org.telegram.ui.ActionBar.j6.S1);
        float centerX = imageReceiver.getCenterX();
        Drawable[] drawableArr = org.telegram.ui.ActionBar.j6.S4;
        int intrinsicWidth = (int) (centerX - (drawableArr[0].getIntrinsicWidth() / 2));
        int centerY = (int) (imageReceiver.getCenterY() - (drawableArr[0].getIntrinsicHeight() / 2));
        Drawable drawable = drawableArr[0];
        drawable.setBounds(intrinsicWidth, centerY, drawable.getIntrinsicWidth() + intrinsicWidth, drawableArr[0].getIntrinsicHeight() + centerY);
        drawableArr[0].draw(canvas);
        imageReceiver.draw(canvas);
        if (this.f43288w == 2 && imageReceiver.hasNotThumb()) {
            if (this.f43282c == null) {
                this.f43282c = getContext().getDrawable(R.drawable.map_pin).mutate();
            }
            int intrinsicWidth2 = (int) (this.f43282c.getIntrinsicWidth() * 0.8f);
            int intrinsicHeight = (int) (this.f43282c.getIntrinsicHeight() * 0.8f);
            int A = (int) com.google.android.gms.internal.vision.e2.A(imageReceiver.getImageWidth(), intrinsicWidth2, 2.0f, imageReceiver.getImageX());
            int imageHeight = (int) (((imageReceiver.getImageHeight() / 2.0f) - intrinsicHeight) + imageReceiver.getImageY());
            this.f43282c.setAlpha((int) (imageReceiver.getCurrentAlpha() * 255.0f));
            this.f43282c.setBounds(A, imageHeight, intrinsicWidth2 + A, intrinsicHeight + imageHeight);
            this.f43282c.draw(canvas);
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.f43285n, this.f43286r);
            i4.v(v70Var, canvas, this, 0);
            this.d.draw(canvas, this);
            canvas.restore();
            i11 = 1;
        }
        if (this.f43283e != null) {
            canvas.save();
            canvas.translate(this.f43285n, this.f43286r + this.f43287s);
            i4.v(v70Var, canvas, this, i11);
            this.f43283e.draw(canvas, this);
            canvas.restore();
        }
        i4.u(canvas, v70Var, this.f43289x, getMeasuredHeight());
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
        TL_iv.pageBlockMap pageblockmap = this.f43289x;
        if (pageblockmap != null) {
            if (pageblockmap.level > 0) {
                i14 = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(i13 * 14);
                this.f43285n = i14;
                i15 = org.telegram.messenger.vl.v(18.0f, i14, size);
                dp = i15;
            } else {
                this.f43285n = AndroidUtilities.dp(18.0f);
                i14 = 0;
                dp = size - AndroidUtilities.dp(36.0f);
                i15 = size;
            }
            TL_iv.pageBlockMap pageblockmap2 = this.f43289x;
            int i17 = (int) ((i15 / pageblockmap2.f20119w) * pageblockmap2.h);
            Point point = AndroidUtilities.displaySize;
            int max = (int) ((Math.max(point.x, point.y) - AndroidUtilities.dp(56.0f)) * 0.9f);
            if (i17 > max) {
                TL_iv.pageBlockMap pageblockmap3 = this.f43289x;
                i15 = (int) ((max / pageblockmap3.h) * pageblockmap3.f20119w);
                i14 += ((size - i14) - i15) / 2;
                i16 = max;
            } else {
                i16 = i17;
            }
            float f10 = i14;
            if (!this.h && this.f43289x.level <= 0) {
                f7 = AndroidUtilities.dp(8.0f);
            } else {
                f7 = 0.0f;
            }
            float f11 = i15;
            float f12 = i16;
            ImageReceiver imageReceiver = this.f43284f;
            imageReceiver.setImageCoords(f10, f7, f11, f12);
            int i18 = ((i4) this.f43280a).X;
            TLRPC.GeoPoint geoPoint = this.f43289x.geo;
            double d = geoPoint.lat;
            double d10 = geoPoint._long;
            float f13 = AndroidUtilities.density;
            String formapMapUrl = AndroidUtilities.formapMapUrl(i18, d, d10, (int) (f11 / f13), (int) (f12 / f13), true, 15, -1);
            TLRPC.GeoPoint geoPoint2 = this.f43289x.geo;
            float f14 = AndroidUtilities.density;
            WebFile createWithGeoPoint = WebFile.createWithGeoPoint(geoPoint2, (int) (f11 / f14), (int) (f12 / f14), 15, Math.min(2, (int) Math.ceil(f14)));
            int i19 = MessagesController.getInstance(i18).mapProvider;
            this.f43288w = i19;
            g4 g4Var = this.f43281b;
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
            this.f43286r = imageHeight;
            TL_iv.pageBlockMap pageblockmap4 = this.f43289x;
            b3 q6 = i4.q(this.f43280a, this, null, pageblockmap4.caption.text, dp, imageHeight, pageblockmap4, this.f43281b);
            this.d = q6;
            if (q6 != null) {
                int height = this.d.d.getHeight() + AndroidUtilities.dp(4.0f);
                this.f43287s = height;
                i16 = org.telegram.messenger.w1.C(4.0f, height, i16);
                b3 b3Var = this.d;
                b3Var.f34645s = this.f43285n;
                b3Var.v = this.f43286r;
            }
            int i20 = i16;
            TL_iv.pageBlockMap pageblockmap5 = this.f43289x;
            TL_iv.RichText richText = pageblockmap5.caption.credit;
            if (g4Var != null && g4Var.G) {
                alignment = org.telegram.ui.Components.iw0.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            b3 p5 = i4.p(this.f43280a, this, null, richText, dp, 0, pageblockmap5, alignment, 0, this.f43281b);
            this.f43283e = p5;
            if (p5 != null) {
                i20 += this.f43283e.d.getHeight() + AndroidUtilities.dp(4.0f);
                b3 b3Var2 = this.f43283e;
                b3Var2.f34645s = this.f43285n;
                b3Var2.v = this.f43286r + this.f43287s;
            }
            if (!this.h && this.f43289x.level <= 0) {
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
        if (motionEvent.getAction() == 0 && this.f43284f.isInsideImage(x10, y3)) {
            this.v = true;
        } else if (motionEvent.getAction() == 1 && this.v) {
            this.v = false;
            try {
                TLRPC.GeoPoint geoPoint = this.f43289x.geo;
                double d = geoPoint.lat;
                double d10 = geoPoint._long;
                Context context = getContext();
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        } else if (motionEvent.getAction() == 3) {
            this.v = false;
        }
        if (!this.v) {
            if (!i4.l(this.f43280a, this.f43281b, motionEvent, this, this.d, this.f43285n, this.f43286r)) {
                if (!i4.l(this.f43280a, this.f43281b, motionEvent, this, this.f43283e, this.f43285n, this.f43286r + this.f43287s) && !super.onTouchEvent(motionEvent)) {
                    return false;
                }
            }
        }
        return true;
    }
}
