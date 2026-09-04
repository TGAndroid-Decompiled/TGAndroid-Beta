package x8;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
public final class e implements com.google.android.gms.common.api.q, Iterable, Closeable {
    public final DataHolder f49279a;
    public boolean f49280b = false;
    public ArrayList f49281c;
    public final Status d;

    public e(DataHolder dataHolder) {
        this.f49279a = dataHolder;
        this.d = new Status(dataHolder.f5161e, null, null, null);
    }

    @Override
    public final void close() {
        DataHolder dataHolder = this.f49279a;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    @Override
    public final Status i() {
        return this.d;
    }

    @Override
    public final Iterator iterator() {
        return new cd.b(this);
    }

    public final int n(int i10) {
        if (i10 >= 0 && i10 < this.f49281c.size()) {
            return ((Integer) this.f49281c.get(i10)).intValue();
        }
        throw new IllegalArgumentException(i2.g.j(i10, "Position ", " is out of bounds for this buffer"));
    }

    public final void o() {
        synchronized (this) {
            try {
                if (!this.f49280b) {
                    DataHolder dataHolder = this.f49279a;
                    n6.l.h(dataHolder);
                    int i10 = dataHolder.f5163n;
                    ArrayList arrayList = new ArrayList();
                    this.f49281c = arrayList;
                    if (i10 > 0) {
                        arrayList.add(0);
                        int b10 = this.f49279a.b(0);
                        DataHolder dataHolder2 = this.f49279a;
                        dataHolder2.c(0, "path");
                        String string = dataHolder2.d[b10].getString(0, dataHolder2.f5160c.getInt("path"));
                        for (int i11 = 1; i11 < i10; i11++) {
                            int b11 = this.f49279a.b(i11);
                            DataHolder dataHolder3 = this.f49279a;
                            dataHolder3.c(i11, "path");
                            String string2 = dataHolder3.d[b11].getString(i11, dataHolder3.f5160c.getInt("path"));
                            if (string2 != null) {
                                if (!string2.equals(string)) {
                                    this.f49281c.add(Integer.valueOf(i11));
                                    string = string2;
                                }
                            } else {
                                throw new NullPointerException("Missing value for markerColumn: path, at row: " + i11 + ", for window: " + b11);
                            }
                        }
                    }
                    this.f49280b = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
