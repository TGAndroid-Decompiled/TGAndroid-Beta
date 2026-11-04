package ug;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import b8.mf;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ni0;
public final class m0 extends j {
    public final l0 f56152r0;
    public boolean f56153s0;
    public int f56154t0;
    public int f56155u0;
    public TLRPC.MessageMedia f56156v0;
    public TL_stories.MediaArea f56157w0;

    public m0(Context context, PointF pointF, int i3, TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea, float f10, int i10) {
        super(context, pointF);
        l0 l0Var = new l0(context, f10);
        this.f56152r0 = l0Var;
        l0Var.setMaxWidth(i10);
        r(i3, messageMedia, mediaArea);
        l0Var.e(0, this.f56154t0);
        addView(l0Var, mf.e(-2, -2, 51));
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
        String o10 = a1.g.o((int) floor, "°", new StringBuilder(""));
        double floor2 = Math.floor((abs - floor) * 60.0d);
        StringBuilder l10 = com.google.android.recaptcha.internal.a.l(o10);
        if (floor2 > 0.0d) {
            str = "";
        } else {
            str = "0";
        }
        l10.append(str);
        if (floor2 >= 10.0d) {
            str2 = "";
        } else {
            str2 = "0";
        }
        l10.append(str2);
        String o11 = a1.g.o((int) floor2, "'", l10);
        double floor3 = Math.floor(Math.floor(floor2) * 60.0d);
        StringBuilder l11 = com.google.android.recaptcha.internal.a.l(o11);
        if (floor3 > 0.0d) {
            str3 = "";
        } else {
            str3 = "0";
        }
        l11.append(str3);
        if (floor3 < 10.0d) {
            str4 = "0";
        }
        l11.append(str4);
        return a1.g.o((int) floor3, "\"", l11);
    }

    @Override
    public final i a() {
        return new i0(this, getContext());
    }

    public int getColor() {
        return this.f56154t0;
    }

    @Override
    public float getMaxScale() {
        return 1.5f;
    }

    @Override
    public ni0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = getScale();
        float L = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (scale * getMeasuredWidth());
        float scale2 = getScale();
        float L2 = (org.telegram.messenger.g0.L(64.0f) / scaleX) + (scale2 * getMeasuredHeight());
        float x10 = org.telegram.messenger.camera.q.x(L, 2.0f, getPositionX(), scaleX);
        return new ni0(x10, org.telegram.messenger.camera.q.x(L2, 2.0f, getPositionY(), scaleX), ((L * scaleX) + x10) - x10, L2 * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        return this.f56152r0.K;
    }

    @Override
    public float getStickyPaddingLeft() {
        return this.f56152r0.J;
    }

    @Override
    public float getStickyPaddingRight() {
        return this.f56152r0.J;
    }

    @Override
    public float getStickyPaddingTop() {
        return this.f56152r0.K;
    }

    public int getType() {
        return this.f56155u0;
    }

    public int getTypesCount() {
        return this.f56152r0.getTypesCount() - (!this.f56153s0 ? 1 : 0);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        k();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        k();
    }

    public final void r(int i3, TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        String str;
        String str2;
        String str3;
        this.f56156v0 = messageMedia;
        this.f56157w0 = mediaArea;
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
        l0 l0Var = this.f56152r0;
        l0Var.d(i3, str4);
        l0Var.setText(str);
        m();
    }

    public void setColor(int i3) {
        this.f56153s0 = true;
        this.f56154t0 = i3;
    }

    public void setMaxWidth(int i3) {
        this.f56152r0.setMaxWidth(i3);
    }

    public void setType(int i3) {
        this.f56155u0 = i3;
        this.f56152r0.e(i3, this.f56154t0);
    }
}
