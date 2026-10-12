package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.MessagesController;
public final class yp0 {
    public boolean f44525f;
    public boolean f44526g;
    public boolean h;
    public Path f44527i;
    public Paint f44528j;
    public Drawable f44529k;
    public final org.telegram.ui.Components.ad f44530l;
    public boolean f44531m;
    public final org.telegram.ui.Components.g6 f44532n;
    public int f44533o;
    public final zp0 f44536r;
    public final Paint f44521a = new Paint(1);
    public final Paint f44522b = new Paint(1);
    public final Paint f44523c = new Paint(1);
    public final Path d = new Path();
    public final Path f44524e = new Path();
    public final RectF f44534p = new RectF();
    public final RectF f44535q = new RectF();

    public yp0(zp0 zp0Var) {
        this.f44536r = zp0Var;
        this.f44530l = new org.telegram.ui.Components.ad(zp0Var);
        this.f44532n = new org.telegram.ui.Components.g6(zp0Var, 0L, 320L, org.telegram.ui.Components.js.h);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean a2;
        int color;
        zp0 zp0Var = this.f44536r;
        org.telegram.ui.ActionBar.c6 c6Var = zp0Var.f44894a;
        if (peerColor == null) {
            return;
        }
        if (c6Var == null) {
            a2 = org.telegram.ui.ActionBar.h6.I.q();
        } else {
            a2 = c6Var.a();
        }
        int i10 = zp0Var.f44896c;
        Paint paint = this.f44522b;
        Paint paint2 = this.f44521a;
        if (i10 == 1) {
            if (a2 && peerColor.hasColor2() && !peerColor.hasColor3()) {
                paint2.setColor(peerColor.getColor(1, c6Var));
                paint.setColor(peerColor.getColor(0, c6Var));
            } else {
                paint2.setColor(peerColor.getColor(0, c6Var));
                paint.setColor(peerColor.getColor(1, c6Var));
            }
            this.f44523c.setColor(peerColor.getColor(2, c6Var));
            this.f44525f = peerColor.hasColor2(a2);
            this.f44526g = peerColor.hasColor3(a2);
            return;
        }
        paint2.setColor(peerColor.getColor(0, c6Var));
        if (peerColor.hasColor6(a2)) {
            color = peerColor.getColor(1, c6Var);
        } else {
            color = peerColor.getColor(0, c6Var);
        }
        paint.setColor(color);
        this.f44525f = peerColor.hasColor6(a2);
        this.f44526g = false;
    }
}
