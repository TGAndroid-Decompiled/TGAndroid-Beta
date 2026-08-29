package te;

import android.content.Context;
import android.util.SparseArray;
import java.io.BufferedInputStream;
import o4.g;
import org.telegram.tgnet.SerializedData;
public final class a {
    public static final a f48219b = new a();
    public final SparseArray f48220a;

    public a() {
        this.f48220a = new SparseArray();
    }

    public static void a(Context context, int i10, SparseArray sparseArray) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(context.getResources().openRawResource(i10));
        try {
            SerializedData serializedData = new SerializedData(bufferedInputStream);
            while (serializedData.remaining() > 0) {
                sparseArray.put(serializedData.readInt32(true), serializedData.readString(true));
            }
            bufferedInputStream.close();
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
            return (String) this.f48220a.get(str.hashCode());
        }
        return null;
    }

    public a(g gVar) {
        SparseArray sparseArray = (SparseArray) gVar.f19159b;
        this.f48220a = sparseArray == null ? new SparseArray() : sparseArray;
    }
}
