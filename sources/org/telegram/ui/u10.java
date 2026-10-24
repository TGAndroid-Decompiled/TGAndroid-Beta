package org.telegram.ui;
public final class u10 implements org.telegram.ui.Components.fp0 {
    public final int f42180a;
    public final tg.g f42181b;

    public u10(tg.g gVar, int i10) {
        this.f42180a = i10;
        this.f42181b = gVar;
    }

    @Override
    public final void L(float f7, boolean z10) {
        switch (this.f42180a) {
            case 0:
                tg.o oVar = this.f42181b.f47511c;
                if (oVar != null) {
                    oVar.B = f7 * 2.0f;
                    return;
                }
                return;
            case 1:
                tg.o oVar2 = this.f42181b.f47511c;
                if (oVar2 != null) {
                    oVar2.C = f7 * 2.0f;
                    return;
                }
                return;
            case 2:
                tg.o oVar3 = this.f42181b.f47511c;
                if (oVar3 != null) {
                    oVar3.D = f7;
                    return;
                }
                return;
            default:
                tg.o oVar4 = this.f42181b.f47511c;
                if (oVar4 != null) {
                    oVar4.G = f7 * 2.0f;
                    return;
                }
                return;
        }
    }

    @Override
    public final int Y() {
        switch (this.f42180a) {
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
    public final CharSequence getContentDescription() {
        switch (this.f42180a) {
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
    public final void v() {
        int i10 = this.f42180a;
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
