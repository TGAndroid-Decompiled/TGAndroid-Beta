package te;
public final class c {
    public static final c e;
    public boolean f46998a;
    public boolean f46999b;
    public boolean f47000c;
    public boolean d;

    static {
        ?? obj = new Object();
        obj.f46998a = true;
        obj.f46999b = true;
        obj.f47000c = false;
        obj.d = false;
        e = obj;
        obj.f46998a = true;
        obj.f46999b = true;
        obj.f47000c = false;
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
