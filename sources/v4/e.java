package v4;

import java.nio.ByteBuffer;
public abstract class e extends n3.l implements g {
    public e(String str) {
        super(new j[2], new k[2]);
        boolean z4;
        int i10 = this.f15231g;
        n3.i[] iVarArr = this.f15229e;
        if (i10 == iVarArr.length) {
            z4 = true;
        } else {
            z4 = false;
        }
        h5.a.i(z4);
        for (n3.i iVar : iVarArr) {
            iVar.j(1024);
        }
    }

    @Override
    public final n3.i e() {
        return new j();
    }

    @Override
    public final n3.j f() {
        return new d(this, 1);
    }

    @Override
    public final n3.g g(Throwable th2) {
        return new Exception("Unexpected decode error", th2);
    }

    @Override
    public final n3.g h(n3.i iVar, n3.j jVar, boolean z4) {
        j jVar2 = (j) iVar;
        k kVar = (k) jVar;
        try {
            ByteBuffer byteBuffer = jVar2.d;
            byteBuffer.getClass();
            kVar.j(jVar2.f15218f, k(byteBuffer.limit(), z4, byteBuffer.array()), jVar2.f48943s);
            kVar.f15195b &= Integer.MAX_VALUE;
            return null;
        } catch (h e6) {
            return e6;
        }
    }

    public abstract f k(int i10, boolean z4, byte[] bArr);

    @Override
    public final void a(long j10) {
    }
}
