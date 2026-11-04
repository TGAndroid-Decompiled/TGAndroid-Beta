package we;
public final class b {
    public static final b f57560e;
    public boolean f57561a;
    public boolean f57562b;
    public boolean f57563c;
    public boolean d;

    static {
        ?? obj = new Object();
        obj.f57561a = true;
        obj.f57562b = true;
        obj.f57563c = false;
        obj.d = false;
        f57560e = obj;
        obj.f57561a = true;
        obj.f57562b = true;
        obj.f57563c = false;
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
