package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public class zo0 extends View {
    public boolean E;
    public boolean F;
    public int f46323a;
    public final org.telegram.ui.ActionBar.u6 f46324b;
    public float f46325c;
    public boolean d;
    public int e;
    public int f46326f;
    public final org.telegram.ui.Components.j5 h;
    public final org.telegram.ui.Components.j5 f46327n;
    public int f46328r;
    public int f46329s;
    public int v;
    public int f46330w;
    public RadialGradient f46331x;
    public final Paint f46332y;

    public zo0(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f46325c = 0.0f;
        org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.h;
        this.h = new org.telegram.ui.Components.j5(this, 350L, dsVar);
        this.f46327n = new org.telegram.ui.Components.j5(this, 350L, dsVar);
        this.f46332y = new Paint(1);
        this.f46324b = u6Var;
        this.f46323a = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23637s8, u6Var);
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
        org.telegram.ui.ActionBar.u6 u6Var = this.f46324b;
        if (peerColor == null) {
            this.d = true;
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23637s8, u6Var);
            this.f46326f = w02;
            this.e = w02;
        } else {
            if (u6Var != null) {
                q5 = u6Var.a();
            } else {
                q5 = org.telegram.ui.ActionBar.y6.I.q();
            }
            this.e = peerColor.getBgColor1(q5);
            this.f46326f = peerColor.getBgColor2(q5);
        }
        if (!z10) {
            this.h.a(this.e, true);
            this.f46327n.a(this.f46326f, true);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        int w02;
        boolean z10 = this.d;
        org.telegram.ui.Components.j5 j5Var = this.f46327n;
        org.telegram.ui.Components.j5 j5Var2 = this.h;
        if (z10 && (this.e != (w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23637s8, this.f46324b)) || this.f46326f != w02)) {
            this.f46326f = w02;
            this.e = w02;
            j5Var2.a(w02, true);
            j5Var.a(w02, true);
        }
        int a2 = j5Var2.a(this.e, false);
        int a10 = j5Var.a(this.f46326f, false);
        RadialGradient radialGradient = this.f46331x;
        Paint paint = this.f46332y;
        if (radialGradient == null || this.f46328r != a2 || this.f46329s != a10 || this.v != getWidth() || this.f46330w != getHeight()) {
            this.v = getWidth();
            this.f46330w = getHeight();
            float f7 = this.v;
            float f10 = this.f46330w;
            this.f46329s = a10;
            this.f46328r = a2;
            RadialGradient radialGradient2 = new RadialGradient(f7 / 2.0f, f10 * 0.4f, AndroidUtilities.distance(0.0f, 0.0f, f7, f10) * 0.75f, new int[]{a10, a2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.f46331x = radialGradient2;
            paint.setShader(radialGradient2);
            a();
        }
        if (this.f46325c < 1.0f && !this.E) {
            canvas2 = canvas;
            canvas2.drawColor(this.f46323a);
        } else {
            canvas2 = canvas;
        }
        if (this.E) {
            i10 = 255;
        } else {
            i10 = (int) (this.f46325c * 255.0f);
        }
        paint.setAlpha(i10);
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }

    public int getActionBarButtonColor() {
        int i10;
        int i11 = org.telegram.ui.ActionBar.y6.f23695v8;
        org.telegram.ui.ActionBar.u6 u6Var = this.f46324b;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i11, u6Var);
        if (this.d) {
            i10 = org.telegram.ui.ActionBar.y6.w0(i11, u6Var);
        } else {
            i10 = -1;
        }
        return i0.a.f(this.f46325c, w02, i10);
    }

    public int getColor() {
        return i0.a.f(this.f46325c, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23637s8, this.f46324b), i0.a.f(0.75f, this.h.f29507c, this.f46327n.f29507c));
    }

    public int getTabsViewBackgroundColor() {
        int b10;
        int b11;
        int i10 = org.telegram.ui.ActionBar.y6.f23637s8;
        org.telegram.ui.ActionBar.u6 u6Var = this.f46324b;
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.y6.w0(i10, u6Var)) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23695v8, u6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.y6.b(0.08f, -0.08f, org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
        }
        org.telegram.ui.Components.j5 j5Var = this.h;
        int i11 = j5Var.f29507c;
        org.telegram.ui.Components.j5 j5Var2 = this.f46327n;
        if (AndroidUtilities.computePerceivedBrightness(i0.a.f(0.75f, i11, j5Var2.f29507c)) > 0.721f) {
            b11 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23693v6, u6Var);
        } else {
            b11 = org.telegram.ui.ActionBar.y6.b(0.08f, -0.08f, i0.a.f(0.75f, j5Var.f29507c, j5Var2.f29507c));
        }
        return i0.a.f(this.f46325c, b10, b11);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (!this.F) {
            i11 = org.telegram.messenger.wh.D(230.0f, AndroidUtilities.statusBarHeight, 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    public void setProgressToGradient(float f7) {
        if (Math.abs(this.f46325c - f7) > 0.001f) {
            this.f46325c = f7;
            a();
            invalidate();
        }
    }

    public void a() {
    }
}
