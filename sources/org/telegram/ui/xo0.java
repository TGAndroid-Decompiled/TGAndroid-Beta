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
    public int f45819a;
    public final org.telegram.ui.ActionBar.u6 f45820b;
    public float f45821c;
    public boolean d;
    public int e;
    public int f45822f;
    public final org.telegram.ui.Components.j5 h;
    public final org.telegram.ui.Components.j5 f45823n;
    public int f45824r;
    public int f45825s;
    public int v;
    public int f45826w;
    public RadialGradient f45827x;
    public final Paint f45828y;

    public xo0(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f45821c = 0.0f;
        org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.h;
        this.h = new org.telegram.ui.Components.j5(this, 350L, dsVar);
        this.f45823n = new org.telegram.ui.Components.j5(this, 350L, dsVar);
        this.f45828y = new Paint(1);
        this.f45820b = u6Var;
        this.f45819a = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23636s8, u6Var);
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
        org.telegram.ui.ActionBar.u6 u6Var = this.f45820b;
        if (peerColor == null) {
            this.d = true;
            int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23636s8, u6Var);
            this.f45822f = w02;
            this.e = w02;
        } else {
            if (u6Var != null) {
                q5 = u6Var.a();
            } else {
                q5 = org.telegram.ui.ActionBar.y6.I.q();
            }
            this.e = peerColor.getBgColor1(q5);
            this.f45822f = peerColor.getBgColor2(q5);
        }
        if (!z10) {
            this.h.a(this.e, true);
            this.f45823n.a(this.f45822f, true);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        int w02;
        boolean z10 = this.d;
        org.telegram.ui.Components.j5 j5Var = this.f45823n;
        org.telegram.ui.Components.j5 j5Var2 = this.h;
        if (z10 && (this.e != (w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23636s8, this.f45820b)) || this.f45822f != w02)) {
            this.f45822f = w02;
            this.e = w02;
            j5Var2.a(w02, true);
            j5Var.a(w02, true);
        }
        int a2 = j5Var2.a(this.e, false);
        int a10 = j5Var.a(this.f45822f, false);
        RadialGradient radialGradient = this.f45827x;
        Paint paint = this.f45828y;
        if (radialGradient == null || this.f45824r != a2 || this.f45825s != a10 || this.v != getWidth() || this.f45826w != getHeight()) {
            this.v = getWidth();
            this.f45826w = getHeight();
            float f7 = this.v;
            float f10 = this.f45826w;
            this.f45825s = a10;
            this.f45824r = a2;
            RadialGradient radialGradient2 = new RadialGradient(f7 / 2.0f, f10 * 0.4f, AndroidUtilities.distance(0.0f, 0.0f, f7, f10) * 0.75f, new int[]{a10, a2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.f45827x = radialGradient2;
            paint.setShader(radialGradient2);
            a();
        }
        if (this.f45821c < 1.0f && !this.E) {
            canvas2 = canvas;
            canvas2.drawColor(this.f45819a);
        } else {
            canvas2 = canvas;
        }
        if (this.E) {
            i10 = 255;
        } else {
            i10 = (int) (this.f45821c * 255.0f);
        }
        paint.setAlpha(i10);
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }

    public int getActionBarButtonColor() {
        int i10;
        int i11 = org.telegram.ui.ActionBar.y6.f23694v8;
        org.telegram.ui.ActionBar.u6 u6Var = this.f45820b;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i11, u6Var);
        if (this.d) {
            i10 = org.telegram.ui.ActionBar.y6.w0(i11, u6Var);
        } else {
            i10 = -1;
        }
        return i0.a.f(this.f45821c, w02, i10);
    }

    public int getColor() {
        return i0.a.f(this.f45821c, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23636s8, this.f45820b), i0.a.f(0.75f, this.h.f29480c, this.f45823n.f29480c));
    }

    public int getTabsViewBackgroundColor() {
        int b10;
        int b11;
        int i10 = org.telegram.ui.ActionBar.y6.f23636s8;
        org.telegram.ui.ActionBar.u6 u6Var = this.f45820b;
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.y6.w0(i10, u6Var)) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23694v8, u6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.y6.b(0.08f, -0.08f, org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
        }
        org.telegram.ui.Components.j5 j5Var = this.h;
        int i11 = j5Var.f29480c;
        org.telegram.ui.Components.j5 j5Var2 = this.f45823n;
        if (AndroidUtilities.computePerceivedBrightness(i0.a.f(0.75f, i11, j5Var2.f29480c)) > 0.721f) {
            b11 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23692v6, u6Var);
        } else {
            b11 = org.telegram.ui.ActionBar.y6.b(0.08f, -0.08f, i0.a.f(0.75f, j5Var.f29480c, j5Var2.f29480c));
        }
        return i0.a.f(this.f45821c, b10, b11);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (!this.F) {
            i11 = org.telegram.messenger.vh.D(230.0f, AndroidUtilities.statusBarHeight, 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    public void setProgressToGradient(float f7) {
        if (Math.abs(this.f45821c - f7) > 0.001f) {
            this.f45821c = f7;
            a();
            invalidate();
        }
    }

    public void a() {
    }
}
