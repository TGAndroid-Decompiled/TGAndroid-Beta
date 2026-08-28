package zd;
public final class c {
    public static final c f50429e;
    public boolean f50430a;
    public boolean f50431b;
    public boolean f50432c;
    public boolean d;

    static {
        ?? obj = new Object();
        obj.f50430a = true;
        obj.f50431b = true;
        obj.f50432c = false;
        obj.d = false;
        f50429e = obj;
        obj.f50430a = true;
        obj.f50431b = true;
        obj.f50432c = false;
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
