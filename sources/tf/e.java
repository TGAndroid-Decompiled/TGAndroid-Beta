package tf;

import java.io.EOFException;
import java.io.InputStream;
import org.telegram.ui.Components.hn;
public final class e {
    public static final b7.j f57696e = new b7.j(4);
    public final uf.a f57697a;
    public final h f57698b;
    public final f f57699c;
    public final hn d;

    public e(InputStream inputStream, long j3, int i7, h hVar, f fVar) {
        uf.a aVar = new uf.a(inputStream, j3, i7);
        this.f57697a = aVar;
        this.d = new hn(aVar, 19);
        this.f57698b = hVar;
        this.f57699c = fVar;
    }

    public static String a(byte[] bArr, int i7, b bVar, boolean z10) {
        if (z10) {
            int i10 = 0;
            for (int i11 = 0; i11 < i7; i11++) {
                if (bArr[i11] == 0 && (bVar != b.UTF_16 || i10 != 0 || i11 % 2 == 0)) {
                    i10++;
                    int i12 = bVar.f57694b;
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
            String str = new String(bArr, 0, i7, bVar.f57693a.name());
            if (str.length() > 0 && str.charAt(0) == 65279) {
                return str.substring(1);
            }
            return str;
        } catch (Exception unused) {
            return "";
        }
    }

    public final b b() {
        byte Q = this.d.Q();
        if (Q != 0) {
            if (Q != 1) {
                if (Q != 2) {
                    if (Q == 3) {
                        return b.UTF_8;
                    }
                    throw new Exception(i5.c.i(Q, "Invalid encoding: "));
                }
                return b.UTF_16BE;
            }
            return b.UTF_16;
        }
        return b.ISO_8859_1;
    }

    public final String c(int i7, b bVar) {
        if (i7 <= this.f57697a.e()) {
            d dVar = (d) f57696e.get();
            byte[] bArr = dVar.f57695a;
            if (i7 > bArr.length) {
                int length = bArr.length;
                do {
                    length *= 2;
                } while (i7 > length);
                dVar.f57695a = new byte[length];
            }
            byte[] bArr2 = dVar.f57695a;
            int i10 = 0;
            while (true) {
                hn hnVar = this.d;
                if (i10 < i7) {
                    int read = ((ab.d) hnVar.f35933b).read(bArr2, i10, i7 - i10);
                    if (read > 0) {
                        i10 += read;
                    } else {
                        throw new EOFException();
                    }
                } else {
                    hnVar.getClass();
                    return a(bArr2, i7, bVar, true);
                }
            }
        } else {
            throw new Exception(i5.c.i(i7, "Could not read fixed-length string of length: "));
        }
    }

    public final String d(int i7, b bVar) {
        int min = Math.min(i7, (int) this.f57697a.e());
        d dVar = (d) f57696e.get();
        byte[] bArr = dVar.f57695a;
        if (min > bArr.length) {
            int length = bArr.length;
            do {
                length *= 2;
            } while (min > length);
            dVar.f57695a = new byte[length];
        }
        byte[] bArr2 = dVar.f57695a;
        int i10 = 0;
        for (int i11 = 0; i11 < min; i11++) {
            byte Q = this.d.Q();
            bArr2[i11] = Q;
            if (Q == 0 && (bVar != b.UTF_16 || i10 != 0 || i11 % 2 == 0)) {
                i10++;
                int i12 = bVar.f57694b;
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
        uf.a aVar = this.f57697a;
        sb2.append(aVar.f912b);
        sb2.append(", ");
        sb2.append(aVar.e());
        sb2.append(" left]");
        return sb2.toString();
    }
}
