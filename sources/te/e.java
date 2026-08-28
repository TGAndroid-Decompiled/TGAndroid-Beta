package te;

import j3.r0;
import java.io.EOFException;
import java.io.InputStream;
import n2.p;
public final class e {
    public static final ad.b f47813e = new ad.b(3);
    public final ue.a f47814a;
    public final h f47815b;
    public final f f47816c;
    public final p d;

    public e(InputStream inputStream, long j10, int i9, h hVar, f fVar) {
        ue.a aVar = new ue.a(inputStream, j10, i9);
        this.f47814a = aVar;
        this.d = new p(aVar, 22);
        this.f47815b = hVar;
        this.f47816c = fVar;
    }

    public static String a(byte[] bArr, int i9, b bVar, boolean z10) {
        if (z10) {
            int i10 = 0;
            for (int i11 = 0; i11 < i9; i11++) {
                if (bArr[i11] == 0 && (bVar != b.UTF_16 || i10 != 0 || i11 % 2 == 0)) {
                    i10++;
                    int i12 = bVar.f47811b;
                    if (i10 == i12) {
                        i9 = (i11 + 1) - i12;
                        break;
                    }
                } else {
                    i10 = 0;
                }
            }
        }
        try {
            String str = new String(bArr, 0, i9, bVar.f47810a.name());
            if (str.length() > 0 && str.charAt(0) == 65279) {
                return str.substring(1);
            }
            return str;
        } catch (Exception unused) {
            return "";
        }
    }

    public final b b() {
        byte L = this.d.L();
        if (L != 0) {
            if (L != 1) {
                if (L != 2) {
                    if (L == 3) {
                        return b.UTF_8;
                    }
                    throw new Exception(r0.l(L, "Invalid encoding: "));
                }
                return b.UTF_16BE;
            }
            return b.UTF_16;
        }
        return b.ISO_8859_1;
    }

    public final String c(int i9, b bVar) {
        if (i9 <= this.f47814a.e()) {
            d dVar = (d) f47813e.get();
            byte[] bArr = dVar.f47812a;
            if (i9 > bArr.length) {
                int length = bArr.length;
                do {
                    length *= 2;
                } while (i9 > length);
                dVar.f47812a = new byte[length];
            }
            byte[] bArr2 = dVar.f47812a;
            int i10 = 0;
            while (true) {
                p pVar = this.d;
                if (i10 < i9) {
                    int read = ((com.google.firebase.messaging.d) pVar.f18343b).read(bArr2, i10, i9 - i10);
                    if (read > 0) {
                        i10 += read;
                    } else {
                        throw new EOFException();
                    }
                } else {
                    pVar.getClass();
                    return a(bArr2, i9, bVar, true);
                }
            }
        } else {
            throw new Exception(r0.l(i9, "Could not read fixed-length string of length: "));
        }
    }

    public final String d(int i9, b bVar) {
        int min = Math.min(i9, (int) this.f47814a.e());
        d dVar = (d) f47813e.get();
        byte[] bArr = dVar.f47812a;
        if (min > bArr.length) {
            int length = bArr.length;
            do {
                length *= 2;
            } while (min > length);
            dVar.f47812a = new byte[length];
        }
        byte[] bArr2 = dVar.f47812a;
        int i10 = 0;
        for (int i11 = 0; i11 < min; i11++) {
            byte L = this.d.L();
            bArr2[i11] = L;
            if (L == 0 && (bVar != b.UTF_16 || i10 != 0 || i11 % 2 == 0)) {
                i10++;
                int i12 = bVar.f47811b;
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
        ue.a aVar = this.f47814a;
        sb2.append(aVar.f4135b);
        sb2.append(", ");
        sb2.append(aVar.e());
        sb2.append(" left]");
        return sb2.toString();
    }
}
