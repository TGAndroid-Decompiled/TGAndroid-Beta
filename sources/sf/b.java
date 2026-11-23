package sf;

import a8.p0;
import ab.d;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import kf.p;
public final class b extends p {
    public final int f57159g;

    public b(d dVar, p pVar, String str, int i7) {
        super(dVar, pVar, str);
        this.f57159g = i7;
    }

    public static void h(StringBuffer stringBuffer, p pVar) {
        p pVar2 = (p) pVar.f18230c;
        if (pVar2 != null) {
            h(stringBuffer, pVar2);
            stringBuffer.append("/");
        }
        stringBuffer.append((String) pVar.d);
    }

    public long i() {
        return ((uf.a) ((d) this.f18229b)).e();
    }

    public boolean j() {
        long j3;
        b bVar = (b) this.f18232f;
        if (bVar != null) {
            j3 = bVar.i();
        } else {
            j3 = 0;
        }
        if (j3 < i()) {
            return true;
        }
        return false;
    }

    public b k(String str) {
        while (i() > 0) {
            b c10 = c();
            if (((String) c10.d).matches(str)) {
                return c10;
            }
        }
        throw new IOException("atom type mismatch, not found: ".concat(str));
    }

    public short l() {
        return ((DataInputStream) this.f18231e).readShort();
    }

    public String m() {
        byte[] bArr = new byte[(int) i()];
        ((DataInputStream) this.f18231e).readFully(bArr);
        String str = new String(bArr, "UTF-8");
        int indexOf = str.indexOf(0);
        if (indexOf < 0) {
            return str;
        }
        return str.substring(0, indexOf);
    }

    public void n(int i7) {
        int i10 = 0;
        while (i10 < i7) {
            int skipBytes = ((DataInputStream) this.f18231e).skipBytes(i7 - i10);
            if (skipBytes > 0) {
                i10 += skipBytes;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override
    public final String toString() {
        switch (this.f57159g) {
            case 0:
                StringBuffer stringBuffer = new StringBuffer();
                h(stringBuffer, this);
                stringBuffer.append("[off=");
                long j3 = ((d) ((p) this.f18230c).f18229b).f912b;
                d dVar = (d) this.f18229b;
                stringBuffer.append(j3 - dVar.f912b);
                stringBuffer.append(",pos=");
                stringBuffer.append(dVar.f912b);
                stringBuffer.append(",len=");
                uf.a aVar = (uf.a) dVar;
                stringBuffer.append(aVar.e() + aVar.f912b);
                stringBuffer.append("]");
                return stringBuffer.toString();
            default:
                return p0.r(new StringBuilder("mp4[pos="), ((d) this.f18229b).f912b, "]");
        }
    }
}
