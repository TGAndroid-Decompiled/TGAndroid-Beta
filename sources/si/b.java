package si;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.io.BufferedInputStream;
import java.io.IOException;
import org.telegram.tgnet.SerializedData;
public final class b {
    public static SparseIntArray f55246b;
    public static final b f55247c = new b();
    public final SparseArray f55248a;

    public b() {
        this.f55248a = new SparseArray();
    }

    public static SparseArray a(Context context, String str, SparseArray sparseArray) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(context.getAssets().open(str));
        try {
            SerializedData serializedData = new SerializedData(bufferedInputStream);
            int readInt32 = serializedData.readInt32(true);
            int i7 = 0;
            if (sparseArray == null) {
                sparseArray = new SparseArray(readInt32);
                while (i7 < readInt32) {
                    sparseArray.append(serializedData.readInt32(true), serializedData.readString(true));
                    i7++;
                }
            } else {
                while (i7 < readInt32) {
                    sparseArray.put(serializedData.readInt32(true), serializedData.readString(true));
                    i7++;
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
            return (String) this.f55248a.get(str.hashCode());
        }
        return null;
    }

    public final String c(int i7, Context context, String str) {
        String str2;
        if (str != null) {
            str2 = b(str);
        } else {
            str2 = null;
        }
        if (str2 == null && i7 != 0) {
            if (context != null && i7 != 0) {
                if (f55246b == null) {
                    try {
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(context.getResources().getAssets().open("string_resource_ids.bin"));
                        SerializedData serializedData = new SerializedData(bufferedInputStream);
                        int readInt32 = serializedData.readInt32(true);
                        SparseIntArray sparseIntArray = new SparseIntArray(readInt32);
                        for (int i10 = 0; i10 < readInt32; i10++) {
                            sparseIntArray.append(serializedData.readInt32(true), serializedData.readInt32(true));
                        }
                        bufferedInputStream.close();
                        f55246b = sparseIntArray;
                    } catch (IOException e10) {
                        throw new RuntimeException(e10);
                    }
                }
                int i11 = f55246b.get(i7);
                if (i11 != 0) {
                    return (String) this.f55248a.get(i11);
                }
            }
            return null;
        }
        return str2;
    }

    public b(a aVar) {
        SparseArray sparseArray = aVar.f55245a;
        this.f55248a = sparseArray == null ? new SparseArray() : sparseArray;
    }
}
