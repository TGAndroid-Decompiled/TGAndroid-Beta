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
    public int f40902a;
    public final org.telegram.ui.ActionBar.g6 f40903b;
    public float f40904c;
    public boolean d;
    public int e;
    public int f40905f;
    public final org.telegram.ui.Components.g5 h;
    public final org.telegram.ui.Components.g5 f40906n;
    public int f40907r;
    public int f40908s;
    public int v;
    public int f40909w;
    public RadialGradient f40910x;
    public final Paint f40911y;

    public qo0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f40904c = 0.0f;
        org.telegram.ui.Components.zr zrVar = org.telegram.ui.Components.zr.h;
        this.h = new org.telegram.ui.Components.g5(this, 350L, zrVar);
        this.f40906n = new org.telegram.ui.Components.g5(this, 350L, zrVar);
        this.f40911y = new Paint(1);
        this.f40903b = g6Var;
        this.f40902a = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21463s8, g6Var);
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
        org.telegram.ui.ActionBar.g6 g6Var = this.f40903b;
        if (peerColor == null) {
            this.d = true;
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21463s8, g6Var);
            this.f40905f = w02;
            this.e = w02;
        } else {
            if (g6Var != null) {
                q6 = g6Var.a();
            } else {
                q6 = org.telegram.ui.ActionBar.k6.I.q();
            }
            this.e = peerColor.getBgColor1(q6);
            this.f40905f = peerColor.getBgColor2(q6);
        }
        if (!z10) {
            this.h.a(this.e, true);
            this.f40906n.a(this.f40905f, true);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        int w02;
        boolean z10 = this.d;
        org.telegram.ui.Components.g5 g5Var = this.f40906n;
        org.telegram.ui.Components.g5 g5Var2 = this.h;
        if (z10 && (this.e != (w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21463s8, this.f40903b)) || this.f40905f != w02)) {
            this.f40905f = w02;
            this.e = w02;
            g5Var2.a(w02, true);
            g5Var.a(w02, true);
        }
        int a2 = g5Var2.a(this.e, false);
        int a10 = g5Var.a(this.f40905f, false);
        RadialGradient radialGradient = this.f40910x;
        Paint paint = this.f40911y;
        if (radialGradient == null || this.f40907r != a2 || this.f40908s != a10 || this.v != getWidth() || this.f40909w != getHeight()) {
            this.v = getWidth();
            this.f40909w = getHeight();
            float f7 = this.v;
            float f10 = this.f40909w;
            this.f40908s = a10;
            this.f40907r = a2;
            RadialGradient radialGradient2 = new RadialGradient(f7 / 2.0f, f10 * 0.4f, AndroidUtilities.distance(0.0f, 0.0f, f7, f10) * 0.75f, new int[]{a10, a2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.f40910x = radialGradient2;
            paint.setShader(radialGradient2);
            a();
        }
        if (this.f40904c < 1.0f && !this.E) {
            canvas2 = canvas;
            canvas2.drawColor(this.f40902a);
        } else {
            canvas2 = canvas;
        }
        if (this.E) {
            i10 = 255;
        } else {
            i10 = (int) (this.f40904c * 255.0f);
        }
        paint.setAlpha(i10);
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }

    public int getActionBarButtonColor() {
        int i10;
        int i11 = org.telegram.ui.ActionBar.k6.f21519v8;
        org.telegram.ui.ActionBar.g6 g6Var = this.f40903b;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i11, g6Var);
        if (this.d) {
            i10 = org.telegram.ui.ActionBar.k6.w0(i11, g6Var);
        } else {
            i10 = -1;
        }
        return i0.a.f(this.f40904c, w02, i10);
    }

    public int getColor() {
        return i0.a.f(this.f40904c, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21463s8, this.f40903b), i0.a.f(0.75f, this.h.f26558c, this.f40906n.f26558c));
    }

    public int getTabsViewBackgroundColor() {
        int b10;
        int b11;
        int i10 = org.telegram.ui.ActionBar.k6.f21463s8;
        org.telegram.ui.ActionBar.g6 g6Var = this.f40903b;
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.w0(i10, g6Var)) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21519v8, g6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.k6.b(0.08f, -0.08f, org.telegram.ui.ActionBar.k6.w0(i10, g6Var));
        }
        org.telegram.ui.Components.g5 g5Var = this.h;
        int i11 = g5Var.f26558c;
        org.telegram.ui.Components.g5 g5Var2 = this.f40906n;
        if (AndroidUtilities.computePerceivedBrightness(i0.a.f(0.75f, i11, g5Var2.f26558c)) > 0.721f) {
            b11 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21517v6, g6Var);
        } else {
            b11 = org.telegram.ui.ActionBar.k6.b(0.08f, -0.08f, i0.a.f(0.75f, g5Var.f26558c, g5Var2.f26558c));
        }
        return i0.a.f(this.f40904c, b10, b11);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (!this.F) {
            i11 = org.telegram.messenger.tl.C(230.0f, AndroidUtilities.statusBarHeight, 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    public void setProgressToGradient(float f7) {
        if (Math.abs(this.f40904c - f7) > 0.001f) {
            this.f40904c = f7;
            a();
            invalidate();
        }
    }

    public void a() {
    }
}
