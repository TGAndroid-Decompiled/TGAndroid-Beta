package pf;

import a1.g;
import gf.p;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
public final class b extends p {
    public final int f53449g;

    public b(rf.a aVar, p pVar, String str, int i3) {
        super(aVar, pVar, str);
        this.f53449g = i3;
    }

    public static void h(StringBuffer stringBuffer, p pVar) {
        p pVar2 = (p) pVar.f12267c;
        if (pVar2 != null) {
            h(stringBuffer, pVar2);
            stringBuffer.append("/");
        }
        stringBuffer.append((String) pVar.d);
    }

    public long i() {
        return ((rf.b) ((rf.a) this.f12266b)).e();
    }

    public boolean j() {
        long j10;
        b bVar = (b) this.f12269f;
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
            b c2 = c();
            if (((String) c2.d).matches(str)) {
                return c2;
            }
        }
        throw new IOException("atom type mismatch, not found: ".concat(str));
    }

    public short l() {
        return ((DataInputStream) this.f12268e).readShort();
    }

    public String m() {
        byte[] bArr = new byte[(int) i()];
        ((DataInputStream) this.f12268e).readFully(bArr);
        String str = new String(bArr, "UTF-8");
        int indexOf = str.indexOf(0);
        if (indexOf < 0) {
            return str;
        }
        return str.substring(0, indexOf);
    }

    public void n(int i3) {
        int i10 = 0;
        while (i10 < i3) {
            int skipBytes = ((DataInputStream) this.f12268e).skipBytes(i3 - i10);
            if (skipBytes > 0) {
                i10 += skipBytes;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override
    public final String toString() {
        switch (this.f53449g) {
            case 0:
                StringBuffer stringBuffer = new StringBuffer();
                h(stringBuffer, this);
                stringBuffer.append("[off=");
                long j10 = ((rf.a) ((p) this.f12267c).f12266b).f54501b;
                rf.a aVar = (rf.a) this.f12266b;
                stringBuffer.append(j10 - aVar.f54501b);
                stringBuffer.append(",pos=");
                stringBuffer.append(aVar.f54501b);
                stringBuffer.append(",len=");
                rf.b bVar = (rf.b) aVar;
                stringBuffer.append(bVar.e() + bVar.f54501b);
                stringBuffer.append("]");
                return stringBuffer.toString();
            default:
                return g.r(new StringBuilder("mp4[pos="), ((rf.a) this.f12266b).f54501b, "]");
        }
    }
}
