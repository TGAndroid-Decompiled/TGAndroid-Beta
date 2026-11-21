package tg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import c8.ma;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.aj0;
public final class o0 extends j {
    public final n0 f58094r0;
    public boolean f58095s0;
    public int f58096t0;
    public int f58097u0;
    public TLRPC.MessageMedia f58098v0;
    public TL_stories.MediaArea f58099w0;

    public o0(Context context, PointF pointF, int i7, TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea, float f10, int i10) {
        super(context, pointF);
        n0 n0Var = new n0(context, f10);
        this.f58094r0 = n0Var;
        n0Var.setMaxWidth(i10);
        r(i7, messageMedia, mediaArea);
        n0Var.e(0, this.f58096t0);
        addView(n0Var, ma.e(-2, -2, 51));
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
        return new k0(this, getContext());
    }

    public int getColor() {
        return this.f58096t0;
    }

    @Override
    public float getMaxScale() {
        return 1.5f;
    }

    @Override
    public aj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = getScale();
        float L = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (scale * getMeasuredWidth());
        float scale2 = getScale();
        float L2 = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (scale2 * getMeasuredHeight());
        float y10 = n10.y(L, 2.0f, getPositionX(), scaleX);
        return new aj0(y10, n10.y(L2, 2.0f, getPositionY(), scaleX), ((L * scaleX) + y10) - y10, L2 * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        return this.f58094r0.K;
    }

    @Override
    public float getStickyPaddingLeft() {
        return this.f58094r0.J;
    }

    @Override
    public float getStickyPaddingRight() {
        return this.f58094r0.J;
    }

    @Override
    public float getStickyPaddingTop() {
        return this.f58094r0.K;
    }

    public int getType() {
        return this.f58097u0;
    }

    public int getTypesCount() {
        return this.f58094r0.getTypesCount() - (!this.f58095s0 ? 1 : 0);
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
        this.f58098v0 = messageMedia;
        this.f58099w0 = mediaArea;
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
        n0 n0Var = this.f58094r0;
        n0Var.d(i7, str4);
        n0Var.setText(str);
        m();
    }

    public void setColor(int i7) {
        this.f58095s0 = true;
        this.f58096t0 = i7;
    }

    public void setMaxWidth(int i7) {
        this.f58094r0.setMaxWidth(i7);
    }

    public void setType(int i7) {
        this.f58097u0 = i7;
        this.f58094r0.e(i7, this.f58096t0);
    }
}
