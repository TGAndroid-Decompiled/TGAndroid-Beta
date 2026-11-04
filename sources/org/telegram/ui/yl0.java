package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class yl0 {
    public boolean f52351f;
    public boolean f52352g;
    public boolean h;
    public Path f52353i;
    public Paint f52354j;
    public Drawable f52355k;
    public final org.telegram.ui.Components.gc f52356l;
    public boolean f52357m;
    public final org.telegram.ui.Components.u5 f52358n;
    public int f52359o;
    public final zl0 f52362r;
    public final Paint f52347a = new Paint(1);
    public final Paint f52348b = new Paint(1);
    public final Paint f52349c = new Paint(1);
    public final Path d = new Path();
    public final Path f52350e = new Path();
    public final RectF f52360p = new RectF();
    public final RectF f52361q = new RectF();

    public yl0(zl0 zl0Var) {
        this.f52362r = zl0Var;
        this.f52356l = new org.telegram.ui.Components.gc(zl0Var);
        this.f52358n = new org.telegram.ui.Components.u5(zl0Var, 0L, 320L, org.telegram.ui.Components.xq.h);
    }

    public final void a(org.telegram.messenger.wo woVar) {
        boolean a10;
        int e10;
        int[] iArr;
        boolean z10;
        zl0 zl0Var = this.f52362r;
        org.telegram.ui.ActionBar.e6 e6Var = zl0Var.f52696a;
        if (woVar == null) {
            return;
        }
        int[] iArr2 = woVar.f26242g;
        int[] iArr3 = woVar.h;
        if (e6Var == null) {
            a10 = org.telegram.ui.ActionBar.k6.I.q();
        } else {
            a10 = e6Var.a();
        }
        int i3 = zl0Var.f52698c;
        Paint paint = this.f52348b;
        Paint paint2 = this.f52347a;
        boolean z11 = true;
        if (i3 == 1) {
            if (a10 && woVar.g() != woVar.f() && woVar.i() == woVar.f()) {
                paint2.setColor(woVar.e(1, e6Var));
                paint.setColor(woVar.e(0, e6Var));
            } else {
                paint2.setColor(woVar.e(0, e6Var));
                paint.setColor(woVar.e(1, e6Var));
            }
            this.f52349c.setColor(woVar.e(2, e6Var));
            int h = woVar.h(a10);
            if (a10) {
                iArr = iArr3;
            } else {
                iArr = iArr2;
            }
            if (h != iArr[0]) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f52351f = z10;
            int j10 = woVar.j(a10);
            if (a10) {
                iArr2 = iArr3;
            }
            if (j10 == iArr2[0]) {
                z11 = false;
            }
            this.f52352g = z11;
            return;
        }
        paint2.setColor(woVar.e(0, e6Var));
        if (woVar.o(a10)) {
            e10 = woVar.e(1, e6Var);
        } else {
            e10 = woVar.e(0, e6Var);
        }
        paint.setColor(e10);
        this.f52351f = woVar.o(a10);
        this.f52352g = false;
    }
}
