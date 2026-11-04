package p1;

import java.util.Map;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import od.l;
import org.telegram.ui.Cells.f1;
public final class a extends k implements l {
    public static final a f53058b = new k(1);

    @Override
    public final Object invoke(Object obj) {
        String valueOf;
        byte[] bArr;
        Map.Entry entry = (Map.Entry) obj;
        j.e(entry, "entry");
        Object value = entry.getValue();
        if (value instanceof byte[]) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((CharSequence) "[");
            int i3 = 0;
            for (byte b10 : (byte[]) value) {
                i3++;
                if (i3 > 1) {
                    sb2.append((CharSequence) ", ");
                }
                sb2.append((CharSequence) String.valueOf((int) b10));
            }
            sb2.append((CharSequence) "]");
            valueOf = sb2.toString();
        } else {
            valueOf = String.valueOf(entry.getValue());
        }
        return f1.r(((e) entry.getKey()).f53065a, " = ", valueOf, new StringBuilder("  "));
    }
}
