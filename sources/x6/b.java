package x6;

import android.os.IBinder;
import android.os.IInterface;
import i2.g;
import java.lang.reflect.Field;
import n6.l;
public final class b extends b8.b implements a {
    public final Object f48943b;

    public b(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper", 7);
        this.f48943b = obj;
    }

    public static a L0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        if (queryLocalInterface instanceof a) {
            return (a) queryLocalInterface;
        }
        return new a9.a(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 7);
    }

    public static Object M0(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).f48943b;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i10 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i10++;
                field = field2;
            }
        }
        if (i10 == 1) {
            l.h(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (IllegalAccessException e7) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e7);
                } catch (NullPointerException e10) {
                    throw new IllegalArgumentException("Binder object is null.", e10);
                }
            }
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        throw new IllegalArgumentException(g.i(declaredFields.length, "Unexpected number of IObjectWrapper declared fields: "));
    }
}
