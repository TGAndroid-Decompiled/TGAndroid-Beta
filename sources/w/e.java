package w;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;

public final class e implements AutoCloseable {

    public final String[] f48922a;

    public final ArrayDeque f48923b;

    public e(Object obj, String str, ArrayDeque arrayDeque) {
        this.f48923b = arrayDeque;
        if (obj != null) {
            arrayDeque.addFirst(new d(obj, str));
            if (Log.isLoggable("CarApp.Bun", 2)) {
                StringBuilder sb2 = new StringBuilder();
                int iMin = Math.min(arrayDeque.size(), 11);
                if (this.f48922a == null) {
                    this.f48922a = new String[12];
                }
                String strConcat = this.f48922a[iMin];
                if (strConcat == null) {
                    char[] cArr = new char[iMin];
                    Arrays.fill(cArr, ' ');
                    String str2 = new String(cArr);
                    strConcat = iMin == 11 ? str2.concat("...") : str2;
                    this.f48922a[iMin] = strConcat;
                }
                sb2.append(strConcat);
                sb2.append(g.i(obj.getClass()) + " " + str);
                Log.v("CarApp.Bun", sb2.toString());
            }
        }
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        ArrayDeque arrayDeque = this.f48923b;
        int iMin = Math.min(arrayDeque.size(), 8);
        Iterator itDescendingIterator = arrayDeque.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            int i10 = iMin - 1;
            if (iMin <= 0) {
                break;
            }
            sb2.append(((d) itDescendingIterator.next()).a());
            iMin = i10;
        }
        if (itDescendingIterator.hasNext()) {
            sb2.append("[...]");
        }
        return sb2.toString();
    }

    @Override
    public final void close() {
        this.f48923b.removeFirst();
    }
}
