package se;
public final class b {
    public static final b f47968e;
    public boolean f47969a;
    public boolean f47970b;
    public boolean f47971c;
    public boolean d;

    static {
        ?? obj = new Object();
        obj.f47969a = true;
        obj.f47970b = true;
        obj.f47971c = false;
        obj.d = false;
        f47968e = obj;
        obj.f47969a = true;
        obj.f47970b = true;
        obj.f47971c = false;
        obj.d = false;
    }

    public static String a(String str, Class cls, boolean z10) {
        if (cls == null) {
            return "ANONYMOUS";
        }
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(a(componentType.getName(), componentType, z10));
            stringBuffer.append("[]");
            return stringBuffer.toString();
        } else if (z10) {
            int lastIndexOf = str.lastIndexOf(46);
            if (lastIndexOf != -1) {
                str = str.substring(lastIndexOf + 1);
            }
            return str.replace('$', '.');
        } else {
            return str.replace('$', '.');
        }
    }
}
