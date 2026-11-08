package org.telegram.utils.twidget;

import android.media.AudioRecordingConfiguration;
import android.os.Bundle;
public final class e implements p4.c0, p4.a1, h2.j {
    public final int f52777a;

    public e(int i7) {
        this.f52777a = i7;
    }

    public static AudioRecordingConfiguration a(Object obj) {
        return (AudioRecordingConfiguration) obj;
    }

    @Override
    public void accept(Object obj) {
        p4.g1 g1Var = (p4.g1) obj;
        switch (this.f52777a) {
            case 20:
                g1Var.B0();
                return;
            case 21:
                g1Var.b();
                return;
            case 22:
                g1Var.g0();
                return;
            case 23:
            default:
                g1Var.J0();
                return;
            case 24:
                g1Var.C0();
                return;
            case 25:
                g1Var.L0();
                return;
            case 26:
                g1Var.U();
                return;
            case 27:
                g1Var.E();
                return;
        }
    }

    @Override
    public void b(p4.u uVar, int i7) {
        switch (this.f52777a) {
            case 15:
                uVar.getClass();
                return;
            case 16:
                uVar.c(i7);
                return;
            default:
                uVar.getClass();
                return;
        }
    }

    @Override
    public Object l(p4.d0 d0Var, p4.v vVar, int i7) {
        switch (this.f52777a) {
            case 18:
                d0Var.getClass();
                throw new ClassCastException();
            case 19:
                d0Var.getClass();
                throw new ClassCastException();
            case 23:
                return d0Var.n(vVar);
            default:
                d0Var.getClass();
                throw new ClassCastException();
        }
    }

    public e(Object obj, int i7) {
        this.f52777a = i7;
    }

    public e(String str, int i7, int i10, p4.q qVar) {
        this.f52777a = 19;
    }

    public e(boolean z9, p4.i1 i1Var, Bundle bundle) {
        this.f52777a = 23;
    }
}
