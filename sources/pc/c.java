package pc;

import java.util.logging.Logger;
public abstract class c {
    public static c a(Class cls) {
        if (System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik")) {
            String simpleName = cls.getSimpleName();
            a aVar = new a(0);
            aVar.f53562b = simpleName;
            return aVar;
        }
        String simpleName2 = cls.getSimpleName();
        a aVar2 = new a(1);
        aVar2.f53562b = Logger.getLogger(simpleName2);
        return aVar2;
    }

    public abstract void b(String str);
}
