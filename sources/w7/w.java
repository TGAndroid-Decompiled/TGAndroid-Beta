package w7;

import java.util.logging.Level;
import java.util.logging.Logger;
public abstract class w {
    public static String a(Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String j3;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = objArr.length;
            if (i11 >= length) {
                break;
            }
            Object obj = objArr[i11];
            if (obj == null) {
                j3 = "null";
            } else {
                try {
                    j3 = obj.toString();
                } catch (Exception e) {
                    String C = a4.a.C(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(C), (Throwable) e);
                    j3 = org.telegram.ui.Cells.r6.j("<", C, " threw ", e.getClass().getName(), ">");
                }
            }
            objArr[i11] = j3;
            i11++;
        }
        StringBuilder sb2 = new StringBuilder((length * 16) + 29);
        int i12 = 0;
        while (true) {
            length2 = objArr.length;
            if (i10 >= length2 || (indexOf = "expected a non-null reference".indexOf("%s", i12)) == -1) {
                break;
            }
            sb2.append((CharSequence) "expected a non-null reference", i12, indexOf);
            sb2.append(objArr[i10]);
            i10++;
            i12 = indexOf + 2;
        }
        sb2.append((CharSequence) "expected a non-null reference", i12, 29);
        if (i10 < length2) {
            sb2.append(" [");
            sb2.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb2.append(", ");
                sb2.append(objArr[i13]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }
}
