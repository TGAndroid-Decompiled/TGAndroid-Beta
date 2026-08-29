package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
public final class v implements iu0, org.telegram.ui.Components.bl0, org.telegram.ui.ActionBar.m1 {
    public final m4 f43384a;

    public v(m4 m4Var) {
        this.f43384a = m4Var;
    }

    @Override
    public boolean c(int i10, View view) {
        m4 m4Var = this.f43384a;
        m4Var.getClass();
        if (view instanceof m2) {
            g4 g4Var = ((m2) view).f40349n;
            m4Var.Z(g4Var.f38449a.articles.get(g4Var.f38450b).url);
            return true;
        }
        return false;
    }

    @Override
    public void h(float[] fArr) {
        m4 m4Var = this.f43384a;
        fArr[0] = m4Var.E0;
        fArr[1] = m4Var.f40404q0[0].f41513b.getMeasuredHeight();
    }

    @Override
    public void o(KeyEvent keyEvent) {
        org.telegram.ui.ActionBar.o1 o1Var;
        m4 m4Var = this.f43384a;
        m4Var.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (o1Var = m4Var.D) != null && o1Var.isShowing()) {
            m4Var.D.d(true);
        }
    }
}
