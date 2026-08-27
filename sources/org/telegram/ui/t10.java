package org.telegram.ui;

public final class t10 implements org.telegram.ui.Components.pn0 {

    public final int f42751a;

    public final bg.a f42752b;

    public t10(bg.a aVar, int i10) {
        this.f42751a = i10;
        this.f42752b = aVar;
    }

    @Override
    public final void P(float f10, boolean z10) {
        switch (this.f42751a) {
            case 0:
                bg.j jVar = this.f42752b.f2090c;
                if (jVar != null) {
                    jVar.v = f10 * 2.0f;
                }
                break;
            case 1:
                bg.j jVar2 = this.f42752b.f2090c;
                if (jVar2 != null) {
                    jVar2.f2162w = f10 * 2.0f;
                }
                break;
            case 2:
                bg.j jVar3 = this.f42752b.f2090c;
                if (jVar3 != null) {
                    jVar3.f2163x = f10;
                }
                break;
            default:
                bg.j jVar4 = this.f42752b.f2090c;
                if (jVar4 != null) {
                    jVar4.A = f10 * 2.0f;
                }
                break;
        }
    }

    @Override
    public final int a0() {
        switch (this.f42751a) {
        }
        return 0;
    }

    @Override
    public final CharSequence getContentDescription() {
        switch (this.f42751a) {
        }
        return null;
    }

    @Override
    public final void r() {
        int i10 = this.f42751a;
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
