package re;
public final class b {
    public static final b f45107e;
    public boolean f45108a;
    public boolean f45109b;
    public boolean f45110c;
    public boolean d;

    static {
        ?? obj = new Object();
        obj.f45108a = true;
        obj.f45109b = true;
        obj.f45110c = false;
        obj.d = false;
        f45107e = obj;
        obj.f45108a = true;
        obj.f45109b = true;
        obj.f45110c = false;
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
