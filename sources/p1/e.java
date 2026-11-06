package p1;

import androidx.datastore.preferences.protobuf.a1;
import androidx.datastore.preferences.protobuf.b0;
import androidx.datastore.preferences.protobuf.c0;
import androidx.datastore.preferences.protobuf.x;
import androidx.datastore.preferences.protobuf.x0;
import androidx.datastore.preferences.protobuf.z;
import androidx.datastore.preferences.protobuf.z0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Set;
public final class e extends z {
    private static final e DEFAULT_INSTANCE;
    private static volatile x0 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private b0 strings_ = z0.d;

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        z.j(e.class, eVar);
    }

    public static void l(e eVar, Set set) {
        int i7;
        b0 b0Var = eVar.strings_;
        if (!((androidx.datastore.preferences.protobuf.b) b0Var).f2153a) {
            int size = b0Var.size();
            if (size == 0) {
                i7 = 10;
            } else {
                i7 = size * 2;
            }
            eVar.strings_ = ((z0) b0Var).j(i7);
        }
        b0 b0Var2 = eVar.strings_;
        Charset charset = c0.f2156a;
        if (b0Var2 instanceof ArrayList) {
            ((ArrayList) b0Var2).ensureCapacity(set.size() + b0Var2.size());
        }
        int size2 = b0Var2.size();
        for (Object obj : set) {
            if (obj == null) {
                String str = "Element at index " + (b0Var2.size() - size2) + " is null.";
                for (int size3 = b0Var2.size() - 1; size3 >= size2; size3--) {
                    b0Var2.remove(size3);
                }
                throw new NullPointerException(str);
            }
            b0Var2.add(obj);
        }
    }

    public static e m() {
        return DEFAULT_INSTANCE;
    }

    public static d o() {
        return (d) ((x) DEFAULT_INSTANCE.c(5));
    }

    @Override
    public final Object c(int i7) {
        x0 x0Var;
        switch (g.c(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new a1(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new e();
            case 4:
                return new x(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                x0 x0Var2 = PARSER;
                if (x0Var2 == null) {
                    synchronized (e.class) {
                        try {
                            x0 x0Var3 = PARSER;
                            x0Var = x0Var3;
                            if (x0Var3 == null) {
                                ?? obj = new Object();
                                PARSER = obj;
                                x0Var = obj;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return x0Var;
                }
                return x0Var2;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final b0 n() {
        return this.strings_;
    }
}
