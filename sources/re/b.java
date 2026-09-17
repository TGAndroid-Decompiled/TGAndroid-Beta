package re;
public final class b {
    public static final b f45136e;
    public boolean f45137a;
    public boolean f45138b;
    public boolean f45139c;
    public boolean d;

    static {
        ?? obj = new Object();
        obj.f45137a = true;
        obj.f45138b = true;
        obj.f45139c = false;
        obj.d = false;
        f45136e = obj;
        obj.f45137a = true;
        obj.f45138b = true;
        obj.f45139c = false;
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
