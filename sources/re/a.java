package re;

import android.content.Context;
import android.util.SparseArray;
import java.io.BufferedInputStream;
import java.io.IOException;
import n2.b0;
import org.telegram.tgnet.SerializedData;

public final class a {

    public static final a f46919b = new a();

    public final SparseArray f46920a;

    public a() {
        this.f46920a = new SparseArray();
    }

    public static void a(Context context, int i10, SparseArray sparseArray) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(context.getResources().openRawResource(i10));
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
        if (str == null) {
            return null;
        }
        return (String) this.f46920a.get(str.hashCode());
    }

    public a(b0 b0Var) {
        SparseArray sparseArray = (SparseArray) b0Var.f18130b;
        this.f46920a = sparseArray == null ? new SparseArray() : sparseArray;
    }
}
