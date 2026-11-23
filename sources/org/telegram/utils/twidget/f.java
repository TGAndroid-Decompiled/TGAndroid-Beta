package org.telegram.utils.twidget;

import android.media.AudioRecordingConfiguration;
import android.os.Bundle;
public final class f implements p4.c0, p4.b1, h2.j {
    public final int f54851a;

    public f(int i7) {
        this.f54851a = i7;
    }

    public static AudioRecordingConfiguration a(Object obj) {
        return (AudioRecordingConfiguration) obj;
    }

    @Override
    public void accept(Object obj) {
        p4.h1 h1Var = (p4.h1) obj;
        switch (this.f54851a) {
            case 26:
                h1Var.C0();
                return;
            case 27:
                h1Var.b();
                return;
            default:
                h1Var.h0();
                return;
        }
    }

    @Override
    public void b(p4.u uVar, int i7) {
        switch (this.f54851a) {
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
    public Object j(p4.d0 d0Var, p4.v vVar, int i7) {
        switch (this.f54851a) {
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
        this.f54851a = i7;
    }

    public f(String str, int i7, int i10, p4.q qVar) {
        this.f54851a = 25;
    }

    public f(boolean z10, p4.j1 j1Var, Bundle bundle) {
        this.f54851a = 29;
    }
}
