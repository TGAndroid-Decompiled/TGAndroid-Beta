package u7;

import a8.qg;
public abstract class q {
    public static qg f49609a;

    public static final Class a(yd.c cVar) {
        kotlin.jvm.internal.i.e(cVar, "<this>");
        Class a2 = ((kotlin.jvm.internal.c) cVar).a();
        if (a2.isPrimitive()) {
            String name = a2.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return a2;
    }

    public static synchronized p b(o oVar) {
        p pVar;
        synchronized (q.class) {
            try {
                if (f49609a == null) {
                    f49609a = new qg(1);
                }
                pVar = (p) f49609a.R0(oVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pVar;
    }
}
