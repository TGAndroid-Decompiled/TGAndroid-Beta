package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public class ro0 extends View {
    public boolean E;
    public boolean F;
    public int f41196a;
    public final org.telegram.ui.ActionBar.g6 f41197b;
    public float f41198c;
    public boolean d;
    public int e;
    public int f41199f;
    public final org.telegram.ui.Components.i5 h;
    public final org.telegram.ui.Components.i5 f41200n;
    public int f41201r;
    public int f41202s;
    public int v;
    public int f41203w;
    public RadialGradient f41204x;
    public final Paint f41205y;

    public ro0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f41198c = 0.0f;
        org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.h;
        this.h = new org.telegram.ui.Components.i5(this, 350L, bsVar);
        this.f41200n = new org.telegram.ui.Components.i5(this, 350L, bsVar);
        this.f41205y = new Paint(1);
        this.f41197b = g6Var;
        this.f41196a = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21462s8, g6Var);
        b(-1, -1, false);
    }

    public final void b(int i10, int i11, boolean z10) {
        MessagesController.PeerColors peerColors;
        MessagesController.PeerColor peerColor = null;
        if (i11 >= 0 && i10 >= 0 && (peerColors = MessagesController.getInstance(i10).profilePeerColors) != null) {
            peerColor = peerColors.getColor(i11);
        }
        c(peerColor, z10);
    }

    public final void c(MessagesController.PeerColor peerColor, boolean z10) {
        boolean q6;
        this.d = false;
        org.telegram.ui.ActionBar.g6 g6Var = this.f41197b;
        if (peerColor == null) {
            this.d = true;
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21462s8, g6Var);
            this.f41199f = w02;
            this.e = w02;
        } else {
            if (g6Var != null) {
                q6 = g6Var.a();
            } else {
                q6 = org.telegram.ui.ActionBar.k6.I.q();
            }
            this.e = peerColor.getBgColor1(q6);
            this.f41199f = peerColor.getBgColor2(q6);
        }
        if (!z10) {
            this.h.a(this.e, true);
            this.f41200n.a(this.f41199f, true);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        int w02;
        boolean z10 = this.d;
        org.telegram.ui.Components.i5 i5Var = this.f41200n;
        org.telegram.ui.Components.i5 i5Var2 = this.h;
        if (z10 && (this.e != (w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21462s8, this.f41197b)) || this.f41199f != w02)) {
            this.f41199f = w02;
            this.e = w02;
            i5Var2.a(w02, true);
            i5Var.a(w02, true);
        }
        int a2 = i5Var2.a(this.e, false);
        int a10 = i5Var.a(this.f41199f, false);
        RadialGradient radialGradient = this.f41204x;
        Paint paint = this.f41205y;
        if (radialGradient == null || this.f41201r != a2 || this.f41202s != a10 || this.v != getWidth() || this.f41203w != getHeight()) {
            this.v = getWidth();
            this.f41203w = getHeight();
            float f7 = this.v;
            float f10 = this.f41203w;
            this.f41202s = a10;
            this.f41201r = a2;
            RadialGradient radialGradient2 = new RadialGradient(f7 / 2.0f, f10 * 0.4f, AndroidUtilities.distance(0.0f, 0.0f, f7, f10) * 0.75f, new int[]{a10, a2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.f41204x = radialGradient2;
            paint.setShader(radialGradient2);
            a();
        }
        if (this.f41198c < 1.0f && !this.E) {
            canvas2 = canvas;
            canvas2.drawColor(this.f41196a);
        } else {
            canvas2 = canvas;
        }
        if (this.E) {
            i10 = 255;
        } else {
            i10 = (int) (this.f41198c * 255.0f);
        }
        paint.setAlpha(i10);
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }

    public int getActionBarButtonColor() {
        int i10;
        int i11 = org.telegram.ui.ActionBar.k6.f21518v8;
        org.telegram.ui.ActionBar.g6 g6Var = this.f41197b;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i11, g6Var);
        if (this.d) {
            i10 = org.telegram.ui.ActionBar.k6.w0(i11, g6Var);
        } else {
            i10 = -1;
        }
        return i0.a.f(this.f41198c, w02, i10);
    }

    public int getColor() {
        return i0.a.f(this.f41198c, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21462s8, this.f41197b), i0.a.f(0.75f, this.h.f27206c, this.f41200n.f27206c));
    }

    public int getTabsViewBackgroundColor() {
        int b10;
        int b11;
        int i10 = org.telegram.ui.ActionBar.k6.f21462s8;
        org.telegram.ui.ActionBar.g6 g6Var = this.f41197b;
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.w0(i10, g6Var)) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21518v8, g6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.k6.b(0.08f, -0.08f, org.telegram.ui.ActionBar.k6.w0(i10, g6Var));
        }
        org.telegram.ui.Components.i5 i5Var = this.h;
        int i11 = i5Var.f27206c;
        org.telegram.ui.Components.i5 i5Var2 = this.f41200n;
        if (AndroidUtilities.computePerceivedBrightness(i0.a.f(0.75f, i11, i5Var2.f27206c)) > 0.721f) {
            b11 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21516v6, g6Var);
        } else {
            b11 = org.telegram.ui.ActionBar.k6.b(0.08f, -0.08f, i0.a.f(0.75f, i5Var.f27206c, i5Var2.f27206c));
        }
        return i0.a.f(this.f41198c, b10, b11);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (!this.F) {
            i11 = org.telegram.messenger.sl.C(230.0f, AndroidUtilities.statusBarHeight, 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    public void setProgressToGradient(float f7) {
        if (Math.abs(this.f41198c - f7) > 0.001f) {
            this.f41198c = f7;
            a();
            invalidate();
        }
    }

    public void a() {
    }
}
