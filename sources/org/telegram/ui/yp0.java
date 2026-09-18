package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.MessagesController;
public final class yp0 {
    public boolean f39864f;
    public boolean f39865g;
    public boolean h;
    public Path f39866i;
    public Paint f39867j;
    public Drawable f39868k;
    public final org.telegram.ui.Components.yc f39869l;
    public boolean f39870m;
    public final org.telegram.ui.Components.e6 f39871n;
    public int f39872o;
    public final zp0 f39875r;
    public final Paint f39861a = new Paint(1);
    public final Paint f39862b = new Paint(1);
    public final Paint f39863c = new Paint(1);
    public final Path d = new Path();
    public final Path e = new Path();
    public final RectF f39873p = new RectF();
    public final RectF f39874q = new RectF();

    public yp0(zp0 zp0Var) {
        this.f39875r = zp0Var;
        this.f39869l = new org.telegram.ui.Components.yc(zp0Var);
        this.f39871n = new org.telegram.ui.Components.e6(zp0Var, 0L, 320L, org.telegram.ui.Components.qr.h);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean a2;
        int color;
        zp0 zp0Var = this.f39875r;
        org.telegram.ui.ActionBar.e6 e6Var = zp0Var.f40537a;
        if (peerColor == null) {
            return;
        }
        if (e6Var == null) {
            a2 = org.telegram.ui.ActionBar.j6.I.q();
        } else {
            a2 = e6Var.a();
        }
        int i10 = zp0Var.f40539c;
        Paint paint = this.f39862b;
        Paint paint2 = this.f39861a;
        if (i10 == 1) {
            if (a2 && peerColor.hasColor2() && !peerColor.hasColor3()) {
                paint2.setColor(peerColor.getColor(1, e6Var));
                paint.setColor(peerColor.getColor(0, e6Var));
            } else {
                paint2.setColor(peerColor.getColor(0, e6Var));
                paint.setColor(peerColor.getColor(1, e6Var));
            }
            this.f39863c.setColor(peerColor.getColor(2, e6Var));
            this.f39864f = peerColor.hasColor2(a2);
            this.f39865g = peerColor.hasColor3(a2);
            return;
        }
        paint2.setColor(peerColor.getColor(0, e6Var));
        if (peerColor.hasColor6(a2)) {
            color = peerColor.getColor(1, e6Var);
        } else {
            color = peerColor.getColor(0, e6Var);
        }
        paint.setColor(color);
        this.f39864f = peerColor.hasColor6(a2);
        this.f39865g = false;
    }
}
