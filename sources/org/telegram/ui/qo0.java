package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public class qo0 extends View {
    public boolean E;
    public boolean F;
    public int f40453a;
    public final org.telegram.ui.ActionBar.d6 f40454b;
    public float f40455c;
    public boolean d;
    public int e;
    public int f40456f;
    public final org.telegram.ui.Components.i5 h;
    public final org.telegram.ui.Components.i5 f40457n;
    public int f40458r;
    public int f40459s;
    public int v;
    public int f40460w;
    public RadialGradient f40461x;
    public final Paint f40462y;

    public qo0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f40455c = 0.0f;
        org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.h;
        this.h = new org.telegram.ui.Components.i5(this, 350L, bsVar);
        this.f40457n = new org.telegram.ui.Components.i5(this, 350L, bsVar);
        this.f40462y = new Paint(1);
        this.f40454b = d6Var;
        this.f40453a = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21265s8, d6Var);
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
        org.telegram.ui.ActionBar.d6 d6Var = this.f40454b;
        if (peerColor == null) {
            this.d = true;
            int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21265s8, d6Var);
            this.f40456f = w02;
            this.e = w02;
        } else {
            if (d6Var != null) {
                q6 = d6Var.a();
            } else {
                q6 = org.telegram.ui.ActionBar.h6.I.q();
            }
            this.e = peerColor.getBgColor1(q6);
            this.f40456f = peerColor.getBgColor2(q6);
        }
        if (!z10) {
            this.h.a(this.e, true);
            this.f40457n.a(this.f40456f, true);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        int a2 = this.h.a(this.e, false);
        int a10 = this.f40457n.a(this.f40456f, false);
        RadialGradient radialGradient = this.f40461x;
        Paint paint = this.f40462y;
        if (radialGradient == null || this.f40458r != a2 || this.f40459s != a10 || this.v != getWidth() || this.f40460w != getHeight()) {
            this.v = getWidth();
            this.f40460w = getHeight();
            float f7 = this.v;
            float f10 = this.f40460w;
            this.f40459s = a10;
            this.f40458r = a2;
            RadialGradient radialGradient2 = new RadialGradient(f7 / 2.0f, f10 * 0.4f, AndroidUtilities.distance(0.0f, 0.0f, f7, f10) * 0.75f, new int[]{a10, a2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.f40461x = radialGradient2;
            paint.setShader(radialGradient2);
            a();
        }
        if (this.f40455c < 1.0f && !this.E) {
            canvas2 = canvas;
            canvas2.drawColor(this.f40453a);
        } else {
            canvas2 = canvas;
        }
        if (this.E) {
            i10 = 255;
        } else {
            i10 = (int) (this.f40455c * 255.0f);
        }
        paint.setAlpha(i10);
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }

    public int getActionBarButtonColor() {
        int i10;
        int i11 = org.telegram.ui.ActionBar.h6.f21321v8;
        org.telegram.ui.ActionBar.d6 d6Var = this.f40454b;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i11, d6Var);
        if (this.d) {
            i10 = org.telegram.ui.ActionBar.h6.w0(i11, d6Var);
        } else {
            i10 = -1;
        }
        return i0.a.f(this.f40455c, w02, i10);
    }

    public int getColor() {
        return i0.a.f(this.f40455c, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21265s8, this.f40454b), i0.a.f(0.75f, this.h.f27070c, this.f40457n.f27070c));
    }

    public int getTabsViewBackgroundColor() {
        int b10;
        int b11;
        int i10 = org.telegram.ui.ActionBar.h6.f21265s8;
        org.telegram.ui.ActionBar.d6 d6Var = this.f40454b;
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.w0(i10, d6Var)) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21321v8, d6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.h6.b(0.08f, -0.08f, org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        }
        org.telegram.ui.Components.i5 i5Var = this.h;
        int i11 = i5Var.f27070c;
        org.telegram.ui.Components.i5 i5Var2 = this.f40457n;
        if (AndroidUtilities.computePerceivedBrightness(i0.a.f(0.75f, i11, i5Var2.f27070c)) > 0.721f) {
            b11 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21319v6, d6Var);
        } else {
            b11 = org.telegram.ui.ActionBar.h6.b(0.08f, -0.08f, i0.a.f(0.75f, i5Var.f27070c, i5Var2.f27070c));
        }
        return i0.a.f(this.f40455c, b10, b11);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (!this.F) {
            i11 = org.telegram.messenger.lk.C(230.0f, AndroidUtilities.statusBarHeight, 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    public void setProgressToGradient(float f7) {
        if (Math.abs(this.f40455c - f7) > 0.001f) {
            this.f40455c = f7;
            a();
            invalidate();
        }
    }

    public void a() {
    }
}
