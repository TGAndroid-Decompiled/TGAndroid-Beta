package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class zs implements ah.n {
    public final int f40338a;
    public final org.telegram.ui.Components.ml0 f40339b;

    public zs(org.telegram.ui.Components.ml0 ml0Var, int i10) {
        this.f40338a = i10;
        this.f40339b = ml0Var;
    }

    @Override
    public final boolean a(Canvas canvas, View view, long j3) {
        switch (this.f40338a) {
            case 0:
            default:
                return this.f40339b.drawChild(canvas, view, j3);
        }
    }
}
