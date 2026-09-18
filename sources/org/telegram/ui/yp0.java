package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.MessagesController;
public final class yp0 {
    public boolean f39995f;
    public boolean f39996g;
    public boolean h;
    public Path f39997i;
    public Paint f39998j;
    public Drawable f39999k;
    public final org.telegram.ui.Components.wc f40000l;
    public boolean f40001m;
    public final org.telegram.ui.Components.c6 f40002n;
    public int f40003o;
    public final zp0 f40006r;
    public final Paint f39992a = new Paint(1);
    public final Paint f39993b = new Paint(1);
    public final Paint f39994c = new Paint(1);
    public final Path d = new Path();
    public final Path e = new Path();
    public final RectF f40004p = new RectF();
    public final RectF f40005q = new RectF();

    public yp0(zp0 zp0Var) {
        this.f40006r = zp0Var;
        this.f40000l = new org.telegram.ui.Components.wc(zp0Var);
        this.f40002n = new org.telegram.ui.Components.c6(zp0Var, 0L, 320L, org.telegram.ui.Components.qr.h);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean a2;
        int color;
        zp0 zp0Var = this.f40006r;
        org.telegram.ui.ActionBar.f6 f6Var = zp0Var.f40319a;
        if (peerColor == null) {
            return;
        }
        if (f6Var == null) {
            a2 = org.telegram.ui.ActionBar.j6.I.q();
        } else {
            a2 = f6Var.a();
        }
        int i10 = zp0Var.f40321c;
        Paint paint = this.f39993b;
        Paint paint2 = this.f39992a;
        if (i10 == 1) {
            if (a2 && peerColor.hasColor2() && !peerColor.hasColor3()) {
                paint2.setColor(peerColor.getColor(1, f6Var));
                paint.setColor(peerColor.getColor(0, f6Var));
            } else {
                paint2.setColor(peerColor.getColor(0, f6Var));
                paint.setColor(peerColor.getColor(1, f6Var));
            }
            this.f39994c.setColor(peerColor.getColor(2, f6Var));
            this.f39995f = peerColor.hasColor2(a2);
            this.f39996g = peerColor.hasColor3(a2);
            return;
        }
        paint2.setColor(peerColor.getColor(0, f6Var));
        if (peerColor.hasColor6(a2)) {
            color = peerColor.getColor(1, f6Var);
        } else {
            color = peerColor.getColor(0, f6Var);
        }
        paint.setColor(color);
        this.f39995f = peerColor.hasColor6(a2);
        this.f39996g = false;
    }
}
