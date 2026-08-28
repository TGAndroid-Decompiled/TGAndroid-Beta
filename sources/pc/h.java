package pc;

import g7.o6;
import java.util.Arrays;
import java.util.List;
public abstract class h extends o6 {
    public static int b(List list) {
        kotlin.jvm.internal.i.e(list, "<this>");
        return list.size() - 1;
    }

    public static List c(Object... objArr) {
        if (objArr.length > 0) {
            List asList = Arrays.asList(objArr);
            kotlin.jvm.internal.i.d(asList, "asList(...)");
            return asList;
        }
        return o.f45540a;
    }
}
