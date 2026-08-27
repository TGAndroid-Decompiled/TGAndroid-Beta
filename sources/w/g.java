package w;

import a9.p;
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
import org.telegram.ui.Cells.pa;

public abstract class g {

    public static final ArrayMap f48924a;

    public static final ArrayMap f48925b;

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
        f48924a = arrayMap;
        ArrayMap arrayMap2 = new ArrayMap();
        arrayMap2.put(0, "primitive");
        arrayMap2.put(1, "iInterface");
        arrayMap2.put(9, "iBinder");
        arrayMap2.put(2, "map");
        arrayMap2.put(3, "set");
        arrayMap2.put(4, "list");
        arrayMap2.put(5, "object");
        arrayMap2.put(6, "image");
        f48925b = arrayMap2;
    }

    public static void a(Bundle bundle, AbstractCollection abstractCollection, e eVar) throws f {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("tag_value");
        if (parcelableArrayList == null) {
            throw new f("Bundle is missing the collection", eVar);
        }
        int size = parcelableArrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = parcelableArrayList.get(i10);
            i10++;
            abstractCollection.add(f((Bundle) ((Parcelable) obj), eVar));
        }
    }

    public static Object b(Bundle bundle, e eVar) throws f {
        String string = bundle.getString("tag_value");
        if (string == null) {
            throw new f(p.m("Missing enum name [", string, "]"), eVar);
        }
        String string2 = bundle.getString("tag_class_name");
        if (string2 == null) {
            throw new f(p.m("Missing enum className [", string2, "]"), eVar);
        }
        try {
            return g(Class.forName(string2), "valueOf", eVar).invoke(null, string);
        } catch (ClassNotFoundException e9) {
            throw new f(p.m("Enum class [", string2, "] not found"), eVar, e9);
        } catch (IllegalArgumentException e10) {
            throw new f(pa.j("Enum value [", string, "] does not exist in enum class [", string2, "]"), eVar, e10);
        } catch (ReflectiveOperationException e11) {
            throw new f(p.m("Enum of class [", string2, "] missing valueOf method"), eVar, e11);
        }
    }

    public static Object c(Bundle bundle, e eVar) throws f {
        IBinder binder = bundle.getBinder("tag_value");
        if (binder == null) {
            throw new f("Bundle is missing the binder", eVar);
        }
        String string = bundle.getString("tag_class_name");
        if (string == null) {
            throw new f("Bundle is missing IInterface class name", eVar);
        }
        try {
            Object objInvoke = g(Class.forName(string), "asInterface", eVar).invoke(null, binder);
            if (objInvoke != null) {
                return objInvoke;
            }
            throw new f("Failed to get interface from binder", eVar);
        } catch (ClassNotFoundException e9) {
            throw new f("Binder for unknown IInterface: ".concat(string), eVar, e9);
        } catch (ReflectiveOperationException e10) {
            throw new f("Method to create IInterface from a Binder is not accessible for interface: ".concat(string), eVar, e10);
        }
    }

    public static HashMap d(Bundle bundle, e eVar) throws f {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("tag_value");
        if (parcelableArrayList == null) {
            throw new f("Bundle is missing the map", eVar);
        }
        HashMap map = new HashMap();
        int size = parcelableArrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = parcelableArrayList.get(i10);
            i10++;
            Bundle bundle2 = (Bundle) ((Parcelable) obj);
            Bundle bundle3 = bundle2.getBundle("tag_1");
            Bundle bundle4 = bundle2.getBundle("tag_2");
            if (bundle3 == null) {
                throw new f("Bundle is missing key", eVar);
            }
            map.put(f(bundle3, eVar), bundle4 == null ? null : f(bundle4, eVar));
        }
        return map;
    }

    public static Object e(Bundle bundle, e eVar) throws f {
        String string = bundle.getString("tag_class_name");
        if (string == null) {
            throw new f("Bundle is missing the class name", eVar);
        }
        try {
            Class<?> cls = Class.forName(string);
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            Object objNewInstance = declaredConstructor.newInstance(null);
            ArrayList arrayListH = h(cls);
            int size = arrayListH.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayListH.get(i10);
                i10++;
                Field field = (Field) obj;
                field.setAccessible(true);
                String str = field.getDeclaringClass().getName() + field.getName();
                Object obj2 = bundle.get(str);
                if (obj2 == null) {
                    obj2 = bundle.get(str.replaceAll("androidx.core.graphics.drawable.IconCompat", "androidx.core.graphics.drawable.IconCompat"));
                }
                if (obj2 instanceof Bundle) {
                    field.set(objNewInstance, f((Bundle) obj2, eVar));
                } else if (obj2 == null && Log.isLoggable("CarApp.Bun", 3)) {
                    Log.d("CarApp.Bun", "Value is null for field: " + field);
                }
            }
            return objNewInstance;
        } catch (ClassNotFoundException e9) {
            throw new f("Object for unknown class: ".concat(string), eVar, e9);
        } catch (IllegalArgumentException e10) {
            throw new f("Failed to deserialize class: ".concat(string), eVar, e10);
        } catch (NoSuchMethodException e11) {
            throw new f("Object missing no args constructor: ".concat(string), eVar, e11);
        } catch (ReflectiveOperationException e12) {
            throw new f("Constructor or field is not accessible: ".concat(string), eVar, e12);
        }
    }

    public static Object f(Bundle bundle, e eVar) {
        ClassLoader classLoader = g.class.getClassLoader();
        Objects.requireNonNull(classLoader);
        bundle.setClassLoader(classLoader);
        int i10 = bundle.getInt("tag_class_type");
        String str = (String) f48925b.get(Integer.valueOf(bundle.getInt("tag_class_type")));
        if (str == null) {
            str = "unknown";
        }
        e eVar2 = new e(bundle, str, eVar.f48923b);
        try {
            try {
                switch (i10) {
                    case 0:
                        Object obj = bundle.get("tag_value");
                        if (obj == null) {
                            throw new f("Bundle is missing the primitive value", eVar2);
                        }
                        eVar2.close();
                        return obj;
                    case 1:
                        Object objC = c(bundle, eVar2);
                        eVar2.close();
                        return objC;
                    case 2:
                        HashMap mapD = d(bundle, eVar2);
                        eVar2.close();
                        return mapD;
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
                        Object objE = e(bundle, eVar2);
                        eVar2.close();
                        return objE;
                    case 6:
                        Bundle bundle2 = bundle.getBundle("tag_value");
                        if (bundle2 == null) {
                            throw new f("IconCompat bundle is null", eVar2);
                        }
                        IconCompat iconCompatA = IconCompat.a(bundle2);
                        if (iconCompatA == null) {
                            throw new f("Failed to create IconCompat from bundle", eVar2);
                        }
                        eVar2.close();
                        return iconCompatA;
                    case 7:
                        Object objB = b(bundle, eVar2);
                        eVar2.close();
                        return objB;
                    case 8:
                        String string = bundle.getString("tag_value");
                        if (string == null) {
                            throw new f("Class is missing the class name", eVar2);
                        }
                        try {
                            Class<?> cls = Class.forName(string);
                            eVar2.close();
                            return cls;
                        } catch (ClassNotFoundException e9) {
                            throw new f("Class name is unknown: ".concat(string), eVar2, e9);
                        }
                    case 9:
                        IBinder binder = bundle.getBinder("tag_value");
                        if (binder == null) {
                            throw new f("Bundle is missing the binder", eVar2);
                        }
                        eVar2.close();
                        return binder;
                    case 10:
                        p0 p0VarA = p0.a(bundle);
                        eVar2.close();
                        return p0VarA;
                    default:
                        throw new f("Unsupported class type in bundle: " + i10, eVar2);
                }
            } catch (Throwable th) {
                eVar2.close();
                throw th;
            }
            eVar2.close();
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public static Method g(Class cls, String str, e eVar) throws f {
        if (cls == null || cls == Object.class) {
            throw new f("No method " + str + " in class " + cls, eVar);
        }
        for (Method method : cls.getDeclaredMethods()) {
            if (method.getName().equals(str)) {
                method.setAccessible(true);
                return method;
            }
        }
        return g(cls.getSuperclass(), str, eVar);
    }

    public static ArrayList h(Class cls) {
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
        String str = (String) f48924a.get(cls);
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
        return str == null ? cls.getSimpleName() : str;
    }

    public static Bundle j(Collection collection, e eVar) {
        Bundle bundle = new Bundle(2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            arrayList.add(o(it.next(), "<item " + i10 + ">", eVar));
            i10++;
        }
        bundle.putParcelableArrayList("tag_value", arrayList);
        return bundle;
    }

    public static Bundle k(Object obj, e eVar) throws f {
        Bundle bundle = new Bundle(3);
        bundle.putInt("tag_class_type", 7);
        try {
            bundle.putString("tag_value", (String) g(obj.getClass(), "name", eVar).invoke(obj, null));
            bundle.putString("tag_class_name", obj.getClass().getName());
            return bundle;
        } catch (ReflectiveOperationException e9) {
            throw new f("Enum missing name method", eVar, e9);
        }
    }

    public static Bundle l(Map map, e eVar) {
        Bundle bundle = new Bundle(2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        int i10 = 0;
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle2 = new Bundle(2);
            bundle2.putBundle("tag_1", o(entry.getKey(), "<key " + i10 + ">", eVar));
            if (entry.getValue() != null) {
                bundle2.putBundle("tag_2", o(entry.getValue(), "<value " + i10 + ">", eVar));
            }
            i10++;
            arrayList.add(bundle2);
        }
        bundle.putInt("tag_class_type", 2);
        bundle.putParcelableArrayList("tag_value", arrayList);
        return bundle;
    }

    public static Bundle m(Object obj, e eVar) throws f {
        String name = obj.getClass().getName();
        try {
            obj.getClass().getDeclaredConstructor(null);
            ArrayList arrayListH = h(obj.getClass());
            Bundle bundle = new Bundle(arrayListH.size() + 2);
            bundle.putInt("tag_class_type", 5);
            bundle.putString("tag_class_name", name);
            int size = arrayListH.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = arrayListH.get(i10);
                i10++;
                Field field = (Field) obj2;
                field.setAccessible(true);
                String strL = s3.c.l(field.getDeclaringClass().getName(), field.getName());
                try {
                    Object obj3 = field.get(obj);
                    if (obj3 != null) {
                        bundle.putParcelable(strL, o(obj3, field.getName(), eVar));
                    }
                } catch (IllegalAccessException e9) {
                    throw new f(s3.c.e("Field is not accessible: ", strL), eVar, e9);
                }
            }
            return bundle;
        } catch (NoSuchMethodException e10) {
            throw new f("Class to deserialize is missing a no args constructor: ".concat(name), eVar, e10);
        }
    }

    public static Bundle n(Object obj, e eVar) throws f {
        Bundle bundle = new Bundle(2);
        bundle.putInt("tag_class_type", 0);
        if (obj instanceof Boolean) {
            bundle.putBoolean("tag_value", ((Boolean) obj).booleanValue());
            return bundle;
        }
        if (obj instanceof Byte) {
            bundle.putByte("tag_value", ((Byte) obj).byteValue());
            return bundle;
        }
        if (obj instanceof Character) {
            bundle.putChar("tag_value", ((Character) obj).charValue());
            return bundle;
        }
        if (obj instanceof Short) {
            bundle.putShort("tag_value", ((Short) obj).shortValue());
            return bundle;
        }
        if (obj instanceof Integer) {
            bundle.putInt("tag_value", ((Integer) obj).intValue());
            return bundle;
        }
        if (obj instanceof Long) {
            bundle.putLong("tag_value", ((Long) obj).longValue());
            return bundle;
        }
        if (obj instanceof Double) {
            bundle.putDouble("tag_value", ((Double) obj).doubleValue());
            return bundle;
        }
        if (obj instanceof Float) {
            bundle.putFloat("tag_value", ((Float) obj).floatValue());
            return bundle;
        }
        if (obj instanceof String) {
            bundle.putString("tag_value", (String) obj);
            return bundle;
        }
        if (!(obj instanceof Parcelable)) {
            throw new f("Unsupported primitive type: ".concat(obj.getClass().getName()), eVar);
        }
        bundle.putParcelable("tag_value", (Parcelable) obj);
        return bundle;
    }

    public static Bundle o(Object obj, String str, e eVar) throws c {
        ArrayDeque arrayDeque = eVar.f48923b;
        if (obj != null) {
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                if (((d) it.next()).f48920a == obj) {
                    throw new c("Found cycle while bundling type ".concat(obj.getClass().getSimpleName()), eVar);
                }
            }
        }
        e eVar2 = new e(obj, str, arrayDeque);
        try {
            if (obj == null) {
                throw new f("Bundling of null object is not supported", eVar2);
            }
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
                }
                if (obj instanceof IBinder) {
                    Bundle bundle3 = new Bundle(2);
                    bundle3.putInt("tag_class_type", 9);
                    bundle3.putBinder("tag_value", (IBinder) obj);
                    eVar2.close();
                    return bundle3;
                }
                if (obj instanceof Map) {
                    Bundle bundleL = l((Map) obj, eVar2);
                    eVar2.close();
                    return bundleL;
                }
                if (obj instanceof List) {
                    Bundle bundleJ = j((List) obj, eVar2);
                    bundleJ.putInt("tag_class_type", 4);
                    eVar2.close();
                    return bundleJ;
                }
                if (obj instanceof Set) {
                    Bundle bundleJ2 = j((Set) obj, eVar2);
                    bundleJ2.putInt("tag_class_type", 3);
                    eVar2.close();
                    return bundleJ2;
                }
                if (obj.getClass().isEnum()) {
                    Bundle bundleK = k(obj, eVar2);
                    eVar2.close();
                    return bundleK;
                }
                if (obj instanceof Class) {
                    Bundle bundle4 = new Bundle(2);
                    bundle4.putInt("tag_class_type", 8);
                    bundle4.putString("tag_value", ((Class) obj).getName());
                    eVar2.close();
                    return bundle4;
                }
                if (obj.getClass().isArray()) {
                    throw new f("Object serializing contains an array, use a list or a set instead", eVar2);
                }
                if (!(obj instanceof p0)) {
                    Bundle bundleM = m(obj, eVar2);
                    eVar2.close();
                    return bundleM;
                }
                Bundle bundleC = ((p0) obj).c();
                bundleC.putInt("tag_class_type", 10);
                eVar2.close();
                return bundleC;
            }
            Bundle bundleN = n(obj, eVar2);
            eVar2.close();
            return bundleN;
        } catch (Throwable th) {
            try {
                eVar2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
