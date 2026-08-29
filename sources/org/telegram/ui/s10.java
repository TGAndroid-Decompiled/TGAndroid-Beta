package org.telegram.ui;
public final class s10 implements org.telegram.ui.Components.zn0 {
    public final int f42251a;
    public final dg.a f42252b;

    public s10(dg.a aVar, int i10) {
        this.f42251a = i10;
        this.f42252b = aVar;
    }

    @Override
    public final void W(float f9, boolean z10) {
        switch (this.f42251a) {
            case 0:
                dg.j jVar = this.f42252b.f5551c;
                if (jVar != null) {
                    jVar.v = f9 * 2.0f;
                    return;
                }
                return;
            case 1:
                dg.j jVar2 = this.f42252b.f5551c;
                if (jVar2 != null) {
                    jVar2.f5623w = f9 * 2.0f;
                    return;
                }
                return;
            case 2:
                dg.j jVar3 = this.f42252b.f5551c;
                if (jVar3 != null) {
                    jVar3.f5624x = f9;
                    return;
                }
                return;
            default:
                dg.j jVar4 = this.f42252b.f5551c;
                if (jVar4 != null) {
                    jVar4.A = f9 * 2.0f;
                    return;
                }
                return;
        }
    }

    @Override
    public final CharSequence getContentDescription() {
        switch (this.f42251a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            default:
                return null;
        }
    }

    @Override
    public final int k0() {
        switch (this.f42251a) {
            case 0:
                return 0;
            case 1:
                return 0;
            case 2:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public final void v() {
        int i10 = this.f42251a;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }
}
