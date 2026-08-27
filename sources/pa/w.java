package pa;

import h7.w6;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;

public final class w extends t {

    public static final HashMap f45671e;

    public final Constructor f45672b;

    public final Object[] f45673c;
    public final HashMap d;

    static {
        HashMap map = new HashMap();
        map.put(Byte.TYPE, (byte) 0);
        map.put(Short.TYPE, (short) 0);
        map.put(Integer.TYPE, 0);
        map.put(Long.TYPE, 0L);
        map.put(Float.TYPE, Float.valueOf(0.0f));
        map.put(Double.TYPE, Double.valueOf(0.0d));
        map.put(Character.TYPE, (char) 0);
        map.put(Boolean.TYPE, Boolean.FALSE);
        f45671e = map;
    }

    public w(Class cls, v vVar) {
        super(vVar);
        this.d = new HashMap();
        w6 w6Var = ra.c.f46882a;
        Constructor constructorB = w6Var.b(cls);
        this.f45672b = constructorB;
        ra.c.f(constructorB);
        String[] strArrC = w6Var.c(cls);
        for (int i10 = 0; i10 < strArrC.length; i10++) {
            this.d.put(strArrC[i10], Integer.valueOf(i10));
        }
        Class<?>[] parameterTypes = this.f45672b.getParameterTypes();
        this.f45673c = new Object[parameterTypes.length];
        for (int i11 = 0; i11 < parameterTypes.length; i11++) {
            this.f45673c[i11] = f45671e.get(parameterTypes[i11]);
        }
    }

    @Override
    public final Object a() {
        return (Object[]) this.f45673c.clone();
    }

    @Override
    public final Object b(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.f45672b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e9) {
            w6 w6Var = ra.c.f46882a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e9);
        } catch (IllegalArgumentException e10) {
            e = e10;
            throw new RuntimeException("Failed to invoke constructor '" + ra.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e11) {
            e = e11;
            throw new RuntimeException("Failed to invoke constructor '" + ra.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("Failed to invoke constructor '" + ra.c.b(constructor) + "' with args " + Arrays.toString(objArr), e12.getCause());
        }
    }

    @Override
    public final void c(Object obj, ua.a aVar, s sVar) {
        Object[] objArr = (Object[]) obj;
        String str = sVar.f45662c;
        Integer num = (Integer) this.d.get(str);
        if (num == null) {
            throw new IllegalStateException("Could not find the index in the constructor '" + ra.c.b(this.f45672b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
        int iIntValue = num.intValue();
        Object obj2 = sVar.f45664f.read(aVar);
        if (obj2 != null || !sVar.f45665g) {
            objArr[iIntValue] = obj2;
        } else {
            StringBuilder sbR = a9.p.r("null is not allowed as value for record component '", str, "' of primitive type; at path ");
            sbR.append(aVar.h());
            throw new a7.c(sbR.toString());
        }
    }
}
