package qg;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ok;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.tk0;
import w7.y5;
public final class u0 extends j {
    public final t0 f41950q0;
    public boolean f41951r0;
    public int f41952s0;
    public int f41953t0;
    public TLRPC.MessageMedia f41954u0;
    public TL_stories.MediaArea f41955v0;

    public u0(Context context, PointF pointF, int i10, TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea, float f7, int i11) {
        super(context, pointF);
        t0 t0Var = new t0(context, f7);
        this.f41950q0 = t0Var;
        t0Var.setMaxWidth(i11);
        r(i10, messageMedia, mediaArea);
        t0Var.e(0, this.f41952s0);
        addView(t0Var, y5.e(-2, -2, 51));
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
        String o9 = a4.a.o((int) floor, "°", new StringBuilder(""));
        double floor2 = Math.floor((abs - floor) * 60.0d);
        StringBuilder v = a4.a.v(o9);
        if (floor2 > 0.0d) {
            str = "";
        } else {
            str = "0";
        }
        v.append(str);
        if (floor2 >= 10.0d) {
            str2 = "";
        } else {
            str2 = "0";
        }
        v.append(str2);
        String o10 = a4.a.o((int) floor2, "'", v);
        double floor3 = Math.floor(Math.floor(floor2) * 60.0d);
        StringBuilder v9 = a4.a.v(o10);
        if (floor3 > 0.0d) {
            str3 = "";
        } else {
            str3 = "0";
        }
        v9.append(str3);
        if (floor3 < 10.0d) {
            str4 = "0";
        }
        v9.append(str4);
        return a4.a.o((int) floor3, "\"", v9);
    }

    @Override
    public final i a() {
        return new q0(this, getContext());
    }

    public int getColor() {
        return this.f41952s0;
    }

    @Override
    public float getMaxScale() {
        return 1.5f;
    }

    @Override
    public tk0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = getScale();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (scale * getMeasuredWidth());
        float scale2 = getScale();
        float dp2 = (AndroidUtilities.dp(64.0f) / scaleX) + (scale2 * getMeasuredHeight());
        float x10 = ok.x(dp, 2.0f, getPositionX(), scaleX);
        return new tk0(x10, ok.x(dp2, 2.0f, getPositionY(), scaleX), ((dp * scaleX) + x10) - x10, dp2 * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        return this.f41950q0.J;
    }

    @Override
    public float getStickyPaddingLeft() {
        return this.f41950q0.I;
    }

    @Override
    public float getStickyPaddingRight() {
        return this.f41950q0.I;
    }

    @Override
    public float getStickyPaddingTop() {
        return this.f41950q0.J;
    }

    public int getType() {
        return this.f41953t0;
    }

    public int getTypesCount() {
        return this.f41950q0.getTypesCount() - (!this.f41951r0 ? 1 : 0);
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
        this.f41954u0 = messageMedia;
        this.f41955v0 = mediaArea;
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
        t0 t0Var = this.f41950q0;
        t0Var.d(i10, str4);
        t0Var.setText(str);
        m();
    }

    public void setColor(int i10) {
        this.f41951r0 = true;
        this.f41952s0 = i10;
    }

    public void setMaxWidth(int i10) {
        this.f41950q0.setMaxWidth(i10);
    }

    public void setType(int i10) {
        this.f41953t0 = i10;
        this.f41950q0.e(i10, this.f41952s0);
    }
}
