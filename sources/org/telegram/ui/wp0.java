package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.MessagesController;
public final class wp0 {
    public boolean f39360f;
    public boolean f39361g;
    public boolean h;
    public Path f39362i;
    public Paint f39363j;
    public Drawable f39364k;
    public final org.telegram.ui.Components.wc f39365l;
    public boolean f39366m;
    public final org.telegram.ui.Components.c6 f39367n;
    public int f39368o;
    public final xp0 f39371r;
    public final Paint f39357a = new Paint(1);
    public final Paint f39358b = new Paint(1);
    public final Paint f39359c = new Paint(1);
    public final Path d = new Path();
    public final Path e = new Path();
    public final RectF f39369p = new RectF();
    public final RectF f39370q = new RectF();

    public wp0(xp0 xp0Var) {
        this.f39371r = xp0Var;
        this.f39365l = new org.telegram.ui.Components.wc(xp0Var);
        this.f39367n = new org.telegram.ui.Components.c6(xp0Var, 0L, 320L, org.telegram.ui.Components.qr.h);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean a2;
        int color;
        xp0 xp0Var = this.f39371r;
        org.telegram.ui.ActionBar.e6 e6Var = xp0Var.f39654a;
        if (peerColor == null) {
            return;
        }
        if (e6Var == null) {
            a2 = org.telegram.ui.ActionBar.i6.I.q();
        } else {
            a2 = e6Var.a();
        }
        int i10 = xp0Var.f39656c;
        Paint paint = this.f39358b;
        Paint paint2 = this.f39357a;
        if (i10 == 1) {
            if (a2 && peerColor.hasColor2() && !peerColor.hasColor3()) {
                paint2.setColor(peerColor.getColor(1, e6Var));
                paint.setColor(peerColor.getColor(0, e6Var));
            } else {
                paint2.setColor(peerColor.getColor(0, e6Var));
                paint.setColor(peerColor.getColor(1, e6Var));
            }
            this.f39359c.setColor(peerColor.getColor(2, e6Var));
            this.f39360f = peerColor.hasColor2(a2);
            this.f39361g = peerColor.hasColor3(a2);
            return;
        }
        paint2.setColor(peerColor.getColor(0, e6Var));
        if (peerColor.hasColor6(a2)) {
            color = peerColor.getColor(1, e6Var);
        } else {
            color = peerColor.getColor(0, e6Var);
        }
        paint.setColor(color);
        this.f39360f = peerColor.hasColor6(a2);
        this.f39361g = false;
    }
}
