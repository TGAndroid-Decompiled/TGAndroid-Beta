package qc;

import ne.p;
import ne.s;
public final class d extends h {
    public final int e;

    @Override
    public final p b() {
        switch (this.e) {
            case 0:
                int i10 = this.d + 1;
                this.d = i10;
                if (c() == '[') {
                    this.d++;
                    s f10 = f("![");
                    i iVar = this.f43026a;
                    ke.b bVar = iVar.f43039i;
                    ke.b bVar2 = new ke.b(f10, i10, bVar, iVar.h, true);
                    if (bVar != null) {
                        bVar.d = true;
                    }
                    iVar.f43039i = bVar2;
                    return f10;
                }
                return null;
            default:
                int i11 = this.d;
                this.d = i11 + 1;
                s f11 = f("[");
                i iVar2 = this.f43026a;
                ke.b bVar3 = iVar2.f43039i;
                ke.b bVar4 = new ke.b(f11, i11, bVar3, iVar2.h, false);
                if (bVar3 != null) {
                    bVar3.d = true;
                }
                iVar2.f43039i = bVar4;
                return f11;
        }
    }

    @Override
    public final char d() {
        switch (this.e) {
            case 0:
                return '!';
            default:
                return '[';
        }
    }
}
