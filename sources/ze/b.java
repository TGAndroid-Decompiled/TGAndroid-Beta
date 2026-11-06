package ze;
public final class b {
    public static final b f60042e;
    public boolean f60043a;
    public boolean f60044b;
    public boolean f60045c;
    public boolean d;

    static {
        ?? obj = new Object();
        obj.f60043a = true;
        obj.f60044b = true;
        obj.f60045c = false;
        obj.d = false;
        f60042e = obj;
        obj.f60043a = true;
        obj.f60044b = true;
        obj.f60045c = false;
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
