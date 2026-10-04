package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.MessagesController;
public final class sp0 {
    public boolean f40589f;
    public boolean f40590g;
    public boolean h;
    public Path f40591i;
    public Paint f40592j;
    public Drawable f40593k;
    public final org.telegram.ui.Components.zc f40594l;
    public boolean f40595m;
    public final org.telegram.ui.Components.e6 f40596n;
    public int f40597o;
    public final tp0 f40600r;
    public final Paint f40585a = new Paint(1);
    public final Paint f40586b = new Paint(1);
    public final Paint f40587c = new Paint(1);
    public final Path d = new Path();
    public final Path f40588e = new Path();
    public final RectF f40598p = new RectF();
    public final RectF f40599q = new RectF();

    public sp0(tp0 tp0Var) {
        this.f40600r = tp0Var;
        this.f40594l = new org.telegram.ui.Components.zc(tp0Var);
        this.f40596n = new org.telegram.ui.Components.e6(tp0Var, 0L, 320L, org.telegram.ui.Components.tr.h);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean a2;
        int color;
        tp0 tp0Var = this.f40600r;
        org.telegram.ui.ActionBar.d6 d6Var = tp0Var.f40931a;
        if (peerColor == null) {
            return;
        }
        if (d6Var == null) {
            a2 = org.telegram.ui.ActionBar.i6.I.q();
        } else {
            a2 = d6Var.a();
        }
        int i10 = tp0Var.f40933c;
        Paint paint = this.f40586b;
        Paint paint2 = this.f40585a;
        if (i10 == 1) {
            if (a2 && peerColor.hasColor2() && !peerColor.hasColor3()) {
                paint2.setColor(peerColor.getColor(1, d6Var));
                paint.setColor(peerColor.getColor(0, d6Var));
            } else {
                paint2.setColor(peerColor.getColor(0, d6Var));
                paint.setColor(peerColor.getColor(1, d6Var));
            }
            this.f40587c.setColor(peerColor.getColor(2, d6Var));
            this.f40589f = peerColor.hasColor2(a2);
            this.f40590g = peerColor.hasColor3(a2);
            return;
        }
        paint2.setColor(peerColor.getColor(0, d6Var));
        if (peerColor.hasColor6(a2)) {
            color = peerColor.getColor(1, d6Var);
        } else {
            color = peerColor.getColor(0, d6Var);
        }
        paint.setColor(color);
        this.f40589f = peerColor.hasColor6(a2);
        this.f40590g = false;
    }
}
