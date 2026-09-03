package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public class to0 extends View {
    public boolean B;
    public boolean C;
    public int f38558a;
    public final org.telegram.ui.ActionBar.f6 f38559b;
    public float f38560c;
    public boolean d;
    public int e;
    public int f38561f;
    public final org.telegram.ui.Components.c5 h;
    public final org.telegram.ui.Components.c5 f38562n;
    public int f38563r;
    public int f38564s;
    public int v;
    public int f38565w;
    public RadialGradient f38566x;
    public final Paint f38567y;

    public to0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f38560c = 0.0f;
        org.telegram.ui.Components.mr mrVar = org.telegram.ui.Components.mr.h;
        this.h = new org.telegram.ui.Components.c5(this, 350L, mrVar);
        this.f38562n = new org.telegram.ui.Components.c5(this, 350L, mrVar);
        this.f38567y = new Paint(1);
        this.f38559b = f6Var;
        this.f38558a = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20151s8, f6Var);
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
        org.telegram.ui.ActionBar.f6 f6Var = this.f38559b;
        if (peerColor == null) {
            this.d = true;
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20151s8, f6Var);
            this.f38561f = v02;
            this.e = v02;
        } else {
            if (f6Var != null) {
                q10 = f6Var.a();
            } else {
                q10 = org.telegram.ui.ActionBar.j6.I.q();
            }
            this.e = peerColor.getBgColor1(q10);
            this.f38561f = peerColor.getBgColor2(q10);
        }
        if (!z4) {
            this.h.a(this.e, true);
            this.f38562n.a(this.f38561f, true);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        int a2 = this.h.a(this.e, false);
        int a10 = this.f38562n.a(this.f38561f, false);
        RadialGradient radialGradient = this.f38566x;
        Paint paint = this.f38567y;
        if (radialGradient == null || this.f38563r != a2 || this.f38564s != a10 || this.v != getWidth() || this.f38565w != getHeight()) {
            this.v = getWidth();
            this.f38565w = getHeight();
            float f10 = this.v;
            float f11 = this.f38565w;
            this.f38564s = a10;
            this.f38563r = a2;
            RadialGradient radialGradient2 = new RadialGradient(f10 / 2.0f, f11 * 0.4f, AndroidUtilities.distance(0.0f, 0.0f, f10, f11) * 0.75f, new int[]{a10, a2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.f38566x = radialGradient2;
            paint.setShader(radialGradient2);
            a();
        }
        if (this.f38560c < 1.0f && !this.B) {
            canvas2 = canvas;
            canvas2.drawColor(this.f38558a);
        } else {
            canvas2 = canvas;
        }
        if (this.B) {
            i10 = 255;
        } else {
            i10 = (int) (this.f38560c * 255.0f);
        }
        paint.setAlpha(i10);
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }

    public int getActionBarButtonColor() {
        int i10;
        int i11 = org.telegram.ui.ActionBar.j6.f20202v8;
        org.telegram.ui.ActionBar.f6 f6Var = this.f38559b;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        if (this.d) {
            i10 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        } else {
            i10 = -1;
        }
        return i0.a.d(this.f38560c, v02, i10);
    }

    public int getColor() {
        return i0.a.d(this.f38560c, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20151s8, this.f38559b), i0.a.d(0.75f, this.h.f23815c, this.f38562n.f23815c));
    }

    public int getTabsViewBackgroundColor() {
        int b10;
        int b11;
        int i10 = org.telegram.ui.ActionBar.j6.f20151s8;
        org.telegram.ui.ActionBar.f6 f6Var = this.f38559b;
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(i10, f6Var)) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20202v8, f6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.j6.b(0.08f, -0.08f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        }
        org.telegram.ui.Components.c5 c5Var = this.h;
        int i11 = c5Var.f23815c;
        org.telegram.ui.Components.c5 c5Var2 = this.f38562n;
        if (AndroidUtilities.computePerceivedBrightness(i0.a.d(0.75f, i11, c5Var2.f23815c)) > 0.721f) {
            b11 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20200v6, f6Var);
        } else {
            b11 = org.telegram.ui.ActionBar.j6.b(0.08f, -0.08f, i0.a.d(0.75f, c5Var.f23815c, c5Var2.f23815c));
        }
        return i0.a.d(this.f38560c, b10, b11);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (!this.C) {
            i11 = b.B(230.0f, AndroidUtilities.statusBarHeight, 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    public void setProgressToGradient(float f10) {
        if (Math.abs(this.f38560c - f10) > 0.001f) {
            this.f38560c = f10;
            a();
            invalidate();
        }
    }

    public void a() {
    }
}
