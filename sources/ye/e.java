package ye;

import com.google.android.gms.common.api.internal.o1;
import java.io.EOFException;
import java.io.InputStream;
import org.telegram.ui.Components.ai;
public final class e {
    public static final o1 f50862e = new o1(3);
    public final ze.a f50863a;
    public final h f50864b;
    public final f f50865c;
    public final ai d;

    public e(InputStream inputStream, long j10, int i10, h hVar, f fVar) {
        ze.a aVar = new ze.a(inputStream, j10, i10);
        this.f50863a = aVar;
        this.d = new ai(aVar, 24);
        this.f50864b = hVar;
        this.f50865c = fVar;
    }

    public static String a(byte[] bArr, int i10, b bVar, boolean z4) {
        if (z4) {
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                if (bArr[i12] == 0 && (bVar != b.UTF_16 || i11 != 0 || i12 % 2 == 0)) {
                    i11++;
                    int i13 = bVar.f50860b;
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
            String str = new String(bArr, 0, i10, bVar.f50859a.name());
            if (str.length() > 0 && str.charAt(0) == 65279) {
                return str.substring(1);
            }
            return str;
        } catch (Exception unused) {
            return "";
        }
    }

    public final b b() {
        byte S = this.d.S();
        if (S != 0) {
            if (S != 1) {
                if (S != 2) {
                    if (S == 3) {
                        return b.UTF_8;
                    }
                    throw new Exception(l.d.j(S, "Invalid encoding: "));
                }
                return b.UTF_16BE;
            }
            return b.UTF_16;
        }
        return b.ISO_8859_1;
    }

    public final String c(int i10, b bVar) {
        if (i10 <= this.f50863a.e()) {
            d dVar = (d) f50862e.get();
            byte[] bArr = dVar.f50861a;
            if (i10 > bArr.length) {
                int length = bArr.length;
                do {
                    length *= 2;
                } while (i10 > length);
                dVar.f50861a = new byte[length];
            }
            byte[] bArr2 = dVar.f50861a;
            int i11 = 0;
            while (true) {
                ai aiVar = this.d;
                if (i11 < i10) {
                    int read = ((com.google.firebase.messaging.d) aiVar.f25265b).read(bArr2, i11, i10 - i11);
                    if (read > 0) {
                        i11 += read;
                    } else {
                        throw new EOFException();
                    }
                } else {
                    aiVar.getClass();
                    return a(bArr2, i10, bVar, true);
                }
            }
        } else {
            throw new Exception(l.d.j(i10, "Could not read fixed-length string of length: "));
        }
    }

    public final String d(int i10, b bVar) {
        int min = Math.min(i10, (int) this.f50863a.e());
        d dVar = (d) f50862e.get();
        byte[] bArr = dVar.f50861a;
        if (min > bArr.length) {
            int length = bArr.length;
            do {
                length *= 2;
            } while (min > length);
            dVar.f50861a = new byte[length];
        }
        byte[] bArr2 = dVar.f50861a;
        int i11 = 0;
        for (int i12 = 0; i12 < min; i12++) {
            byte S = this.d.S();
            bArr2[i12] = S;
            if (S == 0 && (bVar != b.UTF_16 || i11 != 0 || i12 % 2 == 0)) {
                i11++;
                int i13 = bVar.f50860b;
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
        ze.a aVar = this.f50863a;
        sb.append(aVar.f4045b);
        sb.append(", ");
        sb.append(aVar.e());
        sb.append(" left]");
        return sb.toString();
    }
}
