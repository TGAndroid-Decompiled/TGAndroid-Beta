package org.telegram.utils.twidget;

import android.media.AudioRecordingConfiguration;
import android.os.Bundle;
import p4.a1;
import p4.g1;
import p4.i1;
public final class a implements p4.c0, a1, h2.j {
    public final int f52744a;

    public a(int i7) {
        this.f52744a = i7;
    }

    public static AudioRecordingConfiguration a(Object obj) {
        return (AudioRecordingConfiguration) obj;
    }

    @Override
    public void accept(Object obj) {
        g1 g1Var = (g1) obj;
        switch (this.f52744a) {
            case 19:
                g1Var.B0();
                return;
            case 20:
                g1Var.b();
                return;
            case 21:
                g1Var.g0();
                return;
            case 22:
            case 27:
            default:
                g1Var.H0();
                return;
            case 23:
                g1Var.C0();
                return;
            case 24:
                g1Var.L0();
                return;
            case 25:
                g1Var.U();
                return;
            case 26:
                g1Var.E();
                return;
            case 28:
                g1Var.J0();
                return;
        }
    }

    @Override
    public void b(p4.u uVar, int i7) {
        switch (this.f52744a) {
            case 14:
                uVar.getClass();
                return;
            case 15:
                uVar.c(i7);
                return;
            default:
                uVar.getClass();
                return;
        }
    }

    @Override
    public Object i(p4.d0 d0Var, p4.v vVar, int i7) {
        switch (this.f52744a) {
            case 17:
                d0Var.getClass();
                throw new ClassCastException();
            case 18:
                d0Var.getClass();
                throw new ClassCastException();
            case 22:
                return d0Var.n(vVar);
            default:
                d0Var.getClass();
                throw new ClassCastException();
        }
    }

    public a(Object obj, int i7) {
        this.f52744a = i7;
    }

    public a(String str, int i7, int i10, p4.q qVar) {
        this.f52744a = 18;
    }

    public a(boolean z9, i1 i1Var, Bundle bundle) {
        this.f52744a = 22;
    }
}
