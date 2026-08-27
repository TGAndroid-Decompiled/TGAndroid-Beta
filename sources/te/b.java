package te;

import com.google.firebase.messaging.d;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import je.p;

public final class b extends p {

    public final int f48163g;

    public b(d dVar, p pVar, String str, int i10) {
        super(dVar, pVar, str);
        this.f48163g = i10;
    }

    public static void h(StringBuffer stringBuffer, p pVar) {
        p pVar2 = (p) pVar.f12925c;
        if (pVar2 != null) {
            h(stringBuffer, pVar2);
            stringBuffer.append("/");
        }
        stringBuffer.append((String) pVar.d);
    }

    public long i() {
        return ((ve.a) ((d) this.f12924b)).e();
    }

    public boolean j() {
        b bVar = (b) this.f12927f;
        return (bVar != null ? bVar.i() : 0L) < i();
    }

    public b k(String str) {
        while (i() > 0) {
            b bVarC = c();
            if (((String) bVarC.d).matches(str)) {
                return bVarC;
            }
        }
        throw new IOException("atom type mismatch, not found: ".concat(str));
    }

    public short l() {
        return ((DataInputStream) this.f12926e).readShort();
    }

    public String m() {
        byte[] bArr = new byte[(int) i()];
        ((DataInputStream) this.f12926e).readFully(bArr);
        String str = new String(bArr, "UTF-8");
        int iIndexOf = str.indexOf(0);
        return iIndexOf < 0 ? str : str.substring(0, iIndexOf);
    }

    public void n(int i10) {
        int i11 = 0;
        while (i11 < i10) {
            int iSkipBytes = ((DataInputStream) this.f12926e).skipBytes(i10 - i11);
            if (iSkipBytes <= 0) {
                throw new EOFException();
            }
            i11 += iSkipBytes;
        }
    }

    @Override
    public final String toString() {
        switch (this.f48163g) {
            case 0:
                StringBuffer stringBuffer = new StringBuffer();
                h(stringBuffer, this);
                stringBuffer.append("[off=");
                long j10 = ((d) ((p) this.f12925c).f12924b).f4577b;
                d dVar = (d) this.f12924b;
                stringBuffer.append(j10 - dVar.f4577b);
                stringBuffer.append(",pos=");
                stringBuffer.append(dVar.f4577b);
                stringBuffer.append(",len=");
                ve.a aVar = (ve.a) dVar;
                stringBuffer.append(aVar.e() + aVar.f4577b);
                stringBuffer.append("]");
                return stringBuffer.toString();
            default:
                return a9.p.o(new StringBuilder("mp4[pos="), ((d) this.f12924b).f4577b, "]");
        }
    }
}
