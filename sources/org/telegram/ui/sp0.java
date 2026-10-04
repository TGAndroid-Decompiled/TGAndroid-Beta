package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.MessagesController;
public final class sp0 {
    public boolean f40595f;
    public boolean f40596g;
    public boolean h;
    public Path f40597i;
    public Paint f40598j;
    public Drawable f40599k;
    public final org.telegram.ui.Components.zc f40600l;
    public boolean f40601m;
    public final org.telegram.ui.Components.e6 f40602n;
    public int f40603o;
    public final tp0 f40606r;
    public final Paint f40591a = new Paint(1);
    public final Paint f40592b = new Paint(1);
    public final Paint f40593c = new Paint(1);
    public final Path d = new Path();
    public final Path f40594e = new Path();
    public final RectF f40604p = new RectF();
    public final RectF f40605q = new RectF();

    public sp0(tp0 tp0Var) {
        this.f40606r = tp0Var;
        this.f40600l = new org.telegram.ui.Components.zc(tp0Var);
        this.f40602n = new org.telegram.ui.Components.e6(tp0Var, 0L, 320L, org.telegram.ui.Components.tr.h);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        boolean a2;
        int color;
        tp0 tp0Var = this.f40606r;
        org.telegram.ui.ActionBar.d6 d6Var = tp0Var.f40937a;
        if (peerColor == null) {
            return;
        }
        if (d6Var == null) {
            a2 = org.telegram.ui.ActionBar.i6.I.q();
        } else {
            a2 = d6Var.a();
        }
        int i10 = tp0Var.f40939c;
        Paint paint = this.f40592b;
        Paint paint2 = this.f40591a;
        if (i10 == 1) {
            if (a2 && peerColor.hasColor2() && !peerColor.hasColor3()) {
                paint2.setColor(peerColor.getColor(1, d6Var));
                paint.setColor(peerColor.getColor(0, d6Var));
            } else {
                paint2.setColor(peerColor.getColor(0, d6Var));
                paint.setColor(peerColor.getColor(1, d6Var));
            }
            this.f40593c.setColor(peerColor.getColor(2, d6Var));
            this.f40595f = peerColor.hasColor2(a2);
            this.f40596g = peerColor.hasColor3(a2);
            return;
        }
        paint2.setColor(peerColor.getColor(0, d6Var));
        if (peerColor.hasColor6(a2)) {
            color = peerColor.getColor(1, d6Var);
        } else {
            color = peerColor.getColor(0, d6Var);
        }
        paint.setColor(color);
        this.f40595f = peerColor.hasColor6(a2);
        this.f40596g = false;
    }
}
