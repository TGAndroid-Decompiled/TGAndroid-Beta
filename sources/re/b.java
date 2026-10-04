package re;
public final class b {
    public static final b f46009e;
    public boolean f46010a;
    public boolean f46011b;
    public boolean f46012c;
    public boolean d;

    static {
        ?? obj = new Object();
        obj.f46010a = true;
        obj.f46011b = true;
        obj.f46012c = false;
        obj.d = false;
        f46009e = obj;
        obj.f46010a = true;
        obj.f46011b = true;
        obj.f46012c = false;
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
