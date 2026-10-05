package re;
public final class b {
    public static final b f46023e;
    public boolean f46024a;
    public boolean f46025b;
    public boolean f46026c;
    public boolean d;

    static {
        ?? obj = new Object();
        obj.f46024a = true;
        obj.f46025b = true;
        obj.f46026c = false;
        obj.d = false;
        f46023e = obj;
        obj.f46024a = true;
        obj.f46025b = true;
        obj.f46026c = false;
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
