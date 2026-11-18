package org.telegram.utils.twidget;

import android.media.AudioRecordingConfiguration;
import android.os.Bundle;
public final class f implements p4.c0, p4.c1, h2.j {
    public final int f54724a;

    public f(int i7) {
        this.f54724a = i7;
    }

    public static AudioRecordingConfiguration a(Object obj) {
        return (AudioRecordingConfiguration) obj;
    }

    @Override
    public void accept(Object obj) {
        p4.i1 i1Var = (p4.i1) obj;
        switch (this.f54724a) {
            case 26:
                i1Var.B0();
                return;
            case 27:
                i1Var.b();
                return;
            default:
                i1Var.g0();
                return;
        }
    }

    @Override
    public void b(p4.u uVar, int i7) {
        switch (this.f54724a) {
            case 21:
                uVar.getClass();
                return;
            case 22:
                uVar.c(i7);
                return;
            default:
                uVar.getClass();
                return;
        }
    }

    @Override
    public Object k(p4.d0 d0Var, p4.v vVar, int i7) {
        switch (this.f54724a) {
            case 24:
                d0Var.getClass();
                throw new ClassCastException();
            case 25:
                d0Var.getClass();
                throw new ClassCastException();
            default:
                return d0Var.n(vVar);
        }
    }

    public f(Object obj, int i7) {
        this.f54724a = i7;
    }

    public f(String str, int i7, int i10, p4.q qVar) {
        this.f54724a = 25;
    }

    public f(boolean z10, p4.k1 k1Var, Bundle bundle) {
        this.f54724a = 29;
    }
}
