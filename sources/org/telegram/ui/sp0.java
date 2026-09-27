package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.MessagesController;
public final class sp0 {
    public boolean f37553f;
    public boolean f37554g;
    public boolean h;
    public Path f37555i;
    public Paint f37556j;
    public Drawable f37557k;
    public final org.telegram.ui.Components.yc f37558l;
    public boolean f37559m;
    public final org.telegram.ui.Components.e6 f37560n;
    public int f37561o;
    public final tp0 f37564r;
    public final Paint f37550a = new Paint(1);
    public final Paint f37551b = new Paint(1);
    public final Paint f37552c = new Paint(1);
    public final Path d = new Path();
    public final Path e = new Path();
    public final RectF f37562p = new RectF();
    public final RectF f37563q = new RectF();

    public sp0(tp0 tp0Var) {
        this.f37564r = tp0Var;
        this.f37558l = new org.telegram.ui.Components.yc(tp0Var);
        this.f37560n = new org.telegram.ui.Components.e6(tp0Var, 0L, 320L, org.telegram.ui.Components.sr.h);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean a2;
        int color;
        tp0 tp0Var = this.f37564r;
        org.telegram.ui.ActionBar.e6 e6Var = tp0Var.f37884a;
        if (peerColor == null) {
            return;
        }
        if (e6Var == null) {
            a2 = org.telegram.ui.ActionBar.i6.I.q();
        } else {
            a2 = e6Var.a();
        }
        int i10 = tp0Var.f37886c;
        Paint paint = this.f37551b;
        Paint paint2 = this.f37550a;
        if (i10 == 1) {
            if (a2 && peerColor.hasColor2() && !peerColor.hasColor3()) {
                paint2.setColor(peerColor.getColor(1, e6Var));
                paint.setColor(peerColor.getColor(0, e6Var));
            } else {
                paint2.setColor(peerColor.getColor(0, e6Var));
                paint.setColor(peerColor.getColor(1, e6Var));
            }
            this.f37552c.setColor(peerColor.getColor(2, e6Var));
            this.f37553f = peerColor.hasColor2(a2);
            this.f37554g = peerColor.hasColor3(a2);
            return;
        }
        paint2.setColor(peerColor.getColor(0, e6Var));
        if (peerColor.hasColor6(a2)) {
            color = peerColor.getColor(1, e6Var);
        } else {
            color = peerColor.getColor(0, e6Var);
        }
        paint.setColor(color);
        this.f37553f = peerColor.hasColor6(a2);
        this.f37554g = false;
    }
}
