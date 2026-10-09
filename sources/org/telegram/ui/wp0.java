package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.MessagesController;
public final class wp0 {
    public boolean f43731f;
    public boolean f43732g;
    public boolean h;
    public Path f43733i;
    public Paint f43734j;
    public Drawable f43735k;
    public final org.telegram.ui.Components.bd f43736l;
    public boolean f43737m;
    public final org.telegram.ui.Components.g6 f43738n;
    public int f43739o;
    public final xp0 f43742r;
    public final Paint f43727a = new Paint(1);
    public final Paint f43728b = new Paint(1);
    public final Paint f43729c = new Paint(1);
    public final Path d = new Path();
    public final Path f43730e = new Path();
    public final RectF f43740p = new RectF();
    public final RectF f43741q = new RectF();

    public wp0(xp0 xp0Var) {
        this.f43742r = xp0Var;
        this.f43736l = new org.telegram.ui.Components.bd(xp0Var);
        this.f43738n = new org.telegram.ui.Components.g6(xp0Var, 0L, 320L, org.telegram.ui.Components.hs.h);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean a2;
        int color;
        xp0 xp0Var = this.f43742r;
        org.telegram.ui.ActionBar.e6 e6Var = xp0Var.f44111a;
        if (peerColor == null) {
            return;
        }
        if (e6Var == null) {
            a2 = org.telegram.ui.ActionBar.i6.I.q();
        } else {
            a2 = e6Var.a();
        }
        int i10 = xp0Var.f44113c;
        Paint paint = this.f43728b;
        Paint paint2 = this.f43727a;
        if (i10 == 1) {
            if (a2 && peerColor.hasColor2() && !peerColor.hasColor3()) {
                paint2.setColor(peerColor.getColor(1, e6Var));
                paint.setColor(peerColor.getColor(0, e6Var));
            } else {
                paint2.setColor(peerColor.getColor(0, e6Var));
                paint.setColor(peerColor.getColor(1, e6Var));
            }
            this.f43729c.setColor(peerColor.getColor(2, e6Var));
            this.f43731f = peerColor.hasColor2(a2);
            this.f43732g = peerColor.hasColor3(a2);
            return;
        }
        paint2.setColor(peerColor.getColor(0, e6Var));
        if (peerColor.hasColor6(a2)) {
            color = peerColor.getColor(1, e6Var);
        } else {
            color = peerColor.getColor(0, e6Var);
        }
        paint.setColor(color);
        this.f43731f = peerColor.hasColor6(a2);
        this.f43732g = false;
    }
}
