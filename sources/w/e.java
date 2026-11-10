package w;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
public final class e implements AutoCloseable {
    public final String[] f57579a;
    public final ArrayDeque f57580b;

    public e(Object obj, String str, ArrayDeque arrayDeque) {
        this.f57580b = arrayDeque;
        if (obj != null) {
            arrayDeque.addFirst(new d(obj, str));
            if (Log.isLoggable("CarApp.Bun", 2)) {
                StringBuilder sb2 = new StringBuilder();
                int min = Math.min(arrayDeque.size(), 11);
                if (this.f57579a == null) {
                    this.f57579a = new String[12];
                }
                String str2 = this.f57579a[min];
                if (str2 == null) {
                    char[] cArr = new char[min];
                    Arrays.fill(cArr, ' ');
                    String str3 = new String(cArr);
                    if (min == 11) {
                        str2 = str3.concat("...");
                    } else {
                        str2 = str3;
                    }
                    this.f57579a[min] = str2;
                }
                sb2.append(str2);
                sb2.append(g.i(obj.getClass()) + " " + str);
                Log.v("CarApp.Bun", sb2.toString());
            }
        }
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        ArrayDeque arrayDeque = this.f57580b;
        int min = Math.min(arrayDeque.size(), 8);
        Iterator descendingIterator = arrayDeque.descendingIterator();
        while (descendingIterator.hasNext()) {
            int i7 = min - 1;
            if (min <= 0) {
                break;
            }
            sb2.append(((d) descendingIterator.next()).a());
            min = i7;
        }
        if (descendingIterator.hasNext()) {
            sb2.append("[...]");
        }
        return sb2.toString();
    }

    @Override
    public final void close() {
        this.f57580b.removeFirst();
    }
}
