package ze;
public final class c {
    public static final c f61915e;
    public boolean f61916a;
    public boolean f61917b;
    public boolean f61918c;
    public boolean d;

    static {
        ?? obj = new Object();
        obj.f61916a = true;
        obj.f61917b = true;
        obj.f61918c = false;
        obj.d = false;
        f61915e = obj;
        obj.f61916a = true;
        obj.f61917b = true;
        obj.f61918c = false;
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
