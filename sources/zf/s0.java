package zf;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewGroup;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.yj0;

public final class s0 extends j {
    public final r0 m0;

    public boolean f50695n0;

    public int f50696o0;

    public int f50697p0;

    public TLRPC.MessageMedia f50698q0;

    public TL_stories.MediaArea f50699r0;

    public s0(Context context, PointF pointF, int i10, TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea, float f10, int i11) {
        super(context, pointF);
        r0 r0Var = new r0(context, f10);
        this.m0 = r0Var;
        r0Var.setMaxWidth(i11);
        r(i10, messageMedia, mediaArea);
        r0Var.e(0, this.f50696o0);
        addView(r0Var, z5.e(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        k();
    }

    public static String q(double d) {
        double dAbs = Math.abs(d);
        double dFloor = Math.floor(dAbs);
        String strK = a9.p.k((int) dFloor, "°", new StringBuilder(""));
        double dFloor2 = Math.floor((dAbs - dFloor) * 60.0d);
        StringBuilder sbO = com.google.android.recaptcha.internal.a.o(strK);
        sbO.append(dFloor2 <= 0.0d ? "0" : "");
        sbO.append(dFloor2 < 10.0d ? "0" : "");
        String strK2 = a9.p.k((int) dFloor2, "'", sbO);
        double dFloor3 = Math.floor(Math.floor(dFloor2) * 60.0d);
        StringBuilder sbO2 = com.google.android.recaptcha.internal.a.o(strK2);
        sbO2.append(dFloor3 <= 0.0d ? "0" : "");
        sbO2.append(dFloor3 < 10.0d ? "0" : "");
        return a9.p.k((int) dFloor3, "\"", sbO2);
    }

    @Override
    public final i a() {
        return new o0(this, getContext());
    }

    public int getColor() {
        return this.f50696o0;
    }

    @Override
    public float getMaxScale() {
        return 1.5f;
    }

    @Override
    public yj0 getSelectionBounds() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup == null) {
            return new yj0();
        }
        float scaleX = viewGroup.getScaleX();
        float fDp = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredWidth());
        float fDp2 = (AndroidUtilities.dp(64.0f) / scaleX) + (getScale() * getMeasuredHeight());
        float fT = rl.t(fDp, 2.0f, getPositionX(), scaleX);
        return new yj0(fT, rl.t(fDp2, 2.0f, getPositionY(), scaleX), ((fDp * scaleX) + fT) - fT, fDp2 * scaleX);
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
        return this.f50697p0;
    }

    public int getTypesCount() {
        return this.m0.getTypesCount() - (!this.f50695n0 ? 1 : 0);
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
        String string;
        this.f50698q0 = messageMedia;
        this.f50699r0 = mediaArea;
        String str = null;
        if (messageMedia instanceof TLRPC.TL_messageMediaGeo) {
            TLRPC.GeoPoint geoPoint = messageMedia.geo;
            double d = geoPoint.lat;
            double d10 = geoPoint._long;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(q(d));
            sb2.append(d > 0.0d ? "N" : "S");
            sb2.append(" ");
            sb2.append(q(d10));
            sb2.append(d10 > 0.0d ? "E" : "W");
            string = sb2.toString();
        } else if (messageMedia instanceof TLRPC.TL_messageMediaVenue) {
            String upperCase = messageMedia.title.toUpperCase();
            str = ((TLRPC.TL_messageMediaVenue) messageMedia).emoji;
            string = upperCase;
        } else {
            string = "";
        }
        r0 r0Var = this.m0;
        r0Var.d(i10, str);
        r0Var.setText(string);
        m();
    }

    public void setColor(int i10) {
        this.f50695n0 = true;
        this.f50696o0 = i10;
    }

    public void setMaxWidth(int i10) {
        this.m0.setMaxWidth(i10);
    }

    public void setType(int i10) {
        this.f50697p0 = i10;
        this.m0.e(i10, this.f50696o0);
    }
}
