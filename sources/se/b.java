package se;
public final class b {
    public static final b f47970e;
    public boolean f47971a;
    public boolean f47972b;
    public boolean f47973c;
    public boolean d;

    static {
        ?? obj = new Object();
        obj.f47971a = true;
        obj.f47972b = true;
        obj.f47973c = false;
        obj.d = false;
        f47970e = obj;
        obj.f47971a = true;
        obj.f47972b = true;
        obj.f47973c = false;
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
