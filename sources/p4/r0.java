package p4;

import c8.u9;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.List;
import org.telegram.utils.code.highlight.PrismaHighlighter;
public final class r0 implements h2.j, c1, b1, q2.l, androidx.car.app.utils.b {
    public final int f55435a;

    public r0(int i7) {
        this.f55435a = i7;
    }

    public static qi.a b() {
        InputStream open = org.telegram.messenger.t0.f26895b.getAssets().open("grammars.dat");
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[8192];
            while (true) {
                int read = open.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    open.close();
                    return new qi.a(new PrismaHighlighter(byteArray));
                }
            }
        } catch (Throwable th2) {
            if (open != null) {
                try {
                    open.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override
    public void a(i1 i1Var, v vVar, List list) {
        switch (this.f55435a) {
            case 9:
                i1Var.x0(list);
                return;
            default:
                i1Var.x0(list);
                return;
        }
    }

    @Override
    public void accept(Object obj) {
        i1 i1Var = (i1) obj;
        switch (this.f55435a) {
            case 0:
                i1Var.C0();
                return;
            case 1:
                i1Var.L0();
                return;
            case 2:
                i1Var.U();
                return;
            case 3:
                i1Var.E();
                return;
            case 4:
            case 7:
            case 9:
            case 10:
            case 11:
            case 15:
            default:
                i1Var.v();
                return;
            case 5:
                i1Var.J0();
                return;
            case 6:
                i1Var.H0();
                return;
            case 8:
                i1Var.L();
                return;
            case 12:
                i1Var.stop();
                return;
            case 13:
                i1Var.c0();
                return;
            case 14:
                i1Var.G();
                return;
            case 16:
                i1Var.a();
                return;
        }
    }

    @Override
    public void call() {
        throw null;
    }

    @Override
    public Object k(d0 d0Var, v vVar, int i7) {
        switch (this.f55435a) {
            case 4:
                d0Var.getClass();
                throw new ClassCastException();
            case 7:
                w7.s sVar = d0Var.f55191e;
                d0Var.s(vVar);
                sVar.getClass();
                return u9.b(new o1(-6));
            case 11:
                d0Var.getClass();
                throw new ClassCastException();
            case 15:
                d0Var.getClass();
                throw new ClassCastException();
            case 17:
                d0Var.getClass();
                throw new ClassCastException();
            case 19:
                d0Var.getClass();
                throw new ClassCastException();
            default:
                w7.s sVar2 = d0Var.f55191e;
                d0Var.s(vVar);
                sVar2.getClass();
                return u9.b(new o1(-6));
        }
    }

    @Override
    public void release() {
    }
}
