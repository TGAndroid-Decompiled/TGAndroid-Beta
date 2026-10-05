package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.MessagesController;
public final class sp0 {
    public boolean f40607f;
    public boolean f40608g;
    public boolean h;
    public Path f40609i;
    public Paint f40610j;
    public Drawable f40611k;
    public final org.telegram.ui.Components.zc f40612l;
    public boolean f40613m;
    public final org.telegram.ui.Components.e6 f40614n;
    public int f40615o;
    public final tp0 f40618r;
    public final Paint f40603a = new Paint(1);
    public final Paint f40604b = new Paint(1);
    public final Paint f40605c = new Paint(1);
    public final Path d = new Path();
    public final Path f40606e = new Path();
    public final RectF f40616p = new RectF();
    public final RectF f40617q = new RectF();

    public sp0(tp0 tp0Var) {
        this.f40618r = tp0Var;
        this.f40612l = new org.telegram.ui.Components.zc(tp0Var);
        this.f40614n = new org.telegram.ui.Components.e6(tp0Var, 0L, 320L, org.telegram.ui.Components.tr.h);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean a2;
        int color;
        tp0 tp0Var = this.f40618r;
        org.telegram.ui.ActionBar.d6 d6Var = tp0Var.f40993a;
        if (peerColor == null) {
            return;
        }
        if (d6Var == null) {
            a2 = org.telegram.ui.ActionBar.i6.I.q();
        } else {
            a2 = d6Var.a();
        }
        int i10 = tp0Var.f40995c;
        Paint paint = this.f40604b;
        Paint paint2 = this.f40603a;
        if (i10 == 1) {
            if (a2 && peerColor.hasColor2() && !peerColor.hasColor3()) {
                paint2.setColor(peerColor.getColor(1, d6Var));
                paint.setColor(peerColor.getColor(0, d6Var));
            } else {
                paint2.setColor(peerColor.getColor(0, d6Var));
                paint.setColor(peerColor.getColor(1, d6Var));
            }
            this.f40605c.setColor(peerColor.getColor(2, d6Var));
            this.f40607f = peerColor.hasColor2(a2);
            this.f40608g = peerColor.hasColor3(a2);
            return;
        }
        paint2.setColor(peerColor.getColor(0, d6Var));
        if (peerColor.hasColor6(a2)) {
            color = peerColor.getColor(1, d6Var);
        } else {
            color = peerColor.getColor(0, d6Var);
        }
        paint.setColor(color);
        this.f40607f = peerColor.hasColor6(a2);
        this.f40608g = false;
    }
}
