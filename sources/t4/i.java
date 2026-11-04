package t4;

import j$.util.Objects;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public final class i {
    public final int f54923a;
    public final int f54924b;
    public final long f54925c;
    public final long d;

    public i(long j10, long j11, int i3, int i10) {
        this.f54923a = i3;
        this.f54924b = i10;
        this.f54925c = j10;
        this.d = j11;
    }

    public static i a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            i iVar = new i(dataInputStream.readLong(), dataInputStream.readLong(), dataInputStream.readInt(), dataInputStream.readInt());
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
            dataOutputStream.writeInt(this.f54923a);
            dataOutputStream.writeInt(this.f54924b);
            dataOutputStream.writeLong(this.f54925c);
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
            if (this.f54924b == iVar.f54924b && this.f54925c == iVar.f54925c && this.f54923a == iVar.f54923a && this.d == iVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f54924b), Long.valueOf(this.f54925c), Integer.valueOf(this.f54923a), Long.valueOf(this.d));
    }
}
