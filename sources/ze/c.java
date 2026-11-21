package ze;
public final class c {
    public static final c f61957e;
    public boolean f61958a;
    public boolean f61959b;
    public boolean f61960c;
    public boolean d;

    static {
        ?? obj = new Object();
        obj.f61958a = true;
        obj.f61959b = true;
        obj.f61960c = false;
        obj.d = false;
        f61957e = obj;
        obj.f61958a = true;
        obj.f61959b = true;
        obj.f61960c = false;
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
