package xe;

import com.google.android.gms.common.api.internal.o1;
import java.io.EOFException;
import java.io.InputStream;
import kf.k0;
public final class f {
    public static final o1 e = new o1(3);
    public final ye.a f46993a;
    public final i f46994b;
    public final g f46995c;
    public final b d;

    public f(InputStream inputStream, long j10, int i10, i iVar, g gVar) {
        ye.a aVar = new ye.a(inputStream, j10, i10);
        this.f46993a = aVar;
        this.d = new b(aVar);
        this.f46994b = iVar;
        this.f46995c = gVar;
    }

    public static String a(byte[] bArr, int i10, c cVar, boolean z4) {
        if (z4) {
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                if (bArr[i12] == 0 && (cVar != c.UTF_16 || i11 != 0 || i12 % 2 == 0)) {
                    i11++;
                    int i13 = cVar.f46991b;
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
            String str = new String(bArr, 0, i10, cVar.f46990a.name());
            if (str.length() > 0 && str.charAt(0) == 65279) {
                return str.substring(1);
            }
            return str;
        } catch (Exception unused) {
            return "";
        }
    }

    public final c b() {
        byte a2 = this.d.a();
        if (a2 != 0) {
            if (a2 != 1) {
                if (a2 != 2) {
                    if (a2 == 3) {
                        return c.UTF_8;
                    }
                    throw new Exception(k0.j(a2, "Invalid encoding: "));
                }
                return c.UTF_16BE;
            }
            return c.UTF_16;
        }
        return c.ISO_8859_1;
    }

    public final String c(int i10, c cVar) {
        if (i10 <= this.f46993a.e()) {
            e eVar = (e) e.get();
            byte[] bArr = eVar.f46992a;
            if (i10 > bArr.length) {
                int length = bArr.length;
                do {
                    length *= 2;
                } while (i10 > length);
                eVar.f46992a = new byte[length];
            }
            byte[] bArr2 = eVar.f46992a;
            int i11 = 0;
            while (true) {
                b bVar = this.d;
                if (i11 < i10) {
                    int read = ((com.google.firebase.messaging.d) bVar.f46987a).read(bArr2, i11, i10 - i11);
                    if (read > 0) {
                        i11 += read;
                    } else {
                        throw new EOFException();
                    }
                } else {
                    bVar.getClass();
                    return a(bArr2, i10, cVar, true);
                }
            }
        } else {
            throw new Exception(k0.j(i10, "Could not read fixed-length string of length: "));
        }
    }

    public final String d(int i10, c cVar) {
        int min = Math.min(i10, (int) this.f46993a.e());
        e eVar = (e) e.get();
        byte[] bArr = eVar.f46992a;
        if (min > bArr.length) {
            int length = bArr.length;
            do {
                length *= 2;
            } while (min > length);
            eVar.f46992a = new byte[length];
        }
        byte[] bArr2 = eVar.f46992a;
        int i11 = 0;
        for (int i12 = 0; i12 < min; i12++) {
            byte a2 = this.d.a();
            bArr2[i12] = a2;
            if (a2 == 0 && (cVar != c.UTF_16 || i11 != 0 || i12 % 2 == 0)) {
                i11++;
                int i13 = cVar.f46991b;
                if (i11 == i13) {
                    return a(bArr2, (i12 + 1) - i13, cVar, false);
                }
            } else {
                i11 = 0;
            }
        }
        throw new Exception("Could not read zero-termiated string");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("id3v2frame[pos=");
        ye.a aVar = this.f46993a;
        sb.append(aVar.f3975b);
        sb.append(", ");
        sb.append(aVar.e());
        sb.append(" left]");
        return sb.toString();
    }
}
