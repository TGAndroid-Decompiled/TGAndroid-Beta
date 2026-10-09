package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.MessagesController;
public final class wp0 {
    public boolean f43729f;
    public boolean f43730g;
    public boolean h;
    public Path f43731i;
    public Paint f43732j;
    public Drawable f43733k;
    public final org.telegram.ui.Components.bd f43734l;
    public boolean f43735m;
    public final org.telegram.ui.Components.g6 f43736n;
    public int f43737o;
    public final xp0 f43740r;
    public final Paint f43725a = new Paint(1);
    public final Paint f43726b = new Paint(1);
    public final Paint f43727c = new Paint(1);
    public final Path d = new Path();
    public final Path f43728e = new Path();
    public final RectF f43738p = new RectF();
    public final RectF f43739q = new RectF();

    public wp0(xp0 xp0Var) {
        this.f43740r = xp0Var;
        this.f43734l = new org.telegram.ui.Components.bd(xp0Var);
        this.f43736n = new org.telegram.ui.Components.g6(xp0Var, 0L, 320L, org.telegram.ui.Components.hs.h);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean a2;
        int color;
        xp0 xp0Var = this.f43740r;
        org.telegram.ui.ActionBar.e6 e6Var = xp0Var.f44109a;
        if (peerColor == null) {
            return;
        }
        if (e6Var == null) {
            a2 = org.telegram.ui.ActionBar.i6.I.q();
        } else {
            a2 = e6Var.a();
        }
        int i10 = xp0Var.f44111c;
        Paint paint = this.f43726b;
        Paint paint2 = this.f43725a;
        if (i10 == 1) {
            if (a2 && peerColor.hasColor2() && !peerColor.hasColor3()) {
                paint2.setColor(peerColor.getColor(1, e6Var));
                paint.setColor(peerColor.getColor(0, e6Var));
            } else {
                paint2.setColor(peerColor.getColor(0, e6Var));
                paint.setColor(peerColor.getColor(1, e6Var));
            }
            this.f43727c.setColor(peerColor.getColor(2, e6Var));
            this.f43729f = peerColor.hasColor2(a2);
            this.f43730g = peerColor.hasColor3(a2);
            return;
        }
        paint2.setColor(peerColor.getColor(0, e6Var));
        if (peerColor.hasColor6(a2)) {
            color = peerColor.getColor(1, e6Var);
        } else {
            color = peerColor.getColor(0, e6Var);
        }
        paint.setColor(color);
        this.f43729f = peerColor.hasColor6(a2);
        this.f43730g = false;
    }
}
