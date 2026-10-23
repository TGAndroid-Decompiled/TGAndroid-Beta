package r4;

import j$.util.Objects;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public final class j {
    public final int f45014a;
    public final int f45015b;
    public final long f45016c;
    public final long d;

    public j(long j10, int i10, int i11, long j11) {
        this.f45014a = i10;
        this.f45015b = i11;
        this.f45016c = j10;
        this.d = j11;
    }

    public static j a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            j jVar = new j(dataInputStream.readLong(), dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong());
            dataInputStream.close();
            return jVar;
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
            dataOutputStream.writeInt(this.f45014a);
            dataOutputStream.writeInt(this.f45015b);
            dataOutputStream.writeLong(this.f45016c);
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
        if (obj != null && (obj instanceof j)) {
            j jVar = (j) obj;
            if (this.f45015b == jVar.f45015b && this.f45016c == jVar.f45016c && this.f45014a == jVar.f45014a && this.d == jVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f45015b), Long.valueOf(this.f45016c), Integer.valueOf(this.f45014a), Long.valueOf(this.d));
    }
}
