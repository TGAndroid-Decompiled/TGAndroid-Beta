package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.MessagesController;
public final class xp0 {
    public boolean f42890f;
    public boolean f42891g;
    public boolean h;
    public Path f42892i;
    public Paint f42893j;
    public Drawable f42894k;
    public final org.telegram.ui.Components.zc f42895l;
    public boolean f42896m;
    public final org.telegram.ui.Components.e6 f42897n;
    public int f42898o;
    public final yp0 f42901r;
    public final Paint f42886a = new Paint(1);
    public final Paint f42887b = new Paint(1);
    public final Paint f42888c = new Paint(1);
    public final Path d = new Path();
    public final Path f42889e = new Path();
    public final RectF f42899p = new RectF();
    public final RectF f42900q = new RectF();

    public xp0(yp0 yp0Var) {
        this.f42901r = yp0Var;
        this.f42895l = new org.telegram.ui.Components.zc(yp0Var);
        this.f42897n = new org.telegram.ui.Components.e6(yp0Var, 0L, 320L, org.telegram.ui.Components.pr.h);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean a2;
        int color;
        yp0 yp0Var = this.f42901r;
        org.telegram.ui.ActionBar.f6 f6Var = yp0Var.f43207a;
        if (peerColor == null) {
            return;
        }
        if (f6Var == null) {
            a2 = org.telegram.ui.ActionBar.j6.I.q();
        } else {
            a2 = f6Var.a();
        }
        int i10 = yp0Var.f43209c;
        Paint paint = this.f42887b;
        Paint paint2 = this.f42886a;
        if (i10 == 1) {
            if (a2 && peerColor.hasColor2() && !peerColor.hasColor3()) {
                paint2.setColor(peerColor.getColor(1, f6Var));
                paint.setColor(peerColor.getColor(0, f6Var));
            } else {
                paint2.setColor(peerColor.getColor(0, f6Var));
                paint.setColor(peerColor.getColor(1, f6Var));
            }
            this.f42888c.setColor(peerColor.getColor(2, f6Var));
            this.f42890f = peerColor.hasColor2(a2);
            this.f42891g = peerColor.hasColor3(a2);
            return;
        }
        paint2.setColor(peerColor.getColor(0, f6Var));
        if (peerColor.hasColor6(a2)) {
            color = peerColor.getColor(1, f6Var);
        } else {
            color = peerColor.getColor(0, f6Var);
        }
        paint.setColor(color);
        this.f42890f = peerColor.hasColor6(a2);
        this.f42891g = false;
    }
}
