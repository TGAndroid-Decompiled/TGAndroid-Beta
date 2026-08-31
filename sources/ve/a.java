package ve;

import android.content.Context;
import android.util.SparseArray;
import java.io.BufferedInputStream;
import oh.h4;
import org.telegram.tgnet.SerializedData;
public final class a {
    public static final a f48971b = new a();
    public final SparseArray f48972a;

    public a() {
        this.f48972a = new SparseArray();
    }

    public static SparseArray a(Context context, int i10, SparseArray sparseArray) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(context.getResources().openRawResource(i10));
        try {
            SerializedData serializedData = new SerializedData(bufferedInputStream);
            int readInt32 = serializedData.readInt32(true);
            int i11 = 0;
            if (sparseArray == null) {
                sparseArray = new SparseArray(readInt32);
                while (i11 < readInt32) {
                    sparseArray.append(serializedData.readInt32(true), serializedData.readString(true));
                    i11++;
                }
            } else {
                while (i11 < readInt32) {
                    sparseArray.put(serializedData.readInt32(true), serializedData.readString(true));
                    i11++;
                }
            }
            bufferedInputStream.close();
            return sparseArray;
        } catch (Throwable th2) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final String b(String str) {
        if (str != null) {
            return (String) this.f48972a.get(str.hashCode());
        }
        return null;
    }

    public a(h4 h4Var) {
        SparseArray sparseArray = (SparseArray) h4Var.f17180b;
        this.f48972a = sparseArray == null ? new SparseArray() : sparseArray;
    }
}
