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
    public int f40550a;
    public final org.telegram.ui.ActionBar.d6 f40551b;
    public float f40552c;
    public boolean d;
    public int e;
    public int f40553f;
    public final org.telegram.ui.Components.h5 h;
    public final org.telegram.ui.Components.h5 f40554n;
    public int f40555r;
    public int f40556s;
    public int v;
    public int f40557w;
    public RadialGradient f40558x;
    public final Paint f40559y;

    public zo0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f40552c = 0.0f;
        org.telegram.ui.Components.sr srVar = org.telegram.ui.Components.sr.h;
        this.h = new org.telegram.ui.Components.h5(this, 350L, srVar);
        this.f40554n = new org.telegram.ui.Components.h5(this, 350L, srVar);
        this.f40559y = new Paint(1);
        this.f40551b = d6Var;
        this.f40550a = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19337s8, d6Var);
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
        org.telegram.ui.ActionBar.d6 d6Var = this.f40551b;
        if (peerColor == null) {
            this.d = true;
            int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19337s8, d6Var);
            this.f40553f = v02;
            this.e = v02;
        } else {
            if (d6Var != null) {
                q6 = d6Var.a();
            } else {
                q6 = org.telegram.ui.ActionBar.h6.I.q();
            }
            this.e = peerColor.getBgColor1(q6);
            this.f40553f = peerColor.getBgColor2(q6);
        }
        if (!z10) {
            this.h.a(this.e, true);
            this.f40554n.a(this.f40553f, true);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        int a2 = this.h.a(this.e, false);
        int a10 = this.f40554n.a(this.f40553f, false);
        RadialGradient radialGradient = this.f40558x;
        Paint paint = this.f40559y;
        if (radialGradient == null || this.f40555r != a2 || this.f40556s != a10 || this.v != getWidth() || this.f40557w != getHeight()) {
            this.v = getWidth();
            this.f40557w = getHeight();
            float f7 = this.v;
            float f10 = this.f40557w;
            this.f40556s = a10;
            this.f40555r = a2;
            RadialGradient radialGradient2 = new RadialGradient(f7 / 2.0f, f10 * 0.4f, AndroidUtilities.distance(0.0f, 0.0f, f7, f10) * 0.75f, new int[]{a10, a2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.f40558x = radialGradient2;
            paint.setShader(radialGradient2);
            a();
        }
        if (this.f40552c < 1.0f && !this.E) {
            canvas2 = canvas;
            canvas2.drawColor(this.f40550a);
        } else {
            canvas2 = canvas;
        }
        if (this.E) {
            i10 = 255;
        } else {
            i10 = (int) (this.f40552c * 255.0f);
        }
        paint.setAlpha(i10);
        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
    }

    public int getActionBarButtonColor() {
        int i10;
        int i11 = org.telegram.ui.ActionBar.h6.f19392v8;
        org.telegram.ui.ActionBar.d6 d6Var = this.f40551b;
        int v02 = org.telegram.ui.ActionBar.h6.v0(i11, d6Var);
        if (this.d) {
            i10 = org.telegram.ui.ActionBar.h6.v0(i11, d6Var);
        } else {
            i10 = -1;
        }
        return i0.a.d(this.f40552c, v02, i10);
    }

    public int getColor() {
        return i0.a.d(this.f40552c, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19337s8, this.f40551b), i0.a.d(0.75f, this.h.f24673c, this.f40554n.f24673c));
    }

    public int getTabsViewBackgroundColor() {
        int b10;
        int b11;
        int i10 = org.telegram.ui.ActionBar.h6.f19337s8;
        org.telegram.ui.ActionBar.d6 d6Var = this.f40551b;
        if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.v0(i10, d6Var)) > 0.721f) {
            b10 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19392v8, d6Var);
        } else {
            b10 = org.telegram.ui.ActionBar.h6.b(0.08f, -0.08f, org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
        }
        org.telegram.ui.Components.h5 h5Var = this.h;
        int i11 = h5Var.f24673c;
        org.telegram.ui.Components.h5 h5Var2 = this.f40554n;
        if (AndroidUtilities.computePerceivedBrightness(i0.a.d(0.75f, i11, h5Var2.f24673c)) > 0.721f) {
            b11 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19390v6, d6Var);
        } else {
            b11 = org.telegram.ui.ActionBar.h6.b(0.08f, -0.08f, i0.a.d(0.75f, h5Var.f24673c, h5Var2.f24673c));
        }
        return i0.a.d(this.f40552c, b10, b11);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (!this.F) {
            i11 = org.telegram.messenger.ok.C(230.0f, AndroidUtilities.statusBarHeight, 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    public void setProgressToGradient(float f7) {
        if (Math.abs(this.f40552c - f7) > 0.001f) {
            this.f40552c = f7;
            a();
            invalidate();
        }
    }

    public void a() {
    }
}
