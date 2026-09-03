package sa;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import k7.a8;
public final class w extends t {
    public static final HashMap e;
    public final Constructor f44294b;
    public final Object[] f44295c;
    public final HashMap d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(Byte.TYPE, (byte) 0);
        hashMap.put(Short.TYPE, (short) 0);
        hashMap.put(Integer.TYPE, 0);
        hashMap.put(Long.TYPE, 0L);
        hashMap.put(Float.TYPE, Float.valueOf(0.0f));
        hashMap.put(Double.TYPE, Double.valueOf(0.0d));
        hashMap.put(Character.TYPE, (char) 0);
        hashMap.put(Boolean.TYPE, Boolean.FALSE);
        e = hashMap;
    }

    public w(Class cls, v vVar) {
        super(vVar);
        this.d = new HashMap();
        a8 a8Var = ua.c.f45266a;
        Constructor b10 = a8Var.b(cls);
        this.f44294b = b10;
        ua.c.f(b10);
        String[] c3 = a8Var.c(cls);
        for (int i10 = 0; i10 < c3.length; i10++) {
            this.d.put(c3[i10], Integer.valueOf(i10));
        }
        Class<?>[] parameterTypes = this.f44294b.getParameterTypes();
        this.f44295c = new Object[parameterTypes.length];
        for (int i11 = 0; i11 < parameterTypes.length; i11++) {
            this.f44295c[i11] = e.get(parameterTypes[i11]);
        }
    }

    @Override
    public final Object a() {
        return (Object[]) this.f44295c.clone();
    }

    @Override
    public final Object b(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.f44294b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e6) {
            a8 a8Var = ua.c.f45266a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e6);
        } catch (IllegalArgumentException e10) {
            e = e10;
            throw new RuntimeException("Failed to invoke constructor '" + ua.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e11) {
            e = e11;
            throw new RuntimeException("Failed to invoke constructor '" + ua.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("Failed to invoke constructor '" + ua.c.b(constructor) + "' with args " + Arrays.toString(objArr), e12.getCause());
        }
    }

    @Override
    public final void c(Object obj, xa.a aVar, s sVar) {
        Object[] objArr = (Object[]) obj;
        String str = sVar.f44286c;
        Integer num = (Integer) this.d.get(str);
        if (num != null) {
            int intValue = num.intValue();
            Object read = sVar.f44287f.read(aVar);
            if (read == null && sVar.f44288g) {
                StringBuilder t6 = android.support.v4.media.a.t("null is not allowed as value for record component '", str, "' of primitive type; at path ");
                t6.append(aVar.h());
                throw new RuntimeException(t6.toString());
            }
            objArr[intValue] = read;
            return;
        }
        throw new IllegalStateException("Could not find the index in the constructor '" + ua.c.b(this.f44294b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
    }
}
