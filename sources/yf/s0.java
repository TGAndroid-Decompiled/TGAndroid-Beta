package yf;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.wj0;
public final class s0 extends j {
    public final r0 m0;
    public boolean f50100n0;
    public int f50101o0;
    public int f50102p0;
    public TLRPC.MessageMedia f50103q0;
    public TL_stories.MediaArea f50104r0;

    public s0(Context context, PointF pointF, int i9, TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea, float f10, int i10) {
        super(context, pointF);
        r0 r0Var = new r0(context, f10);
        this.m0 = r0Var;
        r0Var.setMaxWidth(i10);
        r(i9, messageMedia, mediaArea);
        r0Var.e(0, this.f50101o0);
        addView(r0Var, e6.e(-2, -2, 51));
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
        String l10 = aa.d.l((int) floor, "°", new StringBuilder(""));
        double floor2 = Math.floor((abs - floor) * 60.0d);
        StringBuilder n10 = e2.c.n(l10);
        if (floor2 > 0.0d) {
            str = "";
        } else {
            str = "0";
        }
        n10.append(str);
        if (floor2 >= 10.0d) {
            str2 = "";
        } else {
            str2 = "0";
        }
        n10.append(str2);
        String l11 = aa.d.l((int) floor2, "'", n10);
        double floor3 = Math.floor(Math.floor(floor2) * 60.0d);
        StringBuilder n11 = e2.c.n(l11);
        if (floor3 > 0.0d) {
            str3 = "";
        } else {
            str3 = "0";
        }
        n11.append(str3);
        if (floor3 < 10.0d) {
            str4 = "0";
        }
        n11.append(str4);
        return aa.d.l((int) floor3, "\"", n11);
    }

    @Override
    public final i a() {
        return new o0(this, getContext());
    }

    public int getColor() {
        return this.f50101o0;
    }

    @Override
    public float getMaxScale() {
        return 1.5f;
    }

    @Override
    public wj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new Object();
        }
        float scaleX = viewGroup.getScaleX();
        float scale = getScale();
        float dp = (AndroidUtilities.dp(64.0f) / scaleX) + (scale * getMeasuredWidth());
        float scale2 = getScale();
        float dp2 = (AndroidUtilities.dp(64.0f) / scaleX) + (scale2 * getMeasuredHeight());
        float v = ll.v(dp, 2.0f, getPositionX(), scaleX);
        return new wj0(v, ll.v(dp2, 2.0f, getPositionY(), scaleX), ((dp * scaleX) + v) - v, dp2 * scaleX);
    }

    @Override
    public float getStickyPaddingBottom() {
        return this.m0.F;
    }

    @Override
    public float getStickyPaddingLeft() {
        return this.m0.E;
    }

    @Override
    public float getStickyPaddingRight() {
        return this.m0.E;
    }

    @Override
    public float getStickyPaddingTop() {
        return this.m0.F;
    }

    public int getType() {
        return this.f50102p0;
    }

    public int getTypesCount() {
        return this.m0.getTypesCount() - (!this.f50100n0 ? 1 : 0);
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        k();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        k();
    }

    public final void r(int i9, TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        String str;
        String str2;
        String str3;
        this.f50103q0 = messageMedia;
        this.f50104r0 = mediaArea;
        String str4 = null;
        if (messageMedia instanceof TLRPC.TL_messageMediaGeo) {
            TLRPC.GeoPoint geoPoint = messageMedia.geo;
            double d = geoPoint.lat;
            double d9 = geoPoint._long;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(q(d));
            if (d > 0.0d) {
                str2 = "N";
            } else {
                str2 = "S";
            }
            sb2.append(str2);
            sb2.append(" ");
            sb2.append(q(d9));
            if (d9 > 0.0d) {
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
        r0 r0Var = this.m0;
        r0Var.d(i9, str4);
        r0Var.setText(str);
        m();
    }

    public void setColor(int i9) {
        this.f50100n0 = true;
        this.f50101o0 = i9;
    }

    public void setMaxWidth(int i9) {
        this.m0.setMaxWidth(i9);
    }

    public void setType(int i9) {
        this.f50102p0 = i9;
        this.m0.e(i9, this.f50101o0);
    }
}
