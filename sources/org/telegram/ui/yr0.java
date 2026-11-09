package org.telegram.ui;

import android.graphics.Point;
import android.view.View;
import java.util.HashSet;
public final class yr0 implements r0.m, org.telegram.ui.Components.v51, org.telegram.ui.Components.do0, org.telegram.ui.Components.mm0, org.telegram.ui.Components.cm0 {
    public final int f52178a;
    public final Object f52179b;

    public yr0(Object obj, int i7) {
        this.f52178a = i7;
        this.f52179b = obj;
    }

    @Override
    public void A(float f10) {
        Point point = org.telegram.messenger.g0.f22563q;
        if (point.x > point.y) {
            ((u91) this.f52179b).f50344v0.movePreviewFragment(f10);
        }
    }

    @Override
    public void C0() {
        ((StickersActivity) this.f52179b).o0();
    }

    @Override
    public void D() {
        int i7 = this.f52178a;
    }

    @Override
    public void O(org.telegram.ui.Cells.t2 t2Var) {
        y91 y91Var = ((u91) this.f52179b).f50344v0;
        HashSet hashSet = y91.f52012q1;
        y91Var.Q0(t2Var);
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        switch (this.f52178a) {
            case 0:
                bs0 bs0Var = (bs0) this.f52179b;
                i0.b g10 = k1Var.f54214a.g(519);
                bs0Var.f44124r = g10;
                bs0Var.d.setPadding(g10.f15120a, g10.f15121b, g10.f15122c, g10.d);
                bs0Var.f44115c.requestLayout();
                return r0.k1.f54213b;
            default:
                h81 h81Var = (h81) this.f52179b;
                i0.b g11 = k1Var.f54214a.g(519);
                h81Var.f46255n = g11;
                h81Var.f46249c.setPadding(g11.f15120a, g11.f15121b, g11.f15122c, g11.d);
                h81Var.f46247b.requestLayout();
                return r0.k1.f54213b;
        }
    }

    @Override
    public void W() {
        ((StickersActivity) this.f52179b).o0();
    }

    @Override
    public void a(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f52179b;
        mp0 mp0Var = secretMediaViewer.D;
        if (mp0Var != null) {
            long U = mp0Var.U();
            if (U != -9223372036854775807L) {
                secretMediaViewer.D.q0(f10 * ((float) U), false);
            }
            secretMediaViewer.D.h0();
        }
    }

    @Override
    public void d(float f10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f52179b;
        mp0 mp0Var = secretMediaViewer.D;
        if (mp0Var != null) {
            mp0Var.g0();
            long U = secretMediaViewer.D.U();
            if (U != -9223372036854775807L) {
                secretMediaViewer.D.q0(f10 * ((float) U), false);
            }
        }
    }

    @Override
    public void finish() {
        Point point = org.telegram.messenger.g0.f22563q;
        if (point.x > point.y) {
            ((u91) this.f52179b).f50344v0.finishPreviewFragment();
        }
    }

    @Override
    public CharSequence getContentDescription() {
        switch (this.f52178a) {
            case 3:
                x51 x51Var = (x51) this.f52179b;
                return String.valueOf(Math.round((x51Var.f51554a.getProgress() * x51Var.f51555b) + 0));
            default:
                h61 h61Var = (h61) this.f52179b;
                int i7 = h61Var.d;
                return String.valueOf(Math.round((h61Var.f46175b.getProgress() * (h61Var.f46177e - i7)) + i7));
        }
    }

    @Override
    public void l(boolean z9, float f10) {
        switch (this.f52178a) {
            case 3:
                x51 x51Var = (x51) this.f52179b;
                ThemeActivity.d0(x51Var.f51557e, Math.round((x51Var.f51555b * f10) + 0), false);
                return;
            default:
                h61 h61Var = (h61) this.f52179b;
                ThemeActivity themeActivity = h61Var.f46180r;
                int i7 = h61Var.d;
                ThemeActivity.p0(themeActivity, Math.round(((h61Var.f46177e - i7) * f10) + i7));
                return;
        }
    }

    @Override
    public int q0() {
        switch (this.f52178a) {
            case 3:
                return ((x51) this.f52179b).f51555b;
            default:
                h61 h61Var = (h61) this.f52179b;
                return h61Var.f46177e - h61Var.d;
        }
    }

    private final void b() {
    }

    private final void c() {
    }
}
