package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.MessagesController;
public final class wp0 {
    public boolean f38301f;
    public boolean f38302g;
    public boolean h;
    public Path f38303i;
    public Paint f38304j;
    public Drawable f38305k;
    public final org.telegram.ui.Components.xc f38306l;
    public boolean f38307m;
    public final org.telegram.ui.Components.d6 f38308n;
    public int f38309o;
    public final xp0 f38312r;
    public final Paint f38298a = new Paint(1);
    public final Paint f38299b = new Paint(1);
    public final Paint f38300c = new Paint(1);
    public final Path d = new Path();
    public final Path e = new Path();
    public final RectF f38310p = new RectF();
    public final RectF f38311q = new RectF();

    public wp0(xp0 xp0Var) {
        this.f38312r = xp0Var;
        this.f38306l = new org.telegram.ui.Components.xc(xp0Var);
        this.f38308n = new org.telegram.ui.Components.d6(xp0Var, 0L, 320L, org.telegram.ui.Components.wr.h);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean a2;
        int color;
        xp0 xp0Var = this.f38312r;
        org.telegram.ui.ActionBar.f6 f6Var = xp0Var.f38789a;
        if (peerColor == null) {
            return;
        }
        if (f6Var == null) {
            a2 = org.telegram.ui.ActionBar.j6.I.q();
        } else {
            a2 = f6Var.a();
        }
        int i10 = xp0Var.f38791c;
        Paint paint = this.f38299b;
        Paint paint2 = this.f38298a;
        if (i10 == 1) {
            if (a2 && peerColor.hasColor2() && !peerColor.hasColor3()) {
                paint2.setColor(peerColor.getColor(1, f6Var));
                paint.setColor(peerColor.getColor(0, f6Var));
            } else {
                paint2.setColor(peerColor.getColor(0, f6Var));
                paint.setColor(peerColor.getColor(1, f6Var));
            }
            this.f38300c.setColor(peerColor.getColor(2, f6Var));
            this.f38301f = peerColor.hasColor2(a2);
            this.f38302g = peerColor.hasColor3(a2);
            return;
        }
        paint2.setColor(peerColor.getColor(0, f6Var));
        if (peerColor.hasColor6(a2)) {
            color = peerColor.getColor(1, f6Var);
        } else {
            color = peerColor.getColor(0, f6Var);
        }
        paint.setColor(color);
        this.f38301f = peerColor.hasColor6(a2);
        this.f38302g = false;
    }
}
