package re;
public final class b {
    public static final b f46016e;
    public boolean f46017a;
    public boolean f46018b;
    public boolean f46019c;
    public boolean d;

    static {
        ?? obj = new Object();
        obj.f46017a = true;
        obj.f46018b = true;
        obj.f46019c = false;
        obj.d = false;
        f46016e = obj;
        obj.f46017a = true;
        obj.f46018b = true;
        obj.f46019c = false;
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
