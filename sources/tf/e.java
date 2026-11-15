package tf;

import java.io.EOFException;
import java.io.InputStream;
import org.telegram.messenger.ou;
public final class e {
    public static final b7.j f57120e = new b7.j(4);
    public final uf.a f57121a;
    public final h f57122b;
    public final f f57123c;
    public final ou d;

    public e(InputStream inputStream, long j3, int i7, h hVar, f fVar) {
        uf.a aVar = new uf.a(inputStream, j3, i7);
        this.f57121a = aVar;
        this.d = new ou(aVar, 26);
        this.f57122b = hVar;
        this.f57123c = fVar;
    }

    public static String a(byte[] bArr, int i7, b bVar, boolean z10) {
        if (z10) {
            int i10 = 0;
            for (int i11 = 0; i11 < i7; i11++) {
                if (bArr[i11] == 0 && (bVar != b.UTF_16 || i10 != 0 || i11 % 2 == 0)) {
                    i10++;
                    int i12 = bVar.f57118b;
                    if (i10 == i12) {
                        i7 = (i11 + 1) - i12;
                        break;
                    }
                } else {
                    i10 = 0;
                }
            }
        }
        try {
            String str = new String(bArr, 0, i7, bVar.f57117a.name());
            if (str.length() > 0 && str.charAt(0) == 65279) {
                return str.substring(1);
            }
            return str;
        } catch (Exception unused) {
            return "";
        }
    }

    public final b b() {
        byte g12 = this.d.g1();
        if (g12 != 0) {
            if (g12 != 1) {
                if (g12 != 2) {
                    if (g12 == 3) {
                        return b.UTF_8;
                    }
                    throw new Exception(i5.c.i(g12, "Invalid encoding: "));
                }
                return b.UTF_16BE;
            }
            return b.UTF_16;
        }
        return b.ISO_8859_1;
    }

    public final String c(int i7, b bVar) {
        if (i7 <= this.f57121a.e()) {
            d dVar = (d) f57120e.get();
            byte[] bArr = dVar.f57119a;
            if (i7 > bArr.length) {
                int length = bArr.length;
                do {
                    length *= 2;
                } while (i7 > length);
                dVar.f57119a = new byte[length];
            }
            byte[] bArr2 = dVar.f57119a;
            int i10 = 0;
            while (true) {
                ou ouVar = this.d;
                if (i10 < i7) {
                    int read = ((ab.d) ouVar.f25804b).read(bArr2, i10, i7 - i10);
                    if (read > 0) {
                        i10 += read;
                    } else {
                        throw new EOFException();
                    }
                } else {
                    ouVar.getClass();
                    return a(bArr2, i7, bVar, true);
                }
            }
        } else {
            throw new Exception(i5.c.i(i7, "Could not read fixed-length string of length: "));
        }
    }

    public final String d(int i7, b bVar) {
        int min = Math.min(i7, (int) this.f57121a.e());
        d dVar = (d) f57120e.get();
        byte[] bArr = dVar.f57119a;
        if (min > bArr.length) {
            int length = bArr.length;
            do {
                length *= 2;
            } while (min > length);
            dVar.f57119a = new byte[length];
        }
        byte[] bArr2 = dVar.f57119a;
        int i10 = 0;
        for (int i11 = 0; i11 < min; i11++) {
            byte g12 = this.d.g1();
            bArr2[i11] = g12;
            if (g12 == 0 && (bVar != b.UTF_16 || i10 != 0 || i11 % 2 == 0)) {
                i10++;
                int i12 = bVar.f57118b;
                if (i10 == i12) {
                    return a(bArr2, (i11 + 1) - i12, bVar, false);
                }
            } else {
                i10 = 0;
            }
        }
        throw new Exception("Could not read zero-termiated string");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("id3v2frame[pos=");
        uf.a aVar = this.f57121a;
        sb2.append(aVar.f913b);
        sb2.append(", ");
        sb2.append(aVar.e());
        sb2.append(" left]");
        return sb2.toString();
    }
}
