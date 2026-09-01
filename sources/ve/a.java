package ve;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.io.BufferedInputStream;
import java.io.IOException;
import oh.h4;
import org.telegram.tgnet.SerializedData;
public final class a {
    public static SparseIntArray f48971b;
    public static final a f48972c = new a();
    public final SparseArray f48973a;

    public a() {
        this.f48973a = new SparseArray();
    }

    public static SparseArray a(Context context, String str, SparseArray sparseArray) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(context.getAssets().open(str));
        try {
            SerializedData serializedData = new SerializedData(bufferedInputStream);
            int readInt32 = serializedData.readInt32(true);
            int i10 = 0;
            if (sparseArray == null) {
                sparseArray = new SparseArray(readInt32);
                while (i10 < readInt32) {
                    sparseArray.append(serializedData.readInt32(true), serializedData.readString(true));
                    i10++;
                }
            } else {
                while (i10 < readInt32) {
                    sparseArray.put(serializedData.readInt32(true), serializedData.readString(true));
                    i10++;
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

    public final String b(Context context, int i10) {
        if (context != null && i10 != 0) {
            if (f48971b == null) {
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(context.getResources().getAssets().open("string_resource_ids.bin"));
                    SerializedData serializedData = new SerializedData(bufferedInputStream);
                    int readInt32 = serializedData.readInt32(true);
                    SparseIntArray sparseIntArray = new SparseIntArray(readInt32);
                    for (int i11 = 0; i11 < readInt32; i11++) {
                        sparseIntArray.append(serializedData.readInt32(true), serializedData.readInt32(true));
                    }
                    bufferedInputStream.close();
                    f48971b = sparseIntArray;
                } catch (IOException e6) {
                    throw new RuntimeException(e6);
                }
            }
            int i12 = f48971b.get(i10);
            if (i12 != 0) {
                return (String) this.f48973a.get(i12);
            }
            return null;
        }
        return null;
    }

    public final String c(Context context, String str, int i10) {
        String str2;
        if (str != null) {
            str2 = (String) this.f48973a.get(str.hashCode());
        } else {
            str2 = null;
        }
        if (str2 != null) {
            return str2;
        }
        return b(context, i10);
    }

    public a(h4 h4Var) {
        SparseArray sparseArray = (SparseArray) h4Var.f17180b;
        this.f48973a = sparseArray == null ? new SparseArray() : sparseArray;
    }
}
