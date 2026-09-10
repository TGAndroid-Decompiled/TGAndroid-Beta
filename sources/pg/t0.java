package pg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.em;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.rk0;
import w7.a6;
public final class t0 extends j {
    public final s0 f40296q0;
    public boolean f40297r0;
    public int f40298s0;
    public int f40299t0;
    public TLRPC.MessageMedia f40300u0;
    public TL_stories.MediaArea f40301v0;

    public t0(Context context, PointF pointF, int i10, TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea, float f7, int i11) {
        super(context, pointF);
        s0 s0Var = new s0(context, f7);
        this.f40296q0 = s0Var;
        s0Var.setMaxWidth(i11);
        r(i10, messageMedia, mediaArea);
        s0Var.e(0, this.f40298s0);
        addView(s0Var, a6.e(-2, -2, 51));
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
        String n10 = a4.a.n((int) floor, "°", new StringBuilder(""));
        double floor2 = Math.floor((abs - floor) * 60.0d);
        StringBuilder u10 = a4.a.u(n10);
        if (floor2 > 0.0d) {
            str = "";
        } else {
            str = "0";
        }
        u10.append(str);
        if (floor2 >= 10.0d) {
            str2 = "";
        } else {
            str2 = "0";
        }
        u10.append(str2);
        String n11 = a4.a.n((int) floor2, "'", u10);
        double floor3 = Math.floor(Math.floor(floor2) * 60.0d);
        StringBuilder u11 = a4.a.u(n11);
        if (floor3 > 0.0d) {
            str3 = "";
        } else {
            str3 = "0";
        }
        u11.append(str3);
        if (floor3 < 10.0d) {
            str4 = "0";
        }
        u11.append(str4);
        return a4.a.n((int) floor3, "\"", u11);
    }

    @Override
    public final i a() {
        return new p0(this, getContext());
    }

    public int getColor() {
        return this.f40298s0;
    }

    @Override
    public float getMaxScale() {
        return 1.5f;
    }

    @Override
    public rk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = getScale();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (scale * getMeasuredWidth());
        float scale2 = getScale();
        float dp2 = (AndroidUtilities.dp(64.0f) / scaleX) + (scale2 * getMeasuredHeight());
        float u10 = em.u(dp, 2.0f, getPositionX(), scaleX);
        return new rk0(u10, em.u(dp2, 2.0f, getPositionY(), scaleX), ((dp * scaleX) + u10) - u10, dp2 * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        return this.f40296q0.J;
    }

    @Override
    public float getStickyPaddingLeft() {
        return this.f40296q0.I;
    }

    @Override
    public float getStickyPaddingRight() {
        return this.f40296q0.I;
    }

    @Override
    public float getStickyPaddingTop() {
        return this.f40296q0.J;
    }

    public int getType() {
        return this.f40299t0;
    }

    public int getTypesCount() {
        return this.f40296q0.getTypesCount() - (!this.f40297r0 ? 1 : 0);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        k();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        k();
    }

    public final void r(int i10, TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        String str;
        String str2;
        String str3;
        this.f40300u0 = messageMedia;
        this.f40301v0 = mediaArea;
        String str4 = null;
        if (messageMedia instanceof TLRPC.TL_messageMediaGeo) {
            TLRPC.GeoPoint geoPoint = messageMedia.geo;
            double d = geoPoint.lat;
            double d10 = geoPoint._long;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(q(d));
            if (d > 0.0d) {
                str2 = "N";
            } else {
                str2 = "S";
            }
            sb2.append(str2);
            sb2.append(" ");
            sb2.append(q(d10));
            if (d10 > 0.0d) {
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
        s0 s0Var = this.f40296q0;
        s0Var.d(i10, str4);
        s0Var.setText(str);
        m();
    }

    public void setColor(int i10) {
        this.f40297r0 = true;
        this.f40298s0 = i10;
    }

    public void setMaxWidth(int i10) {
        this.f40296q0.setMaxWidth(i10);
    }

    public void setType(int i10) {
        this.f40299t0 = i10;
        this.f40296q0.e(i10, this.f40298s0);
    }
}
