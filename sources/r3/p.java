package r3;

import h5.d0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class p {
    public static final Pattern f43264c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int f43265a = -1;
    public int f43266b = -1;

    public final boolean a(String str) {
        Matcher matcher = f43264c.matcher(str);
        if (matcher.find()) {
            try {
                String group = matcher.group(1);
                int i10 = d0.f6924a;
                int parseInt = Integer.parseInt(group, 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.f43265a = parseInt;
                    this.f43266b = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    public final void b(e4.c cVar) {
        int i10 = 0;
        while (true) {
            e4.b[] bVarArr = cVar.f5109a;
            if (i10 < bVarArr.length) {
                e4.b bVar = bVarArr[i10];
                if (bVar instanceof j4.e) {
                    j4.e eVar = (j4.e) bVar;
                    if ("iTunSMPB".equals(eVar.f8898c) && a(eVar.d)) {
                        return;
                    }
                } else if (bVar instanceof j4.k) {
                    j4.k kVar = (j4.k) bVar;
                    if ("com.apple.iTunes".equals(kVar.f8907b) && "iTunSMPB".equals(kVar.f8908c) && a(kVar.d)) {
                        return;
                    }
                } else {
                    continue;
                }
                i10++;
            } else {
                return;
            }
        }
    }
}
