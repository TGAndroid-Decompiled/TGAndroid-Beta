package y6;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

public abstract class c1 implements Comparable {
    public static int c(byte b10) {
        return (b10 >> 5) & 7;
    }

    public static c1 d(byte... bArr) {
        bArr.getClass();
        e1 e1Var = new e1(new ByteArrayInputStream(Arrays.copyOf(bArr, bArr.length)));
        try {
            return a.k(e1Var);
        } finally {
            try {
                e1Var.close();
            } catch (IOException unused) {
            }
        }
    }

    public int a() {
        return 0;
    }

    public final c1 b(Class cls) throws b1 {
        if (cls.isInstance(this)) {
            return (c1) cls.cast(this);
        }
        throw new b1(i0.a.n("Expected a ", cls.getName(), " value, but got ", getClass().getName()));
    }

    public abstract int zza();
}
