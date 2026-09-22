package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.MessagesController;
public final class wp0 {
    public boolean f39356f;
    public boolean f39357g;
    public boolean h;
    public Path f39358i;
    public Paint f39359j;
    public Drawable f39360k;
    public final org.telegram.ui.Components.wc f39361l;
    public boolean f39362m;
    public final org.telegram.ui.Components.c6 f39363n;
    public int f39364o;
    public final xp0 f39367r;
    public final Paint f39353a = new Paint(1);
    public final Paint f39354b = new Paint(1);
    public final Paint f39355c = new Paint(1);
    public final Path d = new Path();
    public final Path e = new Path();
    public final RectF f39365p = new RectF();
    public final RectF f39366q = new RectF();

    public wp0(xp0 xp0Var) {
        this.f39367r = xp0Var;
        this.f39361l = new org.telegram.ui.Components.wc(xp0Var);
        this.f39363n = new org.telegram.ui.Components.c6(xp0Var, 0L, 320L, org.telegram.ui.Components.qr.h);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean a2;
        int color;
        xp0 xp0Var = this.f39367r;
        org.telegram.ui.ActionBar.e6 e6Var = xp0Var.f39667a;
        if (peerColor == null) {
            return;
        }
        if (e6Var == null) {
            a2 = org.telegram.ui.ActionBar.i6.I.q();
        } else {
            a2 = e6Var.a();
        }
        int i10 = xp0Var.f39669c;
        Paint paint = this.f39354b;
        Paint paint2 = this.f39353a;
        if (i10 == 1) {
            if (a2 && peerColor.hasColor2() && !peerColor.hasColor3()) {
                paint2.setColor(peerColor.getColor(1, e6Var));
                paint.setColor(peerColor.getColor(0, e6Var));
            } else {
                paint2.setColor(peerColor.getColor(0, e6Var));
                paint.setColor(peerColor.getColor(1, e6Var));
            }
            this.f39355c.setColor(peerColor.getColor(2, e6Var));
            this.f39356f = peerColor.hasColor2(a2);
            this.f39357g = peerColor.hasColor3(a2);
            return;
        }
        paint2.setColor(peerColor.getColor(0, e6Var));
        if (peerColor.hasColor6(a2)) {
            color = peerColor.getColor(1, e6Var);
        } else {
            color = peerColor.getColor(0, e6Var);
        }
        paint.setColor(color);
        this.f39356f = peerColor.hasColor6(a2);
        this.f39357g = false;
    }
}
