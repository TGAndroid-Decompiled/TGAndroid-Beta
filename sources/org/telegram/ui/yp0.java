package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.MessagesController;
public final class yp0 {
    public boolean f44530f;
    public boolean f44531g;
    public boolean h;
    public Path f44532i;
    public Paint f44533j;
    public Drawable f44534k;
    public final org.telegram.ui.Components.ad f44535l;
    public boolean f44536m;
    public final org.telegram.ui.Components.g6 f44537n;
    public int f44538o;
    public final zp0 f44541r;
    public final Paint f44526a = new Paint(1);
    public final Paint f44527b = new Paint(1);
    public final Paint f44528c = new Paint(1);
    public final Path d = new Path();
    public final Path f44529e = new Path();
    public final RectF f44539p = new RectF();
    public final RectF f44540q = new RectF();

    public yp0(zp0 zp0Var) {
        this.f44541r = zp0Var;
        this.f44535l = new org.telegram.ui.Components.ad(zp0Var);
        this.f44537n = new org.telegram.ui.Components.g6(zp0Var, 0L, 320L, org.telegram.ui.Components.js.h);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean a2;
        int color;
        zp0 zp0Var = this.f44541r;
        org.telegram.ui.ActionBar.c6 c6Var = zp0Var.f44899a;
        if (peerColor == null) {
            return;
        }
        if (c6Var == null) {
            a2 = org.telegram.ui.ActionBar.h6.I.q();
        } else {
            a2 = c6Var.a();
        }
        int i10 = zp0Var.f44901c;
        Paint paint = this.f44527b;
        Paint paint2 = this.f44526a;
        if (i10 == 1) {
            if (a2 && peerColor.hasColor2() && !peerColor.hasColor3()) {
                paint2.setColor(peerColor.getColor(1, c6Var));
                paint.setColor(peerColor.getColor(0, c6Var));
            } else {
                paint2.setColor(peerColor.getColor(0, c6Var));
                paint.setColor(peerColor.getColor(1, c6Var));
            }
            this.f44528c.setColor(peerColor.getColor(2, c6Var));
            this.f44530f = peerColor.hasColor2(a2);
            this.f44531g = peerColor.hasColor3(a2);
            return;
        }
        paint2.setColor(peerColor.getColor(0, c6Var));
        if (peerColor.hasColor6(a2)) {
            color = peerColor.getColor(1, c6Var);
        } else {
            color = peerColor.getColor(0, c6Var);
        }
        paint.setColor(color);
        this.f44530f = peerColor.hasColor6(a2);
        this.f44531g = false;
    }
}
