package tf;

import java.io.EOFException;
import java.io.InputStream;
import org.telegram.ui.Components.uy;
public final class e {
    public static final b7.j f55433e = new b7.j(4);
    public final uf.a f55434a;
    public final h f55435b;
    public final f f55436c;
    public final uy d;

    public e(InputStream inputStream, long j3, int i7, h hVar, f fVar) {
        uf.a aVar = new uf.a(inputStream, j3, i7);
        this.f55434a = aVar;
        this.d = new uy(aVar, 19);
        this.f55435b = hVar;
        this.f55436c = fVar;
    }

    public static String a(byte[] bArr, int i7, b bVar, boolean z9) {
        if (z9) {
            int i10 = 0;
            for (int i11 = 0; i11 < i7; i11++) {
                if (bArr[i11] == 0 && (bVar != b.UTF_16 || i10 != 0 || i11 % 2 == 0)) {
                    i10++;
                    int i12 = bVar.f55431b;
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
            String str = new String(bArr, 0, i7, bVar.f55430a.name());
            if (str.length() > 0 && str.charAt(0) == 65279) {
                return str.substring(1);
            }
            return str;
        } catch (Exception unused) {
            return "";
        }
    }

    public final b b() {
        byte M = this.d.M();
        if (M != 0) {
            if (M != 1) {
                if (M != 2) {
                    if (M == 3) {
                        return b.UTF_8;
                    }
                    throw new Exception(jg.g.j(M, "Invalid encoding: "));
                }
                return b.UTF_16BE;
            }
            return b.UTF_16;
        }
        return b.ISO_8859_1;
    }

    public final String c(int i7, b bVar) {
        if (i7 <= this.f55434a.e()) {
            d dVar = (d) f55433e.get();
            byte[] bArr = dVar.f55432a;
            if (i7 > bArr.length) {
                int length = bArr.length;
                do {
                    length *= 2;
                } while (i7 > length);
                dVar.f55432a = new byte[length];
            }
            byte[] bArr2 = dVar.f55432a;
            int i10 = 0;
            while (true) {
                uy uyVar = this.d;
                if (i10 < i7) {
                    int read = ((ab.d) uyVar.f38750b).read(bArr2, i10, i7 - i10);
                    if (read > 0) {
                        i10 += read;
                    } else {
                        throw new EOFException();
                    }
                } else {
                    uyVar.getClass();
                    return a(bArr2, i7, bVar, true);
                }
            }
        } else {
            throw new Exception(jg.g.j(i7, "Could not read fixed-length string of length: "));
        }
    }

    public final String d(int i7, b bVar) {
        int min = Math.min(i7, (int) this.f55434a.e());
        d dVar = (d) f55433e.get();
        byte[] bArr = dVar.f55432a;
        if (min > bArr.length) {
            int length = bArr.length;
            do {
                length *= 2;
            } while (min > length);
            dVar.f55432a = new byte[length];
        }
        byte[] bArr2 = dVar.f55432a;
        int i10 = 0;
        for (int i11 = 0; i11 < min; i11++) {
            byte M = this.d.M();
            bArr2[i11] = M;
            if (M == 0 && (bVar != b.UTF_16 || i10 != 0 || i11 % 2 == 0)) {
                i10++;
                int i12 = bVar.f55431b;
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
        uf.a aVar = this.f55434a;
        sb2.append(aVar.f915b);
        sb2.append(", ");
        sb2.append(aVar.e());
        sb2.append(" left]");
        return sb2.toString();
    }
}
