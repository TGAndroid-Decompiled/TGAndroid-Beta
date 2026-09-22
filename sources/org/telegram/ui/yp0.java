package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.MessagesController;
public final class yp0 {
    public boolean f40000f;
    public boolean f40001g;
    public boolean h;
    public Path f40002i;
    public Paint f40003j;
    public Drawable f40004k;
    public final org.telegram.ui.Components.yc f40005l;
    public boolean f40006m;
    public final org.telegram.ui.Components.d6 f40007n;
    public int f40008o;
    public final zp0 f40011r;
    public final Paint f39997a = new Paint(1);
    public final Paint f39998b = new Paint(1);
    public final Paint f39999c = new Paint(1);
    public final Path d = new Path();
    public final Path e = new Path();
    public final RectF f40009p = new RectF();
    public final RectF f40010q = new RectF();

    public yp0(zp0 zp0Var) {
        this.f40011r = zp0Var;
        this.f40005l = new org.telegram.ui.Components.yc(zp0Var);
        this.f40007n = new org.telegram.ui.Components.d6(zp0Var, 0L, 320L, org.telegram.ui.Components.qr.h);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean a2;
        int color;
        zp0 zp0Var = this.f40011r;
        org.telegram.ui.ActionBar.f6 f6Var = zp0Var.f40600a;
        if (peerColor == null) {
            return;
        }
        if (f6Var == null) {
            a2 = org.telegram.ui.ActionBar.j6.I.q();
        } else {
            a2 = f6Var.a();
        }
        int i10 = zp0Var.f40602c;
        Paint paint = this.f39998b;
        Paint paint2 = this.f39997a;
        if (i10 == 1) {
            if (a2 && peerColor.hasColor2() && !peerColor.hasColor3()) {
                paint2.setColor(peerColor.getColor(1, f6Var));
                paint.setColor(peerColor.getColor(0, f6Var));
            } else {
                paint2.setColor(peerColor.getColor(0, f6Var));
                paint.setColor(peerColor.getColor(1, f6Var));
            }
            this.f39999c.setColor(peerColor.getColor(2, f6Var));
            this.f40000f = peerColor.hasColor2(a2);
            this.f40001g = peerColor.hasColor3(a2);
            return;
        }
        paint2.setColor(peerColor.getColor(0, f6Var));
        if (peerColor.hasColor6(a2)) {
            color = peerColor.getColor(1, f6Var);
        } else {
            color = peerColor.getColor(0, f6Var);
        }
        paint.setColor(color);
        this.f40000f = peerColor.hasColor6(a2);
        this.f40001g = false;
    }
}
