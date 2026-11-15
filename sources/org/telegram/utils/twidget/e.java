package org.telegram.utils.twidget;

import android.media.AudioRecordingConfiguration;
import android.os.Bundle;
public final class e implements p4.c0, p4.a1, h2.j {
    public final int f54205a;

    public e(int i7) {
        this.f54205a = i7;
    }

    public static AudioRecordingConfiguration a(Object obj) {
        return (AudioRecordingConfiguration) obj;
    }

    @Override
    public void accept(Object obj) {
        p4.g1 g1Var = (p4.g1) obj;
        switch (this.f54205a) {
            case 25:
                g1Var.B0();
                return;
            case 26:
                g1Var.b();
                return;
            case 27:
                g1Var.g0();
                return;
            default:
                g1Var.C0();
                return;
        }
    }

    @Override
    public void b(p4.u uVar, int i7) {
        switch (this.f54205a) {
            case 20:
                uVar.getClass();
                return;
            case 21:
                uVar.c(i7);
                return;
            default:
                uVar.getClass();
                return;
        }
    }

    @Override
    public Object k(p4.d0 d0Var, p4.v vVar, int i7) {
        switch (this.f54205a) {
            case 23:
                d0Var.getClass();
                throw new ClassCastException();
            case 24:
                d0Var.getClass();
                throw new ClassCastException();
            default:
                return d0Var.n(vVar);
        }
    }

    public e(Object obj, int i7) {
        this.f54205a = i7;
    }

    public e(String str, int i7, int i10, p4.q qVar) {
        this.f54205a = 24;
    }

    public e(boolean z10, p4.i1 i1Var, Bundle bundle) {
        this.f54205a = 28;
    }
}
