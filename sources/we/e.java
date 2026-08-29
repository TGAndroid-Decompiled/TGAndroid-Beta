package we;

import j7.l1;
import java.io.EOFException;
import java.io.InputStream;
import org.telegram.ui.Components.n;
public final class e {
    public static final cd.b f49862e = new cd.b(3);
    public final xe.a f49863a;
    public final h f49864b;
    public final f f49865c;
    public final n d;

    public e(InputStream inputStream, long j10, int i10, h hVar, f fVar) {
        xe.a aVar = new xe.a(inputStream, j10, i10);
        this.f49863a = aVar;
        this.d = new n(aVar, 23);
        this.f49864b = hVar;
        this.f49865c = fVar;
    }

    public static String a(byte[] bArr, int i10, b bVar, boolean z10) {
        if (z10) {
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                if (bArr[i12] == 0 && (bVar != b.UTF_16 || i11 != 0 || i12 % 2 == 0)) {
                    i11++;
                    int i13 = bVar.f49860b;
                    if (i11 == i13) {
                        i10 = (i12 + 1) - i13;
                        break;
                    }
                } else {
                    i11 = 0;
                }
            }
        }
        try {
            String str = new String(bArr, 0, i10, bVar.f49859a.name());
            if (str.length() > 0 && str.charAt(0) == 65279) {
                return str.substring(1);
            }
            return str;
        } catch (Exception unused) {
            return "";
        }
    }

    public final b b() {
        byte o10 = this.d.o();
        if (o10 != 0) {
            if (o10 != 1) {
                if (o10 != 2) {
                    if (o10 == 3) {
                        return b.UTF_8;
                    }
                    throw new Exception(l1.k(o10, "Invalid encoding: "));
                }
                return b.UTF_16BE;
            }
            return b.UTF_16;
        }
        return b.ISO_8859_1;
    }

    public final String c(int i10, b bVar) {
        if (i10 <= this.f49863a.e()) {
            d dVar = (d) f49862e.get();
            byte[] bArr = dVar.f49861a;
            if (i10 > bArr.length) {
                int length = bArr.length;
                do {
                    length *= 2;
                } while (i10 > length);
                dVar.f49861a = new byte[length];
            }
            byte[] bArr2 = dVar.f49861a;
            int i11 = 0;
            while (true) {
                n nVar = this.d;
                if (i11 < i10) {
                    int read = ((com.google.firebase.messaging.d) nVar.f30787b).read(bArr2, i11, i10 - i11);
                    if (read > 0) {
                        i11 += read;
                    } else {
                        throw new EOFException();
                    }
                } else {
                    nVar.getClass();
                    return a(bArr2, i10, bVar, true);
                }
            }
        } else {
            throw new Exception(l1.k(i10, "Could not read fixed-length string of length: "));
        }
    }

    public final String d(int i10, b bVar) {
        int min = Math.min(i10, (int) this.f49863a.e());
        d dVar = (d) f49862e.get();
        byte[] bArr = dVar.f49861a;
        if (min > bArr.length) {
            int length = bArr.length;
            do {
                length *= 2;
            } while (min > length);
            dVar.f49861a = new byte[length];
        }
        byte[] bArr2 = dVar.f49861a;
        int i11 = 0;
        for (int i12 = 0; i12 < min; i12++) {
            byte o10 = this.d.o();
            bArr2[i12] = o10;
            if (o10 == 0 && (bVar != b.UTF_16 || i11 != 0 || i12 % 2 == 0)) {
                i11++;
                int i13 = bVar.f49860b;
                if (i11 == i13) {
                    return a(bArr2, (i12 + 1) - i13, bVar, false);
                }
            } else {
                i11 = 0;
            }
        }
        throw new Exception("Could not read zero-termiated string");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("id3v2frame[pos=");
        xe.a aVar = this.f49863a;
        sb2.append(aVar.f5149b);
        sb2.append(", ");
        sb2.append(aVar.e());
        sb2.append(" left]");
        return sb2.toString();
    }
}
