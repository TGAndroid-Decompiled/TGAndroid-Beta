package ye;

import com.google.android.gms.common.api.internal.o1;
import java.io.EOFException;
import java.io.InputStream;
import kh.a2;
import ph.j5;
public final class e {
    public static final o1 e = new o1(3);
    public final ze.a f47166a;
    public final h f47167b;
    public final f f47168c;
    public final j5 d;

    public e(InputStream inputStream, long j10, int i10, h hVar, f fVar) {
        ze.a aVar = new ze.a(inputStream, j10, i10);
        this.f47166a = aVar;
        this.d = new j5(aVar, 19);
        this.f47167b = hVar;
        this.f47168c = fVar;
    }

    public static String a(byte[] bArr, int i10, b bVar, boolean z4) {
        if (z4) {
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                if (bArr[i12] == 0 && (bVar != b.UTF_16 || i11 != 0 || i12 % 2 == 0)) {
                    i11++;
                    int i13 = bVar.f47164b;
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
            String str = new String(bArr, 0, i10, bVar.f47163a.name());
            if (str.length() > 0 && str.charAt(0) == 65279) {
                return str.substring(1);
            }
            return str;
        } catch (Exception unused) {
            return "";
        }
    }

    public final b b() {
        byte h02 = this.d.h0();
        if (h02 != 0) {
            if (h02 != 1) {
                if (h02 != 2) {
                    if (h02 == 3) {
                        return b.UTF_8;
                    }
                    throw new Exception(a2.j(h02, "Invalid encoding: "));
                }
                return b.UTF_16BE;
            }
            return b.UTF_16;
        }
        return b.ISO_8859_1;
    }

    public final String c(int i10, b bVar) {
        if (i10 <= this.f47166a.e()) {
            d dVar = (d) e.get();
            byte[] bArr = dVar.f47165a;
            if (i10 > bArr.length) {
                int length = bArr.length;
                do {
                    length *= 2;
                } while (i10 > length);
                dVar.f47165a = new byte[length];
            }
            byte[] bArr2 = dVar.f47165a;
            int i11 = 0;
            while (true) {
                j5 j5Var = this.d;
                if (i11 < i10) {
                    int read = ((com.google.firebase.messaging.d) j5Var.f41782b).read(bArr2, i11, i10 - i11);
                    if (read > 0) {
                        i11 += read;
                    } else {
                        throw new EOFException();
                    }
                } else {
                    j5Var.getClass();
                    return a(bArr2, i10, bVar, true);
                }
            }
        } else {
            throw new Exception(a2.j(i10, "Could not read fixed-length string of length: "));
        }
    }

    public final String d(int i10, b bVar) {
        int min = Math.min(i10, (int) this.f47166a.e());
        d dVar = (d) e.get();
        byte[] bArr = dVar.f47165a;
        if (min > bArr.length) {
            int length = bArr.length;
            do {
                length *= 2;
            } while (min > length);
            dVar.f47165a = new byte[length];
        }
        byte[] bArr2 = dVar.f47165a;
        int i11 = 0;
        for (int i12 = 0; i12 < min; i12++) {
            byte h02 = this.d.h0();
            bArr2[i12] = h02;
            if (h02 == 0 && (bVar != b.UTF_16 || i11 != 0 || i12 % 2 == 0)) {
                i11++;
                int i13 = bVar.f47164b;
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
        StringBuilder sb = new StringBuilder("id3v2frame[pos=");
        ze.a aVar = this.f47166a;
        sb.append(aVar.f3995b);
        sb.append(", ");
        sb.append(aVar.e());
        sb.append(" left]");
        return sb.toString();
    }
}
