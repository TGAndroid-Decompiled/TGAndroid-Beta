package re;
public final class b {
    public static final b e;
    public boolean f41430a;
    public boolean f41431b;
    public boolean f41432c;
    public boolean d;

    static {
        ?? obj = new Object();
        obj.f41430a = true;
        obj.f41431b = true;
        obj.f41432c = false;
        obj.d = false;
        e = obj;
        obj.f41430a = true;
        obj.f41431b = true;
        obj.f41432c = false;
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
