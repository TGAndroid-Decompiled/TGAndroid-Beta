package w;

import a4.w;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.util.ArrayMap;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import e0.p0;
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
import org.telegram.ui.th;
public abstract class g {
    public static final ArrayMap f49612a;
    public static final ArrayMap f49613b;

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
        f49612a = arrayMap;
        ArrayMap arrayMap2 = new ArrayMap();
        arrayMap2.put(0, "primitive");
        arrayMap2.put(1, "iInterface");
        arrayMap2.put(9, "iBinder");
        arrayMap2.put(2, "map");
        arrayMap2.put(3, "set");
        arrayMap2.put(4, "list");
        arrayMap2.put(5, "object");
        arrayMap2.put(6, "image");
        f49613b = arrayMap2;
    }

    public static void a(Bundle bundle, AbstractCollection abstractCollection, e eVar) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("tag_value");
        if (parcelableArrayList != null) {
            int size = parcelableArrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = parcelableArrayList.get(i10);
                i10++;
                abstractCollection.add(f((Bundle) ((Parcelable) obj), eVar));
            }
            return;
        }
        throw new f("Bundle is missing the collection", eVar);
    }

    public static Object b(Bundle bundle, e eVar) {
        String string = bundle.getString("tag_value");
        if (string != null) {
            String string2 = bundle.getString("tag_class_name");
            if (string2 != null) {
                try {
                    return g(Class.forName(string2), "valueOf", eVar).invoke(null, string);
                } catch (ClassNotFoundException e10) {
                    throw new f(w.n("Enum class [", string2, "] not found"), eVar, e10);
                } catch (IllegalArgumentException e11) {
                    throw new f(th.j("Enum value [", string, "] does not exist in enum class [", string2, "]"), eVar, e11);
                } catch (ReflectiveOperationException e12) {
                    throw new f(w.n("Enum of class [", string2, "] missing valueOf method"), eVar, e12);
                }
            }
            throw new f(w.n("Missing enum className [", string2, "]"), eVar);
        }
        throw new f(w.n("Missing enum name [", string, "]"), eVar);
    }

    public static Object c(Bundle bundle, e eVar) {
        IBinder binder = bundle.getBinder("tag_value");
        if (binder != null) {
            String string = bundle.getString("tag_class_name");
            if (string != null) {
                try {
                    Object invoke = g(Class.forName(string), "asInterface", eVar).invoke(null, binder);
                    if (invoke != null) {
                        return invoke;
                    }
                    throw new f("Failed to get interface from binder", eVar);
                } catch (ClassNotFoundException e10) {
                    throw new f("Binder for unknown IInterface: ".concat(string), eVar, e10);
                } catch (ReflectiveOperationException e11) {
                    throw new f("Method to create IInterface from a Binder is not accessible for interface: ".concat(string), eVar, e11);
                }
            }
            throw new f("Bundle is missing IInterface class name", eVar);
        }
        throw new f("Bundle is missing the binder", eVar);
    }

    public static HashMap d(Bundle bundle, e eVar) {
        Object f9;
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
                    Object f10 = f(bundle3, eVar);
                    if (bundle4 == null) {
                        f9 = null;
                    } else {
                        f9 = f(bundle4, eVar);
                    }
                    hashMap.put(f10, f9);
                } else {
                    throw new f("Bundle is missing key", eVar);
                }
            }
            return hashMap;
        }
        throw new f("Bundle is missing the map", eVar);
    }

    public static Object e(Bundle bundle, e eVar) {
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
                        field.set(newInstance, f((Bundle) obj2, eVar));
                    } else if (obj2 == null && Log.isLoggable("CarApp.Bun", 3)) {
                        Log.d("CarApp.Bun", "Value is null for field: " + field);
                    }
                }
                return newInstance;
            } catch (ClassNotFoundException e10) {
                throw new f("Object for unknown class: ".concat(string), eVar, e10);
            } catch (IllegalArgumentException e11) {
                throw new f("Failed to deserialize class: ".concat(string), eVar, e11);
            } catch (NoSuchMethodException e12) {
                throw new f("Object missing no args constructor: ".concat(string), eVar, e12);
            } catch (ReflectiveOperationException e13) {
                throw new f("Constructor or field is not accessible: ".concat(string), eVar, e13);
            }
        }
        throw new f("Bundle is missing the class name", eVar);
    }

    public static Object f(Bundle bundle, e eVar) {
        String str;
        ClassLoader classLoader = g.class.getClassLoader();
        Objects.requireNonNull(classLoader);
        bundle.setClassLoader(classLoader);
        int i10 = bundle.getInt("tag_class_type");
        String str2 = (String) f49613b.get(Integer.valueOf(bundle.getInt("tag_class_type")));
        if (str2 == null) {
            str2 = "unknown";
        }
        e eVar2 = new e(bundle, str2, eVar.f49611b);
        try {
            switch (i10) {
                case 0:
                    Object obj = bundle.get("tag_value");
                    if (obj != null) {
                        eVar2.close();
                        return obj;
                    }
                    throw new f("Bundle is missing the primitive value", eVar2);
                case 1:
                    Object c3 = c(bundle, eVar2);
                    eVar2.close();
                    return c3;
                case 2:
                    HashMap d = d(bundle, eVar2);
                    eVar2.close();
                    return d;
                case 3:
                    HashSet hashSet = new HashSet();
                    a(bundle, hashSet, eVar2);
                    eVar2.close();
                    return hashSet;
                case 4:
                    ArrayList arrayList = new ArrayList();
                    a(bundle, arrayList, eVar2);
                    eVar2.close();
                    return arrayList;
                case 5:
                    Object e10 = e(bundle, eVar2);
                    eVar2.close();
                    return e10;
                case 6:
                    Bundle bundle2 = bundle.getBundle("tag_value");
                    if (bundle2 != null) {
                        IconCompat a2 = IconCompat.a(bundle2);
                        if (a2 != null) {
                            eVar2.close();
                            return a2;
                        }
                        throw new f("Failed to create IconCompat from bundle", eVar2);
                    }
                    throw new f("IconCompat bundle is null", eVar2);
                case 7:
                    Object b10 = b(bundle, eVar2);
                    eVar2.close();
                    return b10;
                case 8:
                    String string = bundle.getString("tag_value");
                    if (string != null) {
                        try {
                            Class<?> cls = Class.forName(string);
                            eVar2.close();
                            return cls;
                        } catch (ClassNotFoundException e11) {
                            throw new f("Class name is unknown: ".concat(str), eVar2, e11);
                        }
                    }
                    throw new f("Class is missing the class name", eVar2);
                case 9:
                    IBinder binder = bundle.getBinder("tag_value");
                    if (binder != null) {
                        eVar2.close();
                        return binder;
                    }
                    throw new f("Bundle is missing the binder", eVar2);
                case 10:
                    p0 a10 = p0.a(bundle);
                    eVar2.close();
                    return a10;
                default:
                    throw new f("Unsupported class type in bundle: " + i10, eVar2);
            }
        } catch (Throwable th2) {
            try {
                eVar2.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static Method g(Class cls, String str, e eVar) {
        Method[] declaredMethods;
        if (cls != null && cls != Object.class) {
            for (Method method : cls.getDeclaredMethods()) {
                if (method.getName().equals(str)) {
                    method.setAccessible(true);
                    return method;
                }
            }
            return g(cls.getSuperclass(), str, eVar);
        }
        throw new f("No method " + str + " in class " + cls, eVar);
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
        String str = (String) f49612a.get(cls);
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

    public static Bundle j(Collection collection, e eVar) {
        Bundle bundle = new Bundle(2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        int i10 = 0;
        for (Object obj : collection) {
            arrayList.add(o(obj, "<item " + i10 + ">", eVar));
            i10++;
        }
        bundle.putParcelableArrayList("tag_value", arrayList);
        return bundle;
    }

    public static Bundle k(Object obj, e eVar) {
        Bundle bundle = new Bundle(3);
        bundle.putInt("tag_class_type", 7);
        try {
            bundle.putString("tag_value", (String) g(obj.getClass(), "name", eVar).invoke(obj, null));
            bundle.putString("tag_class_name", obj.getClass().getName());
            return bundle;
        } catch (ReflectiveOperationException e10) {
            throw new f("Enum missing name method", eVar, e10);
        }
    }

    public static Bundle l(Map map, e eVar) {
        Bundle bundle = new Bundle(2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        int i10 = 0;
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle2 = new Bundle(2);
            Object key = entry.getKey();
            bundle2.putBundle("tag_1", o(key, "<key " + i10 + ">", eVar));
            if (entry.getValue() != null) {
                Object value = entry.getValue();
                bundle2.putBundle("tag_2", o(value, "<value " + i10 + ">", eVar));
            }
            i10++;
            arrayList.add(bundle2);
        }
        bundle.putInt("tag_class_type", 2);
        bundle.putParcelableArrayList("tag_value", arrayList);
        return bundle;
    }

    public static Bundle m(Object obj, e eVar) {
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
                String k9 = u3.c.k(field.getDeclaringClass().getName(), field.getName());
                try {
                    Object obj3 = field.get(obj);
                    if (obj3 != null) {
                        bundle.putParcelable(k9, o(obj3, field.getName(), eVar));
                    }
                } catch (IllegalAccessException e10) {
                    throw new f(u3.c.e("Field is not accessible: ", k9), eVar, e10);
                }
            }
            return bundle;
        } catch (NoSuchMethodException e11) {
            throw new f("Class to deserialize is missing a no args constructor: ".concat(name), eVar, e11);
        }
    }

    public static Bundle n(Object obj, e eVar) {
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
            throw new f("Unsupported primitive type: ".concat(obj.getClass().getName()), eVar);
        }
    }

    public static Bundle o(Object obj, String str, e eVar) {
        ArrayDeque arrayDeque = eVar.f49611b;
        if (obj != null) {
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                if (((d) it.next()).f49608a == obj) {
                    throw new f("Found cycle while bundling type ".concat(obj.getClass().getSimpleName()), eVar);
                }
            }
        }
        e eVar2 = new e(obj, str, arrayDeque);
        try {
            if (obj != null) {
                if (obj instanceof IconCompat) {
                    Bundle bundle = new Bundle(2);
                    bundle.putInt("tag_class_type", 6);
                    bundle.putBundle("tag_value", ((IconCompat) obj).l());
                    eVar2.close();
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
                        eVar2.close();
                        return bundle2;
                    } else if (obj instanceof IBinder) {
                        Bundle bundle3 = new Bundle(2);
                        bundle3.putInt("tag_class_type", 9);
                        bundle3.putBinder("tag_value", (IBinder) obj);
                        eVar2.close();
                        return bundle3;
                    } else if (obj instanceof Map) {
                        Bundle l10 = l((Map) obj, eVar2);
                        eVar2.close();
                        return l10;
                    } else if (obj instanceof List) {
                        Bundle j10 = j((List) obj, eVar2);
                        j10.putInt("tag_class_type", 4);
                        eVar2.close();
                        return j10;
                    } else if (obj instanceof Set) {
                        Bundle j11 = j((Set) obj, eVar2);
                        j11.putInt("tag_class_type", 3);
                        eVar2.close();
                        return j11;
                    } else if (obj.getClass().isEnum()) {
                        Bundle k9 = k(obj, eVar2);
                        eVar2.close();
                        return k9;
                    } else if (obj instanceof Class) {
                        Bundle bundle4 = new Bundle(2);
                        bundle4.putInt("tag_class_type", 8);
                        bundle4.putString("tag_value", ((Class) obj).getName());
                        eVar2.close();
                        return bundle4;
                    } else if (!obj.getClass().isArray()) {
                        if (obj instanceof p0) {
                            Bundle c3 = ((p0) obj).c();
                            c3.putInt("tag_class_type", 10);
                            eVar2.close();
                            return c3;
                        }
                        Bundle m10 = m(obj, eVar2);
                        eVar2.close();
                        return m10;
                    } else {
                        throw new f("Object serializing contains an array, use a list or a set instead", eVar2);
                    }
                }
                Bundle n10 = n(obj, eVar2);
                eVar2.close();
                return n10;
            }
            throw new f("Bundling of null object is not supported", eVar2);
        } catch (Throwable th2) {
            try {
                eVar2.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
