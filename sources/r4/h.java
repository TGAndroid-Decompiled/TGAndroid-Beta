package r4;

import j$.util.Objects;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public final class h {
    public final int f46321a;
    public final int f46322b;
    public final long f46323c;
    public final long d;

    public h(long j10, long j11, int i10, int i11) {
        this.f46321a = i10;
        this.f46322b = i11;
        this.f46323c = j10;
        this.d = j11;
    }

    public static h a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            h hVar = new h(dataInputStream.readLong(), dataInputStream.readLong(), dataInputStream.readInt(), dataInputStream.readInt());
            dataInputStream.close();
            return hVar;
        } catch (Throwable th2) {
            try {
                dataInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f46321a);
            dataOutputStream.writeInt(this.f46322b);
            dataOutputStream.writeLong(this.f46323c);
            dataOutputStream.writeLong(this.d);
            dataOutputStream.close();
        } catch (Throwable th2) {
            try {
                dataOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof h)) {
            h hVar = (h) obj;
            if (this.f46322b == hVar.f46322b && this.f46323c == hVar.f46323c && this.f46321a == hVar.f46321a && this.d == hVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f46322b), Long.valueOf(this.f46323c), Integer.valueOf(this.f46321a), Long.valueOf(this.d));
    }
}
