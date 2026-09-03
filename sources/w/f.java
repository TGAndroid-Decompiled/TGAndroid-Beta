package w;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
public final class f implements AutoCloseable {
    public final String[] f49349a;
    public final ArrayDeque f49350b;

    public f(Object obj, String str, ArrayDeque arrayDeque) {
        this.f49350b = arrayDeque;
        if (obj != null) {
            arrayDeque.addFirst(new e(obj, str));
            if (Log.isLoggable("CarApp.Bun", 2)) {
                StringBuilder sb = new StringBuilder();
                int min = Math.min(arrayDeque.size(), 11);
                if (this.f49349a == null) {
                    this.f49349a = new String[12];
                }
                String str2 = this.f49349a[min];
                if (str2 == null) {
                    char[] cArr = new char[min];
                    Arrays.fill(cArr, ' ');
                    String str3 = new String(cArr);
                    if (min == 11) {
                        str2 = str3.concat("...");
                    } else {
                        str2 = str3;
                    }
                    this.f49349a[min] = str2;
                }
                sb.append(str2);
                sb.append(h.i(obj.getClass()) + " " + str);
                Log.v("CarApp.Bun", sb.toString());
            }
        }
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        ArrayDeque arrayDeque = this.f49350b;
        int min = Math.min(arrayDeque.size(), 8);
        Iterator descendingIterator = arrayDeque.descendingIterator();
        while (descendingIterator.hasNext()) {
            int i10 = min - 1;
            if (min <= 0) {
                break;
            }
            sb.append(((e) descendingIterator.next()).a());
            min = i10;
        }
        if (descendingIterator.hasNext()) {
            sb.append("[...]");
        }
        return sb.toString();
    }

    @Override
    public final void close() {
        this.f49350b.removeFirst();
    }
}
