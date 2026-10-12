package r4;

import j$.util.Objects;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public final class i {
    public final int f43913a;
    public final int f43914b;
    public final long f43915c;
    public final long d;

    public i(long j10, int i10, int i11, long j11) {
        this.f43913a = i10;
        this.f43914b = i11;
        this.f43915c = j10;
        this.d = j11;
    }

    public static i a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            i iVar = new i(dataInputStream.readLong(), dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong());
            dataInputStream.close();
            return iVar;
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
            dataOutputStream.writeInt(this.f43913a);
            dataOutputStream.writeInt(this.f43914b);
            dataOutputStream.writeLong(this.f43915c);
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
        if (obj != null && (obj instanceof i)) {
            i iVar = (i) obj;
            if (this.f43914b == iVar.f43914b && this.f43915c == iVar.f43915c && this.f43913a == iVar.f43913a && this.d == iVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f43914b), Long.valueOf(this.f43915c), Integer.valueOf(this.f43913a), Long.valueOf(this.d));
    }
}
