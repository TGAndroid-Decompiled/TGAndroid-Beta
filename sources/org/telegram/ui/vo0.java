package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.MessagesController;
public final class vo0 {
    public boolean f43697f;
    public boolean f43698g;
    public boolean h;
    public Path f43699i;
    public Paint f43700j;
    public Drawable f43701k;
    public final org.telegram.ui.Components.uc f43702l;
    public boolean f43703m;
    public final org.telegram.ui.Components.d6 f43704n;
    public int f43705o;
    public final wo0 f43708r;
    public final Paint f43693a = new Paint(1);
    public final Paint f43694b = new Paint(1);
    public final Paint f43695c = new Paint(1);
    public final Path d = new Path();
    public final Path f43696e = new Path();
    public final RectF f43706p = new RectF();
    public final RectF f43707q = new RectF();

    public vo0(wo0 wo0Var) {
        this.f43708r = wo0Var;
        this.f43702l = new org.telegram.ui.Components.uc(wo0Var);
        this.f43704n = new org.telegram.ui.Components.d6(wo0Var, 0L, 320L, org.telegram.ui.Components.jr.h);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean a2;
        int color;
        wo0 wo0Var = this.f43708r;
        org.telegram.ui.ActionBar.c6 c6Var = wo0Var.f44341a;
        if (peerColor == null) {
            return;
        }
        if (c6Var == null) {
            a2 = org.telegram.ui.ActionBar.g6.I.q();
        } else {
            a2 = c6Var.a();
        }
        int i10 = wo0Var.f44343c;
        Paint paint = this.f43694b;
        Paint paint2 = this.f43693a;
        if (i10 == 1) {
            if (a2 && peerColor.hasColor2() && !peerColor.hasColor3()) {
                paint2.setColor(peerColor.getColor(1, c6Var));
                paint.setColor(peerColor.getColor(0, c6Var));
            } else {
                paint2.setColor(peerColor.getColor(0, c6Var));
                paint.setColor(peerColor.getColor(1, c6Var));
            }
            this.f43695c.setColor(peerColor.getColor(2, c6Var));
            this.f43697f = peerColor.hasColor2(a2);
            this.f43698g = peerColor.hasColor3(a2);
            return;
        }
        paint2.setColor(peerColor.getColor(0, c6Var));
        if (peerColor.hasColor6(a2)) {
            color = peerColor.getColor(1, c6Var);
        } else {
            color = peerColor.getColor(0, c6Var);
        }
        paint.setColor(color);
        this.f43697f = peerColor.hasColor6(a2);
        this.f43698g = false;
    }
}
