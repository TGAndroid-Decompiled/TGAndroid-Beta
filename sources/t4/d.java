package t4;

import java.util.LinkedHashMap;
import java.util.Map;
public final class d extends LinkedHashMap {
    @Override
    public final boolean removeEldestEntry(Map.Entry entry) {
        if (size() > 4) {
            return true;
        }
        return false;
    }
}
