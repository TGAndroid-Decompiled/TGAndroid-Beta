package rc;

import i7.m7;
import java.util.Arrays;
import java.util.List;
public abstract class h extends m7 {
    public static int b(List list) {
        kotlin.jvm.internal.j.e(list, "<this>");
        return list.size() - 1;
    }

    public static List c(Object... objArr) {
        if (objArr.length > 0) {
            List asList = Arrays.asList(objArr);
            kotlin.jvm.internal.j.d(asList, "asList(...)");
            return asList;
        }
        return o.f47121a;
    }
}
