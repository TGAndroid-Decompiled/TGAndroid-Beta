package ze;
public final class b {
    public static final b f60141e;
    public boolean f60142a;
    public boolean f60143b;
    public boolean f60144c;
    public boolean d;

    static {
        ?? obj = new Object();
        obj.f60142a = true;
        obj.f60143b = true;
        obj.f60144c = false;
        obj.d = false;
        f60141e = obj;
        obj.f60142a = true;
        obj.f60143b = true;
        obj.f60144c = false;
        obj.d = false;
    }

    public static String a(String str, Class cls, boolean z9) {
        if (cls == null) {
            return "ANONYMOUS";
        }
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(a(componentType.getName(), componentType, z9));
            stringBuffer.append("[]");
            return stringBuffer.toString();
        } else if (z9) {
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
