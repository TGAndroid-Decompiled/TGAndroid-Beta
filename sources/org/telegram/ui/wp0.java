package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.MessagesController;
public final class wp0 {
    public boolean f43775f;
    public boolean f43776g;
    public boolean h;
    public Path f43777i;
    public Paint f43778j;
    public Drawable f43779k;
    public final org.telegram.ui.Components.bd f43780l;
    public boolean f43781m;
    public final org.telegram.ui.Components.g6 f43782n;
    public int f43783o;
    public final xp0 f43786r;
    public final Paint f43771a = new Paint(1);
    public final Paint f43772b = new Paint(1);
    public final Paint f43773c = new Paint(1);
    public final Path d = new Path();
    public final Path f43774e = new Path();
    public final RectF f43784p = new RectF();
    public final RectF f43785q = new RectF();

    public wp0(xp0 xp0Var) {
        this.f43786r = xp0Var;
        this.f43780l = new org.telegram.ui.Components.bd(xp0Var);
        this.f43782n = new org.telegram.ui.Components.g6(xp0Var, 0L, 320L, org.telegram.ui.Components.is.h);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean a2;
        int color;
        xp0 xp0Var = this.f43786r;
        org.telegram.ui.ActionBar.e6 e6Var = xp0Var.f44155a;
        if (peerColor == null) {
            return;
        }
        if (e6Var == null) {
            a2 = org.telegram.ui.ActionBar.i6.I.q();
        } else {
            a2 = e6Var.a();
        }
        int i10 = xp0Var.f44157c;
        Paint paint = this.f43772b;
        Paint paint2 = this.f43771a;
        if (i10 == 1) {
            if (a2 && peerColor.hasColor2() && !peerColor.hasColor3()) {
                paint2.setColor(peerColor.getColor(1, e6Var));
                paint.setColor(peerColor.getColor(0, e6Var));
            } else {
                paint2.setColor(peerColor.getColor(0, e6Var));
                paint.setColor(peerColor.getColor(1, e6Var));
            }
            this.f43773c.setColor(peerColor.getColor(2, e6Var));
            this.f43775f = peerColor.hasColor2(a2);
            this.f43776g = peerColor.hasColor3(a2);
            return;
        }
        paint2.setColor(peerColor.getColor(0, e6Var));
        if (peerColor.hasColor6(a2)) {
            color = peerColor.getColor(1, e6Var);
        } else {
            color = peerColor.getColor(0, e6Var);
        }
        paint.setColor(color);
        this.f43775f = peerColor.hasColor6(a2);
        this.f43776g = false;
    }
}
