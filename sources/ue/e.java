package ue;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public final class e {

    public static final bd.b f48535e = new bd.b(3);

    public final ve.a f48536a;

    public final h f48537b;

    public final f f48538c;
    public final n1.d d;

    public e(InputStream inputStream, long j10, int i10, h hVar, f fVar) {
        ve.a aVar = new ve.a(inputStream, j10, i10);
        this.f48536a = aVar;
        this.d = new n1.d(aVar, 23);
        this.f48537b = hVar;
        this.f48538c = fVar;
    }

    public static String a(byte[] bArr, int i10, b bVar, boolean z10) {
        if (z10) {
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                if (bArr[i12] == 0 && (bVar != b.UTF_16 || i11 != 0 || i12 % 2 == 0)) {
                    i11++;
                    int i13 = bVar.f48533b;
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
            String str = new String(bArr, 0, i10, bVar.f48532a.name());
            return (str.length() <= 0 || str.charAt(0) != 65279) ? str : str.substring(1);
        } catch (Exception unused) {
            return "";
        }
    }

    public final b b() throws c {
        byte bA0 = this.d.a0();
        if (bA0 == 0) {
            return b.ISO_8859_1;
        }
        if (bA0 == 1) {
            return b.UTF_16;
        }
        if (bA0 == 2) {
            return b.UTF_16BE;
        }
        if (bA0 == 3) {
            return b.UTF_8;
        }
        throw new c(i0.a.k(bA0, "Invalid encoding: "));
    }

    public final String c(int i10, b bVar) throws c, IOException {
        if (i10 > this.f48536a.e()) {
            throw new c(i0.a.k(i10, "Could not read fixed-length string of length: "));
        }
        d dVar = (d) f48535e.get();
        byte[] bArr = dVar.f48534a;
        if (i10 > bArr.length) {
            int length = bArr.length;
            do {
                length *= 2;
            } while (i10 > length);
            dVar.f48534a = new byte[length];
        }
        byte[] bArr2 = dVar.f48534a;
        int i11 = 0;
        while (true) {
            n1.d dVar2 = this.d;
            if (i11 >= i10) {
                dVar2.getClass();
                return a(bArr2, i10, bVar, true);
            }
            int i12 = ((com.google.firebase.messaging.d) dVar2.f18088b).read(bArr2, i11, i10 - i11);
            if (i12 <= 0) {
                throw new EOFException();
            }
            i11 += i12;
        }
    }

    public final String d(int i10, b bVar) throws c {
        int iMin = Math.min(i10, (int) this.f48536a.e());
        d dVar = (d) f48535e.get();
        byte[] bArr = dVar.f48534a;
        if (iMin > bArr.length) {
            int length = bArr.length;
            do {
                length *= 2;
            } while (iMin > length);
            dVar.f48534a = new byte[length];
        }
        byte[] bArr2 = dVar.f48534a;
        int i11 = 0;
        for (int i12 = 0; i12 < iMin; i12++) {
            byte bA0 = this.d.a0();
            bArr2[i12] = bA0;
            if (bA0 != 0 || (bVar == b.UTF_16 && i11 == 0 && i12 % 2 != 0)) {
                i11 = 0;
            } else {
                i11++;
                int i13 = bVar.f48533b;
                if (i11 == i13) {
                    return a(bArr2, (i12 + 1) - i13, bVar, false);
                }
            }
        }
        throw new c("Could not read zero-termiated string");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("id3v2frame[pos=");
        ve.a aVar = this.f48536a;
        sb2.append(aVar.f4577b);
        sb2.append(", ");
        sb2.append(aVar.e());
        sb2.append(" left]");
        return sb2.toString();
    }
}
