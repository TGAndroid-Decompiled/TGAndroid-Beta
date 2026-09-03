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
    public int f41603a;
    public final org.telegram.ui.ActionBar.g6 f41604b;
    public float f41605c;
    public boolean d;
    public int f41606e;
    public int f41607f;
    public final org.telegram.ui.Components.c5 h;
    public final org.telegram.ui.Components.c5 f41608n;
    public int f41609r;
    public int f41610s;
    public int v;
    public int f41611w;
    public RadialGradient f41612x;
    public final Paint f41613y;

    public to0(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f41605c = 0.0f;
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
        this.h = new org.telegram.ui.Components.c5(this, 350L, prVar);
        this.f41608n = new org.telegram.ui.Components.c5(this, 350L, prVar);
        this.f41613y = new Paint(1);
        this.f41604b = g6Var;
        this.f41603a = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21932s8, g6Var);
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
        org.telegram.ui.ActionBar.g6 g6Var = this.f41604b;
        if (peerColor == null) {
            this.d = true;
            int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21932s8, g6Var);
            this.f41607f = v02;
            this.f41606e = v02;
        } else {
            if (g6Var != null) {
                q10 = g6Var.a();
            } else {
                q10 = org.telegram.ui.ActionBar.k6.I.q();
            }
            this.f41606e = peerColor.getBgColor1(q10);
            this.f41607f = peerColor.getBgColor2(q10);
        }
        if (!z4) {
            this.h.a(this.f41606e, true);
            this.f41608n.a(this.f41607f, true);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        int a2 = this.h.a(this.f41606e, false);
        int a10 = this.f41608n.a(this.f41607f, false);
        RadialGradient radialGradient = this.f41612x;
        Paint paint = this.f41613y;
        if (radialGradient == null || this.f41609r != a2 || this.f41610s != a10 || this.v != getWidth() || this.f41611w != getHeight()) {
            this.v = getWidth();
            this.f41611w = getHeight();
            float f10 = this.v;
            float f11 = this.f41611w;
            this.f41610s = a10;
            this.f41609r = a2;
            RadialGradient radialGradient2 = new RadialGradient(f10 / 2.0f, f11 * 0.4f, AndroidUtilities.distance(0.0f, 0.0f, f10, f11) * 0.75f, new int[]{a10, a2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.f41612x = radialGradient2;
            paint.setShader(radialGradient2);
            a();
        }
        if (this.f41605c < 1.0f && !this.B) {
            canvas2 = canvas;
            canvas2.drawColor(this.f41603a);
        } else {
            canvas2 = canvas;
        }
        if (this.B) {
            i10 = 255;
        } else {
            i10 = (int) (this.f41605c * 255.0f);
        }
        paint.setAlpha(i10);
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }

    public int getActionBarButtonColor() {
        int i10;
        int i11 = org.telegram.ui.ActionBar.k6.f21983v8;
        org.telegram.ui.ActionBar.g6 g6Var = this.f41604b;
        int v02 = org.telegram.ui.ActionBar.k6.v0(i11, g6Var);
        if (this.d) {
            i10 = org.telegram.ui.ActionBar.k6.v0(i11, g6Var);
        } else {
            i10 = -1;
        }
        return i0.a.d(this.f41605c, v02, i10);
    }

    public int getColor() {
        return i0.a.d(this.f41605c, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21932s8, this.f41604b), i0.a.d(0.75f, this.h.f25766c, this.f41608n.f25766c));
    }

    public int getTabsViewBackgroundColor() {
        int b10;
        int b11;
        int i10 = org.telegram.ui.ActionBar.k6.f21932s8;
        org.telegram.ui.ActionBar.g6 g6Var = this.f41604b;
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.v0(i10, g6Var)) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21983v8, g6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.k6.b(0.08f, -0.08f, org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
        }
        org.telegram.ui.Components.c5 c5Var = this.h;
        int i11 = c5Var.f25766c;
        org.telegram.ui.Components.c5 c5Var2 = this.f41608n;
        if (AndroidUtilities.computePerceivedBrightness(i0.a.d(0.75f, i11, c5Var2.f25766c)) > 0.721f) {
            b11 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21981v6, g6Var);
        } else {
            b11 = org.telegram.ui.ActionBar.k6.b(0.08f, -0.08f, i0.a.d(0.75f, c5Var.f25766c, c5Var2.f25766c));
        }
        return i0.a.d(this.f41605c, b10, b11);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (!this.C) {
            i11 = b.B(230.0f, AndroidUtilities.statusBarHeight, 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    public void setProgressToGradient(float f10) {
        if (Math.abs(this.f41605c - f10) > 0.001f) {
            this.f41605c = f10;
            a();
            invalidate();
        }
    }

    public void a() {
    }
}
