package qa;

import i7.r7;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
public final class w extends t {
    public static final HashMap f46578e;
    public final Constructor f46579b;
    public final Object[] f46580c;
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
        f46578e = hashMap;
    }

    public w(Class cls, v vVar) {
        super(vVar);
        this.d = new HashMap();
        r7 r7Var = sa.c.f47694a;
        Constructor b10 = r7Var.b(cls);
        this.f46579b = b10;
        sa.c.f(b10);
        String[] c3 = r7Var.c(cls);
        for (int i10 = 0; i10 < c3.length; i10++) {
            this.d.put(c3[i10], Integer.valueOf(i10));
        }
        Class<?>[] parameterTypes = this.f46579b.getParameterTypes();
        this.f46580c = new Object[parameterTypes.length];
        for (int i11 = 0; i11 < parameterTypes.length; i11++) {
            this.f46580c[i11] = f46578e.get(parameterTypes[i11]);
        }
    }

    @Override
    public final Object a() {
        return (Object[]) this.f46580c.clone();
    }

    @Override
    public final Object b(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.f46579b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e10) {
            r7 r7Var = sa.c.f47694a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
        } catch (IllegalArgumentException e11) {
            e = e11;
            throw new RuntimeException("Failed to invoke constructor '" + sa.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e12) {
            e = e12;
            throw new RuntimeException("Failed to invoke constructor '" + sa.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e13) {
            throw new RuntimeException("Failed to invoke constructor '" + sa.c.b(constructor) + "' with args " + Arrays.toString(objArr), e13.getCause());
        }
    }

    @Override
    public final void c(Object obj, va.a aVar, s sVar) {
        Object[] objArr = (Object[]) obj;
        String str = sVar.f46569c;
        Integer num = (Integer) this.d.get(str);
        if (num != null) {
            int intValue = num.intValue();
            Object read = sVar.f46571f.read(aVar);
            if (read == null && sVar.f46572g) {
                StringBuilder s10 = a4.w.s("null is not allowed as value for record component '", str, "' of primitive type; at path ");
                s10.append(aVar.h());
                throw new RuntimeException(s10.toString());
            }
            objArr[intValue] = read;
            return;
        }
        throw new IllegalStateException("Could not find the index in the constructor '" + sa.c.b(this.f46579b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
    }
}
