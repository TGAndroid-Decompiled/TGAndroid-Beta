package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.MessagesController;
public final class qp0 {
    public boolean f36530f;
    public boolean f36531g;
    public boolean h;
    public Path f36532i;
    public Paint f36533j;
    public Drawable f36534k;
    public final org.telegram.ui.Components.yc f36535l;
    public boolean f36536m;
    public final org.telegram.ui.Components.e6 f36537n;
    public int f36538o;
    public final rp0 f36541r;
    public final Paint f36527a = new Paint(1);
    public final Paint f36528b = new Paint(1);
    public final Paint f36529c = new Paint(1);
    public final Path d = new Path();
    public final Path e = new Path();
    public final RectF f36539p = new RectF();
    public final RectF f36540q = new RectF();

    public qp0(rp0 rp0Var) {
        this.f36541r = rp0Var;
        this.f36535l = new org.telegram.ui.Components.yc(rp0Var);
        this.f36537n = new org.telegram.ui.Components.e6(rp0Var, 0L, 320L, org.telegram.ui.Components.rr.h);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean a2;
        int color;
        rp0 rp0Var = this.f36541r;
        org.telegram.ui.ActionBar.d6 d6Var = rp0Var.f36906a;
        if (peerColor == null) {
            return;
        }
        if (d6Var == null) {
            a2 = org.telegram.ui.ActionBar.h6.I.q();
        } else {
            a2 = d6Var.a();
        }
        int i10 = rp0Var.f36908c;
        Paint paint = this.f36528b;
        Paint paint2 = this.f36527a;
        if (i10 == 1) {
            if (a2 && peerColor.hasColor2() && !peerColor.hasColor3()) {
                paint2.setColor(peerColor.getColor(1, d6Var));
                paint.setColor(peerColor.getColor(0, d6Var));
            } else {
                paint2.setColor(peerColor.getColor(0, d6Var));
                paint.setColor(peerColor.getColor(1, d6Var));
            }
            this.f36529c.setColor(peerColor.getColor(2, d6Var));
            this.f36530f = peerColor.hasColor2(a2);
            this.f36531g = peerColor.hasColor3(a2);
            return;
        }
        paint2.setColor(peerColor.getColor(0, d6Var));
        if (peerColor.hasColor6(a2)) {
            color = peerColor.getColor(1, d6Var);
        } else {
            color = peerColor.getColor(0, d6Var);
        }
        paint.setColor(color);
        this.f36530f = peerColor.hasColor6(a2);
        this.f36531g = false;
    }
}
