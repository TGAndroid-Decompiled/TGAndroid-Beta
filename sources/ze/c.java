package ze;
public final class c {
    public static final c f62044e;
    public boolean f62045a;
    public boolean f62046b;
    public boolean f62047c;
    public boolean d;

    static {
        ?? obj = new Object();
        obj.f62045a = true;
        obj.f62046b = true;
        obj.f62047c = false;
        obj.d = false;
        f62044e = obj;
        obj.f62045a = true;
        obj.f62046b = true;
        obj.f62047c = false;
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
