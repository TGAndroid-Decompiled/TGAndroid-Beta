package tg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import c8.ja;
import org.telegram.messenger.i20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.pi0;
public final class n0 extends j {
    public final m0 f57459r0;
    public boolean f57460s0;
    public int f57461t0;
    public int f57462u0;
    public TLRPC.MessageMedia f57463v0;
    public TL_stories.MediaArea f57464w0;

    public n0(Context context, PointF pointF, int i7, TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea, float f10, int i10) {
        super(context, pointF);
        m0 m0Var = new m0(context, f10);
        this.f57459r0 = m0Var;
        m0Var.setMaxWidth(i10);
        r(i7, messageMedia, mediaArea);
        m0Var.e(0, this.f57461t0);
        addView(m0Var, ja.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    public static String q(double d) {
        String str;
        String str2;
        String str3;
        double abs = Math.abs(d);
        double floor = Math.floor(abs);
        String str4 = "";
        String n10 = a8.p0.n((int) floor, "°", new StringBuilder(""));
        double floor2 = Math.floor((abs - floor) * 60.0d);
        StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(n10);
        if (floor2 > 0.0d) {
            str = "";
        } else {
            str = "0";
        }
        m10.append(str);
        if (floor2 >= 10.0d) {
            str2 = "";
        } else {
            str2 = "0";
        }
        m10.append(str2);
        String n11 = a8.p0.n((int) floor2, "'", m10);
        double floor3 = Math.floor(Math.floor(floor2) * 60.0d);
        StringBuilder m11 = com.google.android.gms.internal.vision.e2.m(n11);
        if (floor3 > 0.0d) {
            str3 = "";
        } else {
            str3 = "0";
        }
        m11.append(str3);
        if (floor3 < 10.0d) {
            str4 = "0";
        }
        m11.append(str4);
        return a8.p0.n((int) floor3, "\"", m11);
    }

    @Override
    public final i a() {
        return new j0(this, getContext());
    }

    public int getColor() {
        return this.f57461t0;
    }

    @Override
    public float getMaxScale() {
        return 1.5f;
    }

    @Override
    public pi0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = getScale();
        float L = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (scale * getMeasuredWidth());
        float scale2 = getScale();
        float L2 = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (scale2 * getMeasuredHeight());
        float x10 = i20.x(L, 2.0f, getPositionX(), scaleX);
        return new pi0(x10, i20.x(L2, 2.0f, getPositionY(), scaleX), ((L * scaleX) + x10) - x10, L2 * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        return this.f57459r0.K;
    }

    @Override
    public float getStickyPaddingLeft() {
        return this.f57459r0.J;
    }

    @Override
    public float getStickyPaddingRight() {
        return this.f57459r0.J;
    }

    @Override
    public float getStickyPaddingTop() {
        return this.f57459r0.K;
    }

    public int getType() {
        return this.f57462u0;
    }

    public int getTypesCount() {
        return this.f57459r0.getTypesCount() - (!this.f57460s0 ? 1 : 0);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        k();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        k();
    }

    public final void r(int i7, TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        String str;
        String str2;
        String str3;
        this.f57463v0 = messageMedia;
        this.f57464w0 = mediaArea;
        String str4 = null;
        if (messageMedia instanceof TLRPC.TL_messageMediaGeo) {
            TLRPC.GeoPoint geoPoint = messageMedia.geo;
            double d = geoPoint.lat;
            double d2 = geoPoint._long;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(q(d));
            if (d > 0.0d) {
                str2 = "N";
            } else {
                str2 = "S";
            }
            sb2.append(str2);
            sb2.append(" ");
            sb2.append(q(d2));
            if (d2 > 0.0d) {
                str3 = "E";
            } else {
                str3 = "W";
            }
            sb2.append(str3);
            str = sb2.toString();
        } else if (messageMedia instanceof TLRPC.TL_messageMediaVenue) {
            String upperCase = messageMedia.title.toUpperCase();
            str4 = ((TLRPC.TL_messageMediaVenue) messageMedia).emoji;
            str = upperCase;
        } else {
            str = "";
        }
        m0 m0Var = this.f57459r0;
        m0Var.d(i7, str4);
        m0Var.setText(str);
        m();
    }

    public void setColor(int i7) {
        this.f57460s0 = true;
        this.f57461t0 = i7;
    }

    public void setMaxWidth(int i7) {
        this.f57459r0.setMaxWidth(i7);
    }

    public void setType(int i7) {
        this.f57462u0 = i7;
        this.f57459r0.e(i7, this.f57461t0);
    }
}
