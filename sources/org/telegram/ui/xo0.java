package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.MessagesController;

public final class xo0 {

    public boolean f44578f;

    public boolean f44579g;
    public boolean h;

    public Path f44580i;

    public Paint f44581j;

    public Drawable f44582k;

    public final org.telegram.ui.Components.nc f44583l;

    public boolean f44584m;

    public final org.telegram.ui.Components.y5 f44585n;

    public int f44586o;

    public final yo0 f44589r;

    public final Paint f44574a = new Paint(1);

    public final Paint f44575b = new Paint(1);

    public final Paint f44576c = new Paint(1);
    public final Path d = new Path();

    public final Path f44577e = new Path();

    public final RectF f44587p = new RectF();

    public final RectF f44588q = new RectF();

    public xo0(yo0 yo0Var) {
        this.f44589r = yo0Var;
        this.f44583l = new org.telegram.ui.Components.nc(yo0Var);
        this.f44585n = new org.telegram.ui.Components.y5(yo0Var, 0L, 320L, org.telegram.ui.Components.er.h);
    }

    public final void a(MessagesController.PeerColor peerColor) {
        yo0 yo0Var = this.f44589r;
        org.telegram.ui.ActionBar.c6 c6Var = yo0Var.f44861a;
        if (peerColor == null) {
            return;
        }
        boolean zQ = c6Var == null ? org.telegram.ui.ActionBar.g6.I.q() : c6Var.a();
        int i10 = yo0Var.f44863c;
        Paint paint = this.f44575b;
        Paint paint2 = this.f44574a;
        if (i10 != 1) {
            paint2.setColor(peerColor.getColor(0, c6Var));
            paint.setColor(peerColor.hasColor6(zQ) ? peerColor.getColor(1, c6Var) : peerColor.getColor(0, c6Var));
            this.f44578f = peerColor.hasColor6(zQ);
            this.f44579g = false;
            return;
        }
        if (zQ && peerColor.hasColor2() && !peerColor.hasColor3()) {
            paint2.setColor(peerColor.getColor(1, c6Var));
            paint.setColor(peerColor.getColor(0, c6Var));
        } else {
            paint2.setColor(peerColor.getColor(0, c6Var));
            paint.setColor(peerColor.getColor(1, c6Var));
        }
        this.f44576c.setColor(peerColor.getColor(2, c6Var));
        this.f44578f = peerColor.hasColor2(zQ);
        this.f44579g = peerColor.hasColor3(zQ);
    }
}
