package pc;

import i5.f;
import java.util.ArrayList;
import java.util.regex.Pattern;
public abstract class e {
    static {
        Pattern.compile("(....|\\.\\.)(\\[(.*)\\])?");
    }

    public static String a(i5.b bVar, String str) {
        f parent = bVar.getParent();
        ArrayList arrayList = ((com.googlecode.mp4parser.e) parent).f7925b;
        int size = arrayList.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            i5.b bVar2 = (i5.b) obj;
            if (bVar2.getType().equals(bVar.getType())) {
                if (bVar2 == bVar) {
                    break;
                }
                i7++;
            }
        }
        String str2 = String.format("/%s[%d]", bVar.getType(), Integer.valueOf(i7)) + str;
        if (parent instanceof i5.b) {
            return a((i5.b) parent, str2);
        }
        return str2;
    }
}
