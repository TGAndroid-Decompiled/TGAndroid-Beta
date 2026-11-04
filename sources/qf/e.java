package qf;

import java.io.EOFException;
import java.io.InputStream;
import k2.p1;
import org.telegram.ui.Components.nh;
public final class e {
    public static final a7.j f53879e = new a7.j(4);
    public final rf.b f53880a;
    public final h f53881b;
    public final f f53882c;
    public final nh d;

    public e(InputStream inputStream, long j10, int i3, h hVar, f fVar) {
        rf.b bVar = new rf.b(inputStream, j10, i3);
        this.f53880a = bVar;
        this.d = new nh(bVar, 13);
        this.f53881b = hVar;
        this.f53882c = fVar;
    }

    public static String a(byte[] bArr, int i3, b bVar, boolean z10) {
        if (z10) {
            int i10 = 0;
            for (int i11 = 0; i11 < i3; i11++) {
                if (bArr[i11] == 0 && (bVar != b.UTF_16 || i10 != 0 || i11 % 2 == 0)) {
                    i10++;
                    int i12 = bVar.f53877b;
                    if (i10 == i12) {
                        i3 = (i11 + 1) - i12;
                        break;
                    }
                } else {
                    i10 = 0;
                }
            }
        }
        try {
            String str = new String(bArr, 0, i3, bVar.f53876a.name());
            if (str.length() > 0 && str.charAt(0) == 65279) {
                return str.substring(1);
            }
            return str;
        } catch (Exception unused) {
            return "";
        }
    }

    public final b b() {
        byte F = this.d.F();
        if (F != 0) {
            if (F != 1) {
                if (F != 2) {
                    if (F == 3) {
                        return b.UTF_8;
                    }
                    throw new Exception(p1.i(F, "Invalid encoding: "));
                }
                return b.UTF_16BE;
            }
            return b.UTF_16;
        }
        return b.ISO_8859_1;
    }

    public final String c(int i3, b bVar) {
        if (i3 <= this.f53880a.e()) {
            d dVar = (d) f53879e.get();
            byte[] bArr = dVar.f53878a;
            if (i3 > bArr.length) {
                int length = bArr.length;
                do {
                    length *= 2;
                } while (i3 > length);
                dVar.f53878a = new byte[length];
            }
            byte[] bArr2 = dVar.f53878a;
            int i10 = 0;
            while (true) {
                nh nhVar = this.d;
                if (i10 < i3) {
                    int read = ((rf.a) nhVar.f36540b).read(bArr2, i10, i3 - i10);
                    if (read > 0) {
                        i10 += read;
                    } else {
                        throw new EOFException();
                    }
                } else {
                    nhVar.getClass();
                    return a(bArr2, i3, bVar, true);
                }
            }
        } else {
            throw new Exception(p1.i(i3, "Could not read fixed-length string of length: "));
        }
    }

    public final String d(int i3, b bVar) {
        int min = Math.min(i3, (int) this.f53880a.e());
        d dVar = (d) f53879e.get();
        byte[] bArr = dVar.f53878a;
        if (min > bArr.length) {
            int length = bArr.length;
            do {
                length *= 2;
            } while (min > length);
            dVar.f53878a = new byte[length];
        }
        byte[] bArr2 = dVar.f53878a;
        int i10 = 0;
        for (int i11 = 0; i11 < min; i11++) {
            byte F = this.d.F();
            bArr2[i11] = F;
            if (F == 0 && (bVar != b.UTF_16 || i10 != 0 || i11 % 2 == 0)) {
                i10++;
                int i12 = bVar.f53877b;
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
        rf.b bVar = this.f53880a;
        sb2.append(bVar.f54501b);
        sb2.append(", ");
        sb2.append(bVar.e());
        sb2.append(" left]");
        return sb2.toString();
    }
}
