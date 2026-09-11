package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.MessagesController;
public final class xp0 {
    public boolean f42862f;
    public boolean f42863g;
    public boolean h;
    public Path f42864i;
    public Paint f42865j;
    public Drawable f42866k;
    public final org.telegram.ui.Components.zc f42867l;
    public boolean f42868m;
    public final org.telegram.ui.Components.e6 f42869n;
    public int f42870o;
    public final yp0 f42873r;
    public final Paint f42858a = new Paint(1);
    public final Paint f42859b = new Paint(1);
    public final Paint f42860c = new Paint(1);
    public final Path d = new Path();
    public final Path f42861e = new Path();
    public final RectF f42871p = new RectF();
    public final RectF f42872q = new RectF();

    public xp0(yp0 yp0Var) {
        this.f42873r = yp0Var;
        this.f42867l = new org.telegram.ui.Components.zc(yp0Var);
        this.f42869n = new org.telegram.ui.Components.e6(yp0Var, 0L, 320L, org.telegram.ui.Components.pr.h);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean a2;
        int color;
        yp0 yp0Var = this.f42873r;
        org.telegram.ui.ActionBar.f6 f6Var = yp0Var.f43179a;
        if (peerColor == null) {
            return;
        }
        if (f6Var == null) {
            a2 = org.telegram.ui.ActionBar.j6.I.q();
        } else {
            a2 = f6Var.a();
        }
        int i10 = yp0Var.f43181c;
        Paint paint = this.f42859b;
        Paint paint2 = this.f42858a;
        if (i10 == 1) {
            if (a2 && peerColor.hasColor2() && !peerColor.hasColor3()) {
                paint2.setColor(peerColor.getColor(1, f6Var));
                paint.setColor(peerColor.getColor(0, f6Var));
            } else {
                paint2.setColor(peerColor.getColor(0, f6Var));
                paint.setColor(peerColor.getColor(1, f6Var));
            }
            this.f42860c.setColor(peerColor.getColor(2, f6Var));
            this.f42862f = peerColor.hasColor2(a2);
            this.f42863g = peerColor.hasColor3(a2);
            return;
        }
        paint2.setColor(peerColor.getColor(0, f6Var));
        if (peerColor.hasColor6(a2)) {
            color = peerColor.getColor(1, f6Var);
        } else {
            color = peerColor.getColor(0, f6Var);
        }
        paint.setColor(color);
        this.f42862f = peerColor.hasColor6(a2);
        this.f42863g = false;
    }
}
