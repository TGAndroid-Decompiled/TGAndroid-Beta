package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.MessagesController;
public final class vp0 {
    public boolean f43140f;
    public boolean f43141g;
    public boolean h;
    public Path f43142i;
    public Paint f43143j;
    public Drawable f43144k;
    public final org.telegram.ui.Components.bd f43145l;
    public boolean f43146m;
    public final org.telegram.ui.Components.g6 f43147n;
    public int f43148o;
    public final wp0 f43151r;
    public final Paint f43136a = new Paint(1);
    public final Paint f43137b = new Paint(1);
    public final Paint f43138c = new Paint(1);
    public final Path d = new Path();
    public final Path f43139e = new Path();
    public final RectF f43149p = new RectF();
    public final RectF f43150q = new RectF();

    public vp0(wp0 wp0Var) {
        this.f43151r = wp0Var;
        this.f43145l = new org.telegram.ui.Components.bd(wp0Var);
        this.f43147n = new org.telegram.ui.Components.g6(wp0Var, 0L, 320L, org.telegram.ui.Components.is.h);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean a2;
        int color;
        wp0 wp0Var = this.f43151r;
        org.telegram.ui.ActionBar.d6 d6Var = wp0Var.f43878a;
        if (peerColor == null) {
            return;
        }
        if (d6Var == null) {
            a2 = org.telegram.ui.ActionBar.h6.I.q();
        } else {
            a2 = d6Var.a();
        }
        int i10 = wp0Var.f43880c;
        Paint paint = this.f43137b;
        Paint paint2 = this.f43136a;
        if (i10 == 1) {
            if (a2 && peerColor.hasColor2() && !peerColor.hasColor3()) {
                paint2.setColor(peerColor.getColor(1, d6Var));
                paint.setColor(peerColor.getColor(0, d6Var));
            } else {
                paint2.setColor(peerColor.getColor(0, d6Var));
                paint.setColor(peerColor.getColor(1, d6Var));
            }
            this.f43138c.setColor(peerColor.getColor(2, d6Var));
            this.f43140f = peerColor.hasColor2(a2);
            this.f43141g = peerColor.hasColor3(a2);
            return;
        }
        paint2.setColor(peerColor.getColor(0, d6Var));
        if (peerColor.hasColor6(a2)) {
            color = peerColor.getColor(1, d6Var);
        } else {
            color = peerColor.getColor(0, d6Var);
        }
        paint.setColor(color);
        this.f43140f = peerColor.hasColor6(a2);
        this.f43141g = false;
    }
}
