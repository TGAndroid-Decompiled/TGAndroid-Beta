package p4;

import c8.u9;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.List;
import org.telegram.utils.code.highlight.PrismaHighlighter;
public final class r0 implements h2.j, b1, a1, q2.l, androidx.car.app.utils.b {
    public final int f55552a;

    public r0(int i7) {
        this.f55552a = i7;
    }

    public static qi.a b() {
        InputStream open = org.telegram.messenger.t0.f27013b.getAssets().open("grammars.dat");
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
    public void a(h1 h1Var, v vVar, List list) {
        switch (this.f55552a) {
            case 9:
                h1Var.y0(list);
                return;
            default:
                h1Var.y0(list);
                return;
        }
    }

    @Override
    public void accept(Object obj) {
        h1 h1Var = (h1) obj;
        switch (this.f55552a) {
            case 0:
                h1Var.D0();
                return;
            case 1:
                h1Var.M0();
                return;
            case 2:
                h1Var.V();
                return;
            case 3:
                h1Var.F();
                return;
            case 4:
            case 7:
            case 9:
            case 10:
            case 11:
            case 15:
            default:
                h1Var.w();
                return;
            case 5:
                h1Var.K0();
                return;
            case 6:
                h1Var.I0();
                return;
            case 8:
                h1Var.M();
                return;
            case 12:
                h1Var.stop();
                return;
            case 13:
                h1Var.d0();
                return;
            case 14:
                h1Var.H();
                return;
            case 16:
                h1Var.a();
                return;
        }
    }

    @Override
    public void call() {
        throw null;
    }

    @Override
    public Object j(d0 d0Var, v vVar, int i7) {
        switch (this.f55552a) {
            case 4:
                d0Var.getClass();
                throw new ClassCastException();
            case 7:
                w7.s sVar = d0Var.f55310e;
                d0Var.s(vVar);
                sVar.getClass();
                return u9.b(new n1(-6));
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
                w7.s sVar2 = d0Var.f55310e;
                d0Var.s(vVar);
                sVar2.getClass();
                return u9.b(new n1(-6));
        }
    }

    @Override
    public void release() {
    }
}
