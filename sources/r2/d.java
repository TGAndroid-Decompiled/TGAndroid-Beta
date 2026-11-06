package r2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class d extends LinkedHashMap {
    public final int f54195a;

    public d(float f10, int i7, int i10, boolean z9) {
        super(i7, f10, z9);
        this.f54195a = i10;
    }

    public static Matcher b(String str, Pattern pattern, d dVar) {
        Matcher matcher = (Matcher) dVar.get(pattern);
        if (matcher == null) {
            Matcher matcher2 = pattern.matcher(str);
            dVar.put(pattern, matcher2);
            return matcher2;
        }
        matcher.reset(str);
        return matcher;
    }

    @Override
    public final boolean removeEldestEntry(Map.Entry entry) {
        switch (this.f54195a) {
            case 0:
                if (size() > 4) {
                    return true;
                }
                return false;
            default:
                if (size() > 32) {
                    return true;
                }
                return false;
        }
    }
}
