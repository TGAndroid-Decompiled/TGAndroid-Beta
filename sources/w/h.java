package w;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.util.ArrayMap;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import e0.o0;
import j$.util.Objects;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.telegram.ui.yh;
public abstract class h {
    public static final ArrayMap f49315a;
    public static final ArrayMap f49316b;

    static {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put(Boolean.class, "bool");
        arrayMap.put(Byte.class, "byte");
        arrayMap.put(Short.class, "short");
        arrayMap.put(Integer.class, "int");
        arrayMap.put(Long.class, "long");
        arrayMap.put(Double.class, "double");
        arrayMap.put(Float.class, "float");
        arrayMap.put(String.class, "string");
        arrayMap.put(Parcelable.class, "parcelable");
        arrayMap.put(Map.class, "map");
        arrayMap.put(List.class, "list");
        arrayMap.put(IconCompat.class, "image");
        f49315a = arrayMap;
        ArrayMap arrayMap2 = new ArrayMap();
        arrayMap2.put(0, "primitive");
        arrayMap2.put(1, "iInterface");
        arrayMap2.put(9, "iBinder");
        arrayMap2.put(2, "map");
        arrayMap2.put(3, "set");
        arrayMap2.put(4, "list");
        arrayMap2.put(5, "object");
        arrayMap2.put(6, "image");
        f49316b = arrayMap2;
    }

    public static void a(Bundle bundle, AbstractCollection abstractCollection, f fVar) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("tag_value");
        if (parcelableArrayList != null) {
            int size = parcelableArrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = parcelableArrayList.get(i10);
                i10++;
                abstractCollection.add(f((Bundle) ((Parcelable) obj), fVar));
            }
            return;
        }
        throw new g("Bundle is missing the collection", fVar);
    }

    public static Object b(Bundle bundle, f fVar) {
        String string = bundle.getString("tag_value");
        if (string != null) {
            String string2 = bundle.getString("tag_class_name");
            if (string2 != null) {
                try {
                    return g(Class.forName(string2), "valueOf", fVar).invoke(null, string);
                } catch (ClassNotFoundException e6) {
                    throw new g(android.support.v4.media.a.o("Enum class [", string2, "] not found"), fVar, e6);
                } catch (IllegalArgumentException e10) {
                    throw new g(yh.l("Enum value [", string, "] does not exist in enum class [", string2, "]"), fVar, e10);
                } catch (ReflectiveOperationException e11) {
                    throw new g(android.support.v4.media.a.o("Enum of class [", string2, "] missing valueOf method"), fVar, e11);
                }
            }
            throw new g(android.support.v4.media.a.o("Missing enum className [", string2, "]"), fVar);
        }
        throw new g(android.support.v4.media.a.o("Missing enum name [", string, "]"), fVar);
    }

    public static Object c(Bundle bundle, f fVar) {
        IBinder binder = bundle.getBinder("tag_value");
        if (binder != null) {
            String string = bundle.getString("tag_class_name");
            if (string != null) {
                try {
                    Object invoke = g(Class.forName(string), "asInterface", fVar).invoke(null, binder);
                    if (invoke != null) {
                        return invoke;
                    }
                    throw new g("Failed to get interface from binder", fVar);
                } catch (ClassNotFoundException e6) {
                    throw new g("Binder for unknown IInterface: ".concat(string), fVar, e6);
                } catch (ReflectiveOperationException e10) {
                    throw new g("Method to create IInterface from a Binder is not accessible for interface: ".concat(string), fVar, e10);
                }
            }
            throw new g("Bundle is missing IInterface class name", fVar);
        }
        throw new g("Bundle is missing the binder", fVar);
    }

    public static HashMap d(Bundle bundle, f fVar) {
        Object f10;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("tag_value");
        if (parcelableArrayList != null) {
            HashMap hashMap = new HashMap();
            int size = parcelableArrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = parcelableArrayList.get(i10);
                i10++;
                Bundle bundle2 = (Bundle) ((Parcelable) obj);
                Bundle bundle3 = bundle2.getBundle("tag_1");
                Bundle bundle4 = bundle2.getBundle("tag_2");
                if (bundle3 != null) {
                    Object f11 = f(bundle3, fVar);
                    if (bundle4 == null) {
                        f10 = null;
                    } else {
                        f10 = f(bundle4, fVar);
                    }
                    hashMap.put(f11, f10);
                } else {
                    throw new g("Bundle is missing key", fVar);
                }
            }
            return hashMap;
        }
        throw new g("Bundle is missing the map", fVar);
    }

    public static Object e(Bundle bundle, f fVar) {
        String string = bundle.getString("tag_class_name");
        if (string != null) {
            try {
                Class<?> cls = Class.forName(string);
                Constructor<?> declaredConstructor = cls.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                Object newInstance = declaredConstructor.newInstance(null);
                ArrayList h = h(cls);
                int size = h.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = h.get(i10);
                    i10++;
                    Field field = (Field) obj;
                    field.setAccessible(true);
                    String str = field.getDeclaringClass().getName() + field.getName();
                    Object obj2 = bundle.get(str);
                    if (obj2 == null) {
                        obj2 = bundle.get(str.replaceAll("androidx.core.graphics.drawable.IconCompat", "androidx.core.graphics.drawable.IconCompat"));
                    }
                    if (obj2 instanceof Bundle) {
                        field.set(newInstance, f((Bundle) obj2, fVar));
                    } else if (obj2 == null && Log.isLoggable("CarApp.Bun", 3)) {
                        Log.d("CarApp.Bun", "Value is null for field: " + field);
                    }
                }
                return newInstance;
            } catch (ClassNotFoundException e6) {
                throw new g("Object for unknown class: ".concat(string), fVar, e6);
            } catch (IllegalArgumentException e10) {
                throw new g("Failed to deserialize class: ".concat(string), fVar, e10);
            } catch (NoSuchMethodException e11) {
                throw new g("Object missing no args constructor: ".concat(string), fVar, e11);
            } catch (ReflectiveOperationException e12) {
                throw new g("Constructor or field is not accessible: ".concat(string), fVar, e12);
            }
        }
        throw new g("Bundle is missing the class name", fVar);
    }

    public static Object f(Bundle bundle, f fVar) {
        String str;
        ClassLoader classLoader = h.class.getClassLoader();
        Objects.requireNonNull(classLoader);
        bundle.setClassLoader(classLoader);
        int i10 = bundle.getInt("tag_class_type");
        String str2 = (String) f49316b.get(Integer.valueOf(bundle.getInt("tag_class_type")));
        if (str2 == null) {
            str2 = "unknown";
        }
        f fVar2 = new f(bundle, str2, fVar.f49314b);
        try {
            switch (i10) {
                case 0:
                    Object obj = bundle.get("tag_value");
                    if (obj != null) {
                        fVar2.close();
                        return obj;
                    }
                    throw new g("Bundle is missing the primitive value", fVar2);
                case 1:
                    Object c3 = c(bundle, fVar2);
                    fVar2.close();
                    return c3;
                case 2:
                    HashMap d = d(bundle, fVar2);
                    fVar2.close();
                    return d;
                case 3:
                    HashSet hashSet = new HashSet();
                    a(bundle, hashSet, fVar2);
                    fVar2.close();
                    return hashSet;
                case 4:
                    ArrayList arrayList = new ArrayList();
                    a(bundle, arrayList, fVar2);
                    fVar2.close();
                    return arrayList;
                case 5:
                    Object e6 = e(bundle, fVar2);
                    fVar2.close();
                    return e6;
                case 6:
                    Bundle bundle2 = bundle.getBundle("tag_value");
                    if (bundle2 != null) {
                        IconCompat a2 = IconCompat.a(bundle2);
                        if (a2 != null) {
                            fVar2.close();
                            return a2;
                        }
                        throw new g("Failed to create IconCompat from bundle", fVar2);
                    }
                    throw new g("IconCompat bundle is null", fVar2);
                case 7:
                    Object b10 = b(bundle, fVar2);
                    fVar2.close();
                    return b10;
                case 8:
                    String string = bundle.getString("tag_value");
                    if (string != null) {
                        try {
                            Class<?> cls = Class.forName(string);
                            fVar2.close();
                            return cls;
                        } catch (ClassNotFoundException e10) {
                            throw new g("Class name is unknown: ".concat(str), fVar2, e10);
                        }
                    }
                    throw new g("Class is missing the class name", fVar2);
                case 9:
                    IBinder binder = bundle.getBinder("tag_value");
                    if (binder != null) {
                        fVar2.close();
                        return binder;
                    }
                    throw new g("Bundle is missing the binder", fVar2);
                case 10:
                    o0 a10 = o0.a(bundle);
                    fVar2.close();
                    return a10;
                default:
                    throw new g("Unsupported class type in bundle: " + i10, fVar2);
            }
        } catch (Throwable th2) {
            try {
                fVar2.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static Method g(Class cls, String str, f fVar) {
        Method[] declaredMethods;
        if (cls != null && cls != Object.class) {
            for (Method method : cls.getDeclaredMethods()) {
                if (method.getName().equals(str)) {
                    method.setAccessible(true);
                    return method;
                }
            }
            return g(cls.getSuperclass(), str, fVar);
        }
        throw new g("No method " + str + " in class " + cls, fVar);
    }

    public static ArrayList h(Class cls) {
        Field[] declaredFields;
        ArrayList arrayList = new ArrayList();
        if (cls != null && cls != Object.class) {
            for (Field field : cls.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    arrayList.add(field);
                }
            }
            arrayList.addAll(h(cls.getSuperclass()));
        }
        return arrayList;
    }

    public static String i(Class cls) {
        String str = (String) f49315a.get(cls);
        if (str == null) {
            if (List.class.isAssignableFrom(cls)) {
                return "<List>";
            }
            if (Map.class.isAssignableFrom(cls)) {
                return "<Map>";
            }
            if (Set.class.isAssignableFrom(cls)) {
                return "<Set>";
            }
        }
        if (str == null) {
            return cls.getSimpleName();
        }
        return str;
    }

    public static Bundle j(Collection collection, f fVar) {
        Bundle bundle = new Bundle(2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        int i10 = 0;
        for (Object obj : collection) {
            arrayList.add(o(obj, "<item " + i10 + ">", fVar));
            i10++;
        }
        bundle.putParcelableArrayList("tag_value", arrayList);
        return bundle;
    }

    public static Bundle k(Object obj, f fVar) {
        Bundle bundle = new Bundle(3);
        bundle.putInt("tag_class_type", 7);
        try {
            bundle.putString("tag_value", (String) g(obj.getClass(), "name", fVar).invoke(obj, null));
            bundle.putString("tag_class_name", obj.getClass().getName());
            return bundle;
        } catch (ReflectiveOperationException e6) {
            throw new g("Enum missing name method", fVar, e6);
        }
    }

    public static Bundle l(Map map, f fVar) {
        Bundle bundle = new Bundle(2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        int i10 = 0;
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle2 = new Bundle(2);
            Object key = entry.getKey();
            bundle2.putBundle("tag_1", o(key, "<key " + i10 + ">", fVar));
            if (entry.getValue() != null) {
                Object value = entry.getValue();
                bundle2.putBundle("tag_2", o(value, "<value " + i10 + ">", fVar));
            }
            i10++;
            arrayList.add(bundle2);
        }
        bundle.putInt("tag_class_type", 2);
        bundle.putParcelableArrayList("tag_value", arrayList);
        return bundle;
    }

    public static Bundle m(Object obj, f fVar) {
        String name = obj.getClass().getName();
        try {
            obj.getClass().getDeclaredConstructor(null);
            ArrayList h = h(obj.getClass());
            Bundle bundle = new Bundle(h.size() + 2);
            bundle.putInt("tag_class_type", 5);
            bundle.putString("tag_class_name", name);
            int size = h.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = h.get(i10);
                i10++;
                Field field = (Field) obj2;
                field.setAccessible(true);
                String e6 = c.e(field.getDeclaringClass().getName(), field.getName());
                try {
                    Object obj3 = field.get(obj);
                    if (obj3 != null) {
                        bundle.putParcelable(e6, o(obj3, field.getName(), fVar));
                    }
                } catch (IllegalAccessException e10) {
                    throw new g(yh.k("Field is not accessible: ", e6), fVar, e10);
                }
            }
            return bundle;
        } catch (NoSuchMethodException e11) {
            throw new g("Class to deserialize is missing a no args constructor: ".concat(name), fVar, e11);
        }
    }

    public static Bundle n(Object obj, f fVar) {
        Bundle bundle = new Bundle(2);
        bundle.putInt("tag_class_type", 0);
        if (obj instanceof Boolean) {
            bundle.putBoolean("tag_value", ((Boolean) obj).booleanValue());
            return bundle;
        } else if (obj instanceof Byte) {
            bundle.putByte("tag_value", ((Byte) obj).byteValue());
            return bundle;
        } else if (obj instanceof Character) {
            bundle.putChar("tag_value", ((Character) obj).charValue());
            return bundle;
        } else if (obj instanceof Short) {
            bundle.putShort("tag_value", ((Short) obj).shortValue());
            return bundle;
        } else if (obj instanceof Integer) {
            bundle.putInt("tag_value", ((Integer) obj).intValue());
            return bundle;
        } else if (obj instanceof Long) {
            bundle.putLong("tag_value", ((Long) obj).longValue());
            return bundle;
        } else if (obj instanceof Double) {
            bundle.putDouble("tag_value", ((Double) obj).doubleValue());
            return bundle;
        } else if (obj instanceof Float) {
            bundle.putFloat("tag_value", ((Float) obj).floatValue());
            return bundle;
        } else if (obj instanceof String) {
            bundle.putString("tag_value", (String) obj);
            return bundle;
        } else if (obj instanceof Parcelable) {
            bundle.putParcelable("tag_value", (Parcelable) obj);
            return bundle;
        } else {
            throw new g("Unsupported primitive type: ".concat(obj.getClass().getName()), fVar);
        }
    }

    public static Bundle o(Object obj, String str, f fVar) {
        ArrayDeque arrayDeque = fVar.f49314b;
        if (obj != null) {
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                if (((e) it.next()).f49311a == obj) {
                    throw new g("Found cycle while bundling type ".concat(obj.getClass().getSimpleName()), fVar);
                }
            }
        }
        f fVar2 = new f(obj, str, arrayDeque);
        try {
            if (obj != null) {
                if (obj instanceof IconCompat) {
                    Bundle bundle = new Bundle(2);
                    bundle.putInt("tag_class_type", 6);
                    bundle.putBundle("tag_value", ((IconCompat) obj).l());
                    fVar2.close();
                    return bundle;
                }
                if (!(obj instanceof Boolean) && !(obj instanceof Byte) && !(obj instanceof Character) && !(obj instanceof Short) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Double) && !(obj instanceof Float) && !(obj instanceof String) && !(obj instanceof Parcelable)) {
                    if (obj instanceof IInterface) {
                        IInterface iInterface = (IInterface) obj;
                        Bundle bundle2 = new Bundle(3);
                        String name = iInterface.getClass().getName();
                        bundle2.putInt("tag_class_type", 1);
                        bundle2.putBinder("tag_value", iInterface.asBinder());
                        bundle2.putString("tag_class_name", name);
                        fVar2.close();
                        return bundle2;
                    } else if (obj instanceof IBinder) {
                        Bundle bundle3 = new Bundle(2);
                        bundle3.putInt("tag_class_type", 9);
                        bundle3.putBinder("tag_value", (IBinder) obj);
                        fVar2.close();
                        return bundle3;
                    } else if (obj instanceof Map) {
                        Bundle l10 = l((Map) obj, fVar2);
                        fVar2.close();
                        return l10;
                    } else if (obj instanceof List) {
                        Bundle j10 = j((List) obj, fVar2);
                        j10.putInt("tag_class_type", 4);
                        fVar2.close();
                        return j10;
                    } else if (obj instanceof Set) {
                        Bundle j11 = j((Set) obj, fVar2);
                        j11.putInt("tag_class_type", 3);
                        fVar2.close();
                        return j11;
                    } else if (obj.getClass().isEnum()) {
                        Bundle k10 = k(obj, fVar2);
                        fVar2.close();
                        return k10;
                    } else if (obj instanceof Class) {
                        Bundle bundle4 = new Bundle(2);
                        bundle4.putInt("tag_class_type", 8);
                        bundle4.putString("tag_value", ((Class) obj).getName());
                        fVar2.close();
                        return bundle4;
                    } else if (!obj.getClass().isArray()) {
                        if (obj instanceof o0) {
                            Bundle c3 = ((o0) obj).c();
                            c3.putInt("tag_class_type", 10);
                            fVar2.close();
                            return c3;
                        }
                        Bundle m9 = m(obj, fVar2);
                        fVar2.close();
                        return m9;
                    } else {
                        throw new g("Object serializing contains an array, use a list or a set instead", fVar2);
                    }
                }
                Bundle n10 = n(obj, fVar2);
                fVar2.close();
                return n10;
            }
            throw new g("Bundling of null object is not supported", fVar2);
        } catch (Throwable th2) {
            try {
                fVar2.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
