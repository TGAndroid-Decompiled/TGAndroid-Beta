package w7;

import java.util.logging.Level;
import java.util.logging.Logger;
public abstract class c7 {
    public static String a(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String sb2;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = objArr.length;
            if (i11 >= length) {
                break;
            }
            Object obj = objArr[i11];
            if (obj == null) {
                sb2 = "null";
            } else {
                try {
                    sb2 = obj.toString();
                } catch (Exception e7) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e7);
                    StringBuilder v = a4.a.v("<", str2, " threw ");
                    v.append(e7.getClass().getName());
                    v.append(">");
                    sb2 = v.toString();
                }
            }
            objArr[i11] = sb2;
            i11++;
        }
        StringBuilder sb3 = new StringBuilder((length * 16) + str.length());
        int i12 = 0;
        while (true) {
            length2 = objArr.length;
            if (i10 >= length2 || (indexOf = str.indexOf("%s", i12)) == -1) {
                break;
            }
            sb3.append((CharSequence) str, i12, indexOf);
            sb3.append(objArr[i10]);
            i10++;
            i12 = indexOf + 2;
        }
        sb3.append((CharSequence) str, i12, str.length());
        if (i10 < length2) {
            sb3.append(" [");
            sb3.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb3.append(", ");
                sb3.append(objArr[i13]);
            }
            sb3.append(']');
        }
        return sb3.toString();
    }
}
