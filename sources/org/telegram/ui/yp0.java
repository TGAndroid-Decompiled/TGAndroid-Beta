package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.MessagesController;
public final class yp0 {
    public boolean f39978f;
    public boolean f39979g;
    public boolean h;
    public Path f39980i;
    public Paint f39981j;
    public Drawable f39982k;
    public final org.telegram.ui.Components.yc f39983l;
    public boolean f39984m;
    public final org.telegram.ui.Components.d6 f39985n;
    public int f39986o;
    public final zp0 f39989r;
    public final Paint f39975a = new Paint(1);
    public final Paint f39976b = new Paint(1);
    public final Paint f39977c = new Paint(1);
    public final Path d = new Path();
    public final Path e = new Path();
    public final RectF f39987p = new RectF();
    public final RectF f39988q = new RectF();

    public yp0(zp0 zp0Var) {
        this.f39989r = zp0Var;
        this.f39983l = new org.telegram.ui.Components.yc(zp0Var);
        this.f39985n = new org.telegram.ui.Components.d6(zp0Var, 0L, 320L, org.telegram.ui.Components.qr.h);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean a2;
        int color;
        zp0 zp0Var = this.f39989r;
        org.telegram.ui.ActionBar.f6 f6Var = zp0Var.f40579a;
        if (peerColor == null) {
            return;
        }
        if (f6Var == null) {
            a2 = org.telegram.ui.ActionBar.j6.I.q();
        } else {
            a2 = f6Var.a();
        }
        int i10 = zp0Var.f40581c;
        Paint paint = this.f39976b;
        Paint paint2 = this.f39975a;
        if (i10 == 1) {
            if (a2 && peerColor.hasColor2() && !peerColor.hasColor3()) {
                paint2.setColor(peerColor.getColor(1, f6Var));
                paint.setColor(peerColor.getColor(0, f6Var));
            } else {
                paint2.setColor(peerColor.getColor(0, f6Var));
                paint.setColor(peerColor.getColor(1, f6Var));
            }
            this.f39977c.setColor(peerColor.getColor(2, f6Var));
            this.f39978f = peerColor.hasColor2(a2);
            this.f39979g = peerColor.hasColor3(a2);
            return;
        }
        paint2.setColor(peerColor.getColor(0, f6Var));
        if (peerColor.hasColor6(a2)) {
            color = peerColor.getColor(1, f6Var);
        } else {
            color = peerColor.getColor(0, f6Var);
        }
        paint.setColor(color);
        this.f39978f = peerColor.hasColor6(a2);
        this.f39979g = false;
    }
}
