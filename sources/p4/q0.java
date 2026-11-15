package p4;

import android.view.WindowInsets;
import c8.r9;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.List;
import org.telegram.utils.code.highlight.PrismaHighlighter;
public final class q0 implements h2.j, a1, z0, q2.m, androidx.car.app.utils.c {
    public final int f54841a;

    public q0(int i7) {
        this.f54841a = i7;
    }

    public static qi.a b() {
        InputStream open = org.telegram.messenger.t0.f26600b.getAssets().open("grammars.dat");
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

    public static WindowInsets c() {
        return WindowInsets.CONSUMED;
    }

    @Override
    public void a(g1 g1Var, v vVar, List list) {
        switch (this.f54841a) {
            case 8:
                g1Var.x0(list);
                return;
            default:
                g1Var.x0(list);
                return;
        }
    }

    @Override
    public void accept(Object obj) {
        g1 g1Var = (g1) obj;
        switch (this.f54841a) {
            case 0:
                g1Var.L0();
                return;
            case 1:
                g1Var.U();
                return;
            case 2:
                g1Var.E();
                return;
            case 3:
            case 6:
            case 8:
            case 9:
            case 10:
            case 14:
            default:
                g1Var.v();
                return;
            case 4:
                g1Var.J0();
                return;
            case 5:
                g1Var.H0();
                return;
            case 7:
                g1Var.L();
                return;
            case 11:
                g1Var.stop();
                return;
            case 12:
                g1Var.c0();
                return;
            case 13:
                g1Var.G();
                return;
            case 15:
                g1Var.a();
                return;
        }
    }

    @Override
    public void call() {
        throw null;
    }

    @Override
    public Object k(d0 d0Var, v vVar, int i7) {
        switch (this.f54841a) {
            case 3:
                d0Var.getClass();
                throw new ClassCastException();
            case 6:
                w7.s sVar = d0Var.f54621e;
                d0Var.s(vVar);
                sVar.getClass();
                return r9.b(new m1(-6));
            case 10:
                d0Var.getClass();
                throw new ClassCastException();
            case 14:
                d0Var.getClass();
                throw new ClassCastException();
            case 16:
                d0Var.getClass();
                throw new ClassCastException();
            case 18:
                d0Var.getClass();
                throw new ClassCastException();
            default:
                w7.s sVar2 = d0Var.f54621e;
                d0Var.s(vVar);
                sVar2.getClass();
                return r9.b(new m1(-6));
        }
    }

    @Override
    public void release() {
    }
}
