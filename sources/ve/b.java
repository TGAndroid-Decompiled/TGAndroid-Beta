package ve;

import a4.w;
import com.google.firebase.messaging.d;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import le.p;
public final class b extends p {
    public final int f49540g;

    public b(d dVar, p pVar, String str, int i10) {
        super(dVar, pVar, str);
        this.f49540g = i10;
    }

    public static void h(StringBuffer stringBuffer, p pVar) {
        p pVar2 = (p) pVar.f15206c;
        if (pVar2 != null) {
            h(stringBuffer, pVar2);
            stringBuffer.append("/");
        }
        stringBuffer.append((String) pVar.d);
    }

    public long i() {
        return ((xe.a) ((d) this.f15205b)).e();
    }

    public boolean j() {
        long j10;
        b bVar = (b) this.f15208f;
        if (bVar != null) {
            j10 = bVar.i();
        } else {
            j10 = 0;
        }
        if (j10 < i()) {
            return true;
        }
        return false;
    }

    public b k(String str) {
        while (i() > 0) {
            b c3 = c();
            if (((String) c3.d).matches(str)) {
                return c3;
            }
        }
        throw new IOException("atom type mismatch, not found: ".concat(str));
    }

    public short l() {
        return ((DataInputStream) this.f15207e).readShort();
    }

    public String m() {
        byte[] bArr = new byte[(int) i()];
        ((DataInputStream) this.f15207e).readFully(bArr);
        String str = new String(bArr, "UTF-8");
        int indexOf = str.indexOf(0);
        if (indexOf < 0) {
            return str;
        }
        return str.substring(0, indexOf);
    }

    public void n(int i10) {
        int i11 = 0;
        while (i11 < i10) {
            int skipBytes = ((DataInputStream) this.f15207e).skipBytes(i10 - i11);
            if (skipBytes > 0) {
                i11 += skipBytes;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override
    public final String toString() {
        switch (this.f49540g) {
            case 0:
                StringBuffer stringBuffer = new StringBuffer();
                h(stringBuffer, this);
                stringBuffer.append("[off=");
                long j10 = ((d) ((p) this.f15206c).f15205b).f5149b;
                d dVar = (d) this.f15205b;
                stringBuffer.append(j10 - dVar.f5149b);
                stringBuffer.append(",pos=");
                stringBuffer.append(dVar.f5149b);
                stringBuffer.append(",len=");
                xe.a aVar = (xe.a) dVar;
                stringBuffer.append(aVar.e() + aVar.f5149b);
                stringBuffer.append("]");
                return stringBuffer.toString();
            default:
                return w.p(new StringBuilder("mp4[pos="), ((d) this.f15205b).f5149b, "]");
        }
    }
}
