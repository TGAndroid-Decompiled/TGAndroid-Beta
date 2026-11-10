package u4;

import j$.util.Objects;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public final class h {
    public final int f56342a;
    public final int f56343b;
    public final long f56344c;
    public final long d;

    public h(long j3, long j10, int i7, int i10) {
        this.f56342a = i7;
        this.f56343b = i10;
        this.f56344c = j3;
        this.d = j10;
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
            dataOutputStream.writeInt(this.f56342a);
            dataOutputStream.writeInt(this.f56343b);
            dataOutputStream.writeLong(this.f56344c);
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
            if (this.f56343b == hVar.f56343b && this.f56344c == hVar.f56344c && this.f56342a == hVar.f56342a && this.d == hVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f56343b), Long.valueOf(this.f56344c), Integer.valueOf(this.f56342a), Long.valueOf(this.d));
    }
}
