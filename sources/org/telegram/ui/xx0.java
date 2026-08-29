package org.telegram.ui;

import android.media.AudioRecordingConfiguration;
import com.google.firebase.datatransport.TransportRegistrar;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SharedConfig;
public final class xx0 implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.kv0, og.c, org.telegram.ui.Components.yu0, org.telegram.ui.Components.zu0, GenericProvider, a9.e {
    public final int f44670a;

    public xx0(int i10) {
        this.f44670a = i10;
    }

    public static AudioRecordingConfiguration a(Object obj) {
        return (AudioRecordingConfiguration) obj;
    }

    @Override
    public Object I0(a5.j jVar) {
        return TransportRegistrar.a(jVar);
    }

    @Override
    public void b(Object obj, float f9) {
        switch (this.f44670a) {
            case 23:
                ph.p2 p2Var = (ph.p2) obj;
                p2Var.f45958b = f9;
                p2Var.f45963e.invalidate();
                p2Var.S.setAlpha(f9);
                p2Var.E();
                p2Var.C();
                return;
            case 24:
            default:
                ((ph.m3) obj).setSwipeOffsetY(f9);
                return;
            case 25:
                ((ph.j3) obj).setLoadProgress(f9);
                return;
        }
    }

    @Override
    public int f(org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        switch (this.f44670a) {
            case 8:
                if (LiteMode.isEnabled(262144)) {
                    f9 = 0.85f;
                } else {
                    f9 = 0.76f;
                }
                return pg.a.l(f9, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Sd, c6Var));
            case 9:
                if (!LiteMode.isEnabled(256)) {
                    return org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G8, false);
                }
                int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G8, false);
                if (z10) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.825f;
                }
                return org.telegram.ui.ActionBar.g6.l1(f10, w02);
            case 10:
                if (LiteMode.isEnabled(262144)) {
                    f11 = 0.85f;
                } else {
                    f11 = 0.76f;
                }
                return pg.a.l(f11, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Zk, c6Var));
            case 11:
                if (LiteMode.isEnabled(262144)) {
                    f12 = 0.85f;
                } else {
                    f12 = 0.76f;
                }
                return org.telegram.ui.ActionBar.g6.l1(f12, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Fi, c6Var));
            case 12:
                return 855638016;
            case 13:
                return 1073741824;
            case 14:
                return org.telegram.ui.ActionBar.g6.l1(0.075f, -16777216);
            case 15:
                int w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G8, false);
                if (z10) {
                    f13 = 0.85f;
                } else {
                    f13 = 0.825f;
                }
                return org.telegram.ui.ActionBar.g6.l1(f13, w03);
            case 16:
                if (LiteMode.isEnabled(262144)) {
                    f14 = 0.85f;
                } else {
                    f14 = 0.76f;
                }
                return pg.a.l(f14, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Yk, c6Var));
            case 17:
                if (LiteMode.isEnabled(262144)) {
                    f15 = 0.85f;
                } else {
                    f15 = 0.76f;
                }
                return org.telegram.ui.ActionBar.g6.l1(f15, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, c6Var));
            case 18:
                return org.telegram.ui.ActionBar.g6.l1(0.78f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23133h5, c6Var));
            case 19:
                return org.telegram.ui.ActionBar.g6.l1(0.7f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, c6Var));
            case 20:
                LiteMode.isEnabled(262144);
                return 0;
            default:
                if (LiteMode.isEnabled(262144)) {
                    f16 = 0.85f;
                } else {
                    f16 = 0.76f;
                }
                return org.telegram.ui.ActionBar.g6.l1(f16, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, c6Var));
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f44670a) {
            case 0:
                c2Var.dismiss();
                return;
            case 1:
                c2Var.dismiss();
                return;
            case 2:
            default:
                c2Var.dismiss();
                return;
            case 3:
                c2Var.dismiss();
                return;
            case 4:
                c2Var.dismiss();
                return;
            case 5:
                c2Var.dismiss();
                return;
        }
    }

    @Override
    public float get(Object obj) {
        switch (this.f44670a) {
            case 22:
                return ((ph.p2) obj).f45958b;
            case 23:
            default:
                return ((ph.m3) obj).getSwipeOffsetY();
            case 24:
                return ((ph.j3) obj).f45853c;
        }
    }

    @Override
    public void h(int i10) {
        SharedConfig.proxyRotationTimeout = i10;
        SharedConfig.saveConfig();
    }

    @Override
    public Object provide(Object obj) {
        Void r12 = (Void) obj;
        org.telegram.ui.Components.av0 av0Var = ph.m3.U;
        return Boolean.FALSE;
    }

    @Override
    public void m() {
    }
}
