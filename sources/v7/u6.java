package v7;

import java.util.logging.Level;
import java.util.logging.Logger;
public abstract class u6 {
    public static String a(String str, Object... objArr) {
        int indexOf;
        String sb2;
        int i10 = 0;
        for (int i11 = 0; i11 < objArr.length; i11++) {
            Object obj = objArr[i11];
            if (obj == null) {
                sb2 = "null";
            } else {
                try {
                    sb2 = obj.toString();
                } catch (Exception e7) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str2, (Throwable) e7);
                    StringBuilder v = a4.a.v("<", str2, " threw ");
                    v.append(e7.getClass().getName());
                    v.append(">");
                    sb2 = v.toString();
                }
            }
            objArr[i11] = sb2;
        }
        StringBuilder sb3 = new StringBuilder((objArr.length * 16) + str.length());
        int i12 = 0;
        while (i10 < objArr.length && (indexOf = str.indexOf("%s", i12)) != -1) {
            sb3.append((CharSequence) str, i12, indexOf);
            sb3.append(objArr[i10]);
            i12 = indexOf + 2;
            i10++;
        }
        sb3.append((CharSequence) str, i12, str.length());
        if (i10 < objArr.length) {
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
