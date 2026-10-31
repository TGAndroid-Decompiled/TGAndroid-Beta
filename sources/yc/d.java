package yc;

import ve.r;
public final class d extends h {
    public final int e;

    @Override
    public final df.c b() {
        switch (this.e) {
            case 0:
                int i10 = this.d + 1;
                this.d = i10;
                if (c() == '[') {
                    this.d++;
                    r f7 = f("![");
                    i iVar = this.f54374a;
                    f6.f fVar = iVar.f54387i;
                    f6.f fVar2 = new f6.f(f7, i10, fVar, iVar.h, true);
                    if (fVar != null) {
                        fVar.d = true;
                    }
                    iVar.f54387i = fVar2;
                    return f7;
                }
                return null;
            default:
                int i11 = this.d;
                this.d = i11 + 1;
                r f10 = f("[");
                i iVar2 = this.f54374a;
                f6.f fVar3 = iVar2.f54387i;
                f6.f fVar4 = new f6.f(f10, i11, fVar3, iVar2.h, false);
                if (fVar3 != null) {
                    fVar3.d = true;
                }
                iVar2.f54387i = fVar4;
                return f10;
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
