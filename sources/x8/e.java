package x8;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
public final class e implements com.google.android.gms.common.api.q, Iterable, Closeable {
    public final DataHolder f49644a;
    public boolean f49645b = false;
    public ArrayList f49646c;
    public final Status d;

    public e(DataHolder dataHolder) {
        this.f49644a = dataHolder;
        this.d = new Status(dataHolder.e, null, null, null);
    }

    @Override
    public final void close() {
        DataHolder dataHolder = this.f49644a;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    @Override
    public final Status h() {
        return this.d;
    }

    @Override
    public final Iterator iterator() {
        return new ed.b(this);
    }

    public final int m(int i10) {
        if (i10 >= 0 && i10 < this.f49646c.size()) {
            return ((Integer) this.f49646c.get(i10)).intValue();
        }
        throw new IllegalArgumentException(i2.d.k(i10, "Position ", " is out of bounds for this buffer"));
    }

    public final void n() {
        synchronized (this) {
            try {
                if (!this.f49645b) {
                    DataHolder dataHolder = this.f49644a;
                    n6.l.h(dataHolder);
                    int i10 = dataHolder.f6544n;
                    ArrayList arrayList = new ArrayList();
                    this.f49646c = arrayList;
                    if (i10 > 0) {
                        arrayList.add(0);
                        int b10 = this.f49644a.b(0);
                        DataHolder dataHolder2 = this.f49644a;
                        dataHolder2.c(0, "path");
                        String string = dataHolder2.d[b10].getString(0, dataHolder2.f6542c.getInt("path"));
                        for (int i11 = 1; i11 < i10; i11++) {
                            int b11 = this.f49644a.b(i11);
                            DataHolder dataHolder3 = this.f49644a;
                            dataHolder3.c(i11, "path");
                            String string2 = dataHolder3.d[b11].getString(i11, dataHolder3.f6542c.getInt("path"));
                            if (string2 != null) {
                                if (!string2.equals(string)) {
                                    this.f49646c.add(Integer.valueOf(i11));
                                    string = string2;
                                }
                            } else {
                                throw new NullPointerException("Missing value for markerColumn: path, at row: " + i11 + ", for window: " + b11);
                            }
                        }
                    }
                    this.f49645b = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
