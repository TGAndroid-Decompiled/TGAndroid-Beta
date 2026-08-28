package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.MessagesController;
public final class wo0 {
    public boolean f44223f;
    public boolean f44224g;
    public boolean h;
    public Path f44225i;
    public Paint f44226j;
    public Drawable f44227k;
    public final org.telegram.ui.Components.pc f44228l;
    public boolean f44229m;
    public final org.telegram.ui.Components.y5 f44230n;
    public int f44231o;
    public final xo0 f44234r;
    public final Paint f44219a = new Paint(1);
    public final Paint f44220b = new Paint(1);
    public final Paint f44221c = new Paint(1);
    public final Path d = new Path();
    public final Path f44222e = new Path();
    public final RectF f44232p = new RectF();
    public final RectF f44233q = new RectF();

    public wo0(xo0 xo0Var) {
        this.f44234r = xo0Var;
        this.f44228l = new org.telegram.ui.Components.pc(xo0Var);
        this.f44230n = new org.telegram.ui.Components.y5(xo0Var, 0L, 320L, org.telegram.ui.Components.gr.h);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean a2;
        int color;
        xo0 xo0Var = this.f44234r;
        org.telegram.ui.ActionBar.b6 b6Var = xo0Var.f44557a;
        if (peerColor == null) {
            return;
        }
        if (b6Var == null) {
            a2 = org.telegram.ui.ActionBar.f6.I.q();
        } else {
            a2 = b6Var.a();
        }
        int i9 = xo0Var.f44559c;
        Paint paint = this.f44220b;
        Paint paint2 = this.f44219a;
        if (i9 == 1) {
            if (a2 && peerColor.hasColor2() && !peerColor.hasColor3()) {
                paint2.setColor(peerColor.getColor(1, b6Var));
                paint.setColor(peerColor.getColor(0, b6Var));
            } else {
                paint2.setColor(peerColor.getColor(0, b6Var));
                paint.setColor(peerColor.getColor(1, b6Var));
            }
            this.f44221c.setColor(peerColor.getColor(2, b6Var));
            this.f44223f = peerColor.hasColor2(a2);
            this.f44224g = peerColor.hasColor3(a2);
            return;
        }
        paint2.setColor(peerColor.getColor(0, b6Var));
        if (peerColor.hasColor6(a2)) {
            color = peerColor.getColor(1, b6Var);
        } else {
            color = peerColor.getColor(0, b6Var);
        }
        paint.setColor(color);
        this.f44223f = peerColor.hasColor6(a2);
        this.f44224g = false;
    }
}
