package y4;

import a0.f;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public abstract class b {
    public final f f49535a;
    public final f f49536b;
    public final f f49537c;

    public b(f fVar, f fVar2, f fVar3) {
        this.f49535a = fVar;
        this.f49536b = fVar2;
        this.f49537c = fVar3;
    }

    public abstract c a();

    public final Class b(Class cls) {
        String name = cls.getName();
        f fVar = this.f49537c;
        Class cls2 = (Class) fVar.get(name);
        if (cls2 == null) {
            String name2 = cls.getPackage().getName();
            String simpleName = cls.getSimpleName();
            Class<?> cls3 = Class.forName(name2 + "." + simpleName + "Parcelizer", false, cls.getClassLoader());
            fVar.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    public final Method c(String str) {
        f fVar = this.f49535a;
        Method method = (Method) fVar.get(str);
        if (method == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, b.class.getClassLoader()).getDeclaredMethod("read", b.class);
            fVar.put(str, declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        f fVar = this.f49536b;
        Method method = (Method) fVar.get(name);
        if (method == null) {
            Class b10 = b(cls);
            System.currentTimeMillis();
            Method declaredMethod = b10.getDeclaredMethod("write", cls, b.class);
            fVar.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public abstract boolean e(int i10);

    public final int f(int i10, int i11) {
        if (!e(i11)) {
            return i10;
        }
        return ((c) this).f49538e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i10) {
        if (!e(i10)) {
            return parcelable;
        }
        return ((c) this).f49538e.readParcelable(c.class.getClassLoader());
    }

    public final d h() {
        String readString = ((c) this).f49538e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (d) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e7) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e7);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e10);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e11);
        } catch (InvocationTargetException e12) {
            if (e12.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e12.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e12);
        }
    }

    public abstract void i(int i10);

    public final void j(int i10, int i11) {
        i(i11);
        ((c) this).f49538e.writeInt(i10);
    }

    public final void k(Parcelable parcelable, int i10) {
        i(i10);
        ((c) this).f49538e.writeParcelable(parcelable, 0);
    }

    public final void l(d dVar) {
        if (dVar == null) {
            ((c) this).f49538e.writeString(null);
            return;
        }
        try {
            ((c) this).f49538e.writeString(b(dVar.getClass()).getName());
            c a2 = a();
            try {
                d(dVar.getClass()).invoke(null, dVar, a2);
                Parcel parcel = a2.f49538e;
                int i10 = a2.f49541i;
                if (i10 >= 0) {
                    int i11 = a2.d.get(i10);
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i11);
                    parcel.writeInt(dataPosition - i11);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e7) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e7);
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e10);
            } catch (NoSuchMethodException e11) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e11);
            } catch (InvocationTargetException e12) {
                if (e12.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e12.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e12);
            }
        } catch (ClassNotFoundException e13) {
            throw new RuntimeException(dVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e13);
        }
    }
}
