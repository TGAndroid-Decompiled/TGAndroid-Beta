package qe;

import android.content.Context;
import android.util.SparseArray;
import java.io.BufferedInputStream;
import n2.p;
import org.telegram.tgnet.SerializedData;
public final class a {
    public static final a f46160b = new a();
    public final SparseArray f46161a;

    public a() {
        this.f46161a = new SparseArray();
    }

    public static void a(Context context, int i9, SparseArray sparseArray) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(context.getResources().openRawResource(i9));
        try {
            SerializedData serializedData = new SerializedData(bufferedInputStream);
            while (serializedData.remaining() > 0) {
                sparseArray.put(serializedData.readInt32(true), serializedData.readString(true));
            }
            bufferedInputStream.close();
        } catch (Throwable th) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final String b(String str) {
        if (str != null) {
            return (String) this.f46161a.get(str.hashCode());
        }
        return null;
    }

    public a(p pVar) {
        SparseArray sparseArray = (SparseArray) pVar.f18343b;
        this.f46161a = sparseArray == null ? new SparseArray() : sparseArray;
    }
}
