package org.telegram.ui;
public final class u10 implements org.telegram.ui.Components.kp0 {
    public final int f43975a;
    public final ug.g f43976b;

    public u10(ug.g gVar, int i10) {
        this.f43975a = i10;
        this.f43976b = gVar;
    }

    @Override
    public final void U(float f7, boolean z10) {
        switch (this.f43975a) {
            case 0:
                ug.o oVar = this.f43976b.f49781c;
                if (oVar != null) {
                    oVar.B = f7 * 2.0f;
                    return;
                }
                return;
            case 1:
                ug.o oVar2 = this.f43976b.f49781c;
                if (oVar2 != null) {
                    oVar2.C = f7 * 2.0f;
                    return;
                }
                return;
            case 2:
                ug.o oVar3 = this.f43976b.f49781c;
                if (oVar3 != null) {
                    oVar3.D = f7;
                    return;
                }
                return;
            default:
                ug.o oVar4 = this.f43976b.f49781c;
                if (oVar4 != null) {
                    oVar4.G = f7 * 2.0f;
                    return;
                }
                return;
        }
    }

    @Override
    public final CharSequence getContentDescription() {
        switch (this.f43975a) {
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
        switch (this.f43975a) {
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
    public final void y() {
        int i10 = this.f43975a;
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
