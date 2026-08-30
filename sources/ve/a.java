package ve;

import android.content.Context;
import android.util.SparseArray;
import java.io.BufferedInputStream;
import org.telegram.tgnet.SerializedData;
import ph.j5;
public final class a {
    public static final a f45672b = new a();
    public final SparseArray f45673a;

    public a() {
        this.f45673a = new SparseArray();
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
            return (String) this.f45673a.get(str.hashCode());
        }
        return null;
    }

    public a(j5 j5Var) {
        SparseArray sparseArray = (SparseArray) j5Var.f41782b;
        this.f45673a = sparseArray == null ? new SparseArray() : sparseArray;
    }
}
