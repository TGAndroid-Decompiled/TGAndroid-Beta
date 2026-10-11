package se;
public final class b {
    public static final b f48060e;
    public boolean f48061a;
    public boolean f48062b;
    public boolean f48063c;
    public boolean d;

    static {
        ?? obj = new Object();
        obj.f48061a = true;
        obj.f48062b = true;
        obj.f48063c = false;
        obj.d = false;
        f48060e = obj;
        obj.f48061a = true;
        obj.f48062b = true;
        obj.f48063c = false;
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
