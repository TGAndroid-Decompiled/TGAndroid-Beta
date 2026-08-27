package qc;

import h7.q6;
import java.util.Arrays;
import java.util.List;

public abstract class h extends q6 {
    public static int b(List list) {
        kotlin.jvm.internal.j.e(list, "<this>");
        return list.size() - 1;
    }

    public static List c(Object... objArr) {
        if (objArr.length <= 0) {
            return o.f46210a;
        }
        List listAsList = Arrays.asList(objArr);
        kotlin.jvm.internal.j.d(listAsList, "asList(...)");
        return listAsList;
    }
}
