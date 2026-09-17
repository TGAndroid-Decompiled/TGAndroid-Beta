package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.MessagesController;
public final class yp0 {
    public boolean f39990f;
    public boolean f39991g;
    public boolean h;
    public Path f39992i;
    public Paint f39993j;
    public Drawable f39994k;
    public final org.telegram.ui.Components.wc f39995l;
    public boolean f39996m;
    public final org.telegram.ui.Components.c6 f39997n;
    public int f39998o;
    public final zp0 f40001r;
    public final Paint f39987a = new Paint(1);
    public final Paint f39988b = new Paint(1);
    public final Paint f39989c = new Paint(1);
    public final Path d = new Path();
    public final Path e = new Path();
    public final RectF f39999p = new RectF();
    public final RectF f40000q = new RectF();

    public yp0(zp0 zp0Var) {
        this.f40001r = zp0Var;
        this.f39995l = new org.telegram.ui.Components.wc(zp0Var);
        this.f39997n = new org.telegram.ui.Components.c6(zp0Var, 0L, 320L, org.telegram.ui.Components.qr.h);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean a2;
        int color;
        zp0 zp0Var = this.f40001r;
        org.telegram.ui.ActionBar.f6 f6Var = zp0Var.f40314a;
        if (peerColor == null) {
            return;
        }
        if (f6Var == null) {
            a2 = org.telegram.ui.ActionBar.j6.I.q();
        } else {
            a2 = f6Var.a();
        }
        int i10 = zp0Var.f40316c;
        Paint paint = this.f39988b;
        Paint paint2 = this.f39987a;
        if (i10 == 1) {
            if (a2 && peerColor.hasColor2() && !peerColor.hasColor3()) {
                paint2.setColor(peerColor.getColor(1, f6Var));
                paint.setColor(peerColor.getColor(0, f6Var));
            } else {
                paint2.setColor(peerColor.getColor(0, f6Var));
                paint.setColor(peerColor.getColor(1, f6Var));
            }
            this.f39989c.setColor(peerColor.getColor(2, f6Var));
            this.f39990f = peerColor.hasColor2(a2);
            this.f39991g = peerColor.hasColor3(a2);
            return;
        }
        paint2.setColor(peerColor.getColor(0, f6Var));
        if (peerColor.hasColor6(a2)) {
            color = peerColor.getColor(1, f6Var);
        } else {
            color = peerColor.getColor(0, f6Var);
        }
        paint.setColor(color);
        this.f39990f = peerColor.hasColor6(a2);
        this.f39991g = false;
    }
}
