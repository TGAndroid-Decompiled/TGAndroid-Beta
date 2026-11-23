package tf;

import java.io.EOFException;
import java.io.InputStream;
import org.telegram.ui.Components.nd0;
public final class e {
    public static final b7.j f57818e = new b7.j(4);
    public final uf.a f57819a;
    public final h f57820b;
    public final f f57821c;
    public final nd0 d;

    public e(InputStream inputStream, long j3, int i7, h hVar, f fVar) {
        uf.a aVar = new uf.a(inputStream, j3, i7);
        this.f57819a = aVar;
        this.d = new nd0(aVar, 16);
        this.f57820b = hVar;
        this.f57821c = fVar;
    }

    public static String a(byte[] bArr, int i7, b bVar, boolean z10) {
        if (z10) {
            int i10 = 0;
            for (int i11 = 0; i11 < i7; i11++) {
                if (bArr[i11] == 0 && (bVar != b.UTF_16 || i10 != 0 || i11 % 2 == 0)) {
                    i10++;
                    int i12 = bVar.f57816b;
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
            String str = new String(bArr, 0, i7, bVar.f57815a.name());
            if (str.length() > 0 && str.charAt(0) == 65279) {
                return str.substring(1);
            }
            return str;
        } catch (Exception unused) {
            return "";
        }
    }

    public final b b() {
        byte v = this.d.v();
        if (v != 0) {
            if (v != 1) {
                if (v != 2) {
                    if (v == 3) {
                        return b.UTF_8;
                    }
                    throw new Exception(i5.c.i(v, "Invalid encoding: "));
                }
                return b.UTF_16BE;
            }
            return b.UTF_16;
        }
        return b.ISO_8859_1;
    }

    public final String c(int i7, b bVar) {
        if (i7 <= this.f57819a.e()) {
            d dVar = (d) f57818e.get();
            byte[] bArr = dVar.f57817a;
            if (i7 > bArr.length) {
                int length = bArr.length;
                do {
                    length *= 2;
                } while (i7 > length);
                dVar.f57817a = new byte[length];
            }
            byte[] bArr2 = dVar.f57817a;
            int i10 = 0;
            while (true) {
                nd0 nd0Var = this.d;
                if (i10 < i7) {
                    int read = ((ab.d) nd0Var.f37766b).read(bArr2, i10, i7 - i10);
                    if (read > 0) {
                        i10 += read;
                    } else {
                        throw new EOFException();
                    }
                } else {
                    nd0Var.getClass();
                    return a(bArr2, i7, bVar, true);
                }
            }
        } else {
            throw new Exception(i5.c.i(i7, "Could not read fixed-length string of length: "));
        }
    }

    public final String d(int i7, b bVar) {
        int min = Math.min(i7, (int) this.f57819a.e());
        d dVar = (d) f57818e.get();
        byte[] bArr = dVar.f57817a;
        if (min > bArr.length) {
            int length = bArr.length;
            do {
                length *= 2;
            } while (min > length);
            dVar.f57817a = new byte[length];
        }
        byte[] bArr2 = dVar.f57817a;
        int i10 = 0;
        for (int i11 = 0; i11 < min; i11++) {
            byte v = this.d.v();
            bArr2[i11] = v;
            if (v == 0 && (bVar != b.UTF_16 || i10 != 0 || i11 % 2 == 0)) {
                i10++;
                int i12 = bVar.f57816b;
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
        uf.a aVar = this.f57819a;
        sb2.append(aVar.f912b);
        sb2.append(", ");
        sb2.append(aVar.e());
        sb2.append(" left]");
        return sb2.toString();
    }
}
