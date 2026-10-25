package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public class xo0 extends View {
    public boolean E;
    public boolean F;
    public int f45816a;
    public final org.telegram.ui.ActionBar.u6 f45817b;
    public float f45818c;
    public boolean d;
    public int e;
    public int f45819f;
    public final org.telegram.ui.Components.j5 h;
    public final org.telegram.ui.Components.j5 f45820n;
    public int f45821r;
    public int f45822s;
    public int v;
    public int f45823w;
    public RadialGradient f45824x;
    public final Paint f45825y;

    public xo0(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f45818c = 0.0f;
        org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.h;
        this.h = new org.telegram.ui.Components.j5(this, 350L, dsVar);
        this.f45820n = new org.telegram.ui.Components.j5(this, 350L, dsVar);
        this.f45825y = new Paint(1);
        this.f45817b = u6Var;
        this.f45816a = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23634s8, u6Var);
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
        boolean q5;
        this.d = false;
        org.telegram.ui.ActionBar.u6 u6Var = this.f45817b;
        if (peerColor == null) {
            this.d = true;
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23634s8, u6Var);
            this.f45819f = w02;
            this.e = w02;
        } else {
            if (u6Var != null) {
                q5 = u6Var.a();
            } else {
                q5 = org.telegram.ui.ActionBar.y6.I.q();
            }
            this.e = peerColor.getBgColor1(q5);
            this.f45819f = peerColor.getBgColor2(q5);
        }
        if (!z10) {
            this.h.a(this.e, true);
            this.f45820n.a(this.f45819f, true);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        int w02;
        boolean z10 = this.d;
        org.telegram.ui.Components.j5 j5Var = this.f45820n;
        org.telegram.ui.Components.j5 j5Var2 = this.h;
        if (z10 && (this.e != (w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23634s8, this.f45817b)) || this.f45819f != w02)) {
            this.f45819f = w02;
            this.e = w02;
            j5Var2.a(w02, true);
            j5Var.a(w02, true);
        }
        int a2 = j5Var2.a(this.e, false);
        int a10 = j5Var.a(this.f45819f, false);
        RadialGradient radialGradient = this.f45824x;
        Paint paint = this.f45825y;
        if (radialGradient == null || this.f45821r != a2 || this.f45822s != a10 || this.v != getWidth() || this.f45823w != getHeight()) {
            this.v = getWidth();
            this.f45823w = getHeight();
            float f7 = this.v;
            float f10 = this.f45823w;
            this.f45822s = a10;
            this.f45821r = a2;
            RadialGradient radialGradient2 = new RadialGradient(f7 / 2.0f, f10 * 0.4f, AndroidUtilities.distance(0.0f, 0.0f, f7, f10) * 0.75f, new int[]{a10, a2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.f45824x = radialGradient2;
            paint.setShader(radialGradient2);
            a();
        }
        if (this.f45818c < 1.0f && !this.E) {
            canvas2 = canvas;
            canvas2.drawColor(this.f45816a);
        } else {
            canvas2 = canvas;
        }
        if (this.E) {
            i10 = 255;
        } else {
            i10 = (int) (this.f45818c * 255.0f);
        }
        paint.setAlpha(i10);
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }

    public int getActionBarButtonColor() {
        int i10;
        int i11 = org.telegram.ui.ActionBar.y6.f23692v8;
        org.telegram.ui.ActionBar.u6 u6Var = this.f45817b;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i11, u6Var);
        if (this.d) {
            i10 = org.telegram.ui.ActionBar.y6.w0(i11, u6Var);
        } else {
            i10 = -1;
        }
        return i0.a.f(this.f45818c, w02, i10);
    }

    public int getColor() {
        return i0.a.f(this.f45818c, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23634s8, this.f45817b), i0.a.f(0.75f, this.h.f29478c, this.f45820n.f29478c));
    }

    public int getTabsViewBackgroundColor() {
        int b10;
        int b11;
        int i10 = org.telegram.ui.ActionBar.y6.f23634s8;
        org.telegram.ui.ActionBar.u6 u6Var = this.f45817b;
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.y6.w0(i10, u6Var)) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23692v8, u6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.y6.b(0.08f, -0.08f, org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
        }
        org.telegram.ui.Components.j5 j5Var = this.h;
        int i11 = j5Var.f29478c;
        org.telegram.ui.Components.j5 j5Var2 = this.f45820n;
        if (AndroidUtilities.computePerceivedBrightness(i0.a.f(0.75f, i11, j5Var2.f29478c)) > 0.721f) {
            b11 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23690v6, u6Var);
        } else {
            b11 = org.telegram.ui.ActionBar.y6.b(0.08f, -0.08f, i0.a.f(0.75f, j5Var.f29478c, j5Var2.f29478c));
        }
        return i0.a.f(this.f45818c, b10, b11);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (!this.F) {
            i11 = org.telegram.messenger.vh.D(230.0f, AndroidUtilities.statusBarHeight, 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    public void setProgressToGradient(float f7) {
        if (Math.abs(this.f45818c - f7) > 0.001f) {
            this.f45818c = f7;
            a();
            invalidate();
        }
    }

    public void a() {
    }
}
