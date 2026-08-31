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
    public boolean B;
    public int f41002a;
    public final org.telegram.ui.ActionBar.g6 f41003b;
    public float f41004c;
    public boolean d;
    public int f41005e;
    public int f41006f;
    public final org.telegram.ui.Components.c5 h;
    public final org.telegram.ui.Components.c5 f41007n;
    public int f41008r;
    public int f41009s;
    public int v;
    public int f41010w;
    public RadialGradient f41011x;
    public final Paint f41012y;

    public ro0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f41004c = 0.0f;
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
        this.h = new org.telegram.ui.Components.c5(this, 350L, prVar);
        this.f41007n = new org.telegram.ui.Components.c5(this, 350L, prVar);
        this.f41012y = new Paint(1);
        this.f41003b = g6Var;
        this.f41002a = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21930s8, g6Var);
        b(-1, -1, false);
    }

    public final void b(int i10, int i11, boolean z4) {
        MessagesController.PeerColors peerColors;
        MessagesController.PeerColor peerColor = null;
        if (i11 >= 0 && i10 >= 0 && (peerColors = MessagesController.getInstance(i10).profilePeerColors) != null) {
            peerColor = peerColors.getColor(i11);
        }
        c(peerColor, z4);
    }

    public final void c(MessagesController.PeerColor peerColor, boolean z4) {
        boolean q10;
        this.d = false;
        org.telegram.ui.ActionBar.g6 g6Var = this.f41003b;
        if (peerColor == null) {
            this.d = true;
            int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21930s8, g6Var);
            this.f41006f = v02;
            this.f41005e = v02;
        } else {
            if (g6Var != null) {
                q10 = g6Var.a();
            } else {
                q10 = org.telegram.ui.ActionBar.k6.I.q();
            }
            this.f41005e = peerColor.getBgColor1(q10);
            this.f41006f = peerColor.getBgColor2(q10);
        }
        if (!z4) {
            this.h.a(this.f41005e, true);
            this.f41007n.a(this.f41006f, true);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int a2 = this.h.a(this.f41005e, false);
        int a10 = this.f41007n.a(this.f41006f, false);
        RadialGradient radialGradient = this.f41011x;
        Paint paint = this.f41012y;
        if (radialGradient == null || this.f41008r != a2 || this.f41009s != a10 || this.v != getWidth() || this.f41010w != getHeight()) {
            this.v = getWidth();
            this.f41010w = getHeight();
            int i10 = this.v;
            int i11 = this.f41010w;
            this.f41009s = a10;
            this.f41008r = a2;
            RadialGradient radialGradient2 = new RadialGradient(i10 / 2.0f, i11 * 0.4f, AndroidUtilities.distance(0.0f, 0.0f, i10, i11) * 0.75f, new int[]{a10, a2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.f41011x = radialGradient2;
            paint.setShader(radialGradient2);
            a();
        }
        if (this.f41004c < 1.0f) {
            canvas2 = canvas;
            canvas2.drawColor(this.f41002a);
        } else {
            canvas2 = canvas;
        }
        float f10 = this.f41004c;
        if (f10 > 0.0f) {
            paint.setAlpha((int) (f10 * 255.0f));
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
        }
    }

    public int getActionBarButtonColor() {
        int i10;
        int i11 = org.telegram.ui.ActionBar.k6.f21981v8;
        org.telegram.ui.ActionBar.g6 g6Var = this.f41003b;
        int v02 = org.telegram.ui.ActionBar.k6.v0(i11, g6Var);
        if (this.d) {
            i10 = org.telegram.ui.ActionBar.k6.v0(i11, g6Var);
        } else {
            i10 = -1;
        }
        return i0.a.d(this.f41004c, v02, i10);
    }

    public int getColor() {
        return i0.a.d(this.f41004c, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21930s8, this.f41003b), i0.a.d(0.75f, this.h.f25795c, this.f41007n.f25795c));
    }

    public int getTabsViewBackgroundColor() {
        int b10;
        int b11;
        int i10 = org.telegram.ui.ActionBar.k6.f21930s8;
        org.telegram.ui.ActionBar.g6 g6Var = this.f41003b;
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.v0(i10, g6Var)) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21981v8, g6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.k6.b(0.08f, -0.08f, org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
        }
        org.telegram.ui.Components.c5 c5Var = this.h;
        int i11 = c5Var.f25795c;
        org.telegram.ui.Components.c5 c5Var2 = this.f41007n;
        if (AndroidUtilities.computePerceivedBrightness(i0.a.d(0.75f, i11, c5Var2.f25795c)) > 0.721f) {
            b11 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21979v6, g6Var);
        } else {
            b11 = org.telegram.ui.ActionBar.k6.b(0.08f, -0.08f, i0.a.d(0.75f, c5Var.f25795c, c5Var2.f25795c));
        }
        return i0.a.d(this.f41004c, b10, b11);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (!this.B) {
            i11 = b.B(230.0f, AndroidUtilities.statusBarHeight, 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    public void setProgressToGradient(float f10) {
        if (Math.abs(this.f41004c - f10) > 0.001f) {
            this.f41004c = f10;
            a();
            invalidate();
        }
    }

    public void a() {
    }
}
