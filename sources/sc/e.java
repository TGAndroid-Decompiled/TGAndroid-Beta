package sc;

import g5.f;
import java.util.ArrayList;
import java.util.regex.Pattern;
public abstract class e {
    static {
        Pattern.compile("(....|\\.\\.)(\\[(.*)\\])?");
    }

    public static String a(g5.b bVar, String str) {
        f parent = bVar.getParent();
        ArrayList arrayList = ((com.googlecode.mp4parser.e) parent).f7815b;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            g5.b bVar2 = (g5.b) obj;
            if (bVar2.getType().equals(bVar.getType())) {
                if (bVar2 == bVar) {
                    break;
                }
                i10++;
            }
        }
        String str2 = String.format("/%s[%d]", bVar.getType(), Integer.valueOf(i10)) + str;
        if (parent instanceof g5.b) {
            return a((g5.b) parent, str2);
        }
        return str2;
    }
}
