package se;
public final class b {
    public static final b f48209e;
    public boolean f48210a;
    public boolean f48211b;
    public boolean f48212c;
    public boolean d;

    static {
        ?? obj = new Object();
        obj.f48210a = true;
        obj.f48211b = true;
        obj.f48212c = false;
        obj.d = false;
        f48209e = obj;
        obj.f48210a = true;
        obj.f48211b = true;
        obj.f48212c = false;
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
